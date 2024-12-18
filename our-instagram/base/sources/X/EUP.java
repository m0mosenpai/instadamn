package X;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EUP extends C1P1 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public EUP(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-1134734777);
                super.onFail(abstractC115105If);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A01;
                C9GR.A05(supportServiceEditUrlFragment.getContext());
                ActionButton actionButton = supportServiceEditUrlFragment.A00;
                actionButton.getClass();
                actionButton.setDisplayedChild(0);
                String A0h = AbstractC31180DnO.A0h(abstractC115105If);
                C35198Ffq c35198Ffq = supportServiceEditUrlFragment.A02;
                String str2 = supportServiceEditUrlFragment.A07;
                boolean z = supportServiceEditUrlFragment.A0C;
                String str3 = supportServiceEditUrlFragment.A05;
                String str4 = supportServiceEditUrlFragment.A0B;
                String str5 = this.A02;
                AbstractC25233BEq.A0v(0, str2, str3, str4);
                InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
                AbstractC31171DnF.A1A(A00, "validate_url");
                AbstractC31171DnF.A1C(A00, "error");
                C35198Ffq.A01(A00, c35198Ffq, str2, str3, z);
                AbstractC31176DnK.A1L(A00, str4, str5);
                A00.AAP("error_message", A0h);
                A00.Cht();
                i = 1065790835;
                break;
            case 2:
                A03 = C0f9.A03(-456097780);
                super.onFail(abstractC115105If);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A01;
                supportServiceEditUrlFragment2.A04.dismiss();
                C9GR.A05(supportServiceEditUrlFragment2.getContext());
                String A0h2 = AbstractC31180DnO.A0h(abstractC115105If);
                C35198Ffq c35198Ffq2 = supportServiceEditUrlFragment2.A02;
                String str6 = supportServiceEditUrlFragment2.A07;
                boolean z2 = supportServiceEditUrlFragment2.A0C;
                String str7 = supportServiceEditUrlFragment2.A05;
                String str8 = supportServiceEditUrlFragment2.A0B;
                String str9 = this.A02;
                AbstractC167027dH.A0a(0, str6, str7, str8, str9);
                InterfaceC02590Ai A002 = C35198Ffq.A00(c35198Ffq2);
                AbstractC31171DnF.A1A(A002, "flow_update_info");
                AbstractC31171DnF.A1C(A002, "error");
                C35198Ffq.A01(A002, c35198Ffq2, str6, str7, z2);
                AbstractC31176DnK.A1L(A002, str8, str9);
                A002.AAP("error_message", A0h2);
                A002.Cht();
                i = 1666279192;
                break;
            case 3:
                A03 = C0f9.A03(1502546608);
                super.onFail(abstractC115105If);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment3 = (SupportServiceEditUrlFragment) this.A01;
                C9GR.A05(supportServiceEditUrlFragment3.getContext());
                String A0h3 = AbstractC31180DnO.A0h(abstractC115105If);
                C35198Ffq c35198Ffq3 = supportServiceEditUrlFragment3.A02;
                String str10 = supportServiceEditUrlFragment3.A07;
                String str11 = supportServiceEditUrlFragment3.A05;
                String str12 = supportServiceEditUrlFragment3.A0B;
                String str13 = this.A02;
                AbstractC25233BEq.A0v(1, str11, str12, str13);
                InterfaceC02590Ai A003 = C35198Ffq.A00(c35198Ffq3);
                AbstractC31171DnF.A1A(A003, "update_action_button");
                AbstractC31171DnF.A1C(A003, "error");
                C35198Ffq.A01(A003, c35198Ffq3, str10, str11, true);
                AbstractC31176DnK.A1L(A003, str12, str13);
                A003.AAP("error_message", A0h3);
                A003.AAP("button_label", null);
                A003.Cht();
                i = -53834350;
                break;
            case 4:
                int A032 = C0f9.A03(-46868211);
                C32356ENd c32356ENd = (C32356ENd) this.A01;
                EQM eqm = c32356ENd.A03;
                if (eqm == null) {
                    C14360o3.A0F("userListAdapter");
                    throw C00O.createAndThrow();
                }
                eqm.A0C = false;
                eqm.A04 = new GHR(c32356ENd, null, null);
                eqm.A0A = true;
                eqm.A03();
                C0f9.A0A(733234876, A032);
                return;
            case 5:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -904967511);
                C32277EJm c32277EJm = (C32277EJm) this.A01;
                FragmentActivity activity = c32277EJm.getActivity();
                if (activity != null) {
                    C32277EJm.A00(EnumC141996bI.A05, AbstractC166997dE.A0p(activity, 2131974293), "multiple_links_create_or_edit_bio_link_request_failed");
                }
                InterfaceC09390do interfaceC09390do = c32277EJm.A07;
                C155506yf c155506yf = (C155506yf) interfaceC09390do.getValue();
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null || (str = A01.getMessage()) == null) {
                    str = "";
                }
                c155506yf.A02(str);
                AbstractC31177DnL.A1T(interfaceC09390do);
                i = 114658835;
                break;
            case 6:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 129477012);
                AbstractC35254Fgn.A02(((C36671GEr) this.A01).A00, abstractC115105If);
                i = -332978526;
                break;
            case 7:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 753976865);
                AbstractC35254Fgn.A02(((C36671GEr) this.A01).A00, abstractC115105If);
                i = -78980553;
                break;
            case 8:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1836055457);
                C58411Pup c58411Pup = (C58411Pup) this.A01;
                Throwable A012 = abstractC115105If.A01();
                C14360o3.A0C(A012, AbstractC111324zv.A00(2804));
                c58411Pup.A00((Exception) A012);
                i = 1259258072;
                break;
            case 9:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1900276150);
                super.onFail(abstractC115105If);
                C33224ElC c33224ElC = (C33224ElC) this.A01;
                C33224ElC.A02(c33224ElC, new C57259Pbh(this.A02, c33224ElC, 16));
                i = -11498267;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(-1861450274);
                ((SupportServiceEditUrlFragment) this.A01).A04.dismiss();
                i = -177346414;
                break;
            case 4:
            default:
                super.onFinish();
                return;
            case 5:
                A03 = C0f9.A03(450148298);
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 != null) {
                    AbstractC31176DnK.A0y(A09, C56352iT.A0t);
                }
                i = 1286582868;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(1390452464);
                C0fJ.A00(((SupportServiceEditUrlFragment) this.A01).A04);
                i = 416770329;
                break;
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                super.onStart();
                return;
            case 4:
                int A032 = C0f9.A03(-194906214);
                EQM eqm = ((C32356ENd) this.A01).A03;
                if (eqm == null) {
                    C14360o3.A0F("userListAdapter");
                    throw C00O.createAndThrow();
                }
                eqm.A0C = true;
                eqm.A03();
                C0f9.A0A(660876699, A032);
                return;
            case 5:
                A03 = C0f9.A03(1670785859);
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 != null) {
                    AbstractC31176DnK.A0z(A09, C56352iT.A0t);
                }
                i = 1535595782;
                break;
            case 10:
                A03 = C0f9.A03(-85546160);
                AbstractC23021Ah.A00((UserSession) this.A01).A15(this.A02, false, true, false);
                i = 1215443295;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        String str;
        int i2;
        Dialog A02;
        int i3;
        int i4;
        int A032;
        int i5;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-131474481);
                U3B u3b = (U3B) obj;
                int A0N = AbstractC167017dG.A0N(u3b, -1611578521);
                C9JQ c9jq = new C9JQ(C05F.A0C, null, null, ((U3C) u3b).A02, ((U3C) u3b).A03, null, u3b.A01, null, u3b.A04, u3b.A05, u3b.A06);
                C71102Wny c71102Wny = (C71102Wny) this.A01;
                c71102Wny.A01.AA4(c9jq, this.A02);
                c71102Wny.A00 = u3b.A06;
                C71102Wny.A00(c71102Wny);
                C0f9.A0A(757606127, A0N);
                i = -1078368172;
                break;
            case 1:
                int A033 = C0f9.A03(-1953877841);
                EDM edm = (EDM) obj;
                int A034 = C0f9.A03(1542921563);
                super.onSuccess(edm);
                boolean z = edm.A01;
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A01;
                String string = supportServiceEditUrlFragment.getString(2131976417);
                if (z) {
                    AbstractC31171DnF.A16(supportServiceEditUrlFragment);
                    boolean z2 = supportServiceEditUrlFragment.A0C;
                    String str2 = this.A02;
                    if (z2) {
                        SupportServiceEditUrlFragment.A03(supportServiceEditUrlFragment, str2);
                    } else {
                        SupportServiceEditUrlFragment.A02(supportServiceEditUrlFragment, str2);
                    }
                } else {
                    string = edm.A00;
                    if (TextUtils.isEmpty(string)) {
                        string = supportServiceEditUrlFragment.getString(2131964639);
                    }
                }
                ActionButton actionButton = supportServiceEditUrlFragment.A00;
                actionButton.getClass();
                actionButton.setDisplayedChild(0);
                boolean z3 = !z;
                supportServiceEditUrlFragment.mURLTitleTextView.setText(string);
                TextView textView = supportServiceEditUrlFragment.mURLTitleTextView;
                Context requireContext = supportServiceEditUrlFragment.requireContext();
                Context requireContext2 = supportServiceEditUrlFragment.requireContext();
                int i6 = R.attr.igds_color_secondary_text;
                if (z3) {
                    i6 = R.attr.igds_color_error_or_destructive;
                }
                AbstractC166987dD.A1O(requireContext, textView, AbstractC53242c7.A0H(requireContext2, i6));
                C35198Ffq c35198Ffq = supportServiceEditUrlFragment.A02;
                String str3 = supportServiceEditUrlFragment.A07;
                boolean z4 = supportServiceEditUrlFragment.A0C;
                String str4 = supportServiceEditUrlFragment.A05;
                String str5 = supportServiceEditUrlFragment.A0B;
                String str6 = this.A02;
                AbstractC25233BEq.A0v(0, str3, str4, str5);
                InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
                AbstractC31171DnF.A1A(A00, "validate_url");
                if (z) {
                    str = "url_valid";
                } else {
                    str = "url_invalid";
                }
                AbstractC31171DnF.A1C(A00, str);
                C35198Ffq.A01(A00, c35198Ffq, str3, str4, z4);
                AbstractC31176DnK.A1L(A00, str5, str6);
                A00.Cht();
                C0f9.A0A(-1486752700, A034);
                C0f9.A0A(-1137586621, A033);
                return;
            case 2:
                A03 = C0f9.A03(-90128840);
                EBJ ebj = (EBJ) obj;
                int A035 = C0f9.A03(-667071555);
                super.onSuccess(ebj);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A01;
                SupportServiceEditUrlFragment.A00(ebj.A00, supportServiceEditUrlFragment2);
                String str7 = supportServiceEditUrlFragment2.A08;
                if (str7 == null && "business_hub".equals(supportServiceEditUrlFragment2.A0A)) {
                    String str8 = this.A02;
                    C193328hC A0P = AbstractC31180DnO.A0P(supportServiceEditUrlFragment2);
                    SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment2.A01;
                    int ordinal = sMBPartnerType.ordinal();
                    if (ordinal != 6) {
                        if (ordinal != 3) {
                            if (ordinal == 2) {
                                i3 = 2131961123;
                            } else {
                                throw AbstractC31180DnO.A0m(sMBPartnerType);
                            }
                        } else {
                            i3 = 2131957733;
                        }
                    } else {
                        i3 = 2131963232;
                    }
                    A0P.A05 = AbstractC31174DnI.A0w(supportServiceEditUrlFragment2, supportServiceEditUrlFragment2.getString(i3), 2131952141);
                    SMBPartnerType sMBPartnerType2 = supportServiceEditUrlFragment2.A01;
                    if (sMBPartnerType2.equals(SMBPartnerType.A09)) {
                        AbstractC31177DnL.A1A(supportServiceEditUrlFragment2, A0P, supportServiceEditUrlFragment2.A0B, 2131963233);
                    } else {
                        if (sMBPartnerType2.equals(SMBPartnerType.A06)) {
                            i4 = 2131969244;
                        } else if (sMBPartnerType2.equals(SMBPartnerType.A05)) {
                            i4 = 2131961121;
                        }
                        A0P.A09(i4);
                    }
                    A0P.A0e(new DialogInterfaceOnClickListenerC35446Fk3(str8, supportServiceEditUrlFragment2, 1), supportServiceEditUrlFragment2.getString(2131952311));
                    A0P.A0b(DialogInterfaceOnClickListenerC35452Fk9.A00(supportServiceEditUrlFragment2, 23), supportServiceEditUrlFragment2.getString(2131968688));
                    A02 = A0P.A02();
                } else {
                    if (str7 == null && !supportServiceEditUrlFragment2.A0A.equals("sticker")) {
                        AbstractC34026F0f.A00(new EUP(this.A02, supportServiceEditUrlFragment2, 3), supportServiceEditUrlFragment2.A03, supportServiceEditUrlFragment2, supportServiceEditUrlFragment2.A01.toString());
                    } else if (!supportServiceEditUrlFragment2.A0C && str7 != null && !supportServiceEditUrlFragment2.A0A.equals("sticker")) {
                        String str9 = this.A02;
                        C193328hC A0P2 = AbstractC31180DnO.A0P(supportServiceEditUrlFragment2);
                        A0P2.A0A(2131969292);
                        SMBPartnerType sMBPartnerType3 = supportServiceEditUrlFragment2.A01;
                        int ordinal2 = sMBPartnerType3.ordinal();
                        if (ordinal2 != 6) {
                            if (ordinal2 != 3) {
                                if (ordinal2 == 2) {
                                    i2 = 2131961123;
                                } else {
                                    throw AbstractC31180DnO.A0m(sMBPartnerType3);
                                }
                            } else {
                                i2 = 2131957733;
                            }
                        } else {
                            i2 = 2131963232;
                        }
                        A0P2.A0r(supportServiceEditUrlFragment2.getString(2131969291, supportServiceEditUrlFragment2.getString(i2), supportServiceEditUrlFragment2.A09));
                        A0P2.A0e(new DialogInterfaceOnClickListenerC35446Fk3(str9, supportServiceEditUrlFragment2, 2), supportServiceEditUrlFragment2.getString(2131952311));
                        A0P2.A0b(DialogInterfaceOnClickListenerC35452Fk9.A00(supportServiceEditUrlFragment2, 24), supportServiceEditUrlFragment2.getString(2131968688));
                        A02 = A0P2.A02();
                    } else {
                        supportServiceEditUrlFragment2.A04.dismiss();
                        supportServiceEditUrlFragment2.A0G.post(new RunnableC36817GKq(this));
                    }
                    C35198Ffq c35198Ffq2 = supportServiceEditUrlFragment2.A02;
                    String str10 = supportServiceEditUrlFragment2.A07;
                    String str11 = supportServiceEditUrlFragment2.A05;
                    String str12 = supportServiceEditUrlFragment2.A0B;
                    String str13 = this.A02;
                    C14360o3.A0B(str10, 0);
                    AbstractC25233BEq.A0v(1, str11, str12, str13);
                    InterfaceC02590Ai A002 = C35198Ffq.A00(c35198Ffq2);
                    AbstractC31171DnF.A1A(A002, "flow_update_info");
                    AbstractC31171DnF.A1C(A002, "success");
                    C35198Ffq.A01(A002, c35198Ffq2, str10, str11, true);
                    AbstractC31176DnK.A1L(A002, str12, str13);
                    A002.Cht();
                    C0f9.A0A(-1510183621, A035);
                    i = -857819075;
                    break;
                }
                C0fJ.A00(A02);
                C35198Ffq c35198Ffq22 = supportServiceEditUrlFragment2.A02;
                String str102 = supportServiceEditUrlFragment2.A07;
                String str112 = supportServiceEditUrlFragment2.A05;
                String str122 = supportServiceEditUrlFragment2.A0B;
                String str132 = this.A02;
                C14360o3.A0B(str102, 0);
                AbstractC25233BEq.A0v(1, str112, str122, str132);
                InterfaceC02590Ai A0022 = C35198Ffq.A00(c35198Ffq22);
                AbstractC31171DnF.A1A(A0022, "flow_update_info");
                AbstractC31171DnF.A1C(A0022, "success");
                C35198Ffq.A01(A0022, c35198Ffq22, str102, str112, true);
                AbstractC31176DnK.A1L(A0022, str122, str132);
                A0022.Cht();
                C0f9.A0A(-1510183621, A035);
                i = -857819075;
                break;
            case 3:
                C0f9.A03(-1905794726);
                EDN edn = (EDN) obj;
                C0f9.A03(1287113569);
                super.onSuccess(edn);
                AbstractC166987dD.A10(((SupportServiceEditUrlFragment) this.A01).A03).A03.ETN(edn.A01);
                edn.A00();
                throw C00O.createAndThrow();
            case 4:
                A032 = C0f9.A03(1992256396);
                C33137Ejg c33137Ejg = (C33137Ejg) obj;
                int A036 = C0f9.A03(-1056287927);
                C14360o3.A0B(c33137Ejg, 0);
                C32356ENd c32356ENd = (C32356ENd) this.A01;
                EQM eqm = c32356ENd.A03;
                String str14 = "userListAdapter";
                if (eqm != null) {
                    eqm.A0C = false;
                    GFV gfv = c32356ENd.A01;
                    if (gfv == null) {
                        str14 = "searchBarController";
                    } else {
                        if (gfv.A01.length() > 0) {
                            Collection collection = c33137Ejg.A01;
                            if (collection == null) {
                                collection = C16930sl.A00;
                            }
                            eqm.A05(collection);
                            c32356ENd.getScrollingViewProxy().EMV(false);
                            c32356ENd.A04 = this.A02;
                        }
                        C0f9.A0A(1834194077, A036);
                        i5 = -454151018;
                        C0f9.A0A(i5, A032);
                        return;
                    }
                }
                C14360o3.A0F(str14);
                throw C00O.createAndThrow();
            case 5:
                A03 = C0f9.A03(-1709734960);
                EC8 ec8 = (EC8) obj;
                int A0N2 = AbstractC167017dG.A0N(ec8, 1748117801);
                C32277EJm c32277EJm = (C32277EJm) this.A01;
                FragmentActivity activity = c32277EJm.getActivity();
                if (activity != null) {
                    int i7 = 2131970198;
                    if (this.A02 == null) {
                        i7 = 2131970194;
                    }
                    C32277EJm.A00(EnumC141996bI.A04, AbstractC166997dE.A0p(activity, i7), "");
                    activity.onBackPressed();
                }
                C36115Fwp.A00((C25671My) c32277EJm.A08.getValue(), ec8.A00, AbstractC31173DnH.A0t(c32277EJm.A09));
                AbstractC31177DnL.A1T(c32277EJm.A07);
                C0f9.A0A(619828742, A0N2);
                i = -1164319350;
                break;
            case 6:
                A03 = C0f9.A03(-1047059502);
                ECS ecs = (ECS) obj;
                int A0N3 = AbstractC167017dG.A0N(ecs, 803765465);
                Integer num = ecs.A01;
                if (num == C05F.A01) {
                    Context context = ((C36671GEr) this.A01).A00;
                    AbstractC31175DnJ.A0m(context, context.getString(2131969568));
                } else if (num == C05F.A00) {
                    C36671GEr c36671GEr = (C36671GEr) this.A01;
                    String str15 = this.A02;
                    C35002FbZ c35002FbZ = ecs.A00;
                    C14360o3.A07(c35002FbZ);
                    c36671GEr.A01.post(new RunnableC36951GPu(c35002FbZ, c36671GEr, str15));
                }
                C0f9.A0A(-1892232673, A0N3);
                i = -985474177;
                break;
            case 7:
                A032 = C0f9.A03(-2012840003);
                EDW edw = (EDW) obj;
                int A0N4 = AbstractC167017dG.A0N(edw, -1516800837);
                C36671GEr c36671GEr2 = (C36671GEr) this.A01;
                String str16 = this.A02;
                C35002FbZ c35002FbZ2 = edw.A00;
                C14360o3.A07(c35002FbZ2);
                c36671GEr2.A01.post(new RunnableC36951GPu(c35002FbZ2, c36671GEr2, str16));
                C0f9.A0A(1541088746, A0N4);
                i5 = 1327868882;
                C0f9.A0A(i5, A032);
                return;
            case 8:
                A032 = C0f9.A03(-1432569202);
                int A037 = C0f9.A03(1082155825);
                ((C58411Pup) this.A01).A01(this.A02);
                C0f9.A0A(263668290, A037);
                i5 = -965380257;
                C0f9.A0A(i5, A032);
                return;
            case 9:
                A032 = C0f9.A03(-795007798);
                C3DC c3dc = (C3DC) obj;
                int A0N5 = AbstractC167017dG.A0N(c3dc, -1868929561);
                super.onSuccess(c3dc);
                C33224ElC c33224ElC = (C33224ElC) this.A01;
                C31349DqE c31349DqE = c33224ElC.A00;
                if (c31349DqE != null) {
                    AbstractC31177DnL.A1L(c31349DqE);
                    c33224ElC.A00 = null;
                }
                User user = ((C34391FEh) c3dc.F7f()).A00;
                InterfaceC09390do interfaceC09390do = c33224ElC.A04;
                AbstractC31176DnK.A0h(interfaceC09390do).A03(user);
                user.A0c(AbstractC166987dD.A0o(interfaceC09390do));
                C0f9.A0A(-1694506337, A0N5);
                i5 = -1717448012;
                C0f9.A0A(i5, A032);
                return;
            default:
                A032 = C0f9.A03(252670805);
                int A038 = C0f9.A03(-631911693);
                C14360o3.A0B(obj, 0);
                super.onSuccess(obj);
                AbstractC23021Ah.A00((UserSession) this.A01).A15(this.A02, true, false, false);
                C0f9.A0A(1753775374, A038);
                i5 = -819526653;
                C0f9.A0A(i5, A032);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
