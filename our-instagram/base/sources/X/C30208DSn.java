package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DSn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30208DSn extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ EnumC33510Erj A00;
    public final /* synthetic */ C26838Bt0 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30208DSn(EnumC33510Erj enumC33510Erj, C26838Bt0 c26838Bt0, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A01 = c26838Bt0;
        this.A00 = enumC33510Erj;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1315553014, "com.instagram.invite.view.InviteContactFragment.onCreateView.<anonymous> (InviteContactFragment.kt:48)");
            }
            C26838Bt0 c26838Bt0 = this.A01;
            InterfaceC09390do interfaceC09390do = c26838Bt0.A02;
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, ((C25805BbM) interfaceC09390do.getValue()).A06, 8);
            InterfaceC74963Ym A022 = C6IB.A02(c5Tl, ((C25805BbM) interfaceC09390do.getValue()).A05, 8);
            C57743PjW c57743PjW = new C57743PjW(c26838Bt0, 0);
            C57743PjW c57743PjW2 = new C57743PjW(c26838Bt0, 1);
            C57743PjW c57743PjW3 = new C57743PjW(c26838Bt0, 2);
            DS9 ds9 = new DS9(16, c26838Bt0, this.A02);
            C26040BfT c26040BfT = (C26040BfT) A02.getValue();
            QIw qIw = (QIw) A022.getValue();
            EnumC33510Erj enumC33510Erj = this.A00;
            boolean z = this.A04;
            boolean z2 = this.A03;
            C25805BbM c25805BbM = (C25805BbM) interfaceC09390do.getValue();
            Context A0O = AbstractC166987dD.A0O(c25805BbM.A00);
            UserSession userSession = c25805BbM.A01;
            FragmentActivity requireActivity = c26838Bt0.requireActivity();
            C29264CvL c29264CvL = new C29264CvL();
            AbstractC28466ChI.A00(c26838Bt0.mView, c5Tl, null, enumC33510Erj, qIw, c26040BfT, c57743PjW, c57743PjW2, c57743PjW3, ds9, AbstractC133095zb.A00(new C35207Ffz(A0O, c26838Bt0, requireActivity, c26838Bt0.getParentFragmentManager(), AbstractC018607g.A00(c26838Bt0), enumC33510Erj, userSession, C57112jm.A00(), new C27178Byx(), c29264CvL, null, c26838Bt0, null, C2EY.A17, null, RunnableC29600D2b.A00, null, null, null, "InviteContactViewModel", null, false, false, false, false, false, false, false).A02()), 1074036736, 8, C3OO.FLAG_MOVED, z, z2);
            if (C0fH.A02()) {
                C0fH.A00(804882609);
            }
        }
        return C0eB.A00;
    }
}
