package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.XPl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72138XPl extends C5Ti {
    public static final C72138XPl A00 = new C72138XPl();

    public C72138XPl() {
        super(0, 2);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        return super.A01(i);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        C5Z4 c5z4 = (C5Z4) c5z5;
        Object[] objArr = c5z4.A03.A07;
        int i = c5z4.A01;
        C117595Tu c117595Tu = (C117595Tu) objArr[i];
        Object obj = objArr[i + 1];
        if (obj instanceof C117675Uc) {
            ((C5Z2) c5z3).A05.add(((C117675Uc) obj).A01);
        }
        if (c117565Tr.A06 == 0) {
            int i2 = c117565Tr.A02;
            int i3 = c117565Tr.A03;
            int A0H = c117565Tr.A0H(c117595Tu);
            int A01 = C117565Tr.A01(c117565Tr, c117565Tr.A0I, C117565Tr.A00(c117565Tr, A0H + 1));
            c117565Tr.A02 = A01;
            c117565Tr.A03 = A01;
            C117565Tr.A09(c117565Tr, 1, A0H);
            if (i2 >= A01) {
                i2++;
                i3++;
            }
            c117565Tr.A0J[A01] = obj;
            c117565Tr.A02 = i2;
            c117565Tr.A03 = i3;
            return;
        }
        C5UC.A03("Can only append a slot if not current inserting");
        throw C00O.createAndThrow();
    }
}
