package X;

import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OpenInspirationHubCommand;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BKe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25361BKe extends C3r5 {
    public final MVH A00;
    public final MVI A01;
    public final C25360BKd A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public static final InterfaceC88553xD A00(C38321qM c38321qM) {
        C3x9 A0u;
        if (c38321qM == null || (A0u = AbstractC25226BEj.A0u(c38321qM)) == null) {
            return null;
        }
        MusicInfo BVc = A0u.BVc();
        if (BVc != null) {
            return new C88543xC(BVc);
        }
        OriginalSoundDataIntf BZw = A0u.BZw();
        if (BZw != null) {
            return new C117235Si(BZw);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC30893Di6 A01(C26134BhL c26134BhL, C25361BKe c25361BKe, String str, InterfaceC16820sZ interfaceC16820sZ) {
        InterfaceC30893Di6 c25671BWh;
        InterfaceC30893Di6 c26260BjT;
        int i;
        InterfaceC30893Di6 c26261BjU;
        String assetId;
        if (c26134BhL == null) {
            return new C25671BWh(null);
        }
        C26135BhM c26135BhM = c26134BhL.A00;
        InterfaceC31119Dm1 interfaceC31119Dm1 = c26135BhM.A01;
        if (interfaceC31119Dm1 != null) {
            C38321qM c38321qM = (C38321qM) interfaceC16820sZ.invoke();
            c25671BWh = new BWX(C4JI.A00(interfaceC31119Dm1.B2P()), interfaceC31119Dm1.AYL(), c26135BhM, c38321qM != null ? A00(c38321qM) : null, c38321qM);
        } else {
            InterfaceC31121Dm3 interfaceC31121Dm3 = c26135BhM.A03;
            if (interfaceC31121Dm3 != null) {
                C22P A00 = C4JI.A00(interfaceC31121Dm3.B2P());
                if (str == null) {
                    str = interfaceC31121Dm3.AzF();
                }
                c26260BjT = new C26262BjV(A00, c26135BhM, str);
            } else if (c26135BhM.A04 != null) {
                c25671BWh = new C26263BjW(EnumC50631MWs.A08, c26135BhM);
            } else {
                C26139BhQ c26139BhQ = c26135BhM.A00;
                boolean z = false;
                int i2 = 0;
                z = false;
                if (c26139BhQ != null) {
                    C8JW[] values = C8JW.values();
                    int length = values.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        C8JW c8jw = values[i2];
                        if (C14360o3.A0K(c8jw.A00, c26139BhQ.A00)) {
                            r8 = c8jw;
                            break;
                        }
                        i2++;
                    }
                    c25671BWh = new BWV(0, c26135BhM, r8, A00((C38321qM) interfaceC16820sZ.invoke()));
                } else {
                    Boolean bool = c26135BhM.A08;
                    if (bool != null && bool.booleanValue()) {
                        InterfaceC88553xD A002 = A00((C38321qM) interfaceC16820sZ.invoke());
                        if (A002 != null && (assetId = A002.getAssetId()) != null) {
                            z = AbstractC166987dD.A1a(((C52678NSa) c25361BKe.A08.getValue()).A03(assetId, false).getValue());
                        }
                        c26260BjT = new BWV(2, c26135BhM, C10E.A00(Boolean.valueOf(z)), A002);
                    } else {
                        C38321qM c38321qM2 = (C38321qM) interfaceC16820sZ.invoke();
                        if (c38321qM2 != null && c26135BhM.A07 != null) {
                            c25671BWh = new BWV(c26135BhM, c38321qM2);
                        } else {
                            InterfaceC31117Dlz interfaceC31117Dlz = c26135BhM.A05;
                            if (interfaceC31117Dlz != null) {
                                c26261BjU = new C26261BjU(c26135BhM, interfaceC31117Dlz.AgV(), 0);
                            } else {
                                InterfaceC31120Dm2 interfaceC31120Dm2 = c26135BhM.A02;
                                if (interfaceC31120Dm2 != null) {
                                    c26261BjU = new C26263BjW(c26135BhM, interfaceC31120Dm2);
                                } else {
                                    String str2 = c26135BhM.A0A;
                                    if (str2 != null) {
                                        i = 2;
                                    } else {
                                        str2 = c26135BhM.A09;
                                        if (str2 != null) {
                                            i = 1;
                                        } else {
                                            OpenInspirationHubCommand openInspirationHubCommand = c26135BhM.A06;
                                            if (openInspirationHubCommand != null) {
                                                c26260BjT = new C26260BjT(c26135BhM, String.valueOf(openInspirationHubCommand.C5X()));
                                            } else {
                                                c25671BWh = new C25671BWh(c26135BhM);
                                            }
                                        }
                                    }
                                    c26261BjU = new C26261BjU(c26135BhM, str2, i);
                                }
                            }
                            return c26261BjU;
                        }
                    }
                }
            }
            return c26260BjT;
        }
        return c25671BWh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C25361BKe(UserSession userSession, C25360BKd c25360BKd) {
        InterfaceC09390do A00 = C1XM.A00(C29891DGf.A00(userSession, 11));
        InterfaceC09390do A002 = C1XM.A00(C29891DGf.A00(userSession, 12));
        InterfaceC09390do A003 = C1XM.A00(C29891DGf.A00(userSession, 13));
        C17050sx A01 = AbstractC09440dt.A01(C29891DGf.A00(userSession, 14));
        C17050sx A012 = AbstractC09440dt.A01(C29891DGf.A00(userSession, 15));
        C17050sx A013 = AbstractC09440dt.A01(C29891DGf.A00(userSession, 16));
        AbstractC25234BEr.A1R(c25360BKd, A00, A002, A003, A01);
        AbstractC167007dF.A1I(A012, 7, A013);
        this.A02 = c25360BKd;
        this.A06 = A00;
        this.A03 = A002;
        this.A07 = A003;
        this.A04 = A01;
        this.A05 = A012;
        this.A08 = A013;
        MVH mvh = new MVH(null, 0 == true ? 1 : 0, 1);
        this.A00 = mvh;
        this.A01 = new MVI(AbstractC07080Za.A03(mvh));
    }

    public static final List A02(C26136BhN c26136BhN, C38663Gz4 c38663Gz4, C25361BKe c25361BKe) {
        ArrayList A0i;
        List list;
        ClipsMidCardType clipsMidCardType = c26136BhN.A04;
        if (clipsMidCardType == ClipsMidCardType.A0J && c26136BhN.A07 == MidCardLayoutType.A05) {
            C26133BhK c26133BhK = c26136BhN.A06;
            List list2 = c26133BhK.A08;
            A0i = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0i.add(A01(c26133BhK.A01, c25361BKe, null, C29891DGf.A00(it.next(), 17)));
            }
        } else {
            int i = 0;
            if (clipsMidCardType == ClipsMidCardType.A07 && c26136BhN.A07 == MidCardLayoutType.A05) {
                if (c38663Gz4 != null && (list = c38663Gz4.A0F) != null) {
                    A0i = AbstractC167007dF.A0i(list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        A0i.add(A01((C26134BhL) AbstractC001800i.A0O(c26136BhN.A06.A09, 0), c25361BKe, (String) it2.next(), DGL.A00));
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                List list3 = c26136BhN.A06.A09;
                A0i = AbstractC167007dF.A0i(list3);
                for (Object obj : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    A0i.add(A01((C26134BhL) obj, c25361BKe, null, new C57250PbY(c26136BhN, i, 3)));
                    i = i2;
                }
            }
        }
        return A0i;
    }
}
