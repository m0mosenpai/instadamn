package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.JmT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44523JmT extends AbstractC52922bZ {
    public final BoostMediaPickerTabType A00;
    public final KZN A01;
    public final C47688L3v A02;
    public final UserSession A03;
    public final String A04;
    public final C0UO A05;

    public final void A00() {
        C05A c05a = this.A02.A03;
        C45106Jxa c45106Jxa = (C45106Jxa) c05a.getValue();
        C14360o3.A0B(c45106Jxa, 0);
        if (!AbstractC166987dD.A1b(c45106Jxa.A04) && c45106Jxa.A05) {
            AbstractC166987dD.A1Z(new MCK(c05a, this, (InterfaceC23621Ds) null, 8), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            X.L3v r0 = r0.A02
            r4 = 0
            X.05A r3 = r0.A03
            java.lang.Object r0 = r3.getValue()
            X.Jxa r0 = (X.C45106Jxa) r0
            r1 = r17
            java.lang.Integer r5 = r0.A00(r1)
            if (r5 == 0) goto L4c
            java.lang.Object r0 = r3.getValue()
            X.Jxa r0 = (X.C45106Jxa) r0
            int r1 = r0.A00
            java.lang.Object r0 = r3.getValue()
            X.Jxa r0 = (X.C45106Jxa) r0
            java.util.ArrayList r0 = r0.A03
            java.util.ArrayList r8 = X.AbstractC166987dD.A1F(r0)
        L29:
            int r0 = r8.size()
            r2 = -1
            if (r0 >= r1) goto L4d
            X.AbstractC166997dE.A1W(r8, r2)
            goto L29
        L34:
            java.lang.String r7 = r5.A02
            boolean r11 = r5.A05
            int r10 = r5.A00
            r4 = 0
            X.C14360o3.A0B(r9, r4)
            X.AbstractC167007dF.A1F(r7, r1, r8)
            X.Jxa r6 = new X.Jxa
            r6.<init>(r7, r8, r9, r10, r11)
            boolean r0 = r3.AIi(r0, r6)
            if (r0 == 0) goto L6b
        L4c:
            return
        L4d:
            int r0 = r8.size()
            r1 = 1
            if (r0 == r1) goto Lbf
            int r0 = r8.size()
            if (r0 <= r1) goto L6b
            int r0 = r8.indexOf(r5)
            if (r0 == r2) goto Lb1
            int r4 = r8.indexOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.set(r4, r0)
        L6b:
            java.lang.Object r0 = r3.getValue()
            r5 = r0
            X.Jxa r5 = (X.C45106Jxa) r5
            java.util.List r4 = r5.A04
            X.0si r4 = X.AbstractC001800i.A0p(r4)
            java.util.ArrayList r9 = X.AbstractC167017dG.A0q(r4)
            java.util.Iterator r7 = r4.iterator()
        L80:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r6 = r7.next()
            X.0eP r6 = (X.C0eP) r6
            java.lang.Object r4 = r6.A01
            X.LZj r4 = (X.C48310LZj) r4
            java.lang.String r13 = r4.A03
            com.instagram.common.typedurl.ImageUrl r12 = r4.A02
            X.VDG r11 = r4.A01
            int r4 = r6.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            int r4 = r8.indexOf(r6)
            r15 = 0
            if (r4 == r2) goto La4
            r15 = 1
        La4:
            int r14 = r8.indexOf(r6)
            X.LZj r10 = new X.LZj
            r10.<init>(r11, r12, r13, r14, r15)
            r9.add(r10)
            goto L80
        Lb1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            int r0 = r8.indexOf(r4)
            if (r0 == r2) goto L6b
            int r4 = r8.indexOf(r4)
        Lbf:
            r8.set(r4, r5)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44523JmT.A01(java.lang.String):void");
    }

    public C44523JmT(BoostMediaPickerTabType boostMediaPickerTabType, KZN kzn, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A01 = kzn;
        this.A04 = str;
        this.A00 = boostMediaPickerTabType;
        C47688L3v c47688L3v = new C47688L3v(boostMediaPickerTabType, this, userSession);
        this.A02 = c47688L3v;
        InterfaceC19390xP interfaceC19390xP = c47688L3v.A02;
        this.A05 = AbstractC208910l.A01(KE1.A00, AbstractC141776au.A00(this), interfaceC19390xP, C10I.A00);
    }
}
