package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.WiN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70857WiN implements InterfaceC50449MPd {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C70857WiN(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, String str, String str2, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = c22p;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC50449MPd
    public final void Dq9(File file) {
        C11T.A02(new RunnableC71517WvM(this, file));
    }

    @Override // X.InterfaceC50449MPd
    public final void onFailure(Exception exc) {
        C11T.A02(new RunnableC71371Wsg(this));
    }
}
