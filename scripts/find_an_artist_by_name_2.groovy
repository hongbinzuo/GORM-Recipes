import gorm.recipes.*
new BootStrap().init()

def criteria = 'Lucy Sparks'

// GORM Where plus execute in one action
def artist = Artist.find {
    name == criteria
}

println artist