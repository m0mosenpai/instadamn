package X;

import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes10.dex */
public final class RFT extends C4C1 {
    public int A00;
    public int A01;
    public C4C7 A02;
    public byte[] A03;

    public RFT() {
        super(false);
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A01();
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        C4C7 c4c7 = this.A02;
        if (c4c7 != null) {
            return c4c7.A06;
        }
        return null;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A03, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A03(min);
        return min;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        byte[] decode;
        A02();
        this.A02 = c4c7;
        android.net.Uri uri = c4c7.A06;
        String scheme = uri.getScheme();
        C4B8.A05("data".equals(scheme), AnonymousClass001.A0R("Unsupported scheme: ", scheme));
        String[] split = uri.getSchemeSpecificPart().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str, 0);
                    this.A03 = decode;
                } catch (IllegalArgumentException e) {
                    ?? iOException = new IOException(AnonymousClass001.A0R("Error while parsing Base64 encoded string: ", str), e);
                    iOException.A01 = true;
                    iOException.A00 = 0;
                    throw iOException;
                }
            } else {
                decode = URLDecoder.decode(str, AbstractC50482Ts.A01.name()).getBytes(AbstractC50482Ts.A05);
                this.A03 = decode;
            }
            long j = c4c7.A04;
            int length = decode.length;
            if (j <= length) {
                int i = (int) j;
                this.A01 = i;
                int i2 = length - i;
                this.A00 = i2;
                long j2 = c4c7.A03;
                if (j2 != -1) {
                    this.A00 = (int) Math.min(i2, j2);
                }
                A04(c4c7);
                if (j2 == -1) {
                    return this.A00;
                }
                return j2;
            }
            this.A03 = null;
            throw new C93224Fy();
        }
        ?? iOException2 = new IOException(AbstractC167017dG.A0n(uri, "Unexpected URI format: ", AbstractC166987dD.A1C()), null);
        iOException2.A01 = true;
        iOException2.A00 = 0;
        throw iOException2;
    }
}
