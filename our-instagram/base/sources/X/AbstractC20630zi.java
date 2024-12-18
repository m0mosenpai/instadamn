package X;

import java.io.IOException;

/* renamed from: X.0zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20630zi {
    public static void A00(InterfaceC20670zm[] interfaceC20670zmArr) {
        int i = 0;
        while (true) {
            int length = interfaceC20670zmArr.length - 1;
            if (i < length) {
                if (interfaceC20670zmArr[i].Ct0()) {
                    i++;
                } else {
                    throw new IOException("Unsupported XZ filter chain");
                }
            } else {
                if (interfaceC20670zmArr[length].Cgc()) {
                    int i2 = 0;
                    for (InterfaceC20670zm interfaceC20670zm : interfaceC20670zmArr) {
                        if (interfaceC20670zm.AH8()) {
                            i2++;
                        }
                    }
                    if (i2 <= 3) {
                        return;
                    } else {
                        throw new IOException("Unsupported XZ filter chain");
                    }
                }
                throw new IOException("Unsupported XZ filter chain");
            }
        }
    }
}
