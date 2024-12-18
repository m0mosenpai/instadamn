package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U12 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.TtG] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.TwV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.TwV, X.V9z] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.TwV, X.HYX] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.U0o] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.TwV, X.NUN] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.TwV, X.HYY] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.HYY] */
    public static final List A00(InterfaceC28041Xi interfaceC28041Xi, List list) {
        ?? c65741TtG;
        ArrayList<U0v> A12 = AbstractC166997dE.A12(interfaceC28041Xi, 1);
        for (Object obj : list) {
            if (interfaceC28041Xi.apply(obj)) {
                A12.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A12);
        for (U0v u0v : A12) {
            int i = ((AbstractC65924TwV) u0v).A01;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i == 7) {
                                    TrackDataImpl trackDataImpl = u0v.A01;
                                    if (trackDataImpl != null) {
                                        TrackMetadataImpl trackMetadataImpl = u0v.A02;
                                        if (trackMetadataImpl != null) {
                                            c65741TtG = new HYY(trackDataImpl, trackMetadataImpl);
                                        } else {
                                            throw AbstractC166997dE.A0g();
                                        }
                                    } else {
                                        OriginalSoundData originalSoundData = u0v.A00;
                                        if (originalSoundData != null) {
                                            c65741TtG = new AbstractC65924TwV(7);
                                            c65741TtG.A00 = originalSoundData;
                                            c65741TtG.A03 = new C42733IvT(originalSoundData);
                                        } else {
                                            throw AbstractC166997dE.A0g();
                                        }
                                    }
                                } else {
                                    throw AbstractC31175DnJ.A0U("Unknown blended search type: ", i);
                                }
                            } else {
                                Object A00 = u0v.A00();
                                C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.model.mapquery.MapQuery");
                                MapQuery mapQuery = (MapQuery) A00;
                                C14360o3.A0B(mapQuery, 1);
                                c65741TtG = new AbstractC65924TwV(6);
                                c65741TtG.A00 = mapQuery;
                            }
                        } else {
                            Object A002 = u0v.A00();
                            C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                            c65741TtG = new C66130U0o((Keyword) A002);
                        }
                    } else {
                        Object A003 = u0v.A00();
                        C14360o3.A0C(A003, "null cannot be cast to non-null type com.instagram.model.place.Place");
                        C69794Vvd c69794Vvd = (C69794Vvd) A003;
                        C14360o3.A0B(c69794Vvd, 1);
                        c65741TtG = new AbstractC65924TwV(2);
                        c65741TtG.A00 = c69794Vvd;
                    }
                } else {
                    Object A004 = u0v.A00();
                    C14360o3.A0C(A004, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
                    HashtagImpl F59 = ((Hashtag) A004).F59();
                    c65741TtG = new AbstractC65924TwV(1);
                    c65741TtG.A00 = F59.F59();
                }
            } else {
                Object A005 = u0v.A00();
                C14360o3.A0C(A005, "null cannot be cast to non-null type com.instagram.user.model.User");
                c65741TtG = new C65741TtG((User) A005);
            }
            c65741TtG.A02 = ((AbstractC65924TwV) u0v).A02;
            c65741TtG.A01 = ((AbstractC65924TwV) u0v).A01;
            A0q.add(c65741TtG);
        }
        return A0q;
    }

    public static final List A01(Collection collection) {
        C14360o3.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new C65741TtG((User) it.next()));
        }
        return arrayList;
    }

    public static final boolean A03(String str, String str2) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(C1Q2.A02());
        C14360o3.A07(lowerCase);
        String lowerCase2 = str2.toLowerCase(C1Q2.A02());
        C14360o3.A07(lowerCase2);
        return lowerCase.startsWith(lowerCase2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TwV, java.lang.Object, X.V9z] */
    public static final List A02(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HashtagImpl F59 = ((Hashtag) it.next()).F59();
            ?? abstractC65924TwV = new AbstractC65924TwV(1);
            abstractC65924TwV.A00 = F59.F59();
            A0q.add(abstractC65924TwV);
        }
        return A0q;
    }
}
