package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ABL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23790Ag1 A01;
    public final /* synthetic */ UH0 A02;

    public ABL(C23790Ag1 c23790Ag1, UH0 uh0, int i) {
        this.A01 = c23790Ag1;
        this.A00 = i;
        this.A02 = uh0;
    }

    public final void A00() {
        C23790Ag1 c23790Ag1 = this.A01;
        int i = c23790Ag1.A00 - 1;
        c23790Ag1.A00 = i;
        C006802i.A0p.markerPoint(18943966, AnonymousClass001.A0O("loaded_photo_", this.A00 - i));
        if (c23790Ag1.A00 == 0) {
            C006802i.A0p.markerEnd(18943966, (short) 2);
            View A01 = c23790Ag1.A07.A01();
            C14360o3.A0A(A01);
            AbstractC13880nE.A0r(A01, new RunnableC24380ArN(c23790Ag1));
            A01.requestLayout();
            this.A02.A00 = null;
        }
    }
}
