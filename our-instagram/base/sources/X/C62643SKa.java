package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SKa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62643SKa {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C64988TbD.A00);

    public final C60622REh A00(C62731SNv c62731SNv, SLG slg, C63019Saj c63019Saj) {
        C14360o3.A0B(slg, 2);
        try {
            String str = null;
            C64031Sy3 c64031Sy3 = (C64031Sy3) AbstractC58318PtA.A0t(SR8.class, "create").invoke(null, new Object[0]);
            ImmutableList immutableList = c63019Saj.A01;
            C2JM c2jm = c64031Sy3.A00;
            c2jm.A05("component_types", immutableList);
            c64031Sy3.A02 = true;
            String str2 = c63019Saj.A0F;
            C2JM c2jm2 = c64031Sy3.A01;
            c2jm2.A04(AbstractC63083Sc6.A00(), str2);
            c64031Sy3.A06 = true;
            c2jm2.A04(TraceFieldType.RequestID, c63019Saj.A0E);
            c64031Sy3.A05 = true;
            c2jm.A04("payment_product_id", c63019Saj.A0C);
            c64031Sy3.A04 = true;
            c2jm2.A04(MSV.A00(443), c63019Saj.A09);
            c64031Sy3.A03 = true;
            OtcInput otcInput = c63019Saj.A04;
            String str3 = null;
            if (otcInput != null) {
                str = otcInput.A00;
            }
            c2jm.A04("otc_session_id", str);
            if (otcInput != null) {
                str3 = otcInput.A01;
            }
            c2jm.A04("otc_type", str3);
            String str4 = c63019Saj.A0D;
            if (str4 != null && str4.length() != 0) {
                c2jm2.A04("receiver_id", str4);
            }
            String str5 = c63019Saj.A0B;
            if (str5.length() > 0) {
                c2jm.A04("payment_container_mode", str5);
            }
            ImmutableList immutableList2 = c63019Saj.A06;
            if (!immutableList2.isEmpty()) {
                c2jm2.A05("supported_container_types", immutableList2);
            }
            ImmutableList immutableList3 = c63019Saj.A05;
            if (!immutableList3.isEmpty()) {
                c2jm2.A05("payment_action_types", immutableList3);
            }
            String str6 = c63019Saj.A07;
            if (str6 != null && str6.length() != 0) {
                c2jm2.A04("client_receiver_id", str6);
            }
            String str7 = c63019Saj.A08;
            if (str7 != null) {
                c2jm2.A04("experience_type", str7);
            }
            C2JO c2jo = c63019Saj.A02;
            if (c2jo != null) {
                c2jm2.A00(c2jo, "charge_amount");
            }
            String str8 = c63019Saj.A0A;
            if (str8 != null && !AbstractC001900j.A0T(str8)) {
                c2jm2.A04("order_id", str8);
            }
            C2JO c2jo2 = c63019Saj.A03;
            if (c2jo2 != null) {
                c2jm.A00(c2jo2, "otc_component_input");
            }
            C2JO c2jo3 = c63019Saj.A00;
            if (c2jo3 != null) {
                c2jm2.A00(c2jo3, "bloks_params");
            }
            C1Dk A00 = c64031Sy3.A00();
            C14360o3.A0A(A00);
            slg.A00(A00);
            return C60622REh.A00(c62731SNv, (InterfaceC40711ue) this.A00.getValue(), A00, T7X.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
