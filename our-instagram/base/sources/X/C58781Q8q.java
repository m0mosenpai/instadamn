package X;

import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.net.URLDecoder;

/* renamed from: X.Q8q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58781Q8q extends AbstractC73327Y8i {
    public int A00;
    public int A01;
    public C62932SYa A02;
    public byte[] A03;

    public C58781Q8q() {
        super(false);
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A02();
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        C62932SYa c62932SYa = this.A02;
        if (c62932SYa != null) {
            return c62932SYa.A01;
        }
        return null;
    }

    @Override // X.InterfaceC71873X8g
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
        A04(min);
        return min;
    }

    @Override // X.InterfaceC65627Tpn
    public final long E2I(C62932SYa c62932SYa) {
        byte[] decode;
        A03();
        this.A02 = c62932SYa;
        android.net.Uri normalizeScheme = c62932SYa.A01.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        WDn.A03("data".equals(scheme), AnonymousClass001.A0R("Unsupported scheme: ", scheme));
        String[] split = normalizeScheme.getSchemeSpecificPart().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str, 0);
                    this.A03 = decode;
                } catch (IllegalArgumentException e) {
                    throw new VCM(AnonymousClass001.A0R("Error while parsing Base64 encoded string: ", str), e, 0, true);
                }
            } else {
                decode = URLDecoder.decode(str, AbstractC50482Ts.A01.name()).getBytes(AbstractC50482Ts.A05);
                this.A03 = decode;
            }
            long j = c62932SYa.A00;
            int length = decode.length;
            if (j <= length) {
                int i = (int) j;
                this.A01 = i;
                this.A00 = length - i;
                A05(c62932SYa);
                return this.A00;
            }
            this.A03 = null;
            throw new C61034Re4();
        }
        throw new VCM(AbstractC167017dG.A0n(normalizeScheme, "Unexpected URI format: ", AbstractC166987dD.A1C()), null, 0, true);
    }
}
