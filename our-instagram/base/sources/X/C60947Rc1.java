package X;

import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.Rc1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60947Rc1 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C64477TFn A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60947Rc1(C64477TFn c64477TFn) {
        super(266, 4, false, false);
        this.A00 = c64477TFn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41341vj c41341vj;
        synchronized (this.A00) {
            synchronized (C41341vj.class) {
                try {
                    c41341vj = C41341vj.A06;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c41341vj != null) {
                C41341vj.A01(c41341vj, AppStateModule.APP_STATE_BACKGROUND);
                C62907SWo c62907SWo = c41341vj.A03;
                if (c62907SWo != null) {
                    C0XI c0xi = (C0XI) c41341vj.A01.A03;
                    synchronized (c62907SWo) {
                        try {
                            c0xi.A04(c62907SWo.A01);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }
}
