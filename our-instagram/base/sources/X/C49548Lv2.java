package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.Lv2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49548Lv2 implements InterfaceC42731y1 {
    public long A00;
    public InterfaceC42801y8 A01;
    public boolean A02;
    public long A03;
    public final Context A04;
    public final UserSession A05;
    public final InterfaceC42591xn A06;
    public final InterfaceC50398MNa A07;
    public final LinkedHashMap A08;
    public final boolean A09;
    public final Handler A0A;
    public final C42521xg A0B;
    public final C42771y5 A0C;
    public final Runnable A0D;
    public final LinkedList A0E;
    public final Map A0F;
    public final java.util.Set A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    @Override // X.InterfaceC42731y1
    public final void A8e(C75363a3 c75363a3, C4AF c4af, String str) {
        synchronized (this) {
            java.util.Set set = this.A0G;
            String str2 = c75363a3.A0G;
            if (!set.contains(str2)) {
                set.add(str2);
                L32 l32 = new L32(c75363a3, c4af, str2, str);
                if (this.A0J && c75363a3.A0T) {
                    this.A0E.addFirst(l32);
                } else {
                    this.A0E.add(l32);
                }
            }
        }
    }

    @Override // X.InterfaceC42731y1
    public final void EDb(String str, int i) {
        C14360o3.A0B(str, 0);
        this.A0F.put(str, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0190, code lost:
    
        if (X.AbstractC31177DnL.A1U(r6, r9, r0) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C49548Lv2 r25) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49548Lv2.A00(X.Lv2):void");
    }

    @Override // X.InterfaceC42731y1
    public final void A9w(C43121yf c43121yf, String str) {
        LinkedHashMap linkedHashMap = this.A08;
        String str2 = c43121yf.A01.A02;
        C14360o3.A0A(str2);
        linkedHashMap.put(str2, new Pair(c43121yf, str));
    }

    @Override // X.InterfaceC42731y1
    public final void DyD() {
        this.A01.AGN(false);
        this.A0A.removeCallbacks(this.A0D);
    }

    @Override // X.InterfaceC42731y1
    public final void EGC(String str) {
        LinkedHashMap linkedHashMap = this.A08;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (C14360o3.A0K(((Pair) A1K.getValue()).second, str)) {
                AbstractC43594JPz.A1S(A1I, A1K);
            }
        }
        ArrayList A17 = AbstractC25225BEi.A17(A1I.size());
        Iterator A142 = AbstractC166997dE.A14(A1I);
        while (A142.hasNext()) {
            A17.add(AbstractC166987dD.A1K(A142).getKey());
        }
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(it.next());
        }
    }

    @Override // X.InterfaceC42731y1
    public final void Enk(Integer num) {
        if (this.A0I) {
            Handler handler = this.A0A;
            Runnable runnable = this.A0D;
            handler.removeCallbacks(runnable);
            String str = C26771Rh.A00().A00;
            C14360o3.A07(str);
            int i = 100;
            if ("stories".equals(str)) {
                i = 200;
            }
            long elapsedRealtime = i - (SystemClock.elapsedRealtime() - this.A03);
            if (elapsedRealtime > 0) {
                handler.postDelayed(runnable, elapsedRealtime);
                return;
            }
        } else if (this.A0K) {
            this.A0A.post(this.A0D);
            return;
        }
        A01(this);
    }

    public C49548Lv2(Context context, UserSession userSession, InterfaceC42591xn interfaceC42591xn, C42521xg c42521xg, C42771y5 c42771y5, InterfaceC50398MNa interfaceC50398MNa) {
        long j;
        AbstractC167017dG.A1P(context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A0B = c42521xg;
        this.A06 = interfaceC42591xn;
        this.A07 = interfaceC50398MNa;
        this.A0C = c42771y5;
        this.A0F = AbstractC166987dD.A1I();
        this.A0A = AbstractC167007dF.A0J();
        this.A0D = new M2D(this);
        this.A08 = AbstractC166987dD.A1I();
        this.A0E = new LinkedList();
        this.A0G = AbstractC31171DnF.A0l();
        C42541xi c42541xi = c42521xg.A06;
        this.A09 = c42541xi.A06;
        this.A0I = c42541xi.A04;
        this.A0K = c42541xi.A07;
        this.A0H = c42541xi.A01;
        this.A0J = c42541xi.A05;
        if (c42541xi.A03) {
            j = c42541xi.A00;
        } else {
            j = 1;
        }
        this.A01 = new C42791y7(userSession, -1, j);
    }

    public static final void A01(C49548Lv2 c49548Lv2) {
        c49548Lv2.A03 = SystemClock.elapsedRealtime();
        C42571xl c42571xl = ((C49549Lv3) c49548Lv2.A07).A00.A09;
        synchronized (c42571xl) {
            Iterator A15 = AbstractC166997dE.A15(c42571xl.A01);
            while (A15.hasNext()) {
                ((C89483yo) AbstractC31176DnK.A0j(A15)).A03 = 0;
            }
        }
        c49548Lv2.A01.AGN(true);
        A00(c49548Lv2);
        SystemClock.elapsedRealtime();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49548Lv2(Context context, UserSession userSession, C42521xg c42521xg, InterfaceC42591xn interfaceC42591xn, InterfaceC50398MNa interfaceC50398MNa, C42771y5 c42771y5, InterfaceC42801y8 interfaceC42801y8) {
        this(context, userSession, interfaceC42591xn, c42521xg, c42771y5, interfaceC50398MNa);
        C14360o3.A0B(context, 1);
        AbstractC25234BEr.A1R(userSession, c42521xg, interfaceC42591xn, interfaceC50398MNa, c42771y5);
        C14360o3.A0B(interfaceC42801y8, 7);
        this.A01 = interfaceC42801y8;
    }
}
