package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33249Elj extends AnonymousClass772 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C62812tK A03;
    public final /* synthetic */ C26000Beo A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33249Elj(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C62812tK c62812tK, C26000Beo c26000Beo, int i) {
        super(Integer.valueOf(i));
        this.A03 = c62812tK;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = c26000Beo;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        String str = this.A04.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(str, 2);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, str, AbstractC43591JPw.A00(1177), interfaceC11380iw.getModuleName());
        A01.A0i = true;
        Fragment A00 = C31368DqX.A00(userSession, A02, A01);
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0D(A00);
        A0P.A03();
    }
}
