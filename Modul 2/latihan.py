# Membuat objek Hewan
Hewan = ["kucing", "anjing", "kuda", "sapi", "gajah", "harimau", "kucing", "jerapah", "kuda"]
print("Sebelum dihapus:")
print(Hewan)

# Membuat objek DeleteHewan
DeleteHewan = ["kucing", "gajah"]
print("Data yang akan dihapus:")
print(DeleteHewan)

# Menghapus data yang sama pada objek Hewan dengan objek DeleteHewan
for hewan in DeleteHewan:
    while hewan in Hewan:
        Hewan.remove(hewan)

# Menampilkan hasil penghapusan
print("Setelah dihapus:")
print(Hewan)
