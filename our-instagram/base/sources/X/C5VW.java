package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.5VW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5VW {
    public static final void A01(C5Tl c5Tl, AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF) {
        A03(c5Tl, abstractC12990ll, str, interfaceC16620sF, 196608, 28, false, false, false);
    }

    public static final void A03(C5Tl c5Tl, AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(abstractC12990ll, 1);
        C14360o3.A0B(interfaceC16620sF, 5);
        c5Tl.Enr(-1248157021);
        if ((i2 & 4) != 0) {
            z6 = false;
        }
        if ((i2 & 8) != 0) {
            z5 = false;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        }
        if (C0fH.A02()) {
            C0fH.A01(1788978662, "com.instagram.compose.root.IgRoot (IgRoot.kt:32)");
        }
        C60962qK A01 = AbstractC60952qJ.A01(str, z5, z4);
        ArrayList A1N = AbstractC16960so.A1N(C5VX.A00.A02(abstractC12990ll), C5VZ.A00.A02(A01), AbstractC117915Vb.A00.A02(A01));
        if (abstractC12990ll instanceof UserSession) {
            A1N.add(AbstractC117935Vd.A00.A02(abstractC12990ll));
        }
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36328860614147920L)) {
            A1N.add(C6LG.A00.A02(C6LI.A00));
        }
        C117685Ud[] c117685UdArr = (C117685Ud[]) A1N.toArray(new C117685Ud[0]);
        AbstractC117695Ue.A01(c5Tl, C5UA.A01(c5Tl, new C207139Es(interfaceC16620sF, 1, z6), -401074717), (C117685Ud[]) Arrays.copyOf(c117685UdArr, c117685UdArr.length), 56);
        if (C0fH.A02()) {
            C0fH.A00(-1629155685);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30257DUk(abstractC12990ll, str, interfaceC16620sF, i, i2, z6, z5, z4);
        }
    }

    public static final void A00(C5Tl c5Tl, AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF) {
        A03(c5Tl, abstractC12990ll, str, interfaceC16620sF, 196672, 28, false, false, false);
    }

    public static final void A02(C5Tl c5Tl, AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF) {
        A03(c5Tl, abstractC12990ll, str, interfaceC16620sF, 196614, 28, false, false, false);
    }
}
