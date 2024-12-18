package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.List;

/* renamed from: X.9ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218229ku extends C8J9 implements InterfaceC150446pt {
    public final C8JC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218229ku(Context context, UserSession userSession, C8C0 c8c0) {
        super(c8c0);
        C14360o3.A0B(userSession, 3);
        C8JC c8jc = new C8JC(context, new C19270xB("AR_COMMERCE_IG"), userSession, this);
        this.A00 = c8jc;
        super.A00 = c8jc;
    }

    @Override // X.InterfaceC150446pt
    public final void DYd(PickerConfiguration pickerConfiguration, String str) {
        C8JC c8jc = this.A00;
        c8jc.A00 = pickerConfiguration;
        c8jc.notifyDataSetChanged();
        if (pickerConfiguration != null) {
            int i = pickerConfiguration.mSelectedIndex;
            if (Integer.valueOf(i) != null) {
                c8jc.A08(i, false);
                C8C0 c8c0 = this.A01;
                NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = c8c0.A0P;
                C14360o3.A07(nestableSnapPickerRecyclerView);
                if (!nestableSnapPickerRecyclerView.isLaidOut()) {
                    nestableSnapPickerRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55499Oks(i, 2, this, nestableSnapPickerRecyclerView));
                    return;
                } else {
                    c8c0.A08(i);
                    return;
                }
            }
        }
        C0w9.A03("VariantPickerController", "selected index null");
    }

    @Override // X.InterfaceC150446pt
    public final void DYe() {
        this.A00.A01 = null;
        CMH(true);
    }

    @Override // X.InterfaceC150446pt
    public final void DYf(String str, int i) {
        C8JC c8jc = this.A00;
        c8jc.A08(i, false);
        c8jc.A05.AD6(((C8JF) c8jc).A00);
    }

    @Override // X.InterfaceC150446pt
    public final void DYg(InterfaceC25157BBb interfaceC25157BBb, String str) {
        this.A00.A01 = interfaceC25157BBb;
        EkB(true, true);
    }

    @Override // X.C8J9
    public final void A01(List list) {
        super.A01(list);
        C8JC c8jc = this.A00;
        InterfaceC25157BBb interfaceC25157BBb = c8jc.A01;
        if (interfaceC25157BBb != null && ((C8JE) c8jc).A02) {
            interfaceC25157BBb.onPickerItemSelected(((C8JF) c8jc).A00);
        }
        int i = ((C8JF) c8jc).A00;
        if (c8jc.A00 != null) {
            c8jc.A06(i);
        }
    }
}
