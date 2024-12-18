package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Aek, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23711Aek implements InterfaceC69513Al {
    public final /* synthetic */ C88T A00;

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        view.setAlpha(0.0f);
        view.requireViewById(R.id.canvas_text_view_input_text).setOnTouchListener(new ViewOnTouchListenerC209789Po(this, 2));
        this.A00.A02 = AbstractC166987dD.A0e(view, R.id.canvas_text_view_header);
    }

    public C23711Aek(C88T c88t) {
        this.A00 = c88t;
    }
}
