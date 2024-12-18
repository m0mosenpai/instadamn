package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
public final class JVV extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final Drawable A01;
    public final EnumC46283KeF A02;
    public final C7QL A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C7QX A0C;
    public final C7T3 A0D;
    public final String A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVV(Drawable drawable, EnumC46283KeF enumC46283KeF, C7QX c7qx, C7QL c7ql, C7T3 c7t3, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3) {
        super(c7qx);
        AbstractC25229BEm.A1J(str2, 2, drawable);
        C14360o3.A0B(str5, 14);
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A0D = c7t3;
        this.A0E = str4;
        this.A09 = z;
        this.A03 = c7ql;
        this.A04 = num;
        this.A02 = enumC46283KeF;
        this.A01 = drawable;
        this.A00 = i;
        this.A0A = z2;
        this.A0B = z3;
        this.A05 = str5;
        this.A0C = c7qx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JVV) {
                JVV jvv = (JVV) obj;
                if (!C14360o3.A0K(this.A06, jvv.A06) || !C14360o3.A0K(this.A08, jvv.A08) || !C14360o3.A0K(this.A07, jvv.A07) || this.A0D != jvv.A0D || !C14360o3.A0K(this.A0E, jvv.A0E) || this.A09 != jvv.A09 || !C14360o3.A0K(this.A03, jvv.A03) || this.A04 != jvv.A04 || this.A02 != jvv.A02 || !C14360o3.A0K(this.A01, jvv.A01) || this.A00 != jvv.A00 || this.A0A != jvv.A0A || this.A0B != jvv.A0B || !C14360o3.A0K(this.A05, jvv.A05) || !C14360o3.A0K(this.A0C, jvv.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0J(this.A0D, (AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0J(this.A06)) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31));
        Integer num = this.A04;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "INITIATE_VIDEO";
                    break;
                case 2:
                    str = "JOIN_AUDIO";
                    break;
                case 3:
                    str = "JOIN_VIDEO";
                    break;
                default:
                    str = "INITIATE_AUDIO";
                    break;
            }
            i = AbstractC25226BEj.A02(str, intValue);
        }
        return AbstractC166987dD.A0I(this.A0C, (AbstractC166997dE.A0K(this.A05, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, (A0J + i) * 31)) + this.A00) * 31))) + 1231) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
