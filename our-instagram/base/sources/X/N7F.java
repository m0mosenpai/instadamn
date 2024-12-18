package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class N7F extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "CrosspostingUpsellBottomSheetFragment";
    public int A00;
    public int A01;
    public C82G A02;
    public C82H A03;
    public UserSession A04;
    public InterfaceC58075Pp0 A05;
    public C54723OFa A06;
    public String A07;
    public String A08;
    public boolean A09;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C82H A0A() {
        C82H c82h = this.A03;
        if (c82h != null) {
            return c82h;
        }
        C14360o3.A0F("variant");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0y();
        throw C00O.createAndThrow();
    }

    public final C54723OFa A0C() {
        C54723OFa c54723OFa = this.A06;
        if (c54723OFa != null) {
            return c54723OFa;
        }
        C14360o3.A0F("contentOverride");
        throw C00O.createAndThrow();
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
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static String A00(Context context, N7F n7f) {
        return C131975xX.A00(n7f.getSession()).A05(context, n7f.getSession());
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
    public void onCreate(Bundle bundle) {
        String string;
        int i;
        boolean z;
        int A02 = C0f9.A02(-365145206);
        super.onCreate(bundle);
        this.A04 = C023409i.A0A.A06(requireArguments());
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("args_entrypoint")) != null) {
            C82G valueOf = C82G.valueOf(string);
            C14360o3.A0B(valueOf, 0);
            this.A02 = valueOf;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                i = bundle3.getInt("args_num_of_views");
            } else {
                i = -1;
            }
            this.A00 = i;
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                z = bundle4.getBoolean("args_is_after_fbc");
            } else {
                z = false;
            }
            this.A09 = z;
            C0f9.A09(1830939840, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-173023513, A02);
        throw A0g;
    }
}
