package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Ozc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56315Ozc implements InterfaceC37150GYl {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ N6J A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C56315Ozc(C128175qm c128175qm, N6J n6j, String str, String str2, boolean z) {
        this.A01 = n6j;
        this.A04 = z;
        this.A00 = c128175qm;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC37150GYl
    public final void DY2() {
        C9GR.A0B(this.A01.getActivity(), "pending_media_prepare_failed_share_button_clicked");
    }

    @Override // X.InterfaceC37150GYl
    public final void DY3() {
        N6J n6j = this.A01;
        boolean z = this.A04;
        C128175qm c128175qm = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        InterfaceC09390do interfaceC09390do = n6j.A0U;
        C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
        if (AbstractC167017dG.A1b(A00, A00.A0F, C23031Ai.A8c, 131)) {
            N6J.A0H(n6j);
        }
        C47Z A04 = NJR.A04(n6j);
        Long l = null;
        if (A04 == null) {
            AbstractC12120kG.A07(N6J.__redex_internal_original_name, "pending media is null in onPendingMediaPreparedToShare", null);
            return;
        }
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = n6j.requireActivity();
        C110204xp c110204xp = c128175qm.A08;
        if (c110204xp != null) {
            l = Long.valueOf(c110204xp.A00);
        }
        String valueOf = String.valueOf(l);
        C29718D8o c29718D8o = new C29718D8o(c128175qm, n6j, str, str2, 2, z);
        C14360o3.A0B(A0r, 0);
        A04.A2Z = str;
        A04.A0c(ShareType.A08);
        A04.A5P = z;
        A04.A3n = valueOf;
        C47Z A01 = AbstractC189168Zk.A01(A0r, A04);
        C40121td A012 = C40121td.A0G.A01(requireActivity, A0r);
        if (A01.A1G == EnumC40111tc.A0A) {
            A012.A0B(A01);
        } else {
            A012.A0D(A01);
        }
        A012.A09(A01);
        c29718D8o.invoke();
    }
}
