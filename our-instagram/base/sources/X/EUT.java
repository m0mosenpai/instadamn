package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class EUT extends C1P1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public EUT(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1661466631);
                C31338Dq3.A04((C31338Dq3) this.A02, (C5HW) this.A03, AbstractC111324zv.A00(1224), this.A01);
                i = 287859178;
                break;
            case 2:
                A03 = C0f9.A03(-1925472430);
                FragmentActivity fragmentActivity = ((C41645Ibb) this.A02).A00;
                AbstractC35236FgV.A01(fragmentActivity, fragmentActivity.getString(2131972754), true);
                i = -18855140;
                break;
            case 3:
                A03 = C0f9.A03(2048785735);
                C35150Fes.A00((EnumC193348hE) this.A03, (C35150Fes) this.A02, this.A01);
                i = -1046167776;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        if (3 - this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(1773088300);
        super.onFinish();
        C35150Fes c35150Fes = (C35150Fes) this.A02;
        FragmentActivity fragmentActivity = c35150Fes.A01;
        C56342iS c56342iS = C56352iT.A0t;
        AbstractC31178DnM.A0k(fragmentActivity, c56342iS, c56342iS.A03(fragmentActivity), false);
        c35150Fes.A00 = false;
        C0f9.A0A(-1196260523, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (3 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-960743603);
        super.onStart();
        C35150Fes c35150Fes = (C35150Fes) this.A02;
        c35150Fes.A00 = true;
        FragmentActivity fragmentActivity = c35150Fes.A01;
        C56342iS c56342iS = C56352iT.A0t;
        AbstractC31178DnM.A0k(fragmentActivity, c56342iS, c56342iS.A03(fragmentActivity), true);
        C0f9.A0A(-1065723934, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1737219725);
                int A032 = C0f9.A03(-1862282638);
                InterfaceC09390do interfaceC09390do = ((EMG) this.A03).A0M;
                for (SavedCollection savedCollection : FBA.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(AbstractC166987dD.A1J(EnumC33416Epn.A0C), null)) {
                    AbstractC35273Fh8.A07(AbstractC166987dD.A0r(interfaceC09390do), (C38321qM) this.A02, savedCollection, C05F.A01, this.A01);
                }
                C0f9.A0A(-89369474, A032);
                i = 1370391021;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(2130392656);
                int A033 = C0f9.A03(-267387270);
                C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
                C5HW c5hw = (C5HW) this.A03;
                C31338Dq3.A04(c31338Dq3, c5hw, "remove_tag_success", this.A01);
                c5hw.A0E = true;
                C0f9.A0A(1564975399, A033);
                i = 1701428156;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(1401042841);
                int A034 = C0f9.A03(1291450024);
                EnumC33416Epn enumC33416Epn = EnumC33416Epn.A0C;
                String str = enumC33416Epn.A01;
                C41645Ibb c41645Ibb = (C41645Ibb) this.A02;
                FragmentActivity fragmentActivity = c41645Ibb.A00;
                SavedCollection savedCollection2 = new SavedCollection(enumC33416Epn, str, fragmentActivity.getString(2131972754));
                UserSession userSession = c41645Ibb.A02;
                C38321qM c38321qM = (C38321qM) this.A03;
                AbstractC35273Fh8.A07(userSession, c38321qM, savedCollection2, C05F.A00, this.A01);
                FBA.A00(userSession).A04(savedCollection2);
                G97 g97 = new G97(this, 9);
                AbstractC35236FgV.A00(fragmentActivity, c38321qM.A1q(fragmentActivity), g97, savedCollection2.A07, fragmentActivity.getString(2131972755), fragmentActivity.getString(2131952155), true, true, false);
                C0f9.A0A(-716804011, A034);
                i = 97676241;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(-1005569457);
                EAQ eaq = (EAQ) obj;
                int A035 = C0f9.A03(1641846749);
                int i2 = this.A01;
                C35150Fes c35150Fes = (C35150Fes) this.A02;
                UserSession userSession2 = c35150Fes.A07;
                FanClubInfoDict B4O = AbstractC31174DnI.A0m(userSession2).B4O();
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, userSession2, 36330784759497751L);
                if (C18U.A06(c06090Tz, userSession2, 36328886383951702L) && B4O != null && B4O.getFanClubId() != null) {
                    i2 = 2131975054;
                    if (A06) {
                        i2 = 2131975052;
                    }
                } else {
                    C34392FEi c34392FEi = eaq.A00;
                    if (c34392FEi == null) {
                        AbstractC31171DnF.A0w();
                        throw C00O.createAndThrow();
                    }
                    if (c34392FEi.A00) {
                        i2 = 2131975053;
                        if (A06) {
                            i2 = 2131975051;
                        }
                    }
                }
                C35150Fes.A00((EnumC193348hE) this.A03, c35150Fes, i2);
                C0f9.A0A(-1394009601, A035);
                i = -1185736415;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
