package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Ed3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32861Ed3 extends AbstractC35044FcH {
    public int A00;
    public final Context A01;
    public final EnumC33425Epw A02;
    public final FragmentActivity A03;
    public final AbstractC10360h2 A04;
    public final AbstractC018607g A05;
    public final EnumC33510Erj A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C75113Zb A09;
    public final Runnable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AbstractC32861Ed3(Context context, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, EnumC33510Erj enumC33510Erj, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C2EY c2ey, EnumC33425Epw enumC33425Epw, Object obj, Runnable runnable, String str, String str2, String str3, int i, int i2) {
        super(c2ey, obj, enumC33425Epw.A05, i, i2);
        this.A02 = enumC33425Epw;
        this.A01 = context;
        this.A07 = userSession;
        this.A08 = interfaceC60442pS;
        this.A09 = c75113Zb;
        this.A03 = fragmentActivity;
        this.A04 = abstractC10360h2;
        this.A05 = abstractC018607g;
        this.A0A = runnable;
        this.A06 = enumC33510Erj;
        this.A0C = str;
        this.A0D = str2;
        this.A0B = str3;
    }

    @Override // X.AbstractC35044FcH
    public final void A06(View view) {
        ChannelChallengeShareInfo channelChallengeShareInfo;
        InviteLinkShareInfo inviteLinkShareInfo;
        InviteLinkShareInfo inviteLinkShareInfo2;
        android.net.Uri uri;
        User user;
        String A00;
        String str;
        C32772Ebc c32772Ebc;
        C41181vS c41181vS;
        C105824pt c105824pt;
        User user2;
        C32775Ebf c32775Ebf;
        C38321qM c38321qM;
        EnumC33500ErZ enumC33500ErZ;
        ArrayList arrayList = C35163Ff5.A07;
        final UserSession userSession = this.A07;
        Context context = this.A01;
        C35163Ff5 A002 = F4Y.A00(AbstractC166987dD.A0O(context), userSession);
        EnumC33425Epw enumC33425Epw = this.A02;
        String str2 = enumC33425Epw.A05;
        A002.A02(str2);
        final String str3 = enumC33425Epw.A04;
        Long l = null;
        if (str3 != null && !AbstractC14490oL.A0J(context.getPackageManager(), str3)) {
            if (this.A00 == 0) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36314837549779812L)) {
                    InterfaceC60442pS interfaceC60442pS = this.A08;
                    String str4 = super.A07;
                    if (str4 != null) {
                        AbstractC73317Y7a.A0F(interfaceC60442pS, userSession, str4, A04(), str2, "app_not_found");
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                FragmentActivity fragmentActivity = this.A03;
                INK ink = new INK(fragmentActivity, userSession);
                if (ink.A01() && C18U.A06(c06090Tz, userSession, 36328577146371733L)) {
                    AbstractC14490oL.A06(fragmentActivity, ink, str3, "com.instagram.android");
                } else {
                    AbstractC14490oL.A07(context, str3, "com.instagram.android");
                }
                this.A00 = 1;
            }
        } else {
            C2EY c2ey = super.A05;
            F4W f4w = F4W.$redex_init_class;
            switch (c2ey.ordinal()) {
                case Process.SIGTERM /* 15 */:
                case 16:
                case 17:
                    Object obj = super.A06;
                    if ((obj instanceof User) && (user2 = (User) obj) != null) {
                        FragmentActivity fragmentActivity2 = this.A03;
                        AbstractC10360h2 abstractC10360h2 = this.A04;
                        AbstractC018607g abstractC018607g = this.A05;
                        InterfaceC60442pS interfaceC60442pS2 = this.A08;
                        String A04 = A04();
                        String str5 = this.A0B;
                        Runnable runnable = this.A0A;
                        String str6 = enumC33425Epw.A03;
                        if (str3 != null && str6 != null) {
                            boolean z = enumC33425Epw.A06;
                            Integer num = enumC33425Epw.A02;
                            C33125EjU c33125EjU = new C33125EjU(abstractC10360h2, fragmentActivity2, user2, interfaceC60442pS2, userSession, runnable, str2, str3, A04, str6, str5, 0, z);
                            C1ON A003 = FB1.A00(userSession, num, user2.getUsername(), interfaceC60442pS2.getModuleName());
                            if (A003 != null) {
                                A003.A00 = c33125EjU;
                                C1GJ.A00(fragmentActivity2, abstractC018607g, A003);
                                break;
                            } else {
                                Throwable A0g = AbstractC31178DnM.A0g(user2);
                                AbstractC31510Dsu.A0L(fragmentActivity2, interfaceC60442pS2, userSession, user2, runnable, AbstractC31178DnM.A0e(user2), A04, str6, str3, z);
                                AbstractC73317Y7a.A0H(interfaceC60442pS2, userSession, user2.getId(), A04, str2, A0g);
                                break;
                            }
                        }
                    }
                    break;
                case Process.SIGSTOP /* 19 */:
                    Object obj2 = super.A06;
                    if ((obj2 instanceof User) && (user = (User) obj2) != null && (A00 = C34978Fb5.A00.A00(userSession, user)) != null) {
                        AbstractC31510Dsu.A0M(this.A03, this.A08, userSession, enumC33425Epw, A00);
                        break;
                    }
                    break;
                case 20:
                case 37:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                case 49:
                    Object obj3 = super.A06;
                    if ((obj3 instanceof C38321qM) && (c38321qM = (C38321qM) obj3) != null) {
                        AbstractC31510Dsu.A0F(this.A03, this.A04, this.A05, userSession, c38321qM, this.A08, this.A09, enumC33425Epw, this.A0A, A04(), this.A0B, null);
                        break;
                    }
                    break;
                case 28:
                    Object obj4 = super.A06;
                    C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.model.reels.ReelItem");
                    C41181vS c41181vS2 = (C41181vS) obj4;
                    if (c41181vS2.A1K()) {
                        final FragmentActivity fragmentActivity3 = this.A03;
                        AbstractC10360h2 abstractC10360h22 = this.A04;
                        AbstractC018607g abstractC018607g2 = this.A05;
                        final String str7 = c41181vS2.A0k;
                        final String str8 = c41181vS2.A0j;
                        final InterfaceC60442pS interfaceC60442pS3 = this.A08;
                        final String A042 = A04();
                        final User user3 = c41181vS2.A0i;
                        if (user3 != null) {
                            String str9 = this.A0B;
                            Runnable runnable2 = this.A0A;
                            final String str10 = enumC33425Epw.A03;
                            if (str3 != null && str10 != null) {
                                final boolean z2 = enumC33425Epw.A06;
                                AbstractC31510Dsu.A0D(fragmentActivity3, abstractC10360h22, abstractC018607g2, new C2n2() { // from class: X.Fss
                                    @Override // X.C2n2
                                    public final Object apply(Object obj5) {
                                        String str11 = str3;
                                        String str12 = str10;
                                        boolean z3 = z2;
                                        Activity activity = fragmentActivity3;
                                        String str13 = str7;
                                        String str14 = str8;
                                        User user4 = user3;
                                        String str15 = A042;
                                        InterfaceC60442pS interfaceC60442pS4 = interfaceC60442pS3;
                                        UserSession userSession2 = userSession;
                                        String str16 = (String) obj5;
                                        if (str16 != null) {
                                            Bundle A03 = AbstractC31180DnO.A03(str16);
                                            if (str14 == null) {
                                                str14 = "";
                                            }
                                            AbstractC31510Dsu.A03(activity, A03, userSession2, interfaceC60442pS4, user4, str11, str12, str16, str13, str14, str15, false, z3);
                                            return null;
                                        }
                                        return null;
                                    }
                                }, userSession, interfaceC60442pS3, true, enumC33425Epw.A02, runnable2, str7, str8, user3.getId(), A042, str2, str9, true);
                                break;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        FragmentActivity fragmentActivity4 = this.A03;
                        AbstractC10360h2 abstractC10360h23 = this.A04;
                        AbstractC018607g abstractC018607g3 = this.A05;
                        InterfaceC60442pS interfaceC60442pS4 = this.A08;
                        String A043 = A04();
                        String str11 = this.A0B;
                        Runnable runnable3 = this.A0A;
                        String str12 = enumC33425Epw.A03;
                        if (str3 != null && str12 != null) {
                            boolean z3 = enumC33425Epw.A06;
                            Integer num2 = enumC33425Epw.A02;
                            User user4 = c41181vS2.A0i;
                            C38321qM c38321qM2 = c41181vS2.A0b;
                            if (user4 != null && c38321qM2 != null) {
                                C33132Ejb c33132Ejb = new C33132Ejb(fragmentActivity4, fragmentActivity4, abstractC10360h23, userSession, interfaceC60442pS4, c41181vS2, user4, runnable3, A043, str2, str3, str12, str11, z3);
                                AbstractC63248Sg4.A02(abstractC10360h23);
                                C1ON A02 = AbstractC35242Fgb.A02(userSession, num2, user4.getUsername(), c38321qM2.getId(), interfaceC60442pS4.getModuleName());
                                A02.A00 = c33132Ejb;
                                C1GJ.A00(fragmentActivity4, abstractC018607g3, A02);
                                break;
                            }
                        }
                    }
                    break;
                case 32:
                    Object obj5 = super.A06;
                    if ((obj5 instanceof C41181vS) && (c41181vS = (C41181vS) obj5) != null && (c105824pt = c41181vS.A0c) != null) {
                        FragmentActivity fragmentActivity5 = this.A03;
                        AbstractC10360h2 abstractC10360h24 = this.A04;
                        AbstractC018607g abstractC018607g4 = this.A05;
                        User A03 = c105824pt.A03();
                        String str13 = c105824pt.A0X;
                        str13.getClass();
                        String str14 = c105824pt.A0e;
                        str14.getClass();
                        AbstractC31510Dsu.A05(fragmentActivity5, null, abstractC10360h24, abstractC018607g4, this.A08, userSession, A03, this.A0A, str13, str14, A04(), str2, "");
                        break;
                    }
                    break;
                case 47:
                    Object obj6 = super.A06;
                    if ((obj6 instanceof C32775Ebf) && (c32775Ebf = (C32775Ebf) obj6) != null) {
                        FragmentActivity fragmentActivity6 = this.A03;
                        InterfaceC60442pS interfaceC60442pS5 = this.A08;
                        String str15 = c32775Ebf.A01;
                        String str16 = c32775Ebf.A03;
                        String A044 = A04();
                        String str17 = enumC33425Epw.A03;
                        if (str3 != null && str17 != null && str16 != null) {
                            AbstractC31510Dsu.A0N(fragmentActivity6, null, AbstractC31180DnO.A03(str16), interfaceC60442pS5, userSession, str3, str17, new GS5(str16, 1), false, enumC33425Epw.A06);
                            AbstractC73317Y7a.A0J(interfaceC60442pS5, userSession, str15, A044, str2, str16);
                            break;
                        }
                    }
                    break;
                case 58:
                    String str18 = super.A07;
                    if (str18 != null) {
                        FragmentActivity fragmentActivity7 = this.A03;
                        AbstractC10360h2 abstractC10360h25 = this.A04;
                        AbstractC018607g abstractC018607g5 = this.A05;
                        InterfaceC60442pS interfaceC60442pS6 = this.A08;
                        String A045 = A04();
                        Runnable runnable4 = this.A0A;
                        String str19 = enumC33425Epw.A03;
                        if (str3 != null && str19 != null) {
                            boolean z4 = enumC33425Epw.A06;
                            Integer num3 = enumC33425Epw.A02;
                            C33125EjU c33125EjU2 = new C33125EjU(abstractC10360h25, fragmentActivity7, context, interfaceC60442pS6, userSession, runnable4, str3, str19, str18, A045, str2, 1, z4);
                            C1ON A004 = AbstractC34299FAt.A00(userSession, num3, str18, interfaceC60442pS6.getModuleName());
                            A004.A00 = c33125EjU2;
                            C1GJ.A00(fragmentActivity7, abstractC018607g5, A004);
                            break;
                        }
                    }
                    break;
                case 59:
                    String str20 = super.A07;
                    if (str20 != null) {
                        FragmentActivity fragmentActivity8 = this.A03;
                        AbstractC10360h2 abstractC10360h26 = this.A04;
                        AbstractC018607g abstractC018607g6 = this.A05;
                        InterfaceC60442pS interfaceC60442pS7 = this.A08;
                        String A046 = A04();
                        Runnable runnable5 = this.A0A;
                        String str21 = enumC33425Epw.A03;
                        if (str3 != null && str21 != null) {
                            Integer num4 = enumC33425Epw.A02;
                            C33124EjT c33124EjT = new C33124EjT(fragmentActivity8, abstractC10360h26, interfaceC60442pS7, userSession, runnable5, str20, str21, str3, A046, str2, enumC33425Epw.A06);
                            C1ON A005 = AbstractC34304FAy.A00(userSession, num4, str20, interfaceC60442pS7.getModuleName());
                            A005.A00 = c33124EjT;
                            C1GJ.A00(fragmentActivity8, abstractC018607g6, A005);
                            break;
                        }
                    }
                    break;
                case 89:
                    EnumC33510Erj enumC33510Erj = this.A06;
                    if (enumC33510Erj != null) {
                        FragmentActivity fragmentActivity9 = this.A03;
                        AbstractC10360h2 abstractC10360h27 = this.A04;
                        AbstractC018607g abstractC018607g7 = this.A05;
                        InterfaceC60442pS interfaceC60442pS8 = this.A08;
                        Runnable runnable6 = this.A0A;
                        String str22 = enumC33425Epw.A03;
                        if (str3 != null && str22 != null) {
                            C33122EjR c33122EjR = new C33122EjR(fragmentActivity9, abstractC10360h27, enumC33510Erj, interfaceC60442pS8, userSession, enumC33425Epw, runnable6, str3, str22);
                            C1ON A006 = AbstractC34303FAx.A00(null, userSession, enumC33425Epw.A01);
                            A006.A00 = c33122EjR;
                            C1GJ.A00(fragmentActivity9, abstractC018607g7, A006);
                            break;
                        }
                    }
                    break;
                case 91:
                    AbstractC31510Dsu.A06(this.A03, view, this.A04, this.A05, this.A08, userSession, enumC33425Epw, this.A0A, "");
                    break;
                case 99:
                    Object obj7 = super.A06;
                    if ((obj7 instanceof InviteLinkShareInfo) && (inviteLinkShareInfo = (InviteLinkShareInfo) obj7) != null) {
                        FragmentActivity fragmentActivity10 = this.A03;
                        String str23 = inviteLinkShareInfo.A06;
                        if (str23 != null) {
                            AbstractC31510Dsu.A0M(fragmentActivity10, this.A08, userSession, enumC33425Epw, str23);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    break;
                case 100:
                    Object obj8 = super.A06;
                    if ((obj8 instanceof ChannelChallengeShareInfo) && (channelChallengeShareInfo = (ChannelChallengeShareInfo) obj8) != null) {
                        AbstractC31510Dsu.A08(this.A03, view, this.A08, userSession, channelChallengeShareInfo, enumC33425Epw, A04(), "");
                        break;
                    }
                    break;
                case 103:
                    Object obj9 = super.A06;
                    if ((obj9 instanceof InviteLinkShareInfo) && (inviteLinkShareInfo2 = (InviteLinkShareInfo) obj9) != null) {
                        if (enumC33425Epw != EnumC33425Epw.A0N && enumC33425Epw != EnumC33425Epw.A0O) {
                            uri = null;
                        } else {
                            uri = inviteLinkShareInfo2.A03;
                        }
                        FragmentActivity fragmentActivity11 = this.A03;
                        String str24 = inviteLinkShareInfo2.A06;
                        if (str24 != null) {
                            InterfaceC60442pS interfaceC60442pS9 = this.A08;
                            String str25 = enumC33425Epw.A03;
                            boolean z5 = enumC33425Epw.A06;
                            if (str25 == null) {
                                str25 = "";
                            }
                            AbstractC31510Dsu.A0N(fragmentActivity11, uri, AbstractC31180DnO.A03(str24), interfaceC60442pS9, userSession, str3, str25, AbstractC31180DnO.A0o(str24), false, z5);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    break;
                case 104:
                    Object obj10 = super.A06;
                    if ((obj10 instanceof C32772Ebc) && (c32772Ebc = (C32772Ebc) obj10) != null) {
                        str = c32772Ebc.A01;
                    } else {
                        str = null;
                    }
                    AbstractC31510Dsu.A0M(this.A03, this.A08, userSession, enumC33425Epw, str);
                    break;
                default:
                    throw AbstractC167007dF.A0c("unsupported content type: ", c2ey.name());
            }
            this.A00 = 2;
        }
        C2EY c2ey2 = super.A05;
        F4W f4w2 = F4W.$redex_init_class;
        int ordinal = c2ey2.ordinal();
        if (ordinal != 28) {
            if (ordinal != 89) {
                if (c2ey2 == C2EY.A0S) {
                    Object obj11 = super.A06;
                    C14360o3.A0C(obj11, "null cannot be cast to non-null type com.instagram.direct.groupinvites.models.InviteLinkShareInfo");
                    FUY.A01(userSession, (InviteLinkShareInfo) obj11, A02());
                }
                if (c2ey2 == C2EY.A0R) {
                    Object obj12 = super.A06;
                    C14360o3.A0C(obj12, "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo");
                    FUY.A00(userSession, (ChannelChallengeShareInfo) obj12, A02());
                }
                Long l2 = super.A02;
                if (l2 == null) {
                    int indexOf = A002.A01(c2ey2, false).indexOf(str2);
                    Integer valueOf = Integer.valueOf(indexOf);
                    if (indexOf >= 0 && valueOf != null) {
                        l = AbstractC31171DnF.A0V(indexOf);
                    }
                } else {
                    l = l2;
                }
                AbstractC73317Y7a.A07(this.A08, userSession, null, l, super.A01, super.A07, A04(), str2, A03(), this.A0B, this.A0C, this.A0D, A05(), super.A03);
                return;
            }
            EnumC33510Erj enumC33510Erj2 = this.A06;
            if (enumC33510Erj2 == null || (enumC33500ErZ = enumC33425Epw.A00) == null) {
                return;
            }
            AbstractC35249Fgi.A03(enumC33510Erj2, enumC33500ErZ, userSession, C54P.A01(context, userSession));
        }
    }
}
