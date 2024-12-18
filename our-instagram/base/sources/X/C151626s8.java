package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151626s8 extends C1P1 {
    public final InterfaceC149556o7 A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    public C151626s8(InterfaceC149556o7 interfaceC149556o7, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC149556o7;
        this.A02 = z;
        this.A03 = true;
    }

    public final void A00(C3LZ c3lz) {
        int A03 = C0f9.A03(-904297177);
        C14360o3.A0B(c3lz, 0);
        boolean z = this.A03;
        C3NO F7f = c3lz.F7f();
        UserSession userSession = this.A01;
        List A01 = AbstractC73333Qj.A01(userSession, F7f);
        boolean z2 = this.A02;
        C14360o3.A0B(userSession, 1);
        ArrayList arrayList = new ArrayList();
        int size = A01.size();
        for (int i = 0; i < size; i++) {
            C37771pE c37771pE = (C37771pE) A01.get(i);
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A032 = ReelStore.A03(userSession);
            C14360o3.A07(A032);
            arrayList.add(A032.A0I(c37771pE, z2));
        }
        this.A00.DKu(c3lz, arrayList, z);
        C0f9.A0A(1749849110, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(929918617);
        this.A00.DKs(this.A03);
        C0f9.A0A(1116213663, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-100387146);
        this.A00.DKr(this.A03);
        C0f9.A0A(1218678329, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(692742360);
        this.A00.DKt(this.A03);
        C0f9.A0A(-1056062266, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2021745168);
        A00((C3LZ) obj);
        C0f9.A0A(968696506, A03);
    }
}
