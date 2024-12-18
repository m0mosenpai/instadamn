package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.73T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73T implements C73R {
    public final Context A00;
    public final AnonymousClass741 A01;
    public final C73S A02;
    public final User A03;

    public C73T(Context context, AnonymousClass741 anonymousClass741, User user) {
        C14360o3.A0B(anonymousClass741, 2);
        this.A00 = context;
        this.A01 = anonymousClass741;
        this.A03 = user;
        this.A02 = C73S.A0I;
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final String Aj7() {
        String string = this.A00.getString(2131973702);
        C14360o3.A07(string);
        return string;
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A02;
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final boolean DQZ() {
        return this.A01.DQp(this.A03);
    }

    @Override // X.C73R
    public final void onClick() {
        this.A01.D4V(this.A03);
    }
}
