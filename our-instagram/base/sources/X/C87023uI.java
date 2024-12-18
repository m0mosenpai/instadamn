package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.BulletAwareTextView;
import com.instagram.feed.ui.text.IgLikeTextView;

/* renamed from: X.3uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87023uI extends AbstractC85803s9 {
    public final UserSession A00;
    public final InterfaceC87013uH A01;
    public final C57332k8 A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87023uI(Context context, UserSession userSession, InterfaceC87013uH interfaceC87013uH, C57332k8 c57332k8, String str, boolean z) {
        super(context);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c57332k8, 4);
        C14360o3.A0B(interfaceC87013uH, 5);
        this.A03 = str;
        this.A00 = userSession;
        this.A02 = c57332k8;
        this.A01 = interfaceC87013uH;
        this.A04 = z;
    }

    /* JADX WARN: Type inference failed for: r20v0, types: [X.0ps, java.lang.Object] */
    public final void A06(Context context, C87183ub c87183ub, C81323k2 c81323k2, C75113Zb c75113Zb) {
        int i;
        InterfaceC16660sJ interfaceC16660sJ;
        IgLikeTextView igLikeTextView;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c87183ub, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c81323k2, 3);
        C77143d0 A01 = C77143d0.A0E.A01(context);
        C14360o3.A0B(A01, 4);
        ?? obj = new Object();
        boolean z = c87183ub.A07;
        if (!z) {
            obj.A00 = ((InterfaceC16660sJ) c87183ub.A00.A06).invoke(c81323k2.A00());
            AbstractC77703du.A05(c81323k2.A00(), EnumC77673dr.A0A);
        }
        C75113Zb c75113Zb2 = c81323k2.A01;
        if (c75113Zb2 != null && c75113Zb2 != c75113Zb) {
            c75113Zb2.A0M(c81323k2, null, true);
        }
        if (this.A04) {
            AbstractC56932jR.A04(c81323k2.A05, 4);
        }
        c81323k2.A04 = c87183ub.A06;
        c81323k2.A01 = c75113Zb;
        AbstractC13880nE.A0d(c81323k2.A05, 0);
        C206289Bl c206289Bl = c87183ub.A00;
        InterfaceC87203ud interfaceC87203ud = (InterfaceC87203ud) ((InterfaceC16660sJ) c206289Bl.A02).invoke(context);
        if (interfaceC87203ud instanceof C87213ue) {
            BulletAwareTextView bulletAwareTextView = c81323k2.A02;
            if (bulletAwareTextView == null) {
                View inflate = c81323k2.A06.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView");
                bulletAwareTextView = (BulletAwareTextView) inflate;
                c81323k2.A02 = bulletAwareTextView;
                if (bulletAwareTextView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            bulletAwareTextView.setText(((C87213ue) interfaceC87203ud).A00);
            bulletAwareTextView.setVisibility(0);
            bulletAwareTextView.setMovementMethod(LinkMovementMethod.getInstance());
            C0fQ.A00(new ViewOnClickListenerC23212AQw(c87183ub), bulletAwareTextView);
        } else if (C14360o3.A0K(interfaceC87203ud, C87193uc.A00)) {
            if (!z || c81323k2.A02 != null) {
                BulletAwareTextView bulletAwareTextView2 = c81323k2.A02;
                if (bulletAwareTextView2 == null) {
                    View inflate2 = c81323k2.A06.inflate();
                    C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.feed.ui.text.BulletAwareTextView");
                    bulletAwareTextView2 = (BulletAwareTextView) inflate2;
                    c81323k2.A02 = bulletAwareTextView2;
                    if (bulletAwareTextView2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                bulletAwareTextView2.setVisibility(8);
            }
        } else {
            throw new RuntimeException();
        }
        InterfaceC87233ug interfaceC87233ug = (InterfaceC87233ug) ((InterfaceC16660sJ) c206289Bl.A03).invoke(context);
        if (interfaceC87233ug instanceof C87243uh) {
            c81323k2.A01().setText(((C87243uh) interfaceC87233ug).A00);
            c81323k2.A01().setMovementMethod(LinkMovementMethod.getInstance());
            c81323k2.A01().setVisibility(0);
        } else if (C14360o3.A0K(interfaceC87233ug, C87223uf.A00)) {
            BulletAwareTextView bulletAwareTextView3 = c81323k2.A03;
            if (bulletAwareTextView3 != null) {
                bulletAwareTextView3.setVisibility(8);
            }
        } else {
            throw new RuntimeException();
        }
        C87173ua c87173ua = c87183ub.A01;
        C87053uN c87053uN = c81323k2.A09;
        boolean z2 = c87183ub.A09;
        boolean z3 = c87183ub.A08;
        int i2 = A01.A06;
        Integer valueOf = Integer.valueOf(i2);
        int i3 = 0;
        C14360o3.A0B(c87173ua, 1);
        C14360o3.A0B(c87053uN, 2);
        if (c87173ua.A06) {
            View view = c87053uN.A00;
            igLikeTextView = c87053uN.A02;
            InterfaceC16660sJ interfaceC16660sJ2 = c87173ua.A00.A02;
            Context context2 = igLikeTextView.getContext();
            C14360o3.A07(context2);
            CharSequence charSequence = (CharSequence) interfaceC16660sJ2.invoke(context2);
            if (charSequence.length() == 0) {
                view.setVisibility(8);
                igLikeTextView.setVisibility(8);
            } else {
                view.setVisibility(0);
                igLikeTextView.setText(charSequence);
                igLikeTextView.setLongClickable(false);
                igLikeTextView.setVisibility(0);
                igLikeTextView.setAlpha(1.0f);
            }
        } else if (c87173ua.A03) {
            InterfaceC56392iX interfaceC56392iX = c87053uN.A01;
            Object tag = interfaceC56392iX.getView().getTag();
            String str = c87173ua.A01;
            C87163uZ c87163uZ = c87173ua.A00;
            InterfaceC16660sJ interfaceC16660sJ3 = c87163uZ.A05;
            Context context3 = interfaceC56392iX.getView().getContext();
            C14360o3.A07(context3);
            Drawable drawable = (Drawable) interfaceC16660sJ3.invoke(context3);
            if (!C14360o3.A0K(tag, str)) {
                interfaceC56392iX.getView().setTag(str);
                if (c87173ua.A08 && drawable != null) {
                    ImageView imageView = (ImageView) interfaceC56392iX.getView();
                    imageView.setAlpha(1.0f);
                    imageView.setImageDrawable(drawable);
                    imageView.setImageTintList(ColorStateList.valueOf(AbstractC53242c7.A0F(imageView.getContext(), R.attr.igds_color_primary_icon)));
                }
            }
            if (c87173ua.A08 && drawable != null) {
                View view2 = interfaceC56392iX.getView();
                AbstractC13880nE.A0V(view2, view2.getContext().getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
                interfaceC56392iX.setVisibility(0);
            } else {
                AbstractC13880nE.A0e(interfaceC56392iX.getView(), 0);
                AbstractC13880nE.A0V(interfaceC56392iX.getView(), 0);
                interfaceC56392iX.setVisibility(8);
            }
            View view3 = c87053uN.A00;
            igLikeTextView = c87053uN.A02;
            InterfaceC16660sJ interfaceC16660sJ4 = c87163uZ.A06;
            Context context4 = igLikeTextView.getContext();
            C14360o3.A07(context4);
            CharSequence charSequence2 = (CharSequence) interfaceC16660sJ4.invoke(context4);
            if (charSequence2.length() == 0) {
                view3.setVisibility(8);
            } else {
                view3.setVisibility(0);
                igLikeTextView.setText(charSequence2);
                if (valueOf != null) {
                    igLikeTextView.setTextColor(i2);
                }
                igLikeTextView.setLongClickable(false);
                igLikeTextView.setVisibility(0);
                igLikeTextView.setAlpha(1.0f);
            }
        } else {
            InterfaceC56392iX interfaceC56392iX2 = c87053uN.A01;
            if (!z2 && !z3) {
                if (!c87173ua.A02 || interfaceC56392iX2.CWW()) {
                    AbstractC13880nE.A0e(interfaceC56392iX2.getView(), 0);
                    i = 8;
                    interfaceC56392iX2.setVisibility(i);
                }
                AbstractC87253ui.A01(c87173ua, c87053uN, valueOf);
            } else {
                if (interfaceC56392iX2 != null) {
                    Context context5 = interfaceC56392iX2.getView().getContext();
                    Object tag2 = interfaceC56392iX2.getView().getTag();
                    String str2 = c87173ua.A01;
                    if (!C14360o3.A0K(str2, tag2)) {
                        C87163uZ c87163uZ2 = c87173ua.A00;
                        if (z3) {
                            interfaceC16660sJ = c87163uZ2.A07;
                        } else {
                            interfaceC16660sJ = c87163uZ2.A0A;
                        }
                        C14360o3.A0A(context5);
                        ((ImageView) interfaceC56392iX2.getView()).setImageDrawable((Drawable) interfaceC16660sJ.invoke(context5));
                        interfaceC56392iX2.getView().setTag(str2);
                    }
                    C0fQ.A00(new XN1(context5, c87173ua, z3), interfaceC56392iX2.getView());
                    i = 0;
                    interfaceC56392iX2.setVisibility(i);
                }
                AbstractC87253ui.A01(c87173ua, c87053uN, valueOf);
            }
        }
        if (z2 || z3 || c87173ua.A05 || c87173ua.A03) {
            boolean z4 = c87173ua.A03;
            Resources resources = context.getResources();
            int i4 = R.dimen.abc_action_bar_elevation_material;
            if (z4) {
                i4 = R.dimen.abc_button_padding_horizontal_material;
            }
            i3 = resources.getDimensionPixelSize(i4);
        }
        AbstractC13880nE.A0U(c87053uN.A00, i3);
        InterfaceC87093uR interfaceC87093uR = c87183ub.A04;
        if (interfaceC87093uR instanceof C87263uj) {
            if (z) {
                obj.A00 = ((InterfaceC16660sJ) c206289Bl.A06).invoke(c81323k2.A00());
                AbstractC77703du.A05(c81323k2.A00(), EnumC77673dr.A0A);
            }
            SpannableString spannableString = new SpannableString(((C87263uj) interfaceC87093uR).A00);
            spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 0);
            c81323k2.A00().setText(spannableString);
            c81323k2.A00().setContentDescription(context.getString(2131954439, spannableString));
            C0fQ.A00(new ASE(c87183ub, this, obj), c81323k2.A00());
            c81323k2.A00().setVisibility(0);
            c81323k2.A00().setMaxLines(CKO.A00(this.A00));
        } else if (C14360o3.A0K(interfaceC87093uR, C87083uQ.A00)) {
            AbstractC13880nE.A0P(c81323k2.A00);
        } else {
            throw new RuntimeException();
        }
        InterfaceC87073uP interfaceC87073uP = c87183ub.A03;
        if (interfaceC87073uP instanceof C87273uk) {
            SpannableString spannableString2 = new SpannableString(AbstractC906141w.A00(context, ((C87273uk) interfaceC87073uP).A00, true));
            spannableString2.setSpan(new CharacterStyle(), 0, spannableString2.length(), 0);
            TextView textView = (TextView) c81323k2.A08.getView();
            C0fQ.A00(new ViewOnClickListenerC23225ARj(c87183ub, this), textView);
            textView.setText(spannableString2);
            textView.setVisibility(0);
            AbstractC77703du.A05(textView, EnumC77673dr.A0A);
        } else if (interfaceC87073uP instanceof C87063uO) {
            c81323k2.A08.setVisibility(8);
        } else {
            throw new RuntimeException();
        }
        InterfaceC87123uV interfaceC87123uV = c87183ub.A02;
        if (interfaceC87123uV instanceof C87283ul) {
            SpannableString spannableString3 = new SpannableString(((C87283ul) interfaceC87123uV).A00);
            spannableString3.setSpan(new CharacterStyle(), 0, spannableString3.length(), 0);
            c81323k2.A00().setText(spannableString3);
            C0fQ.A00(new ViewOnClickListenerC23226ARk(c87183ub, this), c81323k2.A00());
            c81323k2.A00().setVisibility(0);
            c81323k2.A00().setMaxLines(CKO.A00(this.A00));
        } else if (!(interfaceC87123uV instanceof C87113uU)) {
            throw new RuntimeException();
        }
        c75113Zb.A0L(c81323k2, null, true);
    }
}
