package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: X.135, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass135 extends AnonymousClass136 implements InterfaceC214312v {
    public final Handler A00;
    public final AnonymousClass135 A01;
    public final String A02;
    public final boolean A03;

    private final void A00(Runnable runnable, C12W c12w) {
        StringBuilder sb = new StringBuilder();
        sb.append("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        C57Z.A01(new CancellationException(sb.toString()), c12w);
        C12P.A01.A05(runnable, c12w);
    }

    @Override // X.C12T
    public final boolean A02(C12W c12w) {
        if (this.A03 && C14360o3.A0K(Looper.myLooper(), this.A00.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        if (!this.A00.post(runnable)) {
            A00(runnable, c12w);
        }
    }

    @Override // X.AnonymousClass137
    public final /* bridge */ /* synthetic */ AnonymousClass137 A06() {
        return this.A01;
    }

    @Override // X.InterfaceC214312v
    public final C19D CPF(final Runnable runnable, C12W c12w, long j) {
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C19D() { // from class: X.8bX
                @Override // X.C19D
                public final void dispose() {
                    AnonymousClass135 anonymousClass135 = this;
                    anonymousClass135.A00.removeCallbacks(runnable);
                }
            };
        }
        A00(runnable, c12w);
        return C19C.A00;
    }

    @Override // X.InterfaceC214312v
    public final void EM7(final InterfaceC24901Jp interfaceC24901Jp, long j) {
        Runnable runnable = new Runnable() { // from class: X.54R
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC24901Jp.this.EKp(C0eB.A00, this);
            }
        };
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            interfaceC24901Jp.CPA(new C207199Ey(3, runnable, this));
        } else {
            A00(runnable, interfaceC24901Jp.getContext());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass135) {
            AnonymousClass135 anonymousClass135 = (AnonymousClass135) obj;
            if (anonymousClass135.A00 == this.A00 && anonymousClass135.A03 == this.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int identityHashCode = System.identityHashCode(this.A00);
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return identityHashCode ^ i;
    }

    @Override // X.C12T
    public final String toString() {
        String str;
        AnonymousClass137 anonymousClass137;
        C12T c12t = C12P.A00;
        AnonymousClass137 anonymousClass1372 = AnonymousClass131.A00;
        if (this == anonymousClass1372) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                anonymousClass137 = anonymousClass1372.A06();
            } catch (UnsupportedOperationException unused) {
                anonymousClass137 = null;
            }
            if (this == anonymousClass137) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str == null) {
            String str2 = this.A02;
            if (str2 == null) {
                str2 = this.A00.toString();
            }
            if (this.A03) {
                return AnonymousClass001.A0R(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public AnonymousClass135(Handler handler, String str, boolean z) {
        AnonymousClass135 anonymousClass135;
        this.A00 = handler;
        this.A02 = str;
        this.A03 = z;
        if (z) {
            anonymousClass135 = this;
        } else {
            anonymousClass135 = new AnonymousClass135(handler, str, true);
        }
        this.A01 = anonymousClass135;
    }
}
