package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34640FNx {
    public C34418FFi A00;
    public final Activity A01;
    public final LayoutInflater A02;
    public final View A03;
    public final C9BW A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C34640FNx(Activity activity, LayoutInflater layoutInflater, View view, C9BW c9bw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = activity;
        this.A05 = userSession;
        this.A03 = view;
        this.A02 = layoutInflater;
        this.A04 = c9bw;
        this.A07 = C37052GUi.A00(this, 1);
        this.A06 = C37052GUi.A00(this, 0);
    }
}
