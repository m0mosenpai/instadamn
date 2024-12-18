package X;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: X.Vdc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68880Vdc {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public C68880Vdc() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }
}
