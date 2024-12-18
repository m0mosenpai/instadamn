package X;

import android.accounts.NetworkErrorException;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EUg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32530EUg extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C32530EUg(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        C1P1 c1p1;
        AbstractC115105If A00;
        C45116Jxl A002;
        Integer num;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(632259656);
                C35016Fbp.A00((C35016Fbp) this.A02);
                C33157Ek0 c33157Ek0 = (C33157Ek0) this.A01;
                String string = c33157Ek0.getString(2131976159);
                Object A003 = abstractC115105If.A00();
                Integer num2 = null;
                if (A003 != null) {
                    num2 = ((EC3) A003).A00;
                    C40781ul c40781ul = (C40781ul) A003;
                    if (c40781ul.getErrorMessage() != null) {
                        string = c40781ul.getErrorMessage();
                    }
                }
                if (num2 == C05F.A00) {
                    String string2 = c33157Ek0.getString(2131971489);
                    C193328hC A0P = AbstractC31180DnO.A0P(c33157Ek0);
                    A0P.A05 = string2;
                    A0P.A0r(string);
                    A0P.A0I(DialogInterfaceOnClickListenerC35454FkB.A00(c33157Ek0, 69), 2131968948);
                    AbstractC166987dD.A1W(A0P);
                } else {
                    c33157Ek0.A05.A04(string);
                }
                i = 1629655429;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1085579333);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    c1p1 = (C1P1) this.A01;
                    A002 = new C45116Jxl(null, String.valueOf(A01), null, 21);
                } else {
                    AnonymousClass435 anonymousClass435 = (AnonymousClass435) abstractC115105If.A00();
                    c1p1 = (C1P1) this.A01;
                    if (anonymousClass435 != null) {
                        A002 = SW9.A00((C60398Qym) anonymousClass435.A01);
                    } else {
                        A00 = C7J2.A00();
                        c1p1.onFail(A00);
                        i = 810308638;
                        break;
                    }
                }
                A00 = new C115115Ig(A002);
                c1p1.onFail(A00);
                i = 810308638;
            case 2:
                A03 = C0f9.A03(78072170);
                ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = (ViewOnClickListenerC126195nG) this.A02;
                User user = viewOnClickListenerC126195nG.A00;
                if (user == this.A01) {
                    if (user.A1w()) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    viewOnClickListenerC126195nG.A01 = num;
                    ViewOnClickListenerC126195nG.A01(viewOnClickListenerC126195nG);
                }
                i = -931028532;
                break;
            case 3:
                A03 = C0f9.A03(-604512284);
                int size = ((List) this.A01).size();
                C146106i8 A0j = AbstractC25229BEm.A0j();
                A0j.A0H = "batch_follow_many_request_failed";
                A0j.A0D = AbstractC166997dE.A0N((Fragment) this.A02).getQuantityString(R.plurals.batch_non_recip_follow_failed, size);
                A0j.A06();
                AbstractC25233BEq.A1F(A0j);
                i = 1213915920;
                break;
            case 4:
                A03 = C0f9.A03(-1659293195);
                C146106i8 A0j2 = AbstractC25229BEm.A0j();
                A0j2.A0H = "mark_not_spam_error";
                AbstractC31172DnG.A1H(AbstractC166997dE.A0N((Fragment) this.A02), A0j2, 2131966039);
                A0j2.A06();
                AbstractC25233BEq.A1F(A0j2);
                i = 761546052;
                break;
            case 5:
            default:
                super.onFail(abstractC115105If);
                return;
            case 6:
                A03 = C0f9.A03(-1076584739);
                int size2 = ((List) this.A01).size();
                C146106i8 A0j3 = AbstractC25229BEm.A0j();
                A0j3.A0H = "batch_remove_many_followers_request_failed";
                A0j3.A0D = AbstractC166997dE.A0N((Fragment) this.A02).getQuantityString(R.plurals.batch_non_recip_remove_failed, size2);
                A0j3.A06();
                AbstractC25233BEq.A1F(A0j3);
                i = -1725601436;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (7 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1838612271);
        super.onFailInBackground(abstractC115105If);
        AbstractC25011Ke abstractC25011Ke = (AbstractC25011Ke) ((FQ7) this.A02).A02.get(this.A01);
        if (abstractC25011Ke != null) {
            abstractC25011Ke.setException(new NetworkErrorException(""));
        }
        C0f9.A0A(265801342, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        if (1 - this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(932486096);
        ((C1P1) this.A01).onFinish();
        C0f9.A0A(1403887905, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (1 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-1858269585);
        ((C1P1) this.A01).onStart();
        C0f9.A0A(2081121777, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        AbstractC115105If A00;
        int A032;
        int i2;
        int i3;
        Integer B7S;
        String str;
        FollowStatus followStatus;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1500593868);
                int A033 = C0f9.A03(-1171813291);
                ((C35016Fbp) this.A02).A00.markerEnd(857809457, (short) 2);
                C33157Ek0 c33157Ek0 = (C33157Ek0) this.A01;
                c33157Ek0.A05.A03();
                AbstractC13880nE.A0O(c33157Ek0.A02);
                C140966Yy A0r = AbstractC25225BEi.A0r(c33157Ek0.requireActivity(), c33157Ek0.A04);
                String str3 = c33157Ek0.A06;
                AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("email", str3);
                AbstractC31176DnK.A1A(A0b, abstractC59962oe, A0r);
                C0f9.A0A(-64494585, A033);
                i = 850267702;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(2115758756);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, 2130757415);
                C45116Jxl A002 = SW9.A00((C60398Qym) anonymousClass435.A01);
                if (A002.A01 != null) {
                    AbstractC31171DnF.A1R(this.A01, A002);
                } else {
                    String str4 = A002.A00;
                    C1P1 c1p1 = (C1P1) this.A01;
                    if (str4 != null) {
                        A00 = new C115115Ig(A002);
                    } else {
                        A00 = C7J2.A00();
                    }
                    c1p1.onFail(A00);
                }
                C0f9.A0A(-1249788783, A0N);
                i = -1307333610;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(1778106984);
                int A034 = C0f9.A03(-418265127);
                User user = (User) this.A01;
                user.A17(false);
                C08730cb c08730cb = C17060sy.A01;
                ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = (ViewOnClickListenerC126195nG) this.A02;
                c08730cb.A01(viewOnClickListenerC126195nG.A04).A0V();
                if (viewOnClickListenerC126195nG.A00 == user) {
                    viewOnClickListenerC126195nG.A01 = C05F.A01;
                    ViewOnClickListenerC126195nG.A01(viewOnClickListenerC126195nG);
                }
                C0f9.A0A(703974270, A034);
                i = -1634820070;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-816132728);
                int A035 = C0f9.A03(1475644453);
                Iterator A1J = AbstractC25226BEj.A1J(this.A01);
                while (A1J.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(A1J);
                    C31535DtK c31535DtK = (C31535DtK) this.A02;
                    User A02 = ((C18A) c31535DtK.A0u.getValue()).A02(A1B);
                    if (A02 != null) {
                        C129885ts A003 = AbstractC129875tr.A00(C31535DtK.A03(c31535DtK));
                        if (AbstractC31174DnI.A0j(A003.A02, A02).ordinal() == 3) {
                            if (A02.A0M() != C05F.A0C && A02.A0M() != C05F.A00) {
                                followStatus = FollowStatus.A05;
                            } else {
                                followStatus = FollowStatus.A07;
                            }
                            A003.A0D(followStatus, A02, false);
                        }
                    }
                }
                C31542DtS c31542DtS = ((C31535DtK) this.A02).A0E;
                if (c31542DtS != null) {
                    c31542DtS.A0G(false, false);
                    C0f9.A0A(-2021597689, A035);
                    i = 1969800160;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "followListAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A032 = C0f9.A03(27981655);
                int A036 = C0f9.A03(-1572578409);
                C31535DtK c31535DtK2 = (C31535DtK) this.A02;
                int i4 = c31535DtK2.A00 - 1;
                c31535DtK2.A00 = i4;
                C31542DtS c31542DtS2 = c31535DtK2.A0E;
                if (c31542DtS2 != null) {
                    c31542DtS2.A00 = i4;
                    c31542DtS2.A0G(false, false);
                    C31542DtS c31542DtS3 = c31535DtK2.A0E;
                    if (c31542DtS3 != null) {
                        c31542DtS3.A0D((User) this.A01);
                        C146106i8 A0Y = AbstractC31174DnI.A0Y();
                        A0Y.A0H = "mark_not_spam_success";
                        AbstractC31172DnG.A1H(AbstractC166997dE.A0N(c31535DtK2), A0Y, 2131966040);
                        A0Y.A06();
                        AbstractC25233BEq.A1F(A0Y);
                        c31535DtK2.A0d = true;
                        C0f9.A0A(1080877830, A036);
                        i2 = 205759808;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                }
                str = "followListAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A032 = C0f9.A03(1220856031);
                int A037 = C0f9.A03(-1169868188);
                C31535DtK c31535DtK3 = (C31535DtK) this.A02;
                C9GR.A07(c31535DtK3.getContext(), 2131972334);
                C31542DtS c31542DtS4 = c31535DtK3.A0E;
                if (c31542DtS4 != null) {
                    User user2 = (User) this.A01;
                    c31542DtS4.A0D(user2);
                    FragmentActivity activity = c31535DtK3.getActivity();
                    if (activity != null && C1VN.A00 != null) {
                        AbstractC31282Dp4.A00().A00(activity, C31535DtK.A03(c31535DtK3), "613991770939959", AbstractC47112Ks7.A00(user2.getId()));
                    }
                    if (C14360o3.A0K(c31535DtK3.A0M, "potential_spam")) {
                        int i5 = c31535DtK3.A00 - 1;
                        c31535DtK3.A00 = i5;
                        C31542DtS c31542DtS5 = c31535DtK3.A0E;
                        if (c31542DtS5 != null) {
                            c31542DtS5.A00 = i5;
                            c31542DtS5.A0G(false, false);
                            c31535DtK3.A0d = true;
                        }
                    }
                    UserSession A038 = C31535DtK.A03(c31535DtK3);
                    FollowListData followListData = c31535DtK3.A0D;
                    if (followListData == null) {
                        str = "followListData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    if (C2TN.A05(A038, followListData.A02)) {
                        C25671My A004 = AbstractC25651Mw.A00(C31535DtK.A03(c31535DtK3));
                        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A04;
                        User user3 = c31535DtK3.A0C;
                        if (user3 != null && (B7S = user3.A03.B7S()) != null) {
                            i3 = B7S.intValue() - 1;
                        } else {
                            i3 = -1;
                        }
                        A004.E4s(new C36105Fwf(enumC31556Dtg, i3));
                    }
                    C0f9.A0A(-818647368, A037);
                    i2 = -790457935;
                    C0f9.A0A(i2, A032);
                    return;
                }
                str = "followListAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A03 = C0f9.A03(1907506848);
                int A039 = C0f9.A03(-200199139);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A1J2 = AbstractC25226BEj.A1J(this.A01);
                while (A1J2.hasNext()) {
                    User A022 = ((C18A) ((C31535DtK) this.A02).A0u.getValue()).A02(AbstractC166987dD.A1B(A1J2));
                    if (A022 != null) {
                        A1E.add(A022);
                    }
                }
                C31535DtK c31535DtK4 = (C31535DtK) this.A02;
                C31542DtS c31542DtS6 = c31535DtK4.A0E;
                if (c31542DtS6 != null) {
                    C31542DtS.A02(c31542DtS6, c31535DtK4, A1E);
                    C9GR.A09(c31535DtK4.getContext(), AbstractC167017dG.A0k(AbstractC166997dE.A0N(c31535DtK4), A1E.size(), R.plurals.batch_non_recip_remove_success));
                    C0f9.A0A(593837768, A039);
                    i = -1073456702;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "followListAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
            default:
                super.onSuccess(obj);
                return;
            case 8:
                A03 = C0f9.A03(39367935);
                EDO edo = (EDO) obj;
                int A0310 = C0f9.A03(1336481259);
                C14360o3.A0B(edo, 0);
                Iterator it = edo.A01.iterator();
                while (it.hasNext()) {
                    List<E6O> list = ((E6S) it.next()).A06;
                    if (!list.isEmpty()) {
                        E6O e6o = (E6O) AbstractC001800i.A0O(list, 0);
                        if (e6o != null) {
                            str2 = e6o.A01;
                        } else {
                            str2 = null;
                        }
                        if (MSV.A00(223).equals(str2)) {
                            for (E6O e6o2 : list) {
                                String str5 = e6o2.A02;
                                if (str5 == null) {
                                    str5 = "off";
                                }
                                if (AbstractC166997dE.A1Z(e6o2.A00, true)) {
                                    ((OE7) this.A02).A00 = str5;
                                }
                            }
                        }
                    }
                }
                ((OE7) this.A02).A01 = true;
                AbstractC166987dD.A1Y(this.A01);
                C0f9.A0A(-749421107, A0310);
                i = 995749760;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A032 = C0f9.A03(-926907430);
                int A0311 = C0f9.A03(894451690);
                EMO emo = (EMO) this.A01;
                emo.A0A = true;
                emo.A0B = !r9.A0E;
                AbstractC129875tr.A00(emo.A01).A0C((C151516rx) obj, (User) this.A02, null);
                C0f9.A0A(-1469128115, A0311);
                i2 = -158747470;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        AbstractC25011Ke abstractC25011Ke;
        if (7 - this.A00 != 0) {
            super.onSuccessInBackground(obj);
            return;
        }
        int A03 = C0f9.A03(-1841180434);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, -928780422);
        super.onSuccessInBackground(anonymousClass435);
        Object obj2 = anonymousClass435.A01;
        if ((obj2 == null || !(obj2 instanceof C2JT)) && (abstractC25011Ke = (AbstractC25011Ke) ((FQ7) this.A02).A02.get(this.A01)) != null) {
            abstractC25011Ke.setException(new NetworkErrorException(""));
        }
        AbstractC25011Ke abstractC25011Ke2 = (AbstractC25011Ke) ((FQ7) this.A02).A02.get(this.A01);
        if (abstractC25011Ke2 != null) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.graphql.modelutil.GraphQLModel");
            abstractC25011Ke2.set(obj2);
        }
        C0f9.A0A(384392895, A0N);
        C0f9.A0A(-880235704, A03);
    }
}
