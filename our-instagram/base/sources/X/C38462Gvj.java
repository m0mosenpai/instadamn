package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gvj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38462Gvj extends C3OO {
    public final Context A00;
    public final IgImageView A01;
    public final IJ5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38462Gvj(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view.getContext();
        this.A02 = new IJ5(view, R.id.image);
        this.A01 = AbstractC37302Gc3.A0K(view, R.id.image);
    }
}
