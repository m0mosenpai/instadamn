package X;

/* renamed from: X.XPo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72140XPo extends C5Ti {
    public static final C72140XPo A00 = new C72140XPo();

    public C72140XPo() {
        super(1, 0);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "count";
        }
        return super.A00(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        C5Z4 c5z4 = (C5Z4) c5z5;
        int i = c5z4.A03.A05[c5z4.A00];
        int length = c117565Tr.A0J.length - c117565Tr.A09;
        int i2 = c117565Tr.A08;
        int[] iArr = c117565Tr.A0I;
        int A03 = C117565Tr.A03(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i2));
        int A01 = C117565Tr.A01(c117565Tr, iArr, C117565Tr.A00(c117565Tr, i2 + 1));
        for (int max = Math.max(A03, A01 - i); max < A01; max++) {
            Object[] objArr = c117565Tr.A0J;
            int i3 = max;
            if (max >= c117565Tr.A0B) {
                i3 = max + c117565Tr.A09;
            }
            Object obj = objArr[i3];
            if (obj instanceof C117675Uc) {
                c5z3.AWY(((C117675Uc) obj).A01, length - max, -1, -1);
            } else if (obj instanceof C5UU) {
                ((C5UU) obj).A00();
            }
        }
        boolean z = false;
        C5UC.A06(AbstractC167007dF.A1O(i));
        int i4 = c117565Tr.A08;
        int[] iArr2 = c117565Tr.A0I;
        int A032 = C117565Tr.A03(c117565Tr, iArr2, C117565Tr.A00(c117565Tr, i4));
        int A012 = C117565Tr.A01(c117565Tr, iArr2, C117565Tr.A00(c117565Tr, i4 + 1)) - i;
        if (A012 >= A032) {
            z = true;
        }
        C5UC.A06(z);
        C117565Tr.A0C(c117565Tr, A012, i, i4);
        int i5 = c117565Tr.A02;
        if (i5 >= A032) {
            c117565Tr.A02 = i5 - i;
        }
    }
}
