package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class V5S extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final EnumC142806cg A03;
    public final AbstractC52184N7v A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        String A0p;
        LiveUserPaySupportTier liveUserPaySupportTier;
        Drawable drawable;
        Drawable mutate;
        int i;
        C70797WhA c70797WhA = (C70797WhA) interfaceC66482zP;
        C66480UJe c66480UJe = (C66480UJe) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c70797WhA, c66480UJe);
        Context context = this.A00;
        UserSession userSession = this.A02;
        EnumC142806cg enumC142806cg = this.A03;
        AbstractC52184N7v abstractC52184N7v = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0x(A1a ? 1 : 0, userSession, enumC142806cg, abstractC52184N7v);
        C14360o3.A0B(interfaceC11380iw, 6);
        ImageUrl imageUrl = c70797WhA.A04;
        if (imageUrl != null) {
            if (!AbstractC81033jX.A03(imageUrl)) {
                c66480UJe.A08.setUrl(imageUrl, interfaceC11380iw);
            }
        } else {
            AbstractC166997dE.A19(context, c66480UJe.A08, R.drawable.profile_anonymous_user);
        }
        EnumC223199sy enumC223199sy = c70797WhA.A06;
        if (enumC223199sy != EnumC223199sy.A04 && (i = c70797WhA.A01) > 0) {
            TextView textView = c66480UJe.A06;
            textView.setText(AbstractC167017dG.A0k(context.getResources(), i, R.plurals.live_question_like_count));
            textView.setVisibility(0);
        } else {
            c66480UJe.A06.setVisibility(8);
        }
        c66480UJe.A03.setVisibility(0);
        boolean z = c70797WhA.A0A;
        TextView textView2 = c66480UJe.A07;
        if (z) {
            textView2.setVisibility(0);
            WNW.A00(textView2, 26, abstractC52184N7v, c70797WhA);
        } else {
            textView2.setVisibility(8);
            textView2.setOnClickListener(null);
        }
        boolean z2 = c70797WhA.A08;
        TextView textView3 = c66480UJe.A05;
        if (z2) {
            textView3.setVisibility(0);
            WNW.A00(textView3, 25, abstractC52184N7v, c70797WhA);
        } else {
            textView3.setVisibility(8);
            textView3.setOnClickListener(null);
        }
        if (c70797WhA.A0C) {
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = c66480UJe.A09;
            igBouncyUfiButtonImageView.A05();
            igBouncyUfiButtonImageView.setSelected(c70797WhA.A0B);
            boolean z3 = c70797WhA.A09;
            View view2 = c66480UJe.A00;
            if (z3) {
                WNX.A00(view2, abstractC52184N7v, c70797WhA, c66480UJe, 61);
            } else {
                view2.setVisibility(8);
                view2.setOnClickListener(null);
                c66480UJe.A0A.A01(null);
            }
            view2.setVisibility(0);
        } else {
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView2 = c66480UJe.A09;
            igBouncyUfiButtonImageView2.A05();
            igBouncyUfiButtonImageView2.setVisibility(8);
            View view3 = c66480UJe.A00;
            view3.setVisibility(8);
            view3.setOnClickListener(null);
            c66480UJe.A0A.A01(null);
        }
        if (enumC142806cg == EnumC142806cg.A03 && enumC223199sy == EnumC223199sy.A06 && c70797WhA.A01 > 0) {
            float f = c70797WhA.A00;
            view = c66480UJe.A02;
            AbstractC31173DnH.A0z(context, view, R.drawable.question_list_item_background);
            View view4 = c66480UJe.A01;
            view4.setVisibility(0);
            AbstractC13880nE.A0V(view4, (int) ((1.0f - f) * (AbstractC13880nE.A0A(context) - AbstractC167017dG.A03(context))));
        } else {
            view = c66480UJe.A02;
            EnumC223199sy enumC223199sy2 = EnumC223199sy.A05;
            int i2 = R.drawable.question_list_item_background;
            if (enumC223199sy == enumC223199sy2) {
                i2 = R.drawable.question_list_item_selected_background;
            }
            AbstractC31173DnH.A0z(context, view, i2);
            c66480UJe.A01.setVisibility(8);
        }
        C3P9 c3p9 = new C3P9(view);
        c3p9.A05 = C05F.A1F;
        c3p9.A04 = new C52373NFp(5, abstractC52184N7v, c70797WhA);
        c3p9.A00();
        TextView textView4 = c66480UJe.A04;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = c70797WhA.A05;
        if (user != null) {
            A0p = user.getUsername();
        } else {
            A0p = AbstractC166997dE.A0p(context, 2131965484);
        }
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) A0p);
        Object characterStyle = new CharacterStyle();
        Pattern pattern = AbstractC13670mt.A00;
        append.setSpan(characterStyle, 0, A0p.length(), 33);
        if (user != null) {
            if (user.isVerified()) {
                C85963sQ.A08(context, spannableStringBuilder, A1a);
            }
            C51745MtU c51745MtU = c70797WhA.A03;
            if (c51745MtU != null && (liveUserPaySupportTier = (LiveUserPaySupportTier) c51745MtU.A01) != null) {
                boolean A02 = AbstractC13620mo.A02(context);
                if (A02) {
                    spannableStringBuilder.insert(0, " ");
                } else {
                    spannableStringBuilder.append(" ");
                }
                Integer A00 = AbstractC54905OQc.A00(liveUserPaySupportTier, A1a);
                if (A00 != null && (drawable = context.getDrawable(A00.intValue())) != null && (mutate = drawable.mutate()) != null) {
                    Drawable mutate2 = mutate.mutate();
                    int i3 = 0;
                    if (mutate2 != null) {
                        AbstractC167017dG.A14(mutate2);
                        Object c85973sR = new C85973sR(mutate2);
                        if (A02) {
                            spannableStringBuilder.insert(0, " ");
                        } else {
                            i3 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                        }
                        spannableStringBuilder.setSpan(c85973sR, i3, i3 + 1, 33);
                    }
                }
                throw AbstractC166997dE.A0g();
            }
        }
        spannableStringBuilder.append("   ").append(c70797WhA.A07);
        textView4.setText(spannableStringBuilder);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70797WhA.class;
    }

    public V5S(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg, AbstractC52184N7v abstractC52184N7v) {
        AbstractC43594JPz.A1P(userSession, enumC142806cg);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = enumC142806cg;
        this.A04 = abstractC52184N7v;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_question_list_item, false);
        C66480UJe c66480UJe = new C66480UJe(A0D);
        A0D.setTag(c66480UJe);
        return c66480UJe;
    }
}
