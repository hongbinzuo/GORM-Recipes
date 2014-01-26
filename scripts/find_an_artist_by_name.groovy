import gorm.recipes.*
new BootStrap().init()

def criteria = 'Lucy Sparks'

// GORM Dynamic Finder
def artist = Artist.findByName(criteria)
println artist

// GORM Where
def query = Artist.where {
    name == criteria
}

artist = query.find()

println artist