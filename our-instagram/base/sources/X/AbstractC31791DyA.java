package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.HashMap;

/* renamed from: X.DyA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31791DyA extends C193578hc {
    public int A00;
    public Boolean A01;
    public Boolean A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C142846ck A06;
    public final EnumC33330EoP A07;
    public final Integer A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;
    public final C0UO A0I;
    public final boolean A0J;

    public AbstractC31791DyA(Application application, UserSession userSession, C142846ck c142846ck, ChannelCreationSource channelCreationSource, EnumC33330EoP enumC33330EoP, Integer num) {
        super(application);
        EnumC33411Epi enumC33411Epi;
        this.A05 = userSession;
        this.A06 = c142846ck;
        this.A07 = enumC33330EoP;
        this.A08 = num;
        this.A0D = AbstractC25227BEk.A0z();
        boolean z = false;
        this.A0E = AbstractC25235BEs.A1A(false);
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(userSession));
        if ((A0M != null && AbstractC166997dE.A1Z(A0M.BBZ(), true)) || (channelCreationSource == ChannelCreationSource.A05 && C18U.A06(C06090Tz.A05, userSession, 36328444002385441L))) {
            z = true;
        }
        this.A0J = z;
        if (enumC33330EoP == EnumC33330EoP.A03 && num != null && num.intValue() == 2) {
            if (C18U.A06(C06090Tz.A05, userSession, 36327520584481420L)) {
                enumC33411Epi = EnumC33411Epi.A08;
            } else {
                enumC33411Epi = EnumC33411Epi.A06;
            }
        } else {
            enumC33411Epi = EnumC33411Epi.A04;
        }
        C008002u A1H = AbstractC25225BEi.A1H(1);
        this.A09 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(enumC33411Epi);
        this.A0A = A1H2;
        this.A0F = AbstractC208910l.A02(A1H);
        this.A0G = AbstractC208910l.A02(A1H2);
        C008002u A00 = C10E.A00(G1f.A00);
        this.A0C = A00;
        this.A0I = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(C32723Eao.A00);
        this.A0B = A002;
        this.A0H = A002;
    }

    public static int A00(AbstractC31791DyA abstractC31791DyA) {
        return ((Number) abstractC31791DyA.A0F.getValue()).intValue();
    }

    public static final void A01(AbstractC31791DyA abstractC31791DyA) {
        abstractC31791DyA.A0C.Egh(new E96(BHS.A00(new Object[0], 2131974817), BHS.A00(new Object[0], 2131974806)));
    }

    public final void A0E(FragmentActivity fragmentActivity) {
        int i;
        Bundle A09;
        C140966Yy A0r;
        Fragment eor;
        if (AbstractC166987dD.A0H(this.A09.getValue()) == 2 && this.A07 == EnumC33330EoP.A02 && this.A00 < 1) {
            A01(this);
            return;
        }
        if (this instanceof C32725Eaq) {
            C32725Eaq c32725Eaq = (C32725Eaq) this;
            if (A00(c32725Eaq) == 2) {
                C36296Fzq c36296Fzq = c32725Eaq.A02;
                String str = c32725Eaq.A04.A00;
                if (str == null) {
                    str = AbstractC166997dE.A0n();
                }
                c36296Fzq.A00 = str;
                C36296Fzq.A02(EnumC33514Ern.A0C, EnumC33512Erl.DM_CREATE, c36296Fzq, "chat_creation_sheet_rendered", "tap", null);
                CategorySelectionScreenArgs categorySelectionScreenArgs = c32725Eaq.A01.A00;
                if (categorySelectionScreenArgs != null) {
                    A09 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L("channel_title", c32725Eaq.A0D.getValue()), AbstractC166987dD.A1L("should_pin_to_profile", Boolean.valueOf(((AbstractC31791DyA) c32725Eaq).A03)), AbstractC166987dD.A1L("channel_duration", Integer.valueOf(((EnumC33411Epi) c32725Eaq.A0G.getValue()).A00)), AbstractC166987dD.A1L("fan_club_category_type", categorySelectionScreenArgs.A00), AbstractC166987dD.A1L("fan_club_category_name", categorySelectionScreenArgs.A01), AbstractC166987dD.A1L("entrypoint", c32725Eaq.A03.A00));
                    eor = new EOQ();
                    A0r = AbstractC25225BEi.A0r(fragmentActivity, ((AbstractC31791DyA) c32725Eaq).A05);
                } else if (!c32725Eaq.A08) {
                    A09 = AbstractC167027dH.A09("entrypoint", c32725Eaq.A03.A00, AbstractC166987dD.A1L("channel_title", c32725Eaq.A0D.getValue()), AbstractC166987dD.A1L("should_pin_to_profile", Boolean.valueOf(((AbstractC31791DyA) c32725Eaq).A03)), AbstractC166987dD.A1L("channel_duration", Integer.valueOf(((EnumC33411Epi) c32725Eaq.A0G.getValue()).A00)));
                    A0r = AbstractC25225BEi.A0r(fragmentActivity, ((AbstractC31791DyA) c32725Eaq).A05);
                    eor = new EOR();
                }
                A0r.A0B(A09, eor);
                A0r.A04();
                return;
            }
        }
        UserSession userSession = this.A05;
        C47619L1e c47619L1e = (C47619L1e) userSession.A01(C47619L1e.class, new MHJ(userSession, 42));
        int ordinal = this.A07.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                i = 32;
            } else {
                throw B4Z.A00();
            }
        } else {
            i = 29;
        }
        C006802i c006802i = c47619L1e.A00;
        c006802i.markerStart(20128591);
        c006802i.markerPoint(20128591, "Create_Channel_Clicked");
        c006802i.markerAnnotate(20128591, AbstractC111324zv.A00(3237), i);
        c006802i.markerAnnotate(20128591, AbstractC111324zv.A00(3236), C4GR.A00(i));
        AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new GSS(c47619L1e, this, null, 13), AbstractC141776au.A00(this));
    }

    public final void A0F(MU9 mu9) {
        if (this instanceof C32725Eaq) {
            C14360o3.A0B(mu9, 0);
            UserSession userSession = this.A05;
            C36299Fzu A00 = AbstractC34060F1n.A00(userSession);
            String A01 = FYJ.A01(AbstractC166987dD.A0O(A0D()), mu9, userSession);
            int A002 = FYJ.A00(mu9);
            boolean z = mu9.A01 instanceof C115095Ie;
            C25531Mh A003 = C36299Fzu.A00(A00);
            if (AbstractC25226BEj.A1Z(A003)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("error_message", A01);
                AbstractC31171DnF.A1U(String.valueOf(A002), A1G);
                A1G.put("is_network_error", AbstractC31172DnG.A0z(z ? 1 : 0));
                C36299Fzu.A04(A003, A00);
                AbstractC31174DnI.A1J(A003, "thread_create_error");
                A003.A0o("create_public_chat");
                C36299Fzu.A05(A003, A00, "chat_setup");
                A003.A0v(A1G);
                A003.Cht();
                return;
            }
            return;
        }
        C14360o3.A0B(mu9, 0);
        C142846ck c142846ck = this.A06;
        int A004 = A00(this);
        boolean z2 = mu9.A01 instanceof C115095Ie;
        int A005 = FYJ.A00(mu9);
        String A012 = FYJ.A01(AbstractC166987dD.A0O(A0D()), mu9, this.A05);
        C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
        if (!AbstractC25226BEj.A1Z(A0I)) {
            return;
        }
        HashMap A1G2 = AbstractC166987dD.A1G();
        A1G2.put("error_message", A012);
        AbstractC31171DnF.A1U(String.valueOf(A005), A1G2);
        A1G2.put("is_network_error", AbstractC31172DnG.A0z(z2 ? 1 : 0));
        AbstractC31175DnJ.A1B(A0I, c142846ck);
        AbstractC31174DnI.A1J(A0I, "thread_create_error");
        A0I.A0o("create_broadcast_chat");
        AbstractC31178DnM.A1H(A0I, "chat_setup", A004);
        AbstractC31181DnP.A0l(A0I, c142846ck, A1G2);
    }

    public final void A0G(C43707JUs c43707JUs) {
        if (this instanceof C32725Eaq) {
            C32725Eaq c32725Eaq = (C32725Eaq) this;
            C14360o3.A0B(c43707JUs, 0);
            C34628FNl A03 = C32725Eaq.A03(c32725Eaq);
            C36299Fzu A00 = AbstractC34060F1n.A00(((AbstractC31791DyA) c32725Eaq).A05);
            String str = c43707JUs.A1E;
            C14360o3.A07(str);
            String str2 = c43707JUs.A1K;
            C14360o3.A07(str2);
            C25531Mh A002 = C36299Fzu.A00(A00);
            if (AbstractC25226BEj.A1Z(A002)) {
                C36299Fzu.A04(A002, A00);
                AbstractC31174DnI.A1J(A002, "thread_create_successful");
                A002.A0o("create_public_chat");
                C36299Fzu.A05(A002, A00, "chat_setup");
                A002.A0r(str);
                A002.A0h(AbstractC166997dE.A0j(str2));
                A002.A0v(C36299Fzu.A03(A03, A00));
                A002.Cht();
                return;
            }
            return;
        }
        C14360o3.A0B(c43707JUs, 0);
        C142846ck c142846ck = this.A06;
        int A003 = A00(this);
        String str3 = c43707JUs.A1E;
        C14360o3.A07(str3);
        String str4 = c43707JUs.A1K;
        C14360o3.A07(str4);
        C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
        if (!AbstractC25226BEj.A1Z(A0I)) {
            return;
        }
        AbstractC31175DnJ.A1B(A0I, c142846ck);
        AbstractC31174DnI.A1J(A0I, "thread_create_successful");
        A0I.A0o("create_broadcast_chat");
        AbstractC31178DnM.A1H(A0I, "thread_view", A003);
        A0I.A0r(str3);
        AbstractC31177DnL.A1H(A0I, c142846ck, AbstractC166997dE.A0j(str4));
    }
}
