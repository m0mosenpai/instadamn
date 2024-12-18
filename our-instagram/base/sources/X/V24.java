package X;

import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteState;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V24 extends AbstractC67958V3x {
    public final /* synthetic */ XIGIGBoostDestination A00;
    public final /* synthetic */ VG4 A01;
    public final /* synthetic */ W6E A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V24(XIGIGBoostDestination xIGIGBoostDestination, VG4 vg4, C70399WUb c70399WUb, W6E w6e, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(c70399WUb, str);
        this.A02 = w6e;
        this.A01 = vg4;
        this.A04 = str2;
        this.A00 = xIGIGBoostDestination;
        this.A03 = str3;
        this.A05 = str4;
        this.A06 = z;
        this.A07 = z2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-321608507);
        C67833Uz6 c67833Uz6 = (C67833Uz6) obj;
        int A032 = C0f9.A03(186467843);
        UPA upa = c67833Uz6.A00;
        W6E w6e = this.A02;
        if (upa != null) {
            w6e.A02.A0J(this.A01, "reach_estimation_fetch", upa.A03);
        } else {
            C70399WUb c70399WUb = w6e.A02;
            VG4 vg4 = this.A01;
            c70399WUb.A0E(vg4, "reach_estimation_fetch");
            PromoteData promoteData = w6e.A03;
            PromoteReachEstimationStore promoteReachEstimationStore = promoteData.A0w;
            HashMap hashMap = new HashMap();
            Iterator A0l = AbstractC167007dF.A0l(c67833Uz6.A02);
            while (A0l.hasNext()) {
                String str = (String) A0l.next();
                hashMap.put(AbstractC58319PtB.A0m(str), c67833Uz6.A02.get(str));
            }
            HashMap hashMap2 = new HashMap();
            Iterator A0l2 = AbstractC167007dF.A0l(c67833Uz6.A01);
            while (A0l2.hasNext()) {
                String str2 = (String) A0l2.next();
                hashMap2.put(AbstractC58319PtB.A0m(str2), c67833Uz6.A01.get(str2));
            }
            String str3 = this.A04;
            String obj2 = this.A00.toString();
            String str4 = this.A03;
            String str5 = this.A05;
            boolean z = this.A06;
            boolean z2 = this.A07;
            AbstractC25233BEq.A0w(2, str3, obj2, str4);
            if (!C14360o3.A0K(promoteReachEstimationStore.A03, str3) || !C14360o3.A0K(promoteReachEstimationStore.A02, obj2) || !C14360o3.A0K(promoteReachEstimationStore.A00, str4) || !C14360o3.A0K(promoteReachEstimationStore.A01, str5) || promoteReachEstimationStore.A06 != z || promoteReachEstimationStore.A07 != z2) {
                promoteReachEstimationStore.A05 = new HashMap();
                promoteReachEstimationStore.A04 = new HashMap();
                promoteReachEstimationStore.A03 = str3;
                promoteReachEstimationStore.A02 = obj2;
                promoteReachEstimationStore.A00 = str4;
                promoteReachEstimationStore.A01 = str5;
                promoteReachEstimationStore.A06 = z;
                promoteReachEstimationStore.A07 = z2;
            }
            promoteReachEstimationStore.A05.putAll(hashMap);
            promoteReachEstimationStore.A04.putAll(hashMap2);
            String A01 = w6e.A01(vg4.toString(), "reach_estimation_fetch");
            Estimate A05 = promoteData.A05(A01);
            Estimate A04 = promoteData.A04(A01);
            if (A05 != null && A04 != null) {
                PromoteState promoteState = w6e.A04;
                promoteData.A0U = A05;
                promoteData.A0T = A04;
                PromoteState.A01(promoteState, C05F.A03);
            }
        }
        A01(c67833Uz6);
        C0f9.A0A(1609937776, A032);
        C0f9.A0A(-1149185208, A03);
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(908842644);
        this.A02.A02.A0M(this.A01, "reach_estimation_fetch", abstractC115105If.A01());
        super.onFail(abstractC115105If);
        C0f9.A0A(-650356420, A03);
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-76459522);
        super.onStart();
        C0f9.A0A(-877952898, A03);
    }
}
