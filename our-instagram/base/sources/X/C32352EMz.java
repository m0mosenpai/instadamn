package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.login.twofac.model.TrustedDevice;
import java.util.ArrayList;

/* renamed from: X.EMz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32352EMz extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesFragment";
    public TrustedDevice A00;
    public ListView A01;
    public C31765DxM A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976000);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trusted_devices";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            Integer num = trustedDevice.A03;
            if (num == null) {
                num = C05F.A00;
                trustedDevice.A03 = num;
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    C9GR.A07(requireContext(), 2131975996);
                }
            } else {
                C31765DxM c31765DxM = this.A02;
                if (c31765DxM != null) {
                    c31765DxM.A00.remove(trustedDevice);
                    C0fA.A00(c31765DxM, -5287943);
                    AbstractC31173DnH.A13(requireContext(), this, 2131975997);
                    C31765DxM c31765DxM2 = this.A02;
                    if (c31765DxM2 != null) {
                        if (c31765DxM2.isEmpty()) {
                            AbstractC25226BEj.A1P(this);
                        }
                    }
                }
                C14360o3.A0F("trustedDevicesAdapter");
                throw C00O.createAndThrow();
            }
            this.A00 = null;
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-816358043);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_trusted_devices_fragment, viewGroup, false);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null) {
            parcelableArrayList = AbstractC166987dD.A1E();
        }
        this.A02 = new C31765DxM(requireContext(), this, parcelableArrayList);
        ListView listView = (ListView) inflate.requireViewById(R.id.trusted_devices_listview);
        this.A01 = listView;
        if (listView == null) {
            str = "trustedDevicesListView";
        } else {
            C31765DxM c31765DxM = this.A02;
            if (c31765DxM == null) {
                str = "trustedDevicesAdapter";
            } else {
                listView.setAdapter((ListAdapter) c31765DxM);
                C0f9.A09(-1968233305, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
