package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.Jqp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44706Jqp extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final MediaPickerItemView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44706Jqp(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.media_picker_gallery_folder_name);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.media_picker_gallery_folder_count);
        this.A02 = (MediaPickerItemView) AbstractC166987dD.A0c(view, R.id.media_picker_gallery_item_preview);
    }
}
