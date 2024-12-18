package com.facebook.wearable.mediastream.layouts;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC50523MSb;
import X.AbstractC54520O6x;
import X.AbstractC55922hc;
import X.C00O;
import X.C14360o3;
import X.C52049N1a;
import X.C52050N1b;
import X.C52051N1c;
import X.C52052N1d;
import X.C52053N1e;
import X.C52054N1f;
import X.C52055N1g;
import X.C52056N1h;
import X.C52057N1i;
import X.C52059N1k;
import X.C52060N1l;
import X.C52061N1m;
import X.C52062N1n;
import X.C52063N1o;
import X.C52066N1r;
import X.JQ0;
import X.MSZ;
import X.N1T;
import X.N1V;
import X.N1W;
import X.N1X;
import X.N1Y;
import X.N1Z;
import X.OW2;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class StatusIndicator extends RelativeLayout {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public LinearLayout A05;
    public boolean A06;
    public int A07;
    public int A08;
    public GradientDrawable A09;
    public View A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final View A0H;
    public final ImageView A0I;
    public final ImageView A0J;
    public final ImageView A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final TextView A0N;
    public final OW2 A0O;
    public final String A0P;
    public final float A0Q;
    public final int A0R;
    public final int A0S;
    public final ImageView A0T;
    public final ImageView A0U;
    public final ImageView A0V;
    public final ImageView A0W;
    public final ImageView A0X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.status_indicator_view, this);
        C14360o3.A07(inflate);
        this.A0H = inflate;
        this.A05 = (LinearLayout) AbstractC166997dE.A0R(this, R.id.sup_toggle_status_indicator_information);
        this.A0E = true;
        this.A0N = AbstractC167007dF.A0N(this, R.id.status_text);
        this.A0W = AbstractC31176DnK.A0D(this, R.id.status_dividing_line);
        this.A0M = AbstractC167007dF.A0N(this, R.id.status_additional_text);
        Resources resources = getResources();
        this.A0P = AbstractC166997dE.A0q(resources, R.string.res_0x7f13010f_name_removed);
        this.A06 = true;
        this.A08 = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A07 = context.getColor(R.color.sup_toggle_background);
        this.A0Q = AbstractC166987dD.A04(inflate.getResources(), R.dimen.challenge_sticker_v2_facepile_offsetX);
        this.A0S = AbstractC166997dE.A07(resources);
        this.A0R = context.getColor(R.color.sup_status_warning);
        this.A01 = context.getColor(R.color.sup_status_error);
        this.A00 = context.getColor(R.color.primary_text_disabled_material_dark);
        this.A0G = context.getColor(R.color.abc_decor_view_status_guard_light);
        this.A0K = AbstractC31176DnK.A0D(this, R.id.error_icon);
        this.A0V = AbstractC31176DnK.A0D(this, R.id.thermal_mid_icon);
        this.A0U = AbstractC31176DnK.A0D(this, R.id.thermal_high_icon);
        this.A0I = AbstractC31176DnK.A0D(this, R.id.bluetooth_icon);
        this.A0O = new OW2(AbstractC166997dE.A0S(inflate, R.id.wifi_icon));
        this.A0X = AbstractC31176DnK.A0D(this, R.id.wifi_disconnected_icon);
        this.A0J = AbstractC31176DnK.A0D(this, R.id.battery_icon);
        this.A02 = context.getDrawable(R.drawable.battery_full_icon);
        this.A04 = context.getDrawable(R.drawable.battery_mid_icon);
        this.A03 = context.getDrawable(R.drawable.battery_low_icon);
        this.A0T = AbstractC31176DnK.A0D(this, R.id.battery_zero_icon);
        this.A0L = AbstractC167007dF.A0N(this, R.id.battery_percent_textview);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2F);
        try {
            this.A0E = obtainStyledAttributes.getBoolean(1, true);
            this.A06 = obtainStyledAttributes.getBoolean(0, true);
            this.A00 = obtainStyledAttributes.getColor(8, this.A00);
            this.A01 = obtainStyledAttributes.getColor(9, this.A01);
            this.A02 = obtainStyledAttributes.getDrawable(5);
            this.A04 = obtainStyledAttributes.getDrawable(7);
            this.A03 = obtainStyledAttributes.getDrawable(6);
            this.A0F = obtainStyledAttributes.getBoolean(2, false);
            this.A08 = obtainStyledAttributes.getDimensionPixelSize(4, this.A08);
            this.A07 = obtainStyledAttributes.getColor(3, this.A07);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.View] */
    public final void A05(AbstractC54520O6x abstractC54520O6x, boolean z) {
        TextView textView;
        int i;
        KeyEvent.Callback callback;
        TextView textView2;
        TextView textView3;
        int i2;
        ImageView imageView;
        int i3;
        ImageView imageView2;
        A01(this);
        if (abstractC54520O6x instanceof C52051N1c) {
            if (!z) {
                this.A0I.setColorFilter(this.A01, PorterDuff.Mode.SRC_IN);
            }
            A02(this, true, z, true);
            textView = this.A0N;
            i = R.string.res_0x7f130117_name_removed;
        } else {
            if (abstractC54520O6x instanceof C52057N1i) {
                if (z) {
                    OW2 ow2 = this.A0O;
                    ow2.A05.clearColorFilter();
                    ow2.A04.clearColorFilter();
                    ow2.A03.setColorFilter(ow2.A00);
                } else {
                    this.A0I.setColorFilter(this.A0R, PorterDuff.Mode.SRC_IN);
                }
                A02(this, true, z, false);
                A00(this.A0N, this, Integer.valueOf(R.string.res_0x7f130124_name_removed), true, false);
                textView3 = this.A0M;
                i2 = R.string.res_0x7f130116_name_removed;
            } else {
                if (abstractC54520O6x instanceof C52066N1r) {
                    if (z) {
                        this.A0O.A01();
                    }
                } else if (abstractC54520O6x instanceof C52063N1o) {
                    this.A0T.setVisibility(0);
                    textView = this.A0N;
                    i = R.string.res_0x7f130129_name_removed;
                } else {
                    if (abstractC54520O6x instanceof N1T) {
                        this.A0J.setVisibility(0);
                        A00(this.A0N, this, Integer.valueOf(R.string.res_0x7f130118_name_removed), true, false);
                        callback = this.A0L;
                    } else if (abstractC54520O6x instanceof N1Z) {
                        this.A0U.setVisibility(0);
                        textView = this.A0N;
                        i = R.string.res_0x7f130110_name_removed;
                    } else if (abstractC54520O6x instanceof C52049N1a) {
                        this.A0V.setVisibility(0);
                        textView = this.A0N;
                        i = R.string.res_0x7f130112_name_removed;
                    } else {
                        if (abstractC54520O6x instanceof N1Y) {
                            imageView = this.A0K;
                            i3 = this.A0R;
                        } else if (abstractC54520O6x instanceof N1X) {
                            imageView = this.A0K;
                            i3 = this.A01;
                        } else {
                            if (abstractC54520O6x instanceof C52059N1k) {
                                ImageView imageView3 = this.A0K;
                                imageView3.setColorFilter(this.A01, PorterDuff.Mode.SRC_IN);
                                A00(this.A0N, this, Integer.valueOf(R.string.res_0x7f130127_name_removed), true, false);
                                imageView2 = imageView3;
                            } else if (abstractC54520O6x instanceof N1W) {
                                AbstractC50523MSb.A1D(this);
                                textView = this.A0N;
                                i = R.string.res_0x7f13010c_name_removed;
                            } else if (!(abstractC54520O6x instanceof C52056N1h) && !(abstractC54520O6x instanceof C52055N1g)) {
                                if (abstractC54520O6x instanceof N1V) {
                                    ImageView imageView4 = this.A0K;
                                    imageView4.setColorFilter(this.A0R, PorterDuff.Mode.SRC_IN);
                                    A00(this.A0N, this, Integer.valueOf(R.string.res_0x7f1300fc_name_removed), true, false);
                                    A00(this.A0M, this, Integer.valueOf(R.string.res_0x7f130116_name_removed), true, true);
                                    imageView2 = imageView4;
                                } else if (abstractC54520O6x instanceof C52061N1m) {
                                    AbstractC50523MSb.A1D(this);
                                    textView = this.A0N;
                                    i = R.string.res_0x7f130128_name_removed;
                                } else {
                                    if (abstractC54520O6x instanceof C52054N1f) {
                                        AbstractC50523MSb.A1D(this);
                                        textView2 = this.A0N;
                                        MSZ.A11(this.A0H.getResources(), textView2, "Meta View", R.string.res_0x7f13011a_name_removed);
                                    } else if (abstractC54520O6x instanceof C52052N1d) {
                                        AbstractC50523MSb.A1D(this);
                                        Context context = getContext();
                                        String A0p = AbstractC166997dE.A0p(context.getApplicationContext(), ((PackageItemInfo) context.getApplicationContext().getApplicationInfo()).labelRes);
                                        textView2 = this.A0N;
                                        MSZ.A11(this.A0H.getResources(), textView2, A0p, R.string.res_0x7f1300f3_name_removed);
                                    } else if (abstractC54520O6x instanceof C52053N1e) {
                                        AbstractC50523MSb.A1D(this);
                                        A00(this.A0N, this, Integer.valueOf(R.string.res_0x7f130111_name_removed), true, false);
                                        TextView textView4 = this.A0M;
                                        MSZ.A11(this.A0H.getResources(), textView4, "Meta View", R.string.res_0x7f130119_name_removed);
                                        textView4.setVisibility(0);
                                        callback = this.A0W;
                                    } else if (abstractC54520O6x instanceof C52062N1n) {
                                        AbstractC50523MSb.A1D(this);
                                        textView = this.A0N;
                                        i = R.string.res_0x7f130149_name_removed;
                                    } else if (abstractC54520O6x instanceof C52050N1b) {
                                        AbstractC50523MSb.A1D(this);
                                        textView = this.A0N;
                                        i = R.string.res_0x7f130144_name_removed;
                                    } else if (abstractC54520O6x instanceof C52060N1l) {
                                        AbstractC50523MSb.A1D(this);
                                        textView = this.A0N;
                                        i = R.string.res_0x7f130143_name_removed;
                                    } else {
                                        if (z) {
                                            this.A0O.A01();
                                        } else {
                                            this.A0I.setColorFilter(this.A0G, PorterDuff.Mode.SRC_IN);
                                        }
                                        if (!C14360o3.A0K(this.A0M.getText(), this.A0P) || this.A06) {
                                            this.A0J.setVisibility(0);
                                        }
                                        A03();
                                    }
                                    textView2.setVisibility(0);
                                    textView3 = this.A0M;
                                    i2 = R.string.res_0x7f1300f2_name_removed;
                                }
                            } else {
                                AbstractC50523MSb.A1D(this);
                                textView = this.A0N;
                                i = R.string.res_0x7f13010d_name_removed;
                            }
                            imageView2.setVisibility(0);
                            A03();
                        }
                        imageView.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                        imageView.setVisibility(0);
                        textView = this.A0N;
                        i = R.string.res_0x7f13010e_name_removed;
                    }
                    imageView2 = (View) callback;
                    imageView2.setVisibility(0);
                    A03();
                }
                A02(this, true, z, false);
                A03();
            }
            A00(textView3, this, Integer.valueOf(i2), true, true);
            A03();
        }
        A00(textView, this, Integer.valueOf(i), true, false);
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.widget.TextView r1, com.facebook.wearable.mediastream.layouts.StatusIndicator r2, java.lang.Integer r3, boolean r4, boolean r5) {
        /*
            if (r3 == 0) goto L1d
            int r0 = r3.intValue()
            r1.setText(r0)
        L9:
            int r0 = X.AbstractC167007dF.A05(r4)
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A0W
            if (r5 == 0) goto L17
            r0 = 0
            if (r4 != 0) goto L19
        L17:
            r0 = 8
        L19:
            r1.setVisibility(r0)
            return
        L1d:
            java.lang.String r0 = ""
            r1.setText(r0)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.layouts.StatusIndicator.A00(android.widget.TextView, com.facebook.wearable.mediastream.layouts.StatusIndicator, java.lang.Integer, boolean, boolean):void");
    }

    public static final void A01(StatusIndicator statusIndicator) {
        statusIndicator.A0V.setVisibility(8);
        statusIndicator.A0U.setVisibility(8);
        statusIndicator.A0I.setVisibility(8);
        statusIndicator.A0O.A02.setVisibility(8);
        statusIndicator.A0X.setVisibility(8);
        statusIndicator.A0J.setVisibility(8);
        statusIndicator.A0T.setVisibility(8);
        statusIndicator.A0K.setVisibility(8);
        statusIndicator.A0L.setVisibility(8);
        statusIndicator.A0N.setVisibility(8);
        TextView textView = statusIndicator.A0M;
        if (!C14360o3.A0K(textView.getText(), statusIndicator.A0P)) {
            textView.setVisibility(8);
        } else if (statusIndicator.A06) {
            return;
        }
        statusIndicator.A0W.setVisibility(8);
    }

    public static final void A02(StatusIndicator statusIndicator, boolean z, boolean z2, boolean z3) {
        View view;
        if (z2) {
            view = statusIndicator.A0O.A02;
            if (z3) {
                view.setVisibility(8);
                view = statusIndicator.A0X;
            }
        } else {
            view = statusIndicator.A0I;
        }
        view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public static /* synthetic */ void setConnectionIconVisibility$default(StatusIndicator statusIndicator, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        A02(statusIndicator, z, z2, z3);
    }

    private final void setStatusIndicatorCollapsedOutlineColor(int i) {
        boolean z = this.A0F;
        GradientDrawable gradientDrawable = this.A09;
        if (z) {
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return;
            }
        } else if (gradientDrawable != null) {
            gradientDrawable.setStroke(this.A08, i);
            return;
        }
        C14360o3.A0F("statusIndicatorCollapsedOutlineDrawable");
        throw C00O.createAndThrow();
    }

    public static /* synthetic */ void setTextAndVisibility$default(StatusIndicator statusIndicator, TextView textView, Integer num, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        A00(textView, statusIndicator, num, z, z2);
    }

    public final void A03() {
        LinearLayout linearLayout = this.A05;
        linearLayout.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = linearLayout.getMeasuredHeight();
        layoutParams.width = linearLayout.getMeasuredWidth();
    }

    public final void A04(AbstractC54520O6x abstractC54520O6x, boolean z) {
        String str;
        int i;
        ImageView imageView;
        setVisibility(8);
        if (this.A0E) {
            if (z) {
                imageView = this.A0D;
                if (imageView == null) {
                    str = "statusIndicatorRightArrow";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                imageView.setVisibility(8);
            } else {
                imageView = this.A0C;
                if (imageView == null) {
                    str = "statusIndicatorLeftArrow";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                imageView.setVisibility(8);
            }
        }
        int intValue = abstractC54520O6x.A01.intValue();
        str = "statusIndicatorCollapsedOutline";
        if (intValue != 1) {
            if (intValue != 2) {
                ImageView imageView2 = this.A0B;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            i = this.A01;
        } else {
            i = this.A0R;
        }
        setStatusIndicatorCollapsedOutlineColor(i);
        ImageView imageView3 = this.A0B;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.AbstractC54520O6x r4, boolean r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            android.widget.ImageView r1 = r3.A0B
            if (r1 != 0) goto Le
            java.lang.String r2 = "statusIndicatorCollapsedOutline"
        L6:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            r0 = 8
            r1.setVisibility(r0)
            r1 = 0
            if (r5 == 0) goto L4f
            float r0 = r3.A0Q
        L18:
            r3.setTranslationY(r0)
            if (r4 == 0) goto L20
            r3.A05(r4, r7)
        L20:
            r3.A03()
            boolean r0 = r3.A0E
            if (r0 == 0) goto L3e
            if (r6 == 0) goto L3f
            android.widget.ImageView r0 = r3.A0D
            java.lang.String r2 = "statusIndicatorRightArrow"
            if (r0 == 0) goto L6
            if (r5 == 0) goto L33
            float r1 = r3.A0Q
        L33:
            r0.setTranslationY(r1)
            android.widget.ImageView r1 = r3.A0D
        L38:
            if (r1 == 0) goto L6
            r0 = 0
            r1.setVisibility(r0)
        L3e:
            return
        L3f:
            android.widget.ImageView r0 = r3.A0C
            java.lang.String r2 = "statusIndicatorLeftArrow"
            if (r0 == 0) goto L6
            if (r5 == 0) goto L49
            float r1 = r3.A0Q
        L49:
            r0.setTranslationY(r1)
            android.widget.ImageView r1 = r3.A0C
            goto L38
        L4f:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.layouts.StatusIndicator.A06(X.O6x, boolean, boolean, boolean):void");
    }

    public final View getParentView() {
        return this.A0A;
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        Integer num;
        TextView textView = this.A0M;
        if (z) {
            num = Integer.valueOf(R.string.res_0x7f13010f_name_removed);
        } else {
            num = null;
        }
        A00(textView, this, num, z, true);
    }

    public final void setParentView(View view) {
        this.A0A = view;
        if (view != null) {
            this.A0D = AbstractC31173DnH.A0I(view, R.id.status_indicator_right_arrow);
            this.A0C = AbstractC31173DnH.A0I(view, R.id.status_indicator_left_arrow);
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.status_indicator_collapsed_outline);
            this.A0B = A0I;
            if (A0I == null) {
                C14360o3.A0F("statusIndicatorCollapsedOutline");
                throw C00O.createAndThrow();
            }
            Drawable drawable = A0I.getDrawable();
            C14360o3.A0C(drawable, AbstractC111324zv.A00(27));
            this.A09 = (GradientDrawable) drawable;
        }
    }

    public final void setStatusIndicatorCollapsedStrokeColor(boolean z) {
        int i;
        if (this.A0F) {
            GradientDrawable gradientDrawable = this.A09;
            if (gradientDrawable == null) {
                C14360o3.A0F("statusIndicatorCollapsedOutlineDrawable");
                throw C00O.createAndThrow();
            }
            int i2 = this.A08;
            if (z) {
                i = this.A0G;
            } else {
                i = this.A07;
            }
            gradientDrawable.setStroke(i2, i);
        }
    }

    public final void setConnected(boolean z) {
        A03();
        if (z) {
            OW2 ow2 = this.A0O;
            ow2.A01.pause();
            ow2.A05.clearColorFilter();
            ImageView imageView = ow2.A04;
            int i = ow2.A00;
            imageView.setColorFilter(i);
            ow2.A03.setColorFilter(i);
        }
    }

    public final void setIndicatorSide(boolean z) {
        int i;
        String str;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(z ? 1 : 0);
        int i2 = 16;
        if (z) {
            i2 = 17;
        }
        layoutParams2.removeRule(i2);
        int i3 = 0;
        if (this.A0E) {
            if (z) {
                ImageView imageView = this.A0D;
                str = "statusIndicatorRightArrow";
                if (imageView != null) {
                    layoutParams2.addRule(0, imageView.getId());
                    ImageView imageView2 = this.A0D;
                    if (imageView2 != null) {
                        layoutParams2.addRule(16, imageView2.getId());
                    }
                }
                C14360o3.A0F(str);
            } else {
                ImageView imageView3 = this.A0C;
                str = "statusIndicatorLeftArrow";
                if (imageView3 != null) {
                    layoutParams2.addRule(1, imageView3.getId());
                    ImageView imageView4 = this.A0C;
                    if (imageView4 != null) {
                        layoutParams2.addRule(17, imageView4.getId());
                    }
                }
                C14360o3.A0F(str);
            }
            throw C00O.createAndThrow();
        }
        LinearLayout linearLayout = this.A05;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        C14360o3.A0C(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        int i4 = 20;
        int i5 = 21;
        if (z) {
            i5 = 20;
        }
        layoutParams4.removeRule(i5);
        if (z) {
            i4 = 21;
        }
        layoutParams4.addRule(i4);
        linearLayout.setLayoutParams(layoutParams4);
        ImageView imageView5 = this.A0B;
        if (imageView5 != null) {
            ViewGroup.MarginLayoutParams A08 = AbstractC31175DnJ.A08(imageView5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            if (z) {
                i = 0;
            } else {
                i = this.A0S;
            }
            A08.setMarginStart(i);
            if (z) {
                i3 = this.A0S;
            }
            A08.setMarginEnd(i3);
            ImageView imageView6 = this.A0B;
            if (imageView6 != null) {
                imageView6.setLayoutParams(A08);
                A03();
                return;
            }
        }
        C14360o3.A0F("statusIndicatorCollapsedOutline");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusIndicator(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ StatusIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
