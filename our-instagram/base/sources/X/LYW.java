package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class LYW implements InterfaceC41501vz, C33R {
    public String A00;
    public String A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final IgSimpleImageView A05;
    public final C47693L4a A06;
    public final UserSession A07;
    public final IgTextView A08;

    public LYW(View view, UserSession userSession, boolean z) {
        C14360o3.A0B(view, 2);
        this.A07 = userSession;
        this.A04 = view;
        this.A08 = AbstractC25231BEo.A0d(view, R.id.title_text);
        this.A03 = AbstractC166997dE.A0S(view, R.id.row_feed_cta_overlay);
        this.A05 = AbstractC31176DnK.A0T(view, R.id.chevron_icon);
        this.A02 = AbstractC166997dE.A0S(view, R.id.edit_button);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A06 = new C47693L4a(AbstractC53242c7.A0F(A0L, R.attr.textColorPrimary), AbstractC53242c7.A0F(A0L, R.attr.ctaPressedColorNormal), AbstractC53242c7.A0F(A0L, R.attr.inverseBackgroundColorPrimary), AbstractC53242c7.A0F(A0L, R.attr.textColorPrimary), AbstractC53242c7.A0F(A0L, R.attr.ctaPressedColorNormal), AbstractC53242c7.A0F(A0L, R.attr.ctaPressedColorNormal), A0L.getColor(z ? R.color.grey_2 : R.color.grey_9));
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 5) {
            A00(c75113Zb);
        }
    }

    public final void A00(C75113Zb c75113Zb) {
        View view;
        int i;
        boolean z = c75113Zb.A28;
        IgTextView igTextView = this.A08;
        C47693L4a c47693L4a = this.A06;
        if (z) {
            igTextView.setTextColor(c47693L4a.A05);
            this.A05.setColorFilter(c47693L4a.A01);
            view = this.A04;
            i = c47693L4a.A00;
        } else {
            igTextView.setTextColor(c47693L4a.A06);
            this.A05.setColorFilter(c47693L4a.A02);
            view = this.A04;
            i = 0;
        }
        view.setBackgroundColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (X.C18U.A01(X.C06090Tz.A05, r9.A07, 36608707798243096L) == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L4
            r9.A01 = r10
        L4:
            android.view.View r0 = r9.A04
            android.content.Context r8 = r0.getContext()
            java.lang.String r7 = r9.A01
            if (r7 == 0) goto L2e
            com.instagram.common.ui.base.IgTextView r6 = r9.A08
            if (r11 != 0) goto L28
            com.instagram.common.session.UserSession r3 = r9.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36608707798243096(0x820f6d00001718, double:3.214832450818617E-306)
            long r4 = X.C18U.A01(r2, r3, r0)
            r2 = 1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 2131954236(0x7f130a3c, float:1.9544966E38)
            if (r1 != 0) goto L2b
        L28:
            r0 = 2131954244(0x7f130a44, float:1.9544982E38)
        L2b:
            X.AbstractC31177DnL.A0r(r8, r6, r7, r0)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYW.A01(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1118573335);
        LYK lyk = (LYK) obj;
        int A0N = AbstractC167017dG.A0N(lyk, -1312963382);
        if (C14360o3.A0K(lyk.A00, this.A00)) {
            A01(null, lyk.A01);
        }
        C0f9.A0A(-1714761387, A0N);
        C0f9.A0A(-394617739, A03);
    }
}
