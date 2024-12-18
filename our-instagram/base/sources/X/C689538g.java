package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.38g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C689538g {
    public final Fragment A00;
    public final AbstractC10360h2 A01;
    public final UserSession A02;

    public final void A00(C685836v c685836v, JG4 jg4, String str, Map map) {
        C14360o3.A0B(c685836v, 2);
        if (!c685836v.A00) {
            c685836v.A00 = true;
            C1GL c1gl = (C1GL) this.A00;
            AbstractC192798gL A05 = C192108fB.A05(this.A02, str, map);
            A05.A00(new HDZ(c685836v, jg4, this));
            c1gl.schedule(A05);
        }
    }

    public C689538g(Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = abstractC10360h2;
    }
}
