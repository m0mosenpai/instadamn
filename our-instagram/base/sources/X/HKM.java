package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* loaded from: classes7.dex */
public final class HKM extends C38524Gwk implements InterfaceC58117Ppg, JFS {
    public final FixedAspectRatioVideoLayout A00;
    public final C38214GrJ A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final UserSession A05;
    public final JIG A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HKM(Activity activity, Context context, View view, UserSession userSession, JIG jig) {
        super(activity, context, view, userSession);
        C38214GrJ c38214GrJ;
        AbstractC25233BEq.A0w(2, context, jig, userSession);
        this.A04 = view;
        this.A03 = context;
        this.A06 = jig;
        this.A05 = userSession;
        this.A02 = activity;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = (FixedAspectRatioVideoLayout) AbstractC166987dD.A0c(view, R.id.layout_container);
        this.A00 = fixedAspectRatioVideoLayout;
        if (fixedAspectRatioVideoLayout instanceof ViewGroup) {
            c38214GrJ = new C38214GrJ(null, super.A01, fixedAspectRatioVideoLayout, null);
        } else {
            c38214GrJ = null;
        }
        this.A01 = c38214GrJ;
        view.setTag(this);
    }

    @Override // X.InterfaceC58117Ppg
    public final void ABQ(C30R c30r, int i) {
    }

    @Override // X.C38524Gwk, X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        super.DSJ(c75113Zb, i);
        C37931GmT c37931GmT = super.A00;
        if (c37931GmT != null) {
            JIG jig = this.A06;
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
        return this.A0G;
    }

    @Override // X.InterfaceC58117Ppg
    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BMQ() {
        return this.A00;
    }
}
