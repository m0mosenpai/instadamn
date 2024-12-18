package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes11.dex */
public final class V1J extends AbstractC59962oe implements C51D {
    public static final WCt A03 = new Object();
    public static final String __redex_internal_original_name = "DisappearingMessagesBottomSheetNux";
    public C69384VmU A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A02 = "direct_disappearing_messages_nux";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
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

    private final void A00(IgTextView igTextView, int i) {
        String A0v = AbstractC25227BEk.A0v(this, 2131965065);
        android.net.Uri A032 = AbstractC08820cl.A03(getString(2131963892));
        C14360o3.A07(A032);
        AnonymousClass773.A01(A032, igTextView, A0v, AbstractC31174DnI.A0w(this, A0v, i));
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r5 != false) goto L33;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1J.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-621505048);
        super.onResume();
        C69384VmU c69384VmU = this.A00;
        if (c69384VmU != null) {
            InterfaceC09390do interfaceC09390do = this.A01;
            long A00 = WCt.A00((UserSession) interfaceC09390do.getValue());
            long j = c69384VmU.A00;
            if (A00 < j) {
                AbstractC25230BEn.A0l(interfaceC09390do).A0e(j);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
                String str2 = c69384VmU.A05;
                Long l = c69384VmU.A02;
                Long l2 = c69384VmU.A03;
                String str3 = c69384VmU.A04;
                Integer num = c69384VmU.A01;
                boolean z = c69384VmU.A06;
                C14360o3.A0B(abstractC12990ll, 0);
                switch (num.intValue()) {
                    case 1:
                        str = "after_seen";
                        break;
                    case 2:
                        str = "upgrade_e2ee";
                        break;
                    default:
                        str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                        break;
                }
                boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
                EnumC33469Er4 enumC33469Er4 = null;
                if (l2 == null || !A0W.A00(Boolean.valueOf(A1X), l2)) {
                    l2 = null;
                }
                C18920wW A022 = AbstractC12220kQ.A02(abstractC12990ll);
                InterfaceC02590Ai A002 = A022.A00(A022.A00, "direct_disappearing_messages_nux_impression");
                A002.AAP("open_thread_id", str2);
                A002.AAP(AbstractC111324zv.A00(2810), str);
                A002.A7v("e2ee_attribution_enabled", Boolean.valueOf(z));
                A002.A9K(AbstractC111324zv.A00(918), l);
                A002.A9K(AbstractC111324zv.A00(722), l2);
                if (str3 != null) {
                    enumC33469Er4 = C35138Fef.A00(str3);
                }
                A002.A8R(enumC33469Er4, TraceFieldType.TransportType);
                A002.Cht();
            }
        }
        C0f9.A09(-370116033, A02);
    }
}
