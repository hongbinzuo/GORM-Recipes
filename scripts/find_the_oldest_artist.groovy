import gorm.recipes.*
new BootStrap().init()

// GORM Where
def query = Artist.where {
    birthDate <= min(birthDate)
}

def results = query.find()
println results