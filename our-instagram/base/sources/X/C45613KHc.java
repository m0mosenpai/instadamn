package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KHc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45613KHc extends AbstractC66412zI {
    public final C47425KxG A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44639Jpj(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_timeline_camera_entrypoint_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45656KIt c45656KIt = (C45656KIt) interfaceC66482zP;
        C44639Jpj c44639Jpj = (C44639Jpj) c3oo;
        AbstractC167017dG.A1N(c45656KIt, c44639Jpj);
        ViewOnClickListenerC48062LPn.A00(c44639Jpj.itemView, 66, this);
        c44639Jpj.A00.setAlpha(c45656KIt.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45656KIt.class;
    }

    public C45613KHc(C47425KxG c47425KxG) {
        this.A00 = c47425KxG;
    }
}
