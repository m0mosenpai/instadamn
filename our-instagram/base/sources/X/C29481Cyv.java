package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cyv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29481Cyv implements InterfaceC30961DjI {
    public final C05A A00 = AbstractC25225BEi.A1H(new C32(C16930sl.A00, 0));
    public final FoaUserSession A01;

    @Override // X.InterfaceC30961DjI
    public final void E5P() {
        FoaUserSession foaUserSession = this.A01;
        C14360o3.A0B(foaUserSession, 0);
        C105904q1 c105904q1 = C105894q0.A01;
        UserSession A00 = AbstractC28057CYl.A00(foaUserSession);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        ArrayList A01 = c105904q1.A01(context, A00);
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC34363FDf.A00((Map) it.next()));
        }
        this.A00.Egh(new C32(A0q, A0q.size()));
    }

    public C29481Cyv(FoaUserSession foaUserSession) {
        this.A01 = foaUserSession;
    }
}
