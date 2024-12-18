package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class RkA extends Exception {
    public final List A00;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return AbstractC001800i.A0P(", ", "", "", this.A00, C65059Tco.A00);
    }

    public RkA(List list) {
        this.A00 = list;
    }
}
