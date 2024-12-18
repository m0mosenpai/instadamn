package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3SA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SA extends C0YY implements InterfaceC16820sZ {
    public static final C3SA A00 = new C3SA();

    public C3SA() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
    }
}
