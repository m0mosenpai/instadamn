package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class WS1 implements InterfaceC71837X6u {
    public final C71186WpY A00;

    public WS1(int[] iArr) {
        C71186WpY c71186WpY;
        int length;
        if (iArr != null && (length = iArr.length) != 0) {
            c71186WpY = new C71186WpY(Arrays.copyOf(iArr, length));
        } else {
            c71186WpY = C71186WpY.A02;
        }
        this.A00 = c71186WpY;
    }
}
