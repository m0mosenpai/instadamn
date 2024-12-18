package X;

import com.instagram.api.schemas.StickerTraySectionCTAType;
import java.util.List;

/* renamed from: X.8un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201068un {
    public List A07;
    public boolean A08;
    public String A03 = "";
    public String A04 = "";
    public String A02 = "";
    public boolean A09 = true;
    public Boolean A01 = false;
    public StickerTraySectionCTAType A00 = StickerTraySectionCTAType.A09;
    public String A06 = "";
    public String A05 = "";

    public final List A00() {
        List list = this.A07;
        if (list != null) {
            return list;
        }
        C14360o3.A0F("stickerBundles");
        throw C00O.createAndThrow();
    }
}
