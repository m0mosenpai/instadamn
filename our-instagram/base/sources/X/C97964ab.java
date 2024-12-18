package X;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: X.4ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97964ab {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public final byte[] A00(EventMessage eventMessage) {
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.A01;
            dataOutputStream.writeBytes(eventMessage.A03);
            dataOutputStream.writeByte(0);
            String str = eventMessage.A04;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.A01);
            dataOutputStream.writeLong(eventMessage.A02);
            dataOutputStream.write(eventMessage.A05);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C97964ab() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }
}
