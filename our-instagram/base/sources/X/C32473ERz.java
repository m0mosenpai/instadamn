package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.ERz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32473ERz extends AbstractC65632xz {
    public final Context A00;
    public final Integer A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32473ERz(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(882931538);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) view.requireViewById(R.id.spinner);
        Integer num = this.A01;
        if (num != null) {
            int intValue = num.intValue();
            colorFilterAlphaImageView.setNormalColor(intValue);
            colorFilterAlphaImageView.setActiveColor(intValue);
        }
        C0f9.A0A(1368018814, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-644140968);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_loading_row);
        C0f9.A0A(-1405067205, A03);
        return A0A;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(489704973);
        if (view == null) {
            view = createView(i, viewGroup);
            bindView(i, view, obj, obj2);
        }
        C0f9.A0A(1676487418, A03);
        return view;
    }
}
