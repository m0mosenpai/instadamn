package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes8.dex */
public final class M3F implements Runnable {
    public final /* synthetic */ JT7 A00;
    public final /* synthetic */ Map A01;

    public M3F(JT7 jt7, Map map) {
        this.A00 = jt7;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC46147Kbl enumC46147Kbl;
        JT7 jt7 = this.A00;
        SpinnerImageView spinnerImageView = jt7.A04;
        if (spinnerImageView != null) {
            AbstractC43592JPx.A1S(spinnerImageView);
        }
        JT6 jt6 = jt7.A0G;
        Collection<C206409Bx> values = this.A01.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        for (C206409Bx c206409Bx : values) {
            C148276lx c148276lx = (C148276lx) c206409Bx.A00;
            if (c206409Bx.A01 == null) {
                enumC46147Kbl = EnumC46147Kbl.A03;
            } else if (C14360o3.A0K(jt7.A05, c148276lx.A0Z)) {
                enumC46147Kbl = EnumC46147Kbl.A04;
            } else {
                enumC46147Kbl = EnumC46147Kbl.A02;
            }
            A0q.add(new KNG(enumC46147Kbl, c148276lx, jt7.A0N, jt7.A0O, jt7.A06));
        }
        jt6.A05.clear();
        jt6.A01(A0q);
        if (jt7.A0F == EnumC46156Kbu.A03 && (!r3.values().isEmpty())) {
            AbstractC167007dF.A0x(jt7.A01);
        }
    }
}
