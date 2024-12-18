package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERO extends AbstractC65632xz {
    public final Context A00;
    public final ELn A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERO(Context context, ELn eLn) {
        this.A00 = context;
        this.A01 = eLn;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -601135064);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.FBAudiencePickerViewBinder.Holder");
            FMO fmo = (FMO) tag;
            C14360o3.A0B(fmo, 0);
            fmo.A00.getView();
            throw AbstractC166987dD.A15("getShouldShareToFB");
        }
        C0f9.A0A(-758574285, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2141428319);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.fb_audience_row);
        A0A.setTag(new FMO(A0A));
        C0f9.A0A(-1064796067, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
