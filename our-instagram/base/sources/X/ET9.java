package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes6.dex */
public final class ET9 extends C1P1 {
    public final Context A00;
    public final InlineAddHighlightFragment A01;
    public final /* synthetic */ C35904FtO A02;

    public ET9(C35904FtO c35904FtO, InlineAddHighlightFragment inlineAddHighlightFragment) {
        this.A02 = c35904FtO;
        this.A01 = inlineAddHighlightFragment;
        this.A00 = inlineAddHighlightFragment.requireContext();
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        TextView textView;
        int A03 = C0f9.A03(-1911656248);
        InlineAddHighlightFragment inlineAddHighlightFragment = this.A01;
        if (inlineAddHighlightFragment.getContext() != null && (textView = inlineAddHighlightFragment.mActionButton) != null) {
            textView.setEnabled(true);
        }
        Context context = this.A00;
        C9GR.A03(context, context.getString(2131976159), MSV.A00(726), 0);
        C0f9.A0A(-386448698, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2042066664);
        int A032 = C0f9.A03(-2118422781);
        C35904FtO c35904FtO = this.A02;
        UserSession userSession = c35904FtO.A02;
        ReelStore A04 = C1OU.A04(userSession);
        C37771pE c37771pE = ((EBB) obj).A00;
        c37771pE.getClass();
        Reel A0I = A04.A0I(c37771pE, true);
        for (C41181vS c41181vS : A0I.A0O(userSession)) {
            if (c41181vS.A0e == EnumC41231vY.A09) {
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                c38321qM.A4N(A0I.getId());
            }
        }
        c35904FtO.A00(A0I.A07(), AbstractC166997dE.A0r(this.A00.getResources(), A0I.A0r, 2131964512));
        c35904FtO.A01.A05(new C3DH(A0I));
        InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
        A0e.E77(MSV.A00(1216), true);
        A0e.apply();
        AbstractC31181DnP.A0Y(this.A01);
        C0f9.A0A(1295736628, A032);
        C0f9.A0A(704777308, A03);
    }
}
