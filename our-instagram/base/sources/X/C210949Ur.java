package X;

import android.graphics.Matrix;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.9Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210949Ur extends C3OO {
    public A9N A00;
    public final Matrix A01;
    public final C3PF A02;
    public final ConstrainedImageView A03;

    public C210949Ur(ConstrainedImageView constrainedImageView) {
        super(constrainedImageView);
        this.A03 = constrainedImageView;
        C3P9 A0s = AbstractC166987dD.A0s(constrainedImageView);
        A0s.A0D = true;
        A0s.A07 = true;
        this.A02 = C216559iC.A00(A0s, this, 0);
        this.A01 = AbstractC166987dD.A0Q();
    }
}
