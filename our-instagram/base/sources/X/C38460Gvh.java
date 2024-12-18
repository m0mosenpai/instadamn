package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gvh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38460Gvh extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38460Gvh(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC37302Gc3.A0K(view, R.id.image);
        View findViewById = view.findViewById(R.id.title);
        TextView textView = (TextView) findViewById;
        AbstractC37300Gc1.A0d(textView, true);
        C14360o3.A07(findViewById);
        this.A01 = textView;
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.subtitle);
    }
}
