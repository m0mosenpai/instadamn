package X;

import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class Wi6 implements InterfaceC43071ya {
    public final MediaMapFragment A00;
    public final HashSet A01 = new HashSet();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        long B0m;
        MediaMapPin A00;
        WGA wga;
        long j;
        MediaMapQuery mediaMapQuery;
        boolean z;
        String str;
        String str2 = ((C70788Wh1) c59062n7.A03).A01;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            HashSet hashSet = this.A01;
            if (hashSet.contains(str2)) {
                MediaMapFragment mediaMapFragment = this.A00;
                int intValue = ((Number) c59062n7.A04).intValue();
                B0m = interfaceC57162jr.B0m(c59062n7);
                A00 = mediaMapFragment.A09.A00(str2);
                wga = mediaMapFragment.A0F;
                j = intValue;
                mediaMapQuery = mediaMapFragment.A0E;
                z = true;
            } else {
                hashSet.add(str2);
                MediaMapFragment mediaMapFragment2 = this.A00;
                int intValue2 = ((Number) c59062n7.A04).intValue();
                B0m = interfaceC57162jr.B0m(c59062n7);
                A00 = mediaMapFragment2.A09.A00(str2);
                wga = mediaMapFragment2.A0F;
                j = intValue2;
                mediaMapQuery = mediaMapFragment2.A0E;
                z = false;
            }
            String A01 = AbstractC69973Vyo.A01(A00);
            if (z) {
                str = "instagram_map_location_list_sub_impression";
            } else {
                str = "instagram_map_location_list_impression";
            }
            C25531Mh A012 = WGA.A01(wga, str);
            A012.A0R("location_id", A01);
            A012.A0Q("result_position", Long.valueOf(j));
            A012.A0Q("session_duration", Long.valueOf(B0m));
            A012.A0R("query_token", mediaMapQuery.A02);
            WGA.A03(A012, A00);
            WGA.A04(A012, A00, true);
            A012.Cht();
        }
    }

    public Wi6(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }
}
