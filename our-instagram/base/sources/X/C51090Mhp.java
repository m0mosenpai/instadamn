package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mhp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51090Mhp extends AbstractC65412xd {
    public final int A00;

    public C51090Mhp(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        String str;
        List list;
        switch (this.A00) {
            case 0:
                C51761Mtk c51761Mtk = (C51761Mtk) obj;
                C51761Mtk c51761Mtk2 = (C51761Mtk) obj2;
                AbstractC167017dG.A1N(c51761Mtk, c51761Mtk2);
                return C14360o3.A0K(c51761Mtk.A04(), c51761Mtk2.A04());
            case 1:
                C51748MtX c51748MtX = (C51748MtX) obj;
                C51748MtX c51748MtX2 = (C51748MtX) obj2;
                AbstractC167017dG.A1N(c51748MtX, c51748MtX2);
                if (c51748MtX.A03 != c51748MtX2.A03 || c51748MtX.A04 != c51748MtX2.A04) {
                    return false;
                }
                return true;
            case 2:
                C51654Mrl c51654Mrl = (C51654Mrl) obj;
                C51654Mrl c51654Mrl2 = (C51654Mrl) obj2;
                AbstractC167017dG.A1N(c51654Mrl, c51654Mrl2);
                EnumC53189Nfl enumC53189Nfl = c51654Mrl.A03;
                EnumC53189Nfl enumC53189Nfl2 = EnumC53189Nfl.A07;
                if (enumC53189Nfl == enumC53189Nfl2 || c51654Mrl2.A03 == enumC53189Nfl2 || !C14360o3.A0K(c51654Mrl.A0A, c51654Mrl2.A0A)) {
                    return false;
                }
                int i = 0;
                for (Object obj3 : c51654Mrl.A09) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) obj3;
                    String str2 = leadGenFormBaseQuestion.A00;
                    List list2 = c51654Mrl2.A09;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(list2, i);
                    Map map = null;
                    if (leadGenFormBaseQuestion2 != null) {
                        str = leadGenFormBaseQuestion2.A00;
                    } else {
                        str = null;
                    }
                    if (!C14360o3.A0K(str2, str)) {
                        return false;
                    }
                    List list3 = leadGenFormBaseQuestion.A0D;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion3 = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(list2, i);
                    if (leadGenFormBaseQuestion3 != null) {
                        list = leadGenFormBaseQuestion3.A0D;
                    } else {
                        list = null;
                    }
                    if (!C14360o3.A0K(list3, list)) {
                        return false;
                    }
                    Map map2 = leadGenFormBaseQuestion.A0G;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion4 = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(list2, i);
                    if (leadGenFormBaseQuestion4 != null) {
                        map = leadGenFormBaseQuestion4.A0G;
                    }
                    if (!C14360o3.A0K(map2, map)) {
                        return false;
                    }
                    i = i2;
                }
                return true;
            case 3:
                AbstractC167017dG.A1N(obj, obj2);
                return obj.equals(obj2);
            case 4:
            case 5:
            case 6:
                AbstractC167017dG.A1N(obj, obj2);
                return obj.equals(obj2);
            default:
                return false;
        }
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        Object id;
        Object id2;
        EnumC53189Nfl enumC53189Nfl;
        String str;
        switch (this.A00) {
            case 0:
                C51761Mtk c51761Mtk = (C51761Mtk) obj;
                C51761Mtk c51761Mtk2 = (C51761Mtk) obj2;
                AbstractC167017dG.A1N(c51761Mtk, c51761Mtk2);
                id = c51761Mtk.A03();
                id2 = c51761Mtk2.A03();
                break;
            case 1:
                C51748MtX c51748MtX = (C51748MtX) obj;
                C51748MtX c51748MtX2 = (C51748MtX) obj2;
                AbstractC167017dG.A1N(c51748MtX, c51748MtX2);
                if (((InterfaceC57956Pn2) c51748MtX.A01).CBf() != ((InterfaceC57956Pn2) c51748MtX2.A01).CBf()) {
                    return false;
                }
                return true;
            case 2:
                C51654Mrl c51654Mrl = (C51654Mrl) obj;
                C51654Mrl c51654Mrl2 = (C51654Mrl) obj2;
                AbstractC167017dG.A1N(c51654Mrl, c51654Mrl2);
                EnumC53189Nfl enumC53189Nfl2 = c51654Mrl2.A03;
                EnumC53189Nfl enumC53189Nfl3 = EnumC53189Nfl.A07;
                if (enumC53189Nfl2 != enumC53189Nfl3 && (enumC53189Nfl = c51654Mrl.A03) != enumC53189Nfl3) {
                    if (enumC53189Nfl != enumC53189Nfl2) {
                        return false;
                    }
                    List list = c51654Mrl.A09;
                    int size = list.size();
                    List list2 = c51654Mrl2.A09;
                    if (size != list2.size()) {
                        return false;
                    }
                    int i = 0;
                    for (Object obj3 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        String str2 = ((LeadGenFormBaseQuestion) obj3).A09;
                        LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(list2, i);
                        if (leadGenFormBaseQuestion != null) {
                            str = leadGenFormBaseQuestion.A09;
                        } else {
                            str = null;
                        }
                        if (!C14360o3.A0K(str2, str)) {
                            return false;
                        }
                        i = i2;
                    }
                    return true;
                }
                return true;
            case 3:
                id = (InterfaceC57848PlE) obj;
                id2 = (InterfaceC57848PlE) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, id, id2);
                if ((C51854Mvy.A00(id, 0) && C51854Mvy.A00(id2, 0)) || (C51854Mvy.A00(id, A1R ? 1 : 0) && C51854Mvy.A00(id2, A1R ? 1 : 0))) {
                    id = ((C51854Mvy) id).A01;
                    id2 = ((C51854Mvy) id2).A01;
                    break;
                }
                break;
            case 4:
            case 5:
                C51906Mwo c51906Mwo = (C51906Mwo) obj;
                C51906Mwo c51906Mwo2 = (C51906Mwo) obj2;
                AbstractC167017dG.A1N(c51906Mwo, c51906Mwo2);
                id = c51906Mwo.A0D;
                id2 = c51906Mwo2.A0D;
                break;
            case 6:
                C120985dq c120985dq = (C120985dq) obj;
                C120985dq c120985dq2 = (C120985dq) obj2;
                AbstractC167017dG.A1N(c120985dq, c120985dq2);
                id = c120985dq.getId();
                id2 = c120985dq2.getId();
                break;
            default:
                return false;
        }
        return C14360o3.A0K(id, id2);
    }
}
