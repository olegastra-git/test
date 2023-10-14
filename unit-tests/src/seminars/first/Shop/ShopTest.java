package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void testSortProductsByPriceAscending() {
        Shop shop = new Shop();

        // Создаем список продуктов и добавляем в него несколько продуктов с разными
        // стоимостями
        List<Product> products = new ArrayList<>();
        products.add(new Product(500, "Product 1"));
        products.add(new Product(200, "Product 2"));
        products.add(new Product(1000, "Product 3"));

        // Устанавливаем созданный список продуктов в экземпляр класса Shop
        shop.setProducts(products);

        // Вызываем метод sortProductsByPrice() и сохраняем результат
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверяем, что результат не равен null
        assertNotNull(sortedProducts);

        // Проверяем, что количество элементов в результате равно количеству продуктов
        // из списка
        assertEquals(products.size(), sortedProducts.size());

        // Проверяем, что элементы в результате отсортированы по возрастанию стоимости
        for (int i = 0; i < sortedProducts.size() - 1; i++) {
            assertTrue(sortedProducts.get(i).getCost() <= sortedProducts.get(i + 1).getCost());
        }
    }}

    Проверка сортировки
    по убыванию:

public void testSortProductsByPriceDescending() {
    Shop shop = new Shop();
    
    // Создаем список продуктов и добавляем в него несколько продуктов с разными стоимостями
    List<Product> products = new ArrayList<>();
    products.add(new Product(500, "Product 1"));
    products.add(new Product(200, "Product 2"));
    products.add(new Product(1000, "Product 3"));
    
    // Устанавливаем созданный список продуктов в экземпляр класса Shop
    shop.setProducts(products);
    
    // Вызываем метод sortProductsByPrice() и сохраняем результат
    List<Product> sortedProducts = shop.sortProductsByPrice();
    
    // Проверяем, что результат не равен null
    assertNotNull(sortedProducts);
    
    // Проверяем, что количество элементов в результате равно количеству продуктов из списка
    assertEquals(products.size(), sortedProducts.size());
    
    // Проверяем, что элементы в результате отсортированы по убыванию стоимости
    for (int i = 0; i < sortedProducts.size() - 1; i++) {
        assertTrue(sortedProducts.get(i).getCost() >= sortedProducts.get(i+1).getCost());
    }
}
