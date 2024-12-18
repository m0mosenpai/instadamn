package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ODs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54692ODs {
    public final Activity A00;
    public final View A01;
    public final UserSession A02;
    public final C8BF A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    public C54692ODs(Activity activity, View view, UserSession userSession, C8BF c8bf) {
        C14360o3.A0B(userSession, 3);
        this.A01 = view;
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = c8bf;
        this.A05 = C1XM.A00(new C57245PbT(this, 10));
        this.A04 = C1XM.A00(new C57245PbT(this, 9));
    }
}
