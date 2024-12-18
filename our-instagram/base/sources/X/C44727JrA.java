package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JrA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44727JrA extends C3OO {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TextView A03;

    public C44727JrA(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A01 = AbstractC166997dE.A0S(view, R.id.background_view);
        this.A02 = AbstractC166997dE.A0S(view, R.id.content_container);
        this.A03 = AbstractC167007dF.A0N(view, R.id.prompt_text);
    }
}
