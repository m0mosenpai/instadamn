package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* loaded from: classes6.dex */
public final class E45 extends C3OO {
    public static final List A05 = AbstractC16960so.A1Q(Integer.valueOf(R.id.item_1), Integer.valueOf(R.id.item_2), Integer.valueOf(R.id.item_3));
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgdsButton A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E45(Context context, View view) {
        super(view);
        AbstractC167017dG.A1P(context, view);
        this.A00 = context;
        this.A01 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.image);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.cta_button);
    }
}
