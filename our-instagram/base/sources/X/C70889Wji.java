package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wji, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70889Wji implements XLN, InterfaceC71952XCe {
    public final int A00;
    public final Object A01;

    public C70889Wji(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XLN
    public final void DM0(C38657Gyy c38657Gyy) {
        FragmentActivity requireActivity;
        UserSession userSession;
        String str;
        switch (this.A00) {
            case 0:
                String str2 = c38657Gyy.A02;
                if (str2 != null && !str2.isEmpty()) {
                    C12260kU.A0G(((C36010Fv8) this.A01).A07, AbstractC08820cl.A03(str2));
                    return;
                } else {
                    C36010Fv8 c36010Fv8 = (C36010Fv8) this.A01;
                    requireActivity = c36010Fv8.A0A.requireActivity();
                    userSession = c36010Fv8.A0D;
                    break;
                }
                break;
            case 1:
                C14360o3.A0B(c38657Gyy, 0);
                ((C31694Dvz) this.A01).A01.DM0(c38657Gyy);
                return;
            case 2:
                C14360o3.A0B(c38657Gyy, 0);
                String str3 = c38657Gyy.A02;
                if (str3 != null && str3.length() != 0) {
                    V1R v1r = (V1R) this.A01;
                    V1R.A07(v1r, str3);
                    String str4 = c38657Gyy.A05;
                    if (str4 == null && c38657Gyy.A06 == null) {
                        return;
                    }
                    C18920wW c18920wW = v1r.A04;
                    if (c18920wW == null) {
                        str = "logger";
                    } else {
                        C25531Mh A0G = C25531Mh.A0G(c18920wW);
                        if (!((AbstractC02600Aj) A0G).A00.isSampled()) {
                            return;
                        }
                        AbstractC65702TsY.A1G(A0G, c38657Gyy, str4);
                        Hashtag hashtag = V1R.A01(v1r).A01;
                        String id = hashtag.getId();
                        if (id != null && id.length() == 0) {
                            A0G.A0Q("hashtag_id", AbstractC003100w.A0k(10, id));
                        }
                        A0G.A0R("hashtag_name", hashtag.getName());
                        C68034V7f c68034V7f = v1r.A08;
                        if (c68034V7f == null) {
                            str = "dataSource";
                        } else {
                            A0G.A0R("hashtag_feed_type", c68034V7f.A00.toString());
                            A0G.A0R("hashtag_follow_status", AbstractC1120253r.A02(hashtag));
                            A0G.Cht();
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                V1R v1r2 = (V1R) this.A01;
                requireActivity = v1r2.requireActivity();
                userSession = V1R.A00(v1r2);
                break;
                break;
            case 3:
                C14360o3.A0B(c38657Gyy, 0);
                String str5 = c38657Gyy.A02;
                if (str5 != null && str5.length() != 0) {
                    AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                    C25531Mh A0G2 = C25531Mh.A0G(abstractC65919TwQ.A02);
                    if (((AbstractC02600Aj) A0G2).A00.isSampled()) {
                        AbstractC65702TsY.A1G(A0G2, c38657Gyy, c38657Gyy.A05);
                        A0G2.A0R("query_text", abstractC65919TwQ.A0k.E6U());
                        A0G2.A0R("search_session_id", ((C65918TwP) abstractC65919TwQ).A09);
                        A0G2.A0R("rank_token", abstractC65919TwQ.A0i.E6d());
                        A0G2.Cht();
                    }
                    FragmentActivity activity = abstractC65919TwQ.getActivity();
                    if (activity == null || AbstractC41776Ies.A0C(activity, abstractC65919TwQ.A0E(), str5, abstractC65919TwQ.getModuleName())) {
                        return;
                    }
                    AbstractC35275FhA.A04(activity, abstractC65919TwQ.A0E(), C2Fb.A3K, str5, abstractC65919TwQ.getModuleName());
                    return;
                }
                AbstractC65919TwQ abstractC65919TwQ2 = (AbstractC65919TwQ) this.A01;
                requireActivity = abstractC65919TwQ2.requireActivity();
                userSession = abstractC65919TwQ2.A0E();
                break;
            default:
                C14360o3.A0B(c38657Gyy, 0);
                AbstractC67878V0j.A01(c38657Gyy, (AbstractC67878V0j) this.A01, c38657Gyy.A02, false);
                return;
        }
        new C140966Yy(requireActivity, userSession).A06();
    }

    @Override // X.InterfaceC71952XCe
    public final void DjY(C38657Gyy c38657Gyy) {
        String str;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C14360o3.A0B(c38657Gyy, 0);
                ((C31694Dvz) this.A01).A01.DjY(c38657Gyy);
                return;
            case 2:
                C14360o3.A0B(c38657Gyy, 0);
                V1R v1r = (V1R) this.A01;
                C18920wW c18920wW = v1r.A04;
                if (c18920wW == null) {
                    str = "logger";
                } else {
                    C25531Mh A0H = C25531Mh.A0H(c18920wW);
                    if (((AbstractC02600Aj) A0H).A00.isSampled()) {
                        AbstractC65702TsY.A1G(A0H, c38657Gyy, c38657Gyy.A05);
                        Hashtag hashtag = V1R.A01(v1r).A01;
                        String id = hashtag.getId();
                        if (id != null && id.length() == 0) {
                            A0H.A0Q("hashtag_id", AbstractC003100w.A0k(10, id));
                        }
                        A0H.A0R("hashtag_name", hashtag.getName());
                        C68034V7f c68034V7f = v1r.A08;
                        if (c68034V7f != null) {
                            A0H.A0R("hashtag_feed_type", c68034V7f.A00.toString());
                            A0H.A0R("hashtag_follow_status", AbstractC1120253r.A02(hashtag));
                            A0H.Cht();
                        }
                    }
                    if (v1r.A08 != null) {
                        C66095TzW c66095TzW = v1r.A06;
                        if (c66095TzW == null) {
                            str = "adapter";
                        } else {
                            C66095TzW.A00(c66095TzW);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C14360o3.A0B(c38657Gyy, 0);
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                C65966TxJ c65966TxJ = abstractC65919TwQ.A08;
                if (c65966TxJ != null) {
                    String str2 = c38657Gyy.A05;
                    if (str2 == null) {
                        str2 = c38657Gyy.A06;
                    }
                    c65966TxJ.A02(str2);
                    C65960TxC c65960TxC = abstractC65919TwQ.A07;
                    if (c65960TxC != null) {
                        C65963TxG.A00(c65960TxC, abstractC65919TwQ);
                        C25531Mh A0H2 = C25531Mh.A0H(abstractC65919TwQ.A02);
                        if (((AbstractC02600Aj) A0H2).A00.isSampled()) {
                            AbstractC65702TsY.A1G(A0H2, c38657Gyy, str2);
                            A0H2.A0R("query_text", abstractC65919TwQ.A0k.E6U());
                            A0H2.A0R("search_session_id", ((C65918TwP) abstractC65919TwQ).A09);
                            A0H2.A0R("rank_token", abstractC65919TwQ.A0i.E6d());
                            A0H2.Cht();
                            return;
                        }
                        return;
                    }
                } else {
                    str = "informModuleController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                break;
            default:
                C14360o3.A0B(c38657Gyy, 0);
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                C18920wW c18920wW2 = abstractC67878V0j.A02;
                if (c18920wW2 == null) {
                    str = "typedLogger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C25531Mh A0H3 = C25531Mh.A0H(c18920wW2);
                if (((AbstractC02600Aj) A0H3).A00.isSampled()) {
                    AbstractC65702TsY.A1G(A0H3, c38657Gyy, c38657Gyy.A05);
                    AbstractC65703TsZ.A1L(A0H3, abstractC67878V0j);
                }
                C51042Mgs A07 = abstractC67878V0j.A07();
                C55168OdW.A03(A07.A0C, A07.A0F, A07.A0G, C57712Pj1.A00);
                return;
        }
        str = "dataSource";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71952XCe
    public final boolean Ejj(C38657Gyy c38657Gyy) {
        String str;
        switch (this.A00) {
            case 0:
                return false;
            case 1:
                if (((C31694Dvz) this.A01).A01.Ejj(c38657Gyy) && AbstractC68485VSq.A00(c38657Gyy).isEmpty()) {
                    return true;
                }
                return false;
            case 2:
                if (((V1R) this.A01).A08 == null) {
                    str = "dataSource";
                    break;
                } else {
                    return false;
                }
            case 3:
                if (((AbstractC65919TwQ) this.A01).A08 != null) {
                    return !r0.A03(c38657Gyy);
                }
                str = "informModuleController";
                break;
            default:
                return ((AbstractC67878V0j) this.A01).A07().A05();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
