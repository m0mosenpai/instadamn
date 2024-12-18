package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HNy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39208HNy extends C17T implements C68A {
    @Override // X.C68A
    public final AnonymousClass689 EsK(C1DY c1dy) {
        List A0o = A0o(473174317, C39207HNx.class);
        ArrayList A0i = AbstractC167007dF.A0i(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0i.add(((JJD) it.next()).EsJ(c1dy));
        }
        List A0o2 = A0o(631414135, ImmutablePandoUserDict.class);
        ArrayList A0i2 = AbstractC167007dF.A0i(A0o2);
        Iterator it2 = A0o2.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0i2, it2);
        }
        ArrayList A0i3 = AbstractC167007dF.A0i(A0i2);
        Iterator it3 = A0i2.iterator();
        while (it3.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0i3, it3);
        }
        return new AnonymousClass689(A0i, A0i3);
    }
}
