package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.2Dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46892Dd {
    public final UserSession A00;
    public final C2DX A01;
    public final C46862Da A02;

    public final Object A01(List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A02.A00(i), new C9D4(this, list, null, i, 4));
    }

    public final Object A02(List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A02.A00(i), new C9D4(this, list, null, i, 5));
    }

    public static final byte[] A00(List list) {
        AbstractC09800fd.A01("DirectThreadsJsonParser.convertToJsonByteArray", 1287063336);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = C15W.A05;
        byte[] bytes = "[".getBytes(charset);
        C14360o3.A07(bytes);
        byteArrayOutputStream.write(bytes);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            byte[] bArr = (byte[]) obj;
            if (i > 0) {
                byte[] bytes2 = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1.getBytes(charset);
                C14360o3.A07(bytes2);
                byteArrayOutputStream.write(bytes2);
            }
            byteArrayOutputStream.write(bArr);
            i = i2;
        }
        byte[] bytes3 = "]".getBytes(charset);
        C14360o3.A07(bytes3);
        byteArrayOutputStream.write(bytes3);
        AbstractC09800fd.A00(1109085493);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }

    public C46892Dd(UserSession userSession, C2DX c2dx) {
        this.A00 = userSession;
        this.A01 = c2dx;
        this.A02 = new C46862Da(userSession);
    }
}
