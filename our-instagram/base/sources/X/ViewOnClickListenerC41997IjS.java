package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.IjS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41997IjS implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ InterfaceC38371qR A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ SourceModelInfoParams A05;

    public ViewOnClickListenerC41997IjS(Fragment fragment, UserSession userSession, IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, SourceModelInfoParams sourceModelInfoParams) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = interfaceC38371qR;
        this.A05 = sourceModelInfoParams;
        this.A04 = interfaceC60442pS;
        this.A02 = igImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(794713184);
        Fragment fragment = this.A00;
        UserSession userSession = this.A01;
        InterfaceC38371qR interfaceC38371qR = this.A03;
        SourceModelInfoParams sourceModelInfoParams = this.A05;
        C2Fb c2Fb = C2Fb.A28;
        C37953Gmv.A02(AbstractC37951Gmt.A00(fragment, userSession, this.A02, interfaceC38371qR, this.A04, sourceModelInfoParams, c2Fb, null));
        C0f9.A0C(-2109162786, A05);
    }
}
