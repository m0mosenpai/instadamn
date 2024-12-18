package X;

/* renamed from: X.5Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117665Ub {
    public static final void A00(C117485Th c117485Th, int i, int i2) {
        int i3 = 1 << i;
        int i4 = c117485Th.A03;
        if ((i4 & i3) == 0) {
            c117485Th.A03 = i4 | i3;
            int[] iArr = c117485Th.A05;
            int i5 = c117485Th.A00;
            C5Ti c5Ti = c117485Th.A06[c117485Th.A02 - 1];
            C14360o3.A0A(c5Ti);
            iArr[(i5 - c5Ti.A00) + i] = i2;
            return;
        }
        C5Ti c5Ti2 = c117485Th.A06[c117485Th.A02 - 1];
        C14360o3.A0A(c5Ti2);
        SQP.A01(AnonymousClass001.A0R("Already pushed argument ", c5Ti2.A00(i)));
        throw C00O.createAndThrow();
    }

    public static final void A01(C117485Th c117485Th, Object obj, int i) {
        int i2 = 1 << i;
        int i3 = c117485Th.A04;
        if ((i3 & i2) == 0) {
            c117485Th.A04 = i3 | i2;
            Object[] objArr = c117485Th.A07;
            int i4 = c117485Th.A01;
            C5Ti c5Ti = c117485Th.A06[c117485Th.A02 - 1];
            C14360o3.A0A(c5Ti);
            objArr[(i4 - c5Ti.A01) + i] = obj;
            return;
        }
        C5Ti c5Ti2 = c117485Th.A06[c117485Th.A02 - 1];
        C14360o3.A0A(c5Ti2);
        SQP.A01(AnonymousClass001.A0R("Already pushed argument ", c5Ti2.A01(i)));
        throw C00O.createAndThrow();
    }
}
