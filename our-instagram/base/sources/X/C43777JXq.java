package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.JXq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43777JXq implements InterfaceC13000lm {
    public final C42201xA A00;
    public final UserSession A01;
    public final C137756Lx A02;
    public final MutedWordsFilterManager A03;
    public final Object A04;
    public final java.util.Set A05;
    public final java.util.Set A06;
    public final AtomicBoolean A07;
    public final AtomicBoolean A08;
    public final AtomicInteger A09;
    public final AtomicInteger A0A;
    public final C41761wQ A0B;
    public final C209869Px A0C;

    public C43777JXq(UserSession userSession, EnumC132075xi enumC132075xi, MutedWordsFilterManager mutedWordsFilterManager) {
        AbstractC25233BEq.A0v(1, userSession, mutedWordsFilterManager, enumC132075xi);
        this.A01 = userSession;
        this.A03 = mutedWordsFilterManager;
        this.A07 = new AtomicBoolean(true);
        this.A08 = new AtomicBoolean(false);
        this.A09 = new AtomicInteger(0);
        this.A0A = new AtomicInteger(0);
        C41761wQ A0S = AbstractC31174DnI.A0S();
        this.A0B = A0S;
        this.A00 = AbstractC42021ws.A00();
        C137756Lx A00 = C137746Lw.A00(userSession, enumC132075xi.A00);
        this.A02 = A00;
        this.A04 = new Object();
        this.A05 = AbstractC31171DnF.A0l();
        this.A06 = AbstractC31171DnF.A0l();
        C209869Px c209869Px = new C209869Px(this);
        this.A0C = c209869Px;
        mutedWordsFilterManager.A0C.add(c209869Px);
        JQn.A00(this.A02.A01.A09.A0L(new JQI(1)).A0K(C44102JeR.A00), A0S, this, 64);
        JQn.A00(C43597JQd.A01(C43601JQh.A00(C137766Ly.A00(A00.A01), JRC.A00, 12), new C50261MHq(this, 36), 66), A0S, this, 65);
    }

    public final void A00(String str) {
        int i;
        synchronized (this.A04) {
            java.util.Set set = this.A05;
            set.remove(str);
            java.util.Set set2 = this.A06;
            set2.remove(str);
            AtomicInteger atomicInteger = this.A09;
            int size = set.size();
            Integer num = (Integer) this.A00.A0W();
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            atomicInteger.set(size + i);
            this.A0A.set(set2.size());
        }
    }

    public final void A01(boolean z) {
        AtomicBoolean atomicBoolean = this.A07;
        atomicBoolean.compareAndSet(false, z);
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        if (!mutedWordsFilterManager.A09()) {
            if (this.A08.getAndSet(false)) {
                AbstractC25651Mw.A00(this.A01).E4s(new C48022Ip(null, false, false, false));
                return;
            }
            return;
        }
        if (!atomicBoolean.getAndSet(false)) {
            return;
        }
        UserSession userSession = this.A01;
        int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36593387651007730L);
        int i = 1;
        if (mutedWordsFilterManager.A08()) {
            i = 20;
        }
        C006802i c006802i = C006802i.A0p;
        UUID A00 = C0HM.A00();
        C14360o3.A07(A00);
        C2057498z c2057498z = C2057498z.A00;
        Integer valueOf = Integer.valueOf(A07);
        Integer valueOf2 = Integer.valueOf(i);
        java.util.Set set = C4I4.A00(userSession).A00;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0q.add(Integer.valueOf(((EnumC46248KdP) it.next()).A00));
        }
        AnonymousClass777 A002 = C99W.A00(userSession, c2057498z, null, true, null, valueOf, valueOf2, null, null, null, null, null, A00.toString(), AbstractC001800i.A0a(A0q), -1L);
        A002.A00(new C31456Ds0(25, c006802i, this));
        C1GJ.A06(A002, 501110836, 3, true, true);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        MutedWordsFilterManager mutedWordsFilterManager = this.A03;
        C209869Px c209869Px = this.A0C;
        C14360o3.A0B(c209869Px, 0);
        mutedWordsFilterManager.A0C.remove(c209869Px);
        this.A0B.A01();
    }
}
