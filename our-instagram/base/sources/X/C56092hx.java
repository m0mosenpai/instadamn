package X;

import java.util.HashMap;

/* renamed from: X.2hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56092hx {
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
    public C56082hw A0G;
    public final HashMap A0H;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.CAW] */
    public final void A00(C56092hx c56092hx) {
        this.A01 = c56092hx.A01;
        this.A02 = c56092hx.A02;
        this.A03 = c56092hx.A03;
        this.A04 = c56092hx.A04;
        this.A05 = c56092hx.A05;
        this.A08 = c56092hx.A08;
        this.A09 = c56092hx.A09;
        this.A0A = c56092hx.A0A;
        this.A06 = c56092hx.A06;
        this.A07 = c56092hx.A07;
        this.A00 = c56092hx.A00;
        this.A0F = c56092hx.A0F;
        HashMap hashMap = this.A0H;
        hashMap.clear();
        for (CAW caw : c56092hx.A0H.values()) {
            String str = caw.A03;
            ?? obj = new Object();
            obj.A01 = Integer.MIN_VALUE;
            obj.A00 = Float.NaN;
            obj.A04 = null;
            obj.A03 = str;
            obj.A02 = caw.A02;
            obj.A01 = caw.A01;
            obj.A00 = caw.A00;
            obj.A04 = caw.A04;
            obj.A05 = caw.A05;
            hashMap.put(str, obj);
        }
    }

    public C56092hx(C56092hx c56092hx) {
        this.A0G = null;
        this.A0C = 0;
        this.A0E = 0;
        this.A0D = 0;
        this.A0B = 0;
        this.A01 = Float.NaN;
        this.A02 = Float.NaN;
        this.A03 = Float.NaN;
        this.A04 = Float.NaN;
        this.A05 = Float.NaN;
        this.A08 = Float.NaN;
        this.A09 = Float.NaN;
        this.A0A = Float.NaN;
        this.A06 = Float.NaN;
        this.A07 = Float.NaN;
        this.A00 = Float.NaN;
        this.A0F = 0;
        this.A0H = new HashMap();
        this.A0G = c56092hx.A0G;
        this.A0C = c56092hx.A0C;
        this.A0E = c56092hx.A0E;
        this.A0D = c56092hx.A0D;
        this.A0B = c56092hx.A0B;
        A00(c56092hx);
    }

    public C56092hx(C56082hw c56082hw) {
        this.A0G = null;
        this.A0C = 0;
        this.A0E = 0;
        this.A0D = 0;
        this.A0B = 0;
        this.A01 = Float.NaN;
        this.A02 = Float.NaN;
        this.A03 = Float.NaN;
        this.A04 = Float.NaN;
        this.A05 = Float.NaN;
        this.A08 = Float.NaN;
        this.A09 = Float.NaN;
        this.A0A = Float.NaN;
        this.A06 = Float.NaN;
        this.A07 = Float.NaN;
        this.A00 = Float.NaN;
        this.A0F = 0;
        this.A0H = new HashMap();
        this.A0G = c56082hw;
    }

    public C56092hx() {
        this.A0G = null;
        this.A0C = 0;
        this.A0E = 0;
        this.A0D = 0;
        this.A0B = 0;
        this.A01 = Float.NaN;
        this.A02 = Float.NaN;
        this.A03 = Float.NaN;
        this.A04 = Float.NaN;
        this.A05 = Float.NaN;
        this.A08 = Float.NaN;
        this.A09 = Float.NaN;
        this.A0A = Float.NaN;
        this.A06 = Float.NaN;
        this.A07 = Float.NaN;
        this.A00 = Float.NaN;
        this.A0F = 0;
        this.A0H = new HashMap();
    }
}
