package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ERy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32472ERy extends AbstractC65632xz {
    public boolean A00 = true;
    public final Context A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32472ERy(Context context) {
        this.A01 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1475737840);
        C34403FEt c34403FEt = (C34403FEt) view.getTag();
        if (c34403FEt != null) {
            c34403FEt.A00.setVisibility(AbstractC167007dF.A05(this.A00 ? 1 : 0));
        }
        C0f9.A0A(2099073307, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1027185958);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
        A0A.setTag(new C34403FEt(A0A));
        C0f9.A0A(-1178305366, A03);
        return A0A;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(1117662939);
        if (view == null) {
            view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
            view.setTag(new C34403FEt(view));
        }
        C0f9.A0A(-1658779055, A03);
        return view;
    }
}
