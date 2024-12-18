package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.PgS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57554PgS extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57554PgS(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57554PgS(obj, i));
    }

    public static C57554PgS A01(Object obj, int i) {
        return new C57554PgS(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C50853Mdk(abstractC59962oe.requireArguments(), abstractC59962oe, abstractC59962oe);
            case 1:
            case 5:
            case 8:
            case 11:
            case 17:
            case 21:
            case 27:
            case 31:
            case 35:
            case 45:
                return this.A01;
            case 2:
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
            case 22:
            case 28:
            case 32:
            case 36:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 7:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 37:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                C53022Ncu c53022Ncu = (C53022Ncu) this.A01;
                return new C50843Mda(c53022Ncu.mArguments, c53022Ncu, AbstractC166987dD.A0r(c53022Ncu.A03));
            case 14:
                C52573NNt c52573NNt = (C52573NNt) this.A01;
                InterfaceC09390do interfaceC09390do = c52573NNt.A04;
                return new C50846Mdd(c52573NNt.mArguments, c52573NNt, MSW.A0e(interfaceC09390do).A0H, MSW.A0e(interfaceC09390do).A0I);
            case Process.SIGTERM /* 15 */:
                return new C52283NBy(MSW.A0e(((C52573NNt) this.A01).A04).A0I, "lead_ad_question_page");
            case 16:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50847Mde(abstractC59962oe2.requireArguments(), abstractC59962oe2, abstractC59962oe2);
            case 20:
                AbstractC59962oe abstractC59962oe3 = (AbstractC59962oe) this.A01;
                return new C50854Mdl(abstractC59962oe3.requireArguments(), abstractC59962oe3, abstractC59962oe3);
            case 24:
            case 30:
                AbstractC59962oe abstractC59962oe4 = (AbstractC59962oe) this.A01;
                return new C50852Mdj(abstractC59962oe4.requireArguments(), abstractC59962oe4, abstractC59962oe4);
            case 25:
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC25235BEs.A0U(this.A01);
            case 26:
                return AbstractC50523MSb.A0A(this.A01);
            case 34:
                Fragment fragment = (Fragment) this.A01;
                return new C50844Mdb(fragment.requireArguments(), fragment);
            case 38:
                Fragment fragment2 = (Fragment) this.A01;
                FragmentActivity requireActivity = fragment2.requireActivity();
                String[] iSOCountries = Locale.getISOCountries();
                C14360o3.A07(iSOCountries);
                ArrayList A17 = AbstractC25225BEi.A17(iSOCountries.length);
                for (String str : iSOCountries) {
                    C14360o3.A0A(str);
                    A17.add(C55205OeH.A00(requireActivity, str));
                }
                return new C50855Mdm(fragment2.requireArguments(), fragment2, C55205OeH.A00(fragment2.requireActivity(), ""), C50583MUt.A00(AbstractC001800i.A0a(AbstractC001800i.A0k(A17)), 14));
            case 39:
                N6F n6f = (N6F) this.A01;
                return new C67982V4x(n6f.A03().A02(), AbstractC37302Gc3.A0L(n6f.requireContext(), n6f.requireActivity(), n6f.A03().A02()));
            case Seq.NULL_REFNUM /* 41 */:
                C52108N4g c52108N4g = (C52108N4g) this.A01;
                C66392zG A00 = C66362zD.A00(c52108N4g.requireActivity());
                A00.A08 = true;
                C66362zD A0R = AbstractC31173DnH.A0R(A00, new KIA(new C55870OrK(c52108N4g), c52108N4g, ((UFL) c52108N4g.A07.getValue()).A06, 1.0f));
                A0R.A05(AbstractC31171DnF.A0E());
                return A0R;
            case 43:
                C52108N4g c52108N4g2 = (C52108N4g) this.A01;
                Context requireContext = c52108N4g2.requireContext();
                InterfaceC09390do interfaceC09390do2 = c52108N4g2.A06;
                return new C67982V4x(AbstractC166987dD.A0r(interfaceC09390do2), AbstractC37302Gc3.A0L(requireContext, c52108N4g2.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do2)));
            case 44:
                return new C51109MiE(AbstractC31172DnG.A06(this.A01), 3);
            case 48:
                Fragment fragment3 = (Fragment) this.A01;
                return new C50845Mdc(fragment3.requireArguments(), fragment3);
            case 49:
                return new C51753Mtc[((InterfaceC19390xP[]) this.A01).length];
        }
    }
}
