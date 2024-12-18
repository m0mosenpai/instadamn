package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.NdA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53038NdA extends AbstractC52334NDy {
    public final C8SF A00;
    public final JPS A01;
    public final AbstractC52113N4l A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53038NdA(C8SF c8sf, JPS jps, InterfaceC153826vr interfaceC153826vr, AbstractC52113N4l abstractC52113N4l) {
        super(interfaceC153826vr);
        C14360o3.A0B(jps, 3);
        this.A00 = c8sf;
        this.A02 = abstractC52113N4l;
        this.A01 = jps;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.wall_selectable_grid_item, viewGroup, false);
        AbstractC43593JPy.A1B(inflate, -2);
        return new C52512NLf(inflate);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C27293C2z c27293C2z = (C27293C2z) interfaceC66482zP;
        HKN hkn = (HKN) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c27293C2z, hkn);
        ?? obj = new Object();
        C56051OuQ c56051OuQ = new C56051OuQ(3, hkn, obj);
        Medium medium = c27293C2z.A00.A00.A00;
        if (medium != null) {
            obj.A00 = A1a;
            this.A00.A04(medium, c56051OuQ);
        }
        ViewOnClickListenerC55468OkN.A00(((C38160GqR) hkn).A00, 63, c27293C2z, this);
        AbstractC40615HzZ.A00(hkn, c27293C2z, super.A01, super.A02, super.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C27293C2z.class;
    }
}
