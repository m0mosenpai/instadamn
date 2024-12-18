package X;

import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LBV {
    public static GallerySuggestionsInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            GallerySuggestionsInfo gallerySuggestionsInfo = new GallerySuggestionsInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("suggestion_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    gallerySuggestionsInfo.A02 = A0m;
                } else if ("suggestion_rule".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    gallerySuggestionsInfo.A01 = A0m2;
                } else if ("suggestion_index".equals(A0s)) {
                    gallerySuggestionsInfo.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return gallerySuggestionsInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, GallerySuggestionsInfo gallerySuggestionsInfo) {
        anonymousClass182.A0d();
        String str = gallerySuggestionsInfo.A02;
        if (str != null) {
            anonymousClass182.A0S("suggestion_id", str);
        }
        String str2 = gallerySuggestionsInfo.A01;
        if (str2 != null) {
            anonymousClass182.A0S("suggestion_rule", str2);
        }
        anonymousClass182.A0Q("suggestion_index", gallerySuggestionsInfo.A00);
        anonymousClass182.A0a();
    }
}
