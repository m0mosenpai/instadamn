package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEN extends C7E1 implements InterfaceC65242xM, InterfaceC65252xN, InterfaceC152956uP {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C155946zO A02;
    public final C152976uR A03;
    public final InterfaceC62602sz A04;
    public final Context A05;
    public final C155376yQ A06;
    public final C153006uU A07;
    public final C152996uT A08;
    public final C65842yM A09;
    public final Map A0A;

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC37304Gc5.A0G(str, this.A0A);
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
    }

    public HEN(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C155376yQ c155376yQ, C38U c38u, InterfaceC62602sz interfaceC62602sz) {
        AbstractC167017dG.A1T(userSession, c38u);
        this.A05 = context;
        this.A06 = c155376yQ;
        this.A04 = interfaceC62602sz;
        this.A00 = c57112jm;
        this.A0A = AbstractC166987dD.A1G();
        C65842yM c65842yM = new C65842yM(context);
        this.A09 = c65842yM;
        C153006uU c153006uU = new C153006uU(context);
        this.A07 = c153006uU;
        C152996uT c152996uT = new C152996uT(context);
        this.A08 = c152996uT;
        this.A02 = new C155946zO(null, c38u, C05F.A01);
        this.A01 = new C63622uj();
        C152976uR c152976uR = new C152976uR(interfaceC11380iw, userSession, null, new C42620Itd(userSession, fragmentActivity), c38u, null, null);
        this.A03 = c152976uR;
        c152976uR.A01 = new C42621Ite(this);
        A0B(c153006uU, c152976uR, c65842yM, c152996uT);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.IC8, java.lang.Object] */
    public final void A0C() {
        EnumC153216up enumC153216up;
        A06();
        this.A01.A00.clear();
        C155946zO c155946zO = this.A02;
        c155946zO.A08(this.A06);
        if (AbstractC166987dD.A1b(((AbstractC65332xV) c155946zO).A01)) {
            ?? obj = new Object();
            obj.A00 = this.A05.getString(2131966066);
            A08(this.A07, obj);
            int A02 = c155946zO.A02();
            for (int i = 0; i < A02; i++) {
                C153126ug A0F = c155946zO.A0F(i);
                C153336v2 BQs = BQs(AbstractC166997dE.A0u(A0F));
                boolean z = true;
                if (this.A04.CLJ() || i != c155946zO.A02() - 1) {
                    z = false;
                }
                BQs.A00(i, z);
                A09(this.A03, A0F, BQs);
            }
            InterfaceC62602sz interfaceC62602sz = this.A04;
            if (interfaceC62602sz.CLJ()) {
                A08(this.A09, interfaceC62602sz);
            }
        } else {
            C1571273r A0J = AbstractC37300Gc1.A0J();
            if (this.A04.CUG()) {
                enumC153216up = EnumC153216up.A04;
                A0J.A02 = R.drawable.loadmore_icon_refresh_compound;
                A0J.A05 = ViewOnClickListenerC42032Ik1.A00(this, 1);
            } else {
                Resources resources = this.A05.getResources();
                enumC153216up = EnumC153216up.A02;
                A0J.A02 = R.drawable.empty_state_private;
                A0J.A0D = resources.getString(2131966065);
                A0J.A07 = resources.getString(2131966064);
            }
            A09(this.A08, A0J, enumC153216up);
        }
        A07();
    }
}
