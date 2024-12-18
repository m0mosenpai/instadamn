package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.AfO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23751AfO implements C88K, AnonymousClass887, C88L {
    public final int A00;
    public final Object A01;

    public C23751AfO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass887
    public final void DDB(C88X c88x, String str, int i, boolean z) {
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        A50 a50;
        String str2;
        String str3;
        String str4;
        InterfaceC16610sE interfaceC16610sE;
        if (this.A00 != 0) {
            C211029Uz c211029Uz = (C211029Uz) this.A01;
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            if (((C88M) c211029Uz.A07.getValue()).A07(i)) {
                if (c88x != null) {
                    str4 = c88x.A0G;
                } else {
                    str4 = null;
                }
                c211029Uz.A01 = str4;
                C22C A01 = AnonymousClass229.A01(c211029Uz.A05);
                if (A01.A0J() != null) {
                    C22C.A09(EnumC50631MWs.A0I, A01, "TIMELINE_TRANSITION_CHOOSE_SWIPE", ((C22F) A01).A04.A0W);
                }
                ((ReboundViewPager) c211029Uz.A0A.getValue()).A0L(i, 0.0f);
                if (c88x != null && (interfaceC16610sE = c211029Uz.A02) != null) {
                    interfaceC16610sE.invoke(c88x.A0G, c88x.getId(), AbstractC166997dE.A0a());
                    return;
                }
                return;
            }
            return;
        }
        AX0 ax0 = (AX0) this.A01;
        ax0.A09.EMP(i, true);
        InterfaceC25157BBb interfaceC25157BBb = ax0.A01;
        if (interfaceC25157BBb != null) {
            interfaceC25157BBb.onPickerItemSelected(i);
        }
        PickerConfiguration pickerConfiguration = ax0.A00;
        if (pickerConfiguration == null || (itemConfigurationArr = pickerConfiguration.mItems) == null || (itemConfiguration = itemConfigurationArr[i]) == null || (a50 = ax0.A02) == null || (str2 = itemConfiguration.mId) == null) {
            return;
        }
        C214619ez c214619ez = a50.A00;
        C23656Adr.A00(EnumC223239t9.A0j, c214619ez.A02());
        AbstractC131215w9 abstractC131215w9 = c214619ez.A03;
        if (abstractC131215w9 == null) {
            str3 = "arAdsDataStore";
        } else {
            UPS A00 = abstractC131215w9.A00(str2);
            if (A00 == null) {
                return;
            }
            C69574Vrd c69574Vrd = c214619ez.A07;
            if (c69574Vrd == null) {
                str3 = "productCardViewController";
            } else {
                c69574Vrd.A00(A00, c214619ez.A03().A02, c214619ez.A03().A01);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AnonymousClass887
    public final void DNi(C88X c88x, int i) {
        if (this.A00 != 0) {
            C14360o3.A0B(c88x, 0);
            C211029Uz c211029Uz = (C211029Uz) this.A01;
            c211029Uz.A01 = c88x.A0G;
            ReboundViewPager.A06((ReboundViewPager) c211029Uz.A0A.getValue(), true, false);
            InterfaceC16610sE interfaceC16610sE = c211029Uz.A02;
            if (interfaceC16610sE != null) {
                interfaceC16610sE.invoke(c211029Uz.A01, null, true);
            }
        }
    }

    @Override // X.C88L
    public final void DA8(int i) {
    }

    @Override // X.AnonymousClass887
    public final void DDD(C88X c88x, int i, boolean z) {
    }
}
