package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MZ6 implements XED {
    public final int A00;

    public MZ6(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.U0o, X.TwV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.TwV, X.6tf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.TwV, X.NUN] */
    @Override // X.XED
    public final /* bridge */ /* synthetic */ AbstractC65924TwV AM9(UserSession userSession, Object obj, long j) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                C14360o3.A0B(str, 2);
                ?? abstractC65924TwV = new AbstractC65924TwV(5);
                abstractC65924TwV.A02 = j;
                abstractC65924TwV.A00 = str;
                return abstractC65924TwV;
            case 1:
                Keyword keyword = (Keyword) obj;
                C14360o3.A0B(keyword, 2);
                ?? abstractC65924TwV2 = new AbstractC65924TwV(4);
                abstractC65924TwV2.A02 = j;
                abstractC65924TwV2.A01 = keyword;
                return abstractC65924TwV2;
            default:
                MapQuery mapQuery = (MapQuery) obj;
                C14360o3.A0B(mapQuery, 2);
                ?? abstractC65924TwV3 = new AbstractC65924TwV(6);
                abstractC65924TwV3.A02 = j;
                abstractC65924TwV3.A00 = mapQuery;
                return abstractC65924TwV3;
        }
    }

    @Override // X.XED
    public final ArrayList AOw(UserSession userSession, String str) {
        List list;
        switch (this.A00) {
            case 0:
                list = AbstractC54185NxM.parseFromJson(C16V.A00(str)).A00;
                break;
            case 1:
                list = MZK.parseFromJson(C16V.A00(str)).A00;
                break;
            default:
                list = AbstractC54187NxO.parseFromJson(C16V.A00(str)).A00;
                break;
        }
        return AbstractC001800i.A0U(list);
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ Object Avj(AbstractC65924TwV abstractC65924TwV) {
        switch (this.A00) {
            case 0:
                C152526tf c152526tf = (C152526tf) abstractC65924TwV;
                C14360o3.A0B(c152526tf, 0);
                return c152526tf.A00;
            case 1:
                C66130U0o c66130U0o = (C66130U0o) abstractC65924TwV;
                C14360o3.A0B(c66130U0o, 0);
                return c66130U0o.A01;
            default:
                NUN nun = (NUN) abstractC65924TwV;
                C14360o3.A0B(nun, 0);
                return nun.A00;
        }
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ String BF9(Object obj) {
        switch (this.A00) {
            case 0:
                return AnonymousClass001.A0R("entry_id_", AbstractC167027dH.A0Q(obj));
            case 1:
                Keyword keyword = (Keyword) obj;
                C14360o3.A0B(keyword, 0);
                return keyword.A04;
            default:
                MapQuery mapQuery = (MapQuery) obj;
                C14360o3.A0B(mapQuery, 0);
                return mapQuery.A00;
        }
    }

    @Override // X.XED
    public final String EOs(UserSession userSession, List list) {
        int i = this.A00;
        C14360o3.A0B(list, 1);
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        switch (i) {
            case 0:
                Iterator A0q = AbstractC37301Gc2.A0q(A0S, "effect_search_entries", list);
                while (A0q.hasNext()) {
                    C152526tf c152526tf = (C152526tf) A0q.next();
                    if (c152526tf != null) {
                        A0S.A0d();
                        String str = c152526tf.A00;
                        if (str != null) {
                            A0S.A0S("query", str);
                        }
                        AbstractC37930GmS.A00(A0S, c152526tf);
                        A0S.A0a();
                    }
                }
                break;
            case 1:
                Iterator A0q2 = AbstractC37301Gc2.A0q(A0S, "keywords", list);
                while (A0q2.hasNext()) {
                    C66130U0o c66130U0o = (C66130U0o) A0q2.next();
                    if (c66130U0o != null) {
                        MZ9.A00(A0S, c66130U0o);
                    }
                }
                break;
            default:
                Iterator A0q3 = AbstractC37301Gc2.A0q(A0S, "mapQueries", list);
                while (A0q3.hasNext()) {
                    NUN nun = (NUN) A0q3.next();
                    if (nun != null) {
                        A0S.A0d();
                        if (nun.A00 != null) {
                            A0S.A0r("map_query");
                            OPT.A00(A0S, nun.A00);
                        }
                        AbstractC37930GmS.A00(A0S, nun);
                        A0S.A0a();
                    }
                }
                break;
        }
        A0S.A0Z();
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }
}
