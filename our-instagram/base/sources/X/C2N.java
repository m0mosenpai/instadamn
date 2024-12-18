package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* loaded from: classes5.dex */
public final class C2N extends IgShowreelCompositionView implements InterfaceC127355pE {
    public final InterfaceC31147Dmq A00;

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView
    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, InterfaceC139386St interfaceC139386St, AbstractC27447C9p abstractC27447C9p, C6FG c6fg) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ);
        this.A00.EeL(userSession, igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ, new C29068Crv(interfaceC139386St, this), abstractC27447C9p, c6fg);
    }

    public C2N(Context context) {
        super(context);
        Context context2 = getContext();
        C14360o3.A0B(context2, 0);
        this.A00 = new C29370Cx3(context2, this, this);
    }

    @Override // com.instagram.showreel.composition.ui.IgShowreelCompositionView
    public InterfaceC31147Dmq getCompositionController() {
        return this.A00;
    }
}
