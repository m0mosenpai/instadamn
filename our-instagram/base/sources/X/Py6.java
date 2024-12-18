package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Py6 implements InterfaceC02530Ab {
    public static final /* synthetic */ Py6[] A01;
    public static final Py6 A02;
    public static final Py6 A03;
    public static final Py6 A04;
    public static final Py6 A05;
    public final String A00;

    static {
        Py6[] py6Arr = new Py6[184];
        System.arraycopy(new Py6[]{A00("ABKHAZIAN", "ab", 0), A00("AFAR", "aa", 1), A00("AFRIKAANS", "af", 2), A00("AKAN", "ak", 3), A00("ALBANIAN", "sq", 4), A00("AMHARIC", "am", 5), A00("ARABIC", "ar", 6), A00("ARAGONESE", "an", 7), A00("ARMENIAN", "hy", 8), A00("ASSAMESE", "as", 9), A00("AVARIC", "av", 10), A00("AVESTAN", "ae", 11), A00("AYMARA", "ay", 12), A00("AZERBAIJANI", "az", 13), A00("BAMBARA", "bm", 14), A00("BASHKIR", "ba", 15), A00("BASQUE", "eu", 16), A00("BELARUSIAN", "be", 17), A00("BENGALI", "bn", 18), A00("BIHARI_LANGUAGES", "bh", 19), A00("BISLAMA", "bi", 20), A00("BOSNIAN", "bs", 21), A00("BRETON", "br", 22), A00("BULGARIAN", "bg", 23), A00("BURMESE", "my", 24), A00("CATALAN_VALENCIAN", "ca", 25), A00("CENTRAL_KHMER", "km", 26)}, 0, py6Arr, 0, 27);
        Py6 A00 = A00("CHAMORRO", "ch", 27);
        Py6 A002 = A00("CHECHEN", "ce", 28);
        Py6 A003 = A00("CHICHEWA_CHEWA_NYANJA", "ny", 29);
        Py6 A004 = A00("CHINESE", "zh", 30);
        Py6 A005 = A00("CHURCH_SLAVIC_OLD_SLAVONIC_CHURCH_SLAVONIC_OLD_BULGARIAN_OLD_CHURCH_SLAVONIC", "cu", 31);
        Py6 A006 = A00("CHUVASH", "cv", 32);
        Py6 A007 = A00("CORNISH", "kw", 33);
        Py6 A008 = A00("CORSICAN", "co", 34);
        Py6 A009 = A00("CREE", "cr", 35);
        Py6 A0010 = A00("CROATIAN", "hr", 36);
        Py6 A0011 = A00("CZECH", "cs", 37);
        Py6 A0012 = A00("DANISH", "da", 38);
        Py6 A0013 = A00("DIVEHI_DHIVEHI_MALDIVIAN", "dv", 39);
        Py6 A0014 = A00("DUTCH_FLEMISH", "nl", 40);
        Py6 A0015 = A00("DZONGKHA", "dz", 41);
        Py6 A0016 = A00("ENGLISH", "en", 42);
        A02 = A0016;
        Py6 A0017 = A00("ESPERANTO", "eo", 43);
        Py6 A0018 = A00("ESTONIAN", "et", 44);
        Py6 A0019 = A00("EWE", "ee", 45);
        Py6 A0020 = A00("FAROESE", "fo", 46);
        Py6 A0021 = A00("FIJIAN", "fj", 47);
        Py6 A0022 = A00("FINNISH", "fi", 48);
        Py6 A0023 = A00("FRENCH", "fr", 49);
        A03 = A0023;
        System.arraycopy(new Py6[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A00("FULAH", "ff", 50), A00("GAELIC_SCOTTISH_GAELIC", "gd", 51), A00("GALICIAN", "gl", 52), A00("GANDA", "lg", 53)}, 0, py6Arr, 27, 27);
        Py6 A0024 = A00("GEORGIAN", "ka", 54);
        Py6 A0025 = A00("GERMAN", "de", 55);
        A04 = A0025;
        System.arraycopy(new Py6[]{A0024, A0025, A00("GREEK_MODERN__1453", "el", 56), A00("GUARANI", "gn", 57), A00("GUJARATI", "gu", 58), A00("HAITIAN_HAITIAN_CREOLE", "ht", 59), A00("HAUSA", "ha", 60), A00("HEBREW", "he", 61), A00("HERERO", "hz", 62), A00("HINDI", "hi", 63), A00("HIRI_MOTU", "ho", 64), A00("HUNGARIAN", "hu", 65), A00("ICELANDIC", "is", 66), A00("IDO", "io", 67), A00("IGBO", "ig", 68), A00("INDONESIAN", PublicKeyCredentialControllerUtility.JSON_KEY_ID, 69), A00("INTERLINGUA_INTERNATIONAL_AUXILIARY_LANGUAGE_ASSOCIATION", "ia", 70), A00("INTERLINGUE_OCCIDENTAL", "ie", 71), A00("INUKTITUT", "iu", 72), A00("INUPIAQ", "ik", 73), A00("IRISH", "ga", 74), A00("ITALIAN", "it", 75), A00("JAPANESE", "ja", 76), A00("JAVANESE", "jv", 77), A00("KALAALLISUT_GREENLANDIC", "kl", 78), A00("KANNADA", "kn", 79), A00("KANURI", "kr", 80)}, 0, py6Arr, 54, 27);
        System.arraycopy(new Py6[]{A00("KASHMIRI", "ks", 81), A00("KAZAKH", "kk", 82), A00("KIKUYU_GIKUYU", "ki", 83), A00("KINYARWANDA", "rw", 84), A00("KIRGHIZ_KYRGYZ", "ky", 85), A00("KOMI", "kv", 86), A00("KONGO", "kg", 87), A00("KOREAN", "ko", 88), A00("KUANYAMA_KWANYAMA", "kj", 89), A00("KURDISH", "ku", 90), A00("LAO", "lo", 91), A00("LATIN", "la", 92), A00("LATVIAN", "lv", 93), A00("LIMBURGAN_LIMBURGER_LIMBURGISH", "li", 94), A00("LINGALA", "ln", 95), A00("LITHUANIAN", "lt", 96), A00("LUBA_KATANGA", "lu", 97), A00("LUXEMBOURGISH_LETZEBURGESCH", "lb", 98), A00("MACEDONIAN", "mk", 99), A00("MALAGASY", "mg", 100), A00("MALAY", "ms", 101), A00("MALAYALAM", "ml", 102), A00("MALTESE", "mt", 103), A00("MANX", "gv", 104), A00("MAORI", "mi", 105), A00("MARATHI", "mr", 106), A00("MARSHALLESE", "mh", 107)}, 0, py6Arr, 81, 27);
        System.arraycopy(new Py6[]{A00("MONGOLIAN", "mn", 108), A00("NAURU", "na", 109), A00("NAVAJO_NAVAHO", "nv", 110), A00("NDONGA", "ng", 111), A00("NEPALI", "ne", 112), A00("NORTH_NDEBELE", "nd", 113), A00("NORTHERN_SAMI", "se", 114), A00("NORWEGIAN", "no", 115), A00("NORWEGIAN_BOKMAL", "nb", 116), A00("NORWEGIAN_NYNORSK", "nn", 117), A00("OCCITAN", "oc", 118), A00("OJIBWA", "oj", 119), A00("ORIYA", "or", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A00("OROMO", "om", 121), A00("OSSETIAN_OSSETIC", "os", 122), A00("PALI", "pi", 123), A00("PASHTO_PUSHTO", "ps", 124), A00("PERSIAN", "fa", 125), A00("POLISH", "pl", 126), A00("PORTUGUESE", "pt", StringTreeSet.MAX_SYMBOL_COUNT), A00("PUNJABI_PANJABI", "pa", 128), A00("QUECHUA", "qu", 129), A00("ROMANIAN_MOLDAVIAN_MOLDOVAN", "ro", 130), A00("ROMANSH", "rm", 131), A00("RUNDI", "rn", 132), A00("RUSSIAN", "ru", 133), A00("SAMOAN", "sm", 134)}, 0, py6Arr, 108, 27);
        Py6 A0026 = A00("SANGO", "sg", 135);
        Py6 A0027 = A00("SANSKRIT", "sa", 136);
        Py6 A0028 = A00("SARDINIAN", "sc", 137);
        Py6 A0029 = A00("SERBIAN", "sr", 138);
        Py6 A0030 = A00("SHONA", "sn", 139);
        Py6 A0031 = A00("SICHUAN_YI_NUOSU", "ii", 140);
        Py6 A0032 = A00("SINDHI", "sd", 141);
        Py6 A0033 = A00("SINHALA_SINHALESE", "si", 142);
        Py6 A0034 = A00("SLOVAK", "sk", 143);
        Py6 A0035 = A00("SLOVENIAN", "sl", 144);
        Py6 A0036 = A00("SOMALI", "so", 145);
        Py6 A0037 = A00("SOUTH_NDEBELE", "nr", 146);
        Py6 A0038 = A00("SOUTHERN_SOTHO", "st", 147);
        Py6 A0039 = A00("SPANISH_CASTILIAN", "es", 148);
        A05 = A0039;
        System.arraycopy(new Py6[]{A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A00("SUNDANESE", "su", 149), A00("SWAHILI", "sw", 150), A00("SWATI", "ss", 151), A00("SWEDISH", "sv", 152), A00("TAGALOG", "tl", 153), A00("TAHITIAN", "ty", 154), A00("TAJIK", "tg", 155), A00("TAMIL", "ta", 156), A00("TATAR", "tt", 157), A00("TELUGU", "te", 158), A00("THAI", "th", 159), A00("TIBETAN", "bo", 160), A00("TIGRINYA", "ti", 161)}, 0, py6Arr, 135, 27);
        System.arraycopy(new Py6[]{A00("TONGA_TONGA_ISLANDS", "to", 162), A00("TSONGA", "ts", 163), A00("TSWANA", "tn", 164), A00("TURKISH", "tr", 165), A00("TURKMEN", "tk", 166), A00("TWI", "tw", 167), A00("UIGHUR_UYGHUR", "ug", 168), A00("UKRAINIAN", "uk", 169), A00("URDU", "ur", AbstractC62862SUj.MAX_FACTORIAL), A00("UZBEK", "uz", 171), A00("VENDA", "ve", 172), A00("VIETNAMESE", "vi", 173), A00("VOLAPUK", "vo", 174), A00("WALLOON", "wa", 175), A00("WELSH", "cy", 176), A00("WESTERN_FRISIAN", "fy", 177), A00("WOLOF", "wo", 178), A00("XHOSA", "xh", 179), A00("YIDDISH", "yi", 180), A00("YORUBA", "yo", 181), A00("ZHUANG_CHUANG", "za", 182), A00("ZULU", "zu", 183)}, 0, py6Arr, 162, 22);
        A01 = py6Arr;
    }

    public static Py6 A00(String str, String str2, int i) {
        return new Py6(str, i, str2);
    }

    public static Py6 valueOf(String str) {
        return (Py6) Enum.valueOf(Py6.class, str);
    }

    public static Py6[] values() {
        return (Py6[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public Py6(String str, int i, String str2) {
        this.A00 = str2;
    }
}
