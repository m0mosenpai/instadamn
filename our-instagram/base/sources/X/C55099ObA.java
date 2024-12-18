package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.ObA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55099ObA {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgImageView A06;
    public C47Z A07;
    public SpinnerImageView A08;
    public Boolean A09;
    public final Context A0A;
    public final UserSession A0B;
    public final OJZ A0C;
    public final OXN A0D;
    public final AnonymousClass841 A0E;
    public final InterfaceC57994Pne A0F;

    private void A00() {
        if (this.A06 == null) {
            View view = this.A01;
            if (view != null) {
                IgImageView igImageView = (IgImageView) AbstractC167017dG.A0U(view, R.id.info_button_view_stub);
                this.A06 = igImageView;
                igImageView.setColorFilter(R.color.baseline_neutral_80, PorterDuff.Mode.SRC_IN);
            } else {
                C0w9.A03("ProductTagRowControllerImpl", "Trying to show infoButton before row is visible");
                return;
            }
        }
        this.A06.setVisibility(0);
    }

    public static void A01(C55099ObA c55099ObA) {
        SpinnerImageView spinnerImageView = c55099ObA.A08;
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            c55099ObA.A08.setVisibility(8);
        }
    }

    public final void A02() {
        String A0r;
        String A0r2;
        if (this.A01 != null) {
            this.A02.getClass();
            this.A03.getClass();
            this.A00.getClass();
            boolean A04 = A04();
            View view = this.A01;
            if (!A04) {
                view.setAlpha(0.3f);
                this.A01.setOnClickListener(null);
                this.A02.setVisibility(8);
                View view2 = this.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.A03.setVisibility(8);
            } else {
                if (view != null) {
                    view.setAlpha(1.0f);
                    Ok3.A00(this.A01, 51, this);
                }
                A03(false);
            }
            OXN oxn = this.A0D;
            if (oxn.A05()) {
                A00();
                C54567O8t c54567O8t = oxn.A01;
                c54567O8t.getClass();
                A0r = c54567O8t.A01;
                A0r2 = c54567O8t.A00;
            } else {
                C47Z c47z = this.A07;
                if (c47z != null && c47z.CKm() && !AbstractC166987dD.A10(this.A0B).A1O()) {
                    A00();
                    BrandedContentTag A07 = this.A07.A07();
                    A07.getClass();
                    String str = A07.A02;
                    Context context = this.A0A;
                    A0r = AbstractC166997dE.A0r(context.getResources(), str, 2131970049);
                    A0r2 = AbstractC166997dE.A0r(context.getResources(), str, 2131970048);
                } else {
                    AbstractC13880nE.A0P(this.A06);
                    return;
                }
            }
            View view3 = this.A01;
            view3.getClass();
            C0fQ.A00(new ViewOnClickListenerC55409OjK(this, A0r, A0r2, 6), view3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r7.A03 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r2 = r7.A0A;
        r3.setText(r2.getResources().getQuantityString(com.facebook.R.plurals.product_tagging_suggested_products, r4));
        X.AbstractC166987dD.A1O(r2, r7.A02, com.facebook.R.color.badge_color);
        r7.A02.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r7.A01 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r2 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r7.A03 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        r1 = 8;
        r2.setVisibility(8);
        r0 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r4 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7.A01 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r3 = r7.A02;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(boolean r8) {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r2 = r7.A0B
            X.841 r1 = r7.A0E
            int r6 = X.AbstractC55229Oez.A01(r2, r1)
            if (r8 == 0) goto L71
            X.NgS r0 = X.EnumC53230NgS.A06
            java.util.ArrayList r0 = X.AbstractC55225Oes.A01(r2, r1, r0)
            int r4 = r0.size()
            X.NgS r0 = X.EnumC53230NgS.A04
            java.util.ArrayList r0 = X.AbstractC55225Oes.A01(r2, r1, r0)
            int r0 = r0.size()
            if (r6 > 0) goto L93
            if (r0 != 0) goto L5d
        L22:
            if (r4 <= 0) goto L5d
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L5c
            android.widget.TextView r3 = r7.A02
            if (r3 == 0) goto L5c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L5c
            android.content.Context r2 = r7.A0A
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131820899(0x7f110163, float:1.9274526E38)
            java.lang.String r0 = r1.getQuantityString(r0, r4)
            r3.setText(r0)
            android.widget.TextView r1 = r7.A02
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            X.AbstractC166987dD.A1O(r2, r1, r0)
            android.widget.TextView r1 = r7.A02
            r0 = 0
            r1.setVisibility(r0)
        L4e:
            android.widget.TextView r0 = r7.A03
            r1 = 8
        L52:
            r0.setVisibility(r1)
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L5c
            r0.setVisibility(r1)
        L5c:
            return
        L5d:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L5c
            android.widget.TextView r2 = r7.A02
            if (r2 == 0) goto L5c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L5c
            r1 = 8
            r2.setVisibility(r1)
            android.widget.TextView r0 = r7.A03
            goto L52
        L71:
            X.AbstractC167017dG.A1N(r2, r1)
            java.util.Iterator r1 = X.MSX.A0n(r1)
            r4 = 0
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L91
            X.47Z r0 = X.AbstractC50522MSa.A0b(r2, r1)
            if (r0 == 0) goto L79
            java.util.ArrayList r0 = r0.A43
            if (r0 == 0) goto L8f
            int r0 = r0.size()
        L8d:
            int r4 = r4 + r0
            goto L79
        L8f:
            r0 = 0
            goto L8d
        L91:
            if (r6 <= 0) goto L22
        L93:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L5c
            android.widget.TextView r5 = r7.A02
            if (r5 == 0) goto L5c
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L5c
            android.content.Context r4 = r7.A0A
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131820869(0x7f110145, float:1.9274465E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1 = 0
            java.lang.String r0 = X.AbstractC31175DnJ.A0W(r3, r0, r2, r6)
            r5.setText(r0)
            android.widget.TextView r0 = r7.A02
            X.AbstractC31177DnL.A0y(r0, r4)
            android.widget.TextView r0 = r7.A02
            r0.setVisibility(r1)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55099ObA.A03(boolean):void");
    }

    public final boolean A04() {
        C47Z c47z = this.A07;
        if (c47z != null && c47z.CKm() && !AbstractC166987dD.A10(this.A0B).A1O()) {
            return false;
        }
        if (!this.A0D.A06() && !AbstractC166987dD.A10(this.A0B).A1N()) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        C47Z c47z = this.A07;
        if (c47z == null) {
            return false;
        }
        boolean A01 = AbstractC55108ObP.A01(this.A0B, this.A0E, c47z.A1G, "ProductTagRowControllerImpl", c47z.A41);
        this.A09 = Boolean.valueOf(A01);
        return A01;
    }

    public C55099ObA(Context context, UserSession userSession, AnonymousClass840 anonymousClass840, OJZ ojz, OXN oxn) {
        C56736PGe c56736PGe = new C56736PGe(this, 2);
        this.A0F = c56736PGe;
        this.A0A = context;
        this.A0B = userSession;
        this.A0E = anonymousClass840.A00();
        this.A0C = ojz;
        this.A0D = oxn;
        oxn.A00 = c56736PGe;
    }
}
