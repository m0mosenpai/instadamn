package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.FLh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34572FLh {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    public C34572FLh(ViewGroup viewGroup) {
        this.A03 = AbstractC31173DnH.A0T(viewGroup, R.id.avatar_imageview);
        this.A02 = AbstractC166997dE.A0T(viewGroup, R.id.username_textview);
        this.A00 = viewGroup.requireViewById(R.id.option_button);
        this.A01 = viewGroup.requireViewById(R.id.option_button_dots);
    }
}
