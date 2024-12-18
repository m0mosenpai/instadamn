package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.Ijg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42011Ijg implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ C41551w4 A04;
    public final /* synthetic */ C130915ve A05;
    public final /* synthetic */ SourceModelInfoParams A06;
    public final /* synthetic */ C145726hV A07;

    public ViewOnClickListenerC42011Ijg(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, C130915ve c130915ve, SourceModelInfoParams sourceModelInfoParams, C145726hV c145726hV) {
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = interfaceC60442pS;
        this.A05 = c130915ve;
        this.A04 = c41551w4;
        this.A06 = sourceModelInfoParams;
        this.A00 = onDismissListener;
        this.A07 = c145726hV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1423473164);
        UserSession userSession = this.A02;
        Fragment fragment = this.A01;
        C2Fb c2Fb = C2Fb.A28;
        C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, this.A05, this.A03, c2Fb);
        c37952Gmu.A0q = true;
        c37952Gmu.A0M = this.A04.A0H;
        c37952Gmu.A02(this.A06);
        c37952Gmu.A0E = this.A00;
        c37952Gmu.A0W = this.A07;
        C37953Gmv.A02(c37952Gmu);
        C0f9.A0C(-928066836, A05);
    }
}
