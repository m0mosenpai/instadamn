package X;

import android.view.ViewGroup;

/* renamed from: X.2iJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56302iJ extends ViewGroup.MarginLayoutParams {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
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
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public int A0o;
    public int A0p;
    public int A0q;
    public int A0r;
    public int A0s;
    public int A0t;
    public int A0u;
    public int A0v;
    public int A0w;
    public C56082hw A0x;
    public String A0y;
    public String A0z;
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

    public final void A00() {
        this.A15 = false;
        this.A14 = true;
        this.A18 = true;
        int i = ((ViewGroup.LayoutParams) this).width;
        if (i == -2 && this.A11) {
            this.A14 = false;
            if (this.A0b == 0) {
                this.A0b = 1;
            }
        }
        int i2 = ((ViewGroup.LayoutParams) this).height;
        if (i2 == -2 && this.A10) {
            this.A18 = false;
            if (this.A0a == 0) {
                this.A0a = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A14 = false;
            if (i == 0 && this.A0b == 1) {
                ((ViewGroup.LayoutParams) this).width = -2;
                this.A11 = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A18 = false;
            if (i2 == 0 && this.A0a == 1) {
                ((ViewGroup.LayoutParams) this).height = -2;
                this.A10 = true;
            }
        }
        if (this.A02 != -1.0f || this.A0V != -1 || this.A0W != -1) {
            this.A15 = true;
            this.A14 = true;
            this.A18 = true;
            C56082hw c56082hw = this.A0x;
            if (!(c56082hw instanceof C3OH)) {
                c56082hw = new C3OH();
                this.A0x = c56082hw;
            }
            ((C3OH) c56082hw).A0c(this.A0g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56302iJ.resolveLayoutDirection(int):void");
    }

    public C56302iJ(C56302iJ source) {
        super((ViewGroup.MarginLayoutParams) source);
        this.A0V = -1;
        this.A0W = -1;
        this.A02 = -1.0f;
        this.A12 = true;
        this.A0Y = -1;
        this.A0Z = -1;
        this.A0p = -1;
        this.A0q = -1;
        this.A0u = -1;
        this.A0t = -1;
        this.A0G = -1;
        this.A0F = -1;
        this.A0C = -1;
        this.A0E = -1;
        this.A0D = -1;
        this.A0H = -1;
        this.A0I = 0;
        this.A00 = 0.0f;
        this.A0r = -1;
        this.A0s = -1;
        this.A0N = -1;
        this.A0M = -1;
        this.A0R = Integer.MIN_VALUE;
        this.A0U = Integer.MIN_VALUE;
        this.A0S = Integer.MIN_VALUE;
        this.A0P = Integer.MIN_VALUE;
        this.A0T = Integer.MIN_VALUE;
        this.A0Q = Integer.MIN_VALUE;
        this.A0O = Integer.MIN_VALUE;
        this.A0B = 0;
        this.A19 = true;
        this.A13 = true;
        this.A03 = 0.5f;
        this.A09 = 0.5f;
        this.A0z = null;
        this.A01 = 0.0f;
        this.A0J = 1;
        this.A04 = -1.0f;
        this.A0A = -1.0f;
        this.A0X = 0;
        this.A0v = 0;
        this.A0b = 0;
        this.A0a = 0;
        this.A0f = 0;
        this.A0e = 0;
        this.A0d = 0;
        this.A0c = 0;
        this.A06 = 1.0f;
        this.A05 = 1.0f;
        this.A0K = -1;
        this.A0L = -1;
        this.A0g = -1;
        this.A11 = false;
        this.A10 = false;
        this.A0y = null;
        this.A0w = 0;
        this.A14 = true;
        this.A18 = true;
        this.A17 = false;
        this.A15 = false;
        this.A16 = false;
        this.A0l = -1;
        this.A0m = -1;
        this.A0n = -1;
        this.A0o = -1;
        this.A0h = Integer.MIN_VALUE;
        this.A0i = Integer.MIN_VALUE;
        this.A08 = 0.5f;
        this.A0x = new C56082hw();
        this.A0V = source.A0V;
        this.A0W = source.A0W;
        this.A02 = source.A02;
        this.A12 = source.A12;
        this.A0Y = source.A0Y;
        this.A0Z = source.A0Z;
        this.A0p = source.A0p;
        this.A0q = source.A0q;
        this.A0u = source.A0u;
        this.A0t = source.A0t;
        this.A0G = source.A0G;
        this.A0F = source.A0F;
        this.A0C = source.A0C;
        this.A0E = source.A0E;
        this.A0D = source.A0D;
        this.A0H = source.A0H;
        this.A0I = source.A0I;
        this.A00 = source.A00;
        this.A0r = source.A0r;
        this.A0s = source.A0s;
        this.A0N = source.A0N;
        this.A0M = source.A0M;
        this.A0R = source.A0R;
        this.A0U = source.A0U;
        this.A0S = source.A0S;
        this.A0P = source.A0P;
        this.A0T = source.A0T;
        this.A0Q = source.A0Q;
        this.A0O = source.A0O;
        this.A0B = source.A0B;
        this.A03 = source.A03;
        this.A09 = source.A09;
        this.A0z = source.A0z;
        this.A01 = source.A01;
        this.A0J = source.A0J;
        this.A04 = source.A04;
        this.A0A = source.A0A;
        this.A0X = source.A0X;
        this.A0v = source.A0v;
        this.A11 = source.A11;
        this.A10 = source.A10;
        this.A0b = source.A0b;
        this.A0a = source.A0a;
        this.A0f = source.A0f;
        this.A0d = source.A0d;
        this.A0e = source.A0e;
        this.A0c = source.A0c;
        this.A06 = source.A06;
        this.A05 = source.A05;
        this.A0K = source.A0K;
        this.A0L = source.A0L;
        this.A0g = source.A0g;
        this.A14 = source.A14;
        this.A18 = source.A18;
        this.A17 = source.A17;
        this.A15 = source.A15;
        this.A0l = source.A0l;
        this.A0m = source.A0m;
        this.A0n = source.A0n;
        this.A0o = source.A0o;
        this.A0h = source.A0h;
        this.A0i = source.A0i;
        this.A08 = source.A08;
        this.A0y = source.A0y;
        this.A0w = source.A0w;
        this.A0x = source.A0x;
        this.A19 = source.A19;
        this.A13 = source.A13;
    }

    public C56302iJ(int width, int height) {
        super(width, height);
        this.A0V = -1;
        this.A0W = -1;
        this.A02 = -1.0f;
        this.A12 = true;
        this.A0Y = -1;
        this.A0Z = -1;
        this.A0p = -1;
        this.A0q = -1;
        this.A0u = -1;
        this.A0t = -1;
        this.A0G = -1;
        this.A0F = -1;
        this.A0C = -1;
        this.A0E = -1;
        this.A0D = -1;
        this.A0H = -1;
        this.A0I = 0;
        this.A00 = 0.0f;
        this.A0r = -1;
        this.A0s = -1;
        this.A0N = -1;
        this.A0M = -1;
        this.A0R = Integer.MIN_VALUE;
        this.A0U = Integer.MIN_VALUE;
        this.A0S = Integer.MIN_VALUE;
        this.A0P = Integer.MIN_VALUE;
        this.A0T = Integer.MIN_VALUE;
        this.A0Q = Integer.MIN_VALUE;
        this.A0O = Integer.MIN_VALUE;
        this.A0B = 0;
        this.A19 = true;
        this.A13 = true;
        this.A03 = 0.5f;
        this.A09 = 0.5f;
        this.A0z = null;
        this.A01 = 0.0f;
        this.A0J = 1;
        this.A04 = -1.0f;
        this.A0A = -1.0f;
        this.A0X = 0;
        this.A0v = 0;
        this.A0b = 0;
        this.A0a = 0;
        this.A0f = 0;
        this.A0e = 0;
        this.A0d = 0;
        this.A0c = 0;
        this.A06 = 1.0f;
        this.A05 = 1.0f;
        this.A0K = -1;
        this.A0L = -1;
        this.A0g = -1;
        this.A11 = false;
        this.A10 = false;
        this.A0y = null;
        this.A0w = 0;
        this.A14 = true;
        this.A18 = true;
        this.A17 = false;
        this.A15 = false;
        this.A16 = false;
        this.A0l = -1;
        this.A0m = -1;
        this.A0n = -1;
        this.A0o = -1;
        this.A0h = Integer.MIN_VALUE;
        this.A0i = Integer.MIN_VALUE;
        this.A08 = 0.5f;
        this.A0x = new C56082hw();
    }
}
