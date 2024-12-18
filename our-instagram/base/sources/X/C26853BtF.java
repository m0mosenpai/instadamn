package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.BtF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26853BtF extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "KeywordExpirationTimeDatePickerBottomSheetFragment";
    public final String A03 = "creator_ai_link_keyword_expiration_time_date_picker";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = AbstractC25235BEs.A0s(Long.valueOf(System.currentTimeMillis()), this, "creator_ai_link_keyword_expiration_timestamp", EnumC09460dv.A02, 47);
    public long A00 = System.currentTimeMillis();

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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC166987dD.A0N(this.A01.getValue());
        IgTimePicker igTimePicker = (IgTimePicker) AbstractC166987dD.A0c(view, R.id.keyword_link_time_picker_view);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2);
        int i2 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.getInstance().get(1), i, i2);
        igTimePicker.A01 = calendar2;
        igTimePicker.setDatePeriod(365);
        calendar.setTime(new Date(this.A00));
        igTimePicker.A04(new C29303Cvy(this));
        igTimePicker.A03(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
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
        int A02 = C0f9.A02(123906125);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.link_keyword_expiration_time_date_picker, false);
        C0f9.A09(1698089589, A02);
        return A0R;
    }
}
