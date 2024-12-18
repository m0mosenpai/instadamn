package X;

/* renamed from: X.2sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62112sC {
    public final C61582rL A00;

    public final void A00() {
        C61582rL c61582rL = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c61582rL.A0B.remove(this);
        c61582rL.A05 = null;
        JHG jhg = c61582rL.A04;
        if (jhg != null) {
            jhg.DDX(C05F.A01);
        }
        if (c61582rL.A06) {
            c61582rL.A09.markerAnnotate(c61582rL.A08, "scroll_distance", c61582rL.A00 - c61582rL.A01);
            c61582rL.A01 = c61582rL.A00;
            c61582rL.A03((short) 3, false);
            c61582rL.A06 = false;
            C218914p.A06(c61582rL);
        }
    }

    public final void A01() {
        C61582rL c61582rL = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C01U c01u = c61582rL.A0B;
        c01u.add(this);
        if (c01u.size() > 1) {
            C0K8.A0E("TailLoadPerfLogger", "Multiple requests in flight on request start");
        }
        if (c61582rL.A06) {
            C006802i c006802i = c61582rL.A09;
            int i2 = c61582rL.A08;
            c006802i.markerAnnotate(i2, "page_request_source", false);
            c006802i.markerPoint(i2, "page_request_start");
        }
    }

    public final void A02() {
        C61582rL c61582rL = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c61582rL.A0B.remove(this);
        c61582rL.A05 = null;
        if (c61582rL.A06) {
            C006802i c006802i = c61582rL.A09;
            int i2 = c61582rL.A08;
            c006802i.markerPoint(i2, "page_request_end");
            c006802i.markerAnnotate(i2, "is_tli_visible_on_request_end", c61582rL.A07);
        }
        C61582rL.A00(c61582rL, false);
    }

    public C62112sC(C61582rL c61582rL) {
        this.A00 = c61582rL;
    }
}
