package X;

import android.os.Handler;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Wbb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70518Wbb implements InterfaceC98614bg {
    public C5T9 A00;
    public boolean A01;
    public final C4XY A02;
    public final /* synthetic */ C70519Wbc A03;

    public C70518Wbb(C70519Wbc c70519Wbc, C4XY c4xy) {
        this.A03 = c70519Wbc;
        this.A02 = c4xy;
    }

    @Override // X.InterfaceC98614bg
    public final void release() {
        Handler handler = this.A03.A01;
        handler.getClass();
        Util.A0E(handler, new Runnable() { // from class: X.WrL
            @Override // java.lang.Runnable
            public final void run() {
                C70518Wbb c70518Wbb = C70518Wbb.this;
                if (!c70518Wbb.A01) {
                    C5T9 c5t9 = c70518Wbb.A00;
                    if (c5t9 != null) {
                        c5t9.EE2(c70518Wbb.A02);
                    }
                    c70518Wbb.A03.A0A.remove(c70518Wbb);
                    c70518Wbb.A01 = true;
                }
            }
        });
    }
}
