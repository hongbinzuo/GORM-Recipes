import gorm.recipes.*
new BootStrap().init()

// get an artist
def artistCriteria = Artist.get(1)

// GORM via entity association (hasMany)
println artistCriteria.works

// GORM Where
def query = Work.where {
    artist == artistCriteria
}

def results = query.list()
println results