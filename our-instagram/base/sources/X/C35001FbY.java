package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FbY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35001FbY {
    public static final C34652FOk A03 = new Object();
    public final View A00;
    public final UserSession A01;
    public final C2EY A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(int r10) {
        /*
            r9 = this;
            X.FOk r0 = X.C35001FbY.A03
            com.instagram.common.session.UserSession r4 = r9.A01
            X.2EY r8 = r9.A02
            r3 = 0
            r7 = 1
            boolean r0 = r0.A00(r4, r8, r7)
            if (r0 == 0) goto Lb9
            X.1Ai r6 = X.AbstractC23021Ah.A00(r4)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328727470292728(0x8110c900023ef8, double:3.037771764032514E-306)
            boolean r5 = X.C18U.A06(r2, r4, r0)
            android.view.View r1 = r9.A00
            r0 = 2131431611(0x7f0b10bb, float:1.8484956E38)
            android.view.ViewStub r0 = X.AbstractC31171DnF.A07(r1, r0)
            if (r0 == 0) goto L2e
            android.view.View r2 = r0.inflate()
            if (r2 != 0) goto L2f
        L2e:
            r2 = r1
        L2f:
            android.content.Context r4 = r1.getContext()
            X.C14360o3.A0A(r4)
            X.F2N r0 = X.F2N.$redex_init_class
            int r0 = r8.ordinal()
            switch(r0) {
                case 15: goto La9;
                case 18: goto La9;
                case 20: goto Lad;
                case 21: goto Lad;
                case 22: goto Lb1;
                case 23: goto Lb1;
                case 28: goto Lb1;
                case 29: goto Lb1;
                case 46: goto Lb5;
                case 49: goto Lb5;
                default: goto L3f;
            }
        L3f:
            r0 = 2131973639(0x7f135607, float:1.958432E38)
        L42:
            java.lang.String r0 = X.AbstractC25227BEk.A0u(r4, r0)
            java.lang.String r1 = X.AbstractC167007dF.A0h(r0)
            r0 = 2131959366(0x7f131e46, float:1.955537E38)
            java.lang.String r1 = X.AbstractC31177DnL.A0b(r4, r1, r0)
            r8 = 2
            if (r5 == 0) goto L8e
            r0 = 6
            if (r10 < r0) goto L8e
            r0 = 2131431616(0x7f0b10c0, float:1.8484966E38)
            android.view.View r2 = r2.findViewById(r0)
            com.instagram.igds.components.banner.IgdsBanner r2 = (com.instagram.igds.components.banner.IgdsBanner) r2
            if (r2 == 0) goto Lb9
            X.AbstractC31172DnG.A1U(r2, r1, r3)
            X.G81.A00(r2, r6, r8)
        L68:
            r2.setVisibility(r3)
            X.0ry r5 = r6.A19
            X.0YR[] r4 = X.C23031Ai.A8c
            r3 = 378(0x17a, float:5.3E-43)
            java.lang.Object r0 = X.AbstractC31171DnF.A0Y(r6, r5, r4, r3)
            int r2 = X.AbstractC166987dD.A0H(r0)
            if (r2 < r8) goto L82
            X.0ry r1 = r6.A3F
            r0 = 377(0x179, float:5.28E-43)
            X.AbstractC167007dF.A1L(r6, r1, r4, r0, r7)
        L82:
            int r0 = r2 + 1
            r1 = r4[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.Egi(r6, r0, r1)
            return r7
        L8e:
            r0 = 2131431615(0x7f0b10bf, float:1.8484964E38)
            android.view.View r2 = r2.findViewById(r0)
            com.instagram.igds.components.banner.IgdsInsetBanner r2 = (com.instagram.igds.components.banner.IgdsInsetBanner) r2
            if (r2 == 0) goto Lb9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.setBody(r1, r0)
            r1 = 3
            X.G81 r0 = new X.G81
            r0.<init>(r6, r1)
            r2.A00 = r0
            goto L68
        La9:
            r0 = 2131970242(0x7f1348c2, float:1.957743E38)
            goto L42
        Lad:
            r0 = 2131962499(0x7f132a83, float:1.9561725E38)
            goto L42
        Lb1:
            r0 = 2131974694(0x7f135a26, float:1.958646E38)
            goto L42
        Lb5:
            r0 = 2131971773(0x7f134ebd, float:1.9580535E38)
            goto L42
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35001FbY.A00(int):boolean");
    }

    public C35001FbY(View view, UserSession userSession, C2EY c2ey) {
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = c2ey;
    }
}
