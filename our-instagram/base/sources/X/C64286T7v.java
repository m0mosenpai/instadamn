package X;

import java.util.Map;

/* renamed from: X.T7v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64286T7v implements InterfaceC28041Xi {
    public final int A00;

    public C64286T7v(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC28041Xi
    public final boolean apply(Object obj) {
        switch (this.A00) {
            case 0:
                if (obj == null) {
                    return false;
                }
                return true;
            case 1:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
