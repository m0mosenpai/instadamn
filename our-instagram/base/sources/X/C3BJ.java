package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3BJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BJ {
    public final UserSession A00;
    public final C33P A01;
    public final C61442r7 A02;
    public final C685736u A03;
    public final Map A04;
    public final Map A05;

    public C3BJ(UserSession userSession, C33P c33p, C61442r7 c61442r7, C685736u c685736u) {
        C14360o3.A0B(userSession, 4);
        this.A02 = c61442r7;
        this.A03 = c685736u;
        this.A01 = c33p;
        this.A00 = userSession;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C14360o3.A07(synchronizedMap);
        this.A05 = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        C14360o3.A07(synchronizedMap2);
        this.A04 = synchronizedMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (X.C3Q3.A00(r11.A00).A00() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.util.List r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BJ.A02(java.util.List):void");
    }

    public static final void A00(EnumC92424Bx enumC92424Bx, C3BJ c3bj, String str, String str2, String str3, boolean z) {
        List list = (List) c3bj.A05.get(str);
        if (list != null) {
            if (list.contains("network")) {
                c3bj.A02.A04(enumC92424Bx, str2, str3, z);
            }
            if (list.contains("cache")) {
                C61442r7 c61442r7 = c3bj.A02;
                synchronized (c61442r7) {
                    c61442r7.A05 = true;
                    c61442r7.A0B.removeCallbacks(c61442r7.A0J);
                    if (C18U.A06(C06090Tz.A05, c61442r7.A0F, 2342160604129727869L)) {
                        c61442r7.A01 = Boolean.valueOf(z);
                    }
                    if (z) {
                        C1IY c1iy = c61442r7.A0H.A01.A01;
                        c1iy.A01.A02("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_END");
                        c1iy.A00().Egh(C1IT.A08);
                        if (str2 != null) {
                            C226418s.A06(c61442r7.A00, "first_media_network_content_image_load_source", str2);
                        }
                        if (enumC92424Bx != null) {
                            C226418s.A06(c61442r7.A00, "first_media_network_content_video_cache_type", enumC92424Bx.name());
                        }
                    } else {
                        C1IP c1ip = c61442r7.A0H;
                        if (str3 == null) {
                            str3 = "unknown";
                        }
                        C1IY c1iy2 = c1ip.A01.A01;
                        c1iy2.A01.A03("FIRST_MEDIA_FROM_CACHE_CONTENT_LOAD_FAILED", str3);
                        c1iy2.A00().Egh(C1IT.A03);
                    }
                    C61442r7.A01(c61442r7);
                }
            }
        }
        c3bj.A04.put(str, Boolean.valueOf(z));
    }

    public static final void A01(C38321qM c38321qM, C38321qM c38321qM2, C3BJ c3bj, boolean z) {
        C61442r7 c61442r7 = c3bj.A02;
        c38321qM2.BRp();
        boolean Cff = c38321qM2.Cff();
        boolean A5M = c38321qM.A5M();
        boolean CdW = c38321qM.CdW();
        synchronized (c61442r7) {
            if (z) {
                C226418s.A07(c61442r7.A00, "is_first_media_from_network_content_video_with_autoplay", true);
                c61442r7.A06 = true;
            }
            C1IV c1iv = c61442r7.A0H.A02.A02;
            c1iv.A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_START", null);
            c1iv.A00().Egh(C1IT.A07);
            C226418s.A07(c61442r7.A00, "first_network_media_is_video", Cff);
            C226418s.A07(c61442r7.A00, "feed_first_media_item_from_network_is_carousel", A5M);
            C226418s.A07(c61442r7.A00, "feed_first_media_item_from_network_is_sponsored", CdW);
            c61442r7.A0Q = true;
        }
    }
}
