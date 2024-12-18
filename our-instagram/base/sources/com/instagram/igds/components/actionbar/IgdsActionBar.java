package com.instagram.igds.components.actionbar;

import X.AbstractC13620mo;
import X.AbstractC14710oj;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC25228BEl;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC53242c7;
import X.B4Z;
import X.BHX;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.C211739Zk;
import X.C3LP;
import X.C51700MsV;
import X.C51752Mtb;
import X.C51753Mtc;
import X.C51760Mtj;
import X.C5QE;
import X.InterfaceC16660sJ;
import X.JQ0;
import X.MSX;
import X.ViewOnClickListenerC35685FpK;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsActionBar extends LinearLayout {
    public C51760Mtj A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final boolean A04;
    public final View A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = AbstractC13620mo.A02(context);
        View inflate = View.inflate(context, R.layout.layout_igds_action_bar, this);
        this.A05 = inflate;
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.action_bar_title);
        this.A03 = A0e;
        this.A01 = AbstractC31171DnF.A08(inflate, R.id.action_bar_navigation_button);
        this.A02 = (LinearLayout) inflate.findViewById(R.id.action_bar_action_buttons);
        if (AbstractC14710oj.A08()) {
            AbstractC14710oj.A07(A0e.getContext(), null, A0e, C05F.A0C);
        }
    }

    private final void A00(ImageView imageView, C51700MsV c51700MsV) {
        C51753Mtc c51753Mtc = (C51753Mtc) c51700MsV.A04;
        if (c51753Mtc != null) {
            C3LP c3lp = new C3LP(AbstractC166997dE.A0L(this), c51700MsV.A01);
            int i = c51753Mtc.A01;
            Number number = (Number) c51753Mtc.A02;
            if (number != null) {
                c3lp.setLevel(number.intValue());
            } else {
                c3lp.A02(i, 1);
            }
            imageView.setActivated(true);
            imageView.setImageDrawable(c3lp);
        } else {
            imageView.setImageResource(c51700MsV.A01);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC35685FpK((InterfaceC16660sJ) c51700MsV.A07));
        Number number2 = (Number) c51700MsV.A05;
        if (number2 != null) {
            AbstractC166997dE.A18(getContext(), imageView, number2.intValue());
        }
        Context context = getContext();
        AbstractC31177DnL.A0p(context, imageView, AbstractC53242c7.A0H(context, c51700MsV.A03));
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c51700MsV.A06;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(imageView);
        }
    }

    public final void A01(C51760Mtj c51760Mtj) {
        Object obj;
        C51760Mtj c51760Mtj2;
        C211739Zk c211739Zk;
        C211739Zk c211739Zk2;
        int i;
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        List list;
        List list2;
        if (!c51760Mtj.equals(this.A00)) {
            C211739Zk c211739Zk3 = (C211739Zk) c51760Mtj.A02;
            C51760Mtj c51760Mtj3 = this.A00;
            ViewOnClickListenerC35685FpK viewOnClickListenerC35685FpK = null;
            if (c51760Mtj3 == null || !C14360o3.A0K(c211739Zk3, c51760Mtj3.A02)) {
                if (c211739Zk3 != null) {
                    TextView textView = this.A03;
                    Context A0L = AbstractC166997dE.A0L(this);
                    textView.setText(BHX.A00(A0L, (C5QE) c211739Zk3.A05));
                    textView.setVisibility(0);
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c211739Zk3.A01;
                    if (interfaceC16660sJ != null) {
                        viewOnClickListenerC35685FpK = new ViewOnClickListenerC35685FpK(interfaceC16660sJ);
                    }
                    textView.setOnClickListener(viewOnClickListenerC35685FpK);
                    Number number = (Number) c211739Zk3.A00;
                    boolean z = c211739Zk3.A02;
                    C51760Mtj c51760Mtj4 = this.A00;
                    if (c51760Mtj4 != null && (c211739Zk2 = (C211739Zk) c51760Mtj4.A02) != null) {
                        obj = c211739Zk2.A00;
                    } else {
                        obj = null;
                    }
                    if (!C14360o3.A0K(number, obj) || (c51760Mtj2 = this.A00) == null || (c211739Zk = (C211739Zk) c51760Mtj2.A02) == null || z != c211739Zk.A02) {
                        if (number != null) {
                            Drawable A07 = MSX.A07(A0L, number);
                            if (A07 != null) {
                                AbstractC25231BEo.A0x(A0L, A07, AbstractC53242c7.A0H(A0L, R.attr.igds_color_primary_icon));
                                if (z) {
                                    C3LP c3lp = new C3LP(A0L, A07, 12);
                                    textView.setActivated(true);
                                    c3lp.A06 = true;
                                    c3lp.A02(R.attr.igds_color_icon_badge, 14);
                                    A07 = c3lp;
                                }
                                Drawable drawable = null;
                                if (this.A04) {
                                    drawable = A07;
                                    A07 = null;
                                }
                                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, A07, (Drawable) null);
                            }
                            if (z) {
                                AbstractC25228BEl.A1P(c211739Zk3.A04);
                            }
                        } else {
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                } else {
                    this.A03.setVisibility(8);
                }
            }
            C51752Mtb c51752Mtb = (C51752Mtb) c51760Mtj.A01;
            C51760Mtj c51760Mtj5 = this.A00;
            if (c51760Mtj5 == null || !C14360o3.A0K(c51752Mtb, c51760Mtj5.A01)) {
                ImageView imageView = this.A01;
                if (c51752Mtb != null) {
                    imageView.setImageResource(c51752Mtb.A01);
                    Context context = getContext();
                    AbstractC166997dE.A18(context, imageView, c51752Mtb.A00);
                    AbstractC31173DnH.A11(context, imageView, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
                    imageView.setOnClickListener(new ViewOnClickListenerC35685FpK(c51752Mtb, 68));
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
            List<C51700MsV> list3 = (List) c51760Mtj.A00;
            C51760Mtj c51760Mtj6 = this.A00;
            if (c51760Mtj6 != null) {
                obj2 = c51760Mtj6.A00;
            } else {
                obj2 = null;
            }
            if (!C14360o3.A0K(list3, obj2)) {
                LinearLayout linearLayout = this.A02;
                if (list3.size() == linearLayout.getChildCount()) {
                    ArrayList A0i = AbstractC167007dF.A0i(list3);
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        AbstractC166997dE.A1W(A0i, ((C51700MsV) it.next()).A02);
                    }
                    C51760Mtj c51760Mtj7 = this.A00;
                    if (c51760Mtj7 != null && (list2 = (List) c51760Mtj7.A00) != null) {
                        arrayList = AbstractC167007dF.A0i(list2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            AbstractC166997dE.A1W(arrayList, ((C51700MsV) it2.next()).A02);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (A0i.equals(arrayList)) {
                        int i2 = 0;
                        for (Object obj4 : list3) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC16960so.A1U();
                                throw C00O.createAndThrow();
                            }
                            C51700MsV c51700MsV = (C51700MsV) obj4;
                            C51760Mtj c51760Mtj8 = this.A00;
                            if (c51760Mtj8 != null && (list = (List) c51760Mtj8.A00) != null) {
                                obj3 = list.get(i2);
                            } else {
                                obj3 = null;
                            }
                            if (!C14360o3.A0K(c51700MsV, obj3)) {
                                View childAt = linearLayout.getChildAt(i2);
                                if (c51700MsV != null && c51700MsV.A00 == 1) {
                                    C14360o3.A0C(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                                    A00((ImageView) childAt, c51700MsV);
                                } else {
                                    throw B4Z.A00();
                                }
                            }
                            i2 = i3;
                        }
                    }
                }
                linearLayout.removeAllViews();
                for (C51700MsV c51700MsV2 : list3) {
                    if (c51700MsV2 != null && c51700MsV2.A00 == 1) {
                        Context context2 = getContext();
                        ImageView imageView2 = new ImageView(context2);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        C14360o3.A07(context2);
                        int A01 = MSX.A01(context2);
                        int A0C = AbstractC166987dD.A0C(context2, 16);
                        imageView2.setPaddingRelative(A01, A0C, A01, A0C);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 80;
                        imageView2.setLayoutParams(layoutParams);
                        linearLayout.addView(imageView2);
                        A00(imageView2, c51700MsV2);
                    } else {
                        throw B4Z.A00();
                    }
                }
            }
            this.A00 = c51760Mtj;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsActionBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ IgdsActionBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
