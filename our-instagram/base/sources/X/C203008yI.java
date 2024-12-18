package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203008yI extends C3OO {
    public final IgSimpleImageView A00;
    public final IgTextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203008yI(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.icon);
        C14360o3.A07(requireViewById);
        this.A00 = (IgSimpleImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.label);
        C14360o3.A07(requireViewById2);
        this.A01 = (IgTextView) requireViewById2;
    }
}
