package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.JZq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43827JZq {
    public static final Long A00(C3o9 c3o9) {
        MsysThreadId msysThreadId;
        if (c3o9 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            msysThreadId = ((DirectMsysMixedThreadKey) c3o9).A01;
        } else {
            return null;
        }
        return msysThreadId.A02;
    }

    public static final String A01(C3o9 c3o9) {
        DirectThreadKey directThreadKey;
        if (c3o9 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            return null;
        }
        return directThreadKey.A00;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C3o9 c3o9) {
        interfaceC02590Ai.AAP("open_thread_id", A01(c3o9));
        interfaceC02590Ai.A9K("occamadillo_thread_id", A00(c3o9));
    }
}
