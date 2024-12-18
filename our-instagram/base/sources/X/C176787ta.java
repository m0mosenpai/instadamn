package X;

import android.graphics.Rect;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176787ta extends AbstractC176797tb implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C176877tj A02;
    public C176877tj A03;
    public C176877tj A04;
    public C176877tj A05;
    public C176877tj A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Double A0M;
    public Double A0N;
    public Double A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public String A0m;
    public HashMap A0n;
    public List A0o;
    public List A0p;
    public float[] A0q;
    public int[] A0r;
    public final int[] A0s = new int[2];
    public final AbstractC176767tY A0t;

    public final void A03(C176807tc c176807tc, Object obj) {
        int i = c176807tc.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 0:
                this.A0A = (Boolean) obj;
                return;
            case 1:
                this.A0L = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0t.A01(AbstractC176767tY.A0K)).booleanValue()) {
                    obj.getClass();
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    int i3 = 0;
                    if (booleanValue) {
                        i3 = 17;
                    }
                    A03(AbstractC176797tb.A0s, Integer.valueOf(i3));
                    if (booleanValue) {
                        A03(AbstractC176797tb.A0r, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0K = (Boolean) obj;
                return;
            case 4:
                this.A0H = (Boolean) obj;
                return;
            case 5:
                this.A0E = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 7:
            case 16:
            case 20:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 57:
            case 59:
            case 61:
            default:
                throw new RuntimeException(AnonymousClass001.A0O("Cannot directly set: ", i));
            case 8:
                this.A0J = (Boolean) obj;
                return;
            case 9:
                this.A0Y = (Integer) obj;
                return;
            case 10:
                obj.getClass();
                int intValue = ((Number) obj).intValue();
                if (intValue != -1) {
                    i2 = intValue;
                }
                this.A0X = Integer.valueOf(i2);
                return;
            case 11:
                this.A0S = (Integer) obj;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A0U = (Integer) obj;
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A0W = (Integer) obj;
                return;
            case 14:
                this.A0a = (Integer) obj;
                return;
            case Process.SIGTERM /* 15 */:
                this.A0b = (Integer) obj;
                return;
            case 17:
                this.A0e = (Integer) obj;
                return;
            case 18:
            case 52:
                return;
            case Process.SIGSTOP /* 19 */:
                this.A0f = (Integer) obj;
                return;
            case 21:
                this.A0d = (Integer) obj;
                return;
            case 22:
                this.A0Z = (Integer) obj;
                return;
            case 23:
                this.A0g = (Integer) obj;
                return;
            case 24:
                this.A0h = (Integer) obj;
                return;
            case 25:
                this.A0i = (Integer) obj;
                return;
            case 26:
                this.A0R = (Float) obj;
                return;
            case 27:
                this.A0k = (Long) obj;
                return;
            case 30:
                this.A0M = (Double) obj;
                return;
            case 31:
                this.A0O = (Double) obj;
                return;
            case 32:
                this.A0N = (Double) obj;
                return;
            case 33:
                C176877tj c176877tj = (C176877tj) obj;
                this.A04 = c176877tj;
                if (c176877tj != null) {
                    rect = new Rect(0, 0, c176877tj.A02, c176877tj.A01);
                }
                this.A01 = rect;
                return;
            case 34:
                C176877tj c176877tj2 = (C176877tj) obj;
                this.A03 = c176877tj2;
                if (c176877tj2 != null) {
                    rect = new Rect(0, 0, c176877tj2.A02, c176877tj2.A01);
                }
                this.A00 = rect;
                return;
            case 35:
                this.A05 = (C176877tj) obj;
                return;
            case 36:
                this.A02 = (C176877tj) obj;
                return;
            case 37:
                this.A0o = C9MX.A00((List) obj);
                return;
            case 38:
                this.A0p = C9MX.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0s;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                this.A0m = (String) obj;
                return;
            case 44:
                this.A0D = (Boolean) obj;
                return;
            case 45:
                this.A08 = (Boolean) obj;
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                this.A0j = (Long) obj;
                return;
            case 47:
                this.A0V = (Integer) obj;
                return;
            case 48:
                this.A0P = (Float) obj;
                return;
            case 49:
                this.A0q = (float[]) obj;
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                this.A0T = (Integer) obj;
                return;
            case 51:
                this.A0r = (int[]) obj;
                return;
            case 53:
                this.A09 = (Boolean) obj;
                return;
            case 54:
                this.A0Q = (Float) obj;
                return;
            case 55:
                this.A0n = (HashMap) obj;
                return;
            case 56:
                this.A0B = (Boolean) obj;
                return;
            case 58:
                this.A06 = (C176877tj) obj;
                return;
            case 60:
                this.A0I = (Boolean) obj;
                return;
            case 62:
                this.A0l = (Long) obj;
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                this.A0F = (Boolean) obj;
                return;
            case 64:
                this.A0G = (Boolean) obj;
                return;
            case 65:
                this.A0c = (Integer) obj;
                return;
        }
    }

    public final boolean A04(C177007tw c177007tw) {
        boolean z;
        if (c177007tw.A10) {
            A03(AbstractC176797tb.A0B, Integer.valueOf(c177007tw.A0B));
            z = true;
        } else {
            z = false;
        }
        if (c177007tw.A0w) {
            A03(AbstractC176797tb.A09, Integer.valueOf(c177007tw.A0A));
            z = true;
        }
        if (c177007tw.A1F) {
            A03(AbstractC176797tb.A0W, Boolean.valueOf(c177007tw.A1E));
            z = true;
        }
        if (c177007tw.A1i) {
            A03(AbstractC176797tb.A0Z, Boolean.valueOf(c177007tw.A1h));
            z = true;
        }
        if (c177007tw.A1Z) {
            A03(AbstractC176797tb.A0Y, Boolean.valueOf(c177007tw.A1Y));
            z = true;
        }
        if (c177007tw.A1Q) {
            A03(AbstractC176797tb.A0X, Boolean.valueOf(c177007tw.A1P));
            z = true;
        }
        if (c177007tw.A1b) {
            A03(AbstractC176797tb.A0r, Boolean.valueOf(c177007tw.A1a));
            z = true;
        }
        if (c177007tw.A0l) {
            A03(AbstractC176797tb.A0P, Boolean.valueOf(c177007tw.A0k));
            z = true;
        }
        if (c177007tw.A0p) {
            A03(AbstractC176797tb.A0R, Boolean.valueOf(c177007tw.A0o));
            z = true;
        }
        if (c177007tw.A1W) {
            A03(AbstractC176797tb.A0o, Integer.valueOf(c177007tw.A0K));
            z = true;
        }
        if (c177007tw.A1V) {
            A03(AbstractC176797tb.A0n, c177007tw.A1o);
            z = true;
        }
        if (c177007tw.A12) {
            A03(AbstractC176797tb.A0D, Integer.valueOf(c177007tw.A0C));
            z = true;
        }
        if (c177007tw.A0j) {
            A03(AbstractC176797tb.A0O, Boolean.valueOf(c177007tw.A0i));
            z = true;
        }
        if (c177007tw.A1M) {
            A03(AbstractC176797tb.A0d, Float.valueOf(c177007tw.A04));
            z = true;
        }
        if (c177007tw.A14) {
            A03(AbstractC176797tb.A0U, Boolean.valueOf(c177007tw.A13));
            z = true;
        }
        if (c177007tw.A0f) {
            A03(AbstractC176797tb.A0M, Boolean.valueOf(c177007tw.A0e));
            z = true;
        }
        if (c177007tw.A0d) {
            A03(AbstractC176797tb.A02, c177007tw.A0Y);
            z = true;
        }
        if (c177007tw.A1j) {
            A03(AbstractC176797tb.A0z, Integer.valueOf(c177007tw.A0N));
            z = true;
        }
        if (c177007tw.A0b) {
            A03(AbstractC176797tb.A00, Integer.valueOf(c177007tw.A06));
            z = true;
        }
        if (c177007tw.A0t) {
            A03(AbstractC176797tb.A07, Integer.valueOf(c177007tw.A08));
            z = true;
        }
        if (c177007tw.A1J) {
            A03(AbstractC176797tb.A0a, Integer.valueOf(c177007tw.A0E));
            z = true;
        }
        if (c177007tw.A1K) {
            A03(AbstractC176797tb.A0b, Integer.valueOf(c177007tw.A0F));
            z = true;
        }
        if (c177007tw.A1L) {
            A03(AbstractC176797tb.A0c, c177007tw.A0S);
            z = true;
        }
        if (c177007tw.A1S) {
            A03(AbstractC176797tb.A0i, Integer.valueOf(c177007tw.A0I));
            z = true;
        }
        if (c177007tw.A1R) {
            A03(AbstractC176797tb.A0g, Integer.valueOf(c177007tw.A0H));
            z = true;
        }
        if (c177007tw.A1I) {
            A03(AbstractC176797tb.A0L, Integer.valueOf(c177007tw.A0D));
            z = true;
        }
        if (c177007tw.A0z) {
            A03(AbstractC176797tb.A0A, Long.valueOf(c177007tw.A0P));
            z = true;
        }
        if (c177007tw.A0u) {
            A03(AbstractC176797tb.A08, Integer.valueOf(c177007tw.A09));
            z = true;
        }
        if (c177007tw.A0c) {
            A03(AbstractC176797tb.A01, Float.valueOf(c177007tw.A03));
            z = true;
        }
        if (c177007tw.A0q) {
            A03(AbstractC176797tb.A04, c177007tw.A1m);
            z = true;
        }
        if (c177007tw.A0r) {
            A03(AbstractC176797tb.A05, Integer.valueOf(c177007tw.A07));
            z = true;
        }
        if (c177007tw.A0s) {
            A03(AbstractC176797tb.A06, c177007tw.A1n);
            z = true;
        }
        if (c177007tw.A1c) {
            A03(AbstractC176797tb.A0s, Integer.valueOf(c177007tw.A0L));
            z = true;
        }
        if (c177007tw.A1l) {
            A03(AbstractC176797tb.A11, Integer.valueOf(c177007tw.A0O));
            z = true;
        }
        if (c177007tw.A1d) {
            A03(AbstractC176797tb.A0t, Float.valueOf(c177007tw.A05));
            z = true;
        }
        if (c177007tw.A19) {
            A03(AbstractC176797tb.A0I, Long.valueOf(c177007tw.A0Q));
            z = true;
        }
        if (c177007tw.A15) {
            A03(AbstractC176797tb.A0E, Double.valueOf(c177007tw.A00));
            z = true;
        }
        if (c177007tw.A17) {
            A03(AbstractC176797tb.A0G, Double.valueOf(c177007tw.A02));
            z = true;
        }
        if (c177007tw.A16) {
            A03(AbstractC176797tb.A0F, Double.valueOf(c177007tw.A01));
            z = true;
        }
        if (c177007tw.A18) {
            A03(AbstractC176797tb.A0H, c177007tw.A0X);
            z = true;
        }
        if (c177007tw.A11) {
            A03(AbstractC176797tb.A0C, c177007tw.A0Z);
            z = true;
        }
        if (c177007tw.A1O) {
            A03(AbstractC176797tb.A0f, c177007tw.A0a);
            z = true;
        }
        if (c177007tw.A1X) {
            A03(AbstractC176797tb.A0q, c177007tw.A0U);
            z = true;
        }
        if (c177007tw.A1T) {
            A03(AbstractC176797tb.A0k, c177007tw.A0T);
            z = true;
        }
        if (c177007tw.A1k) {
            A03(AbstractC176797tb.A10, c177007tw.A0W);
            z = true;
        }
        if (c177007tw.A1g) {
            A03(AbstractC176797tb.A0y, c177007tw.A0V);
            z = true;
        }
        if (c177007tw.A0y) {
            A03(AbstractC176797tb.A0S, Boolean.valueOf(c177007tw.A0x));
            z = true;
        }
        if (c177007tw.A0h) {
            A03(AbstractC176797tb.A0N, Boolean.valueOf(c177007tw.A0g));
            z = true;
        }
        if (c177007tw.A0v) {
            A03(AbstractC176797tb.A0l, null);
            z = true;
        }
        if (c177007tw.A0n) {
            A03(AbstractC176797tb.A0Q, Boolean.valueOf(c177007tw.A0m));
            z = true;
        }
        if (c177007tw.A1N) {
            A03(AbstractC176797tb.A0e, Integer.valueOf(c177007tw.A0G));
            z = true;
        }
        if (c177007tw.A1e) {
            A03(AbstractC176797tb.A0v, Long.valueOf(c177007tw.A0R));
            z = true;
        }
        if (c177007tw.A1B) {
            A03(AbstractC176797tb.A0J, Boolean.valueOf(c177007tw.A1A));
            z = true;
        }
        if (c177007tw.A1D) {
            A03(AbstractC176797tb.A0K, Boolean.valueOf(c177007tw.A1C));
            return true;
        }
        return z;
    }

    public C176787ta(AbstractC176767tY abstractC176767tY) {
        List list = Collections.EMPTY_LIST;
        this.A0o = list;
        this.A0p = list;
        this.A0X = 0;
        this.A0i = 0;
        this.A0R = Float.valueOf(-1.0f);
        this.A0W = 0;
        this.A0K = false;
        this.A0H = false;
        this.A0I = false;
        this.A0J = false;
        this.A0A = false;
        this.A0L = false;
        this.A0E = false;
        this.A07 = false;
        this.A0n = new HashMap();
        this.A0D = false;
        this.A08 = true;
        this.A0Y = 0;
        this.A0h = -1;
        this.A0S = 0;
        this.A0U = 0;
        this.A0a = 0;
        this.A0b = 0;
        this.A0e = 0;
        this.A0f = 0;
        this.A0d = 0;
        this.A0Z = 0;
        this.A0j = 0L;
        Float valueOf = Float.valueOf(0.0f);
        this.A0P = valueOf;
        this.A0T = 1;
        this.A0g = 0;
        this.A0V = 1;
        this.A0k = 0L;
        Double valueOf2 = Double.valueOf(0.0d);
        this.A0M = valueOf2;
        this.A0O = valueOf2;
        this.A0N = valueOf2;
        this.A0m = "";
        this.A09 = true;
        this.A0Q = valueOf;
        this.A0B = false;
        this.A0c = 0;
        this.A0C = false;
        this.A0t = abstractC176767tY;
    }

    public final Object clone() {
        return super.clone();
    }
}
