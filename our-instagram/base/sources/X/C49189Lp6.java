package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Lp6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49189Lp6 implements InterfaceC50469MPx {
    public final UserSession A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;
    public final C47762L7i A03;
    public final List A04 = AbstractC16960so.A1Q(Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS), 4001, 4002, 4003, 4004, 4005, 4006, 4007);
    public final Context A05;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (LIQ.A00(c99e, interfaceC50520MRx, i) == C2EY.A1k) {
            if (AbstractC001800i.A0u(this.A04, interfaceC50520MRx.CID(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0190, code lost:
    
        if (r7 != X.C05F.A00) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r1 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0085, code lost:
    
        if (r3 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r12.A01.getInt("direct_thread_video_call_xma_start_call_confirmation_count", 0) >= 3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    @Override // X.InterfaceC50469MPx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47908LEc AWs(android.content.Context r47, X.C51760Mtj r48, X.C99E r49, com.instagram.direct.model.messaginguser.MessagingUser r50, X.L8R r51, X.InterfaceC50520MRx r52, java.util.Map r53, java.util.Set r54, int r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49189Lp6.AWs(android.content.Context, X.Mtj, X.99E, com.instagram.direct.model.messaginguser.MessagingUser, X.L8R, X.MRx, java.util.Map, java.util.Set, int, boolean):X.LEc");
    }

    public C49189Lp6(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A05 = context;
        this.A02 = c7im;
        this.A00 = userSession;
        this.A01 = anonymousClass988;
        this.A03 = Ko2.A00(context, userSession, anonymousClass988, c7im);
    }
}
