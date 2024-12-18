package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Ffz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35207Ffz {
    public static final C34976Fb3 A0c = new Object();
    public int A00;
    public View A01;
    public RecyclerView A02;
    public C31885Dzr A03;
    public C35001FbY A04;
    public C34505FIr A05;
    public String A06;
    public List A07;
    public boolean A08;
    public final Context A09;
    public final FragmentActivity A0A;
    public final UserSession A0B;
    public final C57112jm A0C;
    public final C36312G0h A0D;
    public final InterfaceC37195Ga6 A0E;
    public final InterfaceC60442pS A0F;
    public final C2EY A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final Fragment A0M;
    public final AbstractC10360h2 A0N;
    public final AbstractC018607g A0O;
    public final EnumC33510Erj A0P;
    public final InterfaceC37290Gbr A0Q;
    public final InterfaceC685936w A0R;
    public final C75113Zb A0S;
    public final Long A0T;
    public final Runnable A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    private final boolean A01(Object obj) {
        if (this.A0G != C2EY.A1R || !(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        String id = user.getId();
        UserSession userSession = this.A0B;
        if (!AbstractC31171DnF.A1W(userSession, id)) {
            if (AbstractC31171DnF.A1W(userSession, user.getId())) {
                return false;
            }
            if (!AbstractC166997dE.A1Z(user.A0J(), false) && !user.A26()) {
                return false;
            }
        }
        return true;
    }

    public final List A02() {
        Object Aqz = this.A0E.Aqz();
        if (Aqz == null) {
            return C16930sl.A00;
        }
        return A00(this, Aqz);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0058. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v100, types: [X.Ecw] */
    /* JADX WARN: Type inference failed for: r4v116, types: [X.Ecy] */
    /* JADX WARN: Type inference failed for: r4v143, types: [X.Ecs] */
    /* JADX WARN: Type inference failed for: r4v23, types: [X.Ecr] */
    /* JADX WARN: Type inference failed for: r4v29, types: [X.Ecv] */
    /* JADX WARN: Type inference failed for: r4v42, types: [X.Ect] */
    /* JADX WARN: Type inference failed for: r4v50, types: [X.Ed4] */
    /* JADX WARN: Type inference failed for: r4v55, types: [X.Ecz] */
    /* JADX WARN: Type inference failed for: r4v62, types: [X.Ecx] */
    /* JADX WARN: Type inference failed for: r4v75, types: [X.Ecq] */
    /* JADX WARN: Type inference failed for: r4v95, types: [X.Ecp] */
    /* JADX WARN: Type inference failed for: r5v19, types: [X.Ed1] */
    /* JADX WARN: Type inference failed for: r6v17, types: [X.Ecy] */
    /* JADX WARN: Type inference failed for: r6v37, types: [X.Ed0] */
    public static final ArrayList A00(C35207Ffz c35207Ffz, Object obj) {
        C38321qM c38321qM;
        ImageUrl A0T;
        int i;
        int i2;
        AbstractC32861Ed3 abstractC32861Ed3;
        AbstractC32861Ed3 abstractC32861Ed32;
        C32852Ecu c32852Ecu;
        AbstractC32861Ed3 abstractC32861Ed33;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = C35163Ff5.A07;
        UserSession userSession = c35207Ffz.A0B;
        Context context = c35207Ffz.A09;
        C35163Ff5 A00 = F4Y.A00(AbstractC166987dD.A0O(context), userSession);
        C2EY c2ey = c35207Ffz.A0G;
        boolean z = c35207Ffz.A0Z;
        ArrayList A01 = A00.A01(c2ey, z);
        AbstractC35062FcZ.A02(userSession).A00.markerAnnotate(145754014, "initial_ranking", AbstractC001800i.A0P(", ", "", "", A01, null));
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C38321qM c38321qM2 = null;
            switch (A1B.hashCode()) {
                case -2133928234:
                    if (A1B.equals("add_content_note") && (obj instanceof C38321qM) && (c38321qM = (C38321qM) obj) != null) {
                        C79313gc c79313gc = new C79313gc(c38321qM, null);
                        if (c2ey != C2EY.A0W && c2ey != C2EY.A1F) {
                            break;
                        } else if (!AbstractC79333ge.A00(userSession, c79313gc)) {
                            break;
                        } else {
                            C35232FgP c35232FgP = C35232FgP.A00;
                            if (!c35232FgP.A04(userSession)) {
                                break;
                            } else {
                                if (c35232FgP.A05(userSession)) {
                                    A0T = c38321qM.A1S();
                                    if (A0T == null) {
                                        break;
                                    }
                                } else {
                                    A0T = AbstractC31174DnI.A0T(userSession, C17060sy.A01);
                                }
                                c32852Ecu = new C32852Ecu(A0T, c35207Ffz.A0Q, c2ey, obj, AbstractC167007dF.A1M(c38321qM.Cff() ? 1 : 0));
                                A1E.add(c32852Ecu);
                                break;
                            }
                        }
                    }
                    break;
                case -1628054559:
                    if (A1B.equals("add_to_audio_note") && c2ey == C2EY.A1U && !c35207Ffz.A0L) {
                        c32852Ecu = new C32849Ecr(c35207Ffz.A0Q, c2ey, obj);
                        A1E.add(c32852Ecu);
                        break;
                    }
                    break;
                case -1499838031:
                    if (A1B.equals("direct_message") && c2ey == C2EY.A1R && (obj instanceof User)) {
                        User user = (User) obj;
                        if (!AbstractC31174DnI.A1Y(user, userSession.userId) && (!AbstractC166997dE.A1Z(user.A0J(), true) || user.A26())) {
                            c32852Ecu = new C32853Ecv(c35207Ffz.A0A, context, c35207Ffz.A0M, userSession, c35207Ffz.A0F, c2ey, user);
                            A1E.add(c32852Ecu);
                            break;
                        }
                    }
                    break;
                case -1436108013:
                    if (!A1B.equals("messenger")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS = c35207Ffz.A0F;
                        C75113Zb c75113Zb = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h2 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g = c35207Ffz.A0O;
                        Runnable runnable = c35207Ffz.A0U;
                        EnumC33510Erj enumC33510Erj = c35207Ffz.A0P;
                        String str = c35207Ffz.A0X;
                        String str2 = c35207Ffz.A0Y;
                        String str3 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g, 9);
                        abstractC32861Ed3 = new AbstractC32861Ed3(context, fragmentActivity, abstractC10360h2, abstractC018607g, enumC33510Erj, userSession, interfaceC60442pS, c75113Zb, c2ey, EnumC33425Epw.A0H, obj, runnable, str, str2, str3, R.drawable.instagram_app_messenger_pano_outline_24, 2131960177);
                        A1E.add(abstractC32861Ed3);
                        break;
                    }
                case -1273433329:
                    if (A1B.equals("add_to_your_story") && c35207Ffz.A00 != 0 && c35207Ffz.A0E.CYB() && !(obj instanceof C41181vS)) {
                        if (C35232FgP.A02(userSession, c35207Ffz.A0a, AbstractC31175DnJ.A1V(C06090Tz.A05, userSession), !c35207Ffz.A0b) && !c35207Ffz.A01(obj)) {
                            break;
                        } else {
                            c32852Ecu = new C32851Ect(c35207Ffz.A0Q, c2ey, obj, c35207Ffz.A00);
                            A1E.add(c32852Ecu);
                            break;
                        }
                    }
                    break;
                case -1268958287:
                    if (A1B.equals("follow") && c2ey == C2EY.A1R && (obj instanceof User)) {
                        User user2 = (User) obj;
                        if (!AbstractC31174DnI.A1Y(user2, userSession.userId)) {
                            int ordinal = user2.B7L().ordinal();
                            if (ordinal != 4) {
                                i = R.drawable.instagram_user_requested_pano_outline_24;
                                if (ordinal != 5) {
                                    i = R.drawable.instagram_user_follow_pano_outline_24;
                                }
                                i2 = 2131960446;
                                if (ordinal != 5) {
                                    i2 = 2131960442;
                                }
                            } else {
                                i = R.drawable.instagram_user_following_pano_outline_24;
                                i2 = 2131960443;
                            }
                            c32852Ecu = new C32862Ed4(context, userSession, c2ey, user2, i, i2);
                            A1E.add(c32852Ecu);
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case -1240898147:
                    if (A1B.equals("add_to_channel") && c35207Ffz.A08 && ((obj instanceof C38321qM) || (obj instanceof C41181vS))) {
                        c32852Ecu = new C32857Ecz(context, c35207Ffz.A0M, c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, userSession, c35207Ffz.A0Q, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, obj, c35207Ffz.A0U);
                        A1E.add(c32852Ecu);
                        break;
                    }
                    break;
                case -1209041162:
                    if (A1B.equals("direct_sharesheet") && c2ey == C2EY.A1R && (obj instanceof User)) {
                        User user3 = (User) obj;
                        if (!AbstractC31174DnI.A1Y(user3, userSession.userId) || (AbstractC31174DnI.A1Y(user3, userSession.userId) && C18U.A06(C06090Tz.A05, userSession, 36327335901149697L))) {
                            c32852Ecu = new C32855Ecx(c35207Ffz.A0A, userSession, new FFW(c35207Ffz), c35207Ffz.A0F, c2ey, user3, c35207Ffz.A06, z);
                            A1E.add(c32852Ecu);
                            break;
                        }
                    }
                    break;
                case -1183699191:
                    if (A1B.equals("invite") && c2ey == C2EY.A1R && (obj instanceof User) && AbstractC31171DnF.A1W(userSession, AbstractC31171DnF.A0g(obj)) && C54P.A01(context, userSession)) {
                        c32852Ecu = new C32848Ecq(c35207Ffz.A0Q, c2ey, obj);
                        A1E.add(c32852Ecu);
                        break;
                    }
                    break;
                case -916346253:
                    if (!A1B.equals("twitter")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS2 = c35207Ffz.A0F;
                        C75113Zb c75113Zb2 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity2 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h22 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g2 = c35207Ffz.A0O;
                        Runnable runnable2 = c35207Ffz.A0U;
                        String str4 = c35207Ffz.A0X;
                        String str5 = c35207Ffz.A0Y;
                        String str6 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g2, 9);
                        abstractC32861Ed33 = new AbstractC32861Ed3(context, fragmentActivity2, abstractC10360h22, abstractC018607g2, null, userSession, interfaceC60442pS2, c75113Zb2, c2ey, EnumC33425Epw.A0O, obj, runnable2, str4, str5, str6, R.drawable.instagram_app_x_pano_outline_24, 2131960189);
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                case -401297215:
                    if (A1B.equals("profile_card_download") && c35207Ffz.A01(obj)) {
                        abstractC32861Ed33 = new C32856Ecy(userSession, c35207Ffz.A0Q, c35207Ffz.A0F, c2ey, null, obj, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W, "profile_card_download");
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                    break;
                case -266143003:
                    if (!A1B.equals("user_sms")) {
                        break;
                    } else {
                        abstractC32861Ed3 = new C32859Ed1(c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, c35207Ffz.A0P, userSession, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, AbstractC31171DnF.A0V(A1E.size()), obj, c35207Ffz.A0U, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W);
                        A1E.add(abstractC32861Ed3);
                        break;
                    }
                case 3016245:
                    if (!A1B.equals("band")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS3 = c35207Ffz.A0F;
                        C75113Zb c75113Zb3 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity3 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h23 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g3 = c35207Ffz.A0O;
                        Runnable runnable3 = c35207Ffz.A0U;
                        String str7 = c35207Ffz.A0X;
                        String str8 = c35207Ffz.A0Y;
                        C14360o3.A0B(abstractC018607g3, 9);
                        abstractC32861Ed3 = new AbstractC32861Ed3(context, fragmentActivity3, abstractC10360h23, abstractC018607g3, null, userSession, interfaceC60442pS3, c75113Zb3, c2ey, EnumC33425Epw.A0A, obj, runnable3, str7, str8, null, R.drawable.instagram_app_band_pano_outline_24, 2131960171);
                        A1E.add(abstractC32861Ed3);
                        break;
                    }
                case 3321844:
                    if (!A1B.equals("line")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS4 = c35207Ffz.A0F;
                        C75113Zb c75113Zb4 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity4 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h24 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g4 = c35207Ffz.A0O;
                        Runnable runnable4 = c35207Ffz.A0U;
                        String str9 = c35207Ffz.A0X;
                        String str10 = c35207Ffz.A0Y;
                        String str11 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g4, 9);
                        abstractC32861Ed33 = new AbstractC32861Ed3(context, fragmentActivity4, abstractC10360h24, abstractC018607g4, null, userSession, interfaceC60442pS4, c75113Zb4, c2ey, EnumC33425Epw.A0G, obj, runnable4, str9, str10, str11, R.drawable.instagram_app_line_pano_outline_24, 2131960176);
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                case 3522941:
                    if (A1B.equals("save") && (!(obj instanceof C41181vS) || !(obj instanceof InviteLinkShareInfo))) {
                        c32852Ecu = new C32854Ecw(c35207Ffz.A0Q, c35207Ffz.A0R, c35207Ffz.A0S, c2ey, obj, AbstractC35184Ffb.A03(userSession));
                        A1E.add(c32852Ecu);
                        break;
                    }
                    break;
                case 164757360:
                    if (A1B.equals("add_to_wall") && (c2ey == C2EY.A0W || c2ey == C2EY.A1F)) {
                        C28411Zc.A00();
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession, 36322297904113774L) && C18U.A06(c06090Tz, userSession, 36322297904506996L)) {
                            c32852Ecu = new C32847Ecp(c35207Ffz.A0Q, c2ey, obj);
                            A1E.add(c32852Ecu);
                            break;
                        }
                    }
                    break;
                case 284397090:
                    if (!A1B.equals("snapchat")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS5 = c35207Ffz.A0F;
                        C75113Zb c75113Zb5 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity5 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h25 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g5 = c35207Ffz.A0O;
                        Runnable runnable5 = c35207Ffz.A0U;
                        EnumC33510Erj enumC33510Erj2 = c35207Ffz.A0P;
                        String str12 = c35207Ffz.A0X;
                        String str13 = c35207Ffz.A0Y;
                        String str14 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g5, 9);
                        abstractC32861Ed33 = new AbstractC32861Ed3(context, fragmentActivity5, abstractC10360h25, abstractC018607g5, enumC33510Erj2, userSession, interfaceC60442pS5, c75113Zb5, c2ey, EnumC33425Epw.A0L, obj, runnable5, str12, str13, str14, R.drawable.instagram_snapchat_pano_outline_24, 2131960183);
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                case 389639919:
                    if (!A1B.equals("system_share_sheet")) {
                        break;
                    } else {
                        abstractC32861Ed33 = new C32858Ed0(c35207Ffz.A0M, c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, c35207Ffz.A0P, userSession, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, obj, c35207Ffz.A0U, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W);
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                case 486515695:
                    if (!A1B.equals("kakaotalk")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS6 = c35207Ffz.A0F;
                        C75113Zb c75113Zb6 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity6 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h26 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g6 = c35207Ffz.A0O;
                        Runnable runnable6 = c35207Ffz.A0U;
                        String str15 = c35207Ffz.A0X;
                        String str16 = c35207Ffz.A0Y;
                        String str17 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g6, 9);
                        abstractC32861Ed3 = new AbstractC32861Ed3(context, fragmentActivity6, abstractC10360h26, abstractC018607g6, null, userSession, interfaceC60442pS6, c75113Zb6, c2ey, EnumC33425Epw.A0F, obj, runnable6, str15, str16, str17, R.drawable.instagram_app_kakaotalk_pano_outline_24, 2131960175);
                        A1E.add(abstractC32861Ed3);
                        break;
                    }
                case 497130182:
                    if (!A1B.equals("facebook")) {
                        break;
                    } else {
                        if (obj instanceof C38321qM) {
                            c38321qM2 = (C38321qM) obj;
                        }
                        if (!C79923hh.A09(userSession, c38321qM2)) {
                            abstractC32861Ed33 = new C32846Eco(context, c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, userSession, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, obj, c35207Ffz.A0U, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W);
                            A1E.add(abstractC32861Ed33);
                            break;
                        } else {
                            break;
                        }
                    }
                case 1505434244:
                    if (A1B.equals("copy_link") && (c2ey != C2EY.A1Q || !C18U.A06(C06090Tz.A05, userSession, 36314837549648739L))) {
                        A1E.add(new C32860Ed2(c35207Ffz.A0M, c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, c35207Ffz.A0P, userSession, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, AbstractC31171DnF.A0V(A1E.size()), obj, c35207Ffz.A0U, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W));
                        break;
                    }
                    break;
                case 1534364196:
                    if (!A1B.equals("clips_download")) {
                        break;
                    } else {
                        if (obj instanceof C38321qM) {
                            c38321qM2 = (C38321qM) obj;
                        }
                        if (C55220Oej.A00.A0A(userSession, c38321qM2) && C55220Oej.A07(userSession, true)) {
                            c32852Ecu = new C32856Ecy(userSession, c35207Ffz.A0Q, c35207Ffz.A0F, c2ey, AbstractC31171DnF.A0V(A1E.size()), obj, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W, "clips_download");
                            A1E.add(c32852Ecu);
                            break;
                        }
                    }
                    break;
                case 1539093419:
                    if (A1B.equals("barcelona") && c35207Ffz.A0E.CY8()) {
                        C06090Tz c06090Tz2 = C06090Tz.A05;
                        int A07 = AbstractC25225BEi.A07(c06090Tz2, userSession, 36602243872526970L) - 1;
                        if (c2ey != C2EY.A1R && A07 >= 0 && A07 < A1E.size() && !C18U.A06(c06090Tz2, userSession, 36321894177318783L)) {
                            int A072 = AbstractC25225BEi.A07(c06090Tz2, userSession, 36602243872526970L) - 1;
                            InterfaceC60442pS interfaceC60442pS7 = c35207Ffz.A0F;
                            C75113Zb c75113Zb7 = c35207Ffz.A0S;
                            FragmentActivity fragmentActivity7 = c35207Ffz.A0A;
                            AbstractC10360h2 abstractC10360h27 = c35207Ffz.A0N;
                            AbstractC018607g abstractC018607g7 = c35207Ffz.A0O;
                            Runnable runnable7 = c35207Ffz.A0U;
                            String str18 = c35207Ffz.A0X;
                            String str19 = c35207Ffz.A0Y;
                            String str20 = c35207Ffz.A0W;
                            C14360o3.A0B(abstractC018607g7, 9);
                            A1E.add(A072, new AbstractC32861Ed3(context, fragmentActivity7, abstractC10360h27, abstractC018607g7, null, userSession, interfaceC60442pS7, c75113Zb7, c2ey, EnumC33425Epw.A0B, obj, runnable7, str18, str19, str20, R.drawable.instagram_app_threads_pano_outline_24, 2131960187));
                            break;
                        } else {
                            InterfaceC60442pS interfaceC60442pS8 = c35207Ffz.A0F;
                            C75113Zb c75113Zb8 = c35207Ffz.A0S;
                            FragmentActivity fragmentActivity8 = c35207Ffz.A0A;
                            AbstractC10360h2 abstractC10360h28 = c35207Ffz.A0N;
                            AbstractC018607g abstractC018607g8 = c35207Ffz.A0O;
                            Runnable runnable8 = c35207Ffz.A0U;
                            String str21 = c35207Ffz.A0X;
                            String str22 = c35207Ffz.A0Y;
                            String str23 = c35207Ffz.A0W;
                            C14360o3.A0B(abstractC018607g8, 9);
                            abstractC32861Ed32 = new AbstractC32861Ed3(context, fragmentActivity8, abstractC10360h28, abstractC018607g8, null, userSession, interfaceC60442pS8, c75113Zb8, c2ey, EnumC33425Epw.A0B, obj, runnable8, str21, str22, str23, R.drawable.instagram_app_threads_pano_outline_24, 2131960187);
                            A1E.add(abstractC32861Ed32);
                            break;
                        }
                    }
                    break;
                case 1671380268:
                    if (!A1B.equals("discord")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS9 = c35207Ffz.A0F;
                        C75113Zb c75113Zb9 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity9 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h29 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g9 = c35207Ffz.A0O;
                        Runnable runnable9 = c35207Ffz.A0U;
                        String str24 = c35207Ffz.A0X;
                        String str25 = c35207Ffz.A0Y;
                        String str26 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g9, 9);
                        abstractC32861Ed32 = new AbstractC32861Ed3(context, fragmentActivity9, abstractC10360h29, abstractC018607g9, null, userSession, interfaceC60442pS9, c75113Zb9, c2ey, EnumC33425Epw.A0D, obj, runnable9, str24, str25, str26, R.drawable.instagram_app_discord_pano_outline_24, 2131960173);
                        A1E.add(abstractC32861Ed32);
                        break;
                    }
                case 1687614991:
                    if (A1B.equals("view_profile") && c2ey == C2EY.A1R && (obj instanceof User) && C18U.A06(C06090Tz.A05, userSession, 36327335901215234L)) {
                        c32852Ecu = new C32850Ecs(c35207Ffz.A0A, c2ey, obj);
                        A1E.add(c32852Ecu);
                        break;
                    }
                    break;
                case 1898136107:
                    if (!A1B.equals("system_share_sheet_share_to")) {
                        break;
                    } else {
                        abstractC32861Ed33 = new C32858Ed0(c35207Ffz.A0M, c35207Ffz.A0A, c35207Ffz.A0N, c35207Ffz.A0O, c35207Ffz.A0P, userSession, c35207Ffz.A0F, c35207Ffz.A0S, c2ey, obj, c35207Ffz.A0U, c35207Ffz.A0X, c35207Ffz.A0Y, c35207Ffz.A0W);
                        A1E.add(abstractC32861Ed33);
                        break;
                    }
                case 1934780818:
                    if (!A1B.equals("whatsapp")) {
                        break;
                    } else {
                        InterfaceC60442pS interfaceC60442pS10 = c35207Ffz.A0F;
                        C75113Zb c75113Zb10 = c35207Ffz.A0S;
                        FragmentActivity fragmentActivity10 = c35207Ffz.A0A;
                        AbstractC10360h2 abstractC10360h210 = c35207Ffz.A0N;
                        AbstractC018607g abstractC018607g10 = c35207Ffz.A0O;
                        Runnable runnable10 = c35207Ffz.A0U;
                        EnumC33510Erj enumC33510Erj3 = c35207Ffz.A0P;
                        String str27 = c35207Ffz.A0X;
                        String str28 = c35207Ffz.A0Y;
                        String str29 = c35207Ffz.A0W;
                        C14360o3.A0B(abstractC018607g10, 9);
                        A1E.add(new AbstractC32861Ed3(context, fragmentActivity10, abstractC10360h210, abstractC018607g10, enumC33510Erj3, userSession, interfaceC60442pS10, c75113Zb10, c2ey, EnumC33425Epw.A0N, obj, runnable10, str27, str28, str29, R.drawable.instagram_app_whatsapp_pano_outline_24, 2131960188));
                        break;
                    }
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            AbstractC35044FcH abstractC35044FcH = (AbstractC35044FcH) it2.next();
            String str30 = abstractC35044FcH.A08;
            C14360o3.A07(str30);
            A1E2.add(str30);
            abstractC35044FcH.A03 = c35207Ffz.A0V;
            abstractC35044FcH.A01 = c35207Ffz.A0T;
        }
        AbstractC35062FcZ.A02(userSession).A00.markerAnnotate(145754014, "final_ranking", AbstractC001800i.A0P(", ", "", "", A1E2, null));
        java.util.Set A0k = AbstractC001800i.A0k(A1E2);
        Iterator it3 = A01.iterator();
        while (it3.hasNext()) {
            String A1B2 = AbstractC166987dD.A1B(it3);
            if (!A0k.contains(A1B2)) {
                AbstractC35062FcZ.A00(userSession).markerPoint(145754014, AbstractC166997dE.A10(Locale.ROOT, AnonymousClass001.A0R("HSCROLL_HIDE_", A1B2)));
            }
        }
        return A1E;
    }

    public C35207Ffz(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, EnumC33510Erj enumC33510Erj, UserSession userSession, C57112jm c57112jm, InterfaceC37290Gbr interfaceC37290Gbr, InterfaceC37195Ga6 interfaceC37195Ga6, InterfaceC685936w interfaceC685936w, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C2EY c2ey, Long l, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167027dH.A0a(1, context, userSession, interfaceC60442pS, fragmentActivity);
        AbstractC25234BEr.A0l(7, abstractC10360h2, c57112jm, c2ey, runnable);
        C14360o3.A0B(str4, 24);
        this.A09 = context;
        this.A0B = userSession;
        this.A0F = interfaceC60442pS;
        this.A0A = fragmentActivity;
        this.A0M = fragment;
        this.A0E = interfaceC37195Ga6;
        this.A0N = abstractC10360h2;
        this.A0O = abstractC018607g;
        this.A0C = c57112jm;
        this.A0G = c2ey;
        this.A0U = runnable;
        this.A0Q = interfaceC37290Gbr;
        this.A0R = interfaceC685936w;
        this.A0S = c75113Zb;
        this.A0J = z;
        this.A0P = enumC33510Erj;
        this.A0X = str;
        this.A0Y = str2;
        this.A0W = str3;
        this.A0a = z2;
        this.A0b = z3;
        this.A0Z = z4;
        this.A0L = z5;
        this.A0H = str4;
        this.A0I = z6;
        this.A0T = l;
        this.A0V = str5;
        this.A0K = z7;
        this.A0D = new C36312G0h(interfaceC60442pS, userSession);
        this.A07 = C16930sl.A00;
        this.A08 = true;
    }
}
