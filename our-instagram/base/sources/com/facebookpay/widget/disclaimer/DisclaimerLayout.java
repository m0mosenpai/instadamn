package com.facebookpay.widget.disclaimer;

import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC65702TsY;
import X.AbstractC68349VNj;
import X.AbstractC70177WFc;
import X.AnonymousClass013;
import X.C00O;
import X.C05F;
import X.C0YR;
import X.C14360o3;
import X.C2FP;
import X.InterfaceC16530ry;
import X.MSX;
import X.VCW;
import X.VEP;
import X.X6J;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.accessibility.AccessibleTextView;

/* loaded from: classes11.dex */
public final class DisclaimerLayout extends LinearLayout {
    public static final /* synthetic */ C0YR[] A0A = {new AnonymousClass013(DisclaimerLayout.class, "primaryText", "getPrimaryText()Ljava/lang/String;", 0), new AnonymousClass013(DisclaimerLayout.class, "primaryLinkableText", "getPrimaryLinkableText()Ljava/lang/CharSequence;", 0), new AnonymousClass013(DisclaimerLayout.class, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;", 0), new AnonymousClass013(DisclaimerLayout.class, "disclaimerType", "getDisclaimerType()Lcom/facebookpay/widget/disclaimer/DisclaimerWidgetStyleType;", 0)};
    public View A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public AccessibleTextView A05;
    public final InterfaceC16530ry A06;
    public final InterfaceC16530ry A07;
    public final InterfaceC16530ry A08;
    public final InterfaceC16530ry A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = new X6J(this, 26);
        this.A07 = new X6J(this, 27);
        VEP vep = VEP.A14;
        this.A09 = new X6J(28, this, vep);
        this.A06 = new X6J(29, this, VCW.A02);
        View inflate = View.inflate(context, R.layout.fbpay_ui_disclaimer, this);
        this.A00 = inflate;
        if (inflate == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        ((LinearLayout) inflate).setOrientation(1);
        setPrimaryTextView((AccessibleTextView) findViewById(R.id.disclaimer_ui_primary_text));
        this.A01 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_1);
        this.A02 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_2);
        this.A03 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_3);
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.disclaimer_ui_shimmer_view_4);
        setPrimaryTextStyle(vep);
        AbstractC70177WFc.A01(this, 2);
        ShimmerFrameLayout shimmerFrameLayout = this.A01;
        if (shimmerFrameLayout != null) {
            AbstractC70177WFc.A05(shimmerFrameLayout, R.style.FBPayUITerms_ShimmerRow, false);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 != null) {
                AbstractC70177WFc.A05(shimmerFrameLayout2, R.style.FBPayUITerms_ShimmerRow, false);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A03;
                if (shimmerFrameLayout3 != null) {
                    AbstractC70177WFc.A05(shimmerFrameLayout3, R.style.FBPayUITerms_ShimmerRow, false);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A04;
                    if (shimmerFrameLayout4 != null) {
                        AbstractC70177WFc.A05(shimmerFrameLayout4, R.style.FBPayUITerms_ShimmerRow, false);
                        ShimmerFrameLayout shimmerFrameLayout5 = this.A01;
                        if (shimmerFrameLayout5 != null) {
                            C2FP.A0A();
                            Context A0L = AbstractC166997dE.A0L(this);
                            Drawable drawable = A0L.getDrawable(R.drawable.fbpay_shimmer_background);
                            if (drawable != null) {
                                C2FP.A0A();
                                AbstractC65702TsY.A0t(A0L, drawable, shimmerFrameLayout5, R.color.igds_primary_text);
                                ShimmerFrameLayout shimmerFrameLayout6 = this.A02;
                                if (shimmerFrameLayout6 != null) {
                                    C2FP.A0A();
                                    Drawable drawable2 = A0L.getDrawable(R.drawable.fbpay_shimmer_background);
                                    if (drawable2 != null) {
                                        C2FP.A0A();
                                        AbstractC65702TsY.A0t(A0L, drawable2, shimmerFrameLayout6, R.color.igds_primary_text);
                                        ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
                                        if (shimmerFrameLayout7 != null) {
                                            C2FP.A0A();
                                            Drawable drawable3 = A0L.getDrawable(R.drawable.fbpay_shimmer_background);
                                            if (drawable3 != null) {
                                                C2FP.A0A();
                                                AbstractC65702TsY.A0t(A0L, drawable3, shimmerFrameLayout7, R.color.igds_primary_text);
                                                ShimmerFrameLayout shimmerFrameLayout8 = this.A04;
                                                if (shimmerFrameLayout8 != null) {
                                                    C2FP.A0A();
                                                    Drawable drawable4 = A0L.getDrawable(R.drawable.fbpay_shimmer_background);
                                                    if (drawable4 != null) {
                                                        C2FP.A0A();
                                                        AbstractC65702TsY.A0t(A0L, drawable4, shimmerFrameLayout8, R.color.igds_primary_text);
                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
                                                        if (shimmerFrameLayout9 != null) {
                                                            AbstractC68349VNj.A00(shimmerFrameLayout9, C05F.A0Y);
                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A02;
                                                            if (shimmerFrameLayout10 != null) {
                                                                Integer num = C05F.A0C;
                                                                AbstractC68349VNj.A00(shimmerFrameLayout10, num);
                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A03;
                                                                if (shimmerFrameLayout11 != null) {
                                                                    AbstractC68349VNj.A00(shimmerFrameLayout11, num);
                                                                    ShimmerFrameLayout shimmerFrameLayout12 = this.A04;
                                                                    if (shimmerFrameLayout12 != null) {
                                                                        AbstractC68349VNj.A00(shimmerFrameLayout12, C05F.A00);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    C14360o3.A0F("shimmerRow4");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("shimmerRow3");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("shimmerRow2");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("shimmerRow1");
        throw C00O.createAndThrow();
    }

    public final void setDisclaimerType(VCW vcw) {
        C14360o3.A0B(vcw, 0);
        AbstractC31171DnF.A1S(this, vcw, this.A06, A0A, 3);
    }

    public final void setPrimaryTextStyle(VEP vep) {
        C14360o3.A0B(vep, 0);
        AbstractC31171DnF.A1S(this, vep, this.A09, A0A, 2);
    }

    public final void setPrimaryTextView(AccessibleTextView accessibleTextView) {
        C14360o3.A0B(accessibleTextView, 0);
        this.A05 = accessibleTextView;
    }

    public final VCW getDisclaimerType() {
        return (VCW) this.A06.CES(this, A0A[3]);
    }

    public final CharSequence getPrimaryLinkableText() {
        return (CharSequence) this.A07.CES(this, A0A[1]);
    }

    public final String getPrimaryText() {
        return MSX.A0j(this, this.A08, A0A, 0);
    }

    public final VEP getPrimaryTextStyle() {
        return (VEP) this.A09.CES(this, A0A[2]);
    }

    public final AccessibleTextView getPrimaryTextView() {
        AccessibleTextView accessibleTextView = this.A05;
        if (accessibleTextView != null) {
            return accessibleTextView;
        }
        C14360o3.A0F("primaryTextView");
        throw C00O.createAndThrow();
    }

    public final void setPrimaryLinkableText(CharSequence charSequence) {
        AbstractC31171DnF.A1S(this, charSequence, this.A07, A0A, 1);
    }

    public final void setPrimaryText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A08, A0A, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclaimerLayout(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
