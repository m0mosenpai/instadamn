package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.EMs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32346EMs extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectNotificationMessagesUserControllerFragment";
    public C32420EPv A00;
    public C34631FNo A01;
    public C34415FFf A02;
    public InterfaceC37169GZg A03;
    public E70 A04;
    public InterfaceC83733oI A05;
    public String A06;
    public String A07;
    public RecyclerView A08;
    public Capabilities A09;
    public final C41761wQ A0B = AbstractC31173DnH.A0S();
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final String A0C = "direct_recurring_notifications";

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
        this.A08 = (RecyclerView) view.findViewById(R.id.notification_messages_bottom_sheeet);
        C32420EPv c32420EPv = new C32420EPv(requireContext());
        this.A00 = c32420EPv;
        RecyclerView recyclerView = this.A08;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(c32420EPv);
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                AbstractC31177DnL.A0s(getContext(), recyclerView2);
                C41761wQ c41761wQ = this.A0B;
                InterfaceC37169GZg interfaceC37169GZg = this.A03;
                if (interfaceC37169GZg != null) {
                    GKK.A00(interfaceC37169GZg.BOE().APK(), c41761wQ, this, 3);
                    InterfaceC37169GZg interfaceC37169GZg2 = this.A03;
                    if (interfaceC37169GZg2 != null) {
                        InterfaceC37279GbW.A00(interfaceC37169GZg2);
                        return;
                    }
                }
                str = "clientInfra";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.1jJ, X.1OW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C32346EMs r13, java.lang.Integer r14, java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32346EMs.A00(X.EMs, java.lang.Integer, java.lang.Integer):void");
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
        return this.A0C;
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
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1618190805);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC153636vY.A01(requireArguments, "DirectFragment.DIRECT_FRAGMENT_USER_ACTION_TYPE");
        this.A06 = AbstractC153636vY.A01(requireArguments, "DirectFragment.DIRECT_FRAGMENT_TOKEN_ENT_ID");
        this.A09 = (Capabilities) AbstractC153636vY.A00(requireArguments, Capabilities.class, "DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            this.A05 = A00;
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(this.A0A);
            InterfaceC83733oI interfaceC83733oI = this.A05;
            if (interfaceC83733oI == null) {
                str = "threadId";
            } else {
                Capabilities capabilities = this.A09;
                if (capabilities == null) {
                    str = "threadCapabilities";
                } else {
                    InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, capabilities, interfaceC83733oI);
                    this.A03 = A01;
                    if (A01 == null) {
                        str = "clientInfra";
                    } else {
                        InterfaceC37279GbW.A01(A01);
                        C0f9.A09(1321810711, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A14 = AbstractC166987dD.A14("threadId can't be null");
        C0f9.A09(-2053759111, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2076381165);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_notification_message_bottom_sheet, false);
        C0f9.A09(-1390177779, A02);
        return A0R;
    }
}
