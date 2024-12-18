package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189268a2 {
    public final InterfaceC29101an A00;
    public final Context A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1Yu] */
    public C189268a2(Context context) {
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A01 = applicationContext;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(C189278a3.A00);
        final C189298a6 c189298a6 = C189298a6.A00;
        InterfaceC29101an AL5 = new Object().AL5(AbstractC28981ab.A00(applicationContext, new AbstractC28901aT(c189298a6, arrayList) { // from class: X.8a7
            public final InterfaceC189288a4 A00;
            public final List A01;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r7 = this;
                    X.8a5[] r1 = X.C189298a6.A01
                    r6 = 1
                    r0 = 0
                    r0 = r1[r0]
                    int r5 = r6 * 31
                    java.lang.String r0 = r0.A01
                    int r0 = r0.hashCode()
                    int r5 = r5 + r0
                    java.util.Iterator r4 = r9.iterator()
                L13:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L35
                    java.lang.Object r0 = r4.next()
                    X.8a4 r0 = (X.InterfaceC189288a4) r0
                    X.8a5[] r3 = r0.BTm()
                    int r2 = r3.length
                    r1 = 0
                L25:
                    if (r1 >= r2) goto L13
                    r0 = r3[r1]
                    int r5 = r5 * 31
                    java.lang.String r0 = r0.A01
                    int r0 = r0.hashCode()
                    int r5 = r5 + r0
                    int r1 = r1 + 1
                    goto L25
                L35:
                    if (r5 == 0) goto L3b
                    int r6 = java.lang.Math.abs(r5)
                L3b:
                    r7.<init>(r6)
                    r7.A00 = r8
                    r7.A01 = r9
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C189308a7.<init>(X.8a6, java.util.List):void");
            }

            private void A00(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ADS();
                try {
                    new C23103AGp(interfaceC37481ol, this.A00, true).A01();
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        new C23103AGp(interfaceC37481ol, (InterfaceC189288a4) it.next(), false).A01();
                    }
                    ((C37471ok) interfaceC37481ol).A00.setTransactionSuccessful();
                } finally {
                    interfaceC37481ol.ASe();
                }
            }

            @Override // X.AbstractC28901aT
            public final void A04(InterfaceC37481ol interfaceC37481ol) {
                A00(interfaceC37481ol);
            }

            @Override // X.AbstractC28901aT
            public final void A05(InterfaceC37481ol interfaceC37481ol, int i, int i2) {
                A00(interfaceC37481ol);
            }

            @Override // X.AbstractC28901aT
            public final void A06(InterfaceC37481ol interfaceC37481ol, int i, int i2) {
                A00(interfaceC37481ol);
            }
        }, "GalleryMediaMetadata", false, false));
        this.A00 = AL5;
        AL5.EhP(true);
    }
}
