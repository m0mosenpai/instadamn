package X;

import android.content.Context;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ltt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49480Ltt implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49480Ltt(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        switch (this.A00) {
            case 0:
                DirectShareSheetFragment directShareSheetFragment = ((C31893Dzz) this.A02).A04;
                C1GJ.A06(AbstractC121115e3.A01(directShareSheetFragment.A0H, new EZ5(1, directShareSheetFragment, this.A01)), 1967622104, 2, false, false);
                return;
            case 1:
                C31893Dzz c31893Dzz = (C31893Dzz) this.A02;
                Object obj = this.A01;
                C193328hC A0I = AbstractC31171DnF.A0I(c31893Dzz.A01);
                A0I.A0A(2131957710);
                A0I.A0R(new DialogInterfaceOnClickListenerC35455FkC(14, obj, c31893Dzz), EnumC193348hE.A05, 2131957711);
                AbstractC31176DnK.A16(null, A0I, 2131957709);
                return;
            case 2:
                KDL kdl = (KDL) this.A02;
                Context requireContext = kdl.requireContext();
                C83403nh c83403nh = (C83403nh) this.A01;
                AbstractC13900nG.A00(requireContext, c83403nh.A1q);
                C9GR.A07(kdl.getActivity(), 2131956830);
                ((C7G0) kdl.A04.getValue()).A00(c83403nh, (DirectThreadKey) kdl.A06.getValue(), "copy");
                return;
            default:
                C48259LXi c48259LXi = (C48259LXi) this.A01;
                MRL mrl = c48259LXi.A0E;
                if (mrl != null) {
                    C48259LXi.A03(c48259LXi);
                    LongPressActionData longPressActionData = (LongPressActionData) this.A02;
                    C48259LXi.A02(longPressActionData, c48259LXi, "context_menu");
                    mrl.CJF(longPressActionData.A03, longPressActionData.A05, c48259LXi.A0a);
                    return;
                }
                return;
        }
    }
}
