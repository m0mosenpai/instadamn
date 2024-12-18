package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176837tf {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public C176877tj A0S;
    public C176877tj A0T;
    public C176877tj A0U;
    public C176877tj A0V;
    public C176877tj A0W;
    public String A0X;
    public HashMap A0Y = new HashMap();
    public List A0Z;
    public List A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public float[] A1m;
    public int[] A1n;
    public int[] A1o;

    public final C177007tw A00() {
        if (this.A1P && this.A1h) {
            throw new IllegalStateException("Unable to build setting modifications, video stabilization will not work correctly if optical stabilization is also enabled, please enable one at a time only.");
        }
        return new C177007tw(this);
    }

    public final void A01(C176807tc c176807tc, Object obj) {
        int i = c176807tc.A00;
        switch (i) {
            case 0:
                this.A0k = ((Boolean) obj).booleanValue();
                this.A0l = true;
                return;
            case 1:
                this.A0o = ((Boolean) obj).booleanValue();
                this.A0p = true;
                return;
            case 2:
                this.A1E = ((Boolean) obj).booleanValue();
                this.A1F = true;
                return;
            case 3:
                this.A1h = ((Boolean) obj).booleanValue();
                this.A1i = true;
                return;
            case 4:
                this.A1P = ((Boolean) obj).booleanValue();
                this.A1Q = true;
                return;
            case 5:
                this.A13 = ((Boolean) obj).booleanValue();
                this.A14 = true;
                return;
            case 6:
                this.A0e = ((Boolean) obj).booleanValue();
                this.A0f = true;
                return;
            case 7:
            case 16:
            case 20:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 61:
            default:
                throw new RuntimeException(AnonymousClass001.A0O("Invalid Settings key: ", i));
            case 8:
                this.A1a = ((Boolean) obj).booleanValue();
                this.A1b = true;
                return;
            case 9:
                this.A0C = ((Number) obj).intValue();
                this.A12 = true;
                return;
            case 10:
                this.A0B = ((Number) obj).intValue();
                this.A10 = true;
                return;
            case 11:
                this.A06 = ((Number) obj).intValue();
                this.A0b = true;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A08 = ((Number) obj).intValue();
                this.A0t = true;
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A0A = ((Number) obj).intValue();
                this.A0w = true;
                return;
            case 14:
                this.A0E = ((Number) obj).intValue();
                this.A1J = true;
                return;
            case Process.SIGTERM /* 15 */:
                this.A0F = ((Number) obj).intValue();
                this.A1K = true;
                return;
            case 17:
                this.A0I = ((Number) obj).intValue();
                this.A1S = true;
                return;
            case 18:
                this.A0J = ((Number) obj).intValue();
                this.A1U = true;
                return;
            case Process.SIGSTOP /* 19 */:
                this.A0K = ((Number) obj).intValue();
                this.A1W = true;
                return;
            case 21:
                this.A0H = ((Number) obj).intValue();
                this.A1R = true;
                return;
            case 22:
                this.A0D = ((Number) obj).intValue();
                this.A1I = true;
                return;
            case 23:
                this.A0L = ((Number) obj).intValue();
                this.A1c = true;
                return;
            case 24:
                this.A0N = ((Number) obj).intValue();
                this.A1j = true;
                return;
            case 25:
                this.A0O = ((Number) obj).intValue();
                this.A1l = true;
                return;
            case 26:
                this.A05 = ((Number) obj).floatValue();
                this.A1d = true;
                return;
            case 27:
                this.A0Q = ((Number) obj).longValue();
                this.A19 = true;
                return;
            case 30:
                this.A00 = ((Number) obj).doubleValue();
                this.A15 = true;
                return;
            case 31:
                this.A02 = ((Number) obj).doubleValue();
                this.A17 = true;
                return;
            case 32:
                this.A01 = ((Number) obj).doubleValue();
                this.A16 = true;
                return;
            case 33:
                this.A0U = (C176877tj) obj;
                this.A1X = true;
                return;
            case 34:
                this.A0T = (C176877tj) obj;
                this.A1T = true;
                return;
            case 35:
                this.A0V = (C176877tj) obj;
                this.A1g = true;
                return;
            case 36:
                this.A0S = (C176877tj) obj;
                this.A1L = true;
                return;
            case 37:
                this.A0Z = C9MX.A00((List) obj);
                this.A11 = true;
                return;
            case 38:
                this.A0a = C9MX.A00((List) obj);
                this.A1O = true;
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    this.A1o = new int[]{iArr[0], iArr[1]};
                    this.A1V = true;
                    return;
                }
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A0X = (String) obj;
                this.A18 = true;
                return;
            case 44:
                this.A0x = ((Boolean) obj).booleanValue();
                this.A0y = true;
                return;
            case 45:
                this.A0g = ((Boolean) obj).booleanValue();
                this.A0h = true;
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                this.A0P = ((Number) obj).longValue();
                this.A0z = true;
                return;
            case 47:
                this.A09 = ((Number) obj).intValue();
                this.A0u = true;
                return;
            case 48:
                this.A03 = ((Number) obj).floatValue();
                this.A0c = true;
                return;
            case 49:
                float[] fArr = (float[]) obj;
                if (fArr != null && fArr.length != 4) {
                    throw new IllegalArgumentException("Color Correction Gains invalid length");
                }
                this.A1m = fArr;
                this.A0q = true;
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                this.A07 = ((Number) obj).intValue();
                this.A0r = true;
                return;
            case 51:
                int[] iArr2 = (int[]) obj;
                if (iArr2 != null && iArr2.length != 18) {
                    throw new IllegalArgumentException("Color Correction Transform invalid length");
                }
                this.A1n = iArr2;
                this.A0s = true;
                return;
            case 52:
                this.A0v = true;
                return;
            case 53:
                this.A0i = ((Boolean) obj).booleanValue();
                this.A0j = true;
                return;
            case 54:
                this.A04 = ((Number) obj).floatValue();
                this.A1M = true;
                return;
            case 55:
                this.A0Y = (HashMap) obj;
                this.A0d = true;
                return;
            case 56:
                this.A0m = ((Boolean) obj).booleanValue();
                this.A0n = true;
                return;
            case 57:
                this.A1G = ((Boolean) obj).booleanValue();
                this.A1H = true;
                return;
            case 58:
                this.A0W = (C176877tj) obj;
                this.A1k = true;
                return;
            case 59:
                this.A0M = ((Number) obj).intValue();
                this.A1f = true;
                return;
            case 60:
                this.A1Y = ((Boolean) obj).booleanValue();
                this.A1Z = true;
                return;
            case 62:
                this.A0R = ((Number) obj).longValue();
                this.A1e = true;
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                this.A1A = ((Boolean) obj).booleanValue();
                this.A1B = true;
                return;
            case 64:
                this.A1C = ((Boolean) obj).booleanValue();
                this.A1D = true;
                return;
            case 65:
                this.A0G = ((Number) obj).intValue();
                this.A1N = true;
                return;
        }
    }
}
