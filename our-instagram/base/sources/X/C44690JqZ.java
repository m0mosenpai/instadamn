package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JqZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44690JqZ extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    public C44690JqZ(View view) {
        super(view);
        this.A02 = AbstractC31176DnK.A0U(view, R.id.option_voter_avatar);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.option_voter_primary_name);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.option_voter_secondary_name);
    }
}
