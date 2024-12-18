package X;

import java.lang.reflect.Method;

/* renamed from: X.TQc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64697TQc implements Runnable {
    public final /* synthetic */ C0HX A00;
    public final /* synthetic */ C116285Oh A01;
    public final /* synthetic */ Method A02;
    public final /* synthetic */ Object[] A03;

    public RunnableC64697TQc(C0HX c0hx, C116285Oh c116285Oh, Method method, Object[] objArr) {
        this.A01 = c116285Oh;
        this.A00 = c0hx;
        this.A02 = method;
        this.A03 = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A01(this.A02, this.A03);
        } catch (Throwable th) {
            this.A01.A00.A0C(th);
            throw AbstractC58318PtA.A0f(th);
        }
    }
}
