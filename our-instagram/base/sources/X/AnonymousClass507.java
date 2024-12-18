package X;

import com.instagram.pando.parsing.IgPandoServiceJNI;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.507, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass507 implements AnonymousClass506, InterfaceC13050lr {
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public final C1D3 A00;
    public volatile IgPandoServiceJNI A01;

    private IgPandoServiceJNI A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = IgPandoServiceJNI.create(this.A00.A00().consistencyService);
                }
            }
        }
        return this.A01;
    }

    public AnonymousClass507(C1D3 c1d3) {
        this.A00 = c1d3;
    }

    @Override // X.AnonymousClass506
    public final /* bridge */ /* synthetic */ JHF createApiFrameworkParser(boolean z) {
        return A00().createApiFrameworkParser(z);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(@Deprecated boolean z) {
        A00();
    }
}
