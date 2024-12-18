package X;

/* renamed from: X.Ffr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35199Ffr {
    public int A00;
    public EnumC1579076z A01;
    public EnumC33464Eqz A02;
    public Boolean A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public static C19270xB A00(C35199Ffr c35199Ffr) {
        String str = c35199Ffr.A09;
        C14360o3.A07(str);
        return new C19270xB(str);
    }

    public static boolean A01(C35199Ffr c35199Ffr) {
        EnumC33486ErL valueOf = EnumC33486ErL.valueOf(c35199Ffr.A06);
        C14360o3.A07(valueOf);
        if (valueOf != EnumC33486ErL.SUGGESTED_BLOCKS && valueOf != EnumC33486ErL.BLOCKED_ACCOUNTS && valueOf != EnumC33486ErL.PSEUDO_BLOCK_WARNING && valueOf != EnumC33486ErL.SECURE_OVER_WA_PSEUDO_BLOCK_WARNING) {
            return false;
        }
        return true;
    }

    public C35199Ffr(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.A09 = str;
        this.A07 = str2;
        this.A00 = i;
        this.A08 = str3;
        this.A0B = str4;
        this.A04 = bool;
        this.A03 = bool2;
        this.A05 = str5;
        this.A06 = str6;
        this.A0A = str7;
        this.A01 = enumC1579076z;
        this.A02 = enumC33464Eqz;
    }

    public C35199Ffr() {
    }
}
