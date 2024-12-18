package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ESJ extends AbstractC168697g3 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final C31535DtK A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ESJ(Context context, InterfaceC11380iw interfaceC11380iw, C31535DtK c31535DtK) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = c31535DtK;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-923959355);
        if (view == null) {
            view = AbstractC25227BEk.A0C(LayoutInflater.from(this.A00), R.layout.row_group_follow_request);
            view.setTag(new FMV(view));
        }
        InterfaceC11380iw interfaceC11380iw = this.A01;
        FMV fmv = (FMV) AbstractC31172DnG.A0x(view);
        InterfaceC37287Gbo interfaceC37287Gbo = (InterfaceC37287Gbo) obj;
        ViewOnClickListenerC35687FpM.A00(fmv.A00, 67, this.A02, interfaceC37287Gbo);
        FC4.A00(interfaceC11380iw, fmv, interfaceC37287Gbo, true);
        C0f9.A0A(1456211665, A03);
        return view;
    }
}
