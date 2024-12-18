package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ok6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Ok6(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static void A00(View view, Object obj, String str, int i) {
        C0fQ.A00(new Ok6(str, obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        String str;
        int i2;
        String str2;
        String str3;
        Integer num;
        EnumC39589Hdz enumC39589Hdz;
        Integer num2;
        int A053;
        int size;
        CharSequence charSequence;
        C55071OaR c55071OaR;
        int i3;
        String str4;
        String str5;
        String str6;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(2005801734);
                C52352NEq c52352NEq = (C52352NEq) this.A01;
                AbstractC35253Fgm.A05(c52352NEq.A01, c52352NEq.A04, c52352NEq.A03.getModuleName(), this.A02, false);
                i = 1642034593;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A052 = C0f9.A05(1002401806);
                C52178N7n c52178N7n = (C52178N7n) this.A01;
                InterfaceC09390do interfaceC09390do = c52178N7n.A04;
                ((C50972Mff) interfaceC09390do.getValue()).A03 = this.A02;
                BrandedContentGatingInfo brandedContentGatingInfo = new BrandedContentGatingInfo(null, null, null, null, null);
                C50972Mff c50972Mff = (C50972Mff) interfaceC09390do.getValue();
                String str7 = "";
                if (!OO4.A00(brandedContentGatingInfo)) {
                    str = "";
                } else {
                    str = c52178N7n.getString(2131968953);
                }
                C14360o3.A0A(str);
                if (OO4.A01(brandedContentGatingInfo)) {
                    str7 = AbstractC55199Oe9.A03(c52178N7n.requireContext(), brandedContentGatingInfo);
                }
                c50972Mff.A00(brandedContentGatingInfo, str, str7);
                i2 = 2124988969;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A052 = C0f9.A05(1609111474);
                BugReportComposerFragment bugReportComposerFragment = (BugReportComposerFragment) this.A01;
                if (bugReportComposerFragment.A09) {
                    C0K8.A0D("BugReportComposerFragment", AbstractC43591JPw.A00(259));
                    C0f5 AEp = C18950wb.A01.AEp("BugReportComposerFragment", 817892340);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Ignoring bug composer video click because we are processing an action");
                    AEp.report();
                } else {
                    String str8 = this.A02;
                    FragmentActivity activity = bugReportComposerFragment.getActivity();
                    String token = bugReportComposerFragment.getSession().getToken();
                    boolean A1a = AbstractC167017dG.A1a(str8, token);
                    Bundle A09 = AbstractC31176DnK.A09(token);
                    A09.putString("VideoPreviewFragment.videoPath", str8);
                    HD3 hd3 = new HD3();
                    hd3.setArguments(A09);
                    if (activity != null) {
                        C140966Yy A0N = AbstractC31174DnI.A0N(hd3, activity, bugReportComposerFragment.getSession());
                        A0N.A0E = A1a;
                        A0N.A04();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                i2 = 860204825;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A053 = C0f9.A05(-1674526907);
                O2P o2p = ((C51123MiS) this.A01).A01;
                String str9 = this.A02;
                N6J n6j = o2p.A00;
                MSX.A0K(n6j).A1Y(C81X.A0h);
                OFX ofx = n6j.A06;
                str2 = "viewHolder";
                if (ofx != null) {
                    String A0g = AbstractC167007dF.A0g(ofx.A0A);
                    if (A0g == null) {
                        size = 0;
                    } else {
                        size = new HashSet(AbstractC85443rZ.A00(A0g)).size();
                    }
                    int A07 = AbstractC25225BEi.A07(C06090Tz.A05, MSX.A0H(n6j, 0), 36604928227415218L);
                    OFX ofx2 = n6j.A06;
                    if (ofx2 != null) {
                        IgAutoCompleteTextView igAutoCompleteTextView = ofx2.A0A;
                        if (AbstractC001900j.A0V(A0g, '#')) {
                            charSequence = str9.subSequence(1, str9.length());
                        } else {
                            charSequence = str9;
                        }
                        igAutoCompleteTextView.append(charSequence);
                        OFX ofx3 = n6j.A06;
                        if (ofx3 != null) {
                            ofx3.A0A.append(" ");
                            if ((A07 <= 0 || size < A07) && (c55071OaR = n6j.A03) != null) {
                                c55071OaR.A06.addAll(AbstractC166987dD.A1J(str9));
                                List A00 = C55071OaR.A00(c55071OaR);
                                if (A00 != null && !A00.isEmpty()) {
                                    C51123MiS c51123MiS = c55071OaR.A00;
                                    if (c51123MiS != null) {
                                        c51123MiS.A00 = A00;
                                        c51123MiS.notifyDataSetChanged();
                                    }
                                } else {
                                    c55071OaR.A07.invoke();
                                }
                            }
                            i3 = 1132232650;
                            C0f9.A0C(i3, A053);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                A052 = C0f9.A05(-1344047597);
                view.setOnClickListener(null);
                C52563NNj c52563NNj = (C52563NNj) this.A01;
                OIU A01 = AbstractC51040Mgq.A01(c52563NNj);
                InterfaceC58268PsC.A00(AbstractC31178DnM.A06("form_id", A01.A02), A01.A00, A01.A01, "lead_gen_full_page_context_card", "full_page_context_card_expand_description");
                IgTextView igTextView = c52563NNj.A01;
                if (igTextView != null) {
                    igTextView.setText(this.A02);
                }
                i2 = -1977809456;
                C0f9.A0C(i2, A052);
                return;
            case 5:
                A052 = C0f9.A05(376950203);
                N69 n69 = (N69) this.A01;
                N69.A01(n69, "primary_button_clicked", "terms", this.A02);
                C51043Mgu c51043Mgu = n69.A01;
                if (c51043Mgu == null) {
                    str2 = "productOnboardingViewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C2GS c2gs = c51043Mgu.A02;
                C51571MqP c51571MqP = (C51571MqP) c2gs.A02();
                if (c51571MqP != null) {
                    c51571MqP.A05 = true;
                }
                AbstractC50523MSb.A0s(c2gs);
                PZF.A02(c51043Mgu, AbstractC141776au.A00(c51043Mgu), 39);
                i2 = 1969546874;
                C0f9.A0C(i2, A052);
                return;
            case 6:
                A052 = C0f9.A05(-1565432186);
                N63 n63 = (N63) this.A01;
                n63.A02("primary_button_clicked", "welcome", this.A02);
                C51043Mgu A012 = n63.A01();
                C2GS c2gs2 = A012.A02;
                C51571MqP c51571MqP2 = (C51571MqP) c2gs2.A02();
                if (c51571MqP2 != null) {
                    c51571MqP2.A05 = true;
                }
                AbstractC50523MSb.A0s(c2gs2);
                PZW.A01(A012, AbstractC141776au.A00(A012), 29, false);
                i2 = -471975423;
                C0f9.A0C(i2, A052);
                return;
            case 7:
                A053 = C0f9.A05(73101735);
                N63 n632 = (N63) this.A01;
                n632.A02("secondary_button_clicked", "welcome", this.A02);
                AbstractC41776Ies.A09(n632.requireActivity(), AbstractC166987dD.A0r(n632.A04), C2Fb.A25, "https://help.instagram.com/2635536099905516", N63.__redex_internal_original_name);
                n632.A02("secondary_button_clicked", "welcome", "https://help.instagram.com/2635536099905516");
                i3 = 1216115169;
                C0f9.A0C(i3, A053);
                return;
            case 8:
                A053 = C0f9.A05(-1323149671);
                N6E n6e = (N6E) this.A01;
                String str10 = this.A02;
                n6e.A04("secondary_button_clicked", "feature_preview", NQ1.__redex_internal_original_name, str10);
                C63397SjR A0y = AbstractC25228BEl.A0y(n6e.requireActivity(), AbstractC166987dD.A0r(n6e.A02), C2Fb.A2m, str10);
                A0y.A0S = NQ1.__redex_internal_original_name;
                A0y.A0A();
                i3 = 173095682;
                C0f9.A0C(i3, A053);
                return;
            case 9:
                A053 = C0f9.A05(861925604);
                N6E n6e2 = (N6E) this.A01;
                n6e2.A04("primary_button_clicked", "feature_preview", NQ1.__redex_internal_original_name, this.A02);
                C51043Mgu A03 = n6e2.A03();
                PZF.A02(A03, AbstractC141776au.A00(A03), 41);
                i3 = 1367970369;
                C0f9.A0C(i3, A053);
                return;
            case 10:
                A053 = C0f9.A05(175596777);
                PCR pcr = (PCR) this.A01;
                O53 A032 = pcr.A03();
                Context A0L = AbstractC166997dE.A0L(pcr.A03);
                SimpleWebViewActivity.A02.A02(A0L, A032.A00.A06, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, this.A02, AbstractC63260SgI.A01(A0L, "https://www.facebook.com/privacy/policy/")));
                i3 = 1547337550;
                C0f9.A0C(i3, A053);
                return;
            case 11:
                A053 = C0f9.A05(-23675584);
                N6E n6e3 = (N6E) this.A01;
                n6e3.A04("primary_button_clicked", "what_you_need", NQ0.__redex_internal_original_name, this.A02);
                C51043Mgu A033 = n6e3.A03();
                PZF.A02(A033, AbstractC141776au.A00(A033), 40);
                i3 = 1419255287;
                C0f9.A0C(i3, A053);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A052 = C0f9.A05(-1322443261);
                IgLiveOptionsDialogViewModel A002 = C55064OaK.A00(this.A01);
                String str11 = this.A02;
                C14360o3.A0B(str11, 0);
                Object value = A002.A0C.A06.getValue();
                if (value != null) {
                    AbstractC166987dD.A1Z(new PZQ(value, A002, str11, null, 31), AbstractC141776au.A00(A002));
                }
                i2 = 394370437;
                C0f9.A0C(i2, A052);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A052 = C0f9.A05(-529221523);
                N7K n7k = (N7K) this.A01;
                InterfaceC09390do interfaceC09390do2 = n7k.A0E;
                interfaceC09390do2.getValue();
                OLM olm = (OLM) n7k.A0D.getValue();
                String str12 = n7k.A07;
                boolean z = n7k.A03;
                boolean A1a2 = AbstractC167017dG.A1a(olm, str12);
                if (z) {
                    str3 = "block_comments_from_save";
                } else {
                    str3 = "block_account_save";
                }
                olm.A02("upsell_bottom_sheet", str12, "comment_block_comments_from", str3);
                interfaceC09390do2.getValue();
                InterfaceC09390do interfaceC09390do3 = n7k.A0A;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do3);
                Object value2 = n7k.A0C.getValue();
                C14360o3.A0B(A0r, 0);
                C14360o3.A0B(value2, A1a2 ? 1 : 0);
                if (value2 == EnumC53178Nfa.A07) {
                    num = C05F.A0j;
                } else {
                    num = C05F.A0Y;
                }
                OVQ.A00.A00(A0r, num, C05F.A00, null, null, null);
                if (n7k.A03) {
                    C50886MeH c50886MeH = (C50886MeH) interfaceC09390do2.getValue();
                    n7k.requireContext();
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do3);
                    String str13 = this.A02;
                    n7k.A0B.getValue();
                    C14360o3.A0B(A0o, 1);
                    O6K o6k = c50886MeH.A00;
                    C57529Pg3 A003 = C57529Pg3.A00(c50886MeH, 2);
                    C57529Pg3 A004 = C57529Pg3.A00(c50886MeH, 3);
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("block", new JSONArray((Collection) MSX.A0m(str13)));
                    C1GL c1gl = o6k.A00;
                    C25621Ms A0c = AbstractC167017dG.A0c(A0o);
                    A0c.A0B("accounts/set_blocked_commenters/");
                    A0c.A9s("commenter_block_status", A0q.toString());
                    A0c.A0P(null, C40781ul.class, C55702hA.class, false);
                    C1ON A0T = AbstractC31172DnG.A0T(A0c, "container_module", "block_commenters_upsell");
                    MWM.A00(A0T, A004, A003, 24);
                    c1gl.schedule(A0T);
                } else if (n7k.A02) {
                    Object value3 = interfaceC09390do2.getValue();
                    Context requireContext = n7k.requireContext();
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do3);
                    String str14 = this.A02;
                    AbstractC167007dF.A1E(A0r2, A1a2 ? 1 : 0, n7k.A0B.getValue());
                    C57529Pg3 A005 = C57529Pg3.A00(value3, 1);
                    User A0k = AbstractC31174DnI.A0k(A0r2, str14);
                    if (A0k != null) {
                        AbstractC34336FCe.A00(requireContext, A0r2, A0k, new C36765GIo(A005, 7), "Upsell", "comment_deletion_block_upsell", null, 2, false);
                    }
                }
                C3DN A0l = AbstractC43593JPy.A0l(n7k, C3DN.A00);
                if (AbstractC167007dF.A1Z(n7k.A09)) {
                    C189478aR A006 = F86.A00(A0l);
                    if (A006 != null) {
                        A006.A0T();
                    }
                } else if (A0l != null) {
                    A0l.A0B();
                }
                i2 = -1952710617;
                C0f9.A0C(i2, A052);
                return;
            case 14:
                A053 = C0f9.A05(1428160830);
                TextView textView = (TextView) this.A01;
                RectF rectF = AbstractC13880nE.A01;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(this.A02);
                i3 = 267995053;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(-292625739);
                C52117N4p c52117N4p = (C52117N4p) this.A01;
                InterfaceC09390do interfaceC09390do4 = c52117N4p.A06;
                interfaceC09390do4.getValue();
                OLM olm2 = (OLM) c52117N4p.A05.getValue();
                String str15 = c52117N4p.A00;
                InterfaceC09390do interfaceC09390do5 = c52117N4p.A02;
                boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do5);
                boolean A1a3 = AbstractC167017dG.A1a(olm2, str15);
                if (A1Z) {
                    enumC39589Hdz = EnumC39589Hdz.A0F;
                } else {
                    enumC39589Hdz = EnumC39589Hdz.A0E;
                }
                olm2.A02("upsell_bottom_sheet", str15, enumC39589Hdz.A00, "contextual_upsell_tap");
                interfaceC09390do4.getValue();
                InterfaceC09390do interfaceC09390do6 = c52117N4p.A04;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do6);
                List A1J = AbstractC166987dD.A1J(this.A02);
                boolean A1Z2 = AbstractC167007dF.A1Z(interfaceC09390do5);
                C14360o3.A0B(A0r3, 0);
                if (A1Z2) {
                    num2 = C05F.A0N;
                } else {
                    num2 = C05F.A0C;
                }
                OVQ.A00.A00(A0r3, num2, C05F.A00, null, null, A1J);
                C37091o7.A00();
                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do6);
                FragmentActivity requireActivity = c52117N4p.requireActivity();
                int A013 = AbstractC167027dH.A01(c52117N4p.A03);
                C14360o3.A0B(A0r4, 0);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A06();
                A0K.A02 = A013;
                A0K.A0D = AbstractC167017dG.A0k(requireActivity.getResources(), A1a3 ? 1 : 0, R.plurals.suggested_hidden_words_toast_text);
                AbstractC31175DnJ.A0l(requireActivity, A0K, 2131974893);
                A0K.A0A(new C42704Iuz(requireActivity, A0r4, 5));
                A0K.A0L = A1a3;
                AbstractC25233BEq.A1F(A0K);
                C52117N4p.A00(c52117N4p);
                i2 = 1533357232;
                C0f9.A0C(i2, A052);
                return;
            case 16:
                A05 = C0f9.A05(-623434338);
                C52127N5a c52127N5a = (C52127N5a) this.A01;
                Nj6 nj6 = c52127N5a.A00;
                if (nj6 == null) {
                    str2 = "entrySurface";
                } else {
                    UserSession A0r5 = AbstractC166987dD.A0r(c52127N5a.A03);
                    C38321qM c38321qM = c52127N5a.A01;
                    if (c38321qM == null) {
                        str2 = "entryMedia";
                    } else {
                        C14360o3.A0B(A0r5, 1);
                        AbstractC54298NzI.A00(nj6, c52127N5a, A0r5, c38321qM, C05F.A0N, null, AbstractC166987dD.A1I());
                        AbstractC41776Ies.A03(c52127N5a.requireContext(), this.A02);
                        i = -593281173;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 17:
                A053 = C0f9.A05(1205518730);
                OXk.A02(AbstractC31172DnG.A0C(this.A01), null, this.A02);
                i3 = -739374147;
                C0f9.A0C(i3, A053);
                return;
            case 18:
                A053 = C0f9.A05(-2057934953);
                OXk.A01(AbstractC31172DnG.A0C(this.A01), this.A02);
                i3 = -608073845;
                C0f9.A0C(i3, A053);
                return;
            default:
                A052 = C0f9.A05(204891396);
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                UserSession userSession = clipsEditMetadataController.A0s;
                C22C A014 = AnonymousClass229.A01(userSession);
                String str16 = this.A02;
                if (str16 != null && str16.length() != 0) {
                    str4 = "EDIT_LINK_ROW";
                } else {
                    str4 = "ADD_LINK_ROW";
                }
                C38321qM c38321qM2 = clipsEditMetadataController.A0D;
                if (c38321qM2 != null) {
                    str5 = c38321qM2.getId();
                } else {
                    str5 = null;
                }
                EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
                String id = AbstractC166987dD.A10(userSession).getId();
                if (str16 != null && str16.length() != 0) {
                    str6 = "edit_button";
                } else {
                    str6 = "add_button";
                }
                A014.A1V(enumC50631MWs, str4, str5, id, str6, clipsEditMetadataController.A0r.getModuleName());
                AbstractC53941NtE.A00(clipsEditMetadataController.A0n, userSession, str16, new C30181DRm(clipsEditMetadataController, 46));
                i2 = -135879005;
                C0f9.A0C(i2, A052);
                return;
        }
    }
}
