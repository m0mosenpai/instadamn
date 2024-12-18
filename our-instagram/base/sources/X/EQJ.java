package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQJ extends C2US implements InterfaceC65242xM, InterfaceC65252xN, InterfaceC161877Mx {
    public int A00;
    public int A01;
    public UserSession A02;
    public C32459ERl A03;
    public C31568Dtu A04;
    public HashMap A05;
    public boolean A06;
    public boolean A07;
    public C31369DqY A08;
    public String A09;
    public HashMap A0A;
    public final Context A0B;
    public final C65662y2 A0C;
    public final C34531FJr A0D;
    public final C168737g7 A0E;
    public final String A0F;
    public final ArrayList A0G;
    public final ArrayList A0H;
    public final HashMap A0I;
    public final java.util.Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final FNJ A0M;
    public final C65662y2 A0N;
    public final C31369DqY A0O;
    public final C31545DtV A0P;
    public final InterfaceC62602sz A0Q;
    public final C65842yM A0R;
    public final ESA A0S;
    public final Integer A0T;
    public final boolean A0U;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A0J.contains(str);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2y2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EQJ(android.app.Activity r28, android.content.Context r29, X.FNJ r30, X.InterfaceC11380iw r31, com.instagram.common.session.UserSession r32, X.C38O r33, X.InterfaceC37216GaR r34, X.InterfaceC62602sz r35, X.EVJ r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQJ.<init>(android.app.Activity, android.content.Context, X.FNJ, X.0iw, com.instagram.common.session.UserSession, X.38O, X.GaR, X.2sz, X.EVJ, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    private final int A00(Object obj, int i) {
        String str;
        int i2 = 0;
        if (!this.A0K || (str = this.A0F) == null || str.length() == 0 || this.A0L) {
            return 0;
        }
        HashMap hashMap = this.A0A;
        if (hashMap != null) {
            Integer valueOf = Integer.valueOf(i);
            if (obj != null) {
                i2 = obj.hashCode();
            }
            AbstractC166997dE.A1U(valueOf, hashMap, i2);
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.EQJ r17) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQJ.A01(X.EQJ):void");
    }

    public static void A02(EQJ eqj, Object obj) {
        int i = eqj.A00;
        eqj.A00 = i + eqj.A00(obj, i);
    }

    public static final void A03(EQJ eqj, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eqj.A0J.add(((C47O) it.next()).A03.getId());
            }
        }
    }

    private final boolean A04() {
        Iterator A13 = AbstractC166997dE.A13(this.A0G);
        int i = 0;
        while (A13.hasNext()) {
            C47K c47k = (C47K) AbstractC166997dE.A0l(A13);
            if (this.A0K) {
                List list = c47k.A0M;
                if (list != null && AbstractC166987dD.A1b(list)) {
                    i++;
                }
            } else {
                if (c47k.A07() && c47k.A03().isEmpty()) {
                }
                i++;
            }
        }
        if (i <= 1) {
            return false;
        }
        return true;
    }

    private final boolean A05() {
        if (C18U.A06(C06090Tz.A06, this.A02, 36318655771908478L) || this.A09.equals("su_in_stories")) {
            Integer num = this.A0T;
            if (num == C05F.A01 || num == C05F.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A06(ArrayList arrayList) {
        List list;
        this.A0J.clear();
        ArrayList arrayList2 = this.A0G;
        arrayList2.clear();
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            C47K c47k = (C47K) AbstractC166997dE.A0l(A13);
            arrayList2.add(c47k);
            if (!c47k.A07()) {
                list = c47k.A0M;
            } else if (c47k.A08()) {
                list = c47k.A03();
            }
            A03(this, list);
        }
        A01(this);
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0N.A03 = i;
        A01(this);
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        A01(this);
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long itemId;
        int i2;
        String str;
        Number A0W;
        int A03 = C0f9.A03(1347496540);
        if (this.A0K && (str = this.A0F) != null && str.length() != 0 && !this.A0L) {
            HashMap hashMap = this.A0A;
            if (hashMap != null && (A0W = AbstractC31171DnF.A0W(Integer.valueOf(i), hashMap)) != null) {
                itemId = A0W.intValue();
                i2 = 554611642;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-932316006, A03);
                throw A0g;
            }
        } else {
            itemId = super.getItemId(i);
            i2 = 746123289;
        }
        C0f9.A0A(i2, A03);
        return itemId;
    }
}
