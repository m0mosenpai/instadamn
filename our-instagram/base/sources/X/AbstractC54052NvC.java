package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.NvC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54052NvC {
    public static final Map A00(InterfaceC58255Prz interfaceC58255Prz) {
        String str;
        Long l;
        String str2;
        ArrayList arrayList;
        String str3;
        ArrayList arrayList2 = null;
        boolean z = false;
        if (interfaceC58255Prz != null) {
            C51847Mvp c51847Mvp = (C51847Mvp) interfaceC58255Prz;
            C51851Mvt c51851Mvt = c51847Mvp.A00;
            List list = c51851Mvt.A06;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A38 = AbstractC31172DnG.A0i(it).A38();
                if (A38 != null) {
                    AbstractC31177DnL.A1R(A38, A0i);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            String str4 = c51851Mvt.A02;
            if (str4 == null || (str = AbstractC001900j.A0C(str4).toString()) == null) {
                str = "";
            }
            String str5 = c51851Mvt.A03;
            if (str5 != null) {
                l = AbstractC003100w.A0k(10, str5);
            } else {
                l = null;
            }
            long parseLong = Long.parseLong(c51851Mvt.A01.getId());
            String obj = AbstractC001900j.A0C(c51851Mvt.A05).toString();
            MediaKitVisibility mediaKitVisibility = c51851Mvt.A00;
            AbstractC167017dG.A1T(obj, mediaKitVisibility);
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C222015v c222015v = AbstractC221915u.A00;
            C17z A0A = c222015v.A0A(A0O);
            A0A.A0d();
            Iterator A0q = AbstractC37301Gc2.A0q(A0A, AbstractC111324zv.A00(197), A0i);
            while (A0q.hasNext()) {
                AbstractC50522MSa.A1L(A0A, A0q);
            }
            A0A.A0Z();
            A0A.A0S(DevServerEntity.COLUMN_DESCRIPTION, str);
            if (l != null) {
                A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue());
            }
            A0A.A0R("owner_id", parseLong);
            A0A.A0S(DialogModule.KEY_TITLE, obj);
            A0A.A0S("visibility", mediaKitVisibility.A00);
            String A0l = AbstractC167017dG.A0l(A0A, A0O);
            C14360o3.A07(A0l);
            C09530e4 A1L = AbstractC166987dD.A1L("summary", A0l);
            List list2 = c51847Mvp.A02;
            try {
                StringWriter A0O2 = AbstractC37300Gc1.A0O();
                C17z A0A2 = c222015v.A0A(A0O2);
                A0A2.A0c();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C51850Mvs c51850Mvs = (C51850Mvs) ((InterfaceC58257Ps1) it2.next());
                    List list3 = c51850Mvs.A05;
                    boolean z2 = false;
                    ArrayList arrayList3 = null;
                    if (list3 != null) {
                        arrayList = AbstractC167007dF.A0i(list3);
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            AbstractC31177DnL.A1R(AbstractC25226BEj.A15(it3).getId(), arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str6 = c51850Mvs.A02;
                    if (str6 != null) {
                        str3 = AbstractC001900j.A0C(str6).toString();
                    } else {
                        str3 = null;
                    }
                    String str7 = c51850Mvs.A03;
                    C14360o3.A0B(str7, 0);
                    Long A0k = AbstractC003100w.A0k(10, str7);
                    List list4 = c51850Mvs.A06;
                    if (list4 != null) {
                        arrayList3 = AbstractC167007dF.A0i(list4);
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((H7W) ((JJ9) it4.next())).A00);
                        }
                    }
                    C51849Mvr c51849Mvr = c51850Mvs.A00;
                    if (c51849Mvr != null) {
                        z = c51849Mvr.A01;
                        List list5 = c51849Mvr.A00;
                        arrayList2 = AbstractC167007dF.A0i(list5);
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            String A382 = ((C51848Mvq) ((JJA) it5.next())).A00.A38();
                            if (A382 != null) {
                                AbstractC31177DnL.A1R(A382, arrayList2);
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        z2 = true;
                    }
                    String obj2 = AbstractC001900j.A0C(c51850Mvs.A04).toString();
                    MediaKitSectionType mediaKitSectionType = c51850Mvs.A01;
                    AbstractC167017dG.A1U(obj2, mediaKitSectionType);
                    A0A2.A0d();
                    if (arrayList != null) {
                        Iterator A0q2 = AbstractC37301Gc2.A0q(A0A2, "accounts", arrayList);
                        while (A0q2.hasNext()) {
                            AbstractC50522MSa.A1L(A0A2, A0q2);
                        }
                        A0A2.A0Z();
                    }
                    if (str3 != null) {
                        A0A2.A0S(DevServerEntity.COLUMN_DESCRIPTION, str3);
                    }
                    if (A0k != null) {
                        A0A2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0k.longValue());
                    }
                    if (arrayList3 != null) {
                        Iterator A0q3 = AbstractC37301Gc2.A0q(A0A2, "insights", arrayList3);
                        while (A0q3.hasNext()) {
                            MediaKitInsightType mediaKitInsightType = (MediaKitInsightType) A0q3.next();
                            if (mediaKitInsightType != null) {
                                A0A2.A0u(mediaKitInsightType.A00);
                            }
                        }
                        A0A2.A0Z();
                    }
                    if (z2) {
                        A0A2.A0r("media_posts");
                        A0A2.A0d();
                        A0A2.A0T("hides_likes", z);
                        if (arrayList2 != null) {
                            Iterator A0q4 = AbstractC37301Gc2.A0q(A0A2, "media_items", arrayList2);
                            while (A0q4.hasNext()) {
                                AbstractC50522MSa.A1L(A0A2, A0q4);
                            }
                            A0A2.A0Z();
                        }
                        A0A2.A0a();
                    }
                    A0A2.A0S(DialogModule.KEY_TITLE, obj2);
                    A0A2.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mediaKitSectionType.A00);
                    A0A2.A0a();
                }
                str2 = MSZ.A0s(A0A2, A0O2);
            } catch (IOException unused) {
                str2 = "";
            }
            return AbstractC25233BEq.A0p("sections", str2, A1L);
        }
        return null;
    }
}
