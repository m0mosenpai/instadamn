package X;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wki, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70939Wki implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;

    public C70939Wki(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C65867TvU c65867TvU;
        boolean z;
        C38141Gq8 c38141Gq8;
        switch (this.A00) {
            case 0:
                WjJ wjJ = (WjJ) this.A01;
                wjJ.A00.D9Y(wjJ.A01);
                return;
            case 1:
                WjK wjK = (WjK) this.A01;
                wjK.A01.Dwl(wjK.A00);
                return;
            case 2:
                WjK wjK2 = (WjK) this.A01;
                wjK2.A01.DiF(wjK2.A00);
                return;
            case 3:
                ((C65867TvU) this.A01).A0X.A00();
                return;
            case 4:
                c65867TvU = (C65867TvU) this.A01;
                if (c65867TvU.A0D == null) {
                    return;
                }
                z = true;
                if (!c65867TvU.A0I) {
                    c65867TvU.A0I = true;
                    c38141Gq8 = c65867TvU.A0B;
                    if (c38141Gq8 != null) {
                        AbstractC167007dF.A0w(c65867TvU.A09);
                        RecyclerView recyclerView = c65867TvU.A09;
                        if (recyclerView != null) {
                            AbstractC50522MSa.A0y(recyclerView);
                            break;
                        }
                    }
                }
                UserSession userSession = c65867TvU.A0R;
                InterfaceC11380iw interfaceC11380iw = c65867TvU.A0Q;
                String moduleName = interfaceC11380iw.getModuleName();
                boolean z2 = !c65867TvU.A0I;
                C14360o3.A0B(moduleName, 2);
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "explore_dsa_overflow_menu_click");
                A00.AAP("containermodule", moduleName);
                A00.A7v("selected_nonpersonalization", Boolean.valueOf(z2));
                A00.Cht();
            default:
                c65867TvU = (C65867TvU) this.A01;
                if (c65867TvU.A0D != null) {
                    if (c65867TvU.A0I) {
                        z = false;
                        c65867TvU.A0I = false;
                        c38141Gq8 = c65867TvU.A0B;
                        if (c38141Gq8 != null) {
                            AbstractC167007dF.A0x(c65867TvU.A09);
                            RecyclerView recyclerView2 = c65867TvU.A09;
                            if (recyclerView2 != null) {
                                recyclerView2.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                            }
                            C56352iT.A0t.A03(c65867TvU.A0P).A0T();
                            break;
                        }
                    }
                    UserSession userSession2 = c65867TvU.A0R;
                    InterfaceC11380iw interfaceC11380iw2 = c65867TvU.A0Q;
                    String moduleName2 = interfaceC11380iw2.getModuleName();
                    boolean z22 = !c65867TvU.A0I;
                    C14360o3.A0B(moduleName2, 2);
                    C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                    InterfaceC02590Ai A002 = A012.A00(A012.A00, "explore_dsa_overflow_menu_click");
                    A002.AAP("containermodule", moduleName2);
                    A002.A7v("selected_nonpersonalization", Boolean.valueOf(z22));
                    A002.Cht();
                }
                return;
        }
        c38141Gq8.A00(z);
        UserSession userSession22 = c65867TvU.A0R;
        InterfaceC11380iw interfaceC11380iw22 = c65867TvU.A0Q;
        String moduleName22 = interfaceC11380iw22.getModuleName();
        boolean z222 = !c65867TvU.A0I;
        C14360o3.A0B(moduleName22, 2);
        C18920wW A0122 = AbstractC12220kQ.A01(interfaceC11380iw22, userSession22);
        InterfaceC02590Ai A0022 = A0122.A00(A0122.A00, "explore_dsa_overflow_menu_click");
        A0022.AAP("containermodule", moduleName22);
        A0022.A7v("selected_nonpersonalization", Boolean.valueOf(z222));
        A0022.Cht();
    }
}
