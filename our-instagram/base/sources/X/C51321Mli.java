package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mli, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51321Mli extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C51321Mli(View view) {
        super(view);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.next_step_icon);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.next_step_title);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.next_step_subtitle);
    }
}
