package com.facebookpay.widget.listcell;

import X.AbstractC001900j;
import X.AbstractC111324zv;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC43593JPy;
import X.AbstractC43594JPz;
import X.AbstractC68349VNj;
import X.AbstractC70177WFc;
import X.AnonymousClass013;
import X.C00O;
import X.C0YR;
import X.C14360o3;
import X.C2FP;
import X.C56302iJ;
import X.InterfaceC16530ry;
import X.InterfaceC71852X7k;
import X.MSX;
import X.UBV;
import X.UBW;
import X.UBX;
import X.UBY;
import X.VEP;
import X.VEV;
import X.VEW;
import X.VNH;
import X.W5t;
import X.WNV;
import X.X6I;
import X.X6J;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;

/* loaded from: classes11.dex */
public class ListCell extends FrameLayout implements InterfaceC71852X7k {
    public static final /* synthetic */ C0YR[] A0r = {new AnonymousClass013(ListCell.class, "primaryText", "getPrimaryText()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "secondaryText", "getSecondaryText()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "tertiaryText", "getTertiaryText()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "quaternaryText", "getQuaternaryText()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "tertiaryLinkableText", "getTertiaryLinkableText()Ljava/lang/CharSequence;", 0), new AnonymousClass013(ListCell.class, "quaternaryLinkableText", "getQuaternaryLinkableText()Ljava/lang/CharSequence;", 0), new AnonymousClass013(ListCell.class, "secondarySpannableText", "getSecondarySpannableText()Landroid/text/SpannableStringBuilder;", 0), new AnonymousClass013(ListCell.class, "tertiarySpannableText", "getTertiarySpannableText()Landroid/text/SpannableStringBuilder;", 0), new AnonymousClass013(ListCell.class, "secondaryTextSizePx", "getSecondaryTextSizePx()Ljava/lang/Float;", 0), new AnonymousClass013(ListCell.class, "tertiaryTextSizePx", "getTertiaryTextSizePx()Ljava/lang/Float;", 0), new AnonymousClass013(ListCell.class, "quaternaryTextSizePx", "getQuaternaryTextSizePx()Ljava/lang/Float;", 0), new AnonymousClass013(ListCell.class, "quaternaryTextVerticalSpacing", "getQuaternaryTextVerticalSpacing()Ljava/lang/Integer;", 0), new AnonymousClass013(ListCell.class, "errorText", "getErrorText()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "imageUrl", "getImageUrl()Ljava/lang/String;", 0), new AnonymousClass013(ListCell.class, "textStyle", "getTextStyle()Lcom/facebookpay/widget/listcell/ListCellTextStyle;", 0), new AnonymousClass013(ListCell.class, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;", 0), new AnonymousClass013(ListCell.class, "secondaryTextStyle", "getSecondaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;", 0), new AnonymousClass013(ListCell.class, "tertiaryTextStyle", "getTertiaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;", 0), new AnonymousClass013(ListCell.class, "isPrimaryTextLineBreaks", "isPrimaryTextLineBreaks()Z", 0), new AnonymousClass013(ListCell.class, "isSecondaryTextLineBreaks", "isSecondaryTextLineBreaks()Z", 0), new AnonymousClass013(ListCell.class, "isTertiaryTextLineBreaks", "isTertiaryTextLineBreaks()Z", 0), new AnonymousClass013(ListCell.class, "backgroundStyle", "getBackgroundStyle()Lcom/facebookpay/widget/listcell/ListCellBackgroundStyle;", 0), new AnonymousClass013(ListCell.class, "tertiaryTextOnClickListener", "getTertiaryTextOnClickListener()Landroid/view/View$OnClickListener;", 0)};
    public float A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public ShimmerFrameLayout A0K;
    public ShimmerFrameLayout A0L;
    public ComponentLoggingData A0M;
    public LoggingContext A0N;
    public UBY A0O;
    public UBW A0P;
    public UBX A0Q;
    public FrameLayout A0R;
    public FrameLayout A0S;
    public UBV A0T;
    public final InterfaceC16530ry A0U;
    public final InterfaceC16530ry A0V;
    public final InterfaceC16530ry A0W;
    public final InterfaceC16530ry A0X;
    public final InterfaceC16530ry A0Y;
    public final InterfaceC16530ry A0Z;
    public final InterfaceC16530ry A0a;
    public final InterfaceC16530ry A0b;
    public final InterfaceC16530ry A0c;
    public final InterfaceC16530ry A0d;
    public final InterfaceC16530ry A0e;
    public final InterfaceC16530ry A0f;
    public final InterfaceC16530ry A0g;
    public final InterfaceC16530ry A0h;
    public final InterfaceC16530ry A0i;
    public final InterfaceC16530ry A0j;
    public final InterfaceC16530ry A0k;
    public final InterfaceC16530ry A0l;
    public final InterfaceC16530ry A0m;
    public final InterfaceC16530ry A0n;
    public final InterfaceC16530ry A0o;
    public final InterfaceC16530ry A0p;
    public final InterfaceC16530ry A0q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C14360o3.A0B(context, 1);
        this.A0a = new X6J(this, 40);
        this.A0h = new X6J(this, 44);
        this.A0m = new X6J(this, 45);
        this.A0d = new X6J(this, 46);
        this.A0k = new X6I(1, context, this);
        this.A0c = new X6I(2, context, this);
        this.A0g = new X6J(this, 47);
        this.A0l = new X6J(this, 48);
        this.A0i = new X6J(this, 49);
        this.A0o = new X6J(this, 30);
        this.A0e = new X6J(this, 31);
        this.A0f = new X6J(this, 32);
        this.A0V = new X6J(this, 33);
        this.A0W = new X6J(this, 34);
        this.A0q = new X6J(35, this, VEW.A0O);
        this.A0b = new X6J(36, this, VEP.A0o);
        this.A0j = new X6J(37, this, VEP.A14);
        this.A0p = new X6J(38, this, VEP.A1C);
        this.A0X = new X6J(39, this, false);
        this.A0Y = new X6J(41, this, false);
        this.A0Z = new X6J(42, this, false);
        this.A0U = new X6J(43, this, VEV.A0A);
        this.A0n = new X6I(0, context, this);
        this.A00 = AbstractC43594JPz.A02(context);
        View.inflate(context, R.layout.fbpay_ui_list_cell, this);
        this.A02 = findViewById(R.id.top_divider);
        this.A0B = (ImageView) findViewById(R.id.image);
        this.A0C = (LinearLayout) findViewById(R.id.shimmer_container);
        this.A01 = findViewById(R.id.list_cell_container);
        this.A0E = (TextView) findViewById(R.id.primary_text);
        this.A0J = (ShimmerFrameLayout) findViewById(R.id.primary_shimmer_view);
        this.A0G = (TextView) findViewById(R.id.secondary_text);
        this.A0K = (ShimmerFrameLayout) findViewById(R.id.secondary_shimmer_view);
        this.A0H = (TextView) findViewById(R.id.tertiary_text);
        this.A0L = (ShimmerFrameLayout) findViewById(R.id.tertiary_shimmer_view);
        this.A0F = (TextView) findViewById(R.id.quaternary_text);
        this.A06 = (FrameLayout) findViewById(R.id.left_add_on_container);
        this.A09 = (FrameLayout) findViewById(R.id.right_add_on_container);
        this.A08 = (FrameLayout) findViewById(R.id.primary_text_add_on_container);
        this.A0D = (TextView) findViewById(R.id.error_text);
        this.A0I = (ShimmerFrameLayout) findViewById(R.id.image_shimmer);
        this.A05 = (FrameLayout) findViewById(R.id.custom_view_container);
        this.A03 = (FrameLayout) findViewById(R.id.inline_action_menu_container);
        Context context2 = getContext();
        TypedArray A00 = W5t.A00(context2, this);
        View view = this.A01;
        if (view == null) {
            str = "containerView";
        } else {
            AbstractC70177WFc.A00(A00, view, 10, R.style.FBPayUIListCellContainer);
            int resourceId = A00.getResourceId(13, R.style.FBPayUIListCellElement);
            TextView textView = this.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                AbstractC70177WFc.A05(textView, resourceId, false);
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    AbstractC70177WFc.A05(textView2, resourceId, false);
                    TextView textView3 = this.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        AbstractC70177WFc.A05(textView3, resourceId, false);
                        TextView textView4 = this.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            AbstractC70177WFc.A05(textView4, resourceId, false);
                            TextView textView5 = this.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                AbstractC70177WFc.A05(textView5, resourceId, false);
                                LinearLayout linearLayout = this.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    AbstractC70177WFc.A00(A00, linearLayout, 26, R.style.FBPayUIListShimmerContainer);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0J;
                                    if (shimmerFrameLayout == null) {
                                        str = "primaryShimmerView";
                                    } else {
                                        AbstractC70177WFc.A00(A00, shimmerFrameLayout, 28, R.style.FBPayUIListCellShimmer_Primary);
                                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
                                        if (shimmerFrameLayout2 == null) {
                                            str = "secondaryShimmerView";
                                        } else {
                                            AbstractC70177WFc.A00(A00, shimmerFrameLayout2, 29, R.style.FBPayUIListCellShimmer_Secondary);
                                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                                            if (shimmerFrameLayout3 == null) {
                                                str = "tertiaryShimmerView";
                                            } else {
                                                AbstractC70177WFc.A00(A00, shimmerFrameLayout3, 30, R.style.FBPayUIListCellShimmer_Tertiary);
                                                ImageView imageView = this.A0B;
                                                if (imageView == null) {
                                                    str = "imageView";
                                                } else {
                                                    AbstractC70177WFc.A00(A00, imageView, 16, R.style.FBPayUIListCellElement_Image);
                                                    FrameLayout frameLayout = this.A06;
                                                    if (frameLayout == null) {
                                                        str = "leftAddOnContainer";
                                                    } else {
                                                        AbstractC70177WFc.A00(A00, frameLayout, 18, R.style.FBPayUIListCellElement_AddOnContainer_Entity);
                                                        FrameLayout frameLayout2 = this.A09;
                                                        if (frameLayout2 == null) {
                                                            str = "rightAddOnContainer";
                                                        } else {
                                                            AbstractC70177WFc.A00(A00, frameLayout2, 21, R.style.FBPayUIListCellElement_AddOnContainer);
                                                            FrameLayout frameLayout3 = this.A08;
                                                            if (frameLayout3 == null) {
                                                                str = "primaryTextAddOnContainer";
                                                            } else {
                                                                AbstractC70177WFc.A00(A00, frameLayout3, 20, R.style.FBPayUIListCellElement_AddOnContainer_PrimaryText);
                                                                FrameLayout frameLayout4 = this.A03;
                                                                if (frameLayout4 == null) {
                                                                    str = "actionMenuContainer";
                                                                } else {
                                                                    AbstractC70177WFc.A00(A00, frameLayout4, 17, R.style.FBPayUIListCellElement_InlineActionMenu);
                                                                    A00.recycle();
                                                                    C2FP.A0A();
                                                                    int color = context2.getColor(R.color.igds_primary_text);
                                                                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0J;
                                                                    if (shimmerFrameLayout4 != null) {
                                                                        C2FP.A0A();
                                                                        Drawable drawable = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                        if (drawable != null) {
                                                                            drawable.setTint(color);
                                                                            shimmerFrameLayout4.setBackground(drawable);
                                                                            ShimmerFrameLayout shimmerFrameLayout5 = this.A0K;
                                                                            if (shimmerFrameLayout5 != null) {
                                                                                C2FP.A0A();
                                                                                Drawable drawable2 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                                if (drawable2 != null) {
                                                                                    drawable2.setTint(color);
                                                                                    shimmerFrameLayout5.setBackground(drawable2);
                                                                                    ShimmerFrameLayout shimmerFrameLayout6 = this.A0L;
                                                                                    if (shimmerFrameLayout6 != null) {
                                                                                        C2FP.A0A();
                                                                                        Drawable drawable3 = context2.getDrawable(R.drawable.fbpay_shimmer_background);
                                                                                        if (drawable3 != null) {
                                                                                            drawable3.setTint(color);
                                                                                            shimmerFrameLayout6.setBackground(drawable3);
                                                                                            ShimmerFrameLayout shimmerFrameLayout7 = this.A0I;
                                                                                            if (shimmerFrameLayout7 != null) {
                                                                                                C2FP.A0A();
                                                                                                Drawable drawable4 = context2.getDrawable(R.drawable.listcell_image_shimmer_background);
                                                                                                if (drawable4 != null) {
                                                                                                    drawable4.setTint(color);
                                                                                                    shimmerFrameLayout7.setBackground(drawable4);
                                                                                                    ShimmerFrameLayout shimmerFrameLayout8 = this.A0J;
                                                                                                    if (shimmerFrameLayout8 != null) {
                                                                                                        shimmerFrameLayout8.setImportantForAccessibility(2);
                                                                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A0K;
                                                                                                        if (shimmerFrameLayout9 != null) {
                                                                                                            shimmerFrameLayout9.setImportantForAccessibility(2);
                                                                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A0L;
                                                                                                            if (shimmerFrameLayout10 != null) {
                                                                                                                shimmerFrameLayout10.setImportantForAccessibility(2);
                                                                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A0I;
                                                                                                                if (shimmerFrameLayout11 != null) {
                                                                                                                    shimmerFrameLayout11.setImportantForAccessibility(2);
                                                                                                                    setImportantForAccessibility(1);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    throw new IllegalStateException("Required value was null.");
                                                                                                }
                                                                                            }
                                                                                            C14360o3.A0F("imageShimmer");
                                                                                            throw C00O.createAndThrow();
                                                                                        }
                                                                                        throw new IllegalStateException("Required value was null.");
                                                                                    }
                                                                                    C14360o3.A0F("tertiaryShimmerView");
                                                                                    throw C00O.createAndThrow();
                                                                                }
                                                                                throw new IllegalStateException("Required value was null.");
                                                                            }
                                                                            C14360o3.A0F("secondaryShimmerView");
                                                                            throw C00O.createAndThrow();
                                                                        }
                                                                        throw new IllegalStateException("Required value was null.");
                                                                    }
                                                                    C14360o3.A0F("primaryShimmerView");
                                                                    throw C00O.createAndThrow();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A09(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            C14360o3.A0F("primaryShimmerView");
            throw C00O.createAndThrow();
        }
        AbstractC68349VNj.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0A(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0K;
        if (shimmerFrameLayout == null) {
            C14360o3.A0F("secondaryShimmerView");
            throw C00O.createAndThrow();
        }
        AbstractC68349VNj.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0B(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0L;
        if (shimmerFrameLayout == null) {
            C14360o3.A0F("tertiaryShimmerView");
            throw C00O.createAndThrow();
        }
        AbstractC68349VNj.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void setBackgroundStyle(VEV vev) {
        C14360o3.A0B(vev, 0);
        AbstractC31171DnF.A1S(this, vev, this.A0U, A0r, 21);
    }

    public final void setPrimaryTextStyle(VEP vep) {
        C14360o3.A0B(vep, 0);
        AbstractC31171DnF.A1S(this, vep, this.A0b, A0r, 15);
    }

    public final void setSecondaryTextStyle(VEP vep) {
        C14360o3.A0B(vep, 0);
        AbstractC31171DnF.A1S(this, vep, this.A0j, A0r, 16);
    }

    public final void setTertiaryTextStyle(VEP vep) {
        C14360o3.A0B(vep, 0);
        AbstractC31171DnF.A1S(this, vep, this.A0p, A0r, 17);
    }

    public final void setTextStyle(VEW vew) {
        C14360o3.A0B(vew, 0);
        AbstractC31171DnF.A1S(this, vew, this.A0q, A0r, 14);
    }

    public final void A01() {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            C14360o3.A0F("rightAddOnContainer");
            throw C00O.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        C56302iJ c56302iJ = (C56302iJ) layoutParams;
        c56302iJ.A0u = R.id.primary_text;
        c56302iJ.A0F = R.id.primary_text;
    }

    public final void A02() {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            C14360o3.A0F("leftAddOnContainer");
            throw C00O.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        C56302iJ c56302iJ = (C56302iJ) layoutParams;
        c56302iJ.A0u = 0;
        c56302iJ.A0F = R.id.error_text;
    }

    public final void A03() {
        String str;
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            str = "primaryShimmerView";
        } else {
            shimmerFrameLayout.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
            if (shimmerFrameLayout2 == null) {
                str = "secondaryShimmerView";
            } else {
                shimmerFrameLayout2.setVisibility(8);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                if (shimmerFrameLayout3 == null) {
                    str = "tertiaryShimmerView";
                } else {
                    shimmerFrameLayout3.setVisibility(8);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0I;
                    if (shimmerFrameLayout4 == null) {
                        str = "imageShimmer";
                    } else {
                        shimmerFrameLayout4.setVisibility(8);
                        String imageUrl = getImageUrl();
                        if (imageUrl != null && !AbstractC001900j.A0T(imageUrl)) {
                            ImageView imageView = this.A0B;
                            if (imageView == null) {
                                str = "imageView";
                            } else {
                                imageView.setVisibility(0);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A05() {
        ShimmerFrameLayout shimmerFrameLayout = this.A0I;
        String str = "imageShimmer";
        if (shimmerFrameLayout != null) {
            AbstractC68349VNj.A00(shimmerFrameLayout, null);
            shimmerFrameLayout.setVisibility(0);
            ImageView imageView = this.A0B;
            if (imageView == null) {
                str = "imageView";
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A08(ComponentLoggingData componentLoggingData, LoggingContext loggingContext) {
        this.A0N = loggingContext;
        this.A0M = componentLoggingData;
        C2FP.A01().A03.Chz("client_load_fbpayui_init", VNH.A00(this));
    }

    public final FrameLayout getActionMenu() {
        return this.A0R;
    }

    public final VEV getBackgroundStyle() {
        return (VEV) this.A0U.CES(this, A0r[21]);
    }

    public ComponentLoggingData getComponentLoggingData() {
        return this.A0M;
    }

    public final FrameLayout getCustomView() {
        return this.A04;
    }

    public final String getErrorText() {
        return MSX.A0j(this, this.A0V, A0r, 12);
    }

    public int getFbpayWidgetStyleType() {
        return 0;
    }

    public final String getImageUrl() {
        return MSX.A0j(this, this.A0W, A0r, 13);
    }

    public final UBY getLeftAddOnIcon() {
        return this.A0O;
    }

    public final UBW getLeftAddOnText() {
        return this.A0P;
    }

    public final FrameLayout getLeftAddOnView() {
        return this.A07;
    }

    public LoggingContext getLoggingContext() {
        return this.A0N;
    }

    public final String getPrimaryText() {
        return MSX.A0j(this, this.A0a, A0r, 0);
    }

    public final FrameLayout getPrimaryTextAddOnView() {
        return this.A0S;
    }

    public final VEP getPrimaryTextStyle() {
        return (VEP) this.A0b.CES(this, A0r[15]);
    }

    public final CharSequence getQuaternaryLinkableText() {
        return (CharSequence) this.A0c.CES(this, A0r[5]);
    }

    public final String getQuaternaryText() {
        return MSX.A0j(this, this.A0d, A0r, 3);
    }

    public final Float getQuaternaryTextSizePx() {
        return (Float) this.A0e.CES(this, A0r[10]);
    }

    public final Integer getQuaternaryTextVerticalSpacing() {
        return (Integer) this.A0f.CES(this, A0r[11]);
    }

    public final UBV getRightAddOnIcon() {
        return this.A0T;
    }

    public final UBX getRightAddOnText() {
        return this.A0Q;
    }

    public final FrameLayout getRightAddOnView() {
        return this.A0A;
    }

    public final SpannableStringBuilder getSecondarySpannableText() {
        return (SpannableStringBuilder) this.A0g.CES(this, A0r[6]);
    }

    public final String getSecondaryText() {
        return MSX.A0j(this, this.A0h, A0r, 1);
    }

    public final Float getSecondaryTextSizePx() {
        return (Float) this.A0i.CES(this, A0r[8]);
    }

    public final VEP getSecondaryTextStyle() {
        return (VEP) this.A0j.CES(this, A0r[16]);
    }

    public final CharSequence getTertiaryLinkableText() {
        return (CharSequence) this.A0k.CES(this, A0r[4]);
    }

    public final SpannableStringBuilder getTertiarySpannableText() {
        return (SpannableStringBuilder) this.A0l.CES(this, A0r[7]);
    }

    public final String getTertiaryText() {
        return MSX.A0j(this, this.A0m, A0r, 2);
    }

    public final View.OnClickListener getTertiaryTextOnClickListener() {
        return (View.OnClickListener) this.A0n.CES(this, A0r[22]);
    }

    public final Float getTertiaryTextSizePx() {
        return (Float) this.A0o.CES(this, A0r[9]);
    }

    public final VEP getTertiaryTextStyle() {
        return (VEP) this.A0p.CES(this, A0r[17]);
    }

    public final VEW getTextStyle() {
        return (VEW) this.A0q.CES(this, A0r[14]);
    }

    public final void setActionMenu(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 == null) {
            C14360o3.A0F("actionMenuContainer");
            throw C00O.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A0R = frameLayout;
    }

    public final void setCustomView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A05;
        if (frameLayout2 == null) {
            C14360o3.A0F("customViewContainer");
            throw C00O.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        if (frameLayout != null) {
            AbstractC43593JPy.A1B(frameLayout, -1);
            A0C(false, true);
        }
        this.A04 = frameLayout;
    }

    public final void setErrorText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0V, A0r, 12);
    }

    public final void setImageUrl(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0W, A0r, 13);
    }

    public final void setLeftAddOnIcon(UBY uby) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            C14360o3.A0F("leftAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(uby, frameLayout);
        this.A0O = uby;
    }

    public final void setLeftAddOnText(UBW ubw) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            C14360o3.A0F("leftAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(ubw, frameLayout);
        this.A0P = ubw;
    }

    public final void setLeftAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A06;
        if (frameLayout2 == null) {
            C14360o3.A0F("leftAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A07 = frameLayout;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        WNV wnv;
        if (onClickListener != null) {
            wnv = new WNV(27, onClickListener, this);
        } else {
            wnv = null;
        }
        super.setOnClickListener(wnv);
    }

    public final void setPrimaryText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0a, A0r, 0);
    }

    public final void setPrimaryTextAddOnView(FrameLayout frameLayout) {
        String str;
        FrameLayout frameLayout2 = this.A08;
        if (frameLayout2 == null) {
            str = "primaryTextAddOnContainer";
        } else {
            A00(frameLayout, frameLayout2);
            this.A0S = frameLayout;
            if (frameLayout != null) {
                TextView textView = this.A0E;
                if (textView == null) {
                    str = "primaryTextView";
                } else {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
                    ((C56302iJ) layoutParams).A0N = -1;
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setPrimaryTextLineBreaks(boolean z) {
        AbstractC167007dF.A1L(this, this.A0X, A0r, 18, z);
    }

    public final void setQuaternaryLinkableText(CharSequence charSequence) {
        AbstractC31171DnF.A1S(this, charSequence, this.A0c, A0r, 5);
    }

    public final void setQuaternaryText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0d, A0r, 3);
    }

    public final void setQuaternaryTextSizePx(Float f) {
        AbstractC31171DnF.A1S(this, f, this.A0e, A0r, 10);
    }

    public final void setQuaternaryTextVerticalSpacing(Integer num) {
        AbstractC31171DnF.A1S(this, num, this.A0f, A0r, 11);
    }

    public final void setRightAddOnIcon(UBV ubv) {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            C14360o3.A0F("rightAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(ubv, frameLayout);
        this.A0T = ubv;
    }

    public final void setRightAddOnText(UBX ubx) {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            C14360o3.A0F("rightAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(ubx, frameLayout);
        this.A0Q = ubx;
    }

    public final void setRightAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A09;
        if (frameLayout2 == null) {
            C14360o3.A0F("rightAddOnContainer");
            throw C00O.createAndThrow();
        }
        A00(frameLayout, frameLayout2);
        this.A0A = frameLayout;
    }

    public final void setSecondarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        AbstractC31171DnF.A1S(this, spannableStringBuilder, this.A0g, A0r, 6);
    }

    public final void setSecondaryText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0h, A0r, 1);
    }

    public final void setSecondaryTextLineBreaks(boolean z) {
        AbstractC167007dF.A1L(this, this.A0Y, A0r, 19, z);
    }

    public final void setSecondaryTextSizePx(Float f) {
        AbstractC31171DnF.A1S(this, f, this.A0i, A0r, 8);
    }

    public final void setShimmerAccessibilityLabel(String str) {
        LinearLayout linearLayout = this.A0C;
        if (linearLayout == null) {
            C14360o3.A0F("shimmerContainer");
            throw C00O.createAndThrow();
        }
        linearLayout.setContentDescription(str);
    }

    public final void setTertiaryLinkableText(CharSequence charSequence) {
        AbstractC31171DnF.A1S(this, charSequence, this.A0k, A0r, 4);
    }

    public final void setTertiarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        AbstractC31171DnF.A1S(this, spannableStringBuilder, this.A0l, A0r, 7);
    }

    public final void setTertiaryText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0m, A0r, 2);
    }

    public final void setTertiaryTextLineBreaks(boolean z) {
        AbstractC167007dF.A1L(this, this.A0Z, A0r, 20, z);
    }

    public final void setTertiaryTextOnClickListener(View.OnClickListener onClickListener) {
        AbstractC31171DnF.A1S(this, onClickListener, this.A0n, A0r, 22);
    }

    public final void setTertiaryTextSizePx(Float f) {
        AbstractC31171DnF.A1S(this, f, this.A0o, A0r, 9);
    }

    public final void setTertiaryTextViewStyleRes(int i) {
        TextView textView = this.A0H;
        if (textView == null) {
            C14360o3.A0F("tertiaryTextView");
            throw C00O.createAndThrow();
        }
        AbstractC70177WFc.A05(textView, i, false);
    }

    public static final void A00(FrameLayout frameLayout, FrameLayout frameLayout2) {
        int i = 0;
        if (frameLayout2.getChildCount() > 0 && C14360o3.A0K(frameLayout2.getChildAt(0), frameLayout)) {
            return;
        }
        frameLayout2.removeAllViews();
        if (frameLayout != null) {
            frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -1));
        } else {
            i = 8;
        }
        frameLayout2.setVisibility(i);
    }

    public final void A04() {
        TypedArray A00 = W5t.A00(getContext(), this);
        View view = this.A01;
        if (view == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        AbstractC70177WFc.A05(view, A00.getResourceId(8, R.style.FBPayUIListCellContainer_ReduceVerticalMargin), false);
        A00.recycle();
    }

    public final void A06(int i, String str) {
        Context context = getContext();
        this.A00 = AbstractC31173DnH.A00(context, i);
        setImageUrl(str);
        this.A00 = AbstractC43594JPz.A02(context);
    }

    public final void A07(View view, Integer num, int i) {
        TypedArray A00 = W5t.A00(getContext(), this);
        C14360o3.A07(A00);
        if (num != null) {
            i = A00.getResourceId(num.intValue(), i);
        }
        AbstractC70177WFc.A05(view, i, false);
        A00.recycle();
    }

    public final void A0C(boolean z, boolean z2) {
        String str;
        TypedArray A00 = W5t.A00(getContext(), this);
        if (!z) {
            View view = this.A01;
            if (view == null) {
                str = "containerView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AbstractC70177WFc.A05(view, A00.getResourceId(9, R.style.FBPayUIListCellContainer_StripHorizontalMargin), false);
        }
        if (!z2) {
            int resourceId = A00.getResourceId(12, R.style.FBPayUIListCellElement_StripHorizontalMargin);
            TextView textView = this.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                AbstractC70177WFc.A05(textView, resourceId, false);
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    AbstractC70177WFc.A05(textView2, resourceId, false);
                    TextView textView3 = this.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        AbstractC70177WFc.A05(textView3, resourceId, false);
                        TextView textView4 = this.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            AbstractC70177WFc.A05(textView4, resourceId, false);
                            TextView textView5 = this.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                AbstractC70177WFc.A05(textView5, resourceId, false);
                                LinearLayout linearLayout = this.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    AbstractC70177WFc.A00(A00, linearLayout, 26, R.style.FBPayUIListShimmerContainer_StripHorizontalMargin);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0I;
                                    if (shimmerFrameLayout == null) {
                                        str = "imageShimmer";
                                    } else {
                                        AbstractC70177WFc.A00(A00, shimmerFrameLayout, 27, R.style.ListCellShimmerImage_StripHorizontalMargin);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A00.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InlineActionMenu inlineActionMenu;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A0R;
        if ((frameLayout instanceof InlineActionMenu) && (inlineActionMenu = (InlineActionMenu) frameLayout) != null) {
            TextView textView = inlineActionMenu.A01;
            String str = "editView";
            if (textView != null) {
                if (textView.getVisibility() == 0) {
                    TextView textView2 = inlineActionMenu.A01;
                    if (textView2 != null) {
                        AbstractC70177WFc.A03(textView2, inlineActionMenu.A04, this);
                    }
                }
                TextView textView3 = inlineActionMenu.A02;
                str = "removeView";
                if (textView3 != null) {
                    if (textView3.getVisibility() == 0) {
                        AbstractC70177WFc.A03(textView3, inlineActionMenu.A04, this);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public void setComponentLoggingData(ComponentLoggingData componentLoggingData) {
        this.A0M = componentLoggingData;
    }

    public void setLoggingContext(LoggingContext loggingContext) {
        this.A0N = loggingContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
