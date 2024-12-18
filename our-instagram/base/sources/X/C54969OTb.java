package X;

import android.graphics.RectF;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

/* renamed from: X.OTb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54969OTb {
    public final RectF A00;
    public final IGTVBrandedContentTags A01;
    public final IGTVShoppingMetadata A02;

    public C54969OTb(RectF rectF, IGTVBrandedContentTags iGTVBrandedContentTags, IGTVShoppingMetadata iGTVShoppingMetadata, String str) {
        C14360o3.A0B(str, 1);
        this.A00 = rectF;
        this.A02 = iGTVShoppingMetadata;
        this.A01 = iGTVBrandedContentTags;
    }

    public C54969OTb() {
        this(null, null, null, "");
    }
}
