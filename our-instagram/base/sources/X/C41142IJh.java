package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IJh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41142IJh {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;

    public C41142IJh(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.cover_image);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.title);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.subtitle);
        this.A04 = AbstractC37302Gc3.A0K(view, R.id.primary_avatar);
        this.A05 = AbstractC37302Gc3.A0K(view, R.id.secondary_avatar);
    }
}
