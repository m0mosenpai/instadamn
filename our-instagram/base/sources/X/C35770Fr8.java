package X;

import java.util.List;

/* renamed from: X.Fr8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35770Fr8 implements InterfaceC155346yN {
    public final /* synthetic */ C2US A00;
    public final /* synthetic */ Runnable A01;

    public C35770Fr8(C2US c2us, Runnable runnable) {
        this.A00 = c2us;
        this.A01 = runnable;
    }

    @Override // X.InterfaceC155346yN
    public final void D8w(List list, List list2) {
        this.A01.run();
        this.A00.mDiffer.A06.remove(this);
    }
}
