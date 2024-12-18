package X;

import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* renamed from: X.1SO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SO extends C0R8 implements IBinder.DeathRecipient {
    public boolean A00;
    public final Handler A01;
    public final AbstractC04410Lh A02;

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.A00 = true;
    }

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ActivityThreadProtector";
    }

    public C1SO(C0Rw c0Rw) {
        super(c0Rw);
        this.A00 = false;
        this.A02 = new AbstractC04410Lh() { // from class: X.1SP
            @Override // X.AbstractC04410Lh, X.C0HV
            public final void A76(Message message, C0HT c0ht, String str) {
                if (C1SO.this.A00) {
                    try {
                        Handler.Callback callback = c0ht.A00;
                        if (callback != null && callback.handleMessage(message)) {
                            return;
                        }
                        c0ht.A01.handleMessage(message);
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // X.AbstractC04410Lh, X.C0HV
            public final boolean DSx(Message message, C0HT c0ht, String str) {
                if ("ActivityThread".equals(str)) {
                    if (C1SO.this.A00) {
                        return true;
                    }
                    int i = message.what;
                    if (i == 130) {
                        C03850Ja.A01("The systems asks the app to exit.");
                    } else if (i == 137) {
                        return false;
                    }
                }
                return false;
            }
        };
        A05(C1SQ.class);
        this.A01 = c0Rw.Aex();
    }
}
