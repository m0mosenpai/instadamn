package X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.Q4j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58714Q4j extends WebView {
    public final /* synthetic */ DialogC58694Q0x A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58714Q4j(Context context, DialogC58694Q0x dialogC58694Q0x) {
        super(context);
        this.A00 = dialogC58694Q0x;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        int A06 = C0f9.A06(-2060696786);
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException e) {
            e.toString();
        }
        C0f9.A0D(-310633602, A06);
    }
}
