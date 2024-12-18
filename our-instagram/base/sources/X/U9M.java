package X;

import android.text.SegmentFinder;

/* loaded from: classes11.dex */
public final class U9M extends SegmentFinder {
    public final /* synthetic */ InterfaceC72029XFr A00;

    public U9M(InterfaceC72029XFr interfaceC72029XFr) {
        this.A00 = interfaceC72029XFr;
    }

    @Override // android.text.SegmentFinder
    public final int nextEndBoundary(int i) {
        return this.A00.Css(i);
    }

    @Override // android.text.SegmentFinder
    public final int nextStartBoundary(int i) {
        return this.A00.Csw(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousEndBoundary(int i) {
        return this.A00.E62(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousStartBoundary(int i) {
        return this.A00.E64(i);
    }
}
