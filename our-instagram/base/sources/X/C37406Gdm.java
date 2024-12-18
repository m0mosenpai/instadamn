package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gdm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37406Gdm implements XED {
    public final int A00;

    public C37406Gdm(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.TwV, X.TtG] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.TwV, X.V9z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TwV, X.HYX] */
    @Override // X.XED
    public final /* bridge */ /* synthetic */ AbstractC65924TwV AM9(UserSession userSession, Object obj, long j) {
        switch (this.A00) {
            case 0:
            case 1:
                Hashtag hashtag = (Hashtag) obj;
                C14360o3.A0B(hashtag, 2);
                HashtagImpl F59 = hashtag.F59();
                ?? abstractC65924TwV = new AbstractC65924TwV(1);
                abstractC65924TwV.A02 = j;
                abstractC65924TwV.A00 = F59.F59();
                return abstractC65924TwV;
            case 2:
            case 3:
            default:
                C69794Vvd c69794Vvd = (C69794Vvd) obj;
                C14360o3.A0B(c69794Vvd, 2);
                ?? abstractC65924TwV2 = new AbstractC65924TwV(2);
                abstractC65924TwV2.A02 = j;
                abstractC65924TwV2.A00 = c69794Vvd;
                return abstractC65924TwV2;
            case 4:
                User user = (User) obj;
                C14360o3.A0B(user, 2);
                ?? abstractC65924TwV3 = new AbstractC65924TwV(0);
                abstractC65924TwV3.A02 = j;
                abstractC65924TwV3.A00 = user;
                return abstractC65924TwV3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.TwV, java.lang.Object, X.TtG] */
    @Override // X.XED
    public final ArrayList AOw(UserSession userSession, String str) {
        List list;
        switch (this.A00) {
            case 0:
            case 1:
                list = AbstractC38203Gr8.parseFromJson(C16V.A00(str)).A00;
                return AbstractC001800i.A0U(list);
            case 2:
            case 3:
            default:
                AbstractC167017dG.A1N(userSession, str);
                list = AbstractC38201Gr6.parseFromJson(C07950bF.A04.A01(userSession, str)).A00;
                return AbstractC001800i.A0U(list);
            case 4:
                AbstractC167017dG.A1N(userSession, str);
                C16L A03 = AbstractC221915u.A00.A03(str);
                C16R A05 = AbstractC37301Gc2.A05(A03);
                C16R c16r = C16R.A0D;
                if (A05 != c16r) {
                    return null;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                while (true) {
                    C16R A1J = A03.A1J();
                    C16R c16r2 = C16R.A09;
                    if (A1J == c16r2) {
                        return A1E;
                    }
                    String A0q = A03.A0q();
                    A03.A1J();
                    if ("users".equals(A0q) && A03.A11() == C16R.A0C) {
                        while (A03.A1J() != C16R.A08) {
                            ?? abstractC65924TwV = new AbstractC65924TwV(0);
                            if (A03.A11() == c16r) {
                                while (A03.A1J() != c16r2) {
                                    String A0q2 = A03.A0q();
                                    A03.A1J();
                                    if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q2)) {
                                        C07880b8 c07880b8 = C07950bF.A04;
                                        abstractC65924TwV.A00 = AnonymousClass170.A00(C07880b8.A00(A03, userSession));
                                    } else {
                                        AbstractC37930GmS.A01(A03, abstractC65924TwV, A0q2);
                                    }
                                }
                                abstractC65924TwV.A06();
                                A1E.add(abstractC65924TwV);
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ Object Avj(AbstractC65924TwV abstractC65924TwV) {
        switch (this.A00) {
            case 0:
            case 1:
                C68090V9z c68090V9z = (C68090V9z) abstractC65924TwV;
                C14360o3.A0B(c68090V9z, 0);
                return c68090V9z.A00;
            case 2:
            case 3:
            default:
                HYX hyx = (HYX) abstractC65924TwV;
                C14360o3.A0B(hyx, 0);
                return hyx.A00;
            case 4:
                C65741TtG c65741TtG = (C65741TtG) abstractC65924TwV;
                C14360o3.A0B(c65741TtG, 0);
                return c65741TtG.A06();
        }
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ String BF9(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                Hashtag hashtag = (Hashtag) obj;
                C14360o3.A0B(hashtag, 0);
                return String.valueOf(hashtag.getId());
            case 2:
            case 3:
            default:
                C69794Vvd c69794Vvd = (C69794Vvd) obj;
                C14360o3.A0B(c69794Vvd, 0);
                String A05 = c69794Vvd.A00().A05();
                C14360o3.A07(A05);
                return A05;
            case 4:
                User user = (User) obj;
                C14360o3.A0B(user, 0);
                return user.getId();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Gr9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.Gr7, java.lang.Object] */
    @Override // X.XED
    public final String EOs(UserSession userSession, List list) {
        StringWriter A0O;
        C17z A0S;
        switch (this.A00) {
            case 0:
            case 1:
                C14360o3.A0B(list, 1);
                ?? obj = new Object();
                obj.A00 = list;
                A0O = AbstractC37300Gc1.A0O();
                A0S = AbstractC167007dF.A0S(A0O);
                if (obj.A00 != null) {
                    C16V.A03(A0S, "hashtags");
                    for (C68090V9z c68090V9z : obj.A00) {
                        if (c68090V9z != null) {
                            A0S.A0d();
                            if (c68090V9z.A00 != null) {
                                A0S.A0r("hashtag");
                                AbstractC109614wn.A00(A0S, c68090V9z.A00);
                            }
                            AbstractC37930GmS.A00(A0S, c68090V9z);
                            A0S.A0a();
                        }
                    }
                    A0S.A0Z();
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                C14360o3.A0B(list, 1);
                ?? obj2 = new Object();
                obj2.A00 = list;
                A0O = AbstractC37300Gc1.A0O();
                A0S = AbstractC167007dF.A0S(A0O);
                if (obj2.A00 != null) {
                    C16V.A03(A0S, "places");
                    for (HYX hyx : obj2.A00) {
                        if (hyx != null) {
                            A0S.A0d();
                            if (hyx.A00 != null) {
                                A0S.A0r("place");
                                AbstractC69968Vyj.A00(A0S, hyx.A00);
                            }
                            AbstractC37930GmS.A00(A0S, hyx);
                            A0S.A0a();
                        }
                    }
                    A0S.A0Z();
                    break;
                }
                break;
            case 4:
                C14360o3.A0B(list, 1);
                A0O = AbstractC37300Gc1.A0O();
                A0S = AbstractC167007dF.A0S(A0O);
                A0S.A0r("users");
                A0S.A0c();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C65741TtG c65741TtG = (C65741TtG) it.next();
                    A0S.A0d();
                    A0S.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    C16W.A00(A0S, AnonymousClass185.A00(c65741TtG.A06()));
                    AbstractC37930GmS.A00(A0S, c65741TtG);
                    A0S.A0a();
                }
                A0S.A0Z();
                break;
        }
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }
}
