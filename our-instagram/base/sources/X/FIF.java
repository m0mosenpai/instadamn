package X;

import android.graphics.Bitmap;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;

/* loaded from: classes6.dex */
public final class FIF {
    public final Bitmap A00;
    public final AddAvatarHelper$LoadedImage$LoadedImageMetadata A01;

    public FIF(Bitmap bitmap, android.net.Uri uri, int i) {
        this.A01 = new AddAvatarHelper$LoadedImage$LoadedImageMetadata(uri, i);
        this.A00 = bitmap;
    }
}
