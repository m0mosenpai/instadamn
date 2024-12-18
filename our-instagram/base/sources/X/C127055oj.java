package X;

import android.graphics.RectF;
import android.text.Layout;
import java.util.List;

/* renamed from: X.5oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127055oj {
    public final float A00;
    public final float A01;
    public final long A02;
    public final C127035oh A03;
    public final C126985oc A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127055oj) {
                C127055oj c127055oj = (C127055oj) obj;
                if (!C14360o3.A0K(this.A04, c127055oj.A04) || !C14360o3.A0K(this.A03, c127055oj.A03) || this.A02 != c127055oj.A02 || this.A00 != c127055oj.A00 || this.A01 != c127055oj.A01 || !C14360o3.A0K(this.A05, c127055oj.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(int i) {
        float f;
        C127035oh c127035oh = this.A03;
        C127035oh.A02(c127035oh, i);
        List list = c127035oh.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = i - c127045oi.A03;
        C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
        float lineLeft = c122845hK.A09.getLineLeft(i2);
        if (i2 == c122845hK.A06 - 1) {
            f = c122845hK.A02;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float A01(int i) {
        float f;
        C127035oh c127035oh = this.A03;
        C127035oh.A02(c127035oh, i);
        List list = c127035oh.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = i - c127045oi.A03;
        C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
        float lineRight = c122845hK.A09.getLineRight(i2);
        if (i2 == c122845hK.A06 - 1) {
            f = c122845hK.A03;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final float A02(int i, boolean z) {
        int A01;
        C127035oh c127035oh = this.A03;
        C127035oh.A01(c127035oh, i);
        int length = c127035oh.A03.A00.length();
        List list = c127035oh.A04;
        if (i == length) {
            C14360o3.A0B(list, 0);
            A01 = list.size() - 1;
        } else {
            A01 = AbstractC136816Hk.A01(list, i);
        }
        C127045oi c127045oi = (C127045oi) list.get(A01);
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        int A03 = C17s.A03(i, i2, c127045oi.A04) - i2;
        C122845hK c122845hK = ((C122815hH) interfaceC122825hI).A01;
        if (z) {
            return c122845hK.A03(A03, false);
        }
        return c122845hK.A04(A03, false);
    }

    public final int A03(int i) {
        C127035oh c127035oh = this.A03;
        C127035oh.A02(c127035oh, i);
        List list = c127035oh.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A02(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        return ((C122815hH) interfaceC122825hI).A01.A09.getLineStart(i - c127045oi.A03) + c127045oi.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (X.C63297Sgy.A02(r5, r2) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (X.C63297Sgy.A02(r5, r2) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
    
        if (X.C63297Sgy.A01(r5, r2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (X.C63297Sgy.A01(r5, r2) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A04(int r8) {
        /*
            r7 = this;
            X.5oh r1 = r7.A03
            X.C127035oh.A01(r1, r8)
            X.5od r0 = r1.A03
            X.5C8 r0 = r0.A00
            int r0 = r0.length()
            java.util.List r1 = r1.A04
            if (r8 != r0) goto Ldb
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L1b:
            java.lang.Object r3 = r1.get(r0)
            X.5oi r3 = (X.C127045oi) r3
            X.5hI r4 = r3.A06
            int r1 = r3.A05
            int r0 = r3.A04
            int r2 = X.C17s.A03(r8, r1, r0)
            int r2 = r2 - r1
            X.5hH r4 = (X.C122815hH) r4
            X.5hK r0 = r4.A01
            X.Sgy r5 = r0.A06()
            r6 = r2
            X.C63297Sgy.A00(r5, r2)
            java.text.BreakIterator r4 = r5.A00
            int r0 = r4.preceding(r2)
            boolean r0 = r5.A04(r0)
            r1 = r2
            if (r0 == 0) goto Lba
            X.C63297Sgy.A00(r5, r2)
        L48:
            r0 = -1
            if (r1 == r0) goto L5b
            boolean r0 = r5.A04(r1)
            if (r0 == 0) goto Lb2
            boolean r0 = r5.A03(r1)
            if (r0 != 0) goto Lb2
        L57:
            r0 = -1
            if (r1 == r0) goto L5b
            r6 = r1
        L5b:
            X.C63297Sgy.A00(r5, r2)
            int r0 = r4.following(r2)
            boolean r0 = r5.A03(r0)
            r1 = r2
            if (r0 == 0) goto L91
            X.C63297Sgy.A00(r5, r2)
        L6c:
            r0 = -1
            if (r1 == r0) goto L7f
            boolean r0 = r5.A04(r1)
            if (r0 != 0) goto L89
            boolean r0 = r5.A03(r1)
            if (r0 == 0) goto L89
        L7b:
            r0 = -1
            if (r1 == r0) goto L7f
            r2 = r1
        L7f:
            long r1 = X.C60Z.A00(r6, r2)
            r0 = 0
            long r0 = r3.A00(r1, r0)
            return r0
        L89:
            X.C63297Sgy.A00(r5, r1)
            int r1 = r4.following(r1)
            goto L6c
        L91:
            X.C63297Sgy.A00(r5, r2)
            boolean r0 = X.C63297Sgy.A01(r5, r2)
            if (r0 == 0) goto Lab
            boolean r0 = r4.isBoundary(r2)
            if (r0 == 0) goto La6
            boolean r0 = X.C63297Sgy.A02(r5, r2)
            if (r0 == 0) goto L7b
        La6:
            int r1 = r4.following(r2)
            goto L7b
        Lab:
            boolean r0 = X.C63297Sgy.A02(r5, r2)
            if (r0 == 0) goto L7f
            goto La6
        Lb2:
            X.C63297Sgy.A00(r5, r1)
            int r1 = r4.preceding(r1)
            goto L48
        Lba:
            X.C63297Sgy.A00(r5, r2)
            boolean r0 = X.C63297Sgy.A02(r5, r2)
            if (r0 == 0) goto Ld4
            boolean r0 = r4.isBoundary(r2)
            if (r0 == 0) goto Lcf
            boolean r0 = X.C63297Sgy.A01(r5, r2)
            if (r0 == 0) goto L57
        Lcf:
            int r1 = r4.preceding(r2)
            goto L57
        Ld4:
            boolean r0 = X.C63297Sgy.A01(r5, r2)
            if (r0 == 0) goto L5b
            goto Lcf
        Ldb:
            int r0 = X.AbstractC136816Hk.A01(r1, r8)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127055oj.A04(int):long");
    }

    public final C114205Dh A05(int i) {
        float A04;
        float A042;
        C127035oh c127035oh = this.A03;
        C127035oh.A00(c127035oh, i);
        List list = c127035oh.A04;
        C127045oi c127045oi = (C127045oi) list.get(AbstractC136816Hk.A01(list, i));
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        int A03 = C17s.A03(i, i2, c127045oi.A04) - i2;
        C122815hH c122815hH = (C122815hH) interfaceC122825hI;
        if (A03 >= 0 && A03 < c122815hH.A03.length()) {
            C122845hK c122845hK = c122815hH.A01;
            Layout layout = c122845hK.A09;
            int lineForOffset = layout.getLineForOffset(A03);
            float A02 = c122845hK.A02(lineForOffset);
            float A01 = c122845hK.A01(lineForOffset);
            boolean z = false;
            if (layout.getParagraphDirection(lineForOffset) == 1) {
                z = true;
            }
            boolean isRtlCharAt = layout.isRtlCharAt(A03);
            if (z) {
                if (!isRtlCharAt) {
                    A04 = c122845hK.A03(A03, false);
                    A042 = c122845hK.A03(A03 + 1, true);
                } else {
                    A042 = c122845hK.A04(A03, false);
                    A04 = c122845hK.A04(A03 + 1, true);
                }
            } else if (isRtlCharAt) {
                A042 = c122845hK.A03(A03, false);
                A04 = c122845hK.A03(A03 + 1, true);
            } else {
                A04 = c122845hK.A04(A03, false);
                A042 = c122845hK.A04(A03 + 1, true);
            }
            RectF rectF = new RectF(A04, A02, A042, A01);
            return new C114205Dh(rectF.left, rectF.top, rectF.right, rectF.bottom).A03(AbstractC119395aw.A00(0.0f, c127045oi.A01));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("offset(", ") is out of bounds [0,", ')', A03, c122815hH.A03.length()));
    }

    public final C114205Dh A06(int i) {
        int A01;
        C127035oh c127035oh = this.A03;
        C127035oh.A01(c127035oh, i);
        int length = c127035oh.A03.A00.length();
        List list = c127035oh.A04;
        if (i == length) {
            C14360o3.A0B(list, 0);
            A01 = list.size() - 1;
        } else {
            A01 = AbstractC136816Hk.A01(list, i);
        }
        C127045oi c127045oi = (C127045oi) list.get(A01);
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        int A03 = C17s.A03(i, i2, c127045oi.A04) - i2;
        C122815hH c122815hH = (C122815hH) interfaceC122825hI;
        if (A03 >= 0 && A03 <= c122815hH.A03.length()) {
            C122845hK c122845hK = c122815hH.A01;
            float A032 = c122845hK.A03(A03, false);
            int lineForOffset = c122845hK.A09.getLineForOffset(A03);
            return new C114205Dh(A032, c122845hK.A02(lineForOffset), A032, c122845hK.A01(lineForOffset)).A03(AbstractC119395aw.A00(0.0f, c127045oi.A01));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("offset(", ") is out of bounds [0,", ']', A03, c122815hH.A03.length()));
    }

    public final C60X A07(int i, int i2) {
        C127035oh c127035oh = this.A03;
        if (i >= 0 && i <= i2 && i2 <= c127035oh.A03.A00.A00.length()) {
            C60X A00 = C60W.A00();
            if (i != i2) {
                AbstractC136816Hk.A03(c127035oh.A04, new C207109Ep(A00, i2, i, 0), C60Z.A00(i, i2));
            }
            return A00;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0z("Start(", ") or End(", ") is out of range [0..", "), or start > end!", i, i2, c127035oh.A03.A00.A00.length()));
    }

    public final BIZ A08(int i) {
        int A01;
        C127035oh c127035oh = this.A03;
        C127035oh.A01(c127035oh, i);
        int length = c127035oh.A03.A00.length();
        List list = c127035oh.A04;
        if (i == length) {
            C14360o3.A0B(list, 0);
            A01 = list.size() - 1;
        } else {
            A01 = AbstractC136816Hk.A01(list, i);
        }
        C127045oi c127045oi = (C127045oi) list.get(A01);
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        if (((C122815hH) interfaceC122825hI).A01.A09.isRtlCharAt(C17s.A03(i, i2, c127045oi.A04) - i2)) {
            return BIZ.Rtl;
        }
        return BIZ.Ltr;
    }

    public final BIZ A09(int i) {
        int A01;
        C127035oh c127035oh = this.A03;
        C127035oh.A01(c127035oh, i);
        int length = c127035oh.A03.A00.length();
        List list = c127035oh.A04;
        if (i == length) {
            C14360o3.A0B(list, 0);
            A01 = list.size() - 1;
        } else {
            A01 = AbstractC136816Hk.A01(list, i);
        }
        C127045oi c127045oi = (C127045oi) list.get(A01);
        InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
        int i2 = c127045oi.A05;
        int A03 = C17s.A03(i, i2, c127045oi.A04) - i2;
        Layout layout = ((C122815hH) interfaceC122825hI).A01.A09;
        if (layout.getParagraphDirection(layout.getLineForOffset(A03)) == 1) {
            return BIZ.Ltr;
        }
        return BIZ.Rtl;
    }

    public final boolean A0A() {
        float f = (int) (this.A02 >> 32);
        C127035oh c127035oh = this.A03;
        if (f >= c127035oh.A01 && !c127035oh.A06 && C119055aN.A00(r3) >= c127035oh.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
        long j = this.A02;
        return ((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A05.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextLayoutResult(layoutInput=");
        sb.append(this.A04);
        sb.append(", multiParagraph=");
        sb.append(this.A03);
        sb.append(", size=");
        long j = this.A02;
        sb.append((Object) AnonymousClass001.A0P(" x ", (int) (j >> 32), C119055aN.A00(j)));
        sb.append(", firstBaseline=");
        sb.append(this.A00);
        sb.append(", lastBaseline=");
        sb.append(this.A01);
        sb.append(", placeholderRects=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public C127055oj(C127035oh c127035oh, C126985oc c126985oc, long j) {
        float A00;
        float A002;
        this.A04 = c126985oc;
        this.A03 = c127035oh;
        this.A02 = j;
        List list = c127035oh.A04;
        if (list.isEmpty()) {
            A00 = 0.0f;
        } else {
            A00 = ((C122815hH) ((C127045oi) list.get(0)).A06).A01.A00(0);
        }
        this.A00 = A00;
        if (list.isEmpty()) {
            A002 = 0.0f;
        } else {
            C127045oi c127045oi = (C127045oi) AbstractC001800i.A0K(list);
            A002 = ((C122815hH) c127045oi.A06).A01.A00(r1.A06 - 1) + c127045oi.A01;
        }
        this.A01 = A002;
        this.A05 = c127035oh.A05;
    }
}
