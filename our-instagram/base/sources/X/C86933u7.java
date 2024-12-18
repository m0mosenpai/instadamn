package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.lang.ref.WeakReference;

/* renamed from: X.3u7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86933u7 implements C3u8 {
    public final InterfaceC75133Zd A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final WeakReference A03;

    public C86933u7(Context context, InterfaceC75133Zd interfaceC75133Zd, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(interfaceC75133Zd, 3);
        C14360o3.A0B(userSession, 4);
        this.A02 = c38321qM;
        this.A00 = interfaceC75133Zd;
        this.A01 = userSession;
        this.A03 = new WeakReference(context);
    }

    @Override // X.C3u8
    public final String AX2() {
        Context context = (Context) this.A03.get();
        if (context != null) {
            AndroidLink A02 = AbstractC905941u.A02(context, this.A01, this.A02, this.A00.Am8(), false);
            if (A02 != null) {
                return AbstractC39722Hjs.A00(A02);
            }
            return null;
        }
        return null;
    }
}
