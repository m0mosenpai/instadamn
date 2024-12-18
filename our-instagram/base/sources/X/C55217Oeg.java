package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oeg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55217Oeg {
    public static final C55217Oeg A01 = new Object();
    public static final Handler A00 = AbstractC167007dF.A0J();

    public static final RunnableC36962GQf A01(InterfaceC58140Pq5 interfaceC58140Pq5, UserSession userSession, C38321qM c38321qM, String str, java.util.Set set, int i) {
        AbstractC167017dG.A1S(userSession, str);
        A06(interfaceC58140Pq5, userSession, c38321qM, set);
        String A0j = AbstractC167017dG.A0j();
        C166057bY c166057bY = (C166057bY) userSession.A01(C166057bY.class, new C29906DGu(userSession, 2));
        String id = c38321qM.getId();
        if (id != null) {
            C1ON A03 = AbstractC55152OdF.A03(userSession, id, str, A04(set));
            A03.A00 = new C52223N9m(c166057bY, interfaceC58140Pq5, userSession, c38321qM, A0j, set);
            RunnableC36962GQf runnableC36962GQf = new RunnableC36962GQf(c166057bY, A03, A0j);
            A00.postDelayed(runnableC36962GQf, i);
            return runnableC36962GQf;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final RunnableC56973PPo A02(InterfaceC58140Pq5 interfaceC58140Pq5, UserSession userSession, C38321qM c38321qM, java.util.Set set) {
        String id = c38321qM.getId();
        if (id != null) {
            HashSet A04 = A04(set);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("upsells/async_get_comment_delete_upsell/");
            A0c.A0R(N2Y.class, ONN.class);
            A0c.AA6("comment_ids_to_delete", AbstractC001800i.A0a(A04).toString());
            A0c.A9s("media_id", id);
            C1ON A0P = AbstractC31176DnK.A0P(A0c);
            A0P.A00 = new NAC(0, set, interfaceC58140Pq5, c38321qM, userSession);
            RunnableC56973PPo runnableC56973PPo = new RunnableC56973PPo(A0P);
            Handler handler = A00;
            ArrayList arrayList = AbstractC47145Kse.A00;
            handler.postDelayed(runnableC56973PPo, AbstractC34043F0w.A00(userSession));
            return runnableC56973PPo;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A03(Context context, UserSession userSession, C38321qM c38321qM, boolean z) {
        int i;
        PromptStickerModel A0E;
        AbstractC167007dF.A1D(userSession, 1, c38321qM);
        if (context == null) {
            return null;
        }
        boolean z2 = true;
        boolean A1W = AbstractC167007dF.A1W(c38321qM.A0C.AvS());
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P == null || !A1P.getHasBeenMashedUp()) {
            z2 = false;
        }
        boolean A1Z = AbstractC166997dE.A1Z(c38321qM.A0C.BZt(), true);
        List A3w = c38321qM.A3w(EnumC75383a5.A0I);
        boolean z3 = false;
        if (A3w != null && !A3w.isEmpty() && (A0E = ((C84823qW) A3w.get(0)).A0E()) != null && A0E.A0E) {
            z3 = true;
        }
        List A3w2 = c38321qM.A3w(EnumC75383a5.A0J);
        boolean z4 = false;
        if (A3w2 != null && !A3w2.isEmpty() && ((C84823qW) A3w2.get(0)).A0O != null) {
            z4 = true;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        int i2 = 2131957660;
        if (z) {
            i2 = 2131957605;
        }
        AbstractC31172DnG.A1D(context, A1C, i2);
        if (A1W) {
            A1C.append("\n\n");
            AbstractC31172DnG.A1D(context, A1C, 2131971977);
            A1C.append("\n\n");
            i = 2131971976;
        } else if (!z3 && !z4) {
            if (z2) {
                if (A1Z) {
                    A1C.append("\n\n");
                    i = 2131957662;
                } else {
                    A1C.append("\n\n");
                    i = 2131972575;
                }
            } else if (A1Z) {
                A1C.append("\n\n");
                i = 2131957661;
            } else {
                if (!C2TN.A01(userSession)) {
                    A1C.append("\n\n");
                    i = 2131957657;
                }
                return A1C.toString();
            }
        } else {
            A1C.append("\n\n");
            AbstractC31172DnG.A1D(context, A1C, 2131957658);
            if (z3) {
                A1C.append("\n\n");
                i = 2131957659;
            }
            return A1C.toString();
        }
        AbstractC31172DnG.A1D(context, A1C, i);
        return A1C.toString();
    }

    public static final EnumC53178Nfa A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 103422:
                    if (str.equals("hmc")) {
                        return EnumC53178Nfa.A06;
                    }
                    break;
                case 93832333:
                    if (str.equals("block")) {
                        return EnumC53178Nfa.A02;
                    }
                    break;
                case 154679679:
                    if (str.equals("suggested_hidden_words_upsell_v2")) {
                        return EnumC53178Nfa.A05;
                    }
                    break;
                case 435254300:
                    if (str.equals("suggested_hidden_words_upsell")) {
                        return EnumC53178Nfa.A04;
                    }
                    break;
                case 602896713:
                    if (str.equals("block_comments_from_upsell")) {
                        return EnumC53178Nfa.A03;
                    }
                    break;
                case 863339006:
                    if (str.equals("hrt_block_comments_from_upsell")) {
                        return EnumC53178Nfa.A07;
                    }
                    break;
            }
        }
        return EnumC53178Nfa.A08;
    }

    public static final HashSet A04(java.util.Set set) {
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A1H.add(((C84923qg) it.next()).A0G);
        }
        return A1H;
    }

    public static final void A05(EnumC53178Nfa enumC53178Nfa, InterfaceC58140Pq5 interfaceC58140Pq5, C38321qM c38321qM, String str, List list, List list2, java.util.Set set) {
        for (C84923qg c84923qg : AbstractC001800i.A0j(set)) {
            EnumC84933qh enumC84933qh = EnumC84933qh.A03;
            c38321qM.A4B(enumC84933qh, c84923qg.A0G);
            c84923qg.A06 = enumC84933qh;
        }
        c38321qM.A41(AbstractC001800i.A0j(set).size());
        if (interfaceC58140Pq5 != null) {
            interfaceC58140Pq5.Df0(enumC53178Nfa, str, list, list2, AbstractC001800i.A0j(set));
        }
    }

    public static final void A06(InterfaceC58140Pq5 interfaceC58140Pq5, UserSession userSession, C38321qM c38321qM, java.util.Set set) {
        C84923qg A002;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C84923qg c84923qg = (C84923qg) it.next();
            EnumC84933qh enumC84933qh = EnumC84933qh.A02;
            c38321qM.A4B(enumC84933qh, c84923qg.A0G);
            c84923qg.A06 = enumC84933qh;
            C57682kh A003 = C57682kh.A00(userSession);
            String str = c84923qg.A0G;
            if (A003.A0J(str)) {
                A003.A0F(str);
            }
            String str2 = c84923qg.A0F;
            if (str2 != null && (A002 = c38321qM.A0d.A05.A00(str2)) != null && A002.A0F == null) {
                A002.A01 = (int) Math.max(0.0d, A002.A01 - 1);
            }
        }
        c38321qM.A0d.A01();
        if (interfaceC58140Pq5 != null) {
            interfaceC58140Pq5.Dez();
        }
    }

    public static final void A07(InterfaceC58140Pq5 interfaceC58140Pq5, C38321qM c38321qM, java.util.Set set, boolean z) {
        C84923qg A002;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C84923qg c84923qg = (C84923qg) it.next();
            EnumC84933qh enumC84933qh = EnumC84933qh.A09;
            c38321qM.A4B(enumC84933qh, c84923qg.A0G);
            c84923qg.A06 = enumC84933qh;
            String str = c84923qg.A0F;
            if (str != null && (A002 = c38321qM.A0d.A05.A00(str)) != null && A002.A0F == null) {
                A002.A01++;
            }
        }
        c38321qM.A0d.A01();
        if (z) {
            if (interfaceC58140Pq5 != null) {
                interfaceC58140Pq5.Dex();
            }
        } else {
            if (interfaceC58140Pq5 == null) {
                return;
            }
            interfaceC58140Pq5.Dey();
        }
    }
}
