package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Iaa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41587Iaa {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC43409JFz A02;
    public final String A03;
    public final C68844Vd0 A04;

    public static final void A00(AbstractC127945qN abstractC127945qN, C41587Iaa c41587Iaa, C38321qM c38321qM, int i, int i2) {
        C19260xA c19260xA;
        ArrayList arrayList;
        Long l;
        InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(c41587Iaa.A00, c41587Iaa.A01);
        if (A09.isSampled()) {
            String str = c41587Iaa.A03;
            if (str != null) {
                AbstractC37301Gc2.A16(A09, str);
            }
            InterfaceC43409JFz interfaceC43409JFz = c41587Iaa.A02;
            if (interfaceC43409JFz != null) {
                c19260xA = interfaceC43409JFz.E6Z(abstractC127945qN, c38321qM);
            } else {
                c19260xA = null;
            }
            A09.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM.getId());
            AbstractC37302Gc3.A0x(A09, c38321qM);
            AbstractC37301Gc2.A0x(A09, i, i2);
            AbstractC37303Gc4.A0g(A09, c38321qM);
            A09.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC167007dF.A0d());
            A09.AAk("product_ids", c38321qM.A3o());
            ArrayList A3K = c38321qM.A3K();
            if (A3K != null) {
                arrayList = AbstractC167017dG.A0q(A3K);
                Iterator it = A3K.iterator();
                while (it.hasNext()) {
                    AbstractC37302Gc3.A1Y(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A09.AAk("merchant_ids", arrayList);
            if (c19260xA != null) {
                String A05 = c19260xA.A05("hashtag_id");
                if (A05 != null) {
                    try {
                        A09.A9K("hashtag_id", AbstractC166997dE.A0j(A05));
                    } catch (NumberFormatException e) {
                        C0K8.A0G("DiscoveryImpressionHelper", "Failed to convert hashtag id to long", e);
                    }
                }
                AbstractC37302Gc3.A0w(A09, c19260xA, "hashtag_name");
                AbstractC37302Gc3.A0w(A09, c19260xA, "hashtag_follow_status");
                String A052 = c19260xA.A05("query_text");
                if (A052 != null) {
                    A09.A7v("is_tag", Boolean.valueOf(AbstractC85443rZ.A02(A052)));
                }
                String A053 = c19260xA.A05(AbstractC111324zv.A00(1643));
                if (A053 != null) {
                    A09.AAP("tag_navigation_source", A053);
                }
                C0Zx c0Zx = new C0Zx();
                AbstractC37302Gc3.A0w(A09, c19260xA, "search_session_id");
                AbstractC37302Gc3.A0w(A09, c19260xA, "rank_token");
                AbstractC37302Gc3.A0w(A09, c19260xA, "query_text");
                AbstractC37303Gc4.A0y(c0Zx, c19260xA);
                A09.AAQ(c0Zx, "search_context");
            }
            if (c38321qM.BRp() == EnumC40111tc.A09) {
                A09.A9K("carousel_index", AbstractC82633mR.A07(c38321qM, 0));
                A09.AAP("carousel_media_id", AbstractC82633mR.A0G(c38321qM, 0));
                if (c38321qM.A5M()) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        l = AbstractC166997dE.A0j(id);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    l = null;
                }
                A09.A9K("carousel_container_media_id", l);
            }
            AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
            A09.Cht();
        }
        C68844Vd0 c68844Vd0 = c41587Iaa.A04;
        if (c68844Vd0 != null) {
            String id2 = c38321qM.getId();
            if (id2 != null) {
                AbstractC67878V0j abstractC67878V0j = c68844Vd0.A00;
                Number A0Q = AbstractC37300Gc1.A0Q(id2, ((C51747MtW) C51042Mgs.A02(abstractC67878V0j.A07()).getValue()).A0J);
                if (A0Q != null) {
                    int intValue = A0Q.intValue();
                    W58 w58 = abstractC67878V0j.A0D;
                    if (w58 == null) {
                        C14360o3.A0F("perfLogger");
                        throw C00O.createAndThrow();
                    }
                    w58.A02(intValue);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C41587Iaa(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC43409JFz interfaceC43409JFz, C68844Vd0 c68844Vd0, String str) {
        AbstractC167017dG.A1P(interfaceC11380iw, userSession);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = interfaceC43409JFz;
        this.A04 = c68844Vd0;
    }
}
