package X;

import android.util.Patterns;

/* renamed from: X.BcV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25873BcV extends AbstractC52922bZ {
    public final C27962CUh A00;
    public final C05A A01;
    public final C0UO A02;

    public static C26075Bg4 A01(C25873BcV c25873BcV) {
        return (C26075Bg4) ((C51759Mti) c25873BcV.A01.getValue()).A00;
    }

    public C25873BcV(C27962CUh c27962CUh) {
        this.A00 = c27962CUh;
        C008002u A1H = AbstractC25225BEi.A1H(new C51759Mti((C26075Bg4) c27962CUh.A01.getValue()));
        this.A01 = A1H;
        this.A02 = AbstractC208910l.A02(A1H);
        AbstractC166987dD.A1Z(new PZC(this, null, 18), AbstractC141776au.A00(this));
    }

    public static C26075Bg4 A00(AbstractC26821Bsj abstractC26821Bsj) {
        return (C26075Bg4) ((C51759Mti) abstractC26821Bsj.A05().A02.getValue()).A00;
    }

    public final EnumC27396C6z A02() {
        EnumC27396C6z enumC27396C6z;
        String str = A01(this).A0D;
        if (str == null) {
            str = "";
        }
        String A1A = AbstractC25228BEl.A1A(str);
        if (A1A.length() == 0) {
            enumC27396C6z = EnumC27396C6z.A03;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(A1A).matches()) {
            enumC27396C6z = EnumC27396C6z.A04;
        } else {
            enumC27396C6z = EnumC27396C6z.A06;
        }
        this.A00.A01(enumC27396C6z);
        return enumC27396C6z;
    }
}
