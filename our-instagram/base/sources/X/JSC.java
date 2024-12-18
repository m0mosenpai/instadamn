package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes8.dex */
public final class JSC implements MRV {
    public final Context A00;
    public final UserSession A01;
    public final C83403nh A02;
    public final C2EC A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C93384Gr A06;

    public JSC(Context context, UserSession userSession, C83403nh c83403nh, C2EC c2ec, C93384Gr c93384Gr) {
        C14360o3.A0B(c2ec, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c2ec;
        this.A02 = c83403nh;
        this.A06 = c93384Gr;
        this.A05 = AbstractC09440dt.A01(new MHH(this, 24));
        this.A04 = AbstractC09440dt.A01(new MHH(this, 23));
    }

    @Override // X.MRV
    public final C2EY Ar9() {
        C2EY c2ey = this.A02.A10;
        C14360o3.A07(c2ey);
        return c2ey;
    }

    @Override // X.MRV
    public final C101674hc Axj() {
        C101584hT c101584hT = this.A02.A0e;
        if (c101584hT != null) {
            return c101584hT.A03;
        }
        return null;
    }

    @Override // X.MRV
    public final Integer BN5() {
        return this.A02.A1F;
    }

    @Override // X.MRV
    public final List BsH() {
        HashSet A03;
        C2EC c2ec = this.A03;
        UserSession userSession = this.A01;
        C83403nh c83403nh = this.A02;
        C81663kb c81663kb = (C81663kb) c2ec;
        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = c81663kb.A03.readLock();
            readLock.lock();
            try {
                String str = c83403nh.A1u;
                C14360o3.A07(str);
                A03 = C81663kb.A03(userSession, c81663kb, str, c83403nh.A0h());
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (c81663kb.A01) {
                String str2 = c83403nh.A1u;
                C14360o3.A07(str2);
                A03 = C81663kb.A03(userSession, c81663kb, str2, c83403nh.A0h());
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A03, 10));
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            arrayList.add(((C206419By) it.next()).A02);
        }
        return arrayList;
    }

    @Override // X.MRV
    public final String BtC() {
        User user = (User) this.A04.getValue();
        if (user != null) {
            return AbstractC101904i3.A08(user);
        }
        return null;
    }

    @Override // X.MRV
    public final String BtF() {
        String str = this.A02.A1u;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.MRV
    public final ImageUrl BtJ() {
        User user = (User) this.A04.getValue();
        if (user != null) {
            return user.Bhu();
        }
        return null;
    }

    @Override // X.MRV
    public final CharSequence ByE() {
        return (CharSequence) this.A05.getValue();
    }

    @Override // X.MRV
    public final java.util.Set CGn() {
        java.util.Set unmodifiableSet;
        C101584hT c101584hT = this.A02.A0e;
        if (c101584hT == null || (unmodifiableSet = Collections.unmodifiableSet(c101584hT.A0C)) == null) {
            return C16910sj.A00;
        }
        return unmodifiableSet;
    }

    @Override // X.MRV
    public final String CGv() {
        C101584hT c101584hT = this.A02.A0e;
        if (c101584hT != null) {
            return c101584hT.A0A;
        }
        return null;
    }

    @Override // X.MRV
    public final List CHI() {
        String A08;
        ImmutableList A0I = this.A02.A0I();
        if (A0I != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A0I);
            Iterator<E> it = A0I.iterator();
            while (it.hasNext()) {
                String str = ((C34501FIn) it.next()).A01;
                User CDl = this.A03.CDl(str);
                if (CDl == null && (CDl = AbstractC31174DnI.A0k(this.A01, str)) == null) {
                    A08 = null;
                } else {
                    A08 = AbstractC101904i3.A08(CDl);
                }
                A0q.add(A08);
            }
            return AbstractC001800i.A0X(A0q);
        }
        return C16930sl.A00;
    }

    @Override // X.MRV
    public final boolean CM6() {
        return this.A02.A1P();
    }

    @Override // X.MRV
    public final boolean CPN() {
        C83403nh c83403nh = this.A02;
        if (c83403nh.A0N == null && c83403nh.A0C == null) {
            return false;
        }
        return true;
    }

    @Override // X.MRV
    public final boolean CSd() {
        return this.A02.A1T();
    }

    @Override // X.MRV
    public final boolean CSg() {
        String str;
        C83553nw c83553nw = this.A02.A0N;
        if (c83553nw != null && (str = c83553nw.A02) != null) {
            return AbstractC47160Ksv.A00.contains(str);
        }
        return false;
    }

    @Override // X.MRV
    public final boolean CVA() {
        return this.A02.A1j(C17060sy.A01.A01(this.A01));
    }

    @Override // X.MRV
    public final boolean CVD() {
        User user = (User) this.A04.getValue();
        if (user != null && user.A1U()) {
            return true;
        }
        return false;
    }

    @Override // X.MRV
    public final boolean CYm() {
        C101864hx c101864hx;
        Boolean bool;
        Object obj = this.A02.A1T;
        if (obj instanceof C101864hx) {
            c101864hx = (C101864hx) obj;
        } else {
            c101864hx = null;
        }
        if (c101864hx == null || CVA() || c101864hx.A02 != C05F.A0N || (bool = c101864hx.A01) == null || bool.booleanValue() || !c101864hx.A07) {
            return false;
        }
        return true;
    }

    @Override // X.MRV
    public final boolean CYn() {
        C101864hx c101864hx;
        Boolean bool;
        Object obj = this.A02.A1T;
        if (obj instanceof C101864hx) {
            c101864hx = (C101864hx) obj;
        } else {
            c101864hx = null;
        }
        if (c101864hx == null || CVA() || c101864hx.A02 != C05F.A0N || (bool = c101864hx.A01) == null || bool.booleanValue() || c101864hx.A07) {
            return false;
        }
        return true;
    }

    @Override // X.MRV
    public final boolean Cd1() {
        return this.A02.A2P;
    }

    @Override // X.MRV
    public final Boolean Cg0() {
        C101594hU c101594hU;
        C101584hT c101584hT = this.A02.A0e;
        if (c101584hT == null || (c101594hU = c101584hT.A04) == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC167007dF.A1X(c101594hU.A07, EnumC40111tc.A0Q));
    }

    @Override // X.MRV
    public final boolean Cg2() {
        C101584hT c101584hT;
        C101594hU c101594hU;
        C83403nh c83403nh = this.A02;
        if (c83403nh.A10 == C2EY.A0q && (c83403nh.A1T instanceof C101584hT) && (c101584hT = c83403nh.A0e) != null && (c101594hU = c101584hT.A04) != null && c101594hU.A0P) {
            return true;
        }
        return false;
    }

    @Override // X.MRV
    public final boolean Cg3() {
        C101584hT c101584hT = this.A02.A0e;
        if (c101584hT != null && c101584hT.A0A != null) {
            return true;
        }
        return false;
    }

    @Override // X.MRV
    public final boolean EJS() {
        return !C93384Gr.A00(this.A02, this.A06, false);
    }

    @Override // X.MRV
    public final String getId() {
        return this.A02.A0h();
    }

    @Override // X.MRV
    public final long C8g() {
        C9BH ByD;
        C206349Br c206349Br;
        if (!CSg() && (ByD = this.A03.ByD()) != null && (c206349Br = (C206349Br) ByD.A00) != null) {
            long j = c206349Br.A01;
            if (Long.valueOf(j) != null) {
                return j;
            }
        }
        return TimeUnit.MICROSECONDS.toMillis(this.A02.C8i());
    }

    @Override // X.MRV
    public final Collection CGo() {
        java.util.Set CGn = CGn();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = CGn.iterator();
        while (it.hasNext()) {
            User CDl = this.A03.CDl(AbstractC166987dD.A1B(it));
            if (CDl != null) {
                A1E.add(CDl.getUsername());
            }
        }
        return A1E;
    }
}
