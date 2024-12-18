package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* renamed from: X.Bsp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26827Bsp extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60152ox, InterfaceC20340zA {
    public static final String __redex_internal_original_name = "MagicModFragment";
    public MagicModLaunchParams A00;
    public EnumC193878i8 A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final C00M A05 = new C00M(new Runnable() { // from class: X.D14
        @Override // java.lang.Runnable
        public final void run() {
            C26827Bsp.A00(C26827Bsp.this);
        }
    });
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new DGV(this, 2), new DGV(this, 1), new DH0(12, null, this), AbstractC25225BEi.A1D(C8CS.class));
    public final C3I9 A07 = C3I7.A01(this, false, true);
    public final InterfaceC74953Yl A06 = AbstractC25230BEn.A0U(0);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A07.A9e(this);
    }

    public static final void A00(C26827Bsp c26827Bsp) {
        C8CS.A03((C8CS) c26827Bsp.A08.getValue(), false);
        if (c26827Bsp.A03) {
            AbstractC25227BEk.A1B(c26827Bsp);
        } else {
            A01(c26827Bsp);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        AbstractC25227BEk.A19(this.A06, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        EnumC193878i8 enumC193878i8 = this.A01;
        if (enumC193878i8 == null) {
            return "ig_stories_magic_mod_hub";
        }
        int ordinal = enumC193878i8.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return "ig_stories_magic_mod_expander";
                }
                throw B4Z.A00();
            }
            return "ig_stories_magic_mod_backdrop";
        }
        return "ig_stories_magic_mod_restyle";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A09), 36325059568087731L)) {
            C00M c00m = this.A05;
            boolean z = c00m.A01;
            c00m.A04();
            if (!z && !this.A03) {
                return false;
            }
            return true;
        }
        A00(this);
        return this.A03;
    }

    public static final void A01(C26827Bsp c26827Bsp) {
        if (c26827Bsp.getParentFragmentManager().A0L() > 0) {
            c26827Bsp.getParentFragmentManager().A0x("MAGIC_MOD", 1);
        }
    }

    @Override // X.InterfaceC20340zA
    public final C00M getOnBackPressedDispatcher() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(597681864);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getBoolean("is_gen_ai_try_on_mode");
            String string = bundle2.getString("camera_tool");
            if (string != null) {
                EnumC193878i8 A00 = AbstractC141306a9.A00(C51T.A00(string));
                if (A00 != null) {
                    this.A01 = A00;
                    this.A00 = (MagicModLaunchParams) AbstractC153636vY.A00(bundle2, MagicModLaunchParams.class, "launch_params");
                    this.A02 = bundle2.getString("prompt");
                    this.A04 = !((C8CS) this.A08.getValue()).A08;
                    C0f9.A09(1807260385, A02);
                    return;
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -109331968;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1518887300;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1407392311;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1472644291);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 8), -1754357739);
        C0f9.A09(752587376, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(943002941);
        super.onDestroy();
        this.A07.EFx(this);
        C0f9.A09(1693153715, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-20881521);
        super.onPause();
        this.A07.onStop();
        C0f9.A09(-503367709, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(1990049774);
        super.onResume();
        if (this.A04) {
            if (this.A03) {
                AbstractC25227BEk.A1B(this);
            } else {
                A01(this);
            }
            i = 834993619;
        } else {
            this.A07.Dnr(getActivity());
            i = -985768518;
        }
        C0f9.A09(i, A02);
    }
}
