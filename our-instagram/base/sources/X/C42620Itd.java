package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Itd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42620Itd implements C38N {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        IgFragmentFactoryImpl.A00();
        String id = c38321qM.getId();
        if (id != null) {
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = id;
            c35028Fc1.A03 = C3YU.A04;
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            c35028Fc1.A0F = userSession.token;
            C38J A02 = c35028Fc1.A02();
            FragmentActivity fragmentActivity = this.A00;
            if (fragmentActivity != null) {
                C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
                A0r.A0D(A02);
                if (c38321qM.Cff()) {
                    str = "video_thumbnail";
                } else {
                    str = "photo_thumbnail";
                }
                A0r.A0B = str;
                String str2 = userSession.userId;
                ?? obj = new Object();
                obj.A00 = str2;
                A0r.A07 = obj;
                A0r.A04();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        return false;
    }

    public C42620Itd(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public C42620Itd() {
    }
}
