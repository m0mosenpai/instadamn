package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I9L {
    public static final String A00(C38649Gyq c38649Gyq) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        String str = c38649Gyq.A05;
        if (str != null) {
            A0S.A0S("ad_id", str);
        }
        Integer num = c38649Gyq.A03;
        if (num != null) {
            A0S.A0S("rendering_type", I9M.A00(num));
        }
        Boolean bool = c38649Gyq.A00;
        if (bool != null) {
            A0S.A0T("has_audio_in_ad", bool.booleanValue());
        }
        Boolean bool2 = c38649Gyq.A01;
        if (bool2 != null) {
            A0S.A0T("has_interactivity_tooltip", bool2.booleanValue());
        }
        List list = c38649Gyq.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(A0S, "image_prefetch_urls", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(A0S, A0q);
            }
            A0S.A0Z();
        }
        List list2 = c38649Gyq.A0A;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(A0S, "video_prefetch_urls", list2);
            while (A0q2.hasNext()) {
                AbstractC167017dG.A1F(A0S, A0q2);
            }
            A0S.A0Z();
        }
        List list3 = c38649Gyq.A08;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(A0S, "audio_prefetch_urls", list3);
            while (A0q3.hasNext()) {
                AbstractC167017dG.A1F(A0S, A0q3);
            }
            A0S.A0Z();
        }
        String str2 = c38649Gyq.A07;
        if (str2 != null) {
            A0S.A0S("template_name", str2);
        }
        String str3 = c38649Gyq.A06;
        if (str3 != null) {
            A0S.A0S("client_name", str3);
        }
        Integer num2 = c38649Gyq.A02;
        if (num2 != null) {
            A0S.A0Q("image_prefetch_urls_count", num2.intValue());
        }
        Integer num3 = c38649Gyq.A04;
        if (num3 != null) {
            A0S.A0Q("video_prefetch_urls_count", num3.intValue());
        }
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }
}
