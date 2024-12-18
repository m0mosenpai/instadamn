package X;

import android.content.Context;

/* renamed from: X.85R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85R {
    public static C85R A01;
    public final C150486px A00;

    public static synchronized C85R A00(Context context, AbstractC12990ll abstractC12990ll) {
        C85R c85r;
        synchronized (C85R.class) {
            c85r = A01;
            if (c85r == null) {
                c85r = new C85R(context.getApplicationContext(), abstractC12990ll);
                A01 = c85r;
            }
        }
        return c85r;
    }

    public final void A01(final C85T c85t, InterfaceC142616cN interfaceC142616cN) {
        C150486px c150486px = this.A00;
        if (c150486px != null) {
            C85V c85v = new C85V() { // from class: X.85U
                @Override // X.C85V
                public final void DCz(C150156pL c150156pL) {
                    C85T.this.DTk(c150156pL);
                }
            };
            C150686qP c150686qP = c150486px.A00;
            c150686qP.A0A.execute(new C85W(c85v, c150686qP, interfaceC142616cN));
        }
    }

    public C85R(Context context, AbstractC12990ll abstractC12990ll) {
        this.A00 = C150476pw.A00(context, AbstractC149806oZ.A00(abstractC12990ll), abstractC12990ll);
    }
}
