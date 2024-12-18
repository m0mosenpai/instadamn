package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144546fa {
    public final View A00;
    public final IgSimpleImageView A01;

    public C144546fa(C57012jc c57012jc) {
        View requireViewById = c57012jc.A01().requireViewById(R.id.pics_please_sticker_container);
        C14360o3.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = requireViewById.requireViewById(R.id.pics_please_sticker_view);
        C14360o3.A07(requireViewById2);
        this.A01 = (IgSimpleImageView) requireViewById2;
    }
}
