package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOS extends AbstractC43842Ja5 implements C51D, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "HallPassListFragment";
    public View A00;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public InterfaceC37173GZk A04;
    public C69623Aw A05;
    public IgdsButton A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    public final void A0C(HallPassViewModel hallPassViewModel) {
        InterfaceC09390do interfaceC09390do = this.A0F;
        C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
        String str = hallPassViewModel.A04;
        Long A0j = AbstractC25231BEo.A0j(0, str);
        String str2 = hallPassViewModel.A05;
        A01.A1j(A0j, "GROUP_STORY_MEMBERSHIP_VIEW_BUTTON", str2);
        AbstractC35258Fgs.A05(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), str, str2);
        this.A0D = true;
    }

    public final void A0D(HallPassViewModel hallPassViewModel) {
        String str = this.A0B;
        if (str != null) {
            C69623Aw c69623Aw = this.A05;
            if (c69623Aw == null) {
                C14360o3.A0F("hallPassLogger");
                throw C00O.createAndThrow();
            }
            c69623Aw.A00(null, C05F.A15, null, null, null, null, null, hallPassViewModel.A04, hallPassViewModel.A05, str);
        }
        InterfaceC09390do interfaceC09390do = this.A0F;
        C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
        String str2 = hallPassViewModel.A04;
        Long A0j = AbstractC25231BEo.A0j(0, str2);
        String str3 = hallPassViewModel.A05;
        A01.A1j(A0j, "SHARED_LISTS_VIEW_MEMBERS_BUTTON", str3);
        AbstractC35258Fgs.A06(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), str2, str3, false);
        this.A0D = true;
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
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
        return "hall_pass_list";
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C57561PgZ(this, 6));
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0212, code lost:
    
        if (r1.equals(r0) != false) goto L159;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x006f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x038e  */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(EOS eos, String str, boolean z) {
        InterfaceC37173GZk interfaceC37173GZk = eos.A04;
        if (interfaceC37173GZk != null) {
            interfaceC37173GZk.Dlj(str, z);
        }
        eos.A0C = true;
        if (eos.A08) {
            AbstractC31179DnN.A0x(eos);
        }
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        InterfaceC37173GZk interfaceC37173GZk;
        String str = this.A07;
        if (str != null && (interfaceC37173GZk = this.A04) != null) {
            interfaceC37173GZk.DJu(this.A0C, str);
        }
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        if (this.A0A) {
            return AbstractC16960so.A1Q(new C32639EYn(requireContext(), this, this), new C32633EYh(this));
        }
        return AbstractC166987dD.A1J(new C32643EYr(requireContext(), AbstractC166987dD.A0r(this.A0F), this, this.A09));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    public EOS() {
        C57241PbP c57241PbP = new C57241PbP(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57241PbP(new C57241PbP(this, 6), 7));
        this.A0E = AbstractC25225BEi.A0a(new C57241PbP(A00, 8), c57241PbP, new C57251PbZ(4, null, A00), AbstractC25225BEi.A1D(C31821Dyf.class));
        this.A09 = true;
        this.A0F = AbstractC60492pY.A02(this);
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A05(getRecyclerView());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10 != null) goto L11;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 != r0) goto L36
            r0 = 73437(0x11edd, float:1.02907E-40)
            if (r8 != r0) goto L36
            r4 = 0
            if (r10 == 0) goto L4d
            android.os.Bundle r1 = r10.getExtras()
            if (r1 == 0) goto L4d
            java.lang.String r0 = "campfire_id"
            java.lang.String r3 = r1.getString(r0)
        L1a:
            android.os.Bundle r1 = r10.getExtras()
            if (r1 == 0) goto L2a
            r0 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            java.lang.String r4 = r1.getString(r0)
        L2a:
            X.GZk r0 = r7.A04
            if (r0 == 0) goto L37
            r0 = 1
            r7.A08 = r0
            if (r3 == 0) goto L36
            A00(r7, r3, r0)
        L36:
            return
        L37:
            if (r3 == 0) goto L36
            if (r4 == 0) goto L36
            X.0do r0 = r7.A0F
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r0)
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.22P r1 = X.C22P.A34
            r5 = 1
            r6 = r5
            X.AbstractC35258Fgs.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        L4d:
            r3 = r4
            if (r10 == 0) goto L2a
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOS.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-374481095);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0F;
        this.A0A = C18U.A06(C06090Tz.A06, AbstractC31178DnM.A0M(interfaceC09390do), 36320279270269174L);
        this.A05 = new C69623Aw(this, AbstractC166987dD.A0r(interfaceC09390do));
        C0f9.A09(1980067921, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-30463006);
        super.onResume();
        if (this.A0D) {
            this.A0D = false;
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0E);
            String str = this.A07;
            AbstractC166987dD.A1Z(new PYc(A0Z, str, null, 48), AbstractC141776au.A00(A0Z));
        }
        C0f9.A09(1265569648, A02);
    }
}
