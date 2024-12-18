package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KCZ extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "DirectPollMessageDetailsFragment";
    public int A00;
    public int A01;
    public AbstractC10360h2 A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final C06N A07 = new JZQ(this, 1);
    public final String A08 = "direct_poll_message_details";
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        if (fragment instanceof KC1) {
            ((KC1) fragment).A03 = new C47358Kw7(this);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A06);
        String str2 = this.A03;
        if (str2 == null) {
            str = "threadId";
        } else {
            DirectThreadKey A0f = AbstractC43593JPy.A0f(str2);
            String str3 = this.A04;
            if (str3 == null) {
                str = "pollId";
            } else {
                boolean z = this.A05;
                C14360o3.A0B(A0o, 0);
                KC1 kc1 = new KC1();
                Bundle A0D = AbstractC31174DnI.A0D(A0o);
                A0D.putString("DirectPollMessageVotingFragment_poll_id", str3);
                A0D.putParcelable("DirectPollMessageVotingFragment_thread_key", A0f);
                A0D.putBoolean("DirectPollMessageVotingFragment_is_msys", z);
                kc1.setArguments(A0D);
                AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                this.A02 = childFragmentManager;
                if (childFragmentManager != null) {
                    C14240no c14240no = new C14240no(childFragmentManager);
                    c14240no.A0A(kc1, R.id.fragment_container);
                    c14240no.A0K();
                    AbstractC10360h2 abstractC10360h2 = this.A02;
                    if (abstractC10360h2 != null) {
                        abstractC10360h2.A0r(this.A07);
                        return;
                    }
                }
                C14360o3.A0F("childFragMan");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
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
        AbstractC10360h2 abstractC10360h2 = this.A02;
        if (abstractC10360h2 == null) {
            C14360o3.A0F("childFragMan");
            throw C00O.createAndThrow();
        }
        InterfaceC08430c6 A0O = abstractC10360h2.A0O(R.id.fragment_container);
        if (A0O instanceof InterfaceC50461MPp) {
            return ((InterfaceC50461MPp) A0O).isScrolledToTop();
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC10360h2 abstractC10360h2 = this.A02;
        if (abstractC10360h2 == null) {
            C14360o3.A0F("childFragMan");
            throw C00O.createAndThrow();
        }
        if (abstractC10360h2.A0L() > 0) {
            abstractC10360h2.A0b();
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        if (!this.mRemoving) {
            AbstractC10360h2 abstractC10360h2 = this.A02;
            if (abstractC10360h2 == null) {
                C14360o3.A0F("childFragMan");
                throw C00O.createAndThrow();
            }
            InterfaceC08430c6 A0O = abstractC10360h2.A0O(R.id.fragment_container);
            if (A0O instanceof InterfaceC50461MPp) {
                ((InterfaceC50461MPp) A0O).onBottomSheetPositionChanged(i, i2);
            }
        }
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1067927769);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("DirectPollMessageDetailsFragment_thread_key");
        if (string != null) {
            this.A03 = string;
            this.A04 = AbstractC31172DnG.A13(requireArguments, "DirectPollMessageDetailsFragment_poll_id");
            this.A05 = requireArguments.getBoolean("DirectPollMessageDetailsFragment_is_msys", false);
            C0f9.A09(290792754, A02);
            return;
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12("thread key can't be null");
        C0f9.A09(-2008749432, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(412469802);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_details, viewGroup, false);
        C0f9.A09(-1172696635, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1680359230);
        super.onDestroyView();
        AbstractC10360h2 abstractC10360h2 = this.A02;
        if (abstractC10360h2 == null) {
            C14360o3.A0F("childFragMan");
            throw C00O.createAndThrow();
        }
        abstractC10360h2.A0F.remove(this.A07);
        C0f9.A09(1157380762, A02);
    }
}
