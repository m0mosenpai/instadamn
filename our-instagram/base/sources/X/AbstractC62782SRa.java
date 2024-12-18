package X;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.SRa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62782SRa {
    public static final byte[] A01(String str) {
        try {
            Charset forName = Charset.forName("ASCII");
            C14360o3.A07(forName);
            return AbstractC58318PtA.A1a(str, forName);
        } catch (UnsupportedEncodingException e) {
            throw AbstractC58318PtA.A0e("ASCII not found!", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(byte[] bArr, byte[] bArr2, int i) {
        boolean A1Y = AbstractC25229BEm.A1Y(bArr2);
        int length = bArr2.length;
        if (length + i > bArr.length) {
            return A1Y;
        }
        C17u c17u = new C17u(A1Y ? 1 : 0, length - 1);
        if ((c17u instanceof Collection) && ((Collection) c17u).isEmpty()) {
            return true;
        }
        Iterator it = c17u.iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            if (bArr[i + A00] != bArr2[A00]) {
                return false;
            }
        }
        return true;
    }
}
