package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Je1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44076Je1 implements InterfaceC42271xH, InterfaceC2056198l {
    public final JR2 A00;

    public C44076Je1(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A00 = jr2;
    }

    private final boolean A00(String str) {
        EnumC46982Dm C4i;
        JR2 jr2 = this.A00;
        C2DU A0g = AbstractC43592JPx.A0g(jr2);
        C14360o3.A0B(str, 0);
        C81663kb A0N = A0g.A0N(str);
        if (A0N == null || (C4i = A0N.C4i()) == EnumC46982Dm.A06 || C4i == EnumC46982Dm.A07 || C4i == jr2.A0u().A01) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C3IL c3il = (C3IL) obj;
        C14360o3.A0B(c3il, 0);
        JR2 jr2 = this.A00;
        C1UC activity = jr2.A1L.getActivity();
        if (((activity instanceof InterfaceC53772dG) && ((InterfaceC53772dG) activity).CYp()) || !RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(c3il.A00) || !C14360o3.A0K(jr2.A0p().userId, c3il.A01) || A00(AbstractC162167Oa.A01("thread_id:", c3il.A02))) {
            return false;
        }
        c3il.A04 = "user in inbox shown";
        c3il.A03 = 1001;
        return true;
    }

    @Override // X.InterfaceC2056198l
    public final boolean EiU(String str) {
        return A00(str);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-578562676);
        C0f9.A0A(-610445799, C0f9.A03(95550418));
        C0f9.A0A(432297883, A03);
    }
}
