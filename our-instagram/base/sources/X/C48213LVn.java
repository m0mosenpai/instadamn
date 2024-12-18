package X;

import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.LVn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48213LVn implements InterfaceC55932he {
    public float A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final C55982hj A04;
    public final InterfaceC193848i5 A05;
    public final List A06;

    public C48213LVn(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC193848i5 interfaceC193848i5) {
        AbstractC167017dG.A1R(viewGroup2, interfaceC193848i5);
        this.A03 = viewGroup;
        this.A02 = viewGroup2;
        this.A01 = AbstractC31176DnK.A0C(viewGroup, R.id.gallery_container_coordinator);
        this.A05 = interfaceC193848i5;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A04(40.0d, 8.0d));
        A0R.A06 = true;
        this.A04 = A0R;
        this.A06 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        ViewGroup viewGroup = this.A01;
        int height = viewGroup.getHeight();
        this.A00 = (float) Math.min(Math.max(AbstractC70163Da.A04(f, 0.0d, height, 0.0d, 1.0d), 0.0d), 1.0d);
        ViewGroup viewGroup2 = this.A03;
        viewGroup2.setTranslationY(0.0f);
        AbstractC43593JPy.A1A(viewGroup2);
        float max = Math.max(f, 0.0f);
        float f2 = height;
        if (max > f2) {
            max = ((max - f2) * 0.15f) + f2;
        }
        this.A02.setTranslationY(-max);
        viewGroup.setTranslationY(f2 - max);
        viewGroup.setVisibility(f <= 0.0f ? 4 : 0);
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((MO7) list.get(i)).DJ2(this.A00, f);
        }
    }
}
