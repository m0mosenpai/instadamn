package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.6vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153896vy extends AbstractC66412zI {
    public final InterfaceC153556vQ A00;
    public final int A01;
    public final int A02;

    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        final View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_creation_entrypoint_item, viewGroup, false);
        C3OO c3oo = new C3OO(inflate) { // from class: X.9UX
        };
        View view = c3oo.itemView;
        C14360o3.A06(view);
        AbstractC13880nE.A0g(view, this.A02);
        View view2 = c3oo.itemView;
        C14360o3.A06(view2);
        AbstractC13880nE.A0W(view2, this.A01);
        C0fQ.A00(new ARD(this), c3oo.itemView);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C153986w7.class;
    }

    public C153896vy(InterfaceC153556vQ interfaceC153556vQ, int i, int i2) {
        this.A00 = interfaceC153556vQ;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
