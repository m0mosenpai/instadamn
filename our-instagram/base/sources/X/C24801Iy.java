package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.1Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24801Iy implements InterfaceC24811Iz {
    public final C24651Ii A00;
    public final InterfaceC24681Il A01;
    public final InterfaceC24681Il A02;
    public final Executor A03;

    @Override // X.InterfaceC24811Iz
    public final void Ep9(AbstractC18280vF abstractC18280vF, boolean z) {
        this.A03.execute(new C1K9(abstractC18280vF, this, this.A01, true));
    }

    @Override // X.InterfaceC24811Iz
    public final void Ep8(AbstractC18280vF abstractC18280vF) {
        this.A03.execute(new C1K9(abstractC18280vF, this, this.A01, false));
    }

    @Override // X.InterfaceC24811Iz
    public final void EpA(AbstractC18280vF abstractC18280vF) {
        this.A03.execute(new C1K9(abstractC18280vF, this, this.A02, false));
    }

    public C24801Iy(C24651Ii c24651Ii, InterfaceC24681Il interfaceC24681Il, InterfaceC24681Il interfaceC24681Il2) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.A00 = c24651Ii;
        this.A02 = interfaceC24681Il;
        this.A01 = interfaceC24681Il2;
        this.A03 = newSingleThreadExecutor;
    }
}
