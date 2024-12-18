package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Pattern;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4CB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CB extends C4C1 implements InterfaceC92344Bp {
    public static final Pattern A0C = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A00;
    public long A01;
    public InputStream A02;
    public HttpURLConnection A03;
    public int A04;
    public C4C7 A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final C4CC A09;
    public final C4CC A0A;
    public final String A0B;

    public C4CB(C4CC c4cc, String str, int i, int i2) {
        super(true);
        this.A0B = str;
        this.A07 = i;
        this.A08 = i2;
        this.A09 = c4cc;
        this.A0A = new C4CC();
    }

    @Override // X.InterfaceC92344Bp
    public final void changeHttpPriority(byte b, boolean z) {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new C93214Fx(this.A05, e, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 3);
                }
            }
        } finally {
            this.A02 = null;
            A00();
            if (this.A06) {
                this.A06 = false;
                A01();
            }
        }
    }

    private void A00() {
        HttpURLConnection httpURLConnection = this.A03;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC46512Bo.A05(AbstractC58317Pt9.A00(173), "Unexpected error while disconnecting", e);
            }
            this.A03 = null;
        }
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        HttpURLConnection httpURLConnection = this.A03;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    @Override // X.InterfaceC92354Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C4C7 r30) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CB.open(X.4C7):long");
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.A01;
            if (j != -1) {
                long j2 = j - this.A00;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                } else {
                    return -1;
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
                this.A00 += read;
                A03(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            throw C93214Fx.A00(this.A05, e, 2);
        }
    }

    @Deprecated
    public C4CB(String str, int i, int i2) {
        this(null, str, i, i2);
    }

    @Deprecated
    public C4CB() {
        this(null, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
    }
}
