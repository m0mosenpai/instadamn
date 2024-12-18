package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dtf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31555Dtf extends C1P1 {
    public final /* synthetic */ C1570473j A00;
    public final /* synthetic */ AnonymousClass740 A01;

    public C31555Dtf(C1570473j c1570473j, AnonymousClass740 anonymousClass740) {
        this.A01 = anonymousClass740;
        this.A00 = c1570473j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1041308756);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_fail");
        ((MTJ) c1570473j).A00.A01();
        AnonymousClass740 anonymousClass740 = this.A01;
        AnonymousClass740.A01(anonymousClass740, 16916327);
        anonymousClass740.A08.A0L(EnumC155676yw.A02);
        C0f9.A0A(-301642148, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(968632944);
        this.A01.A08.A0L(EnumC155676yw.A03);
        C0f9.A0A(2045449603, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(510050867);
        C31526DtB c31526DtB = (C31526DtB) obj;
        int A0N = AbstractC167017dG.A0N(c31526DtB, -1822011219);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_end");
        ((MTJ) c1570473j).A00.A05();
        AnonymousClass740 anonymousClass740 = this.A01;
        AnonymousClass740.A01(anonymousClass740, 16915493);
        if (!c31526DtB.A00().isEmpty()) {
            UserDetailFragment userDetailFragment = anonymousClass740.A07;
            userDetailFragment.A0y(c31526DtB.A00());
            anonymousClass740.A08.A0L(EnumC155676yw.A04);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(anonymousClass740.A04, "self_profile_chaining_unit_impression");
            AbstractC25233BEq.A17(A0f, "module", userDetailFragment.getModuleName());
            A0f.Cht();
        } else {
            anonymousClass740.A08.A0L(EnumC155676yw.A02);
        }
        C0f9.A0A(-475605609, A0N);
        C0f9.A0A(-761019767, A03);
    }
}
