package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class GI1 implements InterfaceC153826vr {
    public int A00;
    public View A01;
    public ViewPager A02;
    public TabLayout A03;
    public HashMap A04;
    public boolean A05;
    public final C31787Dy6 A06;

    public GI1(AbstractC10360h2 abstractC10360h2, int i) {
        C14360o3.A0B(abstractC10360h2, 1);
        this.A06 = new C31787Dy6(abstractC10360h2, i);
        this.A04 = AbstractC166987dD.A1G();
    }

    @Override // X.InterfaceC153826vr
    public final boolean Ejk() {
        return false;
    }

    public static final void A00(GI1 gi1) {
        TabLayout tabLayout = gi1.A03;
        if (tabLayout != null) {
            if (gi1.A01 != null) {
                int size = gi1.A06.A01.size();
                View view = gi1.A01;
                if (size < 2) {
                    C14360o3.A0A(view);
                    view.setVisibility(8);
                    tabLayout.setVisibility(8);
                    return;
                } else {
                    C14360o3.A0A(view);
                    view.setVisibility(0);
                    tabLayout.setVisibility(0);
                    AbstractC154366wl.A00(tabLayout, new GI3(1, tabLayout, gi1), AbstractC166997dE.A05(tabLayout.getResources()), AbstractC13880nE.A0A(AbstractC166997dE.A0L(tabLayout)));
                    return;
                }
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void A02() {
        C31787Dy6 c31787Dy6 = this.A06;
        int size = c31787Dy6.A01.size();
        for (int i = 0; i < size; i++) {
            InterfaceC37211GaM interfaceC37211GaM = (InterfaceC37211GaM) c31787Dy6.A00.get(i);
            if (interfaceC37211GaM != null) {
                if (this.A05) {
                    interfaceC37211GaM.ASr();
                } else {
                    interfaceC37211GaM.ATl();
                }
            }
        }
    }

    public final boolean A03() {
        C31787Dy6 c31787Dy6 = this.A06;
        List list = c31787Dy6.A01;
        if (list.size() != 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC37211GaM interfaceC37211GaM = (InterfaceC37211GaM) c31787Dy6.A00.get(i);
                if (interfaceC37211GaM != null && interfaceC37211GaM.CL7()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04() {
        C31787Dy6 c31787Dy6 = this.A06;
        int size = c31787Dy6.A01.size();
        for (int i = 0; i < size; i++) {
            InterfaceC37211GaM interfaceC37211GaM = (InterfaceC37211GaM) c31787Dy6.A00.get(i);
            if (interfaceC37211GaM != null && !interfaceC37211GaM.Bse().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        C31787Dy6 c31787Dy6 = this.A06;
        int size = c31787Dy6.A01.size();
        for (int i = 0; i < size; i++) {
            InterfaceC37211GaM interfaceC37211GaM = (InterfaceC37211GaM) c31787Dy6.A00.get(i);
            if (interfaceC37211GaM != null && !interfaceC37211GaM.Bse().isEmpty()) {
                A1E.addAll(interfaceC37211GaM.Bse());
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC153826vr
    public final boolean CWN() {
        return this.A05;
    }
}
