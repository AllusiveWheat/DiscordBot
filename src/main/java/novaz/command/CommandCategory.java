package novaz.command;

public enum CommandCategory {
	INFORMATIVE("informative", ":information_source:", "Information"),
	ADMINISTRATIVE("administrative", ":oncoming_police_car:", "Administration"),
	MUSIC("music", ":musical_note:", "Music"),
	FUN("fun", ":game_die:", "Fun"),
	UNKNOWN("nopackage", ":question:", "Misc");
	private final String packageName;
	private final String emoticon;
	private final String displayName;

	CommandCategory(String packageName, String emoticon, String displayName) {

		this.packageName = packageName;
		this.emoticon = emoticon;
		this.displayName = displayName;
	}

	public static CommandCategory fromPackage(String packName) {
		if (packName != null) {
			for (CommandCategory cc : values()) {
				if (packName.equalsIgnoreCase(cc.packageName)) {
					return cc;
				}
			}
		}
		return UNKNOWN;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getPackageName() {
		return packageName;
	}

	public String getEmoticon() {
		return emoticon;
	}
}
