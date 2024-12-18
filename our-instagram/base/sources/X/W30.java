package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;

/* loaded from: classes11.dex */
public final class W30 {
    public EnumC68126VCk A00;
    public final int A01;
    public final Fragment A02;
    public final AbstractC10360h2 A03;
    public final ActivityLifecycleTracker A04;
    public final UF5 A05;
    public final UKR A06;
    public final Integer A07;
    public final InterfaceC71943XBs A08;

    public static final void A00(W30 w30, EnumC68126VCk enumC68126VCk) {
        InterfaceC71943XBs interfaceC71943XBs;
        Integer num;
        if (enumC68126VCk != w30.A00) {
            w30.A00 = enumC68126VCk;
            int ordinal = enumC68126VCk.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        interfaceC71943XBs = w30.A08;
                        num = C05F.A0C;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    interfaceC71943XBs = w30.A08;
                    num = C05F.A01;
                }
                interfaceC71943XBs.DEl(num);
                return;
            }
            w30.A08.DDk();
        }
    }

    public W30(Fragment fragment, InterfaceC71943XBs interfaceC71943XBs) {
        UF5 uf5;
        this.A02 = fragment;
        this.A08 = interfaceC71943XBs;
        AbstractC10360h2 parentFragmentManager = fragment.getParentFragmentManager();
        this.A03 = parentFragmentManager;
        this.A01 = parentFragmentManager.A0L();
        UKR ukr = new UKR(this);
        this.A06 = ukr;
        FragmentActivity requireActivity = fragment.requireActivity();
        C57560PgY c57560PgY = new C57560PgY(this, 41);
        this.A04 = new ActivityLifecycleTracker(requireActivity, c57560PgY);
        if (fragment.mParentFragment != null) {
            AbstractC10360h2 parentFragmentManager2 = fragment.requireParentFragment().getParentFragmentManager();
            int A0L = parentFragmentManager2.A0L();
            this.A07 = Integer.valueOf(A0L);
            uf5 = new UF5(fragment.requireParentFragment(), parentFragmentManager2, c57560PgY, A0L);
        } else {
            uf5 = null;
            this.A07 = null;
        }
        this.A05 = uf5;
        if (!((UF5) ukr).A00) {
            ((UF5) ukr).A00 = true;
            AbstractC10360h2 abstractC10360h2 = ukr.A03;
            abstractC10360h2.A0q(ukr, false);
            abstractC10360h2.A0r(ukr);
        }
    }
}
