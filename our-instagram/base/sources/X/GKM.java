package X;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GKM implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GKM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(C42221xC c42221xC, C41761wQ c41761wQ, Object obj, Object obj2, int i) {
        c41761wQ.A02(c42221xC, new GKM(i, obj, obj2));
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String substring;
        String str;
        String str2;
        C32314ELd c32314ELd;
        E72 e72;
        switch (this.A00) {
            case 0:
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                C14360o3.A0B(interfaceC132965zL, 0);
                AbstractC31171DnF.A1N(this.A01);
                if (interfaceC132965zL instanceof C132955zK) {
                    C35012Fbj c35012Fbj = (C35012Fbj) this.A02;
                    AbstractC31177DnL.A12(c35012Fbj.A03);
                    if (c35012Fbj.A01 != 29) {
                        return;
                    }
                    int ordinal = c35012Fbj.A07.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            C142846ck A00 = AbstractC147806l5.A00(c35012Fbj.A05);
                            int i = c35012Fbj.A00;
                            String A07 = AbstractC1345466e.A07(c35012Fbj.A06);
                            String str3 = c35012Fbj.A08;
                            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                            if (AbstractC25226BEj.A1Z(A0I)) {
                                AbstractC31175DnJ.A1B(A0I, A00);
                                AbstractC31174DnI.A1J(A0I, "thread_add_collaborators_success");
                                A0I.A0o("add_collaborator");
                                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", A07, str3, i));
                                A0I.Cht();
                            }
                        }
                    } else {
                        AbstractC34065F1s.A00(AbstractC34061F1o.A00(c35012Fbj.A05).A00, AbstractC1345466e.A07(c35012Fbj.A06), c35012Fbj.A08, "thread_add_moderators_success", "view", "add_moderator", "thread_view", null, c35012Fbj.A00);
                    }
                    C9GR.A07(c35012Fbj.A02, 2131958792);
                    return;
                }
                Object A002 = AbstractC132975zM.A00(interfaceC132965zL);
                C14360o3.A07(A002);
                C32025E5d c32025E5d = (C32025E5d) A002;
                C35012Fbj c35012Fbj2 = (C35012Fbj) this.A02;
                AbstractC59962oe abstractC59962oe = c35012Fbj2.A03;
                if (!abstractC59962oe.isResumed()) {
                    return;
                }
                if (c35012Fbj2.A01 == 29) {
                    String str4 = c32025E5d.A01;
                    String str5 = c32025E5d.A02;
                    String str6 = str5;
                    int ordinal2 = c35012Fbj2.A07.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            C142846ck A003 = AbstractC147806l5.A00(c35012Fbj2.A05);
                            int i2 = c35012Fbj2.A00;
                            String A072 = AbstractC1345466e.A07(c35012Fbj2.A06);
                            String str7 = c35012Fbj2.A08;
                            String str8 = str5;
                            String str9 = str4;
                            C25531Mh A0I2 = AbstractC31172DnG.A0I(A003);
                            if (AbstractC25226BEj.A1Z(A0I2)) {
                                HashMap A1G = AbstractC166987dD.A1G();
                                if (str5 == null) {
                                    str8 = "";
                                }
                                A1G.put("error_message", str8);
                                if (str4 == null) {
                                    str9 = "";
                                }
                                AbstractC31171DnF.A1U(str9, A1G);
                                AbstractC31175DnJ.A1B(A0I2, A003);
                                AbstractC31174DnI.A1J(A0I2, "thread_add_collaborators_error");
                                A0I2.A0o("add_collaborator");
                                AbstractC31175DnJ.A1C(A0I2, AbstractC31179DnN.A0a(A0I2, "thread_view", A072, str7, i2), A1G);
                            }
                        }
                    } else {
                        C36267FzK A004 = AbstractC34061F1o.A00(c35012Fbj2.A05);
                        int i3 = c35012Fbj2.A00;
                        String A073 = AbstractC1345466e.A07(c35012Fbj2.A06);
                        String str10 = c35012Fbj2.A08;
                        String str11 = str5;
                        String str12 = str4;
                        HashMap A1G2 = AbstractC166987dD.A1G();
                        if (str5 == null) {
                            str11 = "";
                        }
                        A1G2.put("error_message", str11);
                        if (str4 == null) {
                            str12 = "";
                        }
                        AbstractC31171DnF.A1U(str12, A1G2);
                        AbstractC34065F1s.A00(A004.A00, A073, str10, "thread_add_moderators_error", "view", "add_moderator", "thread_view", A1G2, i3);
                    }
                    Context context = c35012Fbj2.A02;
                    if (!C14360o3.A0K(str4, "575") || str5 == null || str5.length() == 0) {
                        str6 = context.getString(2131960763);
                    }
                    if (C14360o3.A0K(str4, "575") && str5 != null && str5.length() != 0) {
                        str2 = "ChannelsConstants.BC_COLLABORATOR_CUSTOM_ERROR_CODE";
                    } else {
                        str2 = "direct_unknown_error";
                    }
                    C9GR.A03(context, str6, str2, 0);
                    return;
                }
                String str13 = c32025E5d.A04;
                if (str13 != null && (str = c32025E5d.A00) != null) {
                    AbstractC31176DnK.A1W(AbstractC31176DnK.A0a(c35012Fbj2.A02, str, str13));
                    String str14 = c32025E5d.A03;
                    if (str14 == null || str14.length() == 0 || !"ADULT_MINOR_GROUP_RESTRICTION".equalsIgnoreCase(str14)) {
                        return;
                    }
                    EnumC223459tc enumC223459tc = EnumC223459tc.A0S;
                    InterfaceC83733oI interfaceC83733oI = c35012Fbj2.A06;
                    C162337Ov.A06(enumC223459tc, abstractC59962oe, c35012Fbj2.A05, interfaceC83733oI.toString(), interfaceC83733oI instanceof MsysThreadId);
                    return;
                }
                UserSession userSession = c35012Fbj2.A05;
                String A074 = AbstractC1345466e.A07(c35012Fbj2.A06);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(abstractC59962oe, userSession, A074, 2), "direct_group_add_member_fail");
                if (A0f.isSampled()) {
                    AbstractC31171DnF.A1H(A0f, A074);
                    A0f.Cht();
                }
                AbstractC46744Km1.A00(userSession, c35012Fbj2.A02, c32025E5d.A05);
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                C36372G2y c36372G2y = (C36372G2y) this.A02;
                if (booleanValue) {
                    ELx eLx = c36372G2y.A03;
                    RecyclerView recyclerView = eLx.A01;
                    if (recyclerView == null) {
                        C14360o3.A0F("recyclerView");
                        throw C00O.createAndThrow();
                    }
                    recyclerView.post(new GLL(eLx));
                } else {
                    ELx eLx2 = c36372G2y.A03;
                    List list = (List) this.A01;
                    AbstractC25231BEo.A16(eLx2);
                    UserSession userSession2 = c36372G2y.A02;
                    C35858FsY c35858FsY = C35858FsY.A00;
                    MsysPendingRecipient msysPendingRecipient = (MsysPendingRecipient) AbstractC001800i.A0J(list);
                    if (msysPendingRecipient != null) {
                        C99Q.A01("createCutoverThreadOnServer").execute(new RunnableC49997M5m(c35858FsY, userSession2, msysPendingRecipient.A01));
                    }
                }
                C0K8.A0C("CreateCutoverThreadSection", AbstractC167017dG.A0n(bool, "alreadyHasE2EE:", AbstractC166987dD.A1C()));
                return;
            case 2:
                List A1C = AbstractC25228BEl.A1C(obj);
                C34632FNp c34632FNp = (C34632FNp) this.A02;
                C3o9 c3o9 = (C3o9) this.A01;
                String A0x = AbstractC166997dE.A0x(AbstractC43591JPw.A00(678), AbstractC31174DnI.A0y(c3o9));
                HashMap hashMap = c34632FNp.A06;
                Boolean bool2 = (Boolean) hashMap.get(A0x);
                if ((bool2 == null || !bool2.booleanValue()) && A1C.size() < 1) {
                    AbstractC31173DnH.A1Y(A0x, hashMap, true);
                    c34632FNp.A04.A0A(c3o9, null);
                }
                c32314ELd = c34632FNp.A03.A00;
                if (c32314ELd.A0g || !AbstractC166987dD.A1b(A1C)) {
                    return;
                }
                c32314ELd.A0g = true;
                break;
                break;
            case 3:
                List A1C2 = AbstractC25228BEl.A1C(obj);
                C34632FNp c34632FNp2 = (C34632FNp) this.A02;
                C3o9 c3o92 = (C3o9) this.A01;
                String A0x2 = AbstractC166997dE.A0x("RESHARES", AbstractC31174DnI.A0y(c3o92));
                HashMap hashMap2 = c34632FNp2.A06;
                Boolean bool3 = (Boolean) hashMap2.get(A0x2);
                if ((bool3 == null || !bool3.booleanValue()) && A1C2.size() < 1) {
                    AbstractC31173DnH.A1Y(A0x2, hashMap2, true);
                    c34632FNp2.A05.A0A(c3o92, null);
                }
                c32314ELd = c34632FNp2.A03.A00;
                if (c32314ELd.A0i || !AbstractC166987dD.A1b(A1C2)) {
                    return;
                }
                c32314ELd.A0i = true;
                break;
                break;
            case 4:
                List list2 = (List) obj;
                C14360o3.A0B(list2, 0);
                AbstractC31330Dpv abstractC31330Dpv = (AbstractC31330Dpv) this.A02;
                InterfaceC83733oI interfaceC83733oI2 = (InterfaceC83733oI) this.A01;
                if (C18U.A06(C06090Tz.A05, abstractC31330Dpv.A04, 36326854864418980L)) {
                    C42201xA c42201xA = (C42201xA) abstractC31330Dpv.A0C.get(interfaceC83733oI2);
                    if (c42201xA == null || (e72 = (E72) c42201xA.A0W()) == null) {
                        return;
                    }
                    e72.A00 = AbstractC31330Dpv.A03(abstractC31330Dpv, (List) e72.A00, list2);
                    boolean z = false;
                    ArrayList Ab7 = abstractC31330Dpv.A06.Ab7(AbstractC31174DnI.A0b(interfaceC83733oI2), false);
                    if (!(Ab7 instanceof Collection) || !Ab7.isEmpty()) {
                        Iterator it = Ab7.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ImmutableList A0H = ((C83403nh) it.next()).A0H();
                                if (A0H != null && A0H.size() == 6) {
                                    z = true;
                                }
                            }
                        }
                    }
                    abstractC31330Dpv.A01 = z;
                    abstractC31330Dpv.A0B.put(interfaceC83733oI2, e72);
                    c42201xA.accept(e72);
                    return;
                }
                AbstractC31330Dpv.A06(abstractC31330Dpv, interfaceC83733oI2, list2);
                return;
            case 5:
                FJ5 fj5 = (FJ5) obj;
                C14360o3.A0B(fj5, 0);
                AbstractC31330Dpv.A07((AbstractC31330Dpv) this.A02, (InterfaceC83733oI) this.A01, fj5.A00, true, fj5.A01);
                return;
            case 6:
                Context context2 = (Context) this.A01;
                StringBuilder sb = (StringBuilder) this.A02;
                InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) obj;
                if (interfaceC132965zL2 instanceof C48496Lcn) {
                    StringBuilder A1C3 = AbstractC166987dD.A1C();
                    A1C3.append("Send failed: ");
                    substring = AbstractC166997dE.A0v(AbstractC132975zM.A00(interfaceC132965zL2), A1C3);
                } else {
                    substring = sb.substring(0, sb.length() - 2);
                }
                C9GR.A09(context2, substring);
                return;
            default:
                Fragment fragment = (Fragment) this.A01;
                TextView textView = (TextView) this.A02;
                String str15 = (String) obj;
                if (str15.isEmpty()) {
                    textView.setText(2131957629);
                    return;
                } else {
                    AbstractC31177DnL.A10(textView, fragment, str15, 2131957782);
                    return;
                }
        }
        C32314ELd.A0F(c32314ELd);
    }
}
