package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Dti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31558Dti extends C1P1 {
    public final /* synthetic */ C1570473j A00;
    public final /* synthetic */ C156086zc A01;
    public final /* synthetic */ String A02;

    public C31558Dti(C1570473j c1570473j, C156086zc c156086zc, String str) {
        this.A01 = c156086zc;
        this.A00 = c1570473j;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1660765177);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_fail");
        ((MTJ) c1570473j).A00.A01();
        this.A01.A03.A0L(EnumC155676yw.A02);
        C0f9.A0A(1658028097, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(147274567);
        this.A01.A03.A0L(EnumC155676yw.A03);
        C0f9.A0A(-88486284, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-404109375);
        C31526DtB c31526DtB = (C31526DtB) obj;
        int A0N = AbstractC167017dG.A0N(c31526DtB, 328515264);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_end");
        ((MTJ) c1570473j).A00.A05();
        C156086zc c156086zc = this.A01;
        UserDetailFragment userDetailFragment = c156086zc.A02;
        User user = userDetailFragment.A10.A03;
        if (user == null) {
            i = 1378816365;
        } else {
            user.A03.EQ5(Boolean.valueOf(c31526DtB.A04));
            user.A03.EVI(Boolean.valueOf(c31526DtB.A06));
            if (c31526DtB.A00().isEmpty()) {
                c156086zc.A03.A0L(EnumC155676yw.A02);
            } else {
                userDetailFragment.A0y(c31526DtB.A00());
                c156086zc.A03.A0L(EnumC155676yw.A04);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c156086zc.A00, "self_profile_chaining_unit_impression");
                AbstractC25233BEq.A17(A0f, "module", this.A02);
                A0f.Cht();
            }
            i = -2140006551;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(-2136175907, A03);
    }
}
