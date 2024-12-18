package X;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/* renamed from: X.S4h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62262S4h {
    public static final Q0H A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            Object readObject = new ObjectInputStream(byteArrayInputStream).readObject();
            C14360o3.A0C(readObject, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord");
            Q0H q0h = (Q0H) readObject;
            byteArrayInputStream.close();
            return q0h;
        } finally {
        }
    }
}
