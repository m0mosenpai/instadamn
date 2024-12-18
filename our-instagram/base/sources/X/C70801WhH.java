package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

/* renamed from: X.WhH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70801WhH implements InterfaceC66482zP, X8P {
    public final ImageUrl A00;
    public final C67845UzJ A01;
    public final Venue A02;
    public final boolean A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A05();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70801WhH c70801WhH = (C70801WhH) obj;
        C14360o3.A0B(c70801WhH, 0);
        if (C14360o3.A0K(this.A02, c70801WhH.A02) && AbstractC50102Ry.A00(this.A00, c70801WhH.A00) && AbstractC50102Ry.A00(this.A01, c70801WhH.A01)) {
            return true;
        }
        return false;
    }

    public C70801WhH(ImageUrl imageUrl, C67845UzJ c67845UzJ, Venue venue, boolean z) {
        this.A02 = venue;
        this.A03 = z;
        this.A00 = imageUrl;
        this.A01 = c67845UzJ;
    }
}
