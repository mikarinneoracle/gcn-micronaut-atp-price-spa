var data = { free: { price : {}, options : {} }, pro: { price : {}, options : {} }, enterprise: { price : {}, options : {} } };

var pricing = new Vue({
  el: '#pricing',
  data: { data },
  mounted () {
    data.free = { price : {}, options : {} }
    data.pro = { price : {}, options : {} }
    data.enterprise = { price : {}, options : {} }
    getTierPrice('free');
    getTierPrice('pro');
    getTierPrice('enterprise');
    getTierOptions('free');
    getTierOptions('pro');
    getTierOptions('enterprise');
  },
  methods:{
  }
})

function getTierPrice(tier, callback) {
    //console.log(tier);
    axios
      .get('/price/' + tier)
      .then(resp => 
            {        
                switch(tier)
                {
                    case 'free':
                        data.free.price = resp.data;
                        break;
                    case 'pro':
                        data.pro.price = resp.data;
                        break;
                    case 'enterprise':
                        data.enterprise.price = resp.data;
                        break;
                    default:
                        console.log('undefined tier ' + tier);
                }
                return callback;
            }
        )
     .catch(error => {
            console.log(error)
        })
     .finally(() => { 
            //console.log(data);
        })
}

function getTierOptions(tier, callback) {
    //console.log(tier);
    axios
      .get('/options/' + tier)
      .then(resp => 
            {        
                switch(tier)
                {
                    case 'free':
                        data.free.options = resp.data;
                        break;
                    case 'pro':
                        data.pro.options = resp.data;
                        break;
                    case 'enterprise':
                        data.enterprise.options = resp.data;
                        break;
                    default:
                        console.log('undefined tier ' + tier);
                }
                return callback;
            }
        )
     .catch(error => {
            console.log(error)
        })
     .finally(() => { 
            //console.log(data);
        })
}

