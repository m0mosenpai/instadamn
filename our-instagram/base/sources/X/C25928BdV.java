package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.BdV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25928BdV extends C3OO {
    public final ImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C25928BdV(View view) {
        super(view);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.metadata_name);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.marquee_metadata_name);
        this.A00 = (ImageView) AbstractC166997dE.A0R(view, R.id.metadata_icon);
    }
}
