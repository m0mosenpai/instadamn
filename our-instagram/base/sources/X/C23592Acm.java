package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Acm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23592Acm implements InterfaceC11380iw, InterfaceC199698sL {
    public static final String __redex_internal_original_name = "CameraCorePostCaptureMediaPipelineController";
    public final Y2I A00;
    public final ACF A01;
    public final UserSession A02;

    @Override // X.InterfaceC199698sL
    public final boolean CMF(String str, String str2) {
        return true;
    }

    @Override // X.InterfaceC199698sL
    public final void ETi(UserSession userSession, List list) {
        C14360o3.A0B(list, 0);
        this.A01.A01.A08(list);
    }

    @Override // X.InterfaceC199698sL
    public final boolean isConnected() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.XiF, java.lang.Object] */
    public C23592Acm(Context context, InterfaceC199678sJ interfaceC199678sJ, InterfaceC178897x1 interfaceC178897x1, UserSession userSession) {
        InterfaceC178407wE c178377wB;
        YOk yOk;
        this.A02 = userSession;
        C178597wX c178597wX = new C178597wX(new C178317w5(userSession));
        HandlerThread handlerThread = new HandlerThread("IgCameraRenderManagerThread", -8);
        AbstractC09770fa.A00(handlerThread);
        Handler A0J = AbstractC167007dF.A0J();
        Object systemService = context.getSystemService("window");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        ?? obj = new Object();
        AVJ avj = AVJ.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36316315014729964L)) {
            c178377wB = new C201438vY();
        } else {
            AtomicLong atomicLong = C178377wB.A03;
            c178377wB = new C178377wB(new AZ2(this, userSession), "instagram_post_capture", AbstractC166997dE.A0t(userSession));
        }
        Y2I y2i = new Y2I(context, A0J, handlerThread, avj, c178597wX, interfaceC178897x1, c178377wB, obj, rotation);
        this.A00 = y2i;
        y2i.A00 = new AVK(context, interfaceC199678sJ);
        ACF acf = new ACF(y2i, y2i.A0L);
        this.A01 = acf;
        if (interfaceC199678sJ instanceof YOk) {
            yOk = (YOk) interfaceC199678sJ;
        } else {
            yOk = null;
        }
        y2i.A03(interfaceC199678sJ, yOk);
        acf.A01();
    }

    @Override // X.InterfaceC199698sL
    public final void A9o(InterfaceC185788Ly interfaceC185788Ly) {
        this.A01.A01.A04(interfaceC185788Ly);
    }

    @Override // X.InterfaceC199698sL
    public final C1819085a ALa() {
        C1819085a ALa = this.A00.A0L.ALa();
        C14360o3.A07(ALa);
        return ALa;
    }

    @Override // X.InterfaceC199698sL
    public final GPUTimerImpl B9L() {
        return this.A00.A0J.A03.A0A;
    }

    @Override // X.InterfaceC199698sL
    public final void EKd() {
        this.A01.A01();
    }

    @Override // X.InterfaceC199698sL
    public final void EOF(InterfaceC179247xa interfaceC179247xa) {
        this.A01.A01.A05(interfaceC179247xa);
    }

    @Override // X.InterfaceC199698sL
    public final void EOG(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        this.A01.A01.A06(interfaceC179247xa, interfaceC179577y7);
    }

    @Override // X.InterfaceC199698sL
    public final void destroy() {
        ACF acf = this.A01;
        acf.A00();
        acf.A00 = false;
        acf.A01.A01();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Y2I y2i = this.A00;
        if (y2i != null) {
            String BhE = y2i.A0L.BhE();
            C14360o3.A07(BhE);
            return BhE;
        }
        C0K8.A0C(__redex_internal_original_name, "mediaPipelineController is unexpectedly null");
        return "";
    }

    @Override // X.InterfaceC199698sL
    public final void pause() {
        this.A01.A00();
    }
}
