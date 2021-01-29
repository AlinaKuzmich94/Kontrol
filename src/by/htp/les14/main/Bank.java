package by.htp.les14.main;

public class Bank extends Account {
		private String typeAccount = "Bank";

		public String getTypeAccount() {
			return typeAccount;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((typeAccount == null) ? 0 : typeAccount.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bank other = (Bank) obj;
			if (typeAccount == null) {
				if (other.typeAccount != null)
					return false;
			} else if (!typeAccount.equals(other.typeAccount))
				return false;
			return true;
		}

}
