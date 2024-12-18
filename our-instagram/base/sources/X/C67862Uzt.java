package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;

/* renamed from: X.Uzt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67862Uzt extends AbstractC72463Mt implements InterfaceC60072op, InterfaceC72040XGi {
    public static final String __redex_internal_original_name = "IgNativeCdsBottomSheetFragment";
    public C66204U4a A00;
    public C65981Txa A01;
    public CWZ A02;
    public CW5 A03;
    public final U59 A06 = new Object();
    public final InterfaceC09390do A05 = AbstractC60492pY.A01(this);
    public Integer A04 = C05F.A0C;

    @Override // X.InterfaceC72040XGi
    public final View AVS(String str) {
        C14360o3.A0B(str, 0);
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        return c66204U4a.A05(str);
    }

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC140796Yh.A01(this, i2, z, true);
    }

    @Override // X.AbstractC72473Mu, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            bundle.putBoolean("from_changing_configuration)", true);
        }
        C65981Txa c65981Txa = this.A01;
        if (c65981Txa == null) {
            C14360o3.A0F("openScreenConfig");
            throw C00O.createAndThrow();
        }
        bundle.putBundle("cds_open_screen_config", c65981Txa.A00());
        CWZ cwz = this.A02;
        if (cwz != null) {
            bundle.putInt("container", AbstractC66261U6f.A00(cwz));
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CW5 cw5 = this.A03;
        if (cw5 != null) {
            CWZ cwz = this.A02;
            if (cwz != null) {
                cwz.A01(cw5);
            }
            this.A03 = null;
        }
        U59 u59 = this.A06;
        C65981Txa c65981Txa = this.A01;
        if (c65981Txa == null) {
            C14360o3.A0F("openScreenConfig");
            throw C00O.createAndThrow();
        }
        u59.A01(view, this, c65981Txa);
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        Context A02;
        C65981Txa c65981Txa = this.A01;
        String str = "openScreenConfig";
        if (c65981Txa != null) {
            if (c65981Txa.A0E != U6H.A07) {
                C66204U4a c66204U4a = this.A00;
                if (c66204U4a == null) {
                    str = "bottomSheetDelegate";
                } else {
                    Context requireContext = requireContext();
                    C65981Txa c65981Txa2 = this.A01;
                    if (c65981Txa2 != null) {
                        DialogC51582Yg A08 = c66204U4a.A08(requireContext, this, c65981Txa2);
                        C14360o3.A07(A08);
                        Integer num = this.A04;
                        if (num != C05F.A0C) {
                            Integer num2 = C05F.A00;
                            Context requireContext2 = requireContext();
                            if (num == num2) {
                                A02 = AbstractC53172bz.A01(requireContext2);
                            } else {
                                A02 = AbstractC53172bz.A02(requireContext2);
                            }
                            Window window = A08.getWindow();
                            if (window != null) {
                                window.setNavigationBarColor(A02.getColor(AbstractC53242c7.A0D(A02)));
                            }
                        }
                        return A08;
                    }
                }
            } else {
                throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC72483Mv
    public final void A0J() {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        C66212U4i c66212U4i = (C66212U4i) c66204U4a.A0G.peek();
        if (c66212U4i != null) {
            c66212U4i.A03.pause();
        }
    }

    @Override // X.AbstractC72463Mt
    public final AbstractC12990ll A0M() {
        return (AbstractC12990ll) this.A05.getValue();
    }

    @Override // X.InterfaceC72040XGi
    public final boolean AJm(String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        Iterator it = c66204U4a.A0G.iterator();
        while (it.hasNext()) {
            if (str.equals(((C66212U4i) it.next()).A03.Aga())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC72040XGi
    public final void APk(VBq vBq, Runnable runnable) {
        String str;
        C65981Txa c65981Txa = this.A01;
        if (c65981Txa == null) {
            str = "openScreenConfig";
        } else {
            if (c65981Txa.A0E == U6H.A07) {
                AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                if (parentFragmentManager.A0L() > 0 && !parentFragmentManager.A0G) {
                    parentFragmentManager.A0b();
                } else {
                    AbstractC25231BEo.A16(this);
                }
            }
            C66204U4a c66204U4a = this.A00;
            if (c66204U4a == null) {
                str = "bottomSheetDelegate";
            } else {
                c66204U4a.A0K(vBq, runnable);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72040XGi
    public final U6H BUG() {
        C65981Txa c65981Txa = this.A01;
        if (c65981Txa == null) {
            C14360o3.A0F("openScreenConfig");
            throw C00O.createAndThrow();
        }
        return c65981Txa.A0E;
    }

    @Override // X.InterfaceC72040XGi
    public final XBU Bdi(EnumC68125VCj enumC68125VCj) {
        throw new UnsupportedOperationException("Native fragment should not be used with platform behaviors");
    }

    @Override // X.InterfaceC72040XGi
    public final Window CHl() {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        return c66204U4a.A06(requireContext());
    }

    @Override // X.InterfaceC72040XGi
    public final void COd(InterfaceC72001XEp interfaceC72001XEp, C68111VBu c68111VBu, String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0J(interfaceC72001XEp, c68111VBu, str);
    }

    @Override // X.InterfaceC72040XGi
    public final void E2M(InterfaceC72001XEp interfaceC72001XEp, U5A u5a) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        Context requireContext = requireContext();
        Integer num = C05F.A00;
        int i = u5a.A00;
        C66204U4a.A00(requireContext, c66204U4a, interfaceC72001XEp, ((U50) u5a).A00, u5a.A01, num, i, u5a.A02);
    }

    @Override // X.InterfaceC72040XGi
    public final void E4d(C68108VBr c68108VBr) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0F(requireContext(), c68108VBr, null);
    }

    @Override // X.InterfaceC72040XGi
    public final void E4e(String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0F(requireContext(), new C68108VBr(null), str);
    }

    @Override // X.InterfaceC72040XGi
    public final void E6r(InterfaceC72001XEp interfaceC72001XEp, VBp vBp) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0D(requireContext(), interfaceC72001XEp, vBp);
    }

    @Override // X.InterfaceC72040XGi
    public final void EEk(String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0N(str);
    }

    @Override // X.InterfaceC72040XGi
    public final void EH2(InterfaceC72001XEp interfaceC72001XEp, C68109VBs c68109VBs, String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0E(requireContext(), interfaceC72001XEp, c68109VBs, str);
    }

    @Override // X.InterfaceC72040XGi
    public final void ESk(Drawable drawable) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        C66206U4c c66206U4c = c66204U4a.A03;
        if (c66206U4c != null) {
            c66206U4c.setCustomBackgroundDrawable(drawable);
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void EWq(boolean z) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        DialogC51582Yg dialogC51582Yg = c66204U4a.A07;
        if (dialogC51582Yg != null) {
            dialogC51582Yg.A09.A0B = z;
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void F9u(C68110VBt c68110VBt, String str) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        Context requireContext = requireContext();
        if (c66204U4a.A0G.size() != 1) {
            c66204U4a.A0G(requireContext, c68110VBt.A00, str);
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void FAK(XBX xbx) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        C66212U4i c66212U4i = (C66212U4i) c66204U4a.A0G.peek();
        if (c66212U4i != null) {
            c66212U4i.A01 = xbx;
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void FAP(ColorData colorData, U6H u6h) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0H(colorData, u6h);
    }

    @Override // X.InterfaceC72040XGi
    public final void FBS(ColorData colorData, float f) {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        requireContext();
        c66204U4a.A0I(colorData, Float.valueOf(f));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A09;
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null || (A09 = c66204U4a.A09()) == null) {
            return "native_cds_fragment_screen_uninitialized";
        }
        return A09;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0B(requireContext());
        return true;
    }

    @Override // X.AbstractC72463Mt, X.AbstractC72483Mv
    public final void A0I() {
        super.A0I();
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        C66212U4i c66212U4i = (C66212U4i) c66204U4a.A0G.peek();
        if (c66212U4i != null) {
            c66212U4i.A03.EKd();
        }
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int i;
        int A02 = C0f9.A02(-1236519708);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new C66204U4a(null);
        if (bundle == null) {
            bundle2 = requireArguments.getBundle("cds_open_screen_config");
        } else {
            bundle2 = bundle.getBundle("cds_open_screen_config");
        }
        C69513Vps c69513Vps = C65981Txa.A0O;
        if (bundle2 != null) {
            this.A01 = c69513Vps.A00(bundle2);
            if (bundle != null) {
                A07();
                i = -316401355;
            } else {
                int i2 = requireArguments.getInt("containerArguments", -1);
                C65981Txa c65981Txa = this.A01;
                if (c65981Txa == null) {
                    C14360o3.A0F("openScreenConfig");
                    throw C00O.createAndThrow();
                }
                this.A04 = c65981Txa.A0F;
                Object A022 = AbstractC66261U6f.A02(CW5.class, Integer.valueOf(i2));
                C14360o3.A0C(A022, "null cannot be cast to non-null type com.meta.foa.cds.bottomsheet.CdsBottomSheetOpenContainerArgs<kotlin.Any, com.meta.foa.screens.DataSource>");
                CW5 cw5 = (CW5) A022;
                Context requireContext = requireContext();
                FoaUserSession foaUserSession = cw5.A03;
                Context requireContext2 = requireContext();
                Integer num = this.A04;
                C14360o3.A0B(num, 1);
                int intValue = num.intValue();
                boolean z = true;
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            z = AbstractC72723Nt.A00(requireContext2);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        z = false;
                    }
                }
                CWZ cwz = new CWZ(requireContext, foaUserSession, z);
                cwz.A00 = this;
                this.A02 = cwz;
                this.A03 = cw5;
                this.A06.A00 = Integer.valueOf(C30D.A00(getRootActivity()));
                i = -1331985045;
            }
            C0f9.A09(i, A02);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("openSheetConfig not found in bundle");
        C0f9.A09(-1182909881, A02);
        throw illegalStateException;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1348649266);
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            str = "bottomSheetDelegate";
        } else {
            Context requireContext = requireContext();
            C65981Txa c65981Txa = this.A01;
            if (c65981Txa == null) {
                str = "openScreenConfig";
            } else {
                C66206U4c A07 = c66204U4a.A07(requireContext, new WTJ(this), c65981Txa, AbstractC52802bM.A01(requireActivity()));
                C14360o3.A07(A07);
                C0f9.A09(1114483566, A02);
                return A07;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1563966764);
        super.onDestroy();
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0C(requireContext());
        CWZ cwz = this.A02;
        if (cwz != null) {
            cwz.A00 = null;
        }
        C0f9.A09(-2046352579, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(284712847);
        super.onDestroyView();
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            C14360o3.A0F("bottomSheetDelegate");
            throw C00O.createAndThrow();
        }
        c66204U4a.A0A();
        this.A06.A02(this);
        C0f9.A09(1501752648, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDetach() {
        String str;
        int A02 = C0f9.A02(-141360730);
        super.onDetach();
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            str = "bottomSheetDelegate";
        } else {
            C65981Txa c65981Txa = this.A01;
            if (c65981Txa == null) {
                str = "openScreenConfig";
            } else {
                c66204U4a.A0L(c65981Txa);
                C0f9.A09(-413346698, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        int A02 = C0f9.A02(-1380871513);
        super.onStart();
        C66204U4a c66204U4a = this.A00;
        if (c66204U4a == null) {
            str = "bottomSheetDelegate";
        } else {
            C65981Txa c65981Txa = this.A01;
            if (c65981Txa == null) {
                str = "openScreenConfig";
            } else {
                c66204U4a.A0M(c65981Txa);
                C0f9.A09(917778981, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
