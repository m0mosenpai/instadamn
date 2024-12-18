package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgView;

/* loaded from: classes7.dex */
public final class HF0 extends AbstractC65632xz {
    public final C41063IGg A00;
    public final Context A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        JHH jhh = (JHH) obj;
        anonymousClass306.A7a(0);
        C41063IGg c41063IGg = this.A00;
        C59072n8 A00 = C59062n7.A00(jhh, null, jhh.BKd());
        A00.A00(c41063IGg.A02);
        c41063IGg.A01.A01(A00.A01(), jhh.BKd());
    }

    public HF0(Context context, C41063IGg c41063IGg) {
        this.A01 = context;
        this.A00 = c41063IGg;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1278575642);
        C41063IGg c41063IGg = this.A00;
        c41063IGg.A00.A05(view, c41063IGg.A01.A00(((JHH) obj).BKd()));
        C0f9.A0A(1089584078, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1090611179);
        IgView igView = new IgView(this.A01);
        igView.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        C0f9.A0A(-817234828, A03);
        return igView;
    }
}
