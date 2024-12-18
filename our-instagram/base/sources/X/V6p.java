package X;

import com.instagram.discovery.mediamap.fragment.MediaMapFragment;

/* loaded from: classes11.dex */
public final class V6p extends AbstractC64162vb {
    public final MediaMapFragment A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C25531Mh A01 = WGA.A01(this.A00.A0F, "instagram_map_see_menu_cta_impression");
        A01.A0R("location_id", (String) obj);
        A01.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C25531Mh A01 = WGA.A01(this.A00.A0F, "instagram_map_see_menu_cta_sub_impression");
        A01.A0R("location_id", (String) obj);
        A01.Cht();
    }

    public V6p(C1BX c1bx, MediaMapFragment mediaMapFragment) {
        super(c1bx);
        this.A00 = mediaMapFragment;
    }
}
