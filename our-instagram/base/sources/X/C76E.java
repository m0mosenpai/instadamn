package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.76E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76E {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final ViewGroup A04;

    public C76E(View view) {
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.profile_attribution_container);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup = (ViewGroup) requireViewById;
        this.A04 = viewGroup;
        View requireViewById2 = viewGroup.requireViewById(R.id.profile_attribution_picture);
        C14360o3.A07(requireViewById2);
        this.A03 = (CircularImageView) requireViewById2;
        View requireViewById3 = viewGroup.requireViewById(R.id.title_text);
        C14360o3.A07(requireViewById3);
        this.A02 = (TextView) requireViewById3;
        View requireViewById4 = viewGroup.requireViewById(R.id.subtitle_text);
        C14360o3.A07(requireViewById4);
        this.A01 = (TextView) requireViewById4;
    }
}
