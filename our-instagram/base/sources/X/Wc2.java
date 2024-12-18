package X;

import com.facebook.tigon.tigonhuc.HucClient;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes11.dex */
public final class Wc2 implements InterfaceC126705oA {
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public W5B A08;
    public C67741Ux9 A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final C97974ac A0J;
    public final ArrayDeque A0K;
    public final ArrayDeque A0L;
    public final ArrayList A0M;
    public final PriorityQueue A0N;
    public static final int[] A0Q = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0P = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0U = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] A0O = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0R = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0S = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0T = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] A0V = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    @Override // X.InterfaceC98604bf
    public final void release() {
    }

    private ArrayList A00() {
        ArrayList arrayList = this.A0M;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C4WQ A01 = ((W5B) arrayList.get(i2)).A01(Integer.MIN_VALUE);
            arrayList2.add(A01);
            if (A01 != null) {
                i = Math.min(i, A01.A07);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C4WQ c4wq = (C4WQ) arrayList2.get(i3);
            if (c4wq != null) {
                if (c4wq.A07 != i) {
                    c4wq = ((W5B) arrayList.get(i3)).A01(i);
                    c4wq.getClass();
                }
                arrayList3.add(c4wq);
            }
        }
        return arrayList3;
    }

    private void A01() {
        W5B w5b = this.A08;
        w5b.A00 = this.A02;
        w5b.A06.clear();
        w5b.A07.clear();
        w5b.A05.setLength(0);
        w5b.A03 = 15;
        w5b.A02 = 0;
        w5b.A04 = 0;
        ArrayList arrayList = this.A0M;
        arrayList.clear();
        arrayList.add(this.A08);
    }

    private void A02(int i) {
        int i2 = this.A02;
        if (i2 != i) {
            this.A02 = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.A0M;
                    if (i3 < arrayList.size()) {
                        ((W5B) arrayList.get(i3)).A00 = 3;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                A01();
                if (i2 == 3 || i == 1 || i == 0) {
                    this.A0A = Collections.emptyList();
                }
            }
        }
    }

    @Override // X.InterfaceC98604bf
    public final /* bridge */ /* synthetic */ Object AOr() {
        C4B8.A04(AbstractC25229BEm.A1Z(this.A09));
        ArrayDeque arrayDeque = this.A0K;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C67741Ux9 c67741Ux9 = (C67741Ux9) arrayDeque.pollFirst();
        this.A09 = c67741Ux9;
        return c67741Ux9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x028c, code lost:
    
        if (r0 != 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r1[r7] == false) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:186:0x0190. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:187:0x0193. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    @Override // X.InterfaceC98604bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object AOu() {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wc2.AOu():java.lang.Object");
    }

    @Override // X.InterfaceC98604bf
    public final /* bridge */ /* synthetic */ void E7b(Object obj) {
        AbstractCollection abstractCollection;
        C126715oB c126715oB = (C126715oB) obj;
        C4B8.A03(AbstractC167007dF.A1X(c126715oB, this.A09));
        C67741Ux9 c67741Ux9 = (C67741Ux9) c126715oB;
        if ((((AbstractC96104Tt) c67741Ux9).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            c67741Ux9.clear();
            abstractCollection = this.A0K;
        } else {
            long j = this.A07;
            this.A07 = 1 + j;
            C96094Ts c96094Ts = C96094Ts.$redex_init_class;
            c67741Ux9.A00 = j;
            abstractCollection = this.A0N;
        }
        abstractCollection.add(c67741Ux9);
        this.A09 = null;
    }

    @Override // X.InterfaceC98604bf
    public final void flush() {
        this.A07 = 0L;
        this.A06 = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.A0N;
            if (priorityQueue.isEmpty()) {
                break;
            }
            AbstractC96104Tt abstractC96104Tt = (AbstractC96104Tt) priorityQueue.poll();
            abstractC96104Tt.clear();
            this.A0K.add(abstractC96104Tt);
        }
        C67741Ux9 c67741Ux9 = this.A09;
        if (c67741Ux9 != null) {
            c67741Ux9.clear();
            this.A0K.add(c67741Ux9);
            this.A09 = null;
        }
        this.A0A = null;
        this.A0B = null;
        A02(0);
        this.A03 = 4;
        this.A08.A01 = 4;
        A01();
        this.A0C = false;
        this.A0E = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
        this.A04 = 0;
        this.A0D = true;
        this.A05 = -9223372036854775807L;
    }

    public Wc2(String str, int i) {
        this();
        this.A0J = new C97974ac();
        this.A0M = new ArrayList();
        this.A08 = new W5B(0, 4);
        this.A04 = 0;
        this.A0I = -9223372036854775807L;
        this.A0F = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        AbstractC46512Bo.A04("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                    } else {
                        this.A0G = 1;
                    }
                } else {
                    this.A0G = 0;
                }
                this.A0H = 1;
                A02(0);
                A01();
                this.A0D = true;
                this.A05 = -9223372036854775807L;
            }
            this.A0G = 1;
            this.A0H = 0;
            A02(0);
            A01();
            this.A0D = true;
            this.A05 = -9223372036854775807L;
        }
        this.A0G = 0;
        this.A0H = 0;
        A02(0);
        A01();
        this.A0D = true;
        this.A05 = -9223372036854775807L;
    }

    @Override // X.InterfaceC126705oA
    public final void EbA(long j) {
        this.A06 = j;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.UxA, java.lang.Object] */
    public Wc2() {
        this.A0K = new ArrayDeque();
        int i = 0;
        int i2 = 0;
        do {
            this.A0K.add(new C126715oB());
            i2++;
        } while (i2 < 10);
        this.A0L = new ArrayDeque();
        do {
            ArrayDeque arrayDeque = this.A0L;
            WbW wbW = new WbW(this);
            ?? obj = new Object();
            obj.A00 = wbW;
            arrayDeque.add(obj);
            i++;
        } while (i < 2);
        this.A0N = new PriorityQueue();
    }
}
