package X;

import android.view.View;
import android.widget.CheckBox;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes7.dex */
public class HKN extends C38160GqR {
    public final CheckBox A00;
    public final CircularImageView A01;

    public HKN(View view) {
        super(view);
        this.A00 = (CheckBox) AbstractC166987dD.A0c(view, R.id.media_toggle);
        this.A01 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.media_contributor);
    }
}
