package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.Ipy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42397Ipy implements BEV {
    public HH3 A00;
    public final FrameLayout A01;
    public final C217949kS A02;
    public final C1821585z A03;
    public final InterfaceC41501vz A04 = C37816GkW.A00(this, 0);
    public final UserSession A05;

    private void A00() {
        int i;
        C217949kS c217949kS = this.A02;
        if (c217949kS != null) {
            Integer A06 = C70Y.A00(this.A05).A06();
            if (A06 != null) {
                int intValue = A06.intValue();
                TextView textView = c217949kS.A00;
                textView.setText(String.valueOf(intValue));
                textView.setContentDescription(I7T.A00(AbstractC166997dE.A0L(textView), Integer.valueOf(intValue)));
                i = 0;
            } else {
                i = 4;
            }
            c217949kS.A00.setVisibility(i);
            c217949kS.EhF(true, false);
        }
    }

    @Override // X.BEV
    public final void DDq() {
        int i;
        float f;
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            C1821585z c1821585z = this.A03;
            if (C22P.A0U != c1821585z.A00) {
                Product A04 = c1821585z.A04();
                if (A04 != null) {
                    if (A04.A04()) {
                        if (A04.A0P) {
                            i = 2131957285;
                            if (c1821585z.A06()) {
                                i = 2131952364;
                            }
                        } else {
                            i = 2131974040;
                        }
                    } else {
                        i = 2131976866;
                    }
                    f = 1.0f;
                    this.A00 = new HH3(frameLayout.getContext(), ViewOnClickListenerC42032Ik1.A00(this, 11), frameLayout, f, i);
                } else {
                    i = 2131976057;
                }
                f = 0.4f;
                this.A00 = new HH3(frameLayout.getContext(), ViewOnClickListenerC42032Ik1.A00(this, 11), frameLayout, f, i);
            }
        }
        A00();
    }

    @Override // X.BEV
    public final void DDz() {
        HH3 hh3 = this.A00;
        if (hh3 != null) {
            hh3.A00.A05(null);
        }
        C217949kS c217949kS = this.A02;
        if (c217949kS != null) {
            c217949kS.EhF(false, false);
        }
    }

    @Override // X.BEV
    public final void DEt() {
        HH3 hh3 = this.A00;
        if (hh3 != null) {
            hh3.A00.A05(null);
        }
        C217949kS c217949kS = this.A02;
        if (c217949kS != null) {
            c217949kS.EhF(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    @Override // X.BEV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBk() {
        /*
            r6 = this;
            X.HH3 r5 = r6.A00
            if (r5 == 0) goto L5c
            X.85z r2 = r6.A03
            com.instagram.user.model.Product r1 = r2.A04()
            r3 = 2131976866(0x7f1362a2, float:1.9590865E38)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L61
            boolean r0 = r1.A04()
            if (r0 == 0) goto L27
            boolean r0 = r1.A0P
            if (r0 == 0) goto L65
            boolean r0 = r2.A06()
            r3 = 2131957285(0x7f131625, float:1.955115E38)
            if (r0 == 0) goto L27
            r3 = 2131952364(0x7f1302ec, float:1.9541169E38)
        L27:
            java.util.Map r1 = r2.A0K
            java.lang.String r0 = r2.A05
            java.lang.String r0 = X.AbstractC166987dD.A1A(r0, r1)
            r1 = 1
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 != 0) goto L39
        L38:
            r1 = 0
        L39:
            X.3BD r2 = r5.A00
            r0 = 0
            if (r1 == 0) goto L5d
            r2.A06(r0)
        L41:
            android.widget.FrameLayout r0 = r6.A01
            r0.getClass()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = r0.getString(r3)
            android.widget.TextView r0 = r2.A07
            if (r0 == 0) goto L55
            r0.setText(r1)
        L55:
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L5c
            r0.setAlpha(r4)
        L5c:
            return
        L5d:
            r2.A05(r0)
            goto L41
        L61:
            r3 = 2131976057(0x7f135f79, float:1.9589224E38)
            goto L68
        L65:
            r3 = 2131974040(0x7f135798, float:1.9585133E38)
        L68:
            r4 = 1053609165(0x3ecccccd, float:0.4)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42397Ipy.FBk():void");
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        AbstractC25651Mw.A00(this.A05).A02(this.A04, C71H.class);
    }

    public C42397Ipy(FrameLayout frameLayout, UserSession userSession, C217949kS c217949kS, C1821585z c1821585z) {
        this.A03 = c1821585z;
        this.A05 = userSession;
        this.A01 = frameLayout;
        this.A02 = c217949kS;
        if (c217949kS != null) {
            C184708Hl Csh = c217949kS.Csh();
            Csh.A00 = new C23741AfE(this, 2);
            Csh.A00();
        }
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        A00();
        AbstractC25651Mw.A00(this.A05).A01(this.A04, C71H.class);
    }
}
