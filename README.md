# 🔍 Busca Binária: Eficiência na Busca de Dados

A busca binária é um dos algoritmos mais eficientes para encontrar um elemento em uma lista ordenada. Diferente da busca linear, que percorre cada item sequencialmente, a busca binária **"divide e conquista"**: ela divide repetidamente a lista ao meio, descartando a parte que não contém o valor buscado. Isso resulta em uma complexidade temporal de **O(log n)**, tornando-a extremamente rápida para listas grandes.

---

## 📌 Como Funciona?

### 🔹 **Pré-requisito:**  
A lista deve estar **ordenada** (crescente ou decrescente).

### 🔹 **Passo Inicial:**  
Compara o valor buscado com o elemento do meio da lista.

### 🔹 **Decisão:**
- ✅ **Se for igual**, a busca termina.
- 🔼 **Se for maior**, a busca continua na metade **superior**.
- 🔽 **Se for menor**, a busca continua na metade **inferior**.

### 🔹 **Repetição:**  
O processo se repete até encontrar o valor ou até que a lista restante esteja vazia.

---

## 🚀 Por Que Usar Busca Binária?

✔ **Eficiência:** Reduz o espaço de busca pela metade a cada iteração, ideal para grandes volumes de dados.  
✔ **Precisão:** Funciona perfeitamente em listas ordenadas, garantindo resultados rápidos e confiáveis.  
✔ **Simplicidade:** Embora pareça complexa, sua lógica é intuitiva e fácil de implementar.  

---

## ⚠️ Limitações

🔄 **Lista Ordenada:** Requer que os dados estejam previamente ordenados.  
🎲 **Acesso Aleatório:** É mais eficiente em estruturas como arrays, onde o acesso a qualquer índice é instantâneo.

--- 

# 📌 Ordenação por Seleção (Selection Sort)

A **ordenação por seleção** é um algoritmo simples e intuitivo que ordena uma lista encontrando repetidamente o menor (ou maior) elemento e movendo-o para a posição correta.

---

## 🛠 Como Funciona?
1. **Encontra o menor elemento** da lista.
2. **Move esse elemento** para o início da lista ordenada.
3. **Repete o processo** para o restante da lista até que todos os elementos estejam ordenados.

---

## ⏳ Complexidade
- **Melhor caso:** O(n²)
- **Pior caso:** O(n²)
- **Média:** O(n²)
- **Espaço:** O(1) (Ordenação in-place)

📌 Como precisa comparar e trocar elementos repetidamente, **não é eficiente para listas grandes**.

---

## ✅ Vantagens
✔️ Fácil de entender e implementar.  
✔️ Não requer memória extra significativa.  
✔️ Útil para listas pequenas ou quase ordenadas.

## ❌ Desvantagens
❌ Ineficiente para grandes volumes de dados.  
❌ Tem desempenho pior que outros algoritmos como QuickSort e MergeSort.

---

## 🏗️ Caso de Uso
Apesar de não ser o mais eficiente, o Selection Sort pode ser útil em **sistemas embarcados** e **cenários de hardware limitado**, onde a simplicidade e o baixo consumo de memória são mais importantes que a velocidade.

---

# 🔄 Recursão em Algoritmos  

## O que é Recursão?  
A **recursão** é uma técnica fundamental em algoritmos, onde uma função chama a si mesma para resolver um problema menor do mesmo tipo. Esse conceito segue o princípio **"dividir para conquistar"**, quebrando problemas complexos em partes menores até atingir um caso base simples de resolver.

## Estrutura de uma Função Recursiva  
Uma função recursiva geralmente tem duas partes principais:  

1. **Caso Base**: Define quando a recursão deve parar.  
2. **Passo Recursivo**: A função chama a si mesma, reduzindo o problema até atingir o caso base.  

### 📌 Exemplo Clássico: Fatorial de um Número  

O fatorial de um número \( n! \) é definido como:  
\[
n! = n \times (n - 1) \times (n - 2) \times ... \times 1
\]
Ou, de forma recursiva:  
\[
n! = n \times (n - 1)!
\]

# 🔥 QuickSort: Ordenação Rápida e Eficiente  

O **QuickSort** é um dos algoritmos de ordenação mais eficientes, utilizando a estratégia de **Dividir para Conquistar**. Ele funciona escolhendo um **pivô**, reorganizando a lista para que elementos menores fiquem à esquerda e maiores à direita, e aplicando esse processo recursivamente.  

## 📌 Como funciona?  
1. **Escolha do pivô**: Um elemento da lista é escolhido como referência (pode ser o primeiro, o último, um aleatório ou a mediana).  
2. **Particionamento**: Os elementos menores que o pivô vão para a esquerda, e os maiores para a direita.  
3. **Recursão**: O mesmo processo é aplicado às duas sublistas até que a lista esteja ordenada.  

## 🚀 Complexidade  
- **Melhor caso**: O( *n* log *n* ) → Quando o pivô divide a lista de forma equilibrada.  
- **Pior caso**: O( *n²* ) → Se o pivô for mal escolhido e gerar partições desbalanceadas.  
- **Caso médio**: O( *n* log *n* ) → Funciona bem na maioria dos cenários.  

## 🎯 Vantagens e Desvantagens  
✅ Rápido na prática para grandes conjuntos de dados.  
✅ Funciona bem com estruturas que permitem acesso aleatório.  
❌ Pior caso pode ser ineficiente sem otimizações.  
❌ Não é **estável**, ou seja, não mantém a ordem relativa de elementos iguais.  

# 🔍 Tabelas Hash

Uma **tabela hash** é uma estrutura de dados que associa chaves a valores, permitindo buscas extremamente rápidas. Ela é baseada em uma **função hash**, que converte a chave em um índice dentro de um array, onde o valor correspondente será armazenado.

## 🛠️ Como funciona?
1. **Hashing**: A chave é convertida em um índice usando uma função hash.
2. **Inserção**: O valor é armazenado no índice gerado.
3. **Busca**: Para encontrar um valor, basta calcular o índice novamente.
4. **Tratamento de colisões**: Se duas chaves geram o mesmo índice, técnicas como **encadeamento** ou **endereçamento aberto** são usadas para armazenar os valores corretamente.

## ⏳ Complexidade de Tempo
| Operação      | Melhor Caso | Caso Médio | Pior Caso (com colisões) |
|--------------|------------|------------|---------------------------|
| Busca        | O(1)       | O(1)       | O(n)                      |
| Inserção     | O(1)       | O(1)       | O(n)                      |
| Remoção      | O(1)       | O(1)       | O(n)                      |

## 🚀 Vantagens
✅ Acesso rápido aos dados (tempo constante O(1) na maioria dos casos).  
✅ Ideal para implementar dicionários e caches.  

## ⚠️ Desvantagens
❌ Pode haver colisões, exigindo tratamento.  
❌ O desempenho depende da qualidade da função hash.  

