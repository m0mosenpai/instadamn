package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes4.dex */
public abstract class A2F {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS, C144456fR c144456fR) {
        ImageUrl A06 = c41181vS.A06();
        if (A06 != null) {
            InterfaceC09390do interfaceC09390do = c144456fR.A01;
            AbstractC167017dG.A1W(interfaceC09390do, 0);
            ((IgProgressImageView) AbstractC166987dD.A17(interfaceC09390do)).setUrl(A06, interfaceC11380iw);
            c144456fR.A00.setVisibility(0);
        }
    }
}
