package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes5.dex */
public final class C5S extends AbstractC25917BdK {
    public final TextView A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final /* synthetic */ C25898Bcz A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5S(View view, C25898Bcz c25898Bcz) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A03 = c25898Bcz;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.primary_text);
        this.A01 = A0d;
        this.A00 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A02 = AbstractC167007dF.A0T(view, R.id.image);
        AbstractC85953sP.A04(A0d);
    }
}