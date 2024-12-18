package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;

/* renamed from: X.SMf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62691SMf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C63309ShF A03;
    public final /* synthetic */ ViewGroupManager A04;
    public final /* synthetic */ java.util.Set A05;

    public C62691SMf(View view, ViewGroup viewGroup, C63309ShF c63309ShF, ViewGroupManager viewGroupManager, java.util.Set set, int i) {
        this.A03 = c63309ShF;
        this.A04 = viewGroupManager;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A05 = set;
        this.A00 = i;
    }

    public final void A00() {
        ViewGroupManager viewGroupManager = this.A04;
        ViewGroup viewGroup = this.A02;
        View view = this.A01;
        viewGroupManager.removeView(viewGroup, view);
        C63309ShF c63309ShF = this.A03;
        c63309ShF.A08(view);
        java.util.Set set = this.A05;
        set.remove(Integer.valueOf(view.getId()));
        if (set.isEmpty()) {
            c63309ShF.A00.remove(Integer.valueOf(this.A00));
        }
    }
}
