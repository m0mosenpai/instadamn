package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Gvi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38461Gvi extends C3OO {
    public final Context A00;
    public final IgProgressImageView A01;
    public final C42797IwZ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38461Gvi(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A02 = new C42797IwZ(view, R.id.photo);
        this.A01 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.photo);
    }
}
