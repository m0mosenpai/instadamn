package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class MX3 implements InterfaceC66442zL {
    public static final Executor A02 = new MXR();
    public InterfaceC65452xh A00 = new Object();
    public final C65422xe A01;

    @Override // X.InterfaceC66442zL
    public final List AuX() {
        return this.A01.A02;
    }

    @Override // X.InterfaceC66442zL
    public final void EpB(ViewModelListUpdate viewModelListUpdate, InterfaceC66382zF interfaceC66382zF) {
        this.A01.A01(AbstractC001800i.A0a(viewModelListUpdate.A00), new MX4(this, interfaceC66382zF));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2xh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2xd, java.lang.Object] */
    public MX3(InterfaceC14020nS interfaceC14020nS, Executor executor) {
        this.A01 = new C65422xe(new C65472xj(new Object(), executor, new MXF(interfaceC14020nS)), new MX7(this));
    }

    @Override // X.InterfaceC66442zL
    public final void EYF(InterfaceC65452xh interfaceC65452xh) {
        this.A00 = interfaceC65452xh;
    }
}
