package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ERx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32471ERx extends AbstractC65632xz {
    public final Context A00;
    public final GXE A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32471ERx(Context context, GXE gxe) {
        this.A00 = context;
        this.A01 = gxe;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C0f9.A0A(-498159038, C0f9.A03(-2113265202));
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2032474297);
        Context context = this.A00;
        GXE gxe = this.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
        Fp1.A00(inflate, 55, gxe);
        AbstractC56952jT.A01(inflate);
        C0f9.A0A(-325348662, A03);
        return inflate;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(611388344);
        if (view == null) {
            Context context = this.A00;
            GXE gxe = this.A01;
            view = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
            Fp1.A00(view, 55, gxe);
            AbstractC56952jT.A01(view);
        }
        C0f9.A0A(-1372452845, A03);
        return view;
    }
}
