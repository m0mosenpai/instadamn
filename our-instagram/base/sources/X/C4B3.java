package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;

/* renamed from: X.4B3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4B3 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
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
    public long A0K;
    public C4B5 A0L;
    public DrmInitData A0M;
    public Metadata A0N;
    public ColorInfo A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public List A0V;
    public byte[] A0W;

    public final void A00(DrmInitData drmInitData) {
        this.A0M = drmInitData;
        if (drmInitData != null && this.A05 == 0) {
            this.A05 = 2;
        }
    }

    public C4B3(C4B6 c4b6) {
        this.A0R = c4b6.A0T;
        this.A0S = c4b6.A0U;
        this.A0T = c4b6.A0V;
        this.A0F = c4b6.A0H;
        this.A0C = c4b6.A0E;
        this.A03 = c4b6.A04;
        this.A0B = c4b6.A0D;
        this.A0P = c4b6.A0R;
        this.A0N = c4b6.A0P;
        this.A0Q = c4b6.A0S;
        this.A0U = c4b6.A0W;
        this.A09 = c4b6.A0B;
        this.A0V = c4b6.A0X;
        this.A0M = c4b6.A0O;
        this.A0K = c4b6.A0M;
        this.A0J = c4b6.A0L;
        this.A08 = c4b6.A0A;
        this.A00 = c4b6.A01;
        this.A0D = c4b6.A0F;
        this.A01 = c4b6.A02;
        this.A0W = c4b6.A0Y;
        this.A0G = c4b6.A0I;
        this.A0O = c4b6.A0Q;
        this.A04 = c4b6.A06;
        this.A0E = c4b6.A0G;
        this.A0A = c4b6.A0C;
        this.A06 = c4b6.A08;
        this.A07 = c4b6.A09;
        this.A02 = c4b6.A03;
        this.A0H = c4b6.A0J;
        this.A0I = c4b6.A0K;
        this.A05 = c4b6.A07;
        this.A0L = c4b6.A0N;
    }

    public C4B3() {
        this.A03 = -1;
        this.A0B = -1;
        this.A09 = -1;
        this.A0K = Long.MAX_VALUE;
        this.A0J = -1;
        this.A08 = -1;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A0G = -1;
        this.A04 = -1;
        this.A0E = -1;
        this.A0A = -1;
        this.A02 = -1;
        this.A0H = -1;
        this.A0I = -1;
        this.A05 = 0;
        this.A0L = new C4B5(new C4B4());
    }
}
