package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.LwF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49622LwF implements InterfaceC1119153d {
    public UserSession A00;
    public String A01;
    public WeakReference A02;
    public boolean A03;
    public final KDK A04;

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str;
        if (this.A03) {
            WeakReference weakReference = this.A02;
            if (weakReference == null) {
                str = "activityRef";
            } else {
                FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                if (fragmentActivity != null) {
                    String str2 = this.A01;
                    if (str2 == null) {
                        str = "promptId";
                    } else {
                        UserSession userSession = this.A00;
                        if (userSession == null) {
                            str = "userSession";
                        } else {
                            AbstractC46777KmY.A00(fragmentActivity, userSession, str2, null);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public C49622LwF(KDK kdk) {
        this.A04 = kdk;
    }
}
