package X;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4W7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W7 {
    public android.net.Uri A00;
    public android.net.Uri A01;
    public Bundle A02;
    public Boolean A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public byte[] A0T;

    public final void A00(C4W6 c4w6) {
        CharSequence charSequence = c4w6.A0F;
        if (charSequence != null) {
            this.A0F = charSequence;
        }
        CharSequence charSequence2 = c4w6.A06;
        if (charSequence2 != null) {
            this.A06 = charSequence2;
        }
        CharSequence charSequence3 = c4w6.A05;
        if (charSequence3 != null) {
            this.A05 = charSequence3;
        }
        CharSequence charSequence4 = c4w6.A04;
        if (charSequence4 != null) {
            this.A04 = charSequence4;
        }
        CharSequence charSequence5 = c4w6.A0B;
        if (charSequence5 != null) {
            this.A0B = charSequence5;
        }
        CharSequence charSequence6 = c4w6.A0E;
        if (charSequence6 != null) {
            this.A0E = charSequence6;
        }
        CharSequence charSequence7 = c4w6.A0A;
        if (charSequence7 != null) {
            this.A0A = charSequence7;
        }
        android.net.Uri uri = c4w6.A01;
        if (uri != null) {
            this.A01 = uri;
        }
        byte[] bArr = c4w6.A0U;
        if (bArr != null) {
            Integer num = c4w6.A0H;
            this.A0T = (byte[]) bArr.clone();
            this.A0H = num;
        }
        android.net.Uri uri2 = c4w6.A00;
        if (uri2 != null) {
            this.A00 = uri2;
        }
        Integer num2 = c4w6.A0S;
        if (num2 != null) {
            this.A0S = num2;
        }
        Integer num3 = c4w6.A0R;
        if (num3 != null) {
            this.A0R = num3;
        }
        Integer num4 = c4w6.A0J;
        if (num4 != null) {
            this.A0J = num4;
        }
        Boolean bool = c4w6.A03;
        if (bool != null) {
            this.A03 = bool;
        }
        Integer num5 = c4w6.A0T;
        if (num5 != null) {
            this.A0M = num5;
        }
        Integer num6 = c4w6.A0M;
        if (num6 != null) {
            this.A0M = num6;
        }
        Integer num7 = c4w6.A0L;
        if (num7 != null) {
            this.A0L = num7;
        }
        Integer num8 = c4w6.A0K;
        if (num8 != null) {
            this.A0K = num8;
        }
        Integer num9 = c4w6.A0P;
        if (num9 != null) {
            this.A0P = num9;
        }
        Integer num10 = c4w6.A0O;
        if (num10 != null) {
            this.A0O = num10;
        }
        Integer num11 = c4w6.A0N;
        if (num11 != null) {
            this.A0N = num11;
        }
        CharSequence charSequence8 = c4w6.A0G;
        if (charSequence8 != null) {
            this.A0G = charSequence8;
        }
        CharSequence charSequence9 = c4w6.A08;
        if (charSequence9 != null) {
            this.A08 = charSequence9;
        }
        CharSequence charSequence10 = c4w6.A09;
        if (charSequence10 != null) {
            this.A09 = charSequence10;
        }
        Integer num12 = c4w6.A0I;
        if (num12 != null) {
            this.A0I = num12;
        }
        Integer num13 = c4w6.A0Q;
        if (num13 != null) {
            this.A0Q = num13;
        }
        CharSequence charSequence11 = c4w6.A0C;
        if (charSequence11 != null) {
            this.A0C = charSequence11;
        }
        CharSequence charSequence12 = c4w6.A07;
        if (charSequence12 != null) {
            this.A07 = charSequence12;
        }
        CharSequence charSequence13 = c4w6.A0D;
        if (charSequence13 != null) {
            this.A0D = charSequence13;
        }
        Bundle bundle = c4w6.A02;
        if (bundle != null) {
            this.A02 = bundle;
        }
    }

    public final void A01(byte[] bArr, int i) {
        if (this.A0T == null || Util.A0I(Integer.valueOf(i), 3) || !Util.A0I(this.A0H, 3)) {
            this.A0T = (byte[]) bArr.clone();
            this.A0H = Integer.valueOf(i);
        }
    }

    public C4W7(C4W6 c4w6) {
        this.A0F = c4w6.A0F;
        this.A06 = c4w6.A06;
        this.A05 = c4w6.A05;
        this.A04 = c4w6.A04;
        this.A0B = c4w6.A0B;
        this.A0E = c4w6.A0E;
        this.A0A = c4w6.A0A;
        this.A01 = c4w6.A01;
        this.A0T = c4w6.A0U;
        this.A0H = c4w6.A0H;
        this.A00 = c4w6.A00;
        this.A0S = c4w6.A0S;
        this.A0R = c4w6.A0R;
        this.A0J = c4w6.A0J;
        this.A03 = c4w6.A03;
        this.A0M = c4w6.A0M;
        this.A0L = c4w6.A0L;
        this.A0K = c4w6.A0K;
        this.A0P = c4w6.A0P;
        this.A0O = c4w6.A0O;
        this.A0N = c4w6.A0N;
        this.A0G = c4w6.A0G;
        this.A08 = c4w6.A08;
        this.A09 = c4w6.A09;
        this.A0I = c4w6.A0I;
        this.A0Q = c4w6.A0Q;
        this.A0C = c4w6.A0C;
        this.A07 = c4w6.A07;
        this.A0D = c4w6.A0D;
        this.A02 = c4w6.A02;
    }

    public C4W7() {
    }
}
