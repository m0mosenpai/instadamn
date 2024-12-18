package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.lang.ref.WeakReference;

/* renamed from: X.6bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141956bE extends AbstractC60592pi {
    public UserSession A00;
    public ReelViewerConfig A01;
    public C3G2 A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC11380iw A05;
    public final InterfaceC1118853a A06;
    public final InterfaceC144586fe A07;
    public final WeakReference A08;
    public final InterfaceC41501vz A09 = new C31210Dnt(this);
    public final InterfaceC41501vz A0E = new C37334Gcc(this);
    public final InterfaceC41501vz A0D = new C37335Gcd(this);
    public final C37336Gce A0G = new C37336Gce(this);
    public final InterfaceC41501vz A0B = new InterfaceC41501vz() { // from class: X.9Gc
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1147424566);
            C142756cb c142756cb = (C142756cb) obj;
            int A0N = AbstractC167017dG.A0N(c142756cb, 2039613301);
            C141956bE.this.A06.ABg(AbstractC001800i.A0U(c142756cb.A00), -1);
            C0f9.A0A(1188735800, A0N);
            C0f9.A0A(-112152328, A03);
        }
    };
    public final InterfaceC41501vz A0A = new C37337Gcf(this);
    public final InterfaceC41501vz A0F = new InterfaceC41501vz() { // from class: X.9Gd
        /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
        @Override // X.InterfaceC41501vz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 1608982705(0x5fe720b1, float:3.3309012E19)
                int r4 = X.C0f9.A03(r0)
                X.6cU r10 = (X.C142686cU) r10
                r0 = -66970212(0xfffffffffc021d9c, float:-2.7023966E36)
                int r3 = X.C0f9.A03(r0)
                r8 = 0
                X.C14360o3.A0B(r10, r8)
                X.6bE r2 = X.C141956bE.this
                java.lang.ref.WeakReference r0 = r2.A08
                java.lang.Object r0 = r0.get()
                androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                if (r0 == 0) goto Lc5
                android.content.Context r0 = r0.getContext()
                if (r0 == 0) goto Lc5
                android.content.Context r6 = r0.getApplicationContext()
                if (r6 == 0) goto Lc5
                boolean r5 = r10.A02
                if (r5 == 0) goto L3e
                com.instagram.common.session.UserSession r1 = r2.A00
                if (r1 != 0) goto L4f
                java.lang.String r0 = "userSession"
                X.C14360o3.A0F(r0)
                X.00O r0 = X.C00O.createAndThrow()
                throw r0
            L3e:
                if (r5 == 0) goto L44
                r1 = 2131974626(0x7f1359e2, float:1.9586321E38)
                goto L62
            L44:
                boolean r0 = r10.A01
                r1 = 2131974657(0x7f135a01, float:1.9586384E38)
                if (r0 == 0) goto L62
                r1 = 2131974697(0x7f135a29, float:1.9586465E38)
                goto L62
            L4f:
                X.0Tz r0 = X.C06090Tz.A05
                boolean r0 = X.C18U.A05(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L3e
                r1 = 2131974572(0x7f1359ac, float:1.9586212E38)
            L62:
                java.lang.String r0 = X.AbstractC166997dE.A0p(r6, r1)
                X.C9GR.A09(r6, r0)
                X.53a r0 = r2.A06
                android.view.View r0 = r0.AuA()
                r1 = 0
                if (r0 == 0) goto L76
                java.lang.Object r1 = r0.getTag()
            L76:
                boolean r0 = r1 instanceof X.C143556du
                if (r0 == 0) goto Lc1
                X.6du r1 = (X.C143556du) r1
                if (r1 == 0) goto Lc1
                X.6fY r7 = r1.A1o
                if (r7 == 0) goto Lc1
                r0 = 7
                X.9F2 r6 = new X.9F2
                r6.<init>(r0, r1, r2)
                com.instagram.common.ui.widget.imageview.IgImageView r5 = r7.A07
                int r0 = r5.getVisibility()
                boolean r0 = X.AbstractC167007dF.A1N(r0)
                r2 = 8
                if (r0 == 0) goto Lb7
                X.1qM r0 = r7.A00
                if (r0 == 0) goto La3
                X.1rF r1 = r0.A0C
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                r1.EQO(r0)
            La3:
                r6.invoke()
                X.5le r1 = X.AbstractC125325le.A01(r5, r8)
                r0 = 0
                r1.A0I(r0)
                r1.A03 = r2
                X.5le r0 = r1.A0A()
                r0.A0H()
            Lb7:
                android.view.View r0 = r7.A05
                r0.setVisibility(r2)
                android.view.View r0 = r7.A02
                r0.setVisibility(r2)
            Lc1:
                r0 = -1946681407(0xffffffff8bf7ffc1, float:-9.5525755E-32)
                goto Lc8
            Lc5:
                r0 = 215519429(0xcd890c5, float:3.33672E-31)
            Lc8:
                X.C0f9.A0A(r0, r3)
                r0 = 1544022034(0x5c07e812, float:1.5301714E17)
                X.C0f9.A0A(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C207509Gd.onEvent(java.lang.Object):void");
        }
    };
    public final C37338Gcg A0H = new C37338Gcg(this);
    public final InterfaceC41501vz A0C = new C37339Gch(this);

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(userSession).A01(this.A0B, C142756cb.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A01(this.A09, C142656cR.class);
        A00.A03(this.A0E, AbstractC142666cS.class, "support_personalized_ads_sticker_shared_event");
        A00.A01(this.A0D, C141936bC.class);
        A00.A01(this.A0G, C142676cT.class);
        A00.A01(this.A0A, C70103Cu.class);
        A00.A01(this.A0F, C142686cU.class);
        A00.A01(this.A0H, C3DH.class);
        A00.A01(this.A0C, C41131vM.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.A02(this.A09, C142656cR.class);
        A00.A02(this.A0E, AbstractC142666cS.class);
        A00.A02(this.A0D, C141936bC.class);
        A00.A02(this.A0G, C142676cT.class);
        A00.A02(this.A0A, C70103Cu.class);
        A00.A02(this.A0F, C142686cU.class);
        A00.A02(this.A0H, C3DH.class);
        A00.A02(this.A0C, C41131vM.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(userSession).A02(this.A0B, C142756cb.class);
    }

    public C141956bE(InterfaceC11380iw interfaceC11380iw, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A06 = interfaceC1118853a;
        this.A07 = interfaceC144586fe;
        this.A05 = interfaceC11380iw;
        this.A08 = weakReference;
    }
}
