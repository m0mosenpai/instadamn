package X;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.Olr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55557Olr implements C07W {
    public boolean A00;
    public final ComponentActivity A01;
    public final C3I9 A02;

    public C55557Olr(ComponentActivity componentActivity, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(componentActivity, 1);
        this.A01 = componentActivity;
        C3I8 A01 = C3I7.A01(this, false, true);
        this.A02 = A01;
        A01.A9e(new C48548Ldl(interfaceC16660sJ, 8));
        componentActivity.getLifecycle().A09(this);
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public final void destroy() {
        this.A01.getLifecycle().A0A(this);
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void resume() {
        if (!this.A00) {
            this.A02.Dnr(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C07R.ON_START)
    public final void start() {
        if (!this.A00) {
            this.A02.Dnr(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C07R.ON_PAUSE)
    public final void stopDetector() {
        if (this.A00) {
            this.A02.onStop();
            this.A00 = false;
        }
    }
}
