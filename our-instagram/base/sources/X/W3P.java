package X;

import androidx.media3.common.DrmInitData;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes11.dex */
public final class W3P {
    public int A0F;
    public int A0K;
    public int A0P;
    public int A0S;
    public int A0T;
    public int A0X;
    public DrmInitData A0b;
    public C69702Vtx A0c;
    public XG2 A0d;
    public C69775VvC A0e;
    public String A0f;
    public String A0h;
    public boolean A0j;
    public boolean A0l;
    public byte[] A0m;
    public byte[] A0n;
    public byte[] A0p;
    public int A0Y = -1;
    public int A0O = -1;
    public int A0E = -1;
    public int A0N = -1;
    public int A0L = -1;
    public int A0M = 0;
    public int A0U = -1;
    public float A0A = 0.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public byte[] A0o = null;
    public int A0W = -1;
    public boolean A0k = false;
    public int A0I = -1;
    public int A0J = -1;
    public int A0H = -1;
    public int A0Q = 1000;
    public int A0R = 200;
    public float A06 = -1.0f;
    public float A07 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A0B = -1.0f;
    public float A0C = -1.0f;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public int A0G = 1;
    public int A0D = -1;
    public int A0V = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
    public long A0Z = 0;
    public long A0a = 0;
    public boolean A0i = true;
    public String A0g = "eng";

    public static byte[] A00(W3P w3p, String str) {
        byte[] bArr = w3p.A0m;
        if (bArr != null) {
            return bArr;
        }
        throw new VCM(AnonymousClass001.A0R("Missing CodecPrivate for codec ", str), null, 1, true);
    }
}
