package X;

import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes8.dex */
public final class JR8 implements InterfaceC42271xH, InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public JR8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        switch (this.A00) {
            case 0:
                LYF lyf = (LYF) obj;
                C14360o3.A0B(lyf, 0);
                KCP kcp = (KCP) this.A01;
                C47Z A06 = kcp.A06(kcp.requireContext());
                if (A06 != null) {
                    return C14360o3.A0K(A06.A35, lyf.A00);
                }
                return false;
            case 1:
                C2AS c2as = (C2AS) obj;
                C14360o3.A0B(c2as, 0);
                JR3 jr3 = (JR3) this.A01;
                if (jr3.getContext() != null && jr3.A05 != null && C14360o3.A0K(c2as.A00, C17060sy.A01.A01(JR3.A01(jr3)))) {
                    return true;
                }
                return false;
            default:
                C3IL c3il = (C3IL) obj;
                C14360o3.A0B(c3il, 0);
                if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(c3il.A00) && C14360o3.A0K(((DirectVisualMessageViewerController) this.A01).A0m.userId, c3il.A01)) {
                    c3il.A04 = "user in visual message viewer";
                    c3il.A03 = 1019;
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1322743011);
                int A032 = C0f9.A03(434263913);
                KCP kcp = (KCP) this.A01;
                if (kcp.A0I == C05F.A0N) {
                    KCP.A04(kcp);
                    AbstractC31176DnK.A0Q(kcp.A0O).A05(new Object());
                } else {
                    KB4 kb4 = kcp.A0E;
                    if (kb4 != null) {
                        kb4.A0C();
                    }
                    MXB mxb = kcp.A08;
                    if (mxb != null) {
                        mxb.A08(C05F.A01);
                    }
                    AbstractC43593JPy.A1P(AbstractC166987dD.A0r(kcp.A0O));
                }
                C0f9.A0A(-657358043, A032);
                i = -438100828;
                break;
            case 1:
                A03 = C0f9.A03(1204392868);
                int A033 = C0f9.A03(-353428051);
                JR3 jr3 = (JR3) this.A01;
                if (!C2E8.A09(JR3.A01(jr3))) {
                    jr3.A06 = null;
                }
                JR2 jr2 = jr3.A05;
                if (jr2 != null) {
                    jr2.A16(jr3.A06);
                }
                C0f9.A0A(247557465, A033);
                i = 1911134058;
                break;
            default:
                A03 = C0f9.A03(230907025);
                C0f9.A0A(823193250, C0f9.A03(1855577478));
                i = 1809353108;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
