package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.JaC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43848JaC {
    public C189478aR A00;
    public TriangleSpinner A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C43849JaD A04 = new C43849JaD();

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        C43849JaD c43849JaD = this.A04;
        Map map = c43849JaD.A02;
        map.clear();
        C2GS c2gs = c43849JaD.A01;
        c2gs.A0B(AbstractC001800i.A0a(map.values()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8Z4 c8z4 = (C8Z4) it.next();
            map.put(c8z4, new C43874Jae(c8z4));
            c2gs.A0B(AbstractC001800i.A0a(map.values()));
        }
    }

    public C43848JaC(Fragment fragment, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = fragment;
    }
}
