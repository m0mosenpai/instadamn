package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cui, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29239Cui implements InterfaceC30941Div {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1ZE A02;
    public final /* synthetic */ C189478aR A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC30941Div
    public final void CuR(Achievement achievement) {
        C1ZE c1ze = this.A02;
        C189448aO A01 = AbstractC47841LBf.A01(this.A00, this.A01);
        c1ze.A00();
        this.A03.A0F(AbstractC27636CHh.A00(String.valueOf(achievement.A01), this.A05, this.A04, null, null, false, false), A01);
    }

    public C29239Cui(FragmentActivity fragmentActivity, UserSession userSession, C1ZE c1ze, C189478aR c189478aR, String str, String str2) {
        this.A02 = c1ze;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = c189478aR;
    }
}
