package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.7Ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161827Ms extends C3OO {
    public final C7IV A00;
    public final LoadMoreButton A01;

    public C161827Ms(View view, C7IV c7iv) {
        super(view);
        this.A00 = c7iv;
        View findViewById = view.findViewById(R.id.row_load_more_button);
        C14360o3.A07(findViewById);
        this.A01 = (LoadMoreButton) findViewById;
    }
}
