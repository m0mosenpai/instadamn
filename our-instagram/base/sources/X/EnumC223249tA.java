package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9tA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223249tA {
    public static final /* synthetic */ EnumC223249tA[] A01;
    public static final EnumC223249tA A02;
    public final String A00;

    static {
        EnumC223249tA enumC223249tA = new EnumC223249tA("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC223249tA;
        EnumC223249tA A00 = A00("ALUMNI_SANS", "alumni_sans", 1);
        EnumC223249tA A002 = A00("AVENY", "aveny", 2);
        EnumC223249tA A003 = A00("BOLD_ITALIC", "bold_italic", 3);
        EnumC223249tA A004 = A00("CAPRASIMO", "caprasimo", 4);
        EnumC223249tA A005 = A00("CLASSIC", "classic", 5);
        EnumC223249tA A006 = A00("CLASSIC_V2", "classic_v2", 6);
        EnumC223249tA A007 = A00("DEFAULT", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, 7);
        EnumC223249tA A008 = A00("DIRECTIONAL", "directional", 8);
        EnumC223249tA A009 = A00("DYNAPUFF", "dynapuff", 9);
        EnumC223249tA A0010 = A00("ELEGANT", "elegant", 10);
        EnumC223249tA A0011 = A00("HALLOWEEN", "halloween", 11);
        EnumC223249tA A0012 = A00("HEPTA_SLAB", "hepta_slab", 12);
        EnumC223249tA A0013 = A00("IG_BUBBLE", "ig_bubble", 13);
        EnumC223249tA A0014 = A00("IG_CLASSIC", "ig_classic", 14);
        EnumC223249tA A0015 = A00("IG_DECO", "ig_deco", 15);
        EnumC223249tA A0016 = A00("IG_EDITOR", "ig_editor", 16);
        EnumC223249tA A0017 = A00("IG_LITERATURE", "ig_literature", 17);
        EnumC223249tA A0018 = A00("IG_POSTER", "ig_poster", 18);
        EnumC223249tA A0019 = A00("IG_SIGNATURE", "ig_signature", 19);
        EnumC223249tA A0020 = A00("IG_SQUEEZE", "ig_squeeze", 20);
        EnumC223249tA A0021 = A00("LITERATURE", "literature", 21);
        EnumC223249tA A0022 = A00("MEME", "meme", 22);
        EnumC223249tA A0023 = A00("MODERN", "modern", 23);
        EnumC223249tA A0024 = A00("MODERN_REFRESHED", "modern_refreshed", 24);
        EnumC223249tA A0025 = A00("MODERN_REFRESHED_V2", "modern_refreshed_v2", 25);
        EnumC223249tA A0026 = A00("MODERN_V2", "modern_v2", 26);
        EnumC223249tA A0027 = A00("MONO", "mono", 27);
        EnumC223249tA A0028 = A00("NEON", "neon", 28);
        EnumC223249tA A0029 = A00("NEON_V2", "neon_v2", 29);
        EnumC223249tA A0030 = A00("POPPINS", "poppins", 30);
        EnumC223249tA A0031 = A00("SCRIPT", "script", 31);
        EnumC223249tA A0032 = A00("SECRET_MEME", "secret_meme", 32);
        EnumC223249tA A0033 = A00("SPARK_APP", "spark_app", 33);
        EnumC223249tA A0034 = A00("STRONG", "strong", 34);
        EnumC223249tA A0035 = A00("STRONG_V2", "strong_v2", 35);
        EnumC223249tA A0036 = A00("TYPEWRITER", "typewriter", 36);
        EnumC223249tA A0037 = A00("TYPEWRITER_V2", "typewriter_v2", 37);
        EnumC223249tA[] enumC223249tAArr = new EnumC223249tA[38];
        System.arraycopy(new EnumC223249tA[]{enumC223249tA, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026}, 0, enumC223249tAArr, 0, 27);
        System.arraycopy(new EnumC223249tA[]{A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037}, 0, enumC223249tAArr, 27, 11);
        A01 = enumC223249tAArr;
    }

    public static EnumC223249tA A00(String str, String str2, int i) {
        return new EnumC223249tA(str, i, str2);
    }

    public static EnumC223249tA valueOf(String str) {
        return (EnumC223249tA) Enum.valueOf(EnumC223249tA.class, str);
    }

    public static EnumC223249tA[] values() {
        return (EnumC223249tA[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC223249tA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
