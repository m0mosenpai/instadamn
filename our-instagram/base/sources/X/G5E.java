package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class G5E implements C7QD {
    public Context A00;
    public Drawable A01;
    public Drawable A02;
    public ViewGroup A03;
    public IgSimpleImageView A04;
    public final G1e A05;
    public final C57012jc A06;

    public final void A00() {
        if (this.A06.A04()) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup == null) {
                C14360o3.A0F("pillContainer");
                throw C00O.createAndThrow();
            }
            viewGroup.setVisibility(8);
        }
    }

    public final void A01(G5F g5f) {
        this.A06.A01();
        ViewGroup viewGroup = this.A03;
        String str = "pillContainer";
        if (viewGroup != null) {
            int i = 0;
            if (g5f.A00 > 0) {
                i = 8;
            }
            viewGroup.setVisibility(i);
            Drawable drawable = this.A01;
            if (drawable == null) {
                str = "pillBackgroundDrawable";
            } else {
                C7IH c7ih = g5f.A01;
                AbstractC166997dE.A1F(drawable, c7ih.A0K);
                Drawable drawable2 = this.A02;
                if (drawable2 == null) {
                    str = "pillBackgroundShadow";
                } else {
                    AbstractC166997dE.A1F(drawable2, c7ih.A07);
                    IgSimpleImageView igSimpleImageView = this.A04;
                    if (igSimpleImageView == null) {
                        str = "iconView";
                    } else {
                        Context context = BKF().getContext();
                        Context context2 = this.A00;
                        if (context2 == null) {
                            str = "context";
                        } else {
                            AbstractC31173DnH.A11(context, igSimpleImageView, AbstractC53242c7.A0B(context2));
                            ViewGroup viewGroup2 = this.A03;
                            if (viewGroup2 != null) {
                                FpQ.A01(viewGroup2, 47, this, g5f);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C7QD
    public final View BKF() {
        C57012jc c57012jc = this.A06;
        if (c57012jc.A04()) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            return A01;
        }
        ViewStub viewStub = c57012jc.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw AbstractC166997dE.A0g();
    }

    public G5E(C57012jc c57012jc, G1e g1e) {
        this.A06 = c57012jc;
        this.A05 = g1e;
        c57012jc.A02 = new G0Q(this, 2);
    }
}
