package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.6TA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TA {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final LinkedList A04;
    public final InterfaceC09390do A05;
    public final boolean A06;

    public C6TA(boolean z) {
        this.A06 = z;
        this.A05 = AbstractC09440dt.A01(C6TB.A00);
        this.A04 = new LinkedList();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: X.6TC
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C6TA c6ta = C6TA.this;
                ((Handler) c6ta.A05.getValue()).postAtFrontOfQueue(c6ta.A03);
            }
        };
        this.A02 = frameCallback;
        if (AbstractC79383gk.A03()) {
            Choreographer.getInstance().postFrameCallback(frameCallback);
        } else {
            ((Handler) this.A05.getValue()).postAtTime(new U4L(this), SystemClock.uptimeMillis());
        }
        this.A03 = new Runnable() { // from class: X.6TD
            @Override // java.lang.Runnable
            public final void run() {
                C6TA c6ta = C6TA.this;
                if (c6ta.A00) {
                    ((Handler) c6ta.A05.getValue()).removeCallbacks(this);
                    Choreographer.getInstance().removeFrameCallback(c6ta.A02);
                    return;
                }
                c6ta.A01 = true;
                Iterator it = c6ta.A04.iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    Object next = it.next();
                    C14360o3.A07(next);
                    ((Runnable) next).run();
                    it.remove();
                }
                c6ta.A01 = false;
                if (c6ta.A06 || c6ta.A00) {
                    return;
                }
                Choreographer.getInstance().postFrameCallback(c6ta.A02);
            }
        };
    }

    public final void A00(C9QP c9qp) {
        if (AbstractC79383gk.A03() && !this.A00 && !this.A01) {
            LinkedList linkedList = this.A04;
            boolean isEmpty = linkedList.isEmpty();
            linkedList.add(c9qp);
            if (isEmpty && this.A06) {
                Choreographer.getInstance().postFrameCallback(this.A02);
            }
        }
    }

    public C6TA() {
        this(false);
    }
}
