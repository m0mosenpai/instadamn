package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class TGC implements InterfaceC23931Fd {
    public final SharedPreferences A00;
    public final String A01;

    @Override // X.InterfaceC23931Fd
    public final OutputStream C2b(Context context) {
        return new C60999RdS(this.A00, this.A01);
    }

    @Override // X.InterfaceC23931Fd
    public final Integer CBu() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC23931Fd
    public final InputStream Eoz(Context context) {
        String string = this.A00.getString(this.A01, null);
        if (string == null) {
            return null;
        }
        int length = string.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
        }
        return new ByteArrayInputStream(new String(bArr).getBytes());
    }

    @Override // X.InterfaceC23931Fd
    public final String getName() {
        return this.A01;
    }

    public TGC(Context context, String str) {
        this.A00 = AbstractC58318PtA.A0F(context, "legacy_prefs");
        this.A01 = str;
    }
}
