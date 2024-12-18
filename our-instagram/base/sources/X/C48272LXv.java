package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.LXv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48272LXv implements MPZ {
    public final /* synthetic */ C159697Eh A00;
    public final /* synthetic */ InterfaceC50467MPv A01;
    public final /* synthetic */ AtomicBoolean A02;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
        this.A01.onError(str);
    }

    public C48272LXv(C159697Eh c159697Eh, InterfaceC50467MPv interfaceC50467MPv, AtomicBoolean atomicBoolean) {
        this.A00 = c159697Eh;
        this.A02 = atomicBoolean;
        this.A01 = interfaceC50467MPv;
    }

    @Override // X.MPZ
    public final void DqE(final String str, final boolean z) {
        Handler handler = this.A00.A00;
        final AtomicBoolean atomicBoolean = this.A02;
        final InterfaceC50467MPv interfaceC50467MPv = this.A01;
        handler.post(new Runnable() { // from class: X.M6I
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                InterfaceC50467MPv interfaceC50467MPv2 = interfaceC50467MPv;
                String str2 = str;
                boolean z2 = z;
                if (!atomicBoolean2.get()) {
                    interfaceC50467MPv2.D6W(str2, z2);
                }
            }
        });
    }
}
