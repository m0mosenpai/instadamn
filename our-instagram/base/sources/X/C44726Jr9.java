package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jr9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44726Jr9 extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;

    public C44726Jr9(View view) {
        super(view);
        this.A00 = view.requireViewById(R.id.state_selector_container);
        this.A01 = view.requireViewById(R.id.state_selector_loading_spinner);
        this.A02 = view.requireViewById(R.id.state_selector_text_container);
        this.A03 = AbstractC166997dE.A0T(view, R.id.state_selector_text);
        AbstractC010103p.A0B(view, new UEI(this, 0));
    }
}
