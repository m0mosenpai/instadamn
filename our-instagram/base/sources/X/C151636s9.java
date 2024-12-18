package X;

import com.instagram.profile.fragment.UserDetailTabController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151636s9 implements InterfaceC65626Tpm {
    public C3FQ A00;
    public final UserDetailTabController A04;
    public final C61372qz A01 = new C61372qz();
    public final C151646sA A03 = new C1I2() { // from class: X.6sA
        @Override // X.C1I2
        public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
            int A03 = C0f9.A03(-579194312);
            C14360o3.A0B(c3fq, 0);
            C151636s9.this.A01.onScroll(c3fq, i, i2, i3, i4, i5);
            C0f9.A0A(-1695132622, A03);
        }

        @Override // X.C1I2
        public final void onScrollStateChanged(C3FQ c3fq, int i) {
            int A03 = C0f9.A03(1491497477);
            C14360o3.A0B(c3fq, 0);
            C151636s9.this.A01.onScrollStateChanged(c3fq, i);
            C0f9.A0A(-1586178084, A03);
        }
    };
    public final List A02 = new ArrayList();

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public final void A00() {
        C3FQ c3fq = this.A00;
        if (c3fq != null) {
            c3fq.EGF(this.A03);
        }
        C3FQ A0A = this.A04.A0A();
        this.A00 = A0A;
        if (A0A != null) {
            A0A.AAJ(this.A03);
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C151656sB) it.next()).A02 = -1;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C3FQ c3fq = this.A00;
        if (c3fq != null) {
            c3fq.EGF(this.A03);
        }
        this.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6sA] */
    public C151636s9(UserDetailTabController userDetailTabController) {
        this.A04 = userDetailTabController;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        A00();
    }
}
