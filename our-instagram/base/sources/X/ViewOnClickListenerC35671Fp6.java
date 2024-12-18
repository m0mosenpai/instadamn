package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fp6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35671Fp6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ViewOnClickListenerC35671Fp6(C32325ELt c32325ELt, String str, int i) {
        this.A00 = i;
        if (7 - i != 0) {
            this.A01 = c32325ELt;
            this.A02 = str;
        } else {
            this.A01 = c32325ELt;
            this.A02 = str;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        UserSession userSession;
        User A2E;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1407778956);
                C44548Jms.A01(new C32396EOx(this.A02), (C44548Jms) this.A01);
                i = -1425083664;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1536596001);
                C33151Eju c33151Eju = (C33151Eju) this.A01;
                FRU fru = new FRU(c33151Eju, AbstractC166987dD.A0r(c33151Eju.A09));
                String str2 = this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fru.A00, "instagram_action_private_list");
                if (A0f.isSampled()) {
                    C32018E4u.A00(A0f, "delete_list");
                    A0f.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f.A9K("private_list_id", AbstractC166997dE.A0j(str2));
                    A0f.AAP("private_list_name", null);
                    A0f.Cht();
                }
                C193328hC A0b = AbstractC31176DnK.A0b(c33151Eju);
                A0b.A05 = c33151Eju.getString(2131957675);
                AbstractC31179DnN.A11(c33151Eju, A0b, 2131957674);
                A0b.A0R(new DialogInterfaceOnClickListenerC35446Fk3(str2, c33151Eju, 3), EnumC193348hE.A05, 2131957640);
                A0b.A0D(DialogInterfaceOnClickListenerC35391Fj6.A00);
                AbstractC31178DnM.A1R(A0b, true);
                i = 618795388;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-776733043);
                C33151Eju c33151Eju2 = (C33151Eju) this.A01;
                FRU fru2 = new FRU(c33151Eju2, AbstractC166987dD.A0r(c33151Eju2.A09));
                String str3 = this.A02;
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(fru2.A00, "instagram_action_private_list");
                if (A0f2.isSampled()) {
                    C32018E4u.A00(A0f2, "rename_list");
                    A0f2.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f2.A9K("private_list_id", AbstractC166997dE.A0j(str3));
                    A0f2.AAP("private_list_name", null);
                    A0f2.Cht();
                }
                c33151Eju2.A04 = true;
                EditText editText = (EditText) AbstractC166997dE.A0R(c33151Eju2.requireView(), R.id.list_name_edit_text);
                AbstractC166997dE.A0S(c33151Eju2.requireView(), R.id.edit_text_container).setVisibility(0);
                editText.requestFocus();
                editText.setSelection(editText.length());
                AbstractC13880nE.A0R(editText);
                i = -2097573381;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-144362520);
                EOO eoo = (EOO) this.A01;
                C147036jf c147036jf = eoo.A02;
                if (c147036jf != null) {
                    c147036jf.A02(true, null, this.A02, null);
                    Map map = eoo.A0A;
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        if (eoo.A0D.contains(A1K.getValue())) {
                            AbstractC31177DnL.A1S(A1K, A1I);
                        }
                    }
                    Context requireContext = eoo.requireContext();
                    String A01 = AbstractC35171FfO.A01(AbstractC166997dE.A0a(), A1I);
                    C14360o3.A07(A01);
                    C1ON A00 = AbstractC35238FgX.A00(requireContext, AbstractC166987dD.A0r(eoo.A0E), A01, "partial_ci_selection", "partial_contact_import", true, true);
                    C32548EUy.A01(A00, eoo, 45);
                    AbstractC31177DnL.A19(eoo, A00);
                    i = -1380414134;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "contactImportLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                A05 = C0f9.A05(659186319);
                EOO eoo2 = (EOO) this.A01;
                C35111FeD.A00(AbstractC166987dD.A0o(eoo2.A0E), null, "partial_ci_selection");
                C147036jf c147036jf2 = eoo2.A02;
                if (c147036jf2 != null) {
                    c147036jf2.A03(null, this.A02, true);
                    AbstractC31175DnJ.A1P(eoo2.A04);
                    i = 1470487831;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "contactImportLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A05 = C0f9.A05(1022947298);
                C32270EJf c32270EJf = (C32270EJf) this.A01;
                C31835Dyu c31835Dyu = c32270EJf.A02;
                str = "viewModel";
                if (c31835Dyu != null) {
                    C2EC c2ec = (C2EC) c31835Dyu.A07.getValue();
                    if (c2ec != null) {
                        String str4 = this.A02;
                        C31835Dyu c31835Dyu2 = c32270EJf.A02;
                        if (c31835Dyu2 != null) {
                            C31835Dyu.A00((C2EC) c31835Dyu2.A07.getValue(), new GWH(c31835Dyu2, 18));
                            ArrayList A012 = C4GO.A01(c2ec.BSH());
                            InterfaceC83703oF A002 = AbstractC31232DoF.A00(c2ec.C7I(), A012);
                            String str5 = c32270EJf.A09;
                            if (str5 == null) {
                                str = "promptTitle";
                            } else {
                                String str6 = c32270EJf.A06;
                                if (str6 == null) {
                                    str = "collectionId";
                                } else {
                                    String str7 = c32270EJf.A07;
                                    if (str7 == null) {
                                        str = "collectionType";
                                    } else {
                                        AbstractC165967bO.A00(AbstractC166987dD.A0r(c32270EJf.A0D)).A0H(new DirectShareTarget(A002, Integer.valueOf(C7D2.A01(str7).A00), str5, str6, A012), null, str4);
                                        SpinnerImageView spinnerImageView = c32270EJf.A04;
                                        if (spinnerImageView != null) {
                                            AbstractC31171DnF.A1M(spinnerImageView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i = -1113003298;
                    C0f9.A0C(i, A05);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                A05 = C0f9.A05(-2021034375);
                AbstractC41776Ies.A03(AbstractC31172DnG.A07(this.A01), this.A02);
                i = 1611351524;
                C0f9.A0C(i, A05);
                return;
            case 7:
                C32325ELt c32325ELt = (C32325ELt) this.A01;
                String str8 = this.A02;
                AbstractC34076F2e.A00(c32325ELt.requireContext(), c32325ELt, c32325ELt.A02, c32325ELt.A05, str8, c32325ELt.A07, c32325ELt.A00, c32325ELt.A0A, false);
                return;
            case 8:
                A05 = C0f9.A05(-1154481342);
                C32325ELt c32325ELt2 = (C32325ELt) this.A01;
                UserSession userSession2 = c32325ELt2.A02;
                FragmentActivity requireActivity = c32325ELt2.requireActivity();
                String str9 = this.A02;
                AbstractC167017dG.A1O(userSession2, str9);
                AbstractC31510Dsu.A0Q(requireActivity, AbstractC31180DnO.A03(str9), c32325ELt2, userSession2, "share_to_system_sheet", AbstractC166987dD.A1G());
                i = -600212495;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(242953359);
                EIG eig = (EIG) this.A01;
                C63397SjR A0y = AbstractC25228BEl.A0y(eig.requireActivity(), AbstractC166987dD.A0r(eig.A03), C2Fb.A21, this.A02);
                A0y.A0S = EIG.__redex_internal_original_name;
                A0y.A0A();
                i = 2014086692;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(1376566615);
                EIH eih = (EIH) this.A01;
                Fragment fragment = eih.mParentFragment;
                if ((fragment instanceof BottomSheetFragment) && fragment != null) {
                    String str10 = this.A02;
                    EOS eos = eih.A00;
                    if (eos != null) {
                        EOS.A00(eos, str10, false);
                    }
                }
                i = 1031918308;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(1381085716);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new PZ1(abstractC52922bZ, this.A02, null, 4), AbstractC141776au.A00(abstractC52922bZ));
                i = -688292115;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(568713102);
                SearchEditText searchEditText = ((FQY) ((C31876Dzi) this.A01).A01).A06;
                String str11 = this.A02;
                searchEditText.setText(str11);
                searchEditText.setSelection(str11.length());
                i = 1423665707;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-919777277);
                C42590It8 c42590It8 = (C42590It8) this.A01;
                String str12 = this.A02;
                C38321qM c38321qM = c42590It8.A01;
                if (c38321qM != null && (A2E = c38321qM.A2E((userSession = c42590It8.A08))) != null) {
                    C38K c38k = c42590It8.A07;
                    C1571673v.A08(c38k, userSession, AbstractC31179DnN.A0R(userSession, A2E), "tap_website", A2E.getId(), c38321qM.getId(), c38321qM.CAR(), "pbia_profile_header");
                    FT3.A01(userSession, null, c38k.getModuleName(), "visit_website", "pbia_profile", A2E.getId(), AbstractC38851rI.A06(A2E.B7L()));
                    InterfaceC60442pS interfaceC60442pS = c42590It8.A09;
                    C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "bio_link_opened");
                    c82713mZ.A7U = str12;
                    c82713mZ.A62 = c38321qM.getId();
                    c82713mZ.A4Q = userSession.userId;
                    c82713mZ.A7K = A2E.getId();
                    c82713mZ.A61 = c38321qM.getId();
                    c82713mZ.A7Q = c38321qM.CAR();
                    C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A00);
                }
                C63397SjR c63397SjR = c42590It8.A02;
                if (c63397SjR == null) {
                    C38K c38k2 = c42590It8.A07;
                    c63397SjR = new C63397SjR(c38k2.requireActivity(), c42590It8.A08, C2Fb.A2n, str12, false);
                    c63397SjR.A0S = c38k2.getModuleName();
                    c42590It8.A02 = c63397SjR;
                }
                c63397SjR.A0A();
                i = -1282884656;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(1641339099);
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString(AbstractC111324zv.A00(595), "edit_profile");
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                AbstractC31174DnI.A0a(c31721DwQ.requireActivity(), A0b2, c31721DwQ.A0V, ModalActivity.class, this.A02).A0D(c31721DwQ, 7002);
                i = -1200683514;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1418588594);
                android.net.Uri A03 = AbstractC08820cl.A03(this.A02);
                if (A03.getPath() != null && A03.getPath().equals("bloks")) {
                    C33234ElT c33234ElT = (C33234ElT) this.A01;
                    String queryParameter = A03.getQueryParameter("bloks_app_id");
                    String queryParameter2 = A03.getQueryParameter("params");
                    Context context = c33234ElT.getContext();
                    if (queryParameter != null && context != null) {
                        C6WQ A0i = AbstractC31174DnI.A0i(context);
                        AbstractC31176DnK.A13(context, A0i);
                        A0i.setCancelable(false);
                        C0fJ.A00(A0i);
                        UserSession userSession3 = c33234ElT.A02;
                        AbstractC192798gL A04 = C192108fB.A04(userSession3, queryParameter, AbstractC69885VxC.A01(userSession3, queryParameter2));
                        C32394EOv.A00(A04, c33234ElT, A0i, 15);
                        c33234ElT.schedule(A04);
                    }
                }
                i = -1450292910;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1220231215);
                ((NAF) this.A01).A02(this.A02);
                i = -2128072378;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC35671Fp6(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
