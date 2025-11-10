package tp4j;
public class compte {
		public Double Solde;
		public compte(Double Solde) {
			this.Solde = Solde;
		}
		public void deposer(Double montant) {
			if (montant > 0) {
	            this.Solde += montant;
	            System.out.println("virement de " + montant + "effectué.");
	        }
			
		}
		public void retirer(Double montant) {
			if (montant > 0 && this.Solde >= montant) {
	            this.Solde -= montant;
	            System.out.println("Retrait de " + montant + "effectué.");
	        } else if (montant > this.Solde) {
	            System.out.println("Erreur: Solde insuffisant pour un retrait de " + montant);
	        } else {
	            System.out.println("Le montant du retrait doit être positif.");
	        }
		}
			public void virer(Double montant,compte destinataire) {
				if (montant > 0 && this.Solde >= montant) {
		            this.retirer(montant);
		            destinataire.deposer(montant);
		            System.out.println("Virement de " + montant + "vers un autre compte réussi.");
		        } else if (montant > this.Solde) {
		            System.out.println("Erreur de virement: Solde insuffisant.");
		        } else {
		            System.out.println("Erreur de virement: Le montant doit être positif.");
		        }
			}
		
		public void afficher() {
			System.out.println("Solde du compte: " + this.Solde);
		}

}
