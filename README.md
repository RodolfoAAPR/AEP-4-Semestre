# 💊 Aplicativo para Controle de Medicamentos

> Este repositório contém o código-fonte e a documentação do projeto acadêmico (AEP - Atividade de Estudo Programado) focado no "Uso de Aplicativo para Controle e Lembrete de Medicamentos como Apoio à Saúde da População".

**Autores:**
* Lucas Monteiro Prado da Silva Schiavo RA: 24143251-2
* Rodolfo Alves RA: 24121419-2

---

## 🎯 Sobre o Projeto

### O Problema
O uso incorreto ou irregular de medicamentos é um problema recorrente na sociedade e traz consequências graves, como agravamento de doenças, reinternações hospitalares e aumento de custos para os sistemas de saúde. Muitos pacientes, principalmente idosos e pessoas com doenças crônicas, enfrentam dificuldades em seguir corretamente os horários e dosagens prescritas. Essa realidade impacta diretamente na qualidade de vida e na eficácia dos tratamentos.

### Objetivo
Este projeto tem como objetivo propor o desenvolvimento de uma ferramenta tecnológica que auxilie pacientes na adesão medicamentosa. A ideia central é criar um aplicativo que registre os horários e tipos de medicamentos, enviando lembretes automáticos por meio de notificações internas, garantindo que o paciente siga corretamente seu tratamento.

---

## ⚙️ Funcionalidades Planejadas

Com base na metodologia do projeto, as funcionalidades centrais da aplicação incluem:

* **Cadastro de Medicamentos:** Permitir que o usuário registre os medicamentos que utiliza.
* **Agendamento de Horários:** Definir horários, dosagens e frequência dos lembretes.
* **Notificações de Lembrete:** Enviar alertas ativos para o usuário no horário agendado.
* **Confirmação de Uso:** Permitir ao usuário registrar quais doses foram tomadas ou puladas (log de uso).

---

## 🗄️ Estrutura do Banco de Dados

Os arquivos SQL contendo a estrutura do banco de dados estão disponíveis neste repositório:

* **DDL (Data Definition Language):** Script para a **criação** das tabelas (`User`, `Medication`, `Schedule`, `UserLog`).
* **DML (Data Manipulation Language):** Script com exemplos de `INSERT` para **popular** o banco de dados.

O código-fonte da aplicação (backend Spring Boot e frontend React) também está incluído nos respectivos diretórios.

---

## 📈 Impacto Esperado

Espera-se que a proposta contribua diretamente para o aumento da adesão aos tratamentos médicos, reduzindo casos de esquecimento e uso incorreto de medicamentos. Além disso, pretende-se oferecer uma solução acessível a diferentes camadas sociais, favorecendo a inclusão digital e a promoção da saúde preventiva.

O impacto esperado é a redução de complicações clínicas e custos ao sistema de saúde, além do fortalecimento da autonomia do paciente e do suporte aos familiares e cuidadores.

## 📚 Referência Base

* Goulart, T. M. (2025). Meus remédios: um aplicativo para promover a adesão ao tratamento medicamentoso.
