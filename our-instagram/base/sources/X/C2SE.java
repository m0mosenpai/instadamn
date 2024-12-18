package X;

/* renamed from: X.2SE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SE {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final int A0J;
    public final String A0K;
    public final String A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Object obj2 = this.A07;
            CharSequence charSequence = ((C2SE) obj).A07;
            if (obj2 != charSequence) {
                if (obj2 == null || charSequence == null) {
                    return false;
                }
                return charSequence.equals(obj2);
            }
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.A07;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public C2SE(int i, String str, String str2) {
        this.A0J = i;
        this.A0K = str;
        this.A0L = str2;
    }

    public C2SE(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A07 = charSequence;
        this.A0C = str4;
        this.A0H = z;
        this.A0I = z2;
        "".getClass();
        this.A0E = "";
        this.A05 = j3;
        this.A09 = charSequence3;
        this.A0G = str8;
        this.A0B = str3;
        this.A0D = str5;
        this.A0A = str2;
        this.A08 = charSequence2;
        this.A0F = str7;
        this.A00 = i;
        this.A0J = i2;
        this.A0K = str;
        this.A02 = i4;
        this.A01 = i3;
        this.A0L = str6;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = j4;
    }
}
