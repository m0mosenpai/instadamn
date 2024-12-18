package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GH3 implements InterfaceC1119153d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC144306fC A04;
    public final /* synthetic */ IE9 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    public GH3(View view, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC144306fC interfaceC144306fC, IE9 ie9, String str, String str2, int i) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A00 = i;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = interfaceC144306fC;
        this.A01 = view;
        this.A05 = ie9;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A03;
        int i = this.A00;
        String str = this.A06;
        String str2 = this.A07;
        AbstractC34874FYj.A00(fragmentActivity, this.A01, userSession, this.A04, str, str2, i, true);
    }
}
