package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LrO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49330LrO implements C7B8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C45093JxN A01;
    public final /* synthetic */ DirectVisualMessageViewerController A02;

    @Override // X.C7B8
    public final void DG4(String str) {
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1vV, java.lang.Object, X.Lx2] */
    @Override // X.C7B8
    public final void DqF(List list) {
        C75363a3 c75363a3;
        C14360o3.A0B(list, 0);
        C83403nh c83403nh = (C83403nh) list.get(0);
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A02;
        AbstractC59962oe abstractC59962oe = directVisualMessageViewerController.A0f;
        if (abstractC59962oe.isResumed()) {
            UserSession userSession = directVisualMessageViewerController.A0m;
            if (c83403nh.A1e(userSession)) {
                FragmentActivity fragmentActivity = directVisualMessageViewerController.A0e;
                C2EC c2ec = directVisualMessageViewerController.A0n;
                User A04 = C4GQ.A04(userSession, c83403nh, c2ec);
                if (A04 != null) {
                    C45093JxN A02 = AbstractC101604hV.A02(fragmentActivity, userSession, c83403nh, A04, C4GQ.A06(c2ec));
                    C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
                    if (c47946LGa != null) {
                        C45093JxN c45093JxN = this.A01;
                        List list2 = c47946LGa.A03;
                        int indexOf = list2.indexOf(c45093JxN);
                        if (indexOf != -1) {
                            list2.set(indexOf, A02);
                            C42981yQ A00 = AbstractC42951yN.A00(userSession);
                            String moduleName = abstractC59962oe.getModuleName();
                            String A01 = A02.A01();
                            if (AbstractC167007dF.A1X(A02.A0B, EnumC40111tc.A0a)) {
                                c75363a3 = A02.A00();
                            } else {
                                c75363a3 = null;
                            }
                            C3ZM c3zm = new C3ZM(null, c75363a3, A01);
                            int i = this.A00;
                            ?? obj = new Object();
                            obj.A01 = A02;
                            obj.A00 = i;
                            A00.A03(new C9BP(new C43121yf(c3zm, obj), i, 0), moduleName);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    public C49330LrO(C45093JxN c45093JxN, DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        this.A02 = directVisualMessageViewerController;
        this.A01 = c45093JxN;
        this.A00 = i;
    }
}
