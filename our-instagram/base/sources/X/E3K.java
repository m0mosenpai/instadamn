package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E3K extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public E3K(View view) {
        super(view);
        this.A00 = view;
        this.A04 = AbstractC25231BEo.A0d(view, R.id.title_text);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.pinned_save_row_title_text);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.new_collection_cta);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.pinned_save_row_new_collection_cta);
    }
}
