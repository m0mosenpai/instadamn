package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERU extends AbstractC65632xz {
    public final Context A00;
    public final C34485FHx A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERU(Context context, C34485FHx c34485FHx) {
        this.A00 = context;
        this.A01 = c34485FHx;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 424763285);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            FLW flw = (FLW) tag;
            C34537FJx c34537FJx = (C34537FJx) obj;
            C34485FHx c34485FHx = this.A01;
            AbstractC167017dG.A1N(flw, c34537FJx);
            C14360o3.A0B(c34485FHx, 2);
            flw.A02.setText(c34537FJx.A01);
            flw.A01.setText(c34537FJx.A00);
            ViewOnClickListenerC35682FpH.A01(flw.A00, 35, c34485FHx);
            C0f9.A0A(-324784476, A0G);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1724318030, A0G);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1527739001);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_hashtags_link_no_qty, false);
        A0C.setTag(new FLW(A0C));
        C0f9.A0A(-629872968, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
