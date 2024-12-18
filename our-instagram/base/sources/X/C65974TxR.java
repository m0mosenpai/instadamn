package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.TxR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65974TxR extends AbstractC60592pi {
    public InterfaceC169457hL A00;
    public final long A01;
    public final long A02;
    public final Handler A03;
    public final C65979TxY A04;
    public final C65978TxX A05;
    public final InterfaceC169497hP A06;
    public final Deque A07;
    public final boolean A08;
    public final UserSession A09;
    public final Integer A0A;

    public C65974TxR(UserSession userSession, InterfaceC169457hL interfaceC169457hL, C65979TxY c65979TxY, InterfaceC169497hP interfaceC169497hP, Integer num, long j, long j2, boolean z, boolean z2) {
        C14360o3.A0B(num, 4);
        this.A00 = interfaceC169457hL;
        this.A0A = num;
        this.A02 = j;
        this.A09 = userSession;
        this.A07 = new ArrayDeque();
        this.A03 = new HandlerC65967TxK(Looper.getMainLooper(), this, 8);
        this.A06 = interfaceC169497hP;
        this.A05 = new C65978TxX(z2);
        this.A08 = z;
        this.A01 = j2;
        this.A04 = c65979TxY;
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        UQE uqe = new UQE(str);
        if (!this.A04.A01.containsKey(uqe)) {
            Deque deque = this.A07;
            if (!deque.contains(uqe)) {
                deque.add(uqe);
                Handler handler = this.A03;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessageDelayed(1, this.A02);
                }
            }
        }
    }

    public final boolean A06(String str) {
        C14360o3.A0B(str, 0);
        return A05(new UQE(str));
    }

    public static final void A00(UQE uqe, C65974TxR c65974TxR) {
        C1ON c1on;
        if (uqe != null && c65974TxR.A00 != null) {
            C65979TxY c65979TxY = c65974TxR.A04;
            String str = (String) c65974TxR.A05.A02.get(uqe);
            U34 u34 = new U34(uqe, c65974TxR);
            InterfaceC169467hM interfaceC169467hM = c65979TxY.A00;
            if (interfaceC169467hM != null) {
                if (interfaceC169467hM.Cdt() && C14360o3.A0K(uqe.A00, "fbsearch/ig_typeahead/")) {
                    C24531Hw AN8 = interfaceC169467hM.AN8(uqe, str);
                    if (AN8 != null) {
                        AN8.A02(new U39(uqe, u34, c65979TxY));
                        c1on = AN8;
                    } else {
                        return;
                    }
                } else {
                    C1ON AN6 = interfaceC169467hM.AN6(uqe, str);
                    AN6.A00 = new U3E(uqe, u34, c65979TxY);
                    c1on = AN6;
                }
                c65979TxY.A01.put(uqe, c1on);
                C1GL BqZ = interfaceC169467hM.BqZ();
                if (BqZ != null) {
                    BqZ.schedule(c1on, 879992394, 1, true, true);
                } else {
                    C1GJ.A06(c1on, 879992394, 1, true, true);
                }
            }
        }
    }

    public static final void A01(C65974TxR c65974TxR, String str) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Deque deque = c65974TxR.A07;
            if (!deque.isEmpty()) {
                UQE uqe = (UQE) deque.removeFirst();
                String str2 = uqe.A00;
                if (str2 != null && !str2.equals(str)) {
                    arrayList.add(uqe);
                } else if (c65974TxR.A00 != null) {
                    A00(uqe, c65974TxR);
                }
            } else {
                deque.addAll(arrayList);
                return;
            }
        }
    }

    public final void A02() {
        this.A07.clear();
        Iterator A0t = AbstractC167017dG.A0t(this.A04.A01);
        while (A0t.hasNext()) {
            ((C11R) A0t.next()).onCancel();
        }
    }

    public final boolean A04() {
        if (!(!this.A04.A01.isEmpty()) && this.A07.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r2.hasMessages(1) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.UQE r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65974TxR.A05(X.UQE):boolean");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A03.removeCallbacksAndMessages(null);
        this.A00 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A06.clear();
        A02();
    }
}
