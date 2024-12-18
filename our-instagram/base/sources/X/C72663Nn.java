package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72663Nn {
    public static final C72663Nn A00 = new Object();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3No, java.lang.Object] */
    public final void A00(View view) {
        final WeakReference weakReference = new WeakReference(view);
        C57112jm A01 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
        if (A01 != null) {
            ?? obj = new Object();
            obj.A01 = false;
            obj.A00 = "unknown";
            String valueOf = String.valueOf(hashCode());
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(null, obj, valueOf);
            c59072n8.A00(new InterfaceC43071ya() { // from class: X.3Np
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
                
                    if (r0 != null) goto L18;
                 */
                @Override // X.InterfaceC43071ya
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void ATP(X.C59062n7 r6, X.InterfaceC57162jr r7) {
                    /*
                        r5 = this;
                        java.lang.ref.WeakReference r0 = r1
                        java.lang.Object r4 = r0.get()
                        android.view.View r4 = (android.view.View) r4
                        if (r4 == 0) goto L62
                        java.lang.Integer r1 = r7.CFq(r6)
                        X.C14360o3.A07(r1)
                        java.lang.Integer r0 = X.C05F.A00
                        if (r1 == r0) goto L21
                        java.lang.Object r3 = r6.A04
                        X.3No r3 = (X.C72673No) r3
                        boolean r0 = r3.A01
                        if (r0 != 0) goto L4f
                        java.lang.Integer r0 = X.C05F.A01
                        if (r1 != r0) goto L4f
                    L21:
                        java.lang.Object r3 = r6.A04
                        X.3No r3 = (X.C72673No) r3
                        r0 = 1
                        r3.A01 = r0
                        r0 = 0
                        androidx.fragment.app.Fragment r2 = X.AbstractC10360h2.A01(r4)     // Catch: java.lang.IllegalStateException -> L39
                        boolean r1 = r2 instanceof X.InterfaceC11380iw     // Catch: java.lang.IllegalStateException -> L39
                        if (r1 == 0) goto L3b
                        X.0iw r2 = (X.InterfaceC11380iw) r2     // Catch: java.lang.IllegalStateException -> L39
                        if (r2 == 0) goto L3b
                        java.lang.String r0 = r2.getModuleName()     // Catch: java.lang.IllegalStateException -> L39
                    L39:
                        if (r0 != 0) goto L3d
                    L3b:
                        java.lang.String r0 = "unknown"
                    L3d:
                        r3.A00 = r0
                        X.1KM r2 = X.C1KM.A09
                        int r0 = r4.hashCode()
                        java.lang.String r1 = java.lang.String.valueOf(r0)
                        java.lang.String r0 = r3.A00
                        r2.A0J(r1, r0)
                        return
                    L4f:
                        java.lang.Integer r0 = X.C05F.A0C
                        if (r1 != r0) goto L62
                        X.1KM r2 = X.C1KM.A09
                        int r0 = r4.hashCode()
                        java.lang.String r1 = java.lang.String.valueOf(r0)
                        java.lang.String r0 = r3.A00
                        r2.A0I(r1, r0)
                    L62:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C72683Np.ATP(X.2n7, X.2jr):void");
                }
            });
            A01.A05(view, c59072n8.A01());
        }
    }

    public final void A01(View view) {
        InterfaceC08430c6 A01;
        InterfaceC11380iw interfaceC11380iw;
        C57112jm A012 = AbstractC58982mw.A01(AbstractC58952mt.A00(view));
        if (A012 != null) {
            A012.A04(view);
        }
        String str = null;
        try {
            A01 = AbstractC10360h2.A01(view);
        } catch (IllegalStateException unused) {
        }
        if ((A01 instanceof InterfaceC11380iw) && (interfaceC11380iw = (InterfaceC11380iw) A01) != null) {
            str = interfaceC11380iw.getModuleName();
            if (str != null) {
                C1KM.A09.A0I(String.valueOf(view.hashCode()), str);
            }
        }
    }
}
