package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class I1G {
    public static final String A00(Context context, EnumC39565Hdb enumC39565Hdb, int i) {
        Resources resources;
        int i2;
        if (enumC39565Hdb != null) {
            int ordinal = enumC39565Hdb.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        resources = context.getResources();
                        i2 = R.plurals.guide_detail_text_products;
                    }
                } else {
                    resources = context.getResources();
                    i2 = R.plurals.guide_detail_text_locations;
                }
            } else {
                resources = context.getResources();
                i2 = R.plurals.guide_detail_text_accounts;
            }
            String A0k = AbstractC167017dG.A0k(resources, i, i2);
            C14360o3.A07(A0k);
            return A0k;
        }
        resources = context.getResources();
        i2 = R.plurals.guide_detail_text_media;
        String A0k2 = AbstractC167017dG.A0k(resources, i, i2);
        C14360o3.A07(A0k2);
        return A0k2;
    }
}
