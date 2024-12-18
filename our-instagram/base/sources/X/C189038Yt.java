package X;

import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189038Yt implements C1NJ {
    public final int A00;
    public final BitmapFactory.Options A01;
    public final C18340vL A02;
    public final UserSession A03;

    public C189038Yt(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = i;
        this.A02 = new C18340vL(C14120nc.A00(), Runtime.getRuntime().availableProcessors() * 2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A01 = options;
        options.inJustDecodeBounds = true;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        Object C4x = interfaceC59502nt.C4x();
        if (C4x != null) {
            C22870A6q c22870A6q = (C22870A6q) C4x;
            BCZ bcz = (BCZ) c22870A6q.A01.get();
            Draft draft = c22870A6q.A00;
            if (bcz != null && bcz.CXY(draft)) {
                bcz.Dt2(c73033Pe.A01, draft);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }
}
