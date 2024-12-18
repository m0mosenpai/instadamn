package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Iterator;

/* renamed from: X.U4d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66207U4d extends AbstractC72463Mt implements InterfaceC60072op, InterfaceC72040XGi, InterfaceC72763Nx, InterfaceC72523Mz, C08V {
    public static final String __redex_internal_original_name = "IgCdsBottomSheetFragment";
    public W2o A00;
    public AbstractC12990ll A01;
    public C65981Txa A02;
    public C66204U4a A03;
    public final U59 A05 = new Object();
    public final InterfaceC71883X8q A04 = new InterfaceC71883X8q() { // from class: X.WTI
        @Override // X.InterfaceC71883X8q
        public final void DAz() {
            U59.A00(C66207U4d.this);
        }
    };

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC140796Yh.A01(this, i2, z, true);
    }

    public static C66204U4a A01(C66207U4d c66207U4d) {
        C66204U4a c66204U4a = c66207U4d.A03;
        if (c66204U4a != null) {
            return c66204U4a;
        }
        throw new IllegalStateException("Must initialize bottom sheet delegate");
    }

    public static C66207U4d A02(InterfaceC72023XFl interfaceC72023XFl, IgBloksScreenConfig igBloksScreenConfig, AbstractC12990ll abstractC12990ll, C65981Txa c65981Txa) {
        Bundle bundle = new Bundle();
        AbstractC31175DnJ.A0r(bundle, abstractC12990ll);
        bundle.putBundle("cds_open_screen_config", c65981Txa.A00());
        bundle.putString("cds_platform", "Bloks");
        IgBloksScreenConfig.A03(bundle, igBloksScreenConfig, C1AD.A06(C06090Tz.A05, 18310033993511078L));
        C70145W6y.A00(bundle, interfaceC72023XFl);
        C66207U4d c66207U4d = new C66207U4d();
        c66207U4d.setArguments(bundle);
        return c66207U4d;
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        if (c65981Txa.A0E != U6H.A07) {
            C66204U4a A01 = A01(this);
            Context requireContext = requireContext();
            C65981Txa c65981Txa2 = this.A02;
            c65981Txa2.getClass();
            return A01.A08(requireContext, this, c65981Txa2);
        }
        throw new UnsupportedOperationException("onCreateDialog() is not supported for CDS full screen.");
    }

    @Override // X.AbstractC72463Mt
    public final AbstractC12990ll A0M() {
        return this.A01;
    }

    @Override // X.InterfaceC72040XGi
    public final void APk(VBq vBq, Runnable runnable) {
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        if (c65981Txa.A0E == U6H.A07) {
            U59.A00(this);
        }
        A01(this).A0K(vBq, runnable);
    }

    @Override // X.InterfaceC72040XGi
    public final U6H BUG() {
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        return c65981Txa.A0E;
    }

    @Override // X.InterfaceC72040XGi
    public final XBU Bdi(EnumC68125VCj enumC68125VCj) {
        W2o w2o = this.A00;
        if (w2o != null) {
            C14360o3.A0B(enumC68125VCj, 0);
            C09530e4 c09530e4 = (C09530e4) w2o.A04.get(enumC68125VCj);
            if (c09530e4 == null) {
                c09530e4 = W2o.A00(null, w2o, enumC68125VCj);
            }
            return (XBU) c09530e4.A00;
        }
        throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
    }

    @Override // X.InterfaceC72040XGi
    public final void EWq(boolean z) {
        DialogC51582Yg dialogC51582Yg;
        C66204U4a c66204U4a = this.A03;
        if (c66204U4a != null && (dialogC51582Yg = c66204U4a.A07) != null) {
            dialogC51582Yg.A09.A0B = z;
        }
    }

    public final void A0N(ColorData colorData) {
        int i;
        C66204U4a A01 = A01(this);
        requireContext();
        C66206U4c c66206U4c = A01.A03;
        if (c66206U4c != null) {
            C6FH c6fh = A01.A0A;
            c6fh.getClass();
            if (c6fh.CSL()) {
                i = colorData.A00;
            } else {
                i = colorData.A01;
            }
            c66206U4c.A02 = i;
            c66206U4c.A01 = Color.alpha(i);
        }
    }

    @Override // X.InterfaceC72040XGi
    public final boolean AJm(String str) {
        Iterator it = A01(this).A0G.iterator();
        while (it.hasNext()) {
            if (str.equals(((C66212U4i) it.next()).A03.Aga())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC72040XGi
    public final View AVS(String str) {
        return A01(this).A05(str);
    }

    @Override // X.InterfaceC72523Mz
    public final String BUi() {
        String A09 = A01(this).A09();
        if (A09 == null) {
            W2o w2o = this.A00;
            if (w2o != null) {
                XBU xbu = w2o.A01;
                if (xbu == null) {
                    C14360o3.A0F("behavior");
                    throw C00O.createAndThrow();
                }
                C69750Vuk Aba = xbu.Aba();
                if (Aba != null) {
                    return Aba.A01;
                }
                return "";
            }
            throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
        }
        return A09;
    }

    @Override // X.InterfaceC72040XGi
    public final Window CHl() {
        return A01(this).A06(requireContext());
    }

    @Override // X.InterfaceC72040XGi
    public final void COd(InterfaceC72001XEp interfaceC72001XEp, C68111VBu c68111VBu, String str) {
        A01(this).A0J(interfaceC72001XEp, c68111VBu, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r8 != 7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r8 != 7) goto L13;
     */
    @Override // X.InterfaceC72763Nx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DfM(int r8) {
        /*
            r7 = this;
            X.U4a r5 = A01(r7)
            X.U4c r2 = r5.A03
            if (r2 == 0) goto L86
            X.U4j r6 = r2.A06
            if (r6 == 0) goto L86
            java.lang.Integer r1 = X.C05F.A0u
            X.1Lh r0 = X.AbstractC25291Lj.A00
            X.8em r0 = r0.C73()
            r4 = 0
            X.C14360o3.A0B(r0, r4)
            X.DlE r0 = X.XPC.A00(r0)
            boolean r0 = r0.AVw(r1)
            if (r0 == 0) goto L86
            X.VFx r3 = r2.A0I
            X.VFx r0 = X.EnumC68205VFx.A06
            r2 = 7
            r1 = 1
            if (r3 != r0) goto L74
            if (r8 == 0) goto L83
            if (r8 == r1) goto L83
            if (r8 == r2) goto L7f
        L30:
            r0 = 5
            if (r8 == r0) goto L45
            r0 = 6
            if (r8 != r0) goto L44
            X.U55 r0 = r5.A06
            if (r0 == 0) goto L44
            android.os.Handler r3 = r0.A02
            X.U5d r2 = new X.U5d
            r2.<init>(r0)
        L41:
            r3.post(r2)
        L44:
            return
        L45:
            X.U56 r0 = r5.A05
            if (r0 == 0) goto L44
            X.U4c r0 = r5.A03
            if (r0 == 0) goto L44
            X.U55 r2 = r5.A06
            if (r2 == 0) goto L5b
            android.os.Handler r1 = r2.A02
            X.U5d r0 = new X.U5d
            r0.<init>(r2)
            r1.post(r0)
        L5b:
            X.WqO r0 = new X.WqO
            r0.<init>()
            X.C11T.A02(r0)
            X.U56 r4 = r5.A05
            X.U4c r1 = r5.A03
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 1
            android.os.Handler r3 = r4.A02
            X.Wvg r2 = new X.Wvg
            r2.<init>(r1, r4, r0)
            goto L41
        L74:
            X.VFx r0 = X.EnumC68205VFx.A05
            if (r3 != r0) goto L86
            if (r8 == 0) goto L7f
            if (r8 == r1) goto L7f
            if (r8 == r2) goto L83
            goto L30
        L7f:
            r6.setIsSwirlAnimating(r4)
            goto L86
        L83:
            r6.setIsSwirlAnimating(r1)
        L86:
            if (r8 != 0) goto L30
            X.U55 r1 = r5.A06
            if (r1 == 0) goto L44
            X.U4c r0 = r5.A03
            if (r0 == 0) goto L44
            android.os.Handler r3 = r1.A02
            X.WtO r2 = new X.WtO
            r2.<init>(r0, r1)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66207U4d.DfM(int):void");
    }

    @Override // X.InterfaceC72040XGi
    public final void E2M(InterfaceC72001XEp interfaceC72001XEp, U5A u5a) {
        C66204U4a A01 = A01(this);
        Context requireContext = requireContext();
        Integer num = C05F.A00;
        int i = u5a.A00;
        C66204U4a.A00(requireContext, A01, interfaceC72001XEp, ((U50) u5a).A00, u5a.A01, num, i, u5a.A02);
    }

    @Override // X.InterfaceC72040XGi
    public final void E4d(C68108VBr c68108VBr) {
        A01(this).A0F(requireContext(), c68108VBr, null);
    }

    @Override // X.InterfaceC72040XGi
    public final void E4e(String str) {
        A01(this).A0F(requireContext(), new C68108VBr(null), str);
    }

    @Override // X.InterfaceC72040XGi
    public final void E6r(InterfaceC72001XEp interfaceC72001XEp, VBp vBp) {
        A01(this).A0D(requireContext(), interfaceC72001XEp, vBp);
    }

    @Override // X.InterfaceC72040XGi
    public final void EEk(String str) {
        A01(this).A0N(str);
    }

    @Override // X.InterfaceC72040XGi
    public final void EH2(InterfaceC72001XEp interfaceC72001XEp, C68109VBs c68109VBs, String str) {
        A01(this).A0E(requireContext(), interfaceC72001XEp, c68109VBs, str);
    }

    @Override // X.InterfaceC72040XGi
    public final void ESk(Drawable drawable) {
        C66206U4c c66206U4c = A01(this).A03;
        if (c66206U4c != null) {
            c66206U4c.setCustomBackgroundDrawable(drawable);
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void F9u(C68110VBt c68110VBt, String str) {
        C66204U4a A01 = A01(this);
        Context requireContext = requireContext();
        if (A01.A0G.size() != 1) {
            A01.A0G(requireContext, c68110VBt.A00, str);
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void FAK(XBX xbx) {
        C66212U4i c66212U4i = (C66212U4i) A01(this).A0G.peek();
        if (c66212U4i != null) {
            c66212U4i.A01 = xbx;
        }
    }

    @Override // X.InterfaceC72040XGi
    public final void FAP(ColorData colorData, U6H u6h) {
        A01(this).A0H(colorData, u6h);
    }

    @Override // X.InterfaceC72040XGi
    public final void FBS(ColorData colorData, float f) {
        C66204U4a A01 = A01(this);
        requireContext();
        A01.A0I(colorData, Float.valueOf(f));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A09 = A01(this).A09();
        if (A09 == null) {
            W2o w2o = this.A00;
            if (w2o != null) {
                XBU xbu = w2o.A01;
                if (xbu == null) {
                    C14360o3.A0F("behavior");
                    throw C00O.createAndThrow();
                }
                C69750Vuk Aba = xbu.Aba();
                if (Aba != null) {
                    return Aba.A00;
                }
                return "";
            }
            throw new IllegalStateException("Platform behavior is accessed before fragment's onCreate method is called!");
        }
        return A09;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A01(this).A0B(requireContext());
        return true;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC18680vv A04;
        int i;
        int A02 = C0f9.A02(823043483);
        super.onCreate(bundle);
        if (bundle != null) {
            A07();
            this.A02 = U6D.A03();
            this.A03 = new C66204U4a(null);
            i = -382951282;
        } else {
            Bundle requireArguments = requireArguments();
            String string = requireArguments.getString("IgSessionManager.SESSION_TOKEN_KEY");
            string.getClass();
            if (string.equals(AbstractC111324zv.A00(1661)) && C1AD.A06(C06090Tz.A05, 18310033993445541L)) {
                C023409i A00 = C09Y.A00();
                synchronized (A00) {
                    A04 = A00.A08;
                    if (A04 == null) {
                        A04 = C023409i.A0A.A03(this);
                    }
                }
            } else {
                A04 = C023409i.A0A.A04(requireArguments);
            }
            this.A01 = A04;
            Bundle bundle2 = requireArguments.getBundle("cds_open_screen_config");
            bundle2.getClass();
            this.A02 = C65981Txa.A0O.A00(bundle2);
            this.A00 = new W2o(this);
            C66204U4a c66204U4a = new C66204U4a(new C68716Vas(this.A01));
            this.A03 = c66204U4a;
            c66204U4a.A04 = this.A00;
            this.A05.A00 = Integer.valueOf(C30D.A00(getRootActivity()));
            i = 1547893810;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1991702461);
        C66204U4a A01 = A01(this);
        Context requireContext = requireContext();
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        C66206U4c A07 = A01.A07(requireContext, this.A04, c65981Txa, AbstractC52802bM.A01(requireActivity()));
        C0f9.A09(-922384813, A02);
        return A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-595001739);
        super.onDestroy();
        C66204U4a c66204U4a = this.A03;
        if (c66204U4a != null) {
            c66204U4a.A0C(requireContext());
        }
        C0f9.A09(423787133, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1466469447);
        super.onDestroyView();
        C66204U4a c66204U4a = this.A03;
        if (c66204U4a != null) {
            c66204U4a.A0A();
        }
        this.A05.A02(this);
        C0f9.A09(-1051793393, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(2035664029);
        super.onDetach();
        C66204U4a c66204U4a = this.A03;
        if (c66204U4a != null) {
            C65981Txa c65981Txa = this.A02;
            c65981Txa.getClass();
            c66204U4a.A0L(c65981Txa);
        }
        C0f9.A09(1851769086, A02);
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity = getActivity();
        AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && !parentFragmentManager.A0G) {
            super.onDismiss(dialogInterface);
        }
    }

    @Override // X.AbstractC72473Mu, X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            bundle.putBoolean("from_config_changes", true);
        }
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        bundle.putBundle("cds_open_screen_config", c65981Txa.A00());
        super.onSaveInstanceState(bundle);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-150087008);
        super.onStart();
        C66204U4a c66204U4a = this.A03;
        if (c66204U4a != null) {
            c66204U4a.A0M(this.A02);
        }
        C0f9.A09(-1611245744, A02);
    }

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        U59 u59 = this.A05;
        C65981Txa c65981Txa = this.A02;
        c65981Txa.getClass();
        u59.A01(view, this, c65981Txa);
    }
}
