package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.List;

/* renamed from: X.8J8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8J8 extends C8J9 implements C8JA, InterfaceC150446pt, InterfaceC1810781j {
    public C8HI A00;
    public final C1810981l A01;
    public final C83N A02;
    public final C1815283f A03;
    public final C8JC A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8J8(Context context, C1815283f c1815283f, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8C0 c8c0, InterfaceC1810081c interfaceC1810081c) {
        super(c8c0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c1810981l, 3);
        C14360o3.A0B(interfaceC1810081c, 4);
        C14360o3.A0B(c8c0, 5);
        C14360o3.A0B(c1815283f, 6);
        C14360o3.A0B(userSession, 7);
        this.A01 = c1810981l;
        this.A03 = c1815283f;
        this.A02 = new C83N() { // from class: X.8JB
            @Override // X.C83N
            public final void DD7(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
                if (cameraAREffect == null) {
                    C8J8 c8j8 = C8J8.this;
                    if (c8j8.A00 != null && !c8j8.A01.A0W(C81W.A0B)) {
                        c8j8.CMH(true);
                    }
                }
            }
        };
        interfaceC1810081c.A82(this);
        C8JC c8jc = new C8JC(context, interfaceC11380iw, userSession, this);
        this.A04 = c8jc;
        super.A00 = c8jc;
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    @Override // X.InterfaceC150446pt
    public final void DYd(PickerConfiguration pickerConfiguration, String str) {
        PickerConfiguration pickerConfiguration2;
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        C14360o3.A0B(pickerConfiguration, 1);
        C8JC c8jc = this.A04;
        c8jc.A00 = pickerConfiguration;
        c8jc.notifyDataSetChanged();
        int i = pickerConfiguration.mSelectedIndex;
        C8HI c8hi = this.A00;
        if (c8hi != null && (pickerConfiguration2 = c8jc.A00) != null && c8jc.A06(i) && (itemConfigurationArr = pickerConfiguration2.mItems) != null && (itemConfiguration = itemConfigurationArr[i]) != null) {
            c8hi.A0T(itemConfiguration);
        }
        c8jc.A08(i, false);
        C8C0 c8c0 = super.A01;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = c8c0.A0P;
        C14360o3.A07(nestableSnapPickerRecyclerView);
        if (!nestableSnapPickerRecyclerView.isLaidOut()) {
            nestableSnapPickerRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC23272ATh(nestableSnapPickerRecyclerView, this, i));
        } else {
            c8c0.A08(i);
        }
    }

    @Override // X.InterfaceC150446pt
    public final void DYg(InterfaceC25157BBb interfaceC25157BBb, String str) {
        C14360o3.A0B(interfaceC25157BBb, 1);
        C8JE c8je = super.A00;
        C8JC c8jc = this.A04;
        if (C14360o3.A0K(c8je, c8jc)) {
            c8jc.A01 = interfaceC25157BBb;
            EkB(true, true);
        }
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        C14360o3.A0B(obj3, 2);
        if (obj == EnumC1810181d.A11 && obj2 != EnumC1810181d.A0w && !(obj3 instanceof C187788Tv)) {
            CMH(true);
        }
    }

    @Override // X.C8JA
    public final void F9b() {
        this.A00 = null;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    @Override // X.C8JA
    public final InterfaceC150446pt CC3() {
        return this;
    }

    @Override // X.C8JA
    public final void DDq() {
        this.A03.A00().A08(this.A02);
    }

    @Override // X.C8JA
    public final void DEt() {
        this.A03.A00().A09(this.A02);
        CMH(true);
    }

    @Override // X.InterfaceC150446pt
    public final void DYe() {
        this.A04.A01 = null;
        CMH(true);
    }

    @Override // X.InterfaceC150446pt
    public final void DYf(String str, int i) {
        C8JC c8jc = this.A04;
        c8jc.A08(i, false);
        c8jc.A05.AD6(((C8JF) c8jc).A00);
    }

    @Override // X.C8J9
    public final void A01(List list) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        super.A01(list);
        if (this.A00 != null) {
            C8JC c8jc = this.A04;
            InterfaceC25157BBb interfaceC25157BBb = c8jc.A01;
            if (interfaceC25157BBb != null && ((C8JE) c8jc).A02) {
                interfaceC25157BBb.onPickerItemSelected(((C8JF) c8jc).A00);
            }
            C8HI c8hi = this.A00;
            if (c8hi != null) {
                int i = ((C8JF) c8jc).A00;
                PickerConfiguration pickerConfiguration = c8jc.A00;
                if (pickerConfiguration != null && c8jc.A06(i) && (itemConfigurationArr = pickerConfiguration.mItems) != null && (itemConfiguration = itemConfigurationArr[i]) != null) {
                    c8hi.A0T(itemConfiguration);
                }
            }
        }
    }

    @Override // X.C8JA
    public final void EYG(C8HI c8hi) {
        this.A00 = c8hi;
    }
}
