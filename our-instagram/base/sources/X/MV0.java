package X;

import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class MV0 implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public MV0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        String str;
        User A2E;
        String str2;
        switch (this.A00) {
            case 0:
                return ((C2AS) obj).A00.equals(AbstractC166987dD.A10(((BJK) this.A01).A05));
            case 1:
                C70083Cs c70083Cs = (C70083Cs) obj;
                C14360o3.A0B(c70083Cs, 0);
                C47Z c47z = c70083Cs.A00;
                if (c47z.A1F == EnumC76383bi.A0C) {
                    C38321qM c38321qM = c47z.A1C;
                    if (c38321qM != null && (A2E = c38321qM.A2E(((AbstractC26782Bs6) this.A01).A07())) != null) {
                        str = A2E.getId();
                    } else {
                        str = null;
                    }
                    if (AbstractC31171DnF.A1W(((AbstractC26782Bs6) this.A01).A07(), str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            case 2:
                C36115Fwp c36115Fwp = (C36115Fwp) obj;
                C14360o3.A0B(c36115Fwp, 0);
                str2 = c36115Fwp.A00;
                return C14360o3.A0K(str2, AbstractC25231BEo.A0t(((ProfileCardViewModel) this.A01).A05));
            case 3:
                C36099FwZ c36099FwZ = (C36099FwZ) obj;
                C14360o3.A0B(c36099FwZ, 0);
                str2 = c36099FwZ.A01;
                return C14360o3.A0K(str2, AbstractC25231BEo.A0t(((ProfileCardViewModel) this.A01).A05));
            case 4:
                C36101Fwb c36101Fwb = (C36101Fwb) obj;
                C14360o3.A0B(c36101Fwb, 0);
                str2 = c36101Fwb.A01;
                return C14360o3.A0K(str2, AbstractC25231BEo.A0t(((ProfileCardViewModel) this.A01).A05));
            default:
                C36089FwP c36089FwP = (C36089FwP) obj;
                C14360o3.A0B(c36089FwP, 0);
                str2 = c36089FwP.A00;
                return C14360o3.A0K(str2, AbstractC25231BEo.A0t(((ProfileCardViewModel) this.A01).A05));
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        Object value;
        C26081BgA A00;
        Object value2;
        String str;
        C26081BgA A002;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-47009988);
                C2AS c2as = (C2AS) obj;
                int A032 = C0f9.A03(-538574532);
                BJK bjk = (BJK) this.A01;
                if (!bjk.A00 && c2as.A00.CQw()) {
                    bjk.A00();
                }
                C0f9.A0A(589858678, A032);
                i = 1660756734;
                break;
            case 1:
                A03 = C0f9.A03(-1663950400);
                int A033 = C0f9.A03(1916743838);
                C51030Mgd A003 = C0O.A00((C0O) this.A01);
                String str2 = A003.A00;
                if (str2 != null) {
                    PZ1.A01(A003, str2, AbstractC141776au.A00(A003), 9);
                }
                C0f9.A0A(-2092605773, A033);
                i = 1442617522;
                break;
            case 2:
                A03 = C0f9.A03(-1205861143);
                C36115Fwp c36115Fwp = (C36115Fwp) obj;
                int A0N = AbstractC167017dG.A0N(c36115Fwp, -2104064932);
                ArrayList A1E = AbstractC166987dD.A1E();
                List list = c36115Fwp.A01;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A1E.add(((InterfaceC81873l7) it.next()).F3a());
                    }
                }
                ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A01;
                ArrayList A02 = ProfileCardViewModel.A02(A1E);
                LinkedHashMap A034 = AbstractC06930Yk.A03(ProfileCardViewModel.A00(profileCardViewModel).A0B);
                A034.put(EnumC53163NfI.A04, A02);
                C05A c05a = profileCardViewModel.A0K;
                do {
                    value = c05a.getValue();
                    A00 = C26081BgA.A00(null, null, null, (C26081BgA) value, null, null, null, null, null, null, A034, 0.0f, 0.0f, 0.0f, 8388591, false, false, false, false, false, false, false, false, false, false);
                } while (!c05a.AIi(value, A00));
                C0f9.A0A(-1859577936, A0N);
                i = 1948356832;
                break;
            case 3:
                A03 = C0f9.A03(-1279155086);
                C36099FwZ c36099FwZ = (C36099FwZ) obj;
                int A035 = C0f9.A03(-1296695049);
                C14360o3.A0B(c36099FwZ, 0);
                C05A c05a2 = ((ProfileCardViewModel) this.A01).A0K;
                do {
                    value2 = c05a2.getValue();
                    C26081BgA c26081BgA = (C26081BgA) value2;
                    InterfaceC81773kp interfaceC81773kp = c36099FwZ.A00;
                    if (interfaceC81773kp == null || (str = interfaceC81773kp.BkX()) == null) {
                        str = "";
                    }
                    A002 = C26081BgA.A00(null, null, null, c26081BgA, null, null, null, null, null, str, null, 0.0f, 0.0f, 0.0f, 8388479, false, false, false, false, false, false, false, false, false, false);
                } while (!c05a2.AIi(value2, A002));
                C0f9.A0A(-1331569558, A035);
                i = -746547807;
                break;
            case 4:
                A03 = C0f9.A03(69620166);
                int A036 = C0f9.A03(-1505268619);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new PYs(abstractC52922bZ, null, 4), AbstractC141776au.A00(abstractC52922bZ));
                C0f9.A0A(613504301, A036);
                i = 1917880667;
                break;
            default:
                A03 = C0f9.A03(-1972099166);
                int A037 = C0f9.A03(-1947567709);
                AbstractC52922bZ abstractC52922bZ2 = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new PYs(abstractC52922bZ2, null, 7), AbstractC141776au.A00(abstractC52922bZ2));
                C0f9.A0A(-970107766, A037);
                i = 2001950055;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
