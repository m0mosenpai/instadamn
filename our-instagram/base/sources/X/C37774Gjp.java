package X;

import android.view.View;

/* renamed from: X.Gjp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37774Gjp extends C03E implements InterfaceC16620sF {
    public C37774Gjp(Object obj) {
        super(2, obj, C31414DrJ.class, "showCloseFriendsIndicatorTooltip", "showCloseFriendsIndicatorTooltip(Landroid/view/View;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        boolean A1R = AbstractC167007dF.A1R(0, view, obj2);
        C37711Gim c37711Gim = ((C31414DrJ) this.receiver).A04;
        if (!c37711Gim.A02) {
            InterfaceC19630xq interfaceC19630xq = c37711Gim.A08.A01;
            if (!interfaceC19630xq.getBoolean("has_seen_close_friends_indicator_tooltip", false)) {
                EnumC58132lV enumC58132lV = EnumC58132lV.A02;
                String A0r = AbstractC166997dE.A0r(view.getResources(), obj2, 2131956257);
                C14360o3.A07(A0r);
                C37711Gim.A02(view, enumC58132lV, new C149686oL(A0r), c37711Gim, null);
                c37711Gim.A02 = A1R;
                AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_close_friends_indicator_tooltip", A1R);
            }
        }
        return C0eB.A00;
    }
}
