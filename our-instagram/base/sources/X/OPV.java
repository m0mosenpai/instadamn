package X;

import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OPV {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    public static MusicBrowseCategory parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A02 = A0m;
                } else if ("subcategory_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("subcategory_title".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("is_top_level".equals(A0s)) {
                    obj.A07 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MusicBrowseCategory musicBrowseCategory) {
        anonymousClass182.A0d();
        musicBrowseCategory.A00();
        anonymousClass182.A0S("category", musicBrowseCategory.A00());
        String str = musicBrowseCategory.A04;
        if (str != null) {
            anonymousClass182.A0S("subcategory_id", str);
        }
        String str2 = musicBrowseCategory.A06;
        if (str2 != null) {
            anonymousClass182.A0S("subcategory_title", str2);
        }
        anonymousClass182.A0T("is_top_level", musicBrowseCategory.A07);
        anonymousClass182.A0a();
    }
}
