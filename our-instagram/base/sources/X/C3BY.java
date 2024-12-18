package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3BY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BY {
    public View A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public C3BY(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = AbstractC60952qJ.A00(interfaceC60442pS);
    }
}
