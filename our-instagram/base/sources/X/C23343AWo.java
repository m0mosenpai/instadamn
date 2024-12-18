package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AWo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23343AWo implements GalleryPickerServiceDataSource, BCI {
    public final List A00 = AbstractC166987dD.A1E();

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("filePaths") && bundle.containsKey("orientations") && bundle.containsKey("isPhotoBooleans")) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("orientations");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("filePaths");
            boolean[] booleanArray = bundle.getBooleanArray("isPhotoBooleans");
            if (integerArrayList != null && stringArrayList != null && booleanArray != null) {
                ArrayList arrayList = new ArrayList(booleanArray.length);
                for (boolean z : booleanArray) {
                    arrayList.add(Boolean.valueOf(z));
                }
                int size = integerArrayList.size();
                if (stringArrayList.size() == size && arrayList.size() == size) {
                    List list = this.A00;
                    list.clear();
                    for (int i = 0; i < size; i++) {
                        list.add(new GalleryPickerServiceContent(AbstractC166987dD.A0H(integerArrayList.get(i)), stringArrayList.get(i), AbstractC166987dD.A1a(arrayList.get(i))));
                    }
                }
            }
        }
        return null;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final void setGalleryPickerContentListener(C24225Aor c24225Aor) {
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final void setGalleryPickerServiceListener(C9UW c9uw) {
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource
    public final List getContent() {
        List unmodifiableList = Collections.unmodifiableList(this.A00);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }
}
