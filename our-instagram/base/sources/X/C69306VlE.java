package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VlE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69306VlE {
    public final Resources A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;

    public C69306VlE(View view) {
        this.A00 = view.getResources();
        this.A01 = view.requireViewById(R.id.container);
        this.A04 = (IgImageView) view.requireViewById(R.id.image);
        this.A03 = AbstractC31180DnO.A06(view);
        this.A02 = AbstractC31176DnK.A0E(view);
    }
}
