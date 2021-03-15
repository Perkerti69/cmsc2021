class CryptoManager_GFA_Test {
	
	public static void main(String[] args) {

		String str1 = "\"THIS TEST SHOULD SUCCEED\"";



		boolean good = CryptoManager.stringInBounds(str1);
		System.out.println(str1+" Is it in bounds? "+good);
	}


}
