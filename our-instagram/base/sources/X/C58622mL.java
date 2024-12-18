package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.2mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58622mL {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final View A03;
    public final C58652mO A04;
    public final C58652mO A05;
    public final ColorFilterAlphaImageView A06;
    public final C23031Ai A07;
    public final Runnable A08;
    public final int A09;
    public final UserSession A0A;
    public final Runnable A0B;

    public final void A00() {
        C23031Ai c23031Ai = this.A07;
        if (((Number) c23031Ai.A6r.CES(c23031Ai, C23031Ai.A8c[522])).intValue() < 2) {
            UserSession userSession = this.A0A;
            if (AbstractC70443Ed.A02(userSession) && C18U.A06(C06090Tz.A05, userSession, 36325484770899059L)) {
                this.A00 = true;
                C11T.A04(this.A0B, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    }

    public final void A01() {
        int i;
        int i2;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A06;
        if (colorFilterAlphaImageView != null && (i = this.A02) != 0 && (i2 = this.A01) != 0 && this.A00) {
            C58652mO c58652mO = this.A04;
            if (c58652mO != null && c58652mO.isPlaying()) {
                c58652mO.stop();
            }
            C58652mO c58652mO2 = this.A05;
            if (c58652mO2 != null && c58652mO2.isPlaying()) {
                c58652mO2.stop();
            }
            colorFilterAlphaImageView.getLayoutParams().width = i;
            colorFilterAlphaImageView.getLayoutParams().height = i2;
            colorFilterAlphaImageView.setImageResource(this.A09);
            C11T.A01(this.A0B);
            C11T.A01(this.A08);
            this.A00 = false;
        }
    }

    public C58622mL(Context context, View view, UserSession userSession, int i) {
        int i2;
        C58652mO c58652mO;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.A0A = userSession;
        this.A03 = view;
        this.A09 = i;
        this.A07 = AbstractC23021Ah.A00(userSession);
        C58652mO c58652mO2 = null;
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.findViewById(R.id.tab_icon);
        this.A06 = colorFilterAlphaImageView;
        int i3 = 0;
        if (colorFilterAlphaImageView != null && (layoutParams2 = colorFilterAlphaImageView.getLayoutParams()) != null) {
            i2 = layoutParams2.width;
        } else {
            i2 = 0;
        }
        this.A02 = i2;
        if (colorFilterAlphaImageView != null && (layoutParams = colorFilterAlphaImageView.getLayoutParams()) != null) {
            i3 = layoutParams.height;
        }
        this.A01 = i3;
        try {
            c58652mO = (C58652mO) context.getDrawable(R.drawable.qs_promo_qspromofeedintro);
        } catch (Exception unused) {
            c58652mO = null;
        }
        this.A04 = c58652mO;
        try {
            c58652mO2 = (C58652mO) context.getDrawable(R.drawable.qs_promo_qspromofeedoutro);
        } catch (Exception unused2) {
        }
        this.A05 = c58652mO2;
        this.A0B = new Runnable() { // from class: X.2mc
            @Override // java.lang.Runnable
            public final void run() {
                C58652mO c58652mO3;
                C58622mL c58622mL = C58622mL.this;
                View view2 = c58622mL.A03;
                ColorFilterAlphaImageView colorFilterAlphaImageView2 = c58622mL.A06;
                if (colorFilterAlphaImageView2 != null && c58622mL.A02 != 0 && c58622mL.A01 != 0 && (c58652mO3 = c58622mL.A04) != null && c58622mL.A05 != null) {
                    colorFilterAlphaImageView2.setImageDrawable(c58652mO3);
                    colorFilterAlphaImageView2.getLayoutParams().width = view2.getHeight();
                    colorFilterAlphaImageView2.getLayoutParams().height = view2.getHeight();
                    c58652mO3.A8x(new C28512Ci6(c58622mL));
                    c58652mO3.E4S();
                }
            }
        };
        this.A08 = new Runnable() { // from class: X.2md
            @Override // java.lang.Runnable
            public final void run() {
                C58652mO c58652mO3;
                C58622mL c58622mL = C58622mL.this;
                ColorFilterAlphaImageView colorFilterAlphaImageView2 = c58622mL.A06;
                if (colorFilterAlphaImageView2 != null && c58622mL.A02 != 0 && c58622mL.A01 != 0 && (c58652mO3 = c58622mL.A05) != null) {
                    colorFilterAlphaImageView2.setImageDrawable(c58652mO3);
                    c58652mO3.A8x(new C28511Ci5(c58622mL));
                    c58652mO3.E4S();
                }
            }
        };
    }
}
