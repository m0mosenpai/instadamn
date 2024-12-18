package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.ui.model.MediaKitLink;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings.common.PaymentOptionsFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* loaded from: classes9.dex */
public final class NY0 extends AnonymousClass522 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Fragment paymentOptionsFragment;
        Context requireActivity;
        UserSession A0r;
        C2Fb c2Fb;
        String str;
        C63397SjR c63397SjR;
        FragmentActivity requireActivity2;
        UserSession A0r2;
        C2Fb c2Fb2;
        String str2;
        String str3;
        C140966Yy A0c;
        IGRevShareProductType iGRevShareProductType;
        FragmentActivity requireActivity3;
        UserSession A0r3;
        String A04;
        C2Fb c2Fb3;
        String str4;
        String str5;
        AbstractC12990ll A0o;
        Class<ModalActivity> cls;
        Bundle A0b;
        FragmentActivity activity;
        int i;
        C52123N4w c52123N4w;
        C6XJ A0L;
        C52123N4w c52123N4w2;
        String string;
        switch (this.A00) {
            case 0:
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString("page", "settings");
                Rb5 rb5 = (Rb5) this.A01;
                InterfaceC09390do interfaceC09390do = rb5.A06;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36310357895282720L)) {
                    paymentOptionsFragment = AbstractC62818SSq.A00(A0b2);
                } else {
                    paymentOptionsFragment = new PaymentOptionsFragment();
                    paymentOptionsFragment.setArguments(A0b2);
                }
                C140966Yy A0j = AbstractC25233BEq.A0j(rb5, interfaceC09390do);
                A0j.A08();
                C14360o3.A0A(paymentOptionsFragment);
                A0j.A0D(paymentOptionsFragment);
                A0j.A04();
                return;
            case 1:
                AbstractC52114N4m abstractC52114N4m = (AbstractC52114N4m) this.A01;
                requireActivity = abstractC52114N4m.requireActivity();
                A0r = AbstractC166987dD.A0r(abstractC52114N4m.A09);
                c2Fb = C2Fb.A0e;
                str = "https://help.instagram.com/2635536099905516";
                AbstractC31177DnL.A0u(requireActivity, A0r, c2Fb, str);
                return;
            case 2:
                C14360o3.A0B(view, 0);
                c63397SjR = new C63397SjR(AbstractC166997dE.A0L(view), ((C50955MfO) ((C52110N4i) this.A01).A04.getValue()).A03, C2Fb.A35, "https://www.facebook.com/help/instagram/334079377727603?ref=igapp", false);
                c63397SjR.A0A();
                return;
            case 3:
                N7W n7w = (N7W) this.A01;
                C26699Bqg c26699Bqg = new C26699Bqg();
                C189448aO A0y = AbstractC25225BEi.A0y(n7w.A00);
                AbstractC25226BEj.A1M(view.getContext(), A0y, 2131952953);
                AbstractC31177DnL.A14(n7w, c26699Bqg, A0y);
                return;
            case 4:
                C14360o3.A0B(view, 0);
                C50991Mfy A0X = MSW.A0X(((N7G) this.A01).A05);
                if (A0X.A07.getValue() != EnumC53105NeI.A02) {
                    return;
                }
                A0X.A06.Egh(EnumC53134Nen.A04);
                return;
            case 5:
                C56343P0e c56343P0e = (C56343P0e) this.A01;
                requireActivity = c56343P0e.A02.requireContext();
                A0r = c56343P0e.A03;
                c2Fb = C2Fb.A1W;
                str = "https://help.instagram.com/761121959519495";
                AbstractC31177DnL.A0u(requireActivity, A0r, c2Fb, str);
                return;
            case 6:
                C56364P0z c56364P0z = (C56364P0z) this.A01;
                c56364P0z.A04.DJb((C54586O9n) c56364P0z.A06.getValue(), c56364P0z.A05);
                return;
            case 7:
            case 26:
            case 27:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                C52181N7q c52181N7q = (C52181N7q) this.A01;
                requireActivity2 = c52181N7q.requireActivity();
                A0r2 = AbstractC166987dD.A0r(c52181N7q.A06);
                c2Fb2 = C2Fb.A49;
                str2 = "igtv_upload_adv_settings";
                str5 = "https://help.instagram.com/225479678901832";
                AbstractC41776Ies.A09(requireActivity2, A0r2, c2Fb2, str5, str2);
                return;
            case 9:
                C54796OJo A00 = N5U.A00((N5U) this.A01);
                if (C1Y9.A00 == null) {
                    str3 = "newInstance";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                boolean z = A00.A08;
                boolean z2 = A00.A09;
                AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putBoolean(AbstractC58317Pt9.A00(299), z);
                A0b3.putBoolean(AbstractC58317Pt9.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD), z2);
                abstractC59962oe.setArguments(A0b3);
                AbstractC31178DnM.A0y(abstractC59962oe, A00.A01, A00.A02);
                return;
            case 10:
                android.net.Uri A03 = AbstractC08820cl.A03("https://help.instagram.com/1335687273948910");
                N5U n5u = (N5U) this.A01;
                C12260kU.A0G(n5u.requireContext(), A03);
                SZ2.A00((SZ2) n5u.A0B.getValue(), "settings_data_policy_clicked", null);
                return;
            case 11:
                android.net.Uri A032 = AbstractC08820cl.A03("https://help.instagram.com/563153788532689");
                N5U n5u2 = (N5U) this.A01;
                C12260kU.A0G(n5u2.requireContext(), A032);
                if (!n5u2.A06) {
                    return;
                }
                C54796OJo A002 = N5U.A00(n5u2);
                String str6 = n5u2.A00;
                C14360o3.A0B(str6, 0);
                A002.A03.A01(str6, "warning_learn_more_clicked");
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((MediaKitLink) this.A01).A01.invoke();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                N61 n61 = (N61) this.A01;
                AbstractC41776Ies.A09(n61.requireActivity(), AbstractC166987dD.A0r(n61.A04), C2Fb.A25, "https://www.facebook.com/help/instagram/512371932629820", "creator_revshare_account_level_monetization_toggle");
                N61.A00(n61, "secondary_button_clicked", "https://www.facebook.com/help/instagram/512371932629820");
                return;
            case 14:
                N61 n612 = (N61) this.A01;
                A0c = AbstractC25231BEo.A0c(n612.requireActivity(), n612.A04);
                MSZ.A1K(A0c);
                iGRevShareProductType = IGRevShareProductType.A04;
                NQ2 nq2 = new NQ2();
                Bundle A0b4 = AbstractC166987dD.A0b();
                A0b4.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
                AbstractC31175DnJ.A0t(A0b4, nq2, A0c);
                return;
            case Process.SIGTERM /* 15 */:
                N61 n613 = (N61) this.A01;
                A0c = AbstractC25231BEo.A0c(n613.requireActivity(), n613.A04);
                MSZ.A1K(A0c);
                iGRevShareProductType = IGRevShareProductType.A05;
                NQ2 nq22 = new NQ2();
                Bundle A0b42 = AbstractC166987dD.A0b();
                A0b42.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
                AbstractC31175DnJ.A0t(A0b42, nq22, A0c);
                return;
            case 16:
                N6E n6e = (N6E) this.A01;
                requireActivity3 = n6e.requireActivity();
                InterfaceC09390do interfaceC09390do2 = n6e.A02;
                A0r3 = AbstractC166987dD.A0r(interfaceC09390do2);
                A04 = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do2), 36878062377828505L);
                c2Fb3 = C2Fb.A2i;
                str4 = NQ1.__redex_internal_original_name;
                AbstractC41776Ies.A09(requireActivity3, A0r3, c2Fb3, A04, str4);
                return;
            case 17:
                N63 n63 = (N63) this.A01;
                requireActivity3 = n63.requireActivity();
                InterfaceC09390do interfaceC09390do3 = n63.A04;
                A0r3 = AbstractC166987dD.A0r(interfaceC09390do3);
                A04 = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do3), 36878062378090652L);
                c2Fb3 = C2Fb.A2i;
                str4 = N63.__redex_internal_original_name;
                AbstractC41776Ies.A09(requireActivity3, A0r3, c2Fb3, A04, str4);
                return;
            case 18:
                N63 n632 = (N63) this.A01;
                requireActivity2 = n632.requireActivity();
                A0r2 = AbstractC166987dD.A0r(n632.A04);
                c2Fb2 = C2Fb.A2x;
                str2 = N63.__redex_internal_original_name;
                str5 = "https://help.instagram.com/427415519366046";
                AbstractC41776Ies.A09(requireActivity2, A0r2, c2Fb2, str5, str2);
                return;
            case Process.SIGSTOP /* 19 */:
                N5L n5l = (N5L) this.A01;
                requireActivity3 = n5l.requireActivity();
                InterfaceC09390do interfaceC09390do4 = n5l.A00;
                A0r3 = AbstractC166987dD.A0r(interfaceC09390do4);
                A04 = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do4), 36878062377959578L);
                c2Fb3 = C2Fb.A2i;
                str4 = N5L.__redex_internal_original_name;
                AbstractC41776Ies.A09(requireActivity3, A0r3, c2Fb3, A04, str4);
                return;
            case 20:
                N5L n5l2 = (N5L) this.A01;
                requireActivity3 = n5l2.requireActivity();
                InterfaceC09390do interfaceC09390do5 = n5l2.A00;
                A0r3 = AbstractC166987dD.A0r(interfaceC09390do5);
                A04 = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do5), 36878758163448012L);
                c2Fb3 = C2Fb.A2x;
                str4 = N5L.__redex_internal_original_name;
                AbstractC41776Ies.A09(requireActivity3, A0r3, c2Fb3, A04, str4);
                return;
            case 21:
                ((InterfaceC16660sJ) this.A01).invoke(C52641NQo.A00);
                return;
            case 22:
                C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03("https://www.facebook.com/privacy/guide/genai"));
                return;
            case 23:
                N4H n4h = (N4H) this.A01;
                c63397SjR = AbstractC25228BEl.A0y(n4h.requireActivity(), AbstractC166987dD.A0r(n4h.A00), C2Fb.A2J, "https://help.instagram.com/2635536099905516");
                c63397SjR.A0S = N4H.__redex_internal_original_name;
                c63397SjR.A0A();
                return;
            case 24:
                C52112N4k c52112N4k = (C52112N4k) this.A01;
                requireActivity = c52112N4k.requireContext();
                A0r = AbstractC166987dD.A0r(c52112N4k.A07);
                c2Fb = C2Fb.A1W;
                str = "https://help.instagram.com/761121959519495";
                AbstractC31177DnL.A0u(requireActivity, A0r, c2Fb, str);
                return;
            case 25:
                C52123N4w c52123N4w3 = (C52123N4w) this.A01;
                A0o = AbstractC166987dD.A0o(c52123N4w3.A03);
                cls = ModalActivity.class;
                A0b = AbstractC166987dD.A0b();
                activity = c52123N4w3.getActivity();
                i = 4430;
                c52123N4w = c52123N4w3;
                A0L = AbstractC31171DnF.A0L(activity, A0b, A0o, cls, AbstractC111324zv.A00(i));
                c52123N4w2 = c52123N4w;
                AbstractC25230BEn.A1A(c52123N4w2, A0L);
                return;
            case 28:
                N7K n7k = (N7K) this.A01;
                InterfaceC09390do interfaceC09390do6 = n7k.A0A;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do6), 36324462567829685L)) {
                    Bundle A0b5 = AbstractC166987dD.A0b();
                    A0b5.putString(DialogModule.KEY_TITLE, n7k.getString(2131976330));
                    A0L = AbstractC31171DnF.A0L(n7k.getActivity(), A0b5, AbstractC166987dD.A0o(interfaceC09390do6), ModalActivity.class, AbstractC111324zv.A00(4018));
                    c52123N4w2 = n7k;
                    AbstractC25230BEn.A1A(c52123N4w2, A0L);
                    return;
                }
                A0o = AbstractC166987dD.A0o(interfaceC09390do6);
                cls = ModalActivity.class;
                A0b = AbstractC166987dD.A0b();
                activity = n7k.getActivity();
                i = 4858;
                c52123N4w = n7k;
                A0L = AbstractC31171DnF.A0L(activity, A0b, A0o, cls, AbstractC111324zv.A00(i));
                c52123N4w2 = c52123N4w;
                AbstractC25230BEn.A1A(c52123N4w2, A0L);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                N4U n4u = (N4U) this.A01;
                C35133Fea.A01(n4u.requireContext(), AbstractC166987dD.A0o(n4u.A04), SimpleWebViewActivity.A02, new SXK("https://help.instagram.com/270447560766967"), AbstractC166997dE.A0N(n4u).getString(2131965052));
                return;
            case 30:
                C52116N4o c52116N4o = (C52116N4o) this.A01;
                Bundle bundle = c52116N4o.mArguments;
                if (bundle != null && (string = bundle.getString("action_source")) != null) {
                    ALg.A01(AbstractC12220kQ.A01(c52116N4o, c52116N4o.A01), "let_us_know", string, CZ1.A00(c52116N4o.A01));
                }
                C52116N4o.A00(c52116N4o);
                AbstractC31173DnH.A13(c52116N4o.requireContext(), c52116N4o, 2131968938);
                return;
            case 31:
            case 32:
                C52116N4o c52116N4o2 = (C52116N4o) this.A01;
                String string2 = c52116N4o2.requireArguments().getString("action_source");
                if (string2 != null) {
                    ALg.A01(AbstractC12220kQ.A01(c52116N4o2, c52116N4o2.A01), "learn_more", string2, CZ1.A00(c52116N4o2.A01));
                }
                Context requireContext = c52116N4o2.requireContext();
                UserSession userSession = c52116N4o2.A01;
                SXK sxk = new SXK("https://help.instagram.com/477434105621119/");
                sxk.A02 = c52116N4o2.requireContext().getString(2131975568);
                SimpleWebViewActivity.A00(requireContext, userSession, new SimpleWebViewConfig(sxk));
                return;
            case 33:
                C52128N5b c52128N5b = (C52128N5b) this.A01;
                Nj6 nj6 = c52128N5b.A00;
                if (nj6 == null) {
                    str3 = "entrySurface";
                } else {
                    InterfaceC09390do interfaceC09390do7 = c52128N5b.A08;
                    UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do7);
                    C38321qM c38321qM = c52128N5b.A02;
                    if (c38321qM == null) {
                        str3 = "entryMedia";
                    } else {
                        C14360o3.A0B(A0r4, 1);
                        AbstractC54298NzI.A00(nj6, c52128N5b, A0r4, c38321qM, C05F.A15, null, AbstractC166987dD.A1I());
                        MSX.A18(c52128N5b, AbstractC31171DnF.A0L(c52128N5b.getActivity(), AbstractC37301Gc2.A04(AbstractC166987dD.A0r(interfaceC09390do7), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do7), "21378697918", "world_pages", C52128N5b.__redex_internal_original_name)), AbstractC166987dD.A0o(interfaceC09390do7), ModalActivity.class, "profile"));
                        return;
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 34:
                N58 n58 = (N58) this.A01;
                requireActivity2 = n58.requireActivity();
                A0r2 = AbstractC166987dD.A0r(n58.A00);
                c2Fb2 = C2Fb.A49;
                str2 = "clips_editor_advanced_settings";
                str5 = "https://help.instagram.com/225479678901832";
                AbstractC41776Ies.A09(requireActivity2, A0r2, c2Fb2, str5, str2);
                return;
            case 35:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                requireActivity = clipsEditMetadataController.A0n;
                A0r = clipsEditMetadataController.A0s;
                c2Fb = C2Fb.A1W;
                str = "https://help.instagram.com/761121959519495";
                AbstractC31177DnL.A0u(requireActivity, A0r, c2Fb, str);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C52110N4i c52110N4i, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = c52110N4i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N7G n7g, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = n7g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N8H n8h, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = n8h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C56343P0e c56343P0e, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = c56343P0e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C56364P0z c56364P0z, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = c56364P0z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(Rb5 rb5, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = rb5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = interfaceC16820sZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N5L n5l, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = n5l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N5U n5u, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = n5u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N61 n61, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = n61;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N63 n63, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = n63;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(int i, InterfaceC16660sJ interfaceC16660sJ) {
        super(Integer.valueOf(i));
        this.A00 = 21;
        this.A01 = interfaceC16660sJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N4H n4h, int i) {
        super(Integer.valueOf(i));
        this.A00 = 23;
        this.A01 = n4h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N4U n4u, int i) {
        super(Integer.valueOf(i));
        this.A00 = 29;
        this.A01 = n4u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C52112N4k c52112N4k, int i) {
        super(Integer.valueOf(i));
        this.A00 = 24;
        this.A01 = c52112N4k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C52123N4w c52123N4w, int i) {
        super(Integer.valueOf(i));
        this.A00 = 25;
        this.A01 = c52123N4w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N58 n58, int i) {
        super(Integer.valueOf(i));
        this.A00 = 34;
        this.A01 = n58;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(N7K n7k, int i) {
        super(Integer.valueOf(i));
        this.A00 = 28;
        this.A01 = n7k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(C52181N7q c52181N7q, int i) {
        super(Integer.valueOf(i));
        this.A00 = 8;
        this.A01 = c52181N7q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(NQ1 nq1, int i) {
        super(Integer.valueOf(i));
        this.A00 = 16;
        this.A01 = nq1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(FragmentActivity fragmentActivity, int i) {
        super(Integer.valueOf(i));
        this.A00 = 22;
        this.A01 = fragmentActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(MediaKitLink mediaKitLink, int i) {
        super(Integer.valueOf(i));
        this.A00 = 12;
        this.A01 = mediaKitLink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(ClipsEditMetadataController clipsEditMetadataController, int i) {
        super(Integer.valueOf(i));
        this.A00 = 35;
        this.A01 = clipsEditMetadataController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NY0(Integer num, Object obj, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj;
    }
}
