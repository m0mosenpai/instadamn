package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class VB3 extends AbstractC33235ElU implements C51D {
    public static final String __redex_internal_original_name = "CommentFilterBottomSheetFragment";
    public C68964Vf2 A00;
    public final InterfaceC09390do A03 = C1XM.A00(new C29906DGu(this, 4));
    public EnumC166067ba A01 = C70066W1c.A01.A00;
    public Integer A02 = C05F.A00;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comment_filter_bottom_sheet_fragment";
    }

    @Override // X.AbstractC33235ElU
    public final boolean isElevated() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x008b. Please report as an issue. */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i = 0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C01L A1I = C0eM.A1I();
        boolean A1a = AbstractC31178DnM.A1a(this.A03);
        C01L A1I2 = C0eM.A1I();
        Context context = getContext();
        String str2 = null;
        if (context != null) {
            str = context.getString(2131956446);
        } else {
            str = null;
        }
        C35124FeR.A00("NOT_SET", str, A1I2);
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(2131956448);
        }
        C35124FeR.A00("SUBSCRIBERS_ONLY", str2, A1I2);
        Object c34960Fak = new C34960Fak(new WP4(this, 0), this.A01.toString(), C0eM.A1J(A1I2));
        if (A1a) {
            A1I.add(c34960Fak);
            C35119FeM.A00(A1I, true);
            String[] stringArray = AbstractC166997dE.A0N(this).getStringArray(R.array.comments_sorting_options);
            C14360o3.A07(stringArray);
            int length = stringArray.length;
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            while (i < length) {
                C35124FeR.A00(String.valueOf(i2), stringArray[i], arrayList);
                i++;
                i2++;
            }
            List A0a = AbstractC001800i.A0a(arrayList);
            String str3 = "-1";
            switch (this.A02.intValue()) {
                case 0:
                    str3 = "0";
                    A1I.add(new C34960Fak(new WP4(this, 1), str3, A0a));
                    c34960Fak = new FMT(new WNO(this, 37), AbstractC166997dE.A0p(requireContext(), 2131953000), null, -1);
                    break;
                case 1:
                    str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    A1I.add(new C34960Fak(new WP4(this, 1), str3, A0a));
                    c34960Fak = new FMT(new WNO(this, 37), AbstractC166997dE.A0p(requireContext(), 2131953000), null, -1);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    A1I.add(new C34960Fak(new WP4(this, 1), str3, A0a));
                    c34960Fak = new FMT(new WNO(this, 37), AbstractC166997dE.A0p(requireContext(), 2131953000), null, -1);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
        A1I.add(c34960Fak);
        setBottomSheetMenuItems(C0eM.A1J(A1I));
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
