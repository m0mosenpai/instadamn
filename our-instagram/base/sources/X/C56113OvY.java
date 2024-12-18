package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.OvY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56113OvY implements InterfaceC66482zP {
    public ImageUrl A00;
    public Reel A01;
    public String A02;
    public boolean A03 = false;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C56113OvY(ImageUrl imageUrl, Reel reel, String str) {
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = reel;
        this.A04 = AbstractC37301Gc2.A0i(reel);
        Reel reel2 = this.A01;
        this.A06 = AbstractC167007dF.A1X(reel2.A09, HighlightReelTypeStr.A05);
        this.A05 = reel2.A1D;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56113OvY c56113OvY = (C56113OvY) obj;
        C14360o3.A0B(c56113OvY, 0);
        return C14360o3.A0K(this.A04, c56113OvY.A04);
    }
}
