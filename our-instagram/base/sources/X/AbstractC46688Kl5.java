package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Kl5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46688Kl5 {
    /* JADX WARN: Type inference failed for: r1v4, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    public static final void A00(Context context, UserSession userSession, AnonymousClass841 anonymousClass841, ArrayList arrayList) {
        C14360o3.A0B(userSession, 1);
        if (arrayList.size() != 1) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator A13 = AbstractC166997dE.A13(arrayList);
            while (A13.hasNext()) {
                A1E.add(AbstractC167017dG.A0d((Medium) AbstractC166997dE.A0l(A13)));
            }
            Map map = AbstractC43847JaB.A00(userSession).A04;
            HashMap A1G = AbstractC166987dD.A1G();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Iterator A132 = AbstractC166997dE.A13(arrayList);
            while (A132.hasNext()) {
                Medium medium = (Medium) AbstractC166997dE.A0l(A132);
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) map.get(String.valueOf(medium.A05));
                GalleryPreviewInfo galleryPreviewInfo2 = galleryPreviewInfo;
                if (galleryPreviewInfo == null) {
                    ?? obj = new Object();
                    obj.A03 = null;
                    obj.A02 = null;
                    obj.A00 = null;
                    obj.A01 = null;
                    obj.A02 = AbstractC13530mf.A04(context).getAbsolutePath();
                    galleryPreviewInfo2 = obj;
                }
                ExifImageData exifImageData = new ExifImageData();
                ContentResolver contentResolver = context.getContentResolver();
                C14360o3.A07(contentResolver);
                double[] A07 = medium.A07(contentResolver);
                if (A07 != null) {
                    exifImageData.A02 = Double.valueOf(A07[0]);
                    exifImageData.A01 = Double.valueOf(A07[1]);
                }
                exifImageData.A00 = medium.A07;
                galleryPreviewInfo2.A01 = exifImageData;
                float AB3 = anonymousClass841.AB3();
                int i = medium.A0B;
                int i2 = medium.A04;
                if (medium.A05() && (i == 0 || i2 == 0)) {
                    BitmapFactory.decodeFile(medium.A0X, options);
                    i = options.outWidth;
                    i2 = options.outHeight;
                }
                galleryPreviewInfo2.A00 = AbstractC197188no.A00(null, AB3, i, i2, exifImageData.A00, false);
                A1G.put(String.valueOf(medium.A05), galleryPreviewInfo2);
            }
            map.clear();
            map.putAll(A1G);
        }
    }
}
