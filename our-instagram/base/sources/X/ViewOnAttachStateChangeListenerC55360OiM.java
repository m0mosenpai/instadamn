package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.OiM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC55360OiM implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C6Z6 A02;
    public final /* synthetic */ Xme3dMediaRepository A03;
    public final /* synthetic */ IgGltfSceneLayoutView A04;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC55360OiM(View view, UserSession userSession, C6Z6 c6z6, Xme3dMediaRepository xme3dMediaRepository, IgGltfSceneLayoutView igGltfSceneLayoutView) {
        this.A00 = view;
        this.A04 = igGltfSceneLayoutView;
        this.A03 = xme3dMediaRepository;
        this.A01 = userSession;
        this.A02 = c6z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.A04;
        C07X A00 = AbstractC55832hO.A00(igGltfSceneLayoutView);
        if (A00 != null) {
            C57157PZb.A01(this.A03, igGltfSceneLayoutView, AbstractC25229BEm.A0a(A00), 37);
        }
        C07X A002 = AbstractC55832hO.A00(igGltfSceneLayoutView);
        if (A002 != null) {
            AbstractC166987dD.A1Z(new B5a(this.A01, this.A03, this.A02, igGltfSceneLayoutView, null, 2), AbstractC25229BEm.A0a(A002));
        }
    }
}
