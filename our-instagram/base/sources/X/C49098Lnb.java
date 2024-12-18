package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lnb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49098Lnb implements InterfaceC163557Ts {
    public C66362zD A00;
    public C45279K2h A01;
    public Long A03;
    public boolean A06;
    public final UserSession A07;
    public final C7XE A08;
    public final C7XE A09;
    public final C7XE A0A;
    public final C164357Wy A0B;
    public final C7X7 A0C;
    public String A04 = null;
    public List A05 = AbstractC166987dD.A1E();
    public final HashMap A0D = AbstractC166987dD.A1G();
    public Integer A02 = null;

    private boolean A00(int i) {
        if (i >= 0 && i < this.A05.size()) {
            return true;
        }
        C0K8.A0O("MsysMessageStoreImpl", "Unable to fetch view model at index %d", Integer.valueOf(i));
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final void AC2(InterfaceC16820sZ interfaceC16820sZ) {
    }

    @Override // X.InterfaceC163557Ts
    public final void AGu(String str, int i) {
    }

    @Override // X.InterfaceC163557Ts
    public final void AHw(C160787Im c160787Im) {
    }

    @Override // X.InterfaceC163557Ts
    public final String AaT(MessageIdentifier messageIdentifier) {
        return "";
    }

    @Override // X.InterfaceC163557Ts
    public final int Ail() {
        return 0;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean Ain() {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final Map BOu(MessageIdentifier messageIdentifier) {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final C2EY BSn(String str) {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final L1W BSp(String str) {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final C48649Lfa BT0(DirectMessageIdentifier directMessageIdentifier, int i) {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final C160787Im BT7(String str) {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final C80993jT BsC() {
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final String BtL(MessageIdentifier messageIdentifier) {
        C7T7 c7t7;
        if (messageIdentifier == null) {
            return null;
        }
        InterfaceC66482zP A01 = A01(messageIdentifier);
        if (A01 instanceof InterfaceC162797Qq) {
            c7t7 = ((InterfaceC162797Qq) A01).Apt().A0G;
        } else {
            if (A01 instanceof InterfaceC1584279c) {
                InterfaceC162787Qp ArQ = ((InterfaceC1584279c) A01).ArQ();
                if (ArQ instanceof C1585879t) {
                    c7t7 = ((C1585879t) ArQ).A0C;
                }
            }
            C0K8.A0C("MsysMessageStoreImpl", "Unexpected view model type");
            return null;
        }
        if (c7t7 != null) {
            return c7t7.A04;
        }
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean CMv(C31230DoD c31230DoD) {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final int CNN(String str) {
        return -1;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean CSc(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CWu(int i) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CWv(int i) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CWw(int i) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CWx(int i) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CYR(int i) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CYT(int i) {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean CYV(MessageIdentifier messageIdentifier) {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean CYX(DirectMessageIdentifier directMessageIdentifier, int i, int i2) {
        while (i <= i2 && A00(i)) {
            if (((InterfaceC66482zP) this.A05.get(i)).getKey().equals(directMessageIdentifier.A02)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean Cd2(String str) {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final boolean Cd3(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC163567Tt
    public final boolean CeP() {
        return false;
    }

    @Override // X.InterfaceC163577Tu
    public final void Cuz(List list) {
    }

    @Override // X.InterfaceC163557Ts
    public final void Cyn() {
    }

    @Override // X.InterfaceC163557Ts
    public final void D0d(MessageIdentifier messageIdentifier) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DDt(C7XE c7xe, C161577Ls c161577Ls) {
    }

    @Override // X.InterfaceC163587Tv
    public final void DJW(DirectMessageIdentifier directMessageIdentifier) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DMP(Activity activity, C7IP c7ip, C2EC c2ec, String str, boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DOm(C7XE c7xe, C161577Ls c161577Ls, C80993jT c80993jT, C80993jT c80993jT2, InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DP7() {
    }

    @Override // X.InterfaceC163557Ts, X.InterfaceC165367aP
    public final void DS3(MessageIdentifier messageIdentifier) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DTB() {
    }

    @Override // X.InterfaceC163557Ts
    public final void Dd1() {
    }

    @Override // X.InterfaceC163557Ts
    public final void Dk2(C161717Mg c161717Mg) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DkW(String str) {
    }

    @Override // X.InterfaceC163557Ts
    public final void Dse(String str) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DtN(String str) {
    }

    @Override // X.InterfaceC163557Ts
    public final void DtY(MessageIdentifier messageIdentifier) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EGH() {
    }

    @Override // X.InterfaceC163557Ts
    public final void EQd(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EQe(MessageIdentifier messageIdentifier, boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EYB(boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EZ9(Integer num, String str, boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EZD(boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void Ec8(boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EdN(C80993jT c80993jT) {
    }

    @Override // X.InterfaceC163557Ts
    public final void EdO(C80993jT c80993jT, C80993jT c80993jT2, InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.InterfaceC163587Tv
    public final boolean EjW(DirectMessageIdentifier directMessageIdentifier, boolean z) {
        return false;
    }

    @Override // X.InterfaceC163557Ts
    public final void Ejb(String str, boolean z) {
    }

    @Override // X.InterfaceC163557Ts
    public final boolean ElZ(C31230DoD c31230DoD, boolean z) {
        return false;
    }

    @Override // X.InterfaceC163597Tw
    public final void FAi(C45117Jxm c45117Jxm, DirectMessageIdentifier directMessageIdentifier) {
    }

    @Override // X.InterfaceC163557Ts
    public final void FBv() {
    }

    @Override // X.InterfaceC163557Ts
    public final void FCN(C7XE c7xe, C161577Ls c161577Ls, C80993jT c80993jT, boolean z) {
    }

    public final InterfaceC66482zP A01(MessageIdentifier messageIdentifier) {
        HashMap hashMap = this.A0D;
        String str = messageIdentifier.A01;
        String str2 = str;
        if (hashMap.containsKey(str) || ((str2 = messageIdentifier.A00()) != null && hashMap.containsKey(str2))) {
            return (InterfaceC66482zP) hashMap.get(str2);
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0u("ViewModelMap does not contain messageIdentifier ", str, " ", str2));
    }

    @Override // X.InterfaceC163557Ts
    public final AbstractC66422zJ BK0(int i) {
        C66362zD c66362zD = this.A00;
        if (c66362zD == null) {
            return null;
        }
        return c66362zD.A03.A02(c66362zD.getItemViewType(i));
    }

    @Override // X.InterfaceC163557Ts
    public final C83403nh BM4() {
        C26076Bg5 c26076Bg5;
        InterfaceC50520MRx interfaceC50520MRx;
        C45279K2h c45279K2h = this.A01;
        if (c45279K2h != null && (c26076Bg5 = c45279K2h.A06) != null && (interfaceC50520MRx = (InterfaceC50520MRx) c26076Bg5.A01) != null) {
            UserSession userSession = this.A07;
            String id = AbstractC166987dD.A10(userSession).getId();
            L7C l7c = (L7C) userSession.A01(L7C.class, new C50165MDs(userSession, 21));
            for (int i = 0; i < interfaceC50520MRx.getCount(); i++) {
                if (interfaceC50520MRx.BSl(i) == 0 && !id.equals(interfaceC50520MRx.BtG(i))) {
                    KVX A00 = l7c.A00(interfaceC50520MRx, i);
                    if (A00.A10 == C2EY.A1i) {
                        return A00;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC163557Ts
    public final String BPb() {
        return this.A04;
    }

    @Override // X.InterfaceC163557Ts
    public final int CNL(String str) {
        return this.A05.indexOf(this.A0D.get(str));
    }

    @Override // X.InterfaceC163557Ts
    public final boolean Cc4(String str) {
        C7T7 c7t7;
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A0D.get(str);
        if (!(interfaceC66482zP instanceof InterfaceC162797Qq) || (c7t7 = ((InterfaceC162797Qq) interfaceC66482zP).Apt().A0G) == null) {
            return false;
        }
        return c7t7.A08;
    }

    @Override // X.InterfaceC163557Ts
    public final int getItemCount() {
        C66362zD c66362zD = this.A00;
        if (c66362zD == null) {
            return 0;
        }
        return c66362zD.getItemCount();
    }

    public C49098Lnb(UserSession userSession, C7XE c7xe, C7XE c7xe2, C7XE c7xe3, C164357Wy c164357Wy, C7X7 c7x7) {
        this.A07 = userSession;
        this.A09 = c7xe;
        this.A0B = c164357Wy;
        this.A08 = c7xe2;
        this.A0C = c7x7;
        this.A0A = c7xe3;
    }

    public final void A02(C41761wQ c41761wQ, C49206LpN c49206LpN) {
        JQn.A00(C43597JQd.A00(c49206LpN.A02(), this, 37), c41761wQ, this, 35);
    }

    @Override // X.InterfaceC163557Ts
    public final HashSet Aim() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC163557Ts
    public final String Arm(MessageIdentifier messageIdentifier) {
        InterfaceC129555tK interfaceC129555tK;
        InterfaceC66482zP A01 = A01(messageIdentifier);
        if (A01 instanceof InterfaceC162797Qq) {
            interfaceC129555tK = ((InterfaceC162797Qq) A01).ArC();
        } else if (A01 instanceof C1584079a) {
            interfaceC129555tK = ((C1584079a) A01).A02;
        } else if (A01 instanceof K1S) {
            interfaceC129555tK = ((K1S) A01).A01;
        } else if (A01 instanceof K1N) {
            interfaceC129555tK = ((K1N) A01).A02;
        } else if (A01 instanceof K1Q) {
            interfaceC129555tK = ((K1Q) A01).A01;
        } else if (A01 instanceof K1R) {
            interfaceC129555tK = ((K1R) A01).A01;
        } else if (A01 instanceof KV9) {
            interfaceC129555tK = ((KV9) A01).A02;
        } else if (A01 instanceof C45229K0j) {
            interfaceC129555tK = ((C45229K0j) A01).A02;
        } else if (A01 instanceof C45266K1u) {
            interfaceC129555tK = ((C45266K1u) A01).A02;
        } else if (A01 instanceof JUH) {
            interfaceC129555tK = ((JUH) A01).A02;
        } else if (A01 instanceof C1582078f) {
            interfaceC129555tK = ((C1582078f) A01).A02;
        } else if (A01 instanceof K1I) {
            interfaceC129555tK = ((K1I) A01).A02;
        } else {
            interfaceC129555tK = null;
        }
        if (!(interfaceC129555tK instanceof AnonymousClass782)) {
            return null;
        }
        return ((AnonymousClass782) interfaceC129555tK).Arl();
    }

    @Override // X.InterfaceC163557Ts
    public final ArrayList BSu(String str) {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC163557Ts
    public final DirectMessageIdentifier BT9(C02T c02t, int i, boolean z) {
        C129535tI c129535tI;
        C38321qM c38321qM;
        if (!A00(i)) {
            return null;
        }
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A05.get(i);
        if (!(interfaceC66482zP instanceof InterfaceC162797Qq)) {
            return null;
        }
        InterfaceC129555tK ArC = ((InterfaceC162797Qq) interfaceC66482zP).ArC();
        if (!(ArC instanceof C129535tI) || (c38321qM = (c129535tI = (C129535tI) ArC).A08) == null || !c38321qM.Cff() || c38321qM.A5n()) {
            return null;
        }
        C2EY Ar9 = c129535tI.Ar9();
        if (!c02t.test(Ar9)) {
            return null;
        }
        MessageIdentifier BSy = c129535tI.BSy();
        return new DirectMessageIdentifier(Ar9, BSy.A01, BSy.A00());
    }

    @Override // X.InterfaceC163557Ts
    public final ArrayList Bku(int i) {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC163557Ts
    public final void COO(Context context, C7IY c7iy, C7IM c7im) {
        C02R.A05(c7iy.AZT() instanceof C66362zD);
        this.A00 = (C66362zD) c7iy.AZT();
    }

    @Override // X.InterfaceC163607Tx
    public final boolean CVc(int i) {
        if (!A00(i)) {
            return false;
        }
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A05.get(i);
        int i2 = i + 1;
        if (A00(i2) && (this.A05.get(i2) instanceof C161807Mp)) {
            return true;
        }
        if (!(interfaceC66482zP instanceof InterfaceC162797Qq)) {
            return false;
        }
        InterfaceC129555tK ArC = ((InterfaceC162797Qq) interfaceC66482zP).ArC();
        if (!(ArC instanceof InterfaceC129545tJ)) {
            return false;
        }
        InterfaceC129545tJ interfaceC129545tJ = (InterfaceC129545tJ) ArC;
        C7R2 A01 = AbstractC162807Qr.A01(interfaceC129545tJ.CVa(), interfaceC129545tJ.CVb());
        if (A01 != C7R2.A02 && A01 != C7R2.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163607Tx
    public final boolean CVd(int i) {
        InterfaceC129555tK Bn9;
        if (A00(i)) {
            int i2 = i - 1;
            if (!A00(i2) || !(this.A05.get(i2) instanceof C161717Mg)) {
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A05.get(i);
                if (interfaceC66482zP instanceof InterfaceC162797Qq) {
                    Bn9 = ((InterfaceC162797Qq) interfaceC66482zP).ArC();
                } else if (interfaceC66482zP instanceof InterfaceC1584279c) {
                    Bn9 = ((InterfaceC1584279c) interfaceC66482zP).Bn9();
                }
                if (Bn9 != null && (Bn9 instanceof InterfaceC129545tJ)) {
                    InterfaceC129545tJ interfaceC129545tJ = (InterfaceC129545tJ) Bn9;
                    C7R2 A01 = AbstractC162807Qr.A01(interfaceC129545tJ.CVa(), interfaceC129545tJ.CVb());
                    if (A01 == C7R2.A03 || A01 == C7R2.A04) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
