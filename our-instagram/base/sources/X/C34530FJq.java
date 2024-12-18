package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

/* renamed from: X.FJq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34530FJq {
    public final View A00;
    public final IgdsEmptyState A01;

    public C34530FJq(View view) {
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A01 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline_component);
    }
}
