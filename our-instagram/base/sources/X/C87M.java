package X;

import android.os.Handler;

/* renamed from: X.87M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87M {
    public Object A01;
    public boolean A02;
    public final Handler A03;
    public final C87L A04;
    public long A00 = -1;
    public final Runnable A05 = new Runnable() { // from class: X.87N
        @Override // java.lang.Runnable
        public final void run() {
            C87M c87m = C87M.this;
            c87m.A02 = false;
            c87m.A00 = System.currentTimeMillis();
            Object obj = c87m.A01;
            if (obj != null) {
                c87m.A04.A00.A03.A0B(new C8A8(obj));
            }
        }
    };

    public C87M(Handler handler, C87L c87l) {
        this.A03 = handler;
        this.A04 = c87l;
    }
}
