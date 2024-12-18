package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public final class ELE extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubPromoAndWelcomeVideoFragment";
    public C99694dm A00;
    public C7KZ A01;
    public C35024Fbx A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context requireContext;
        int i;
        String string;
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A05;
        interfaceC56362iU.EkS(!((C44536Jmg) interfaceC09390do.getValue()).A0D);
        int ordinal = AbstractC31174DnI.A0Q(interfaceC09390do).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw B4Z.A00();
                }
                string = null;
                interfaceC56362iU.setTitle(string);
            }
            requireContext = requireContext();
            i = 2131976543;
        } else {
            requireContext = requireContext();
            i = 2131976511;
        }
        string = requireContext.getString(i);
        interfaceC56362iU.setTitle(string);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "FanClubPromoVideosFragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r5 = 0
            r3 = r16
            X.C14360o3.A0B(r3, r5)
            r7 = r15
            r0 = r17
            super.onViewCreated(r3, r0)
            r0 = 2131438690(0x7f0b2c62, float:1.8499314E38)
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r3, r0)
            X.0do r2 = r15.A05
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            java.lang.String r0 = A02(r0, r15)
            r1.setText(r0)
            r0 = 2131438686(0x7f0b2c5e, float:1.8499306E38)
            android.widget.TextView r4 = X.AbstractC166997dE.A0T(r3, r0)
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            int r1 = r0.ordinal()
            if (r1 == r5) goto L41
            r0 = 1
            if (r1 == r0) goto L49
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L3f
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L3f:
            r0 = 0
            goto L54
        L41:
            android.content.Context r1 = r15.requireContext()
            r0 = 2131976518(0x7f136146, float:1.9590159E38)
            goto L50
        L49:
            android.content.Context r1 = r15.requireContext()
            r0 = 2131976548(0x7f136164, float:1.959022E38)
        L50:
            java.lang.String r0 = r1.getString(r0)
        L54:
            r4.setText(r0)
            r0 = 2131438688(0x7f0b2c60, float:1.849931E38)
            android.view.View r9 = X.AbstractC166997dE.A0S(r3, r0)
            r0 = 2131438689(0x7f0b2c61, float:1.8499312E38)
            android.view.View r5 = X.AbstractC166997dE.A0S(r3, r0)
            r0 = 2131438685(0x7f0b2c5d, float:1.8499304E38)
            android.view.View r12 = X.AbstractC166997dE.A0S(r3, r0)
            r0 = 2131443554(0x7f0b3f62, float:1.850918E38)
            android.view.View r6 = X.AbstractC166997dE.A0S(r3, r0)
            r0 = 2131430802(0x7f0b0d92, float:1.8483315E38)
            android.view.View r8 = X.AbstractC166997dE.A0S(r3, r0)
            r14 = 12
            X.ViewOnClickListenerC35685FpK.A01(r8, r14, r15)
            r0 = 2131441498(0x7f0b375a, float:1.850501E38)
            android.view.View r10 = X.AbstractC166997dE.A0S(r3, r0)
            r0 = 13
            X.ViewOnClickListenerC35685FpK.A01(r10, r0, r15)
            r0 = 2131443783(0x7f0b4047, float:1.8509644E38)
            com.instagram.igds.components.textcell.IgdsListCell r4 = X.AbstractC31173DnH.A0Y(r3, r0)
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            java.lang.String r0 = r15.A00(r0)
            if (r0 == 0) goto L9f
            r4.A0I(r0)
        L9f:
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            java.lang.String r0 = r15.A00(r0)
            r4.setContentDescription(r0)
            X.AbstractC56952jT.A01(r4)
            r1 = 47
            X.LPz r0 = new X.LPz
            r0.<init>(r15, r1)
            r4.A0C(r0)
            r0 = 2131443828(0x7f0b4074, float:1.8509735E38)
            android.view.View r11 = X.AbstractC166997dE.A0S(r3, r0)
            com.instagram.igds.components.textcell.IgdsListCell r11 = (com.instagram.igds.components.textcell.IgdsListCell) r11
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            java.lang.String r0 = A01(r0, r15)
            if (r0 == 0) goto Lcd
            r11.A0I(r0)
        Lcd:
            X.Dsz r0 = X.AbstractC31174DnI.A0Q(r2)
            java.lang.String r0 = A01(r0, r15)
            r11.setContentDescription(r0)
            X.AbstractC56952jT.A01(r11)
            X.2k6 r0 = X.AbstractC25235BEs.A0S(r15)
            r13 = 0
            X.JWL r4 = new X.JWL
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.191 r3 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r3, r4, r0)
            X.2k6 r2 = X.AbstractC25235BEs.A0S(r15)
            r1 = 17
            X.MBp r0 = new X.MBp
            r0.<init>(r15, r13, r1)
            X.AbstractC23641Du.A05(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELE.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(ELE ele) {
        InterfaceC09390do interfaceC09390do = ele.A04;
        interfaceC09390do.getValue();
        INH A0C = AbstractC86593tX.A0C(C22P.A5N);
        InterfaceC09390do interfaceC09390do2 = ele.A05;
        EnumC31515Dsz A0Q = AbstractC31174DnI.A0Q(interfaceC09390do2);
        EnumC31515Dsz enumC31515Dsz = EnumC31515Dsz.A06;
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(A0Q, enumC31515Dsz);
        boolean A1X2 = AbstractC167007dF.A1X(AbstractC31174DnI.A0Q(interfaceC09390do2), EnumC31515Dsz.A05);
        if (AbstractC31174DnI.A0Q(interfaceC09390do2) != enumC31515Dsz) {
            z = false;
        }
        A0C.A0r = A1X;
        A0C.A0t = A1X2;
        A0C.A0u = z;
        C6XJ A02 = C6XJ.A02(ele.getActivity(), A0C.A00(), AbstractC166987dD.A0o(interfaceC09390do), TransparentModalActivity.class, "clips_camera");
        A02.A07();
        A02.A0D(ele, 9587);
    }

    public static final void A04(ELE ele) {
        Fragment A01;
        C44536Jmg c44536Jmg = (C44536Jmg) ele.A05.getValue();
        if (c44536Jmg.A0D) {
            int ordinal = c44536Jmg.A00.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        throw B4Z.A00();
                    }
                    InterfaceC53722dB A00 = AbstractC54852fj.A00();
                    C14360o3.A0C(A00, AbstractC111324zv.A00(128));
                    AbstractC72153Lo.A00 = true;
                    ((InterfaceC53742dD) A00).EfJ(C1QO.A0E);
                }
                UserSession userSession = c44536Jmg.A03;
                A01 = W6d.A02(AbstractC31171DnF.A0C(userSession), C66277U6x.A00("com.instagram.user_pay.fan_club.screens.create_exclusive_story"));
            } else {
                A01 = c44536Jmg.A04.A01(false, true, true, false, false);
            }
            AbstractC31179DnN.A0y(A01, ele.requireActivity(), ele.A04);
            return;
        }
        if (c44536Jmg.A0E && c44536Jmg.A00 == EnumC31515Dsz.A05) {
            A01 = c44536Jmg.A04.A01(false, true, false, false, true);
            AbstractC31179DnN.A0y(A01, ele.requireActivity(), ele.A04);
            return;
        }
        InterfaceC53722dB A002 = AbstractC54852fj.A00();
        C14360o3.A0C(A002, AbstractC111324zv.A00(128));
        AbstractC72153Lo.A00 = true;
        ((InterfaceC53742dD) A002).EfJ(C1QO.A0E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return ((C44536Jmg) this.A05.getValue()).A0D;
    }

    public ELE() {
        J7K j7k = new J7K(this, 12);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7K(new J7K(this, 9), 10));
        this.A05 = AbstractC25225BEi.A0a(new J7K(A00, 11), j7k, new C50171MDy(41, null, A00), AbstractC25225BEi.A1D(C44536Jmg.class));
        this.A03 = AbstractC09440dt.A01(new J7K(this, 8));
        this.A04 = AbstractC60492pY.A02(this);
    }

    private final String A00(EnumC31515Dsz enumC31515Dsz) {
        Context requireContext;
        int i;
        int ordinal = enumC31515Dsz.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw B4Z.A00();
                }
                return null;
            }
            requireContext = requireContext();
            i = 2131976549;
        } else {
            requireContext = requireContext();
            i = 2131976519;
        }
        return requireContext.getString(i);
    }

    public static final String A01(EnumC31515Dsz enumC31515Dsz, ELE ele) {
        Context requireContext;
        int i;
        int ordinal = enumC31515Dsz.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw B4Z.A00();
                }
                return null;
            }
            requireContext = ele.requireContext();
            i = 2131976550;
        } else {
            requireContext = ele.requireContext();
            i = 2131976521;
        }
        return requireContext.getString(i);
    }

    public static final String A02(EnumC31515Dsz enumC31515Dsz, ELE ele) {
        Context requireContext;
        int i;
        int ordinal = enumC31515Dsz.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw B4Z.A00();
                }
                return null;
            }
            requireContext = ele.requireContext();
            i = 2131976551;
        } else {
            requireContext = ele.requireContext();
            i = 2131976522;
        }
        return requireContext.getString(i);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (AbstractC31172DnG.A1X(requireArguments(), "is_from_recommendations")) {
            C35024Fbx c35024Fbx = this.A02;
            if (c35024Fbx == null) {
                C14360o3.A0F("fanClubSettingsRecommendationsNavigator");
                throw C00O.createAndThrow();
            }
            c35024Fbx.A01(requireContext(), AbstractC31174DnI.A0Q(this.A05), i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(941651382);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        this.A00 = AbstractC99684dl.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C7KZ c7kz = new C7KZ(requireContext(), this, requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do), G7E.A00, null, null, C05F.A0C);
        this.A01 = c7kz;
        registerLifecycleListener(c7kz);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A02 = new C35024Fbx(this, requireActivity(), A0r, null, C22P.A5S.toString(), 48);
        C44536Jmg c44536Jmg = (C44536Jmg) this.A05.getValue();
        C05A c05a = c44536Jmg.A0A;
        c05a.Egh(Integer.valueOf(AbstractC166987dD.A0H(c05a.getValue()) + 1));
        AbstractC23641Du.A05(((C12M) c44536Jmg.A01).A04, new MBp(c44536Jmg, null, 18), AbstractC141776au.A00(c44536Jmg));
        C0f9.A09(1358165906, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1346507775);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_promo_videos, viewGroup, false);
        C0f9.A09(-1758863710, A02);
        return inflate;
    }
}
