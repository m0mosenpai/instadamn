package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I46 {
    public static Map A00(InterfaceC43575JMj interfaceC43575JMj) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (interfaceC43575JMj.Ap9() != null) {
            ProductCollection Ap9 = interfaceC43575JMj.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI3 = Ap9.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI3);
        }
        if (interfaceC43575JMj.Azc() != null) {
            DropsLaunchAnimationIntf Azc = interfaceC43575JMj.Azc();
            if (Azc != null) {
                treeUpdaterJNI2 = Azc.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("drops_launch_animation", treeUpdaterJNI2);
        }
        if (interfaceC43575JMj.B2m() != null) {
            DropsEventPageNavigationMetadata B2m = interfaceC43575JMj.B2m();
            if (B2m != null) {
                treeUpdaterJNI = B2m.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("event_page_navigation_metadata", treeUpdaterJNI);
        }
        if (interfaceC43575JMj.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43575JMj.getId(), A1I);
        }
        if (interfaceC43575JMj.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC43575JMj.getMediaId(), A1I);
        }
        if (interfaceC43575JMj.BSZ() != null) {
            A1I.put("merchant_id", interfaceC43575JMj.BSZ());
        }
        if (interfaceC43575JMj.C0p() != null) {
            List<InterfaceC43490JJc> C0p = interfaceC43575JMj.C0p();
            if (C0p != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43490JJc interfaceC43490JJc : C0p) {
                    if (interfaceC43490JJc != null) {
                        arrayList.add(interfaceC43490JJc.F7o());
                    }
                }
            }
            A1I.put("stickers", arrayList);
        }
        if (interfaceC43575JMj.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43575JMj.getText(), A1I);
        }
        if (interfaceC43575JMj.C6J() != null) {
            A1I.put("text_format", interfaceC43575JMj.C6J());
        }
        if (interfaceC43575JMj.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, interfaceC43575JMj.getUserId());
        }
        if (interfaceC43575JMj.CEu() != null) {
            A1I.put("vibrant_text_color", interfaceC43575JMj.CEu());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
