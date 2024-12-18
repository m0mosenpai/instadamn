package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E3s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31990E3s extends C3OO {
    public final Context A00;
    public final View A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final InterfaceC09390do A08;

    public C31990E3s(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        this.A07 = AbstractC167007dF.A0T(view, R.id.thumbnail);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.empty_wishlist_collection_thumbnail);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.subtitle);
        this.A05 = AbstractC167007dF.A0T(view, R.id.facepile);
        this.A06 = AbstractC167007dF.A0T(view, R.id.save_toggle_button);
        this.A08 = AbstractC09440dt.A01(new C50252MHh(this, 40));
        AbstractC56952jT.A01(view);
    }
}
