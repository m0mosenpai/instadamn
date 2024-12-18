package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.73Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73Q implements C73R {
    public final Context A00;
    public final AnonymousClass741 A01;
    public final C73S A02;
    public final User A03;

    public C73Q(Context context, AnonymousClass741 anonymousClass741, User user) {
        C14360o3.A0B(anonymousClass741, 2);
        this.A00 = context;
        this.A01 = anonymousClass741;
        this.A03 = user;
        this.A02 = C73S.A09;
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final String Aj7() {
        String string = this.A00.getString(2131961612);
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
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final void onClick() {
        String str;
        AnonymousClass741 anonymousClass741 = this.A01;
        if (this.A03.CQw()) {
            str = "profile_header_button";
        } else {
            str = null;
        }
        anonymousClass741.D3n(str);
    }
}
