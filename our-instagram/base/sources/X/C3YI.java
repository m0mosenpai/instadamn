package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;

/* renamed from: X.3YI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YI {
    public final C57012jc A00;

    public final void A00() {
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            c57012jc.A01().setVisibility(8);
        }
    }

    public C3YI(View view) {
        this.A00 = new C57012jc((ViewStub) view.findViewById(R.id.row_feed_carousel_edit_tags_indicator_stub));
    }
}
