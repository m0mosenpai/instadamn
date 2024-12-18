package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.L6w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47752L6w {
    public final UserSession A00;
    public final InterfaceExecutorServiceC73393Qq A01;

    public C47752L6w(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = MoreExecutors.listeningDecorator(new C14140ne(311177733, 3, false, false));
    }

    public final C60787RSy A00(InterfaceC2056098k interfaceC2056098k, ClipInfo clipInfo, Long l, String str, String str2, String str3) {
        C14360o3.A0B(interfaceC2056098k, 8);
        UserSession userSession = this.A00;
        ListenableFuture A01 = LCI.A01(LFD.A00(userSession), userSession, interfaceC2056098k);
        InterfaceExecutorServiceC73393Qq interfaceExecutorServiceC73393Qq = this.A01;
        C14360o3.A06(interfaceExecutorServiceC73393Qq);
        return AbstractRunnableC133325zz.A02(new C44289Jhf(new C50256MHl(8), 10), AbstractRunnableC133325zz.A01(new C43624JRh(3, new MIC(this, clipInfo, l, str2, str3)), AbstractRunnableC133325zz.A01(new C43624JRh(3, new C50365MLr(A01, this, clipInfo, str, 38)), A01, interfaceExecutorServiceC73393Qq), interfaceExecutorServiceC73393Qq), C1M8.A01);
    }
}
