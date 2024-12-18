package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes9.dex */
public class MZ4 implements JIG {
    public int A00;
    public InterfaceC58150PqF A01;
    public final UserSession A02;
    public final int A05;
    public final long A06;
    public final Context A07;
    public final InterfaceC60442pS A08;
    public final String A09;
    public final boolean A0A;
    public final PriorityQueue A04 = new PriorityQueue();
    public final Map A03 = AbstractC166987dD.A1G();

    public void A01(MZB mzb, MZA mza) {
    }

    @Override // X.JIG
    public final boolean Cdd(C38321qM c38321qM) {
        MZA mza;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A03;
        if (!map.isEmpty() && map.containsKey(c38321qM) && (mza = (MZA) map.get(c38321qM)) != null && mza.A0J(c38321qM)) {
            return true;
        }
        return false;
    }

    @Override // X.JIG
    public final void EUs(C38321qM c38321qM, boolean z) {
        MZA mza;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A03;
        if (map.containsKey(c38321qM) && (mza = (MZA) map.get(c38321qM)) != null) {
            mza.A0E(z);
        }
    }

    @Override // X.JIG
    public final void Eh6(C38321qM c38321qM, boolean z) {
        MZA mza;
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A03;
        if (map.containsKey(c38321qM) && (mza = (MZA) map.get(c38321qM)) != null) {
            mza.A0F(z);
        }
    }

    @Override // X.JIG
    public final int Eoj(C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        MZA mza = (MZA) this.A03.remove(c38321qM);
        if (mza == null) {
            return 0;
        }
        mza.A0D(str, true);
        PriorityQueue priorityQueue = this.A04;
        if (!priorityQueue.contains(mza)) {
            priorityQueue.add(mza);
            return mza.A00;
        }
        throw AbstractC166987dD.A14("Video player manager idle video player pool already contains video player");
    }

    public MZA A00() {
        if (this.A03.size() < this.A05) {
            return new MZA(this.A07, this.A02, this.A08, this.A09, this.A06);
        }
        return null;
    }

    @Override // X.JIG
    public final void E3f(String str) {
        Iterator A16 = AbstractC166997dE.A16(this.A03);
        while (A16.hasNext()) {
            ((MZA) A16.next()).A09();
        }
    }

    @Override // X.JIG
    public final void EE9() {
        Map map = this.A03;
        if (!map.isEmpty()) {
            Collection values = map.values();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                ((MZA) it.next()).A0A();
            }
            map.clear();
            this.A04.addAll(values);
        }
    }

    @Override // X.JIG
    public final void EKj() {
        Iterator A16 = AbstractC166997dE.A16(this.A03);
        while (A16.hasNext()) {
            ((MZA) A16.next()).A0B();
        }
    }

    @Override // X.JIG
    public final void EoV(String str, boolean z) {
        Map map = this.A03;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            MZA mza = (MZA) A16.next();
            mza.A0D(str, z);
            map.values().remove(mza);
            PriorityQueue priorityQueue = this.A04;
            if (!priorityQueue.contains(mza)) {
                priorityQueue.add(mza);
            } else {
                throw AbstractC166987dD.A14("Video player manager idle video player pool already contains video player");
            }
        }
    }

    public MZ4(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, long j, boolean z) {
        this.A07 = context;
        this.A02 = userSession;
        this.A08 = interfaceC60442pS;
        this.A09 = str;
        this.A0A = z;
        this.A06 = j;
        this.A05 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36591828576829459L);
    }

    @Override // X.JIG
    public final void E8Y(InterfaceC58117Ppg interfaceC58117Ppg, C38321qM c38321qM) {
        AbstractC167017dG.A1N(c38321qM, interfaceC58117Ppg);
        Iterator A16 = AbstractC166997dE.A16(this.A03);
        while (A16.hasNext() && !((MZA) A16.next()).A0I(interfaceC58117Ppg, c38321qM)) {
        }
    }
}
