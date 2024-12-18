package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.Iwd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42801Iwd implements InterfaceC144656fl {
    public final InterfaceC144656fl A00;
    public final IgBouncyUfiButtonImageView A01;

    public C42801Iwd(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        C14360o3.A0B(interfaceC11380iw, 3);
        C147156jr c147156jr = new C147156jr(interfaceC11380iw, userSession, null, null, null, null);
        this.A01 = igBouncyUfiButtonImageView;
        this.A00 = c147156jr;
    }

    @Override // X.InterfaceC144656fl
    public final void DOv(EnumC77173d3 enumC77173d3, Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(enumC77173d3, 2);
        this.A01.setSelected(AbstractC167007dF.A1X(enumC77173d3, EnumC77173d3.A02));
        this.A00.DOv(enumC77173d3, reel, c41181vS);
    }
}
