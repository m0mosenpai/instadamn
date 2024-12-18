package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7AC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AC {
    public Context A00;
    public C7AM A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final AbstractC59962oe A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final InterfaceC56392iX A0B;
    public final C7J8 A0C;
    public final C7AE A0D;
    public final C7AB A0E;
    public final C7J6 A0F;
    public final GradientSpinnerAvatarView A0G;

    public C7AC(View view, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7AB c7ab, C7J6 c7j6) {
        Context context;
        C14360o3.A0B(view, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A08 = abstractC59962oe;
        this.A02 = view;
        this.A0A = userSession;
        this.A09 = interfaceC11380iw;
        this.A0F = c7j6;
        this.A0E = c7ab;
        this.A00 = (!C18U.A06(C06090Tz.A05, userSession, 36328959398592413L) || (context = abstractC59962oe.getContext()) == null) ? view.getContext() : context;
        View requireViewById = view.requireViewById(R.id.header_avatar);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        C14360o3.A07(requireViewById);
        this.A0G = gradientSpinnerAvatarView;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.header_faceswarm), false, false);
        this.A0B = A01;
        this.A0C = new C7J8(A01, gradientSpinnerAvatarView);
        View requireViewById2 = view.requireViewById(R.id.header_title);
        C14360o3.A07(requireViewById2);
        this.A07 = (TextView) requireViewById2;
        Context context2 = this.A00;
        C14360o3.A06(context2);
        C7AE c7ae = new C7AE(context2, userSession, new C7AD(this));
        this.A0D = c7ae;
        View requireViewById3 = view.requireViewById(R.id.header_subtitle);
        requireViewById3.setBackground(c7ae);
        this.A03 = requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.header_title_subtitle_container);
        C14360o3.A07(requireViewById4);
        this.A04 = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.header_left_button);
        C14360o3.A07(requireViewById5);
        this.A05 = (ImageView) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.header_right_buttons);
        C14360o3.A07(requireViewById6);
        this.A06 = (LinearLayout) requireViewById6;
    }

    private final void A00(View view, C7AL c7al) {
        C0fQ.A00(new ViewOnClickListenerC35567FnK(view, this, c7al), view);
        Integer num = c7al.A02.A01;
        if (num != null) {
            view.setContentDescription(this.A00.getString(num.intValue()));
        }
    }

    private final void A01(final ImageView imageView, final C7AL c7al, int i) {
        C7AK c7ak;
        C9BW c9bw = c7al.A01;
        if (c9bw != null) {
            Context context = this.A00;
            C14360o3.A06(context);
            c7ak = c7al.A02;
            C3LP c3lp = new C3LP(context, c7ak.A00);
            Number number = (Number) c9bw.A00;
            Number number2 = (Number) c9bw.A01;
            boolean z = true;
            if (number2 != null) {
                c3lp.setLevel(number2.intValue());
                imageView.setActivated(true);
            } else if (number != null) {
                c3lp.A02(number.intValue(), 1);
            } else {
                z = false;
            }
            imageView.setActivated(z);
            imageView.setImageDrawable(c3lp);
        } else {
            c7ak = c7al.A02;
            imageView.setImageResource(c7ak.A00);
        }
        C0fQ.A00(new View.OnClickListener() { // from class: X.7AP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(968472727);
                AbstractC34072F2a.A00(imageView, c7al, this.A0F);
                C0f9.A0C(1324963298, A05);
            }
        }, imageView);
        Integer num = c7ak.A01;
        if (num != null) {
            imageView.setContentDescription(this.A00.getString(num.intValue()));
        }
        imageView.setColorFilter(C3DY.A00(i));
        imageView.setAlpha(c7al.A00);
    }

    public final void A02(final C7AM c7am) {
        int i;
        C7AJ c7aj;
        Integer num;
        C7AJ c7aj2;
        C7AI c7ai;
        int i2;
        List list;
        Activity activity;
        ArrayList arrayList;
        Object obj;
        List list2;
        List list3;
        long j;
        int i3;
        float f;
        int i4;
        Spanned spanned;
        Drawable drawable;
        C7AI c7ai2;
        C7AM c7am2;
        if (!c7am.equals(this.A01)) {
            C7AM c7am3 = this.A01;
            if (c7am3 == null || (i = c7am.A00) != c7am3.A00) {
                i = c7am.A00;
                this.A02.setBackgroundColor(i);
            }
            C7AM c7am4 = this.A01;
            if (c7am4 == null || c7am.A02 != c7am4.A02) {
                this.A00 = new ContextThemeWrapper(this.A02.getContext(), c7am.A02);
            }
            C7AJ c7aj3 = c7am.A06;
            C7AM c7am5 = this.A01;
            if (c7am5 != null) {
                c7aj = c7am5.A06;
            } else {
                c7aj = null;
            }
            if (!C14360o3.A0K(c7aj3, c7aj) || (c7am2 = this.A01) == null || i != c7am2.A00 || c7am.A03 != c7am2.A03) {
                if (c7aj3.A07) {
                    this.A0C.CMM();
                } else {
                    C7J8 c7j8 = this.A0C;
                    InterfaceC11380iw interfaceC11380iw = this.A09;
                    c7j8.EkR(interfaceC11380iw);
                    UserSession userSession = this.A0A;
                    c7j8.A00(c7aj3.A00, interfaceC11380iw, userSession, this.A0F, c7aj3.A01, c7aj3.A02, c7aj3.A04, c7am.A03, i, c7aj3.A08, c7aj3.A05);
                }
                GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
                if (gradientSpinnerAvatarView.A06 == null) {
                    Integer num2 = c7aj3.A03;
                    C7AM c7am6 = this.A01;
                    LayerDrawable layerDrawable = null;
                    if (c7am6 != null && (c7aj2 = c7am6.A06) != null) {
                        num = c7aj2.A03;
                    } else {
                        num = null;
                    }
                    if (!C14360o3.A0K(num2, num)) {
                        if (num2 != null) {
                            Drawable drawable2 = gradientSpinnerAvatarView.getContext().getDrawable(AbstractC53242c7.A0H(this.A00, num2.intValue()));
                            C14360o3.A0C(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                            layerDrawable = (LayerDrawable) drawable2;
                            layerDrawable.getDrawable(0).setColorFilter(C3DY.A00(i));
                        }
                        InterfaceC56392iX interfaceC56392iX = this.A0B;
                        if (interfaceC56392iX.CWW() && c7aj3.A06) {
                            ((IgdsFaceSwarm) interfaceC56392iX.getView()).setBottomBadgeDrawable(layerDrawable);
                        } else {
                            gradientSpinnerAvatarView.setBottomBadgeDrawable(layerDrawable);
                        }
                    }
                }
                C7JA.A00(this.A08.requireActivity(), gradientSpinnerAvatarView, this.A0A, "Direct", new ArrayList(), C7J9.A00);
            }
            final C7AI c7ai3 = c7am.A07;
            C7AM c7am7 = this.A01;
            E72 e72 = null;
            if (c7am7 != null) {
                c7ai = c7am7.A07;
            } else {
                c7ai = null;
            }
            if (!C14360o3.A0K(c7ai3, c7ai)) {
                CharSequence charSequence = c7ai3.A00;
                TextView textView = this.A07;
                textView.setText(charSequence);
                textView.setTextColor(AbstractC53242c7.A0F(this.A00, R.attr.textColorPrimary));
                if (c7ai3.A02) {
                    C0fQ.A00(new View.OnClickListener() { // from class: X.7AN
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C206299Bm c206299Bm;
                            int A05 = C0f9.A05(-1618269383);
                            C7AC c7ac = C7AC.this;
                            C7J6 c7j6 = c7ac.A0F;
                            c7j6.Dso(c7ai3.A01);
                            C7AM c7am8 = c7ac.A01;
                            if (c7am8 != null && (c206299Bm = c7am8.A04) != null && c206299Bm.A07) {
                                c7j6.DsJ();
                            }
                            C0f9.A0C(143383404, A05);
                        }
                    }, this.A04);
                }
                String obj2 = charSequence.toString();
                boolean z = c7ai3.A05;
                if (c7ai3.A03) {
                    e72 = new E72(C05F.A00);
                }
                AbstractC31326Dpo.A00(textView, e72, obj2, z);
                boolean z2 = c7ai3.A04;
                C7AM c7am8 = this.A01;
                if ((c7am8 == null || (c7ai2 = c7am8.A07) == null || z2 != c7ai2.A04) && z2 && (drawable = this.A00.getDrawable(R.drawable.instagram_chevron_right_pano_outline_8)) != null) {
                    drawable.setColorFilter(C3DY.A00(AbstractC53242c7.A0F(this.A00, R.attr.glyphColorSecondary)));
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
            C206299Bm c206299Bm = c7am.A04;
            C7AM c7am9 = this.A01;
            C206299Bm c206299Bm2 = null;
            if (c7am9 != null) {
                c206299Bm2 = c7am9.A04;
            }
            if (!C14360o3.A0K(c206299Bm, c206299Bm2)) {
                if (c206299Bm != null) {
                    boolean z3 = c206299Bm.A08;
                    if (Boolean.valueOf(z3) != null && z3) {
                        this.A0E.A00();
                    }
                    List list4 = (List) c206299Bm.A04;
                    CharSequence charSequence2 = (CharSequence) c206299Bm.A05;
                    if ((list4 != null && !list4.isEmpty()) || (charSequence2 != null && charSequence2.length() != 0)) {
                        C7AE c7ae = this.A0D;
                        if (list4 == null) {
                            list4 = C16930sl.A00;
                        }
                        Map map = (Map) c206299Bm.A03;
                        Number number = (Number) c206299Bm.A06;
                        Number number2 = (Number) c206299Bm.A01;
                        Number number3 = (Number) c206299Bm.A02;
                        C14360o3.A0B(list4, 0);
                        C14360o3.A0B(map, 1);
                        if (!list4.equals(c7ae.A08) || !C14360o3.A0K(charSequence2, c7ae.A07) || !C14360o3.A0K(c7ae.A09, map)) {
                            boolean z4 = !C14360o3.A0K(charSequence2, c7ae.A07);
                            boolean z5 = c7ae.A0K;
                            List list5 = c7ae.A08;
                            if (!z5) {
                                if (z4) {
                                    c7ae.A0F.clear();
                                    c7ae.A06 = null;
                                } else {
                                    Iterator it = AbstractC001800i.A0e(list5, list4).iterator();
                                    while (it.hasNext()) {
                                        c7ae.A0F.remove(it.next());
                                    }
                                }
                            } else if (z4) {
                                c7ae.A0H.clear();
                                c7ae.A06 = null;
                                c7ae.A05 = null;
                            } else {
                                Iterator it2 = AbstractC001800i.A0e(list5, list4).iterator();
                                while (it2.hasNext()) {
                                    c7ae.A0H.remove(it2.next());
                                }
                            }
                            Iterator it3 = AbstractC06930Yk.A09(map, c7ae.A09).entrySet().iterator();
                            while (it3.hasNext()) {
                                c7ae.A0G.remove(((Map.Entry) it3.next()).getValue());
                            }
                            c7ae.A08 = list4;
                            c7ae.A09 = map;
                            if (!C14360o3.A0K(charSequence2, c7ae.A07)) {
                                c7ae.A07 = charSequence2;
                                if (charSequence2 != null) {
                                    f = c7ae.A0C.measureText(charSequence2, 0, charSequence2.length()) + ((Number) c7ae.A0I.getValue()).floatValue();
                                } else {
                                    f = 0.0f;
                                }
                                c7ae.A01 = f;
                                if (z5) {
                                    if (charSequence2 != null && charSequence2.length() != 0 && (charSequence2 instanceof Spanned) && (spanned = (Spanned) charSequence2) != null) {
                                        ImageSpan[] imageSpanArr = (ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class);
                                        C14360o3.A0A(imageSpanArr);
                                        i4 = 0;
                                        for (ImageSpan imageSpan : imageSpanArr) {
                                            i4 += imageSpan.getDrawable().getIntrinsicWidth();
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    c7ae.A01 += i4;
                                }
                                if (number != null) {
                                    int intValue = number.intValue();
                                    TextPaint textPaint = c7ae.A0C;
                                    Context context = c7ae.A0B;
                                    textPaint.setColor(context.getColor(AbstractC53242c7.A0H(context, intValue)));
                                }
                            }
                            c7ae.A03 = 0;
                            c7ae.A04 = 0;
                            if (list4.size() <= 1) {
                                c7ae.A0A.cancel();
                                c7ae.A04 = 0;
                            } else {
                                ValueAnimator valueAnimator = c7ae.A0A;
                                if (number2 != null) {
                                    j = number2.longValue();
                                } else {
                                    j = 2500;
                                }
                                valueAnimator.setDuration(j);
                                if (number3 != null) {
                                    i3 = number3.intValue();
                                } else {
                                    i3 = -1;
                                }
                                valueAnimator.setRepeatCount(i3);
                                if (c7ae.A08.size() > 1 && !valueAnimator.isRunning()) {
                                    valueAnimator.start();
                                }
                            }
                            c7ae.invalidateSelf();
                        }
                        this.A03.setVisibility(0);
                    }
                }
                this.A03.setVisibility(8);
            }
            C7AL c7al = c7am.A05;
            C7AM c7am10 = this.A01;
            if (c7am10 == null || !C14360o3.A0K(c7al, c7am10.A05)) {
                ImageView imageView = this.A05;
                if (c7al != null) {
                    C7AK c7ak = c7al.A02;
                    imageView.setImageResource(c7ak.A00);
                    C0fQ.A00(new View.OnClickListener() { // from class: X.7AO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int A05 = C0f9.A05(-1508723479);
                            int ordinal = C7AM.this.A05.A02.ordinal();
                            if (ordinal != 24) {
                                if (ordinal == 25) {
                                    this.A0F.D1n();
                                } else {
                                    IllegalStateException illegalStateException = new IllegalStateException("Invalid left button");
                                    C0f9.A0C(935718293, A05);
                                    throw illegalStateException;
                                }
                            } else {
                                this.A0F.Cys();
                            }
                            C0f9.A0C(57295655, A05);
                        }
                    }, imageView);
                    imageView.setColorFilter(C3DY.A00(c7am.A01));
                    Integer num3 = c7ak.A01;
                    if (num3 != null) {
                        imageView.setContentDescription(this.A00.getString(num3.intValue()));
                    }
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            List<C7AL> list6 = c7am.A08;
            C7AM c7am11 = this.A01;
            if (c7am11 != null) {
                list = c7am11.A08;
            } else {
                list = null;
            }
            if (!C14360o3.A0K(list6, list)) {
                LinearLayout linearLayout = this.A06;
                if (list6.size() == linearLayout.getChildCount()) {
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((C7AL) it4.next()).A02);
                    }
                    C7AM c7am12 = this.A01;
                    if (c7am12 != null && (list3 = c7am12.A08) != null) {
                        arrayList = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(((C7AL) it5.next()).A02);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList2.equals(arrayList)) {
                        int i5 = 0;
                        for (Object obj3 : list6) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                C7AL c7al2 = (C7AL) obj3;
                                C7AM c7am13 = this.A01;
                                if (c7am13 != null && (list2 = c7am13.A08) != null) {
                                    obj = list2.get(i5);
                                } else {
                                    obj = null;
                                }
                                if (!C14360o3.A0K(c7al2, obj)) {
                                    View childAt = linearLayout.getChildAt(i5);
                                    C7AK c7ak2 = c7al2.A02;
                                    if (c7ak2 != C7AK.A0N && c7ak2 != C7AK.A0M) {
                                        C14360o3.A0C(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                                        A01((ImageView) childAt, c7al2, c7am.A01);
                                    } else {
                                        C14360o3.A0A(childAt);
                                        A00(childAt, c7al2);
                                    }
                                }
                                i5 = i6;
                            } else {
                                AbstractC16960so.A1U();
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                linearLayout.removeAllViews();
                for (C7AL c7al3 : list6) {
                    C7AK c7ak3 = c7al3.A02;
                    if (c7ak3 != C7AK.A0N && c7ak3 != C7AK.A0M) {
                        ImageView imageView2 = new ImageView(this.A00);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        Context context2 = this.A00;
                        C14360o3.A06(context2);
                        int A04 = (int) AbstractC13880nE.A04(context2, 12);
                        Context context3 = this.A00;
                        C14360o3.A06(context3);
                        int A042 = (int) AbstractC13880nE.A04(context3, 16);
                        imageView2.setPaddingRelative(A04, A042, A04, A042);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 80;
                        imageView2.setLayoutParams(layoutParams);
                        linearLayout.addView(imageView2);
                        A01(imageView2, c7al3, c7am.A01);
                    } else {
                        Context context4 = this.A00;
                        C14360o3.A06(context4);
                        int i7 = c7ak3.A00;
                        Integer num4 = c7al3.A03;
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            PulsingPillButton pulsingPillButton = new PulsingPillButton(context4, null, 0);
                            pulsingPillButton.setButtonResource(i7);
                            if (intValue2 != 0) {
                                pulsingPillButton.setButtonText(intValue2);
                            }
                            pulsingPillButton.A00(context4.getColor(R.color.igds_active_badge), context4.getColor(R.color.igds_join_call_button_background_gradient_end));
                            pulsingPillButton.setPulsingEnabled(true);
                            linearLayout.addView(pulsingPillButton);
                            A00(pulsingPillButton, c7al3);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                int i8 = 0;
                if (linearLayout.getChildCount() == list6.size()) {
                    View view = null;
                    View view2 = null;
                    View view3 = null;
                    View view4 = null;
                    View view5 = null;
                    View view6 = null;
                    View view7 = null;
                    View view8 = null;
                    for (Object obj4 : list6) {
                        int i9 = i8 + 1;
                        if (i8 >= 0) {
                            switch (((C7AL) obj4).A02.ordinal()) {
                                case 0:
                                    view = linearLayout.getChildAt(i8);
                                    break;
                                case 3:
                                    view2 = linearLayout.getChildAt(i8);
                                    break;
                                case 4:
                                    view3 = linearLayout.getChildAt(i8);
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    view4 = linearLayout.getChildAt(i8);
                                    break;
                                case 14:
                                    view5 = linearLayout.getChildAt(i8);
                                    break;
                                case Process.SIGTERM /* 15 */:
                                    view6 = linearLayout.getChildAt(i8);
                                    break;
                                case 16:
                                    view7 = linearLayout.getChildAt(i8);
                                    break;
                                case 22:
                                case 23:
                                    view8 = linearLayout.getChildAt(i8);
                                    break;
                            }
                            i8 = i9;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                    this.A0F.Coo(this.A0G, view, this.A07, view2, view3, view4, view5, view6, view7, view8);
                    C7AB c7ab = this.A0E;
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        int ordinal = ((C7AL) it6.next()).A02.ordinal();
                        if (ordinal != 8) {
                            if (ordinal != 9) {
                                if (ordinal != 14) {
                                    if (ordinal == 15 && !c7ab.A01) {
                                        c7ab.A01 = true;
                                        new C28484Chc(c7ab.A03).A0B(((User) c7ab.A04.C7r().C7W().A0b.get(0)).A03.Aae());
                                    }
                                } else if (!c7ab.A00) {
                                    c7ab.A00 = true;
                                    new C28484Chc(c7ab.A03).A0A(((User) c7ab.A04.C7r().C7W().A0b.get(0)).A03.Aae());
                                }
                            } else {
                                UserSession userSession2 = c7ab.A03;
                                C7P0 c7p0 = new C7P0(c7ab.A02, userSession2);
                                User A01 = C17060sy.A01.A01(userSession2);
                                User user = (User) AbstractC001800i.A0J(c7ab.A04.C7r().BSH());
                                if (user == null) {
                                    user = A01;
                                }
                                C7P0.A01(null, C7P1.IMPRESSION, C7P2.ENTRYPOINT, c7p0, user.getId(), A01.getId());
                            }
                        } else {
                            InterfaceC163837Ux C7r = c7ab.A04.C7r();
                            String C7q = C7r.C7q();
                            List BSH = C7r.BSH();
                            if (C7q != null && BSH.size() == 1) {
                                new FPD(c7ab.A03).A00(C7q, ((User) BSH.get(0)).getId(), "persistent_menu_pano_button");
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (c7am.A09 && (activity = (Activity) AbstractC13320mI.A00(this.A00, Activity.class)) != null) {
                AbstractC56402iY.A02(activity, 0);
                AbstractC56402iY.A06(activity, AbstractC53242c7.A0L(this.A00, android.R.attr.windowLightStatusBar, true));
            }
            this.A01 = c7am;
        }
    }
}
