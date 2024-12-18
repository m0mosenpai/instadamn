package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9C implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public G9C(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        String str;
        Integer num;
        switch (this.A00) {
            case 0:
                C32302EKp c32302EKp = (C32302EKp) this.A02;
                c32302EKp.A05 = z;
                C142846ck A0d = AbstractC31172DnG.A0d(c32302EKp.A0A);
                int i = c32302EKp.A00;
                InterfaceC83733oI interfaceC83733oI = c32302EKp.A01;
                if (interfaceC83733oI == null) {
                    C14360o3.A0F("currentThreadId");
                    throw C00O.createAndThrow();
                }
                String A0c = AbstractC31171DnF.A0c(interfaceC83733oI);
                String str2 = c32302EKp.A04;
                String str3 = c32302EKp.A02;
                String A0t = AbstractC31173DnH.A0t(c32302EKp.A0B);
                C2EC c2ec = (C2EC) this.A01;
                int C7g = c2ec.C7g();
                C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
                if (A0g != null) {
                    String A00 = C160857It.A00(A0g, A0t, C7g);
                    C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                    if (!AbstractC25226BEj.A1Z(A0I)) {
                        return true;
                    }
                    AbstractC31175DnJ.A1B(A0I, A0d);
                    if (z) {
                        str = "paid_partnership_label_enabled";
                    } else {
                        str = "paid_partnership_label_disabled";
                    }
                    AbstractC31179DnN.A1D(A0I, str);
                    A0I.A0o("add_label_toggle");
                    AbstractC31174DnI.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "paid_partnership_sheet", A0c, str2, i));
                    A0I.A0v(AbstractC25233BEq.A0p("user_type", A00, AbstractC166987dD.A1L(AbstractC43591JPw.A00(84), str3)));
                    A0I.Cht();
                    return true;
                }
                throw AbstractC166997dE.A0g();
            case 1:
                G38 g38 = (G38) this.A02;
                g38.A03.A00.A07 = z;
                if (!z) {
                    return true;
                }
                BroadcastChannelXpostingChannelInfo broadcastChannelXpostingChannelInfo = (BroadcastChannelXpostingChannelInfo) this.A01;
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A0D = AbstractC167007dF.A0f(g38.A00, broadcastChannelXpostingChannelInfo.A03, 2131959073);
                A0K.A02();
                A0K.A07(R.drawable.instagram_facebook_circle_pano_outline_24);
                AbstractC25233BEq.A1F(A0K);
                return true;
            case 2:
                ProgressButton progressButton = (ProgressButton) this.A01;
                int i2 = 2131961124;
                if (z) {
                    i2 = 2131968535;
                }
                progressButton.setText(i2);
                ((C32311EKz) this.A02).A07 = z;
                return true;
            case 3:
                AbstractC31173DnH.A1Y(AbstractC31171DnF.A0g(this.A01), ((EIV) this.A02).A08, z);
                return true;
            case 4:
                C33226ElG c33226ElG = (C33226ElG) this.A02;
                if (!c33226ElG.A09) {
                    User user = (User) this.A01;
                    if (user.A0I() != EnumC222416a.A05 && user.A0I() != EnumC222416a.A06) {
                        c33226ElG.A09 = true;
                        if (!z) {
                            C33226ElG.A02(c33226ElG, user);
                            return false;
                        }
                        InterfaceC09390do interfaceC09390do = c33226ElG.A0E;
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        if (user.A03.B7S() != null && user.A03.B7S().intValue() >= 10) {
                            C1AU A01 = C1AT.A01(A0r);
                            C1AV c1av = C1AV.A2X;
                            if (A01.A03(c1av).getInt("review_followers_prompt_last_time_shown", 0) + 7776000 <= System.currentTimeMillis() / 1000) {
                                AbstractC167007dF.A18(C1AT.A01(A0r).A03(c1av), "review_followers_prompt_last_time_shown", (int) (System.currentTimeMillis() / 1000));
                                C33226ElG.A04(c33226ElG, true);
                                C33226ElG.A03(c33226ElG, user, C05F.A0C, true);
                                return false;
                            }
                        }
                        ViewOnClickListenerC35687FpM viewOnClickListenerC35687FpM = new ViewOnClickListenerC35687FpM(37, user, c33226ElG);
                        C189448aO A0g2 = AbstractC25231BEo.A0g(interfaceC09390do);
                        AbstractC25226BEj.A1M(c33226ElG.requireActivity(), A0g2, 2131973607);
                        A0g2.A0U = new GH5(c33226ElG, 18);
                        A0g2.A0g = c33226ElG.requireActivity().getString(2131973603);
                        A0g2.A0K = viewOnClickListenerC35687FpM;
                        A0g2.A16 = false;
                        C189478aR A002 = A0g2.A00();
                        A002.A0Q(true);
                        EIT eit = new EIT();
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", true);
                        A0b.putBoolean("ARG_IS_REDESIGN", true);
                        eit.setArguments(A0b);
                        eit.A01 = c33226ElG.A0B;
                        AbstractC31173DnH.A1G(c33226ElG, eit, A002);
                        return false;
                    }
                    Dialog dialog = c33226ElG.A00;
                    if (dialog == null) {
                        C193328hC A0O = AbstractC31175DnJ.A0O(c33226ElG);
                        A0O.A0A(2131954400);
                        A0O.A09(2131954401);
                        A0O.A0s(false);
                        A0O.A07();
                        dialog = A0O.A02();
                        c33226ElG.A00 = dialog;
                        if (dialog == null) {
                            return false;
                        }
                    }
                    C0fJ.A00(dialog);
                    return false;
                }
                return false;
            case 5:
                C32259EIt c32259EIt = (C32259EIt) this.A02;
                if (z) {
                    C32259EIt.A01(c32259EIt, C05F.A01);
                    Context requireContext = c32259EIt.requireContext();
                    UserSession A0r2 = AbstractC166987dD.A0r(c32259EIt.A04);
                    User user2 = c32259EIt.A00;
                    if (user2 != null) {
                        AbstractC35095Fd6.A00(requireContext, (C1P1) this.A01, A0r2, user2, null, c32259EIt.A02, true, false, false);
                        return true;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C32259EIt.A01(c32259EIt, C05F.A1F);
                UserSession A0r3 = AbstractC166987dD.A0r(c32259EIt.A04);
                User user3 = c32259EIt.A00;
                if (user3 != null) {
                    String str4 = c32259EIt.A02;
                    C1P1 c1p1 = (C1P1) this.A01;
                    String id = user3.getId();
                    AbstractC167007dF.A1F(A0r3, 0, str4);
                    C25621Ms A0c2 = AbstractC167017dG.A0c(A0r3);
                    A0c2.A0B("friendships/unmute_posts_or_story_from_follow/");
                    A0c2.A9s("container_module", str4);
                    A0c2.A9s("target_posts_author_id", id);
                    C1ON A0D = AbstractC31175DnJ.A0D(A0c2, EDR.class, C34858FXs.class, true);
                    A0D.A00 = new EU2(c1p1, AbstractC25651Mw.A00(A0r3), A0r3, user3, true, false);
                    C1GJ.A03(A0D);
                    return true;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 6:
                C32259EIt c32259EIt2 = (C32259EIt) this.A02;
                if (z) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A02;
                }
                C32259EIt.A01(c32259EIt2, num);
                Context requireContext2 = c32259EIt2.requireContext();
                UserSession A0r4 = AbstractC166987dD.A0r(c32259EIt2.A04);
                User user4 = c32259EIt2.A00;
                if (user4 != null) {
                    AbstractC35095Fd6.A01(requireContext2, (C1P1) this.A01, A0r4, user4, c32259EIt2.A02, z);
                    return true;
                }
                throw AbstractC166997dE.A0g();
            default:
                C32259EIt c32259EIt3 = (C32259EIt) this.A02;
                if (z) {
                    C32259EIt.A01(c32259EIt3, C05F.A0C);
                    Context requireContext3 = c32259EIt3.requireContext();
                    UserSession A0r5 = AbstractC166987dD.A0r(c32259EIt3.A04);
                    User user5 = c32259EIt3.A00;
                    if (user5 != null) {
                        AbstractC35095Fd6.A00(requireContext3, (C1P1) this.A01, A0r5, user5, null, c32259EIt3.A02, false, true, false);
                        return true;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C32259EIt.A01(c32259EIt3, C05F.A1I);
                UserSession A0r6 = AbstractC166987dD.A0r(c32259EIt3.A04);
                User user6 = c32259EIt3.A00;
                if (user6 != null) {
                    AbstractC35095Fd6.A02((C1P1) this.A01, A0r6, user6, c32259EIt3.A02);
                    return true;
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
