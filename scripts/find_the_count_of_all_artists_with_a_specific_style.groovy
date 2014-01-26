import gorm.recipes.*
new BootStrap().init()

def styleCriteria = 'Modern'

// GORM Dynamic Finder
def artistCount = Artist.countByStyle('Modern')
println artistCount

// GORM Where
def query = Artist.where {
    style == styleCriteria
}

artistCount = query.count()
println artistCount