package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hkb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39765Hkb {
    public static Map A00(InterfaceC102144ik interfaceC102144ik) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC102144ik.AXy() != null) {
            A1I.put(AbstractC111324zv.A00(96), interfaceC102144ik.AXy());
        }
        if (interfaceC102144ik.AeU() != null) {
            A1I.put(AbstractC111324zv.A00(1962), interfaceC102144ik.AeU());
        }
        if (interfaceC102144ik.AeW() != null) {
            A1I.put(AbstractC111324zv.A00(745), interfaceC102144ik.AeW());
        }
        if (interfaceC102144ik.Aed() != null) {
            A1I.put(AbstractC111324zv.A00(98), interfaceC102144ik.Aed());
        }
        if (interfaceC102144ik.Aei() != null) {
            A1I.put(AbstractC111324zv.A00(175), interfaceC102144ik.Aei());
        }
        if (interfaceC102144ik.AvE() != null) {
            A1I.put(AbstractC111324zv.A00(864), interfaceC102144ik.AvE());
        }
        if (interfaceC102144ik.B3Q() != null) {
            A1I.put("expression_id", interfaceC102144ik.B3Q());
        }
        if (interfaceC102144ik.BB8() != null) {
            A1I.put("has_avatar", interfaceC102144ik.BB8());
        }
        if (interfaceC102144ik.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC102144ik.getMediaType(), A1I);
        }
        if (interfaceC102144ik.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, interfaceC102144ik.getUserId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
