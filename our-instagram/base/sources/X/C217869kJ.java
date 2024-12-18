package X;

import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;

/* renamed from: X.9kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217869kJ extends C6RO {
    public LocationDict A00;
    public Integer A01;

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A09;
    }

    public C217869kJ(Venue venue, Integer num) {
        this.A00 = venue.A00.F6g();
        this.A01 = num;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        A0V.A06 = AbstractC16960so.A1Q("location_sticker_vibrant", "location_sticker_subtle", "location_sticker_rainbow");
        A0V.A01(super.A00);
        return A0V;
    }

    public C217869kJ() {
    }
}
