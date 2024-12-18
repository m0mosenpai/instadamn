package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mls, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51331Mls extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final N5G A04;

    public C51331Mls(View view, N5G n5g) {
        super(view);
        this.A00 = view;
        this.A04 = n5g;
        this.A01 = AbstractC31171DnF.A08(view, R.id.title_icon);
        this.A03 = AbstractC31172DnG.A0Y(view, R.id.title);
        this.A02 = AbstractC31172DnG.A0Y(view, R.id.description);
    }
}
