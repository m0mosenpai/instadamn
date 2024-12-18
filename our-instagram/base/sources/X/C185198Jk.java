package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.8Jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185198Jk extends AbstractC52922bZ {
    public final UserSession A00;
    public final C05A A01;
    public final C0UO A02;

    public C185198Jk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C008002u A00 = C10E.A00(C185208Jl.A00);
        this.A01 = A00;
        this.A02 = A00;
    }

    public final void A00() {
        String str;
        MusicAssetModel musicAssetModel;
        InterfaceC185218Jm interfaceC185218Jm = (InterfaceC185218Jm) this.A01.getValue();
        if (interfaceC185218Jm instanceof C211919aI) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
            MusicAttributionConfig musicAttributionConfig = ((C211919aI) interfaceC185218Jm).A01;
            if (musicAttributionConfig != null && (musicAssetModel = musicAttributionConfig.A02) != null) {
                str = musicAssetModel.A0E;
            } else {
                str = null;
            }
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7K(MSV.A00(1368), str);
            ARD.apply();
        }
    }
}
