package X;

import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wo0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71103Wo0 implements GZS {
    public final /* synthetic */ V1W A00;

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        C14360o3.A0B(textView, 0);
        UserSession userSession = this.A00.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        textView.addTextChangedListener(C106904rr.A00(userSession));
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        C67917V2h c67917V2h = this.A00.A02;
        if (c67917V2h == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        c67917V2h.getFilter().filter(str);
    }

    public C71103Wo0(V1W v1w) {
        this.A00 = v1w;
    }
}
