package X;

import android.content.Context;
import com.instagram.business.promote.activity.PromoteActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.V1u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67905V1u extends AbstractC193068gm {
    public final int A00;
    public final Object A01;

    public C67905V1u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        PromoteActivity promoteActivity;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(abstractC115105If, 0);
                C69099Vhp c69099Vhp = (C69099Vhp) this.A01;
                Throwable A01 = abstractC115105If.A01();
                C69618VsL c69618VsL = c69099Vhp.A01;
                AbstractC25241Le.A00(null, "BKAsyncActionInvoker", AnonymousClass001.A0R("Bloks Async Action Request Failed - ", c69618VsL.A05), A01);
                XCT xct = c69618VsL.A02;
                if (xct != null) {
                    xct.onFailure(A01);
                }
                C66237U5h c66237U5h = c69618VsL.A00;
                if (c66237U5h == null) {
                    return;
                }
                c66237U5h.A00(null, AbstractC58320PtC.A0g(null));
                return;
            case 1:
                C14360o3.A0B(abstractC115105If, 0);
                AbstractC25241Le.A00(((C6FQ) this.A01).A03, "BKBloksActionMetaaiAsyncFetchResponseStreamImpl", "Unexpected error happened when fetching Meta AI response stream.", abstractC115105If.A01());
                return;
            case 2:
                promoteActivity = (PromoteActivity) this.A01;
                C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "launch_bfa_from_native_failed");
                AbstractC65702TsY.A0N(promoteActivity.A07).A0S(VG4.A17.toString(), "initial_fetch");
                PromoteActivity.A03(promoteActivity);
                PromoteActivity.A04(promoteActivity);
                return;
            default:
                promoteActivity = (PromoteActivity) this.A01;
                PromoteActivity.A03(promoteActivity);
                C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "launch_posm_2_from_native_failed");
                PromoteActivity.A04(promoteActivity);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        PromoteActivity promoteActivity;
        C66246U5q c66246U5q = (C66246U5q) obj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c66246U5q, 0);
                C69099Vhp c69099Vhp = (C69099Vhp) this.A01;
                HashMap hashMap = new HashMap(AbstractC06930Yk.A0E());
                C69618VsL c69618VsL = c69099Vhp.A01;
                Map map = c69618VsL.A03;
                if (map != null) {
                    hashMap.putAll(map);
                }
                Context context = c69099Vhp.A00;
                InterfaceC62872tQ interfaceC62872tQ = c69099Vhp.A02;
                C66237U5h c66237U5h = c69618VsL.A01;
                C66237U5h c66237U5h2 = c69618VsL.A00;
                if (c66246U5q.A02 == null) {
                    if (c66237U5h2 != null) {
                        c66237U5h2.A00(null, AbstractC58320PtC.A0g(null));
                    }
                } else {
                    Object A02 = C6FP.A02(context, c66246U5q, interfaceC62872tQ, C6FW.A01, hashMap);
                    if (c66237U5h != null) {
                        C6FX c6fx = new C6FX();
                        c6fx.A03(A02, 0);
                        c6fx.A02(null);
                        c66237U5h.A00(null, c6fx.A00());
                    }
                }
                XCT xct = c69618VsL.A02;
                if (xct == null) {
                    return;
                }
                xct.onSuccess();
                return;
            case 1:
                C14360o3.A0B(c66246U5q, 0);
                C6FP.A05(c66246U5q, new C66237U5h(C71809X5n.A00), (C6FQ) this.A01, AbstractC06930Yk.A0E());
                return;
            case 2:
                C14360o3.A0B(c66246U5q, 0);
                promoteActivity = (PromoteActivity) this.A01;
                C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "launch_bfa_from_native_success");
                AbstractC65702TsY.A0N(promoteActivity.A07).A0S(VG4.A17.toString(), "initial_fetch");
                PromoteActivity.A03(promoteActivity);
                AbstractC33787EwD.A00(C62862tP.A04(promoteActivity, new C19270xB("promoted_posts"), promoteActivity.getSession()), c66246U5q);
                return;
            default:
                C14360o3.A0B(c66246U5q, 0);
                promoteActivity = (PromoteActivity) this.A01;
                C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "launch_posm_2_from_native_success");
                promoteActivity.A03 = true;
                PromoteActivity.A03(promoteActivity);
                AbstractC33787EwD.A00(C62862tP.A04(promoteActivity, new C19270xB("promoted_posts"), promoteActivity.getSession()), c66246U5q);
                return;
        }
    }
}
