package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.XMr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72073XMr extends C5Ti {
    public static final C72073XMr A00 = new C72073XMr();

    public C72073XMr() {
        super(1, 2);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return AbstractC111324zv.A00(4517);
        }
        return super.A00(i);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        if (i == 1) {
            return "anchor";
        }
        return super.A01(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        int i;
        C5Z4 c5z4 = (C5Z4) c5z5;
        C117485Th c117485Th = c5z4.A03;
        Object[] objArr = c117485Th.A07;
        int i2 = c5z4.A01;
        Object obj = objArr[i2];
        C117595Tu c117595Tu = (C117595Tu) objArr[i2 + 1];
        int i3 = c117485Th.A05[c5z4.A00];
        if (obj instanceof C117675Uc) {
            ((C5Z2) c5z3).A05.add(((C117675Uc) obj).A01);
        }
        int A0H = c117565Tr.A0H(c117595Tu);
        int A0G = c117565Tr.A0G(A0H, i3);
        if (A0G >= c117565Tr.A0B) {
            A0G += c117565Tr.A09;
        }
        Object[] objArr2 = c117565Tr.A0J;
        Object obj2 = objArr2[A0G];
        objArr2[A0G] = obj;
        if (obj2 instanceof C117675Uc) {
            int length = objArr2.length - c117565Tr.A09;
            int A0G2 = length - c117565Tr.A0G(A0H, i3);
            C117675Uc c117675Uc = (C117675Uc) obj2;
            C117595Tu c117595Tu2 = c117675Uc.A00;
            int i4 = -1;
            if (c117595Tu2 != null && c117595Tu2.A00 != Integer.MIN_VALUE) {
                i4 = c117565Tr.A0H(c117595Tu2);
                int[] iArr = c117565Tr.A0I;
                i = length - C117565Tr.A01(c117565Tr, iArr, C117565Tr.A00(c117565Tr, iArr[(C117565Tr.A00(c117565Tr, i4) * 5) + 3] + i4));
            } else {
                i = -1;
            }
            c5z3.AWY(c117675Uc.A01, A0G2, i4, i);
            return;
        }
        if (!(obj2 instanceof C5UU)) {
            return;
        }
        ((C5UU) obj2).A00();
    }
}
