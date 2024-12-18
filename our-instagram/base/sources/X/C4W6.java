package X;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4W6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W6 {
    public static final C4W6 A0V = new C4W6(new Object());
    public final android.net.Uri A00;
    public final android.net.Uri A01;
    public final Bundle A02;
    public final Boolean A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;

    @Deprecated
    public final Integer A0T;
    public final byte[] A0U;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4W6 c4w6 = (C4W6) obj;
            if (!Util.A0I(this.A0F, c4w6.A0F) || !Util.A0I(this.A06, c4w6.A06) || !Util.A0I(this.A05, c4w6.A05) || !Util.A0I(this.A04, c4w6.A04) || !Util.A0I(this.A0B, c4w6.A0B) || !Util.A0I(this.A0E, c4w6.A0E) || !Util.A0I(this.A0A, c4w6.A0A) || !Util.A0I(this.A01, c4w6.A01) || !Arrays.equals(this.A0U, c4w6.A0U) || !Util.A0I(this.A0H, c4w6.A0H) || !Util.A0I(this.A00, c4w6.A00) || !Util.A0I(this.A0S, c4w6.A0S) || !Util.A0I(this.A0R, c4w6.A0R) || !Util.A0I(this.A0J, c4w6.A0J) || !Util.A0I(this.A03, c4w6.A03) || !Util.A0I(this.A0M, c4w6.A0M) || !Util.A0I(this.A0L, c4w6.A0L) || !Util.A0I(this.A0K, c4w6.A0K) || !Util.A0I(this.A0P, c4w6.A0P) || !Util.A0I(this.A0O, c4w6.A0O) || !Util.A0I(this.A0N, c4w6.A0N) || !Util.A0I(this.A0G, c4w6.A0G) || !Util.A0I(this.A08, c4w6.A08) || !Util.A0I(this.A09, c4w6.A09) || !Util.A0I(this.A0I, c4w6.A0I) || !Util.A0I(this.A0Q, c4w6.A0Q) || !Util.A0I(this.A0C, c4w6.A0C) || !Util.A0I(this.A07, c4w6.A07) || !Util.A0I(this.A0D, c4w6.A0D)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[31];
        System.arraycopy(new Object[]{this.A0F, this.A06, this.A05, this.A04, this.A0B, this.A0E, this.A0A, this.A01, null, null, Integer.valueOf(Arrays.hashCode(this.A0U)), this.A0H, this.A00, this.A0S, this.A0R, this.A0J, this.A03, this.A0M, this.A0L, this.A0K, this.A0P, this.A0O, this.A0N, this.A0G, this.A08, this.A09, this.A0I}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{this.A0Q, this.A0C, this.A07, this.A0D}, 0, objArr, 27, 4);
        return Arrays.hashCode(objArr);
    }

    public C4W6(C4W7 c4w7) {
        this.A0F = c4w7.A0F;
        this.A06 = c4w7.A06;
        this.A05 = c4w7.A05;
        this.A04 = c4w7.A04;
        this.A0B = c4w7.A0B;
        this.A0E = c4w7.A0E;
        this.A0A = c4w7.A0A;
        this.A01 = c4w7.A01;
        this.A0U = c4w7.A0T;
        this.A0H = c4w7.A0H;
        this.A00 = c4w7.A00;
        this.A0S = c4w7.A0S;
        this.A0R = c4w7.A0R;
        this.A0J = c4w7.A0J;
        this.A03 = c4w7.A03;
        Integer num = c4w7.A0M;
        this.A0T = num;
        this.A0M = num;
        this.A0L = c4w7.A0L;
        this.A0K = c4w7.A0K;
        this.A0P = c4w7.A0P;
        this.A0O = c4w7.A0O;
        this.A0N = c4w7.A0N;
        this.A0G = c4w7.A0G;
        this.A08 = c4w7.A08;
        this.A09 = c4w7.A09;
        this.A0I = c4w7.A0I;
        this.A0Q = c4w7.A0Q;
        this.A0C = c4w7.A0C;
        this.A07 = c4w7.A07;
        this.A0D = c4w7.A0D;
        this.A02 = c4w7.A02;
    }
}
