package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.6fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144396fL {
    public final View A00;
    public final ImageView A01;
    public final IgFrameLayout A02;

    public C144396fL(ViewStub viewStub, View view) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(viewStub, 2);
        this.A00 = view;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A02 = igFrameLayout;
        View findViewById = igFrameLayout.findViewById(R.id.product_collection_sticker_view);
        C14360o3.A07(findViewById);
        this.A01 = (ImageView) findViewById;
    }
}
