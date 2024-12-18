package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class E36 extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E36(View view) {
        super(view);
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.section_icon);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.title);
        IgTextView A0Y2 = AbstractC31172DnG.A0Y(view, R.id.subtitle);
        AbstractC25233BEq.A0w(2, A0a, A0Y, A0Y2);
        this.A00 = view;
        this.A03 = A0a;
        this.A02 = A0Y;
        this.A01 = A0Y2;
    }
}
