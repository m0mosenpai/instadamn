package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.VlB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69303VlB {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C69303VlB(View view) {
        this.A03 = (TextView) view.requireViewById(R.id.super_title);
        this.A04 = AbstractC31180DnO.A06(view);
        this.A02 = (TextView) view.requireViewById(R.id.secondary_title);
        this.A00 = (ImageView) view.requireViewById(R.id.toggle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.operation_hours_container);
    }
}
