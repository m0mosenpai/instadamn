package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.EQh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32429EQh extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32429EQh(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-879105471);
        AbstractC34327FBv.A00((C211739Zk) obj, (C31902E0i) AbstractC31172DnG.A0x(view));
        C0f9.A0A(1328689219, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3OO, X.E0i, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-925804334);
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        ?? c3oo = new C3OO(igdsBanner);
        c3oo.A00 = igdsBanner;
        igdsBanner.setTag(c3oo);
        View A06 = AbstractC31171DnF.A06(c3oo);
        C0f9.A0A(225717657, A03);
        return A06;
    }
}
