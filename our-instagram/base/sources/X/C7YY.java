package X;

import android.app.Activity;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7YY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YY {
    public C32731Eax A00;
    public boolean A01;
    public final AbstractC59962oe A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final C163867Va A06;
    public final C164617Ya A07;
    public final String A08;
    public final InterfaceC08830cm A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;
    public final InterfaceC16820sZ A0F;
    public final InterfaceC16820sZ A0G;

    public C7YY(AbstractC59962oe abstractC59962oe, UserSession userSession, C163867Va c163867Va, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC16820sZ, 3);
        C14360o3.A0B(interfaceC16820sZ2, 5);
        C14360o3.A0B(interfaceC16820sZ3, 6);
        C14360o3.A0B(interfaceC16820sZ4, 7);
        C14360o3.A0B(interfaceC16820sZ5, 8);
        this.A02 = abstractC59962oe;
        this.A05 = userSession;
        this.A0G = interfaceC16820sZ;
        this.A06 = c163867Va;
        this.A0F = interfaceC16820sZ2;
        this.A0C = interfaceC16820sZ3;
        this.A0D = interfaceC16820sZ4;
        this.A0E = interfaceC16820sZ5;
        this.A08 = str;
        this.A0A = interfaceC08830cm;
        this.A09 = interfaceC08830cm2;
        this.A0B = interfaceC08830cm3;
        this.A03 = new InterfaceC41501vz() { // from class: X.7YZ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                Long l;
                int A03 = C0f9.A03(-1110312050);
                int A032 = C0f9.A03(-1207539000);
                C7YY c7yy = C7YY.this;
                UserSession userSession2 = c7yy.A05;
                Object obj2 = c7yy.A0A.get();
                C14360o3.A07(obj2);
                C32056E6i A04 = new C35252Fgl(null, userSession2, (C7U0) obj2).A04();
                InterfaceC83733oI interfaceC83733oI = A04.A06;
                if (interfaceC83733oI != null) {
                    AbstractC59962oe abstractC59962oe2 = c7yy.A02;
                    AbstractC35172FfP.A01(abstractC59962oe2.requireContext(), abstractC59962oe2.requireActivity(), abstractC59962oe2, userSession2, A04, null);
                    C142846ck A00 = AbstractC147806l5.A00(userSession2);
                    int i = A04.A00;
                    String A07 = AbstractC1345466e.A07(interfaceC83733oI);
                    String str2 = A04.A0C;
                    C25531Mh A0E = C25531Mh.A0E(A00.A03);
                    if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                        A0E.A0g(Long.valueOf(A00.A02));
                        A0E.A0k("add_collaborators_sheet_rendered");
                        A0E.A0j("tap");
                        A0E.A0o("add_collaborator_promo_banner");
                        A0E.A0p("thread_view");
                        A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
                        A0E.A0r(A07);
                        if (str2 != null) {
                            l = AbstractC003100w.A0k(10, str2);
                        } else {
                            l = null;
                        }
                        A0E.A0h(l);
                        A0E.Cht();
                    }
                }
                C0f9.A0A(-1610039448, A032);
                C0f9.A0A(1827164535, A03);
            }
        };
        this.A07 = new C164617Ya(this);
        this.A04 = new InterfaceC41501vz() { // from class: X.7Yb
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(744053605);
                C36080FwG c36080FwG = (C36080FwG) obj;
                int A032 = C0f9.A03(-229884566);
                C14360o3.A0B(c36080FwG, 0);
                Integer num = c36080FwG.A00;
                if (num != null && num.intValue() == 475) {
                    C7YY c7yy = C7YY.this;
                    FragmentActivity activity = c7yy.A02.getActivity();
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        C193328hC c193328hC = new C193328hC((Activity) activity);
                        c193328hC.A0A(2131954945);
                        c193328hC.A09(2131954944);
                        c193328hC.A07();
                        c193328hC.A0H(new DialogInterfaceOnClickListenerC35306Fhh(c7yy), 2131954943);
                        C0fJ.A00(c193328hC.A02());
                    }
                }
                C0f9.A0A(-1744177042, A032);
                C0f9.A0A(1775226403, A03);
            }
        };
    }

    public static final void A00(C7YY c7yy, String str) {
        C3OO A0V = ((RecyclerView) c7yy.A0B.get()).A0V(((C7U0) c7yy.A0A.get()).BT6().CNL(str));
        if (A0V != null) {
            A0V.itemView.startAnimation(AnimationUtils.loadAnimation(c7yy.A02.requireContext(), R.anim.bounce));
        }
    }
}
