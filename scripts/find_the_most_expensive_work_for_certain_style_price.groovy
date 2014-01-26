import gorm.recipes.*
new BootStrap().init()


def styleCriteria = 'Modern'

def query = Work.where {
    artist.style == styleCriteria
}.projections {
    max 'price'
}

def result = query.find()
println result