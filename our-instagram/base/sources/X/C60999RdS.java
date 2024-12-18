package X;

import android.content.SharedPreferences;
import java.io.ByteArrayOutputStream;

/* renamed from: X.RdS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60999RdS extends ByteArrayOutputStream {
    public final SharedPreferences A00;
    public final String A01;

    public C60999RdS(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        SharedPreferences.Editor edit = this.A00.edit();
        String str = this.A01;
        byte[] byteArray = toByteArray();
        StringBuilder A0q = AbstractC58318PtA.A0q(byteArray.length * 2);
        for (byte b : byteArray) {
            int i = b & 255;
            if (i < 16) {
                A0q.append('0');
            }
            AbstractC58318PtA.A1T(A0q, i);
        }
        AbstractC58318PtA.A1C(edit, str, A0q.toString().toUpperCase());
    }
}
