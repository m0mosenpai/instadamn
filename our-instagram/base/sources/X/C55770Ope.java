package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Ope, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55770Ope implements InterfaceC58019Po5 {
    @Override // X.InterfaceC58019Po5
    public final MYB AUJ(java.net.URL url) {
        AbstractC1126356r.A07(false, "do not call extractMediaMetadata on url for image");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58019Po5
    public final MYB AUI(android.net.Uri uri) {
        int i;
        String str;
        String str2;
        AbstractC1808580n.A03("ImageMetadataExtractor.extract");
        if (uri.getPath() != null) {
            File A11 = AbstractC166987dD.A11(uri.getPath());
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(A11.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            try {
                i = 0;
                int attributeInt = new ExifInterface(A11.getPath()).getAttributeInt("Orientation", 0);
                if (attributeInt != 3) {
                    if (attributeInt != 6) {
                        if (attributeInt == 8) {
                            i = 270;
                        }
                    } else {
                        i = 90;
                    }
                } else {
                    i = 180;
                }
            } catch (IOException | RuntimeException unused) {
                i = 0;
            }
            try {
                str = new ExifInterface(A11.getPath()).getAttribute("Copyright");
            } catch (IOException e) {
                C0K8.A0F("ImageMetadataExtractor", AbstractC166997dE.A0y("Failed to fetch ExifInterface.TAG_COPYRIGHT: ", e), e);
                str = null;
            }
            try {
                str2 = new ExifInterface(A11.getPath()).getAttribute("Model");
            } catch (IOException e2) {
                C0K8.A0O("ImageMetadataExtractor", "Failed to fetch ExifInterface.TAG_MODEL: %s", e2.getMessage(), e2);
                str2 = null;
            }
            MYB myb = new MYB(null, str, str2, null, null, null, null, null, null, "PHOTO", null, i3, i2, i, 0, 0, -1, -1L, -1L, A11.length(), false);
            AbstractC1808580n.A01();
            return myb;
        }
        AbstractC1808580n.A01();
        throw MSW.A0y("uri.getPath() is null");
    }
}
