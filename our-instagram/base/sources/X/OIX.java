package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class OIX {
    public final C006802i A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final boolean A02;

    public final void A00(short s) {
        if (this.A02) {
            String A0a = AbstractC31175DnJ.A0a("\n", this.A01);
            C006802i c006802i = this.A00;
            c006802i.markerAnnotate(79496324, "Trace", A0a);
            c006802i.markerEnd(79496324, s);
        }
    }

    public OIX(C006802i c006802i) {
        this.A00 = c006802i;
        boolean z = AbstractC50712Us.A01.A06(0, (int) C1AD.A01(C06090Tz.A05, 18582266201901651L)) == 0;
        this.A02 = z;
        if (z) {
            c006802i.markerStart(79496324);
        }
    }
}
