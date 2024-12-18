package X;

import java.util.HashMap;

/* renamed from: X.2fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54702fS extends AbstractC54342eo {
    public final C54602fI A00;
    public final C19L A01;

    @Override // X.AbstractC54342eo
    public final C54392et A00() {
        Object obj = AbstractC54352ep.A00.get(C54392et.class);
        if (obj != null) {
            return (C54392et) obj;
        }
        throw new NullPointerException(AbstractC111324zv.A00(2788));
    }

    @Override // X.AbstractC54342eo
    public final C54412ev A01() {
        Object obj = AbstractC54352ep.A00.get(C54412ev.class);
        if (obj != null) {
            return (C54412ev) obj;
        }
        throw new NullPointerException(AbstractC111324zv.A00(2789));
    }

    @Override // X.AbstractC54342eo
    public final C54452ez A02() {
        Object obj = AbstractC54352ep.A00.get(C54452ez.class);
        if (obj != null) {
            return (C54452ez) obj;
        }
        throw new NullPointerException(AbstractC111324zv.A00(2790));
    }

    public C54702fS() {
        HashMap hashMap = AbstractC54352ep.A00;
        Object obj = hashMap.get(C19L.class);
        if (obj != null) {
            this.A01 = (C19L) obj;
            Object obj2 = hashMap.get(C54602fI.class);
            if (obj2 != null) {
                this.A00 = (C54602fI) obj2;
                return;
            }
            throw new NullPointerException(MSV.A00(240));
        }
        throw new NullPointerException(AbstractC111324zv.A00(2806));
    }
}
