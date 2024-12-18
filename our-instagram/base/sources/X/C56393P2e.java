package X;

import android.content.Context;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.P2e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56393P2e implements InterfaceC58176Pqg {
    public UserSession A00;
    public final Context A01;
    public final AtomicBoolean A02 = AbstractC166997dE.A17();
    public final InterfaceC09390do A03;
    public final YPq A04;

    @Override // X.InterfaceC58176Pqg
    public final void A7K() {
    }

    @Override // X.InterfaceC58176Pqg
    public final EGLSurface ANY(Object obj) {
        return null;
    }

    @Override // X.InterfaceC58176Pqg
    public final void EEF() {
    }

    @Override // X.InterfaceC58176Pqg
    public final void Ehf(C55003OVg c55003OVg) {
        Surface surface = c55003OVg.A00;
        UnifiedFilterManager unifiedFilterManager = (UnifiedFilterManager) this.A03.getValue();
        if (surface != null) {
            unifiedFilterManager.init(this.A00, this.A01.getAssets(), surface);
        } else {
            unifiedFilterManager.init(this.A00, this.A01.getAssets(), null);
        }
        this.A02.set(true);
    }

    @Override // X.InterfaceC58176Pqg
    public final void AP2() {
        if (this.A02.compareAndSet(true, false)) {
            ((UnifiedFilterManager) this.A03.getValue()).cleanup();
        }
    }

    @Override // X.InterfaceC58176Pqg
    public final YPq Bob() {
        return this.A04;
    }

    public C56393P2e(Context context, UserSession userSession) {
        this.A01 = context.getApplicationContext();
        this.A00 = userSession;
        C17050sx A01 = AbstractC09440dt.A01(new B2Q(2));
        this.A03 = A01;
        this.A04 = new AjK(A01);
    }
}
