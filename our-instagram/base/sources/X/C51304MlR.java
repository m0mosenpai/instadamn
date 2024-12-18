package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.MlR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51304MlR extends C3OO {
    public final TextView A00;
    public final C8SB A01;
    public final ImageView A02;

    public C51304MlR(View view, C8SB c8sb) {
        super(view);
        this.A01 = c8sb;
        this.A00 = AbstractC167007dF.A0N(view, R.id.reorder_section_title);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.section_reorder_thumb);
        this.A02 = A0D;
        ViewOnTouchListenerC50553MTk.A00(A0D, 10, this);
    }
}
