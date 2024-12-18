package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class L65 {
    public final HashMap A00 = AbstractC166987dD.A1G();

    public final C44321JiD A00(RecyclerView recyclerView, MOR mor, AbstractC46508Ki7 abstractC46508Ki7) {
        C14360o3.A0B(recyclerView, 0);
        HashMap hashMap = this.A00;
        if (hashMap.get(abstractC46508Ki7) == null) {
            int A00 = abstractC46508Ki7.A00();
            if (A00 != 1 && A00 != 2) {
                throw new IllegalAccessException("This data type is not defined");
            }
            hashMap.put(abstractC46508Ki7, new C44321JiD(recyclerView, mor));
        }
        C44321JiD c44321JiD = (C44321JiD) hashMap.get(abstractC46508Ki7);
        if (c44321JiD != null && !recyclerView.equals(c44321JiD.A00)) {
            RecyclerView recyclerView2 = c44321JiD.A00;
            C44220JgP c44220JgP = c44321JiD.A03;
            recyclerView2.A15(c44220JgP);
            c44321JiD.A00 = recyclerView;
            recyclerView.A14(c44220JgP);
        }
        Object obj = hashMap.get(abstractC46508Ki7);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.albumpicker.AlbumImpressionTracker<T of com.instagram.creation.capture.gallery.albumpicker.AlbumPickerImpressionTrackersManager.getImpressionTracker>");
        return (C44321JiD) obj;
    }
}
