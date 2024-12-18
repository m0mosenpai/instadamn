package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7Q7, reason: invalid class name */
/* loaded from: classes3.dex */
public class C7Q7 implements C7Q8 {
    public final InterfaceC165247aD A00;

    public static void A00(InterfaceC165017Zq interfaceC165017Zq, C7P3 c7p3, C2EY c2ey, C23031Ai c23031Ai, String str, String str2, String str3, long j, boolean z) {
        String A0g;
        C14360o3.A0B(c2ey, 0);
        C14360o3.A0B(c23031Ai, 1);
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        int i = interfaceC19630xq.getInt("should_show_like_direct_message_count", 0);
        if (i < 2) {
            if (c2ey == C2EY.A1i) {
                A0g = "should_show_like_direct_message_nux";
            } else if (c2ey == C2EY.A0q) {
                A0g = "should_show_like_direct_vm_message_nux";
            } else {
                A0g = AnonymousClass001.A0g("should_show_like_direct_", c2ey.name(), "_message_nux");
                C14360o3.A07(A0g);
            }
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E77(A0g, false);
            ARD.apply();
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E7D("should_show_like_direct_message_count", i + 1);
            ARD2.apply();
        }
        if (c7p3 == C7P3.A0H) {
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.E7D("double_tap_to_react_with_avatar_nux_count", interfaceC19630xq.getInt("double_tap_to_react_with_avatar_nux_count", 0) + 1);
            ARD3.apply();
        }
        interfaceC165017Zq.DT8(c2ey, new MessageIdentifier(str, str2), "double_tap", str3, null, j, z);
        String str4 = c2ey.A00;
        C14360o3.A0B(str4, 0);
        if (!interfaceC19630xq.getBoolean(AnonymousClass001.A0R("response_to_direct_liking_nux:", str4), false)) {
            String A0R = AnonymousClass001.A0R("response_to_direct_liking_nux:", str4);
            InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
            ARD4.E77(A0R, true);
            ARD4.apply();
        }
    }

    @Override // X.C7Q8
    public /* bridge */ /* synthetic */ boolean DBb(Object obj, Object obj2) {
        if (this instanceof C158657Ab) {
            return ((C158657Ab) this).A01((InterfaceC129525tH) obj, (C7QD) obj2);
        }
        return A01((InterfaceC129525tH) obj, obj2);
    }

    public C7Q7(InterfaceC165247aD interfaceC165247aD) {
        this.A00 = interfaceC165247aD;
    }

    public boolean A01(InterfaceC129525tH interfaceC129525tH, Object obj) {
        String str;
        if (!interfaceC129525tH.CYW()) {
            return false;
        }
        List AuO = interfaceC129525tH.AuO();
        String str2 = interfaceC129525tH.BSy().A01;
        String A00 = interfaceC129525tH.BSy().A00();
        long BT8 = interfaceC129525tH.BT8();
        C2EY Ar9 = interfaceC129525tH.Ar9();
        boolean CXQ = interfaceC129525tH.CXQ();
        InterfaceC165247aD interfaceC165247aD = this.A00;
        InterfaceC165017Zq interfaceC165017Zq = (InterfaceC165017Zq) interfaceC165247aD;
        C23031Ai CE0 = interfaceC165247aD.CE0();
        if (AuO != null && !AuO.isEmpty()) {
            str = (String) AuO.get(0);
        } else {
            str = null;
        }
        A00(interfaceC165017Zq, interfaceC129525tH.AxY(), Ar9, CE0, str2, A00, str, BT8, CXQ);
        return true;
    }
}
