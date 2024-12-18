package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;

/* renamed from: X.Stc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63782Stc implements Ti0 {
    public static final String[] A01 = {"_data"};
    public final ContentResolver A00;

    public C63782Stc(ContentResolver contentResolver) {
        this.A00 = contentResolver;
    }

    @Override // X.Ti0
    public final Cursor E7M(android.net.Uri uri) {
        return C0fI.A01(this.A00, MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, "kind = 1 AND image_id = ?", null, A01, new String[]{uri.getLastPathSegment()}, -2068546799);
    }
}
