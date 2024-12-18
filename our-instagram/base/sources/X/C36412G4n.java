package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "legacy translation feature")
/* renamed from: X.G4n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36412G4n implements InterfaceC165217aA {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final C18920wW A03;
    public final C7U0 A04;
    public final InterfaceC08830cm A05;

    public C36412G4n(C18920wW c18920wW, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 3);
        this.A01 = userSession;
        this.A03 = c18920wW;
        this.A05 = interfaceC08830cm;
        this.A04 = (C7U0) AbstractC31172DnG.A0y(interfaceC08830cm);
        this.A02 = C37058GUs.A01(this, 9);
    }

    @Override // X.InterfaceC165217aA
    public final SpannableString Dm5(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(messageIdentifier, 1);
        C14360o3.A0B(num, 2);
        int i2 = 2131959933;
        if (num.intValue() != 2) {
            i2 = 2131959935;
        }
        String A0u = AbstractC25227BEk.A0u(context, i2);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0u);
        if (num != C05F.A0C) {
            AnonymousClass773.A05(A0H, new C32966Eex(this, messageIdentifier, num, i), A0u);
        }
        SpannableString valueOf = SpannableString.valueOf(A0H);
        C14360o3.A07(valueOf);
        return valueOf;
    }

    @Override // X.InterfaceC165217aA
    public final void DtZ(MessageIdentifier messageIdentifier, Integer num) {
        C18920wW c18920wW;
        HashMap A0g;
        String str;
        C7U0 c7u0 = this.A04;
        EnumC2054697t enumC2054697t = EnumC2054697t.A0o;
        if (!c7u0.AHB(enumC2054697t)) {
            AbstractC34059F1m.A00(enumC2054697t);
            return;
        }
        InterfaceC163557Ts BT6 = c7u0.BT6();
        ArrayList BSu = BT6.BSu(messageIdentifier.A01);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = BSu.iterator();
        while (it.hasNext()) {
            C160787Im c160787Im = (C160787Im) it.next();
            if (num == C05F.A01 && c160787Im.A0e.A0p() == null) {
                A1E.add(c160787Im);
            } else {
                BT6.EZ9(num, c160787Im.A0e.A0i(), false);
            }
        }
        InterfaceC163837Ux C7r = c7u0.C7r();
        C7TT C7W = C7r.C7W();
        C14360o3.A07(C7W);
        A00(C7W, A1E, false);
        String A15 = AbstractC31172DnG.A15(C7r.B90());
        boolean CaB = C7r.CaB();
        if (A15 == null) {
            return;
        }
        if (num == C05F.A00) {
            c18920wW = this.A03;
            A0g = AbstractC31179DnN.A0g(A15, CaB);
            str = "see_original_button_click";
        } else {
            if (num != C05F.A01) {
                return;
            }
            c18920wW = this.A03;
            A0g = AbstractC31179DnN.A0g(A15, CaB);
            str = "see_translation_button_click";
        }
        F37.A00(c18920wW, str, A0g);
    }

    public final void A00(C7TT c7tt, List list, boolean z) {
        String str;
        C4A7 c4a7;
        InterfaceC83733oI CCa;
        ArrayList A0i;
        C7U0 c7u0 = this.A04;
        EnumC2054697t enumC2054697t = EnumC2054697t.A0o;
        if (!c7u0.AHB(enumC2054697t)) {
            AbstractC34059F1m.A00(enumC2054697t);
            return;
        }
        if (list != null && A01()) {
            return;
        }
        UserSession userSession = this.A01;
        if (!F3B.A00(userSession, c7tt)) {
            return;
        }
        InterfaceC163837Ux C7r = c7u0.C7r();
        Map C7o = C7r.C7o();
        String str2 = null;
        if (C7o != null) {
            str = AbstractC166987dD.A1A(userSession.userId, C7o);
        } else {
            str = null;
        }
        Map C7o2 = C7r.C7o();
        if (C7o2 != null) {
            str2 = AbstractC166987dD.A1A(C7r.BYt(), C7o2);
        }
        if (!c7tt.A1C) {
            return;
        }
        if (!this.A00 && z) {
            this.A00 = true;
            if (str == null || str2 == null) {
                return;
            }
            InterfaceC163557Ts BT6 = c7u0.BT6();
            int itemCount = BT6.getItemCount();
            c4a7 = (C4A7) this.A02.getValue();
            CCa = C7r.CCa();
            ArrayList Bku = BT6.Bku(itemCount);
            A0i = AbstractC167007dF.A0i(Bku);
            Iterator it = Bku.iterator();
            while (it.hasNext()) {
                A0i.add(((C160787Im) it.next()).A0e);
            }
        } else {
            if (list == null || str2 == null || str == null) {
                return;
            }
            c4a7 = (C4A7) this.A02.getValue();
            CCa = C7r.CCa();
            A0i = AbstractC167007dF.A0i(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0i.add(((C160787Im) it2.next()).A0e);
            }
        }
        AbstractC166987dD.A1Z(new JZ1(CCa, A0i, c4a7, str, str2, null, 6), c4a7.A01);
    }

    public final boolean A01() {
        Map map;
        AnonymousClass172 BYs;
        C83693oE A02;
        String str;
        C7U0 c7u0 = this.A04;
        InterfaceC163837Ux C7r = c7u0.C7r();
        C7TT C7W = C7r.C7W();
        EnumC2054697t enumC2054697t = EnumC2054697t.A0o;
        if (!c7u0.AHB(enumC2054697t)) {
            AbstractC34059F1m.A00(enumC2054697t);
        } else {
            UserSession userSession = this.A01;
            C14360o3.A0A(C7W);
            C14360o3.A0B(C7W, 1);
            if ((!C18U.A06(C06090Tz.A06, userSession, 36313905538140475L)) && FUD.A00(C7W)) {
                List list = C7W.A0b;
                boolean A2I = AbstractC166987dD.A10(userSession).A2I();
                User user = (User) AbstractC001800i.A0J(list);
                if (user != null && (A2I ^ user.A2I()) && (((map = C7W.A0i) == null || map.size() == 0) && (BYs = C7r.BYs()) != null)) {
                    C4A7 c4a7 = (C4A7) this.A02.getValue();
                    InterfaceC83733oI CCa = C7r.CCa();
                    ArrayList Bku = c7u0.BT6().Bku(20);
                    ArrayList A0i = AbstractC167007dF.A0i(Bku);
                    Iterator it = Bku.iterator();
                    while (it.hasNext()) {
                        A0i.add(((C160787Im) it.next()).A0e);
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : A0i) {
                        if (((C83403nh) obj).A10 == C2EY.A1i) {
                            A1E.add(obj);
                        }
                    }
                    ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
                    Iterator it2 = A1E.iterator();
                    while (it2.hasNext()) {
                        Object obj2 = ((C83403nh) it2.next()).A1T;
                        AbstractC25225BEi.A1S(obj2);
                        A0i2.add(obj2);
                    }
                    if (!A0i2.isEmpty() && CCa != null && (A02 = AbstractC1345466e.A02(CCa)) != null && (str = A02.A00) != null) {
                        AbstractC166987dD.A1Z(new C50112MAl(c4a7, CCa, A0i2, BYs, str, null, 2), c4a7.A01);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
