package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.GwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38489GwA extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C38489GwA(View view) {
        super(view);
        this.A04 = AbstractC166987dD.A0e(view, R.id.position);
        this.A03 = AbstractC166987dD.A0e(view, R.id.item_type);
        this.A02 = AbstractC166987dD.A0e(view, R.id.item_source_type);
        this.A01 = AbstractC166987dD.A0e(view, R.id.id_text);
        this.A00 = view.findViewById(R.id.debug_overlay_item_row);
    }
}
