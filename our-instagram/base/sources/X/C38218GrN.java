package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GrN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38218GrN extends C38213GrI implements InterfaceC58117Ppg, JFS {
    public final FixedAspectRatioVideoLayout A00;
    public final Activity A01;
    public final Context A02;
    public final View A03;
    public final UserSession A04;
    public final JIG A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38218GrN(Activity activity, Context context, View view, UserSession userSession, JIG jig) {
        super(activity, context, view, userSession);
        AbstractC25233BEq.A0w(2, context, jig, userSession);
        this.A03 = view;
        this.A02 = context;
        this.A05 = jig;
        this.A04 = userSession;
        this.A01 = activity;
        this.A00 = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        view.setTag(this);
    }

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.C38213GrI, X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        super.DSJ(c75113Zb, i);
        C37931GmT c37931GmT = super.A00;
        if (c37931GmT != null) {
            JIG jig = this.A05;
            if (i != 2) {
                if (i == 3) {
                    jig.EUs(c37931GmT.BQN(), c75113Zb.A2G);
                    return;
                }
                return;
            }
            jig.Eh6(c37931GmT.BQN(), c75113Zb.A21);
        }
    }

    @Override // X.InterfaceC58117Ppg
    public final IgImageButton BGn() {
        return super.A05;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A00;
    }
}
