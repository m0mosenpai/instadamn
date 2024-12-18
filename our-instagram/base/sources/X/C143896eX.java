package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143896eX {
    public View A00;
    public ViewGroup A01;
    public TextView A02;
    public final ViewStub A03;

    public C143896eX(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    public final void A00() {
        TextView textView;
        if (this.A01 == null) {
            View inflate = this.A03.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A01 = viewGroup;
            View view = null;
            if (viewGroup != null) {
                textView = (TextView) viewGroup.findViewById(R.id.reel_highlights_attribution_label);
            } else {
                textView = null;
            }
            this.A02 = textView;
            ViewGroup viewGroup2 = this.A01;
            if (viewGroup2 != null) {
                view = viewGroup2.findViewById(R.id.unseen_indicator);
            }
            this.A00 = view;
        }
    }
}
