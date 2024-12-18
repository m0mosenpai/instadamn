package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.VuF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69720VuF {
    public long A00;
    public boolean A04;
    public final long A05;
    public final C54376O1i A07;
    public final List A08;
    public final Queue A09 = new LinkedList();
    public final Choreographer.FrameCallback A06 = new WKp(this, 4);
    public List A03 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();

    public C69720VuF(C54376O1i c54376O1i, XA4 xa4) {
        this.A07 = c54376O1i;
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        arrayList.add(xa4);
        this.A05 = 100L;
    }

    public final void A00() {
        if (!this.A04) {
            this.A04 = true;
            this.A00 = 0L;
            Choreographer choreographer = Choreographer.getInstance();
            Choreographer.FrameCallback frameCallback = this.A06;
            choreographer.removeFrameCallback(frameCallback);
            Choreographer.getInstance().postFrameCallbackDelayed(frameCallback, this.A05);
        }
    }

    public final void A01() {
        if (this.A04) {
            this.A04 = false;
            this.A01.clear();
            this.A03.clear();
            Choreographer.getInstance().removeFrameCallback(this.A06);
        }
    }
}
