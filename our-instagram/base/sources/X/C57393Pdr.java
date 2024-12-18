package X;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Pdr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57393Pdr extends C0YY implements InterfaceC16820sZ {
    public static final C57393Pdr A00 = new C57393Pdr();

    public C57393Pdr() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return MoreExecutors.listeningDecorator((ScheduledExecutorService) C14250np.A00().A00);
    }
}
