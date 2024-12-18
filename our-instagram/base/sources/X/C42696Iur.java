package X;

import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iur, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42696Iur implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C42696Iur(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        if (this.A00 != 0) {
            InterfaceC106354qp interfaceC106354qp = (InterfaceC106354qp) this.A02;
            if (interfaceC106354qp.B1v() != null && interfaceC106354qp.B1w() != null && C14360o3.A0K(this.A03, "see_more")) {
                String B1v = interfaceC106354qp.B1v();
                if (B1v != null) {
                    String B1w = interfaceC106354qp.B1w();
                    if (B1w != null) {
                        C146106i8 A0H = AbstractC37304Gc5.A0H();
                        A0H.A0D = B1v;
                        A0H.A02();
                        A0H.A0R = true;
                        A0H.A0J = true;
                        Integer A05 = AbstractC65877Tvg.A05(B1w);
                        if (A05 != null) {
                            A0H.A07(A05.intValue());
                        }
                        AbstractC25233BEq.A1F(A0H);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            ((JI9) this.A01).CmG(this.A03);
            return;
        }
        UserSession A0r = AbstractC166987dD.A0r(((RecentAdActivityFragment) this.A02).A0E);
        String str = this.A03;
        Object obj = this.A01;
        C14360o3.A0B(A0r, 0);
        boolean A1V = AbstractC167007dF.A1V(obj);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C0CA A02 = GraphQlCallInput.A02.A02();
        C0CA.A00(A02, str, "ad_id");
        AbstractC40691uc.A01(A0r).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, "input"), "AdActivityRemoveUndoMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), QiX.class, A1V, null, 96, null, "xfb_undo_delete_recent_ad_activity", AbstractC166987dD.A1E()), new C32539EUp(obj, 37));
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
