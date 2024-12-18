package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.DoG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31233DoG implements InterfaceC50518MRv {
    public final UserSession A00;
    public final C2EC A01;
    public final C83403nh A02;
    public final C31227DoA A03;

    public C31233DoG(UserSession userSession, C83403nh c83403nh, C2EC c2ec, C31227DoA c31227DoA) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c2ec, 2);
        C14360o3.A0B(c31227DoA, 4);
        this.A00 = userSession;
        this.A01 = c2ec;
        this.A02 = c83403nh;
        this.A03 = c31227DoA;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CLG() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVU() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CaO() {
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CfO() {
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final List Aa2() {
        return this.A01.Aa2();
    }

    @Override // X.InterfaceC50518MRv
    public final C81613kW Aic() {
        return this.A01.Aic();
    }

    @Override // X.InterfaceC50518MRv
    public final Integer An0() {
        C81543kP A0g = AbstractC31172DnG.A0g(this.A01);
        if (A0g != null) {
            return A0g.A05;
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Aqm() {
        return this.A01.Aqm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r2 != 61) goto L8;
     */
    @Override // X.InterfaceC50518MRv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.common.typedurl.ImageUrl Ass() {
        /*
            r4 = this;
            X.2EC r3 = r4.A01
            int r2 = r3.C7g()
            r0 = 28
            r1 = 0
            if (r2 == r0) goto L1f
            r0 = 29
            if (r2 == r0) goto L14
            r0 = 61
            if (r2 == r0) goto L1f
        L13:
            return r1
        L14:
            X.3kb r3 = (X.C81663kb) r3
            X.3iy r0 = r3.A01
            X.3kP r0 = r0.A0t
            if (r0 == 0) goto L13
            com.instagram.common.typedurl.ImageUrl r1 = r0.A04
            return r1
        L1f:
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r3.At4()
            if (r0 == 0) goto L13
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31233DoG.Ass():com.instagram.common.typedurl.ImageUrl");
    }

    @Override // X.InterfaceC50518MRv
    public final String Asv() {
        C81543kP c81543kP = ((C81663kb) this.A01).A01.A0t;
        if (c81543kP != null) {
            return c81543kP.A07;
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final DirectThreadKey Axg() {
        return this.A01.BKb();
    }

    @Override // X.InterfaceC50518MRv
    public final List Axh() {
        UserSession userSession = this.A00;
        if (AbstractC31235DoI.A02(userSession)) {
            return AbstractC31235DoI.A00(userSession, this.A01.Axh());
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final String B5E() {
        return this.A01.C7q();
    }

    @Override // X.InterfaceC50518MRv
    public final int BI1() {
        return this.A01.BI1();
    }

    @Override // X.InterfaceC50518MRv
    public final AnonymousClass172 BJU() {
        return this.A01.BJV();
    }

    @Override // X.InterfaceC50518MRv
    public final List BKM() {
        List list;
        C81543kP A0g = AbstractC31172DnG.A0g(this.A01);
        if (A0g == null || (list = A0g.A0D) == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC50518MRv
    public final List BKN() {
        List list;
        C81543kP A0g = AbstractC31172DnG.A0g(this.A01);
        if (A0g == null || (list = A0g.A0E) == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC50518MRv
    public final long BLG() {
        return TimeUnit.MICROSECONDS.toMillis(this.A01.BLF());
    }

    @Override // X.InterfaceC50518MRv
    public final String BLZ() {
        C83403nh BLX = this.A01.BLX();
        if (BLX != null) {
            return BLX.A0h();
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final Long BLu() {
        C83403nh BLs = this.A01.BLs();
        if (BLs != null) {
            return Long.valueOf(BLs.C8i());
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final Integer BN6() {
        return this.A01.BN6();
    }

    @Override // X.InterfaceC50518MRv
    public final int BT2() {
        return this.A01.BT2();
    }

    @Override // X.InterfaceC50518MRv
    public final Map BX8() {
        return ((C81663kb) this.A01).A01.A2E;
    }

    @Override // X.InterfaceC50518MRv
    public final C9BO BXU() {
        return this.A01.BXU();
    }

    @Override // X.InterfaceC50518MRv
    public final int BY6() {
        C2EC c2ec = this.A01;
        UserSession userSession = this.A00;
        C80993jT Av3 = c2ec.Av3(userSession.userId);
        if (Av3 == null) {
            return 0;
        }
        C4GV A0P = ((C2DU) AbstractC28761aE.A00(userSession)).A0P(c2ec.BKb());
        if (A0P != null) {
            return A0P.A0E(Av3, Integer.MAX_VALUE);
        }
        return -1;
    }

    @Override // X.InterfaceC50518MRv
    public final List BbX() {
        return this.A01.BSH();
    }

    @Override // X.InterfaceC50518MRv
    public final long BdM() {
        return this.A01.BdM();
    }

    @Override // X.InterfaceC50518MRv
    public final List Bl3() {
        return this.A01.BSD();
    }

    @Override // X.InterfaceC50518MRv
    public final List Bl6() {
        return this.A01.BSH();
    }

    @Override // X.InterfaceC50518MRv
    public final C51593Mql C58() {
        return this.A01.C58();
    }

    @Override // X.InterfaceC50518MRv
    public final int C7C() {
        return this.A01.B7A();
    }

    @Override // X.InterfaceC50518MRv
    public final ImageUrl C7H() {
        C106414qv C7L = this.A01.C7L();
        if (C7L != null) {
            return AbstractC40161tk.A03(C7L.A00, C05F.A01);
        }
        return null;
    }

    @Override // X.InterfaceC50518MRv
    public final DirectShareTarget C7e() {
        C2EC c2ec = this.A01;
        ArrayList A01 = C4GO.A01(c2ec.BSH());
        return new DirectShareTarget(AbstractC31232DoF.A00(c2ec.C7I(), A01), c2ec.C7l(), A01, c2ec.CRD());
    }

    @Override // X.InterfaceC50518MRv
    public final int C7g() {
        return this.A01.C7g();
    }

    @Override // X.InterfaceC50518MRv
    public final String C7l() {
        return this.A01.C7l();
    }

    @Override // X.InterfaceC50518MRv
    public final C3o9 CCb() {
        return this.A01.BKb();
    }

    @Override // X.InterfaceC50518MRv
    public final User CDm(String str, String str2) {
        return this.A01.CDm(str, str2);
    }

    @Override // X.InterfaceC50518MRv
    public final LinkedHashMap CDv() {
        HashMap CDu = this.A01.CDu();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(CDu.size()));
        for (Map.Entry entry : CDu.entrySet()) {
            Object key = entry.getKey();
            C80993jT c80993jT = (C80993jT) entry.getValue();
            linkedHashMap.put(key, new C31230DoD(c80993jT.A02, ((AbstractC81003jU) c80993jT).A00));
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CKe() {
        C31227DoA c31227DoA = this.A03;
        C2EC c2ec = this.A01;
        if (c31227DoA.A09(c2ec) && c31227DoA.A03(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CKg() {
        C31227DoA c31227DoA = this.A03;
        C2EC c2ec = this.A01;
        if (c31227DoA.A09(c2ec) && c31227DoA.A04(c2ec)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM0() {
        C2EC c2ec = this.A01;
        if (c2ec.BLW() != null) {
            UserSession userSession = this.A00;
            C83403nh BSh = AbstractC28761aE.A00(userSession).BSh(c2ec.BKb(), c2ec.BLW());
            if (BSh != null && !c2ec.Ccc(userSession.userId, BSh.A0h(), BSh.A1u)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM1() {
        return this.A01.CM1();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM2() {
        return this.A01.CM2();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM3() {
        return this.A01.CM3();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CM4() {
        C83553nw c83553nw;
        C81703kf c81703kf;
        String str;
        String str2;
        C83403nh c83403nh = this.A02;
        if (c83403nh != null) {
            C2EC c2ec = this.A01;
            if (!c2ec.isPending() && !c83403nh.A2P) {
                if (c2ec.Ay8() || ((c83553nw = c83403nh.A0N) != null && (str2 = c83553nw.A02) != null && AbstractC47160Ksv.A00.contains(str2))) {
                    return c2ec.CM5();
                }
                C08730cb c08730cb = C17060sy.A01;
                UserSession userSession = this.A00;
                if (c83403nh.A1l(c08730cb.A01(userSession))) {
                    C80993jT Av3 = c2ec.Av3(userSession.userId);
                    if (Av3 == null || (c81703kf = Av3.A02) == null || (str = c81703kf.A01) == null || c83403nh.A1o(str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CNV() {
        return this.A01.CLz(this.A00);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CNW() {
        return this.A01.CNW();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CPo() {
        return this.A01.CPl();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CSH() {
        return this.A01.CSF();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CSp() {
        return this.A01.CWl();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CTV() {
        C2EC c2ec = this.A01;
        UserSession userSession = this.A00;
        C2054597s c2054597s = C2054597s.A00;
        C16930sl c16930sl = C16930sl.A00;
        return AbstractC31236DoJ.A00(userSession, c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl), c2ec);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CUM() {
        return this.A01.CUM();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CUy() {
        if (this.A01.C7S() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVQ() {
        return this.A01.CVQ();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CVl() {
        C81543kP A0g = AbstractC31172DnG.A0g(this.A01);
        if (A0g != null) {
            return A0g.A0L;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CWD() {
        return C6X6.A0M(this.A00, this.A01);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CWO() {
        return this.A01.CWO();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CX1() {
        return this.A01.CX1();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXG() {
        C83403nh BLX = this.A01.BLX();
        if (BLX == null || BLX.A10 != C2EY.A0q || AbstractC162597Pw.A01(BLX, this.A00.userId)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXl() {
        C2EC c2ec = this.A01;
        c2ec.BKb();
        if (c2ec.C7I() != null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXo() {
        if (this.A01.BOU() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CXz() {
        return this.A01.CXz();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CYQ() {
        return this.A01.CYQ();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CZH() {
        return this.A01.CZH();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CaK() {
        return this.A01.CaK();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CbK() {
        return this.A01.CbK();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CbX() {
        return this.A01.CbX();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CbY() {
        int Bkp = this.A01.Bkp();
        UserSession userSession = this.A00;
        boolean z = false;
        if (Bkp == 0) {
            Boolean bool = (Boolean) AbstractC31237DoK.A00(userSession).A02.getValue();
            if (bool != null) {
                z = bool.booleanValue();
            }
            return !z;
        }
        if (Bkp == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CdS() {
        return this.A01.CdS();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cdw() {
        return AbstractC31231DoE.A04(this.A01);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CeR() {
        boolean z;
        C81663kb c81663kb = (C81663kb) this.A01;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                return c81663kb.A01.A2f;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy = c81663kb.A01;
        synchronized (c80693iy) {
            z = c80693iy.A2f;
        }
        return z;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CeS() {
        C51755Mte c51755Mte;
        Number number;
        C81663kb c81663kb = (C81663kb) this.A01;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                c51755Mte = c81663kb.A01.A0X;
            } finally {
                readLock.unlock();
            }
        } else {
            C80693iy c80693iy = c81663kb.A01;
            synchronized (c80693iy) {
                c51755Mte = c80693iy.A0X;
            }
        }
        if (c51755Mte != null && (number = (Number) c51755Mte.A00) != null) {
            return new Date(number.longValue()).after(new Date());
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cf6() {
        return this.A01.Cf8(this.A00);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean CfB() {
        int size;
        C2EC c2ec = this.A01;
        UserSession userSession = this.A00;
        if (c2ec.Av3(userSession.userId) != null) {
            C2DS A00 = AbstractC28761aE.A00(userSession);
            DirectThreadKey BKb = c2ec.BKb();
            C2DU c2du = (C2DU) A00;
            C4GV A0P = c2du.A0P(BKb);
            if (A0P != null && (size = c2du.CD3(BKb).size()) != 0) {
                C81663kb c81663kb = A0P.A0I;
                C14360o3.A07(c81663kb);
                if (A0P.A0E(c81663kb.Av3(c2du.A0A.userId), 20) != size) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfg() {
        return this.A03.A09(this.A01);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfh() {
        return this.A01.Cfh();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Cfy() {
        User Ba5 = this.A01.Ba5();
        if (Ba5 != null && Ba5.A2O()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean EjY() {
        C81663kb c81663kb = (C81663kb) this.A01;
        boolean z = true;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                if (!c81663kb.CVQ()) {
                    C80693iy c80693iy = c81663kb.A01;
                    if (c80693iy.A29.size() == 1) {
                        Object obj = c80693iy.A29.get(0);
                        C14360o3.A07(obj);
                        if (C6XI.A02((User) obj)) {
                            return z;
                        }
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        }
        C80693iy c80693iy2 = c81663kb.A01;
        synchronized (c80693iy2) {
            if (!c81663kb.CVQ() && c80693iy2.A29.size() == 1) {
                Object obj2 = c80693iy2.A29.get(0);
                C14360o3.A07(obj2);
                if (C6XI.A02((User) obj2)) {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // X.InterfaceC50518MRv
    public final boolean Eje() {
        C2EC c2ec = this.A01;
        boolean isPending = c2ec.isPending();
        boolean CVQ = c2ec.CVQ();
        return AbstractC31224Do7.A02(c2ec.BSH(), c2ec.BT2(), isPending, CVQ);
    }

    @Override // X.InterfaceC50518MRv
    public final boolean isMuted() {
        return this.A01.isMuted();
    }

    @Override // X.InterfaceC50518MRv
    public final boolean isPending() {
        return this.A01.isPending();
    }

    @Override // X.InterfaceC50518MRv
    public final EnumC92794Ds CAo() {
        return EnumC92794Ds.A05;
    }
}
