package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.DtU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31544DtU extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C31544DtU(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-803390157);
        AbstractC34852FXk.A01((C31911E0r) AbstractC31172DnG.A0x(view), (C35246Fgf) obj);
        C0f9.A0A(-873327854, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1944685310);
        View view = AbstractC34852FXk.A00(this.A00, viewGroup).itemView;
        C0f9.A0A(-1528732307, A03);
        return view;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
