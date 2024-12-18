package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66072yj {
    public final SparseArray A00;
    public final InterfaceC66092yl A01;

    public C66072yj(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        C66082yk c66082yk = new C66082yk(interfaceC11380iw, userSession);
        sparseArray.append(0, c66082yk);
        sparseArray.append(1, new C66102ym(interfaceC11380iw));
        sparseArray.append(2, new C66112yn(userSession));
        sparseArray.append(3, new Object());
        this.A01 = c66082yk;
    }
}
