package X;

import android.content.Context;

/* renamed from: X.Fv5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36007Fv5 implements InterfaceC11380iw, InterfaceC12870lZ {
    public static C36007Fv5 A02 = null;
    public static final String __redex_internal_original_name = "FacebookSessionStore";
    public Context A00;
    public C203158yX A01;

    public final String A01(AbstractC12990ll abstractC12990ll, String str, String str2) {
        C203158yX c203158yX;
        C203168yY c203168yY;
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(!AMd.A04(str, str2, new C200898uW(abstractC12990ll, null))) && (c203158yX = this.A01) != null && (c203168yY = c203158yX.A00) != null) {
            return c203168yY.A01;
        }
        return null;
    }

    public final String A02(AbstractC12990ll abstractC12990ll, String str, String str2) {
        C203158yX c203158yX;
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(!AMd.A04(str, str2, new C200898uW(abstractC12990ll, null))) && (c203158yX = this.A01) != null) {
            return c203158yX.A02;
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Fv5, X.0lZ, java.lang.Object] */
    public static synchronized C36007Fv5 A00() {
        C36007Fv5 c36007Fv5;
        synchronized (C36007Fv5.class) {
            C36007Fv5 c36007Fv52 = A02;
            c36007Fv5 = c36007Fv52;
            if (c36007Fv52 == null) {
                Context context = AbstractC12290kX.A00;
                ?? obj = new Object();
                obj.A00 = context;
                C218914p.A08.A0A(obj);
                AbstractC52232aO.A00(context);
                A02 = obj;
                c36007Fv5 = obj;
            }
        }
        return c36007Fv5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1vw, java.lang.Object] */
    public final void A03(AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI) {
        if (this.A01 == null && AbstractC23851Es.A04(this.A00)) {
            C1GJ.A03(new EZD(abstractC12990ll, this, enumC31713DwI));
        } else {
            C41451vu.A01.E4s(new Object());
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1545735477);
        this.A01 = null;
        C0f9.A0A(-863540580, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(189128367, C0f9.A03(391739263));
    }
}
