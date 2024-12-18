package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EQd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32428EQd extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32428EQd(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-295627365);
        AbstractC167017dG.A1P(view, obj);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerSeeMoreViewBinder.Holder");
            FLH flh = (FLH) tag;
            C38687GzS c38687GzS = (C38687GzS) obj;
            AbstractC167017dG.A1N(flh, c38687GzS);
            IgTextView igTextView = flh.A01;
            igTextView.setText(c38687GzS.A01);
            ViewOnClickListenerC35689FpO.A01(igTextView, 30, c38687GzS);
            ViewOnClickListenerC35689FpO.A01(flh.A00, 31, c38687GzS);
        }
        C0f9.A0A(1247319461, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(729738655);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_audience_picker_see_more);
        A0A.setTag(new FLH(A0A));
        C0f9.A0A(469593625, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
