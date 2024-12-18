package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.LwY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49641LwY implements MPH {
    public final /* synthetic */ C45499KCo A00;

    public C49641LwY(C45499KCo c45499KCo) {
        this.A00 = c45499KCo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MPH
    public final void Drn(InterfaceC50403MNf interfaceC50403MNf) {
        String str;
        C45499KCo c45499KCo = this.A00;
        MSU msu = (MSU) interfaceC50403MNf;
        c45499KCo.A0C = msu;
        String str2 = ((C49639LwW) msu).A02;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1735392516:
                if (str2.equals("avatar_stickers")) {
                    c = 0;
                    break;
                }
                break;
            case 3172655:
                if (str2.equals("gifs")) {
                    c = 1;
                    break;
                }
                break;
            case 1531715286:
                if (str2.equals("stickers")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                AbstractC23021Ah.A00(c45499KCo.A05).A0w("avatar_stickers");
                str = "avatar";
                break;
            case 1:
                AbstractC23021Ah.A00(c45499KCo.A05).A0w("gifs");
                str = "gif";
                break;
            case 2:
                AbstractC23021Ah.A00(c45499KCo.A05).A0w("stickers");
                str = "sticker";
                break;
            default:
                str = null;
                break;
        }
        UserSession userSession = c45499KCo.A05;
        C14360o3.A0B(userSession, 1);
        AbstractC46702KlL.A00(new MUW((Object) null, C05F.A00, str, (String) null, 7), AbstractC31176DnK.A0O(userSession, "ig_direct_expression_tray"), userSession, c45499KCo.A0B, c45499KCo.A0F);
        Fragment A00 = c45499KCo.A0D.A00(c45499KCo.getChildFragmentManager(), c45499KCo.A0C);
        if (A00 instanceof MSL) {
            ((MSL) A00).DjQ(c45499KCo.A0G);
        }
        if ((c45499KCo.A04 instanceof InterfaceC11380iw) && (A00 instanceof InterfaceC11380iw)) {
            C55772hI.A00(c45499KCo.A05).A0C((InterfaceC11380iw) c45499KCo.A04, null, 0);
            c45499KCo.A04 = A00;
        }
        C45499KCo.A01(c45499KCo, ((C49639LwW) interfaceC50403MNf).A02);
        IgdsInlineSearchBox igdsInlineSearchBox = c45499KCo.A0A;
        igdsInlineSearchBox.getClass();
        igdsInlineSearchBox.A03();
    }
}
