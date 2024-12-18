package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4H {
    public static Map A00(InterfaceC43569JMd interfaceC43569JMd) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43569JMd.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43569JMd.getId(), A1I);
        }
        if (interfaceC43569JMd.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC43569JMd.getMediaId(), A1I);
        }
        User BSW = interfaceC43569JMd.BSW();
        ArrayList arrayList = null;
        if (BSW != null) {
            AbstractC37301Gc2.A1Q(BSW, A1I);
        }
        if (interfaceC43569JMd.C0p() != null) {
            List<InterfaceC43491JJd> C0p = interfaceC43569JMd.C0p();
            if (C0p != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43491JJd interfaceC43491JJd : C0p) {
                    if (interfaceC43491JJd != null) {
                        arrayList.add(interfaceC43491JJd.F7o());
                    }
                }
            }
            A1I.put("stickers", arrayList);
        }
        if (interfaceC43569JMd.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43569JMd.getText(), A1I);
        }
        if (interfaceC43569JMd.C6J() != null) {
            A1I.put("text_format", interfaceC43569JMd.C6J());
        }
        if (interfaceC43569JMd.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, interfaceC43569JMd.getUserId());
        }
        if (interfaceC43569JMd.CEu() != null) {
            A1I.put("vibrant_text_color", interfaceC43569JMd.CEu());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
