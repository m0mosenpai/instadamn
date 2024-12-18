package X;

import android.os.SystemClock;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141596ac {
    public double A00;
    public double A01;
    public double A03;
    public double A04;
    public double A05;
    public float A0A;
    public float A0B;
    public int A0C;
    public int A0F;
    public int A0J;
    public int A0L;
    public int A0M;
    public long A0P;
    public long A0Q;
    public OIq A0R;
    public InterfaceC138906Qw A0S;
    public Float A0T;
    public Float A0U;
    public Integer A0V;
    public Integer A0X;
    public String A0Y;
    public Map A0Z;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0s;
    public boolean A0t;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public final Map A1H = new HashMap();
    public final Map A1G = new HashMap();
    public final Map A1F = new HashMap();
    public final Map A1I = new HashMap();
    public final List A1E = new ArrayList();
    public final List A1D = new ArrayList();
    public Integer A0W = C05F.A15;
    public int A0I = -1;
    public long A0N = -1;
    public long A0O = -1;
    public int A0D = 0;
    public double A02 = -1.0d;
    public boolean A0z = true;
    public boolean A0a = false;
    public boolean A0n = false;
    public boolean A12 = true;
    public boolean A10 = false;
    public boolean A11 = false;
    public boolean A13 = false;
    public boolean A0y = false;
    public final HashMap A1C = new HashMap();
    public boolean A0u = false;
    public int A0E = 0;
    public int A0H = 0;
    public boolean A0f = false;
    public boolean A0e = false;
    public boolean A0q = false;
    public boolean A0o = false;
    public boolean A0p = false;
    public int A0K = -1;
    public boolean A0r = false;
    public float A07 = -1.0f;
    public float A06 = -1.0f;
    public float A08 = -1.0f;
    public float A09 = -1.0f;
    public int A0G = 2;

    public static void A00(C141596ac c141596ac, int i) {
        int i2 = 0;
        while (true) {
            List list = c141596ac.A1E;
            if (i2 < list.size()) {
                InterfaceC143646e4 interfaceC143646e4 = (InterfaceC143646e4) ((Reference) list.get(i2)).get();
                if (interfaceC143646e4 != null) {
                    interfaceC143646e4.Dds(c141596ac, i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A01() {
        Integer num;
        this.A1H.clear();
        this.A1G.clear();
        this.A1F.clear();
        this.A1I.clear();
        this.A1D.clear();
        if (!this.A0u || (num = this.A0W) == C05F.A0Y || num == C05F.A00 || num == C05F.A01) {
            this.A0V = null;
        }
        this.A0W = C05F.A15;
        this.A0B = 0.0f;
        if (this.A1B) {
            A00(this, 1);
        }
        this.A1E.clear();
        this.A03 = 0.0d;
        this.A04 = 0.0d;
        this.A02 = -1.0d;
        this.A0J = 0;
        this.A0L = 0;
        this.A0P = 0L;
        this.A0Q = 0L;
        this.A00 = 0.0d;
        this.A01 = 0.0d;
        this.A05 = 0.0d;
        this.A0F = 0;
        this.A0l = false;
        this.A18 = false;
        this.A0m = false;
        this.A0T = null;
        this.A0U = null;
        this.A16 = false;
        this.A17 = false;
        this.A15 = false;
        this.A0f = false;
        this.A0e = false;
        this.A0E = 0;
        this.A0H = 0;
        this.A0o = false;
        this.A0p = false;
        this.A0X = null;
        this.A0K = -1;
        this.A0r = false;
        this.A07 = -1.0f;
        this.A06 = -1.0f;
        this.A0G = 2;
    }

    public final void A02(float f) {
        if (f != f || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            f = this.A0B;
        }
        this.A0B = f;
        A00(this, 1);
    }

    public final void A03(InterfaceC143646e4 interfaceC143646e4) {
        List list = this.A1E;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else if (obj == interfaceC143646e4) {
                return;
            }
        }
        list.add(new WeakReference(interfaceC143646e4));
    }

    public final void A04(InterfaceC143646e4 interfaceC143646e4) {
        Iterator it = this.A1E.iterator();
        while (it.hasNext()) {
            Object obj = ((Reference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else if (obj == interfaceC143646e4) {
                it.remove();
                return;
            }
        }
    }

    public final void A05(Integer num) {
        if (this.A0V != num) {
            this.A0V = num;
            A00(this, 8);
        }
    }

    public final void A06(String str) {
        Map map = this.A1H;
        int i = 1;
        if (map.containsKey(str)) {
            i = ((Number) map.get(str)).intValue() + 1;
        }
        map.put(str, Integer.valueOf(i));
    }

    public final void A07(boolean z) {
        if (this.A18 != z) {
            this.A18 = z;
            A00(this, 2);
        }
        if (z) {
            if (this.A01 == 0.0d) {
                if (this.A0P != 0) {
                    this.A01 = (SystemClock.uptimeMillis() - r3) / 1000.0d;
                }
            }
            if (this.A05 == 0.0d) {
                if (this.A0Q != 0) {
                    this.A05 = (SystemClock.uptimeMillis() - r3) / 1000.0d;
                }
            }
        }
    }

    public C141596ac(boolean z) {
        this.A1B = z;
    }
}
