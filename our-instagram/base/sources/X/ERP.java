package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERP extends AbstractC65632xz {
    public final Context A00;
    public final GYN A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERP(Context context, GYN gyn) {
        this.A00 = context;
        this.A01 = gyn;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1123648881);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.activity.TagMoreRowViewBinder.Holder");
        C34529FJp c34529FJp = (C34529FJp) tag;
        String string = this.A00.getResources().getString(AbstractC166987dD.A0H(obj));
        GYN gyn = this.A01;
        c34529FJp.A01.setText(string);
        ViewOnClickListenerC35682FpH.A01(c34529FJp.A00, 9, gyn);
        C0f9.A0A(617780062, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj);
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 474128071);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_tag_more);
        A0A.setTag(new C34529FJp(A0A));
        C0f9.A0A(1549793593, A0G);
        return A0A;
    }
}
