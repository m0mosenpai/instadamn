package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Oa2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55051Oa2 {
    public static final C55051Oa2 A00 = new Object();
    public static final ConcurrentMap A01;

    public static final RtcConnectionEntity A00(String str) {
        C14360o3.A0B(str, 0);
        return (RtcConnectionEntity) A01.get(str);
    }

    public final boolean A01(InterfaceC58275PsT interfaceC58275PsT, RtcConnectionEntity rtcConnectionEntity) {
        ConcurrentMap concurrentMap;
        C14360o3.A0B(rtcConnectionEntity, 0);
        String A002 = OPw.A00(rtcConnectionEntity);
        RtcConnectionEntity A003 = A00(A002);
        if (A003 != null && !(rtcConnectionEntity instanceof RtcConnectionEntity.LiveInviteConnectionEntity)) {
            EnumC53186Nfi C01 = A003.C01();
            EnumC53186Nfi C012 = rtcConnectionEntity.C01();
            C14360o3.A0B(C012, 0);
            List A12 = AbstractC43592JPx.A12(C01, EnumC53186Nfi.A00);
            if (A12 != null && A12.contains(C012)) {
                concurrentMap = A01;
                rtcConnectionEntity = AES.A00(C012, A003, rtcConnectionEntity.BXN());
            } else {
                if (interfaceC58275PsT != null) {
                    interfaceC58275PsT.CnT("call_state_transition", C01.name());
                    return false;
                }
                return false;
            }
        } else {
            concurrentMap = A01;
        }
        concurrentMap.put(A002, rtcConnectionEntity);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Oa2, java.lang.Object] */
    static {
        C18B c18b = new C18B();
        c18b.A03(16);
        c18b.A02(16);
        A01 = c18b.A00();
    }
}
