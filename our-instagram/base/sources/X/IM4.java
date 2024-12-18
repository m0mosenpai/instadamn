package X;

import android.content.Context;
import java.util.BitSet;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IM4 {
    public final Context A00;
    public final Map A04 = AbstractC166987dD.A1G();
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final BitSet A01 = new BitSet(3);

    public final void A00(InterfaceC191788ea interfaceC191788ea) {
        if (this.A01.nextClearBit(0) >= 3) {
            AbstractC191798eb.A03(this.A00, interfaceC191788ea, "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet", null, AbstractC191768eY.A01(this.A04), 0L);
            return;
        }
        throw AbstractC31173DnH.A0f();
    }

    public IM4(Context context) {
        this.A00 = context;
    }
}
