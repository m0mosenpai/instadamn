package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MlH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51294MlH extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51294MlH(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.image);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.title);
        this.A00 = view;
    }
}
