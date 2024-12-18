package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32439EQr extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32439EQr(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(975300387);
        AbstractC34851FXj.A01((GHY) obj, (C34957Fah) obj2, (E1C) AbstractC31172DnG.A0x(view));
        C0f9.A0A(270889923, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1801229914);
        View view = AbstractC34851FXj.A00(this.A00, viewGroup).itemView;
        C0f9.A0A(-1685952118, A03);
        return view;
    }
}
