package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.DpV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31309DpV extends AbstractC46524KiP implements GZA {
    public C2EC A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C142846ck A03;
    public final InterfaceC83733oI A04;
    public final C2056398n A05;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_questions_pano_outline_24);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AbstractC31181DnP.A0U(spannableStringBuilder, AbstractC167027dH.A0P(context, 2131963933), new StyleSpan(1), spannableStringBuilder.length());
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) AbstractC167027dH.A0P(context, 2131963932));
        C14360o3.A07(append);
        AbstractC31172DnG.A1U(igdsBanner, append, false);
        AbstractC31174DnI.A1Q(this, igdsBanner, 2131963931, true);
        return igdsBanner;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String str2;
        C14360o3.A0B(interfaceC37159GYw, 1);
        this.A00 = c2ec;
        C2056398n c2056398n = this.A05;
        InterfaceC16530ry interfaceC16530ry = c2056398n.A06;
        C0YR[] c0yrArr = C2056398n.A0d;
        long A0N = AbstractC166987dD.A0N(AbstractC31171DnF.A0Y(c2056398n, interfaceC16530ry, c0yrArr, 31));
        if (c2ec != null && c2ec.C7g() == 29) {
            C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
            if (A0g != null) {
                str2 = A0g.A07;
            } else {
                str2 = null;
            }
            UserSession userSession = this.A02;
            if (AbstractC31171DnF.A1W(userSession, str2) && A0N > 0 && AbstractC31177DnL.A06() > A0N && !AbstractC167017dG.A1b(c2056398n, c2056398n.A0I, c0yrArr, 32) && C18U.A06(C06090Tz.A05, userSession, 36319377334279566L)) {
                C142846ck c142846ck = this.A03;
                String C7I = c2ec.C7I();
                String C7q = c2ec.C7q();
                int AdZ = c2ec.AdZ();
                C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, c142846ck);
                    AbstractC31174DnI.A1K(A0I, "learn_how_banner_rendered");
                    A0I.A0o("learn_how_banner");
                    AbstractC31177DnL.A1H(A0I, c142846ck, AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
                }
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        String str2;
        int i;
        int i2;
        C2056398n c2056398n = this.A05;
        AbstractC167007dF.A1L(c2056398n, c2056398n.A0I, C2056398n.A0d, 32, true);
        C142846ck c142846ck = this.A03;
        C2EC c2ec = this.A00;
        String str3 = null;
        if (c2ec != null) {
            str = c2ec.C7I();
        } else {
            str = null;
        }
        C2EC c2ec2 = this.A00;
        if (c2ec2 != null) {
            str2 = c2ec2.C7q();
        } else {
            str2 = null;
        }
        C2EC c2ec3 = this.A00;
        if (c2ec3 != null) {
            i = c2ec3.AdZ();
        } else {
            i = 0;
        }
        C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, c142846ck);
            AbstractC31174DnI.A1I(A0I, "render_best_practices_sheet");
            A0I.A0o("learn_how_banner");
            AbstractC31177DnL.A1H(A0I, c142846ck, AbstractC31179DnN.A0a(A0I, "thread_view", str, str2, i));
        }
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        InterfaceC83733oI interfaceC83733oI = this.A04;
        C2EC c2ec4 = this.A00;
        if (c2ec4 != null) {
            str3 = c2ec4.C7q();
        }
        EnumC33344Eod enumC33344Eod = EnumC33344Eod.A03;
        C2EC c2ec5 = this.A00;
        if (c2ec5 != null) {
            i2 = c2ec5.AdZ();
        } else {
            i2 = 0;
        }
        AbstractC34776FTz.A01(fragmentActivity, userSession, enumC33344Eod, interfaceC83733oI, str3, "thread_view", "broadcast_channel_education_upsell_banner", i2);
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        C2056398n c2056398n = this.A05;
        AbstractC167007dF.A1L(c2056398n, c2056398n.A0I, C2056398n.A0d, 32, true);
    }

    public C31309DpV(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC83733oI interfaceC83733oI) {
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = interfaceC83733oI;
        this.A05 = AbstractC2056298m.A00(userSession);
        this.A03 = AbstractC147806l5.A00(userSession);
    }
}
