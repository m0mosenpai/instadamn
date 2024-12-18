package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96764Wl implements InterfaceC96774Wm {
    public static final List A01 = new ArrayList(50);
    public final Handler A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static C96834Wt A00() {
        C96834Wt c96834Wt;
        List list = A01;
        synchronized (list) {
            if (list.isEmpty()) {
                c96834Wt = new Object();
            } else {
                c96834Wt = (C96834Wt) list.remove(list.size() - 1);
            }
        }
        return c96834Wt;
    }

    public C96764Wl(Handler handler) {
        this.A00 = handler;
    }

    @Override // X.InterfaceC96774Wm
    public final C96834Wt Ctm(int i, int i2, int i3) {
        C96834Wt A00 = A00();
        A00.A00 = this.A00.obtainMessage(i, i2, i3);
        A00.A01 = this;
        return A00;
    }

    @Override // X.InterfaceC96774Wm
    public final C96834Wt Ctn(Object obj, int i) {
        C96834Wt A00 = A00();
        A00.A00 = this.A00.obtainMessage(i, obj);
        A00.A01 = this;
        return A00;
    }
}
