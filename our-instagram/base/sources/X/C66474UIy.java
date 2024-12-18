package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.UIy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66474UIy extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final XAA A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66474UIy(View view, XAA xaa) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (TextView) view.requireViewById(R.id.location_typeahead_display_name);
        this.A01 = (TextView) view.requireViewById(R.id.location_typeahead_type_label);
        this.A02 = xaa;
    }
}
