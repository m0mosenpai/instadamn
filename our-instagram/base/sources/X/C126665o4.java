package X;

import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseNaturalOrdering;
import java.util.Comparator;

/* renamed from: X.5o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126665o4 extends AbstractC97274Ym implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r14 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C126665o4(X.C4WV r12, X.C96394Ux r13, java.lang.String r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r0 = r16
            r11.<init>(r12, r15, r0)
            r2 = 0
            r3 = r17 & 7
            r4 = 4
            r0 = 1
            if (r3 == r4) goto Ld
            r0 = 0
        Ld:
            r11.A08 = r0
            X.4B6 r1 = r11.A02
            int r6 = r1.A0H
            int r0 = r13.A00
            r0 = r0 ^ (-1)
            r6 = r6 & r0
            r5 = r6 & 1
            r0 = 0
            if (r5 == 0) goto L1e
            r0 = 1
        L1e:
            r11.A06 = r0
            r5 = r6 & 2
            r0 = 0
            if (r5 == 0) goto L26
            r0 = 1
        L26:
            r11.A07 = r0
            r10 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r7 = r13.A0K
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r9 = X.C4VT.A00(r0)
        L3d:
            r8 = 0
        L3e:
            int r0 = r9.size()
            if (r8 >= r0) goto Lb3
            java.lang.Object r5 = r9.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = r13.A0P
            int r6 = X.C4VA.A00(r1, r5, r0)
            if (r6 <= 0) goto Lb0
            r10 = r8
        L53:
            r11.A00 = r10
            r11.A01 = r6
            int r8 = r1.A0E
            int r0 = r13.A0C
            if (r8 == 0) goto Laa
            if (r8 != r0) goto Laa
            r5 = 2147483647(0x7fffffff, float:NaN)
        L62:
            r11.A02 = r5
            r8 = r8 & 1088(0x440, float:1.525E-42)
            r0 = 0
            if (r8 == 0) goto L6a
            r0 = 1
        L6a:
            r11.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L7d
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r14, r0)
            if (r0 != 0) goto L7d
            r0 = 0
            if (r14 != 0) goto L7e
        L7d:
            r0 = 1
        L7e:
            int r1 = X.C4VA.A00(r1, r14, r0)
            r11.A03 = r1
            if (r6 > 0) goto L98
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8e
            if (r5 > 0) goto L98
        L8e:
            boolean r0 = r11.A06
            if (r0 != 0) goto L98
            boolean r0 = r11.A07
            if (r0 == 0) goto La8
            if (r1 <= 0) goto La8
        L98:
            r1 = 1
        L99:
            boolean r0 = r13.A0D
            if (r3 == r4) goto La2
            if (r0 == 0) goto La5
            r0 = 3
            if (r3 != r0) goto La5
        La2:
            if (r1 == 0) goto La5
            r2 = 1
        La5:
            r11.A04 = r2
            return
        La8:
            r1 = 0
            goto L99
        Laa:
            r0 = r0 & r8
            int r5 = java.lang.Integer.bitCount(r0)
            goto L62
        Lb0:
            int r8 = r8 + 1
            goto L3e
        Lb3:
            r6 = 0
            goto L53
        Lb5:
            r9 = r7
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126665o4.<init>(X.4WV, X.4Ux, java.lang.String, int, int, int):void");
    }

    @Override // X.AbstractC97274Ym
    public final int A00() {
        return this.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C126665o4 c126665o4) {
        AbstractC58667Pzf A03 = AbstractC58667Pzf.A00.A03(this.A08, c126665o4.A08);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(c126665o4.A00);
        Comparator comparator = NaturalOrdering.A00;
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        AbstractC58667Pzf A02 = A03.A02(valueOf, valueOf2, reverseNaturalOrdering);
        int i = this.A01;
        AbstractC58667Pzf A01 = A02.A01(i, c126665o4.A01);
        int i2 = this.A02;
        AbstractC58667Pzf A032 = A01.A01(i2, c126665o4.A02).A03(this.A06, c126665o4.A06);
        Boolean valueOf3 = Boolean.valueOf(this.A07);
        Boolean valueOf4 = Boolean.valueOf(c126665o4.A07);
        if (i != 0) {
            comparator = reverseNaturalOrdering;
        }
        AbstractC58667Pzf A012 = A032.A02(valueOf3, valueOf4, comparator).A01(this.A03, c126665o4.A03);
        if (i2 == 0) {
            A012 = A012.A04(this.A05, c126665o4.A05);
        }
        return A012.A00();
    }

    @Override // X.AbstractC97274Ym
    public final /* bridge */ /* synthetic */ boolean A01(AbstractC97274Ym abstractC97274Ym) {
        return false;
    }
}
