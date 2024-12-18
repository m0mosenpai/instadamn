package X;

import android.view.View;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* loaded from: classes10.dex */
public final class R5G extends AbstractC70462WWz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    public final void Ebq(View view, Object obj, String str) {
        String str2;
        double A00;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    ReactProgressBarViewManager reactProgressBarViewManager = (ReactProgressBarViewManager) this.A00;
                    if (obj == null) {
                        A00 = 0.0d;
                    } else {
                        A00 = MSW.A00(obj);
                    }
                    reactProgressBarViewManager.setProgress(view, A00);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -877170387:
                if (str.equals("testID")) {
                    ReactProgressBarViewManager reactProgressBarViewManager2 = (ReactProgressBarViewManager) this.A00;
                    if (obj == null) {
                        str2 = "";
                    } else {
                        str2 = (String) obj;
                    }
                    reactProgressBarViewManager2.setTestID(view, str2);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 94842723:
                if (str.equals("color")) {
                    ((ReactProgressBarViewManager) this.A00).setColor(view, C63233Sfl.A00(view.getContext(), obj));
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    ((ReactProgressBarViewManager) this.A00).setIndeterminate(view, AbstractC58322PtE.A1W(obj, false));
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    ((ReactProgressBarViewManager) this.A00).setAnimating(view, AbstractC58322PtE.A1W(obj, true));
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    String str3 = null;
                    ReactProgressBarViewManager reactProgressBarViewManager3 = (ReactProgressBarViewManager) this.A00;
                    if (obj != null) {
                        str3 = (String) obj;
                    }
                    reactProgressBarViewManager3.setStyleAttr(view, str3);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            default:
                super.Ebq(view, obj, str);
                return;
        }
    }
}
