package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T97 implements InterfaceC65432Tk3 {
    @Override // X.InterfaceC65432Tk3
    public final byte[] AKv(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, size + offset);
    }
}
