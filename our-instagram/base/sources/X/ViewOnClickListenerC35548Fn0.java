package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Fn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35548Fn0 implements View.OnClickListener {
    public final /* synthetic */ C7BQ A00;
    public final /* synthetic */ C7S6 A01;

    public ViewOnClickListenerC35548Fn0(C7BQ c7bq, C7S6 c7s6) {
        this.A00 = c7bq;
        this.A01 = c7s6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7ZX c7zx;
        int A05 = C0f9.A05(-1695394868);
        C7BQ c7bq = this.A00;
        MessageIdentifier messageIdentifier = c7bq.A02;
        if (messageIdentifier != null && (c7zx = this.A01.A07) != null) {
            c7zx.Ekd(messageIdentifier, null, c7bq.A03, null, null, null, "comment_pill");
        }
        C0f9.A0C(-2096648999, A05);
    }
}
