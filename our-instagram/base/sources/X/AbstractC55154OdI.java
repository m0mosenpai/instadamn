package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55154OdI {
    public static final C84B A00(InterfaceC115495Kj interfaceC115495Kj, C84B c84b) {
        C14360o3.A0B(c84b, 0);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.push>");
        A05.add(interfaceC115495Kj);
        return MSZ.A0Y(c84b, A05);
    }

    public static final C84B A01(InterfaceC115495Kj interfaceC115495Kj, C84B c84b, int i) {
        C14360o3.A0B(c84b, 0);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.insert>");
        A05.add(i, interfaceC115495Kj);
        return MSZ.A0Y(c84b, A05);
    }

    public static final C84B A03(C84B c84b, List list) {
        C14360o3.A0B(c84b, 0);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.updateSegments>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09530e4 A17 = AbstractC43592JPx.A17(it);
            Number number = (Number) A17.A00;
            if (number.intValue() >= 0 && number.intValue() < A05.size()) {
                A05.set(number.intValue(), A17.A01);
            }
        }
        return MSZ.A0Y(c84b, A05);
    }

    public static final C09530e4 A04(C84B c84b) {
        C14360o3.A0B(c84b, 0);
        if (AbstractC166987dD.A1b(c84b.A01)) {
            ArrayList A05 = c84b.A05();
            C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.pop>");
            Object remove = A05.remove(A05.size() - 1);
            C14360o3.A07(remove);
            return AbstractC166987dD.A1L(MSZ.A0Y(c84b, A05), remove);
        }
        throw AbstractC31172DnG.A0u();
    }

    public static final C84B A02(InterfaceC115495Kj interfaceC115495Kj, C84B c84b, int i) {
        AbstractC167017dG.A1O(c84b, interfaceC115495Kj);
        ArrayList A05 = c84b.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.updateSegment>");
        if (i >= 0 && i < A05.size()) {
            A05.set(i, interfaceC115495Kj);
        }
        return MSZ.A0Y(c84b, A05);
    }
}
