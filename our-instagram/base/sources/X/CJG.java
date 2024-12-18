package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;

/* loaded from: classes5.dex */
public abstract class CJG {
    public static final String A00(Context context, AppstoreMetadataDict appstoreMetadataDict) {
        String valueOf = String.valueOf(appstoreMetadataDict.Aen());
        if (appstoreMetadataDict.BY0() != null) {
            String string = context.getString(2131952991, valueOf, appstoreMetadataDict.BY0());
            C14360o3.A0A(string);
            return string;
        }
        return valueOf;
    }
}
