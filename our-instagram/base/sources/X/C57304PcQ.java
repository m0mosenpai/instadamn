package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.PcQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57304PcQ extends C0YY implements InterfaceC16820sZ {
    public static final C57304PcQ A00 = new C57304PcQ();

    public C57304PcQ() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
    }
}
