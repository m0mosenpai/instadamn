package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6IO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IO {
    public int A00;
    public C6O0 A01;
    public InterfaceC113445Ag A02;
    public final C18590vm A03;
    public final C18570vk A04;
    public final Modifier A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public static final void A01(C137076Il c137076Il, C6Ih c6Ih, int i) {
        long j;
        long j2;
        long j3;
        int i2 = 0;
        long BYb = c6Ih.BYb(0);
        if (c6Ih.Cfe()) {
            j2 = ((int) (BYb >> 32)) << 32;
            j3 = i;
            j = 4294967295L;
        } else {
            j = 4294967295L;
            j2 = i << 32;
            j3 = (int) (4294967295L & BYb);
        }
        long j4 = j2 | (j3 & j);
        C28373Cfb[] c28373CfbArr = c137076Il.A06;
        int length = c28373CfbArr.length;
        int i3 = 0;
        while (i2 < length) {
            C28373Cfb c28373Cfb = c28373CfbArr[i2];
            int i4 = i3 + 1;
            if (c28373Cfb != null) {
                c28373Cfb.A02 = C119235af.A01(j4, C119235af.A00(c6Ih.BYb(i3), BYb));
            }
            i2++;
            i3 = i4;
        }
    }

    public static final void A02(C6IO c6io, C6Ih c6Ih, boolean z) {
        Object A03 = c6io.A03.A03(c6Ih.getKey());
        C14360o3.A0A(A03);
        C28373Cfb[] c28373CfbArr = ((C137076Il) A03).A06;
        int length = c28373CfbArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C28373Cfb c28373Cfb = c28373CfbArr[i];
            int i3 = i2 + 1;
            if (c28373Cfb != null) {
                long BYb = c6Ih.BYb(i2);
                long j = c28373Cfb.A02;
                if (j != C28373Cfb.A0G && j != BYb) {
                    long A00 = C119235af.A00(BYb, j);
                    C5Y5 c5y5 = c28373Cfb.A03;
                    if (c5y5 != null) {
                        long A002 = C119235af.A00(((C119235af) c28373Cfb.A0C.getValue()).A00, A00);
                        C28373Cfb.A00(c28373Cfb, A002);
                        c28373Cfb.A0B.Egh(true);
                        c28373Cfb.A05 = z;
                        C19L c19l = c28373Cfb.A0E;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new C25585BSy(c28373Cfb, c5y5, A002, (InterfaceC23621Ds) null, 2), c19l);
                    }
                }
                c28373Cfb.A02 = BYb;
            }
            i++;
            i2 = i3;
        }
    }

    public static final void A03(C6IO c6io, Object obj) {
        C28373Cfb[] c28373CfbArr;
        C137076Il c137076Il = (C137076Il) c6io.A03.A07(obj);
        if (c137076Il != null && (c28373CfbArr = c137076Il.A06) != null) {
            for (C28373Cfb c28373Cfb : c28373CfbArr) {
                if (c28373Cfb != null) {
                    c28373Cfb.A03();
                }
            }
        }
    }

    public final long A04() {
        long j = 0;
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C28373Cfb c28373Cfb = (C28373Cfb) list.get(i);
            GraphicsLayer graphicsLayer = c28373Cfb.A04;
            if (graphicsLayer != null) {
                long j2 = c28373Cfb.A02;
                long j3 = graphicsLayer.A05;
                j = AbstractC119215ad.A00(Math.max((int) (j >> 32), ((int) (j2 >> 32)) + ((int) (j3 >> 32))), Math.max(C119055aN.A00(j), ((int) (j2 & 4294967295L)) + C119055aN.A00(j3)));
            }
        }
        return j;
    }

    public final C28373Cfb A05(Object obj, int i) {
        C28373Cfb[] c28373CfbArr;
        C137076Il c137076Il = (C137076Il) this.A03.A03(obj);
        if (c137076Il != null && (c28373CfbArr = c137076Il.A06) != null) {
            return c28373CfbArr[i];
        }
        return null;
    }

    public final void A06() {
        C18590vm c18590vm = this.A03;
        boolean z = false;
        if (c18590vm.A01 != 0) {
            z = true;
        }
        if (z) {
            Object[] objArr = c18590vm.A04;
            long[] jArr = c18590vm.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (C28373Cfb c28373Cfb : ((C137076Il) objArr[(i << 3) + i3]).A06) {
                                    if (c28373Cfb != null) {
                                        c28373Cfb.A03();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            c18590vm.A08();
        }
        this.A01 = C6O0.A00;
        this.A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r63 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03a9, code lost:
    
        if (r2 == r5.BHP(r4)) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        if (r11 != (-1)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C6O0 r50, X.InterfaceC137016Ie r51, X.C5BH r52, java.util.List r53, X.C19L r54, int r55, int r56, int r57, int r58, int r59, int r60, boolean r61, boolean r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6IO.A07(X.6O0, X.6Ie, X.5BH, java.util.List, X.19L, int, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    public C6IO() {
        long[] jArr = AbstractC004701m.A00;
        this.A03 = new C18590vm(6);
        C18570vk c18570vk = AbstractC004901o.A00;
        this.A04 = new C18570vk(6);
        this.A0A = new ArrayList();
        this.A09 = new ArrayList();
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A06 = new ArrayList();
        this.A05 = new LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(this);
    }

    public static final int A00(C6Ih c6Ih, int[] iArr) {
        int BL6 = c6Ih.BL6();
        int Bz0 = c6Ih.Bz0() + BL6;
        int i = 0;
        while (BL6 < Bz0) {
            int BPV = iArr[BL6] + c6Ih.BPV();
            iArr[BL6] = BPV;
            i = Math.max(i, BPV);
            BL6++;
        }
        return i;
    }
}
