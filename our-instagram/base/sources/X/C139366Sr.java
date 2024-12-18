package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.6Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139366Sr implements InterfaceC139376Ss {
    public String A00;
    public String A01;

    @Override // X.InterfaceC139376Ss
    public final String EqO() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            String str = this.A00;
            if (str != null) {
                A0A.A0S("ad_id", str);
            }
            String str2 = this.A01;
            if (str2 != null) {
                A0A.A0S("tracking_id", str2);
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public C139366Sr(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public C139366Sr() {
    }
}
