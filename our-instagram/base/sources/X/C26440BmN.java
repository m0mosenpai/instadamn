package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BmN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26440BmN extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31069DlB A02;
    public final UserSession A03;
    public final boolean A04;

    public C26440BmN(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31069DlB interfaceC31069DlB, boolean z) {
        AbstractC167027dH.A0a(1, userSession, c120985dq, c37644Ghd, interfaceC31069DlB);
        this.A03 = userSession;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31069DlB;
        this.A04 = z;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C70399WUb A00 = C70399WUb.A00(this.A03);
        VG4 vg4 = VG4.A0R;
        String A002 = AbstractC111324zv.A00(1994);
        A00.A01 = A002;
        A00.A0I(vg4, A002);
        InterfaceC31069DlB interfaceC31069DlB = this.A02;
        C120985dq c120985dq = this.A00;
        interfaceC31069DlB.E0i(c120985dq, this.A01, false);
        C75933ay c75933ay = C51722Yv.A02;
        boolean z = this.A04;
        int i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        if (z) {
            i = R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin;
        }
        long A0D = AbstractC77623dm.A0D(c76223bS, i);
        Integer num = C05F.A01;
        C51722Yv A003 = C9CU.A00(null, num, 0, A0D);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CV.A00(A003, num2, enumC77683ds, 3), num2, 100.0f, 0);
        C3e8 c3e8 = C3e8.FLEX_START;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A0N = AbstractC25234BEr.A0N(C9CV.A00(null, num2, enumC77683ds, 3), num2, num, 100.0f, 0);
        C3e8 c3e82 = C3e8.SPACE_EVENLY;
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        A0K.A00(new C26338Bkj(AbstractC77623dm.A0F(A0K, 2131976849), C29904DGs.A01(this, 22)));
        AbstractC25231BEo.A1B(new C26338Bkj(AbstractC138316On.A01(AbstractC166997dE.A0M(A0K.A00.A0C), c120985dq.A02), C29904DGs.A01(this, 23)), A0K, A12, A0N, c3e82);
        return AbstractC76963ci.A08(A12, c76223bS, A0d, c3e8);
    }
}
