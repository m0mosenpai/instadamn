package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Olb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55541Olb implements C03L {
    public final int A00;
    public final Object A01;

    public C55541Olb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r2 != null) goto L26;
     */
    @Override // X.C03L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C011504d Cx7(android.view.View r5, X.C011504d r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L5a;
                case 2: goto L16;
                case 3: goto L29;
                default: goto L5;
            }
        L5:
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            int r1 = r6.A02()
            r0 = 0
            r2.setPadding(r0, r0, r0, r1)
        L15:
            return r6
        L16:
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r1 = 7
            X.04b r0 = r6.A00
            X.02I r3 = r0.A05(r1)
            X.C14360o3.A07(r3)
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            goto La6
        L29:
            X.AbstractC167017dG.A1N(r5, r6)
            java.lang.Object r0 = r4.A01
            com.instagram.rtc.activity.RtcCallActivity r0 = (com.instagram.rtc.activity.RtcCallActivity) r0
            X.OMR r0 = r0.A02
            if (r0 != 0) goto L3e
            java.lang.String r0 = "presenterBridge"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3e:
            int r3 = r6.A03()
            int r2 = r6.A02()
            X.Odh r1 = r0.A04
            X.PDQ r0 = new X.PDQ
            r0.<init>(r3, r2)
            r1.A05(r0)
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4.A00(r5, r6)
            return r6
        L5a:
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r1 = 7
            X.04b r0 = r6.A00
            X.02I r3 = r0.A05(r1)
            X.C14360o3.A07(r3)
            java.lang.Object r2 = r4.A01
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L15
            r0 = 2131435251(0x7f0b1ef3, float:1.8492339E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L81
            int r0 = r3.A03
            X.AbstractC13880nE.A0f(r1, r0)
            int r0 = r3.A00
            X.AbstractC13880nE.A0U(r1, r0)
        L81:
            r0 = 2131427525(0x7f0b00c5, float:1.8476669E38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L15
            goto La6
        L8b:
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131435254(0x7f0b1ef6, float:1.8492345E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L15
            r1 = 7
            X.04b r0 = r6.A00
            X.02I r3 = r0.A05(r1)
            X.C14360o3.A07(r3)
        La6:
            int r0 = r3.A03
            X.AbstractC13880nE.A0f(r2, r0)
            int r0 = r3.A00
            X.AbstractC13880nE.A0U(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55541Olb.Cx7(android.view.View, X.04d):X.04d");
    }

    public final void A00(ViewGroup viewGroup, C011504d c011504d) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getFitsSystemWindows()) {
                AbstractC010103p.A05(childAt, c011504d);
            }
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, c011504d);
            }
        }
    }
}
