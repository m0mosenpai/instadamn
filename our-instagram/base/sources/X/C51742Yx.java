package X;

import java.io.BufferedReader;
import java.util.Iterator;

/* renamed from: X.2Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51742Yx implements InterfaceC224417g {
    public final BufferedReader A00;

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        return new C2Z4(this);
    }

    public C51742Yx(BufferedReader bufferedReader) {
        this.A00 = bufferedReader;
    }
}
