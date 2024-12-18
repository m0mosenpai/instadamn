package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5IE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IE extends C5I3 {
    public int A00;
    public long A01;
    public long A02;
    public C5I5 A03;
    public final List A04;
    public final Integer A05;
    public final String A06;

    public C5IE(C206239Bg c206239Bg) {
        String id;
        Integer num;
        C42159Im7 A03;
        List<C40971v4> list;
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        boolean A0H = c120985dq.A0H();
        if (!A0H && c120985dq.A01 != EnumC129395t1.A05) {
            id = c120985dq.A06().A0S;
        } else {
            id = c120985dq.getId();
        }
        this.A06 = id;
        if (A0H) {
            num = C05F.A0N;
        } else {
            num = C05F.A0C;
        }
        this.A05 = num;
        ArrayList arrayList = null;
        if (c120985dq.A0G() && (A03 = c120985dq.A03()) != null && (list = (List) A03.A01.A00) != null && (!list.isEmpty())) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (C40971v4 c40971v4 : list) {
                C9C2 c9c2 = c120985dq.A03().A01;
                C16930sl c16930sl = C16930sl.A00;
                String str = c9c2.A02;
                IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = (IntentAwareAdsInfoIntf) c9c2.A01;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(intentAwareAdsInfoIntf, 1);
                C14360o3.A0B(c16930sl, 2);
                arrayList.add(new C5IE(new C206239Bg(C128085qc.A01(new C9C2(intentAwareAdsInfoIntf, str, c16930sl), c40971v4), (C671831j) c206239Bg.A04)));
            }
        }
        this.A04 = arrayList;
        this.A03 = C5I5.A07;
        this.A00 = -1;
        this.A01 = -1L;
        this.A02 = -1L;
    }

    @Override // X.C5I4
    public final String AZM() {
        return "";
    }

    @Override // X.C5I4
    public final Integer BKD() {
        return this.A05;
    }

    @Override // X.C5I4
    public final List BVA() {
        return this.A04;
    }

    @Override // X.C5I4
    public final int BgX() {
        return 0;
    }

    @Override // X.C5I4
    public final String getId() {
        return this.A06;
    }
}
