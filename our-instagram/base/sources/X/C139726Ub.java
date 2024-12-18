package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.lang.ref.WeakReference;

/* renamed from: X.6Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139726Ub implements C3u8 {
    public C38321qM A00;
    public WeakReference A01;
    public final UserSession A02;

    @Override // X.C3u8
    public final String AX2() {
        C38321qM c38321qM;
        AndroidLink A01;
        WeakReference weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null && (c38321qM = this.A00) != null && (A01 = AbstractC905941u.A01((Context) weakReference.get(), this.A02, c38321qM, c38321qM.A3p(), false)) != null) {
            return AbstractC39722Hjs.A00(A01);
        }
        return null;
    }

    public C139726Ub(Context context, UserSession userSession, C38321qM c38321qM) {
        WeakReference weakReference;
        if (context != null) {
            weakReference = new WeakReference(context);
        } else {
            weakReference = null;
        }
        this.A01 = weakReference;
        this.A00 = c38321qM;
        this.A02 = userSession;
    }
}
