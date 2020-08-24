package main 
  
import (
 "fmt"
)

func main() { 
    var riesi string
    fmt.Println("Riesi: False")
    fmt.Println("Riesi? ")
    fmt.Scanln(&riesi)

    if riesi == "y" {
      fmt.Print("Riesi: True")
    } else {
      fmt.Println("Riesi: False")
    }
}
