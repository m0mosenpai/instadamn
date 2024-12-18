package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106524r6 extends RunnableC106494r3 {
    public InterfaceC106514r5 A00;
    public final List A01;

    public C106524r6(Looper looper) {
        super(new Handler(looper));
        this.A01 = new ArrayList();
    }

    @Override // X.RunnableC106494r3
    public final boolean A01() {
        if (this.A01.isEmpty() && super.A01()) {
            return true;
        }
        return false;
    }

    @Override // X.RunnableC106494r3, java.lang.Runnable
    public final void run() {
        for (InterfaceC106514r5 interfaceC106514r5 : this.A01) {
            this.A00 = interfaceC106514r5;
            interfaceC106514r5.Cpp();
        }
        super.run();
    }
}
