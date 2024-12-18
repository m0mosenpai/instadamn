package X;

import android.view.View;
import com.facebook.react.views.modal.ReactModalHostManager;

/* loaded from: classes10.dex */
public final class R5I extends AbstractC70462WWz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    public final void Ebq(View view, Object obj, String str) {
        String str2;
        switch (str.hashCode()) {
            case -1851617609:
                str2 = "presentationStyle";
                break;
            case -1850124175:
                str2 = "supportedOrientations";
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    ((ReactModalHostManager) this.A00).setTransparent(view, AbstractC58322PtE.A1W(obj, false));
                    return;
                }
                super.Ebq(view, obj, str);
            case -1618432855:
                str2 = "identifier";
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    ((ReactModalHostManager) this.A00).setStatusBarTranslucent(view, AbstractC58322PtE.A1W(obj, false));
                    return;
                }
                super.Ebq(view, obj, str);
            case -795203165:
                str2 = "animated";
                break;
            case 466743410:
                str2 = "visible";
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    ((ReactModalHostManager) this.A00).setHardwareAccelerated(view, AbstractC58322PtE.A1W(obj, false));
                    return;
                }
                super.Ebq(view, obj, str);
            case 2031205598:
                if (str.equals("animationType")) {
                    ((ReactModalHostManager) this.A00).setAnimationType(view, (String) obj);
                    return;
                }
                super.Ebq(view, obj, str);
            default:
                super.Ebq(view, obj, str);
        }
        if (str.equals(str2)) {
            return;
        }
        super.Ebq(view, obj, str);
    }
}
