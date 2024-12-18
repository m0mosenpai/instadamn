package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.GGy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36729GGy implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36729GGy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        EnumC37742GjH enumC37742GjH;
        InterfaceC16820sZ interfaceC16820sZ;
        C31714DwJ c31714DwJ;
        C1GL c1gl;
        C1ON A0P;
        Context context;
        FragmentActivity activity;
        C35015Fbo A00;
        switch (this.A00) {
            case 0:
                C8Y5 c8y5 = (C8Y5) this.A03;
                if (c8y5.A00) {
                    interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                    break;
                } else {
                    C22C A01 = AnonymousClass229.A01(c8y5.A04);
                    ArrayList A1F = AbstractC166987dD.A1F((Collection) this.A01);
                    C448124l c448124l = A01.A09;
                    C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                    EnumC114925Hg A0J = c448124l.A0J();
                    if (!AbstractC25226BEj.A1Z(A08) || A0J == null) {
                        return;
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = A1F.iterator();
                    while (it.hasNext()) {
                        A1E.add(Long.valueOf(AbstractC166987dD.A1B(it)));
                    }
                    A08.A0s(AbstractC43591JPw.A00(635));
                    A08.A0q("ADS_MODE_ERROR_REVIEW_EXIT");
                    C448124l.A00(A08, c448124l);
                    A08.A0a(A0J);
                    C22M c22m = c448124l.A04;
                    A08.A0b(c22m.A09);
                    A08.A0T();
                    A08.A0U();
                    A08.A0m(C22F.A08.getModuleName());
                    A08.A0R(AbstractC43591JPw.A00(1344), c22m.A0U);
                    A08.A0c(c22m.A0A);
                    A08.A0R(AbstractC43591JPw.A00(869), c22m.A0M);
                    A08.A0M(c22m.A0A, AbstractC43591JPw.A00(868));
                    A08.A0t(AbstractC25225BEi.A14());
                    A08.A0O(MSV.A00(43), AbstractC166997dE.A0b());
                    A08.A0S(MSV.A00(907), A1E);
                    A08.Cht();
                    return;
                }
            case 1:
                if (((C14510oO) this.A02).A00) {
                    return;
                }
                C50685MZd.A00((C50685MZd) this.A03).A06((O5W) this.A01);
                return;
            case 2:
                UserSession userSession = (UserSession) this.A03;
                Context context2 = (Context) this.A01;
                Long A002 = AbstractC459829i.A00(userSession);
                if (A002 != null) {
                    long longValue = A002.longValue();
                    if (C461529z.A02(userSession) >= longValue) {
                        C146106i8 A0K = AbstractC31171DnF.A0K();
                        A0K.A0D = AbstractC167007dF.A0f(context2, AbstractC35189Ffh.A02(AbstractC166997dE.A0M(context2), longValue), 2131957465);
                        A0K.A06();
                        AbstractC31178DnM.A1S(A0K);
                    }
                }
                C455127l.A03(userSession).A0S();
                FI9 fi9 = (FI9) this.A02;
                if (fi9 == null) {
                    return;
                }
                interfaceC16820sZ = fi9.A00;
                break;
            case 3:
                C37598Ggt c37598Ggt = (C37598Ggt) this.A03;
                c37598Ggt.EJo();
                C120985dq c120985dq = (C120985dq) this.A01;
                c37598Ggt.Co0(c120985dq);
                UserSession userSession2 = c37598Ggt.A01;
                AbstractC25651Mw.A00(userSession2).A02(c37598Ggt.A00, C3MY.class);
                C38321qM c38321qM = c120985dq.A02;
                C37648Ghh c37648Ghh = ((C37644Ghd) this.A02).A0F;
                if (c38321qM != null && !c38321qM.A4Y() && C37906Gm3.A00(userSession2, c37648Ghh) && C18U.A06(C06090Tz.A05, userSession2, 36320201960333445L)) {
                    enumC37742GjH = EnumC37742GjH.A03;
                } else {
                    C38321qM c38321qM2 = c120985dq.A02;
                    if (c38321qM2 == null || c38321qM2.A4Y() || !C37906Gm3.A00(userSession2, c37648Ghh) || !C18U.A06(C06090Tz.A05, userSession2, 36320201960792204L)) {
                        return;
                    } else {
                        enumC37742GjH = EnumC37742GjH.A04;
                    }
                }
                if (c37648Ghh == null) {
                    return;
                }
                AbstractC40919IAr.A00(c120985dq, userSession2, c37598Ggt.A02, ((ILR) c37648Ghh.A04.getValue()).A00(enumC37742GjH), c37648Ghh, enumC37742GjH, "comment_sheet_dismissed", c37598Ggt.A03.CGJ(), true);
                return;
            default:
                GIS gis = (GIS) this.A03;
                Fragment fragment = gis.A02;
                FragmentActivity activity2 = fragment.getActivity();
                C38266GsB c38266GsB = (C38266GsB) this.A02;
                C84923qg c84923qg = c38266GsB.A02;
                EnumC33369Ep2 enumC33369Ep2 = gis.A01;
                if (enumC33369Ep2 != null) {
                    if (enumC33369Ep2 == EnumC33369Ep2.A0E) {
                        User user = (User) this.A01;
                        InterfaceC02590Ai A082 = AbstractC31179DnN.A08(gis.A06.A00, user, "view_profile_tapped");
                        A082.A9K("entity_user_type", AbstractC31171DnF.A0V(user.BJ8()));
                        A082.Cht();
                        if (user.BJ8() == 1) {
                            gis.A03(user);
                        } else {
                            gis.A05(user.getId());
                        }
                    } else if (enumC33369Ep2 == EnumC33369Ep2.A09) {
                        User user2 = c38266GsB.A0L;
                        if (user2 != null && (context = fragment.getContext()) != null && (activity = fragment.getActivity()) != null) {
                            UserSession userSession3 = gis.A04;
                            InterfaceC11380iw interfaceC11380iw = gis.A03;
                            C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession3);
                            C08790ch A003 = AbstractC018607g.A00(fragment);
                            boolean z = c38266GsB.A0D;
                            String id = user2.getId();
                            if (z) {
                                C75R.A0E(A012, "click", "unrestrict_option", id);
                                C28151Xt c28151Xt = C28151Xt.A02;
                                if (c28151Xt != null) {
                                    c28151Xt.A02(context, A003, userSession3, new GJA(activity, A012, c38266GsB, user2, gis), user2.getId(), interfaceC11380iw.getModuleName());
                                }
                            } else {
                                C75R.A0E(A012, "click", "restrict_option", id);
                                C28151Xt c28151Xt2 = C28151Xt.A02;
                                if (c28151Xt2 != null && (A00 = c28151Xt2.A00()) != null) {
                                    A00.A00(context, null, null, A012, userSession3, user2, new GJG(1, user2, c38266GsB, gis), EnumC33371Ep4.A0G, new GJN(context, activity, A012, user2, gis), interfaceC11380iw.getModuleName(), null);
                                }
                            }
                        }
                    } else if (enumC33369Ep2 == EnumC33369Ep2.A02) {
                        gis.A01(c38266GsB);
                    } else if (enumC33369Ep2 == EnumC33369Ep2.A08 && activity2 != null && c84923qg != null) {
                        WEz A013 = AbstractC69993VzD.A01(activity2, gis.A03, gis.A04, EnumC65855TvH.A1E, VG2.A07, c84923qg.A0G);
                        A013.A01 = (User) this.A01;
                        A013.A08(new C53024Ncw(6, gis, c38266GsB));
                        WEz.A00(null, A013);
                    } else if (enumC33369Ep2 == EnumC33369Ep2.A0D) {
                        if (c84923qg != null && C06P.A01(fragment.mFragmentManager) && activity2 != null) {
                            C140966Yy A0r = AbstractC25225BEi.A0r(fragment.requireActivity(), gis.A04);
                            String str = c84923qg.A0G;
                            Bundle A0C = AbstractC31177DnL.A0C(str);
                            A0C.putString(MSV.A00(929), str);
                            AbstractC31175DnJ.A0t(A0C, new N5B(), A0r);
                        }
                    } else {
                        if (enumC33369Ep2 == EnumC33369Ep2.A06) {
                            c31714DwJ = new C31714DwJ(gis, 30);
                            c1gl = gis.A05;
                            A0P = C25401Lu.A02(gis.A04, C05F.A00);
                        } else if (enumC33369Ep2 == EnumC33369Ep2.A0A) {
                            c31714DwJ = new C31714DwJ(gis, 31);
                            c1gl = gis.A05;
                            UserSession userSession4 = gis.A04;
                            C25621Ms A0c = AbstractC167017dG.A0c(userSession4);
                            A0c.A0B("accounts/set_private/");
                            AbstractC31178DnM.A1J(A0c, new C36014FvC(6), userSession4);
                            A0P = AbstractC31176DnK.A0P(A0c);
                        }
                        A0P.A00 = c31714DwJ;
                        c1gl.schedule(A0P);
                    }
                    gis.A01 = null;
                    return;
                }
                C34709FQu c34709FQu = gis.A06;
                User user3 = (User) this.A01;
                InterfaceC02590Ai A083 = AbstractC31179DnN.A08(c34709FQu.A00, user3, "reel_viewer_dashboard_overflow_cancel");
                A083.AAP("entity_user_type", String.valueOf(user3.BJ8()));
                A083.Cht();
                return;
        }
        interfaceC16820sZ.invoke();
    }
}
