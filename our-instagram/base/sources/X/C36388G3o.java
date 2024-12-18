package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.G3o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36388G3o implements InterfaceC37160GYx {
    public final /* synthetic */ InterfaceC58279PsX A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    @Override // X.InterfaceC37160GYx
    public final void onShareTap(List list) {
    }

    public C36388G3o(InterfaceC58279PsX interfaceC58279PsX, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC58279PsX;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC37160GYx
    public final void onShareOneTap(DirectShareTarget directShareTarget) {
        String str;
        String str2;
        InterfaceC58279PsX interfaceC58279PsX = this.A00;
        Integer num = C05F.A0l;
        HashMap A1G = AbstractC166987dD.A1G();
        String str3 = null;
        if (directShareTarget != null) {
            str2 = "";
            str = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", directShareTarget.A0B(), null);
        } else {
            str = "";
            str2 = "";
        }
        A1G.put("recipient_ids", str);
        if (directShareTarget != null) {
            str3 = directShareTarget.A08();
        }
        A1G.put("thread_ids", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, str2, AbstractC001800i.A0X(AbstractC166987dD.A1J(str3)), null));
        AbstractC55033OXz.A02(interfaceC58279PsX, num, A1G);
        this.A01.invoke();
    }
}
