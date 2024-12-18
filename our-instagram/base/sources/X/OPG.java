package X;

import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import java.io.StringWriter;

/* loaded from: classes9.dex */
public abstract class OPG {
    public static final IGTVShoppingMetadata A00(String str) {
        IGTVShoppingMetadata iGTVShoppingMetadata = null;
        if (str != null) {
            try {
                iGTVShoppingMetadata = OPH.parseFromJson(C16V.A00(str));
                return iGTVShoppingMetadata;
            } catch (Throwable th) {
                C0w9.A06("IGTVShoppingMetadataConverter", "Failed to deserialize shopping metadata in IGTV draft. Did you forget to add a migration?", th);
            }
        }
        return iGTVShoppingMetadata;
    }

    public static final String A01(IGTVShoppingMetadata iGTVShoppingMetadata) {
        String str = null;
        if (iGTVShoppingMetadata != null) {
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0O2 = MSW.A0O(A0O);
                OPH.A00(A0O2, iGTVShoppingMetadata);
                str = MSX.A0e(A0O2, A0O);
                return str;
            } catch (Throwable th) {
                C0w9.A06("IGTVShoppingMetadataConverter", "Failed to serialize shopping metadata in IGTV draft. Did you forget to add a migration?", th);
            }
        }
        return str;
    }
}
