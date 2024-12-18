package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75763ah {
    public final /* synthetic */ ComponentTree A05;
    public final AtomicReference A04 = new AtomicReference();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AtomicReference A03 = new AtomicReference("");
    public final Choreographer.FrameCallback A00 = new Choreographer.FrameCallback() { // from class: X.3ai
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            C75763ah c75763ah = C75763ah.this;
            String str = (String) c75763ah.A03.getAndSet("");
            if (c75763ah.A02.getAndSet(0) > 0) {
                ComponentTree componentTree = c75763ah.A05;
                if (str == null) {
                    str = AnonymousClass001.A0g("<cls>", componentTree.A0W.A01.getClass().getName(), "</cls>");
                }
                componentTree.A0S(true, str);
            }
        }
    };
    public final Runnable A01 = new Runnable() { // from class: X.3aj
        @Override // java.lang.Runnable
        public final void run() {
            C75763ah c75763ah = C75763ah.this;
            AtomicReference atomicReference = c75763ah.A04;
            atomicReference.set(Choreographer.getInstance());
            if (c75763ah.A02.get() > 0) {
                ((Choreographer) atomicReference.get()).postFrameCallback(c75763ah.A00);
            }
        }
    };

    public C75763ah(ComponentTree componentTree) {
        this.A05 = componentTree;
        AtomicReference atomicReference = this.A04;
        if (atomicReference.get() == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                atomicReference.set(Choreographer.getInstance());
                return;
            }
            Object obj = this.A05.A0B;
            Runnable runnable = this.A01;
            C14360o3.A0B(runnable, 0);
            ((Handler) obj).postAtFrontOfQueue(runnable);
        }
    }
}
