package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45812KPr extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A07 = {new AnonymousClass019(C45812KPr.class, "deviceList", "getDeviceList()Landroidx/recyclerview/widget/RecyclerView;", 0), new AnonymousClass019(C45812KPr.class, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDevicesV2Fragment";
    public boolean A00;
    public final KFH A01;
    public final KFH A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC16820sZ A06;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(view);
        A0g.setImageResource(R.drawable.ig_illustrations_illo_one_time_code2_refresh);
        A0g.setHeadline(2131961792);
        A0g.setBody(2131961786);
        C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.bottom_button);
        KCM.A07(c64p, this, 47);
        KCM.A06(c64p, this, 48);
        KFH kfh = this.A01;
        ((RecyclerView) AbstractC31469DsD.A00(kfh)).setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((RecyclerView) AbstractC31469DsD.A00(kfh)).setAdapter((C2UU) this.A03.getValue());
        AbstractC43593JPy.A0D(kfh).setOverScrollMode(2);
        LLQ.A05(AbstractC31176DnK.A0C(view, R.id.container), this, KCM.A00(this.A04));
        C44541Jml.A00(this.A05).A05("OTC_DEVICE_LIST_IMPRESSION");
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        InterfaceC09390do interfaceC09390do = this.A05;
        JQ0.A11(this, new PYw(this, null, 27), ((C44541Jml) interfaceC09390do.getValue()).A05);
        JQ0.A11(this, new GST(this, null, 4), ((C44541Jml) interfaceC09390do.getValue()).A04);
        ((C44541Jml) interfaceC09390do.getValue()).A01();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
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
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A05((RecyclerView) AbstractC31469DsD.A00(this.A01));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45812KPr() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = MHK.A00(this, enumC09460dv, 39);
        this.A06 = new MHK(this, 45);
        MHK mhk = new MHK(this, 44);
        InterfaceC09390do A00 = MHK.A00(new MHK(this, 41), enumC09460dv, 42);
        this.A05 = AbstractC25225BEi.A0a(new MHK(A00, 43), mhk, new C50172MDz(7, null, A00), AbstractC25225BEi.A1D(C44541Jml.class));
        this.A01 = KCM.A03(this, 38);
        this.A02 = KCM.A03(this, 40);
        this.A03 = C1XM.A00(C50193MFa.A00);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1526809471);
        super.onCreate(bundle);
        C44541Jml c44541Jml = (C44541Jml) this.A05.getValue();
        Object parcelableArrayList = requireArguments().getParcelableArrayList("deviceListKey");
        if (parcelableArrayList == null) {
            parcelableArrayList = C16930sl.A00;
        }
        c44541Jml.A02.F8m(parcelableArrayList);
        C0f9.A09(-1326228256, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1549737743);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_devices_v2_fragment, viewGroup, false);
        C0f9.A09(1943231210, A02);
        return inflate;
    }
}
