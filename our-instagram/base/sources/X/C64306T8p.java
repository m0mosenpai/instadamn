package X;

import java.util.Iterator;

/* renamed from: X.T8p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64306T8p implements InterfaceC65549TmS {
    public static final C64306T8p A00 = new Object();

    @Override // X.InterfaceC65549TmS
    public final Class BI2() {
        return InterfaceC65278ThB.class;
    }

    @Override // X.InterfaceC65549TmS
    public final Class BgT() {
        return InterfaceC65278ThB.class;
    }

    @Override // X.InterfaceC65549TmS
    public final /* bridge */ /* synthetic */ Object FEE(final C62916SWx primitives) {
        if (primitives != null) {
            if (primitives.A00 != null) {
                Iterator A16 = AbstractC166997dE.A16(primitives.A03);
                while (A16.hasNext()) {
                    Iterator A1J = AbstractC25226BEj.A1J(A16.next());
                    while (A1J.hasNext()) {
                        A1J.next();
                    }
                }
                return new T92(primitives);
            }
            throw AbstractC58318PtA.A0x("no primary in primitive set");
        }
        throw AbstractC58318PtA.A0x("primitive set must be non-null");
    }
}
