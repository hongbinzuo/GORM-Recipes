import gorm.recipes.*
new BootStrap().init()

def homeCriteria = 'El Paso, TX'
def styleCriteria = 'Classic'

// GORM Dynamic Finder
def artist = Artist.findByHomeAndStyle(homeCriteria,styleCriteria)
println artist

// GORM Where
def query = Artist.where {
    home == homeCriteria && style == styleCriteria
}

artist = query.find()
println artist