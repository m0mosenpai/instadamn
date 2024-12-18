package X;

import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OPF {
    public static final IGTVBrandedContentTags A00(String str) {
        IGTVBrandedContentTags iGTVBrandedContentTags = null;
        if (str != null) {
            try {
                iGTVBrandedContentTags = AbstractC54032Nui.parseFromJson(C16V.A00(str));
                return iGTVBrandedContentTags;
            } catch (Throwable th) {
                C0w9.A06("IGTVBrandedContentConverter", "Failed to deserialize Branded Content metadata in IGTV draft.", th);
            }
        }
        return iGTVBrandedContentTags;
    }

    public static final String A01(IGTVBrandedContentTags iGTVBrandedContentTags) {
        if (iGTVBrandedContentTags != null) {
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0S = AbstractC167007dF.A0S(A0O);
                if (iGTVBrandedContentTags.A01 != null) {
                    C16V.A03(A0S, "branded_content_tags");
                    List list = iGTVBrandedContentTags.A01;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            BrandedContentTag A0n = MSW.A0n(it);
                            if (A0n != null) {
                                AbstractC54880OPb.A00(A0S, A0n);
                            }
                        }
                        A0S.A0Z();
                        if (iGTVBrandedContentTags.A00 != null) {
                            A0S.A0r("branded_content_project_metadata");
                            ONL.A00(A0S, iGTVBrandedContentTags.A00);
                        }
                        return AbstractC167017dG.A0l(A0S, A0O);
                    }
                }
                C14360o3.A0F("brandedContentTags");
                throw C00O.createAndThrow();
            } catch (Throwable th) {
                C0w9.A06("IGTVBrandedContentConverter", "Failed to serialize Branded Content metadata in IGTV draft.", th);
            }
        }
        return null;
    }
}
