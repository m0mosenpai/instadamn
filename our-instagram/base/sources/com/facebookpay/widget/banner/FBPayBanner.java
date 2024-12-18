package com.facebookpay.widget.banner;

import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC70177WFc;
import X.AnonymousClass013;
import X.C00O;
import X.C0YR;
import X.C14360o3;
import X.C2FP;
import X.C70161WEa;
import X.InterfaceC16530ry;
import X.MSX;
import X.VD0;
import X.VEP;
import X.WF7;
import X.X6J;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebookpay.widget.accessibility.AccessibleTextView;

/* loaded from: classes11.dex */
public final class FBPayBanner extends FrameLayout {
    public static final /* synthetic */ C0YR[] A08 = {new AnonymousClass013(FBPayBanner.class, "primaryText", "getPrimaryText()Ljava/lang/CharSequence;", 0), new AnonymousClass013(FBPayBanner.class, "secondaryText", "getSecondaryText()Ljava/lang/CharSequence;", 0), new AnonymousClass013(FBPayBanner.class, "secondaryTextClickHint", "getSecondaryTextClickHint()Ljava/lang/String;", 0), new AnonymousClass013(FBPayBanner.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Landroid/graphics/drawable/Drawable;", 0)};
    public ImageView A00;
    public TextView A01;
    public ConstraintLayout A02;
    public AccessibleTextView A03;
    public final InterfaceC16530ry A04;
    public final InterfaceC16530ry A05;
    public final InterfaceC16530ry A06;
    public final InterfaceC16530ry A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A05 = new X6J(this, 1);
        this.A06 = new X6J(this, 2);
        this.A07 = new X6J(this, 3);
        this.A04 = new X6J(this, 4);
        View.inflate(context, R.layout.fbpay_banner, this);
        this.A00 = (ImageView) requireViewById(R.id.icon);
        this.A01 = (TextView) requireViewById(R.id.primary_text);
        this.A03 = (AccessibleTextView) requireViewById(R.id.secondary_text);
        this.A02 = (ConstraintLayout) requireViewById(R.id.banner_view_container);
        TextView textView = this.A01;
        String str = "primaryTextView";
        if (textView != null) {
            C2FP.A0A();
            AbstractC70177WFc.A05(textView, R.style.FbpayBannerPrimaryTextStyle, false);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                WF7.A02(textView2, VEP.A08);
                AccessibleTextView accessibleTextView = this.A03;
                str = "secondaryTextView";
                if (accessibleTextView != null) {
                    WF7.A02(accessibleTextView, VEP.A09);
                    AccessibleTextView accessibleTextView2 = this.A03;
                    if (accessibleTextView2 != null) {
                        accessibleTextView2.setMovementMethod(new LinkMovementMethod());
                        Context A0L = AbstractC166997dE.A0L(this);
                        ConstraintLayout constraintLayout = this.A02;
                        str = "bannerContainer";
                        if (constraintLayout != null) {
                            C70161WEa.A02(A0L, constraintLayout, VD0.A02, 59, 60);
                            ConstraintLayout constraintLayout2 = this.A02;
                            if (constraintLayout2 != null) {
                                AbstractC70177WFc.A04(constraintLayout2, 32, false);
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

    public final Drawable getIcon() {
        return (Drawable) this.A04.CES(this, A08[3]);
    }

    public final CharSequence getPrimaryText() {
        return (CharSequence) this.A05.CES(this, A08[0]);
    }

    public final CharSequence getSecondaryText() {
        return (CharSequence) this.A06.CES(this, A08[1]);
    }

    public final String getSecondaryTextClickHint() {
        return MSX.A0j(this, this.A07, A08, 2);
    }

    public final void setIcon(Drawable drawable) {
        AbstractC31171DnF.A1S(this, drawable, this.A04, A08, 3);
    }

    public final void setPrimaryText(CharSequence charSequence) {
        AbstractC31171DnF.A1S(this, charSequence, this.A05, A08, 0);
    }

    public final void setSecondaryText(CharSequence charSequence) {
        AbstractC31171DnF.A1S(this, charSequence, this.A06, A08, 1);
    }

    public final void setSecondaryTextClickHint(String str) {
        AbstractC31171DnF.A1S(this, str, this.A07, A08, 2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ConstraintLayout constraintLayout = this.A02;
        if (constraintLayout == null) {
            C14360o3.A0F("bannerContainer");
            throw C00O.createAndThrow();
        }
        constraintLayout.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FBPayBanner(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
