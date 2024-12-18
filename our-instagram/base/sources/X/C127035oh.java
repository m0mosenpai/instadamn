package X;

import android.text.Layout;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127035oh {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C126995od A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final int A07;

    public final void A0A(AnonymousClass585 anonymousClass585, C122215gH c122215gH, AbstractC119825bg abstractC119825bg, C122205gG c122205gG, long j) {
        anonymousClass585.ELZ();
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC122825hI interfaceC122825hI = ((C127045oi) list.get(i)).A06;
            C122815hH c122815hH = (C122815hH) interfaceC122825hI;
            C122605gv c122605gv = c122815hH.A02.A05;
            int i2 = c122605gv.A00;
            c122605gv.A02(j);
            c122605gv.A04(c122215gH);
            c122605gv.A06(c122205gG);
            c122605gv.A05(abstractC119825bg);
            c122605gv.A01(3);
            C122815hH.A00(anonymousClass585, c122815hH);
            c122605gv.A01(i2);
            anonymousClass585.F8X(0.0f, interfaceC122825hI.BDQ());
        }
        anonymousClass585.EKS();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pQ, java.lang.Object] */
    public final void A0B(float[] fArr, long j) {
        A00(this, C5C2.A01(j));
        A01(this, C5C2.A00(j));
        ?? obj = new Object();
        obj.A00 = 0;
        AbstractC136816Hk.A03(this.A04, new C29924DHm(j, fArr, obj, new Object(), 1), j);
    }

    public C127035oh(C126995od c126995od, int i, long j, boolean z) {
        boolean z2;
        C114205Dh c114205Dh;
        this.A03 = c126995od;
        this.A07 = i;
        if (Constraints.A03(j) == 0 && Constraints.A02(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List list = c126995od.A01;
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            float f = 0.0f;
            while (i2 < size) {
                C127025og c127025og = (C127025og) list.get(i2);
                InterfaceC122595gu interfaceC122595gu = c127025og.A02;
                int A01 = Constraints.A01(j);
                boolean A06 = Constraints.A06(j);
                int A00 = Constraints.A00(j);
                if (A06 && (A00 = A00 - ((int) Math.ceil(f))) < 0) {
                    A00 = 0;
                }
                long A04 = C5AU.A04(0, A01, 0, A00);
                int i4 = this.A07 - i3;
                C14360o3.A0C(interfaceC122595gu, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                C122815hH c122815hH = new C122815hH((C122585gt) interfaceC122595gu, i4, A04, z);
                float BDQ = f + c122815hH.BDQ();
                C122845hK c122845hK = c122815hH.A01;
                int i5 = c122845hK.A06 + i3;
                arrayList.add(new C127045oi(c122815hH, f, BDQ, c127025og.A01, c127025og.A00, i3, i5));
                if (!c122845hK.A0B) {
                    if (i5 == this.A07) {
                        C14360o3.A0B(this.A03.A01, 0);
                        if (i2 != r2.size() - 1) {
                        }
                    }
                    i2++;
                    i3 = i5;
                    f = BDQ;
                }
                i3 = i5;
                f = BDQ;
                z2 = true;
                break;
            }
            z2 = false;
            this.A00 = f;
            this.A02 = i3;
            this.A06 = z2;
            this.A04 = arrayList;
            this.A01 = Constraints.A01(j);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                C127045oi c127045oi = (C127045oi) arrayList.get(i6);
                List list2 = ((C122815hH) c127045oi.A06).A04;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C114205Dh c114205Dh2 = (C114205Dh) list2.get(i7);
                    if (c114205Dh2 != null) {
                        c114205Dh = c114205Dh2.A03(AbstractC119395aw.A00(0.0f, c127045oi.A01));
                    } else {
                        c114205Dh = null;
                    }
                    arrayList3.add(c114205Dh);
                }
                AnonymousClass016.A16(arrayList3, arrayList2);
            }
            if (arrayList2.size() < this.A03.A02.size()) {
                int size4 = this.A03.A02.size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList4.add(null);
                }
                arrayList2 = AbstractC001800i.A0S(arrayList4, arrayList2);
            }
            this.A05 = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public static final void A00(C127035oh c127035oh, int i) {
        if (i >= 0 && i < c127035oh.A03.A00.A00.length()) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0X("offset(", ") is out of bounds [0, ", ')', i, c127035oh.A03.A00.length()));
        }
    }

    public static final void A01(C127035oh c127035oh, int i) {
        if (i >= 0 && i <= c127035oh.A03.A00.A00.length()) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0X("offset(", ") is out of bounds [0, ", ']', i, c127035oh.A03.A00.length()));
        }
    }

    public static final void A02(C127035oh c127035oh, int i) {
        if (i >= 0 && i < c127035oh.A02) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0X("lineIndex(", ") is out of bounds [0, ", ')', i, c127035oh.A02));
        }
    }

    public final int A05(float f) {
        List list = this.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A00(list, f));
        if (c127045oi.A04 - c127045oi.A05 == 0) {
            return c127045oi.A03;
        }
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        float f2 = f - c127045oi.A01;
        C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
        return c122845hK.A09.getLineForVertical(((int) f2) - c122845hK.A07) + c127045oi.A03;
    }

    public final int A06(int i) {
        int A01;
        if (i >= this.A03.A00.length()) {
            List list = this.A04;
            C14360o3.A0B(list, 0);
            A01 = list.size() - 1;
        } else if (i < 0) {
            A01 = 0;
        } else {
            A01 = AbstractC136816Hk.A01(this.A04, i);
        }
        C127045oi c127045oi = (C127045oi) this.A04.get(A01);
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        return ((C122815hH) interfaceC122825hI).A01.A09.getLineForOffset(C17s.A03(i, i2, c127045oi.A04) - i2) + c127045oi.A03;
    }

    public final int A08(long j) {
        float f;
        List list = this.A04;
        float A02 = C119365at.A02(j);
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A00(list, A02));
        int i = c127045oi.A04;
        int i2 = c127045oi.A05;
        if (i - i2 != 0) {
            InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
            long A00 = AbstractC119395aw.A00(C119365at.A01(j), A02 - c127045oi.A01);
            C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
            int A022 = (int) C119365at.A02(A00);
            Layout layout = c122845hK.A09;
            int lineForVertical = layout.getLineForVertical(A022 - c122845hK.A07);
            float A01 = C119365at.A01(A00);
            if (lineForVertical == c122845hK.A06 - 1) {
                f = c122845hK.A02 + c122845hK.A03;
            } else {
                f = 0.0f;
            }
            return i2 + layout.getOffsetForHorizontal(lineForVertical, A01 + ((-1.0f) * f));
        }
        return i2;
    }

    public final long A09(C114205Dh c114205Dh, InterfaceC31100Dli interfaceC31100Dli, int i) {
        List list = this.A04;
        int A00 = AbstractC136816Hk.A00(list, c114205Dh.A03);
        float f = ((C127045oi) list.get(A00)).A00;
        float f2 = c114205Dh.A00;
        if (f < f2 && A00 != list.size() - 1) {
            int A002 = AbstractC136816Hk.A00(list, f2);
            long j = C5C2.A01;
            long j2 = j;
            while (j2 == j && A00 <= A002) {
                C127045oi c127045oi = (C127045oi) list.get(A00);
                j2 = c127045oi.A00(c127045oi.A06.Bk1(c114205Dh.A03(AbstractC119395aw.A00(0.0f, -c127045oi.A01)), interfaceC31100Dli, i), true);
                A00++;
            }
            if (j2 != j) {
                long j3 = j;
                while (j3 == j && A00 <= A002) {
                    C127045oi c127045oi2 = (C127045oi) list.get(A002);
                    j3 = c127045oi2.A00(c127045oi2.A06.Bk1(c114205Dh.A03(AbstractC119395aw.A00(0.0f, -c127045oi2.A01)), interfaceC31100Dli, i), true);
                    A002--;
                }
                if (j3 == j) {
                    return j2;
                }
                return C60Z.A00((int) (j2 >> 32), (int) (j3 & 4294967295L));
            }
            return j;
        }
        C127045oi c127045oi3 = (C127045oi) list.get(A00);
        return c127045oi3.A00(c127045oi3.A06.Bk1(c114205Dh.A03(AbstractC119395aw.A00(0.0f, -c127045oi3.A01)), interfaceC31100Dli, i), true);
    }

    public final float A03(int i) {
        A02(this, i);
        List list = this.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        return ((C122815hH) interfaceC122825hI).A01.A01(i - c127045oi.A03) + c127045oi.A01;
    }

    public final float A04(int i) {
        A02(this, i);
        List list = this.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        return ((C122815hH) interfaceC122825hI).A01.A02(i - c127045oi.A03) + c127045oi.A01;
    }

    public final int A07(int i, boolean z) {
        int A05;
        A02(this, i);
        List list = this.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = i - c127045oi.A03;
        C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
        if (z) {
            Layout layout = c122845hK.A09;
            if (layout.getEllipsisStart(i2) == 0) {
                C136826Hl c136826Hl = c122845hK.A00;
                if (c136826Hl == null) {
                    c136826Hl = new C136826Hl(layout);
                    c122845hK.A00 = c136826Hl;
                }
                Layout layout2 = c136826Hl.A01;
                A05 = C136826Hl.A00(c136826Hl, layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                A05 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            A05 = c122845hK.A05(i2);
        }
        return A05 + c127045oi.A05;
    }
}
