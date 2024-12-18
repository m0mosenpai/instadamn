package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;

/* renamed from: X.UsU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67607UsU extends AbstractC70462WWz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    public final void Ebq(View view, Object obj, String str) {
        float floatValue;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    if (obj != null) {
                        z = ((Boolean) obj).booleanValue();
                    }
                    view.setEnabled(z);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -1354842768:
                if (str.equals("colors")) {
                    ((SwipeRefreshLayoutManager) this.A00).setColors(view, (ReadableArray) obj);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -885150488:
                if (str.equals("progressBackgroundColor")) {
                    ((SwipeRefreshLayoutManager) this.A00).setProgressBackgroundColor(view, C63233Sfl.A00(view.getContext(), obj));
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -416037467:
                if (str.equals("progressViewOffset")) {
                    if (obj == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Number) obj).floatValue();
                    }
                    ((C66494UJz) view).setProgressViewOffset(floatValue);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case -321826009:
                if (str.equals("refreshing")) {
                    if (obj != null) {
                        z2 = ((Boolean) obj).booleanValue();
                    }
                    ((SwipeRefreshLayout) view).setRefreshing(z2);
                    return;
                }
                super.Ebq(view, obj, str);
                return;
            case 3530753:
                if (str.equals("size")) {
                    ((SwipeRefreshLayoutManager) this.A00).setSize(view, (String) obj);
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
