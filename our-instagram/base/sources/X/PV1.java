package X;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PV1 implements InterfaceC224417g {
    public final File A00;
    public final Integer A01;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C73556YKj(this);
    }

    public PV1(File file, Integer num) {
        this.A00 = file;
        this.A01 = num;
    }
}
