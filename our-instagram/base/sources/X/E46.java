package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* loaded from: classes6.dex */
public final class E46 extends C3OO {
    public static final List A0A = AbstractC16960so.A1Q(Integer.valueOf(R.id.item_1), Integer.valueOf(R.id.item_2), Integer.valueOf(R.id.item_3));
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;
    public final IgImageView A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E46(Context context, View view, UserSession userSession) {
        super(view);
        AbstractC167027dH.A13(userSession, context, view);
        this.A04 = userSession;
        this.A00 = context;
        this.A03 = view;
        this.A09 = AbstractC167007dF.A0T(view, R.id.image);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.description);
        this.A01 = AbstractC166997dE.A0S(view, R.id.dropdown_container);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.dropdown_text);
        this.A08 = AbstractC167007dF.A0T(view, R.id.dropdown_image);
        this.A02 = AbstractC166997dE.A0S(view, R.id.item_container);
    }
}
