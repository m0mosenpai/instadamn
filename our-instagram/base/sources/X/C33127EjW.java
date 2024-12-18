package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EjW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33127EjW extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33127EjW(AbstractC10360h2 abstractC10360h2, Object obj, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(131878797);
                i = -542887547;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(1744577616);
                AbstractC35254Fgn.A01(AbstractC31172DnG.A07(this.A01));
                i = 1782810607;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(260637058);
                AbstractC35254Fgn.A02(AbstractC31172DnG.A06(this.A01), abstractC115105If);
                i = 1258616788;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1440376756);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = -1050840521;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1748131723);
                C33230ElN c33230ElN = (C33230ElN) this.A01;
                Bundle bundle = c33230ElN.A00;
                if (bundle != null) {
                    bundle.putBoolean("is_whatsapp_two_factor_enabled", true);
                    C33230ElN.A00(c33230ElN);
                    AbstractC35254Fgn.A02(c33230ElN.requireActivity(), abstractC115105If);
                    i = 1020241221;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(-1807465372);
                C14360o3.A0B(abstractC115105If, 0);
                C33230ElN c33230ElN2 = (C33230ElN) this.A01;
                AbstractC35254Fgn.A02(c33230ElN2.requireActivity(), abstractC115105If);
                Bundle bundle2 = c33230ElN2.A00;
                if (bundle2 != null) {
                    bundle2.putBoolean("is_whatsapp_two_factor_enabled", false);
                    C33230ElN.A00(c33230ElN2);
                    i = 955480430;
                    C0f9.A0A(i, A03);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A03 = C0f9.A03(-1153280126);
                Context A06 = AbstractC31172DnG.A06(this.A01);
                if (A06 != null) {
                    AbstractC35254Fgn.A01(A06);
                }
                i = 1483878955;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(193145287);
                Context A062 = AbstractC31172DnG.A06(this.A01);
                if (A062 != null) {
                    AbstractC35254Fgn.A01(A062);
                }
                i = -1333206587;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1063572911);
                C33215El3 c33215El3 = (C33215El3) this.A01;
                AbstractC35254Fgn.A07(c33215El3, abstractC115105If);
                C33215El3.A00(c33215El3);
                i = 557551976;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(-697928157);
                Fragment fragment = (Fragment) this.A01;
                if (fragment.getContext() != null) {
                    AbstractC35254Fgn.A01(fragment.requireContext());
                }
                i = -1326985370;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(1447154985);
                C32231EHp c32231EHp = (C32231EHp) this.A01;
                TrustedDevice trustedDevice = c32231EHp.A00;
                if (trustedDevice == null) {
                    str = "trustedDevice";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                trustedDevice.A03 = C05F.A0C;
                AbstractC31179DnN.A0x(c32231EHp);
                i = -1721902046;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(1300566381);
                C32283EJu.A03((C32283EJu) this.A01, C05F.A01);
                i = 89461867;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1107408811);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = 662979648;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1345815426);
                AbstractC35254Fgn.A07((Fragment) this.A01, abstractC115105If);
                i = -727815340;
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.AbstractC32533EUj, X.C1P1
    public final void onFinish() {
        if (this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(1943450487);
        super.onFinish();
        ((EME) this.A01).A0E = false;
        C0f9.A0A(-1373996239, A03);
    }

    @Override // X.AbstractC32533EUj, X.C1P1
    public final void onStart() {
        if (this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-2131075643);
        super.onStart();
        ((EME) this.A01).A0E = true;
        C0f9.A0A(-2059169586, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        ImageUrl imageUrl;
        int i;
        int A032;
        int i2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-100673249);
                SavedCollection savedCollection = (SavedCollection) obj;
                int A033 = C0f9.A03(1239119054);
                C14360o3.A0B(savedCollection, 0);
                boolean A1W = AbstractC167007dF.A1W(savedCollection.A05);
                C08730cb c08730cb = C17060sy.A01;
                EME eme = (EME) this.A01;
                InterfaceC09390do interfaceC09390do = eme.A0V;
                C17P c17p = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A03;
                if (A1W) {
                    c17p.EVJ(true);
                } else {
                    c17p.EVd(true);
                }
                InterfaceC09390do interfaceC09390do2 = eme.A0I;
                DirectThreadKey directThreadKey = AbstractC31172DnG.A0f(interfaceC09390do2).A01;
                String str3 = AbstractC31172DnG.A0f(interfaceC09390do2).A06;
                if (directThreadKey != null && str3 != null) {
                    AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do)).FBR(directThreadKey, str3, 1);
                    AbstractC31176DnK.A0Q(interfaceC09390do).E4s(new C160967Jf(directThreadKey));
                }
                if (AbstractC167007dF.A1Z(eme.A0O)) {
                    Boolean BCc = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A03.BCc();
                    if (BCc != null && BCc.booleanValue()) {
                        EME.A05(eme, savedCollection);
                    }
                    C36117Fwr.A00(AbstractC31176DnK.A0Q(interfaceC09390do), savedCollection, C05F.A00);
                    AbstractC25227BEk.A1B(eme);
                } else {
                    savedCollection.A09 = true;
                    C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
                    C38321qM A02 = A0Z.A02(AbstractC31172DnG.A0f(interfaceC09390do2).A05);
                    if (A02 != null) {
                        ArrayList A1F = AbstractC166987dD.A1F(A02.BqL());
                        if (!A1F.contains(savedCollection.A0F)) {
                            A1F.add(savedCollection.A0F);
                        }
                        A02.Ed3(EnumC77213d7.A04);
                        A02.A0C.Ed4(A1F);
                        A0Z.A01(A02, true, false);
                    }
                    FragmentActivity requireActivity = eme.requireActivity();
                    Intent putExtra = AbstractC31171DnF.A04().putExtra("DirectCollaborativeCollectionsConstants_new_created_collection", savedCollection);
                    if (A02 != null) {
                        imageUrl = A02.A1S();
                    } else {
                        imageUrl = null;
                    }
                    requireActivity.setResult(-1, putExtra.putExtra("DirectCollaborativeCollectionsConstants_media_thumbnail_url", imageUrl));
                    AbstractC25226BEj.A1Q(eme);
                }
                AbstractC35087Fcy.A00(eme, AbstractC166987dD.A0r(interfaceC09390do), savedCollection);
                String A00 = AbstractC31172DnG.A0f(interfaceC09390do2).A00();
                if (A00 != null && A00.length() != 0) {
                    ((C34999FbW) eme.A0K.getValue()).A01(savedCollection, true);
                }
                C0f9.A0A(715064819, A033);
                i = 1651933374;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A032 = C0f9.A03(892020582);
                C3DC c3dc = (C3DC) obj;
                int A034 = C0f9.A03(-504373446);
                if (((C32041E5t) c3dc.F7f()).A00 != null) {
                    String format = new SimpleDateFormat("MM/dd/yy", C1Q2.A02()).format(Long.valueOf(TimeUnit.MILLISECONDS.convert(((C32041E5t) c3dc.F7f()).A00.intValue(), TimeUnit.SECONDS)));
                    C32369ENt c32369ENt = (C32369ENt) this.A01;
                    c32369ENt.A00.setLabelText(AbstractC31174DnI.A0w(c32369ENt, format, 2131957334));
                }
                C0f9.A0A(1171616612, A034);
                i2 = 278048598;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A03 = C0f9.A03(-631329532);
                EDU edu = (EDU) obj;
                int A035 = C0f9.A03(703637788);
                if (edu.A08) {
                    C32320ELo c32320ELo = (C32320ELo) this.A01;
                    String str4 = C32320ELo.__redex_internal_original_name;
                    c32320ELo.A01.setVisibility(0);
                    TextView textView = c32320ELo.A01;
                    String string = c32320ELo.getString(2131975975);
                    String string2 = c32320ELo.getString(2131975974);
                    FragmentActivity activity = c32320ELo.getActivity();
                    AnonymousClass773.A07(new Em0(AbstractC31174DnI.A0q(activity, AbstractC53242c7.A0C(activity)), edu, this, 12), textView, string, string2);
                }
                C32320ELo c32320ELo2 = (C32320ELo) this.A01;
                boolean z = edu.A0D;
                String str5 = C32320ELo.__redex_internal_original_name;
                if (z) {
                    c32320ELo2.A0C = edu.A0G;
                    c32320ELo2.A00.setVisibility(0);
                    c32320ELo2.A03.setVisibility(0);
                    IgTextView igTextView = c32320ELo2.A03;
                    String string3 = c32320ELo2.getString(2131965055);
                    String string4 = c32320ELo2.getString(2131974062);
                    FragmentActivity activity2 = c32320ELo2.getActivity();
                    AnonymousClass773.A07(new Em1(AbstractC31174DnI.A0q(activity2, AbstractC53242c7.A0C(activity2)), this, 20), igTextView, string3, string4);
                    c32320ELo2.A04.setChecked(c32320ELo2.A0C);
                    c32320ELo2.A04.A07 = new G9H(this, 25);
                }
                C0f9.A0A(1045613557, A035);
                i = 2025419401;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A032 = C0f9.A03(865744120);
                EDU edu2 = (EDU) obj;
                int A0N = AbstractC167017dG.A0N(edu2, -1310643695);
                EL6 el6 = (EL6) this.A01;
                el6.A00 = edu2.A00();
                if (el6.A04) {
                    TextView textView2 = el6.A02;
                    if (textView2 == null) {
                        str = "backupCodesTextView";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    ArrayList arrayList = edu2.A04;
                    if (arrayList != null) {
                        str2 = AbstractC31175DnJ.A0a("\n", arrayList);
                    } else {
                        str2 = "";
                    }
                    textView2.setText(str2);
                    C0f9.A0A(542749596, A0N);
                    i2 = -1710412475;
                } else {
                    if (el6.A05) {
                        int i3 = !edu2.A0B ? 1 : 0;
                        View view = el6.A01;
                        if (view == null) {
                            str = "divider";
                        } else {
                            int i4 = 0;
                            view.setVisibility(AbstractC167007dF.A05(i3));
                            ProgressButton progressButton = el6.A03;
                            if (progressButton == null) {
                                str = "nextButton";
                            } else {
                                if (i3 == 0) {
                                    i4 = 8;
                                }
                                progressButton.setVisibility(i4);
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C0f9.A0A(542749596, A0N);
                    i2 = -1710412475;
                }
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = C0f9.A03(-165294507);
                int A036 = C0f9.A03(-1898323679);
                C33230ElN c33230ElN = (C33230ElN) this.A01;
                Bundle bundle = c33230ElN.A00;
                if (bundle != null) {
                    bundle.putBoolean("is_whatsapp_two_factor_enabled", false);
                    C33230ElN.A00(c33230ElN);
                    C0f9.A0A(-1415831966, A036);
                    i2 = 693578553;
                    C0f9.A0A(i2, A032);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A032 = C0f9.A03(299545765);
                ECV ecv = (ECV) obj;
                int A037 = C0f9.A03(1077762395);
                C14360o3.A0B(ecv, 0);
                if (ecv.A01) {
                    FRQ A002 = AbstractC35179FfW.A00();
                    C33230ElN c33230ElN2 = (C33230ElN) this.A01;
                    Bundle requireArguments = c33230ElN2.requireArguments();
                    Bundle bundle2 = c33230ElN2.A00;
                    if (bundle2 != null) {
                        AbstractC31179DnN.A0y(A002.A01(requireArguments, C05F.A0C, C05F.A0Y, AbstractC31180DnO.A0a(bundle2), false), c33230ElN2.requireActivity(), c33230ElN2.A05);
                        C0f9.A0A(-1237848752, A037);
                        i2 = -1595729529;
                        C0f9.A0A(i2, A032);
                        return;
                    }
                    str = "twoFacResponseBundle";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C33230ElN c33230ElN3 = (C33230ElN) this.A01;
                AbstractC35254Fgn.A06(c33230ElN3.requireContext(), ecv.getErrorMessage(), c33230ElN3.requireContext().getString(2131961880));
                Bundle bundle3 = c33230ElN3.A00;
                if (bundle3 != null) {
                    bundle3.putBoolean("is_whatsapp_two_factor_enabled", false);
                    C33230ElN.A00(c33230ElN3);
                    C0f9.A0A(-1237848752, A037);
                    i2 = -1595729529;
                    C0f9.A0A(i2, A032);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A032 = C0f9.A03(-1104832813);
                int A038 = C0f9.A03(-988159858);
                C33221El9 c33221El9 = (C33221El9) this.A01;
                Bundle bundle4 = c33221El9.A00;
                if (bundle4 != null) {
                    bundle4.putBoolean("is_totp_two_factor_enabled", false);
                    AbstractC31179DnN.A0y(AbstractC35179FfW.A00().A02(C05F.A0j, true, false), c33221El9.requireActivity(), c33221El9.A02);
                    C0f9.A0A(-434433974, A038);
                    i2 = -660152870;
                    C0f9.A0A(i2, A032);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A032 = C0f9.A03(-64949633);
                int A039 = C0f9.A03(702148862);
                ((C33221El9) this.A01).A02();
                C0f9.A0A(565355613, A039);
                i2 = -1650268912;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A032 = C0f9.A03(-1262708164);
                ECG ecg = (ECG) obj;
                int A0N2 = AbstractC167017dG.A0N(ecg, -454262833);
                C33215El3 c33215El3 = (C33215El3) this.A01;
                Bundle bundle5 = c33215El3.A00;
                if (bundle5 != null) {
                    bundle5.putBoolean("is_trusted_notifications_enabled", ecg.A00);
                    C33215El3.A00(c33215El3);
                    C0f9.A0A(-129318559, A0N2);
                    i2 = 1548182484;
                    C0f9.A0A(i2, A032);
                    return;
                }
                str = "twoFacResponseBundle";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                A032 = C0f9.A03(1460078330);
                int A0310 = C0f9.A03(-340337762);
                C33212El0 c33212El0 = (C33212El0) this.A01;
                c33212El0.requireArguments().putBoolean("is_two_factor_enabled", false);
                c33212El0.requireArguments().putBoolean("is_whatsapp_two_factor_enabled", false);
                C33212El0.A00(c33212El0);
                C0f9.A0A(-346128278, A0310);
                i2 = 97670843;
                C0f9.A0A(i2, A032);
                return;
            case 10:
                A032 = C0f9.A03(1860956107);
                int A0311 = C0f9.A03(210150426);
                C32231EHp c32231EHp = (C32231EHp) this.A01;
                TrustedDevice trustedDevice = c32231EHp.A00;
                if (trustedDevice == null) {
                    str = "trustedDevice";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                trustedDevice.A03 = C05F.A01;
                AbstractC31179DnN.A0x(c32231EHp);
                C0f9.A0A(-598128457, A0311);
                i2 = 2144676297;
                C0f9.A0A(i2, A032);
                return;
            case 11:
                A032 = C0f9.A03(566859880);
                EDL edl = (EDL) obj;
                int A0N3 = AbstractC167017dG.A0N(edl, 392442809);
                Integer A003 = edl.A00();
                Integer num = C05F.A0C;
                C32283EJu c32283EJu = (C32283EJu) this.A01;
                if (A003 != num) {
                    C32283EJu.A03(c32283EJu, C05F.A00);
                } else {
                    Context requireContext = c32283EJu.requireContext();
                    Integer num2 = c32283EJu.A05;
                    if (num2 == null) {
                        str = "loginNotificationUserAction";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    int intValue = num2.intValue();
                    if (intValue != 1) {
                        if (intValue == 2) {
                            C32283EJu.A02(requireContext, c32283EJu);
                        }
                    } else {
                        C32283EJu.A01(requireContext, c32283EJu);
                    }
                }
                C0f9.A0A(-1214863577, A0N3);
                i2 = -1745650099;
                C0f9.A0A(i2, A032);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A032 = C0f9.A03(846360265);
                EDL edl2 = (EDL) obj;
                int A0N4 = AbstractC167017dG.A0N(edl2, -1712530282);
                C32283EJu.A03((C32283EJu) this.A01, edl2.A00());
                C0f9.A0A(-1684710975, A0N4);
                i2 = 1125177686;
                C0f9.A0A(i2, A032);
                return;
            default:
                int A0312 = C0f9.A03(-316953594);
                EDL edl3 = (EDL) obj;
                int A0N5 = AbstractC167017dG.A0N(edl3, -441517617);
                C32283EJu c32283EJu2 = (C32283EJu) this.A01;
                C32283EJu.A03(c32283EJu2, edl3.A00());
                C34717FRd A0R = AbstractC31175DnJ.A0R();
                UserSession userSession = c32283EJu2.A04;
                str = "userSession";
                if (userSession != null) {
                    C32369ENt A004 = A0R.A00(userSession, "two_fac_trusted_notification");
                    FragmentActivity requireActivity2 = c32283EJu2.requireActivity();
                    UserSession userSession2 = c32283EJu2.A04;
                    if (userSession2 != null) {
                        C140966Yy A0N6 = AbstractC31174DnI.A0N(A004, requireActivity2, userSession2);
                        A0N6.A0F(c32283EJu2, 168);
                        A0N6.A04();
                        C0f9.A0A(-444065252, A0N5);
                        C0f9.A0A(-2044602024, A0312);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
