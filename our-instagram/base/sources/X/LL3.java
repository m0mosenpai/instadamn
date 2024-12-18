package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LL3 {
    public static final C2EC A00(UserSession userSession, ThreadFetchReason threadFetchReason, Integer num, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        String A0j = AbstractC167017dG.A0j();
        C09530e4 A02 = A02(userSession, threadFetchReason, str, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0j, false);
        C4KV c4kv = (C4KV) A02.A00;
        AnonymousClass776 anonymousClass776 = (AnonymousClass776) A02.A01;
        C45392K8f c45392K8f = new C45392K8f(userSession, anonymousClass776, c4kv, null, num, str, null, z);
        AnonymousClass777 A0G = DirectThreadApi.A0G(userSession, anonymousClass776, null, num, null, str, null, null, A0j);
        A0G.A00(c45392K8f);
        C1GJ.A02(A0G);
        return c45392K8f.A00.A05;
    }

    public static final C2EC A01(UserSession userSession, ThreadFetchReason threadFetchReason, List list) {
        C14360o3.A0B(userSession, 0);
        C81663kb B3U = AbstractC28761aE.A00(userSession).B3U(new DirectThreadKey(null, list));
        if (!AbstractC31283Dp5.A00(B3U)) {
            String A0j = AbstractC167017dG.A0j();
            C09530e4 A02 = A02(userSession, threadFetchReason, null, "participants", A0j, true);
            C4KV c4kv = (C4KV) A02.A00;
            AnonymousClass776 anonymousClass776 = (AnonymousClass776) A02.A01;
            C45392K8f c45392K8f = new C45392K8f(userSession, anonymousClass776, c4kv, null, null, null, list, false);
            try {
                AnonymousClass777 A0H = DirectThreadApi.A0H(userSession, anonymousClass776, null, null, A0j, list, false);
                A0H.A00(c45392K8f);
                C1GJ.A02(A0H);
            } catch (NullPointerException e) {
                C0K8.A0J("DirectThreadLoader", "thread fetch by recipients failed", e);
            }
            return c45392K8f.A00.A05;
        }
        return B3U;
    }

    public static final C09530e4 A02(UserSession userSession, ThreadFetchReason threadFetchReason, String str, String str2, String str3, boolean z) {
        C4KT A00 = C4KS.A00(userSession);
        C4KV c4kv = (C4KV) userSession.A01(C4KV.class, MHJ.A00(userSession, 39));
        return AbstractC166987dD.A1L(c4kv, c4kv.A0E(userSession, threadFetchReason, null, str, str2, "DirectThreadLoader", str3, A00.A00(), AbstractC453326q.A02(userSession), z));
    }

    public static final void A04(UserSession userSession, ThreadFetchReason threadFetchReason, MR6 mr6, List list, boolean z, boolean z2) {
        C81663kb c81663kb = null;
        if (!z) {
            c81663kb = AbstractC28761aE.A00(userSession).B3U(new DirectThreadKey(null, list));
        }
        if (AbstractC31283Dp5.A00(c81663kb)) {
            mr6.onSuccess(c81663kb);
            mr6.onSuccessInBackground(c81663kb);
            return;
        }
        String A0j = AbstractC167017dG.A0j();
        C09530e4 A02 = A02(userSession, threadFetchReason, null, "participants", A0j, true);
        C4KV c4kv = (C4KV) A02.A00;
        AnonymousClass776 anonymousClass776 = (AnonymousClass776) A02.A01;
        C14360o3.A0B(list, 1);
        AnonymousClass777 A0H = DirectThreadApi.A0H(userSession, anonymousClass776, null, null, A0j, list, z2);
        A0H.A00(new C45392K8f(userSession, anonymousClass776, c4kv, mr6, null, null, list, false));
        C1GJ.A03(A0H);
    }

    public static final void A05(UserSession userSession, Integer num, String str, String str2) {
        C14360o3.A0B(str, 1);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0L("direct_v2/threads/%s/noncritical/", str);
        A0M.A0R(C38849H8x.class, C41257INy.class);
        A0M.A0A(num, "limit");
        A0M.A0H("prev_cursor", str2);
        C1ON A0N = A0M.A0N();
        C44093JeI.A00(A0N, userSession, 19);
        C1GJ.A03(A0N);
    }

    public static final void A03(UserSession userSession, ThreadFetchReason threadFetchReason, MR6 mr6, Integer num, String str, boolean z) {
        C81663kb A0h;
        AbstractC167007dF.A1K(userSession, str);
        C14360o3.A0B(threadFetchReason, 4);
        if (z) {
            A0h = null;
        } else {
            A0h = AbstractC31172DnG.A0h(AbstractC28761aE.A00(userSession), str);
        }
        if (AbstractC31283Dp5.A00(A0h)) {
            if (mr6 != null) {
                mr6.onSuccess(A0h);
                mr6.onSuccessInBackground(A0h);
                return;
            }
            return;
        }
        C09530e4 A02 = A02(userSession, threadFetchReason, str, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, AbstractC167017dG.A0j(), false);
        C4KV c4kv = (C4KV) A02.A00;
        AnonymousClass776 anonymousClass776 = (AnonymousClass776) A02.A01;
        AnonymousClass777 A0G = DirectThreadApi.A0G(userSession, anonymousClass776, null, num, null, str, null, null, AbstractC167017dG.A0j());
        A0G.A00(new C45392K8f(userSession, anonymousClass776, c4kv, mr6, num, str, null, false));
        C1GJ.A03(A0G);
    }
}
