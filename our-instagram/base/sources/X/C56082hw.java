package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56082hw {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
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
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public C56092hx A0Y;
    public C56112hz A0Z;
    public C56112hz A0a;
    public C56112hz A0b;
    public C56112hz A0c;
    public C56112hz A0d;
    public C56112hz A0e;
    public C56112hz A0f;
    public C56112hz A0g;
    public C56082hw A0h;
    public XPu A0i;
    public XPu A0j;
    public C5GA A0k;
    public C5GD A0l;
    public Object A0m;
    public String A0n;
    public String A0o;
    public ArrayList A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public float[] A0y;
    public int[] A0z;
    public int[] A10;
    public C56112hz[] A11;
    public C56082hw[] A12;
    public C56082hw[] A13;
    public Integer[] A14;
    public boolean[] A15;
    public boolean[] A16;

    public C56082hw(int i, int i2) {
        this.A0u = false;
        this.A0k = null;
        this.A0l = null;
        this.A15 = new boolean[]{true, true};
        this.A0t = true;
        this.A0T = -1;
        this.A0B = -1;
        this.A0Y = new C56092hx(this);
        this.A0v = false;
        this.A0w = false;
        this.A0r = false;
        this.A0x = false;
        this.A0D = -1;
        this.A0Q = -1;
        this.A0U = 0;
        this.A0H = 0;
        this.A0G = 0;
        this.A10 = new int[2];
        this.A0L = 0;
        this.A0J = 0;
        this.A04 = 1.0f;
        this.A0K = 0;
        this.A0I = 0;
        this.A03 = 1.0f;
        this.A0O = -1;
        this.A05 = 1.0f;
        this.A0z = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.A00 = 0.0f;
        this.A0q = false;
        this.A0s = false;
        this.A0E = 0;
        this.A0F = 0;
        C56112hz c56112hz = new C56112hz(EnumC56102hy.LEFT, this);
        this.A0e = c56112hz;
        C56112hz c56112hz2 = new C56112hz(EnumC56102hy.TOP, this);
        this.A0g = c56112hz2;
        C56112hz c56112hz3 = new C56112hz(EnumC56102hy.RIGHT, this);
        this.A0f = c56112hz3;
        C56112hz c56112hz4 = new C56112hz(EnumC56102hy.BOTTOM, this);
        this.A0a = c56112hz4;
        C56112hz c56112hz5 = new C56112hz(EnumC56102hy.BASELINE, this);
        this.A0Z = c56112hz5;
        this.A0c = new C56112hz(EnumC56102hy.CENTER_X, this);
        this.A0d = new C56112hz(EnumC56102hy.CENTER_Y, this);
        C56112hz c56112hz6 = new C56112hz(EnumC56102hy.CENTER, this);
        this.A0b = c56112hz6;
        this.A11 = new C56112hz[]{c56112hz, c56112hz3, c56112hz2, c56112hz4, c56112hz5, c56112hz6};
        this.A0p = new ArrayList();
        this.A16 = new boolean[2];
        Integer num = C05F.A00;
        this.A14 = new Integer[]{num, num};
        this.A0h = null;
        this.A01 = 0.0f;
        this.A09 = -1;
        this.A08 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0R = 0;
        this.A0n = null;
        this.A0C = 0;
        this.A0P = 0;
        this.A0y = new float[]{-1.0f, -1.0f};
        this.A12 = new C56082hw[]{null, null};
        this.A13 = new C56082hw[]{null, null};
        this.A07 = -1;
        this.A0X = -1;
        this.A0V = 0;
        this.A0W = 0;
        this.A0S = i;
        this.A0A = i2;
        A01();
    }

    public final void A0D() {
        this.A0v = false;
        this.A0w = false;
        this.A0r = false;
        this.A0x = false;
        ArrayList arrayList = this.A0p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C56112hz c56112hz = (C56112hz) arrayList.get(i);
            c56112hz.A06 = false;
            c56112hz.A00 = 0;
        }
    }

    public final void A0N(C56142i3 c56142i3, C56062hu c56062hu, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C3OL.A00(c56142i3, this, c56062hu);
                hashSet.remove(this);
                boolean z2 = false;
                if ((c56062hu.A01 & 64) == 64) {
                    z2 = true;
                }
                A0O(c56142i3, z2);
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet hashSet2 = this.A0e.A05;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C56112hz) it.next()).A08.A0N(c56142i3, c56062hu, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.A0f.A05;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C56112hz) it2.next()).A08.A0N(c56142i3, c56062hu, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.A0g.A05;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C56112hz) it3.next()).A08.A0N(c56142i3, c56062hu, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.A0a.A05;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C56112hz) it4.next()).A08.A0N(c56142i3, c56062hu, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.A0Z.A05;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C56112hz) it5.next()).A08.A0N(c56142i3, c56062hu, hashSet, i, true);
            }
        }
    }

    public final void A0T(StringBuilder sb) {
        String str;
        if (this instanceof C56062hu) {
            AbstractC56072hv abstractC56072hv = (AbstractC56072hv) this;
            sb.append(AnonymousClass001.A0R(abstractC56072hv.A0o, ":{\n"));
            sb.append(AnonymousClass001.A0O("  actualWidth:", abstractC56072hv.A0S));
            sb.append("\n");
            sb.append(AnonymousClass001.A0O("  actualHeight:", abstractC56072hv.A0A));
            sb.append("\n");
            Iterator it = abstractC56072hv.A00.iterator();
            while (it.hasNext()) {
                ((C56082hw) it.next()).A0T(sb);
                sb.append(",\n");
            }
            str = "}";
        } else {
            sb.append(AnonymousClass001.A0g("  ", this.A0o, ":{\n"));
            sb.append(AnonymousClass001.A0O("    actualWidth:", this.A0S));
            sb.append("\n");
            sb.append(AnonymousClass001.A0O("    actualHeight:", this.A0A));
            sb.append("\n");
            sb.append(AnonymousClass001.A0O("    actualLeft:", this.A0V));
            sb.append("\n");
            sb.append(AnonymousClass001.A0O("    actualTop:", this.A0W));
            sb.append("\n");
            A03(this.A0e, "left", sb);
            A03(this.A0g, "top", sb);
            A03(this.A0f, "right", sb);
            A03(this.A0a, "bottom", sb);
            A03(this.A0Z, "baseline", sb);
            A03(this.A0c, "centerX", sb);
            A03(this.A0d, "centerY", sb);
            int i = this.A0S;
            int i2 = this.A0N;
            int[] iArr = this.A0z;
            A04("    width", sb, this.A04, i, i2, iArr[0], this.A0L, this.A0H);
            A04("    height", sb, this.A03, this.A0A, this.A0M, iArr[1], this.A0K, this.A0G);
            float f = this.A01;
            int i3 = this.A09;
            if (f != 0.0f) {
                sb.append("    dimensionRatio");
                sb.append(" :  [");
                sb.append(f);
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                sb.append(i3);
                sb.append("");
                sb.append("],\n");
            }
            float f2 = this.A02;
            if (f2 != 0.5f) {
                sb.append("    horizontalBias");
                sb.append(" :   ");
                sb.append(f2);
                sb.append(",\n");
            }
            float f3 = this.A06;
            if (f3 != 0.5f) {
                sb.append("    verticalBias");
                sb.append(" :   ");
                sb.append(f3);
                sb.append(",\n");
            }
            A05("    horizontalChainStyle", sb, this.A0C, 0);
            A05("    verticalChainStyle", sb, this.A0P, 0);
            str = "  }";
        }
        sb.append(str);
    }

    public final boolean A0b(int i) {
        int i2;
        C56112hz c56112hz;
        if (i == 0) {
            i2 = 0;
            if (this.A0e.A04 != null) {
                i2 = 1;
            }
            c56112hz = this.A0f;
        } else {
            int i3 = 0;
            if (this.A0g.A04 != null) {
                i3 = 1;
            }
            int i4 = 0;
            if (this.A0a.A04 != null) {
                i4 = 1;
            }
            i2 = i3 + i4;
            c56112hz = this.A0Z;
        }
        C56112hz c56112hz2 = c56112hz.A04;
        int i5 = 0;
        if (c56112hz2 != null) {
            i5 = 1;
        }
        if (i2 + i5 < 2) {
            return true;
        }
        return false;
    }

    private void A01() {
        ArrayList arrayList = this.A0p;
        arrayList.add(this.A0e);
        arrayList.add(this.A0g);
        arrayList.add(this.A0f);
        arrayList.add(this.A0a);
        arrayList.add(this.A0c);
        arrayList.add(this.A0d);
        arrayList.add(this.A0b);
        arrayList.add(this.A0Z);
    }

    public static void A03(C56112hz c56112hz, String str, StringBuilder sb) {
        C56112hz c56112hz2 = c56112hz.A04;
        if (c56112hz2 != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(c56112hz2);
            sb.append("'");
            int i = c56112hz.A01;
            if (i != Integer.MIN_VALUE || c56112hz.A02 != 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                sb.append(c56112hz.A02);
                if (i != Integer.MIN_VALUE) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(i);
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public static void A05(String str, StringBuilder sb, int i, int i2) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    public final int A06() {
        if (this.A0R == 8) {
            return 0;
        }
        return this.A0A;
    }

    public final int A07() {
        if (this.A0R == 8) {
            return 0;
        }
        return this.A0S;
    }

    public final int A08() {
        C56082hw c56082hw = this.A0h;
        if (c56082hw != null && (c56082hw instanceof C56062hu)) {
            return ((C56062hu) c56082hw).A02 + this.A0V;
        }
        return this.A0V;
    }

    public final int A09() {
        C56082hw c56082hw = this.A0h;
        if (c56082hw != null && (c56082hw instanceof C56062hu)) {
            return ((C56062hu) c56082hw).A03 + this.A0W;
        }
        return this.A0W;
    }

    public void A0B() {
        this.A0e.A03();
        this.A0g.A03();
        this.A0f.A03();
        this.A0a.A03();
        this.A0Z.A03();
        this.A0c.A03();
        this.A0d.A03();
        this.A0b.A03();
        this.A0h = null;
        this.A00 = 0.0f;
        this.A0S = 0;
        this.A0A = 0;
        this.A01 = 0.0f;
        this.A09 = -1;
        this.A0V = 0;
        this.A0W = 0;
        this.A08 = 0;
        this.A0N = 0;
        this.A0M = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        Integer[] numArr = this.A14;
        Integer num = C05F.A00;
        numArr[0] = num;
        numArr[1] = num;
        this.A0m = null;
        this.A0R = 0;
        this.A0C = 0;
        this.A0P = 0;
        float[] fArr = this.A0y;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.A0D = -1;
        this.A0Q = -1;
        int[] iArr = this.A0z;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.A0H = 0;
        this.A0G = 0;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0J = Integer.MAX_VALUE;
        this.A0I = Integer.MAX_VALUE;
        this.A0L = 0;
        this.A0K = 0;
        this.A0O = -1;
        this.A05 = 1.0f;
        boolean[] zArr = this.A15;
        zArr[0] = true;
        zArr[1] = true;
        this.A0s = false;
        boolean[] zArr2 = this.A16;
        zArr2[0] = false;
        zArr2[1] = false;
        this.A0t = true;
        int[] iArr2 = this.A10;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.A0T = -1;
        this.A0B = -1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.5GA, X.5GB] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5GD, X.5GB] */
    public final void A0C() {
        if (this.A0k == null) {
            ?? c5gb = new C5GB(this);
            c5gb.A04.A06 = C05F.A0N;
            c5gb.A03.A06 = C05F.A0Y;
            c5gb.A01 = 0;
            this.A0k = c5gb;
        }
        if (this.A0l == null) {
            ?? c5gb2 = new C5GB(this);
            Y8R y8r = new Y8R(c5gb2);
            c5gb2.A00 = y8r;
            c5gb2.A01 = null;
            c5gb2.A04.A06 = C05F.A0j;
            c5gb2.A03.A06 = C05F.A0u;
            y8r.A06 = C05F.A15;
            c5gb2.A01 = 1;
            this.A0l = c5gb2;
        }
    }

    public final void A0E(float f, int i, int i2, int i3) {
        this.A0H = i;
        this.A0L = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A0J = i3;
        this.A04 = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.A0H = 2;
        }
    }

    public final void A0F(float f, int i, int i2, int i3) {
        this.A0G = i;
        this.A0K = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A0I = i3;
        this.A03 = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.A0G = 2;
        }
    }

    public final void A0G(int i) {
        this.A08 = i;
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        this.A0q = z;
    }

    public final void A0H(int i) {
        this.A0A = i;
        int i2 = this.A0M;
        if (i < i2) {
            this.A0A = i2;
        }
    }

    public final void A0I(int i) {
        this.A0S = i;
        int i2 = this.A0N;
        if (i < i2) {
            this.A0S = i2;
        }
    }

    public final void A0J(int i, int i2) {
        if (!this.A0v) {
            C56112hz c56112hz = this.A0e;
            c56112hz.A00 = i;
            c56112hz.A06 = true;
            C56112hz c56112hz2 = this.A0f;
            c56112hz2.A00 = i2;
            c56112hz2.A06 = true;
            this.A0V = i;
            this.A0S = i2 - i;
            this.A0v = true;
        }
    }

    public final void A0K(int i, int i2) {
        if (!this.A0w) {
            C56112hz c56112hz = this.A0g;
            c56112hz.A00 = i;
            c56112hz.A06 = true;
            C56112hz c56112hz2 = this.A0a;
            c56112hz2.A00 = i2;
            c56112hz2.A06 = true;
            this.A0W = i;
            this.A0A = i2 - i;
            if (this.A0q) {
                C56112hz c56112hz3 = this.A0Z;
                c56112hz3.A00 = i + this.A08;
                c56112hz3.A06 = true;
            }
            this.A0w = true;
        }
    }

    public void A0L(C56182i7 c56182i7) {
        this.A0e.A04();
        this.A0g.A04();
        this.A0f.A04();
        this.A0a.A04();
        this.A0Z.A04();
        this.A0b.A04();
        this.A0c.A04();
        this.A0d.A04();
    }

    public final void A0M(C56142i3 c56142i3) {
        c56142i3.A09(this.A0e);
        c56142i3.A09(this.A0g);
        c56142i3.A09(this.A0f);
        c56142i3.A09(this.A0a);
        if (this.A08 > 0) {
            c56142i3.A09(this.A0Z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r4 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d0, code lost:
    
        if (r2.A04 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0305, code lost:
    
        if (r9 == (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0307, code lost:
    
        r78 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0313, code lost:
    
        if ((r84 instanceof X.C56062hu) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05c4, code lost:
    
        if (r9 != 1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x02ee, code lost:
    
        if (r84.A0K == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05dd, code lost:
    
        if (r84.A0K > 0) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05df, code lost:
    
        r84.A05 = 1.0f / r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05cc, code lost:
    
        if (r6 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05d6, code lost:
    
        if (r14.A04 != null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05fa, code lost:
    
        if (r14.A04 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05e7, code lost:
    
        if (r13 == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0603, code lost:
    
        if (r25 == r6) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x061a, code lost:
    
        if (r12 != r11) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x061e, code lost:
    
        if (r24 != r6) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0620, code lost:
    
        r84.A0O = 1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0624, code lost:
    
        if (r13 != (-1)) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0626, code lost:
    
        r5 = 1.0f / r7;
        r84.A05 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x062b, code lost:
    
        r27 = (int) (r5 * r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0632, code lost:
    
        if (r8 == r11) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0634, code lost:
    
        r23 = false;
        r24 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05ff, code lost:
    
        if (r8 == r11) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r84.A0w != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        if (r84.A0w != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    /* JADX WARN: Type inference failed for: r5v61, types: [X.2iE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v64, types: [X.2iE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0O(X.C56142i3 r85, boolean r86) {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56082hw.A0O(X.2i3, boolean):void");
    }

    public void A0P(C56142i3 c56142i3, boolean z) {
        int i;
        int i2;
        int A00 = C56142i3.A00(this.A0e);
        int A002 = C56142i3.A00(this.A0g);
        int A003 = C56142i3.A00(this.A0f);
        int A004 = C56142i3.A00(this.A0a);
        if (z) {
            C5GA c5ga = this.A0k;
            if (c5ga != null) {
                Y8R y8r = c5ga.A04;
                if (y8r.A0B) {
                    Y8R y8r2 = c5ga.A03;
                    if (y8r2.A0B) {
                        A00 = y8r.A02;
                        A003 = y8r2.A02;
                    }
                }
            }
            C5GD c5gd = this.A0l;
            if (c5gd != null) {
                Y8R y8r3 = c5gd.A04;
                if (y8r3.A0B) {
                    Y8R y8r4 = c5gd.A03;
                    if (y8r4.A0B) {
                        A002 = y8r3.A02;
                        A004 = y8r4.A02;
                    }
                }
            }
        }
        int i3 = A004 - A002;
        if (A003 - A00 < 0 || i3 < 0 || A00 == Integer.MIN_VALUE || A00 == Integer.MAX_VALUE || A002 == Integer.MIN_VALUE || A002 == Integer.MAX_VALUE || A003 == Integer.MIN_VALUE || A003 == Integer.MAX_VALUE || A004 == Integer.MIN_VALUE || A004 == Integer.MAX_VALUE) {
            A004 = 0;
            A00 = 0;
            A002 = 0;
            A003 = 0;
        }
        int i4 = A003 - A00;
        int i5 = A004 - A002;
        this.A0V = A00;
        this.A0W = A002;
        if (this.A0R == 8) {
            this.A0S = 0;
            this.A0A = 0;
            return;
        }
        Integer[] numArr = this.A14;
        Integer num = numArr[0];
        Integer num2 = C05F.A00;
        if (num == num2 && i4 < (i2 = this.A0S)) {
            i4 = i2;
        }
        Integer num3 = numArr[1];
        if (num3 == num2 && i5 < (i = this.A0A)) {
            i5 = i;
        }
        this.A0S = i4;
        int i6 = i4;
        this.A0A = i5;
        int i7 = i5;
        int i8 = this.A0M;
        if (i5 < i8) {
            this.A0A = i8;
            i7 = i8;
        }
        int i9 = this.A0N;
        if (i4 < i9) {
            this.A0S = i9;
            i6 = i9;
        }
        int i10 = this.A0J;
        if (i10 > 0 && num == C05F.A0C) {
            i6 = Math.min(i6, i10);
            this.A0S = i6;
        }
        int i11 = this.A0I;
        if (i11 > 0 && num3 == C05F.A0C) {
            i7 = Math.min(i7, i11);
            this.A0A = i7;
        }
        if (i4 != i6) {
            this.A0T = i6;
        }
        if (i5 == i7) {
            return;
        }
        this.A0B = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(X.EnumC56102hy r12, X.EnumC56102hy r13, X.C56082hw r14, int r15) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56082hw.A0Q(X.2hy, X.2hy, X.2hw, int):void");
    }

    public final void A0S(C56112hz c56112hz, C56112hz c56112hz2, int i) {
        if (c56112hz.A08 == this) {
            A0Q(c56112hz.A07, c56112hz2.A07, c56112hz2.A08, i);
        }
    }

    public void A0U(boolean z, boolean z2) {
        int i;
        int i2;
        C5GA c5ga = this.A0k;
        boolean z3 = z & c5ga.A09;
        C5GD c5gd = this.A0l;
        boolean z4 = z2 & c5gd.A09;
        int i3 = c5ga.A04.A02;
        int i4 = c5gd.A04.A02;
        int i5 = c5ga.A03.A02;
        int i6 = c5gd.A03.A02;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.A0V = i3;
        }
        if (z4) {
            this.A0W = i4;
        }
        if (this.A0R == 8) {
            this.A0S = 0;
            this.A0A = 0;
            return;
        }
        if (z3) {
            if (this.A14[0] == C05F.A00 && i8 < (i2 = this.A0S)) {
                i8 = i2;
            }
            this.A0S = i8;
            int i10 = this.A0N;
            if (i8 < i10) {
                this.A0S = i10;
            }
        }
        if (!z4) {
            return;
        }
        if (this.A14[1] == C05F.A00 && i9 < (i = this.A0A)) {
            i9 = i;
        }
        this.A0A = i9;
        int i11 = this.A0M;
        if (i9 >= i11) {
            return;
        }
        this.A0A = i11;
    }

    public final boolean A0V() {
        if (!(this instanceof C3OH) && !(this instanceof C3O6) && this.A0R == 8) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        if (!this.A0v) {
            if (this.A0e.A06 && this.A0f.A06) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0X() {
        if (!this.A0w) {
            if (this.A0g.A06 && this.A0a.A06) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0Y() {
        C56112hz c56112hz = this.A0e;
        C56112hz c56112hz2 = c56112hz.A04;
        if (c56112hz2 == null || c56112hz2.A04 != c56112hz) {
            C56112hz c56112hz3 = this.A0f;
            C56112hz c56112hz4 = c56112hz3.A04;
            if (c56112hz4 != null && c56112hz4.A04 == c56112hz3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0Z() {
        C56112hz c56112hz = this.A0g;
        C56112hz c56112hz2 = c56112hz.A04;
        if (c56112hz2 == null || c56112hz2.A04 != c56112hz) {
            C56112hz c56112hz3 = this.A0a;
            C56112hz c56112hz4 = c56112hz3.A04;
            if (c56112hz4 != null && c56112hz4.A04 == c56112hz3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0a() {
        if (this.A0t && this.A0R != 8) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        String str2 = this.A0n;
        if (str2 != null) {
            str = AnonymousClass001.A0g("id: ", str2, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.A0V);
        sb.append(", ");
        sb.append(this.A0W);
        sb.append(") - (");
        sb.append(this.A0S);
        sb.append(" x ");
        sb.append(this.A0A);
        sb.append(")");
        return sb.toString();
    }

    private void A04(String str, StringBuilder sb, float f, int i, int i2, int i3, int i4, int i5) {
        sb.append(str);
        sb.append(" :  {\n");
        A05("      size", sb, i, 0);
        A05("      min", sb, i2, 0);
        A05("      max", sb, i3, Integer.MAX_VALUE);
        A05("      matchMin", sb, i4, 0);
        A05("      matchDef", sb, i5, 0);
        if (f != 1.0f) {
            sb.append("      matchPercent");
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
        sb.append("    },\n");
    }

    public C56112hz A0A(EnumC56102hy enumC56102hy) {
        switch (enumC56102hy.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.A0e;
            case 2:
                return this.A0g;
            case 3:
                return this.A0f;
            case 4:
                return this.A0a;
            case 5:
                return this.A0Z;
            case 6:
                return this.A0b;
            case 7:
                return this.A0c;
            case 8:
                return this.A0d;
            default:
                throw new AssertionError(enumC56102hy.name());
        }
    }

    public final void A0R(EnumC56102hy enumC56102hy, EnumC56102hy enumC56102hy2, C56082hw c56082hw, int i, int i2) {
        A0A(enumC56102hy).A06(c56082hw.A0A(enumC56102hy2), i, i2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c9, code lost:
    
        if ((r5 instanceof X.C3O6) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ce, code lost:
    
        if (r19 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e7, code lost:
    
        if (r11 == r43) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0255, code lost:
    
        if (r5 == r8) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02b2, code lost:
    
        if (r17 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02cc, code lost:
    
        if (r54 == 1) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02f0, code lost:
    
        if (r5 == r8) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r10 == 4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03be, code lost:
    
        if (r58 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(X.C56142i3 r41, X.C56152i4 r42, X.C56152i4 r43, X.C56112hz r44, X.C56112hz r45, java.lang.Integer r46, float r47, float r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64, boolean r65, boolean r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56082hw.A02(X.2i3, X.2i4, X.2i4, X.2hz, X.2hz, java.lang.Integer, float, float, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public C56082hw() {
        this.A0u = false;
        this.A0k = null;
        this.A0l = null;
        this.A15 = new boolean[]{true, true};
        this.A0t = true;
        this.A0T = -1;
        this.A0B = -1;
        this.A0Y = new C56092hx(this);
        this.A0v = false;
        this.A0w = false;
        this.A0r = false;
        this.A0x = false;
        this.A0D = -1;
        this.A0Q = -1;
        this.A0U = 0;
        this.A0H = 0;
        this.A0G = 0;
        this.A10 = new int[2];
        this.A0L = 0;
        this.A0J = 0;
        this.A04 = 1.0f;
        this.A0K = 0;
        this.A0I = 0;
        this.A03 = 1.0f;
        this.A0O = -1;
        this.A05 = 1.0f;
        this.A0z = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.A00 = 0.0f;
        this.A0q = false;
        this.A0s = false;
        this.A0E = 0;
        this.A0F = 0;
        C56112hz c56112hz = new C56112hz(EnumC56102hy.LEFT, this);
        this.A0e = c56112hz;
        C56112hz c56112hz2 = new C56112hz(EnumC56102hy.TOP, this);
        this.A0g = c56112hz2;
        C56112hz c56112hz3 = new C56112hz(EnumC56102hy.RIGHT, this);
        this.A0f = c56112hz3;
        C56112hz c56112hz4 = new C56112hz(EnumC56102hy.BOTTOM, this);
        this.A0a = c56112hz4;
        C56112hz c56112hz5 = new C56112hz(EnumC56102hy.BASELINE, this);
        this.A0Z = c56112hz5;
        this.A0c = new C56112hz(EnumC56102hy.CENTER_X, this);
        this.A0d = new C56112hz(EnumC56102hy.CENTER_Y, this);
        C56112hz c56112hz6 = new C56112hz(EnumC56102hy.CENTER, this);
        this.A0b = c56112hz6;
        this.A11 = new C56112hz[]{c56112hz, c56112hz3, c56112hz2, c56112hz4, c56112hz5, c56112hz6};
        this.A0p = new ArrayList();
        this.A16 = new boolean[2];
        Integer num = C05F.A00;
        this.A14 = new Integer[]{num, num};
        this.A0h = null;
        this.A0S = 0;
        this.A0A = 0;
        this.A01 = 0.0f;
        this.A09 = -1;
        this.A0V = 0;
        this.A0W = 0;
        this.A08 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0R = 0;
        this.A0n = null;
        this.A0C = 0;
        this.A0P = 0;
        this.A0y = new float[]{-1.0f, -1.0f};
        this.A12 = new C56082hw[]{null, null};
        this.A13 = new C56082hw[]{null, null};
        this.A07 = -1;
        this.A0X = -1;
        A01();
    }
}
