package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.47r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C915947r {
    public static final MediaUploadMetadata A00(List list) {
        MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mediaUploadMetadata.A00((MediaUploadMetadata) it.next());
        }
        return mediaUploadMetadata;
    }

    public final String A01(List list) {
        C14360o3.A0B(list, 0);
        String A00 = AbstractC111324zv.A00(4134);
        if (!list.contains(A00)) {
            List A0X = AbstractC001800i.A0X(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : A0X) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String str = (String) AbstractC001800i.A0J(arrayList);
            if (str == null) {
                return (String) AbstractC001800i.A0J(list);
            }
            return str;
        }
        return A00;
    }
}
