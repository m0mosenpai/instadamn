package X;

import android.content.Context;
import android.view.LayoutInflater;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LYz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48300LYz implements C5GW {
    public final Context A00;
    public final LayoutInflater A01;
    public final C66462zN A02;
    public final UserSession A03;
    public final C98N A04;
    public final HashMap A05;
    public final InterfaceC14020nS A06;
    public volatile String A07;

    public C48300LYz(Context context, LayoutInflater layoutInflater, C66462zN c66462zN, UserSession userSession, C98N c98n, String str) {
        C14360o3.A0B(str, 6);
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = c66462zN;
        this.A01 = layoutInflater;
        this.A04 = c98n;
        this.A07 = str;
        this.A05 = AbstractC166987dD.A1G();
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A06 = A00;
    }

    @Override // X.C5GW
    public final void CKV(String str) {
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A03, 36317809663546985L)) {
            this.A07 = str;
            HashMap hashMap = this.A05;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                int A0H = AbstractC166987dD.A0H(A1K.getKey());
                int size = ((C7K4) A1K.getValue()).A01.size();
                ArrayList A17 = AbstractC25225BEi.A17(size);
                for (int i = 0; i < size; i++) {
                    AbstractC166997dE.A1W(A17, A0H);
                }
                AnonymousClass016.A16(A17, A1E);
            }
            hashMap.clear();
            A01(A1E);
        }
    }

    public final void A01(List list) {
        long j;
        UserSession userSession = this.A03;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317809663546985L)) {
            ArrayList A0q = AbstractC25230BEn.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                HashMap hashMap = this.A05;
                Integer valueOf = Integer.valueOf(A0B);
                Object obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new C7K4();
                    hashMap.put(valueOf, obj);
                }
                C7K4 c7k4 = (C7K4) obj;
                AbstractC66422zJ A02 = this.A02.A02(A0B);
                int i = c7k4.A00;
                if (A02 instanceof C159037Bp) {
                    j = 36599284640583149L;
                } else {
                    j = 36599284640517612L;
                }
                if (i < AbstractC25225BEi.A07(c06090Tz, userSession, j)) {
                    c7k4.A00++;
                    A0q.add(valueOf);
                }
            }
            if (AbstractC25226BEj.A1b(A0q)) {
                A00(this, A0q);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[RETURN] */
    @Override // X.C5GW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO AXD(int r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = r5.A05
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r4)
            X.7K4 r0 = (X.C7K4) r0
            r3 = 0
            if (r0 == 0) goto L33
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.A01
            java.lang.Object r1 = r0.poll()
            X.3OO r1 = (X.C3OO) r1
            if (r1 == 0) goto L34
            android.view.View r0 = r1.itemView
            if (r0 == 0) goto L34
            android.view.ViewParent r0 = r0.getParent()
        L21:
            java.lang.String r2 = "IgRecyclerViewMessageThreadViewHolderPreloader"
            if (r0 == 0) goto L36
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            r0 = 3631(0xe2f, float:5.088E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C0K8.A0Q(r2, r0, r1)
            return r3
        L33:
            r1 = r3
        L34:
            r0 = r3
            goto L21
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48300LYz.AXD(int):X.3OO");
    }

    public static final void A00(C48300LYz c48300LYz, List list) {
        if (AbstractC166987dD.A1b(list)) {
            c48300LYz.A06.ATO(new C45725KMc(c48300LYz, c48300LYz.A07, list));
        }
    }
}
