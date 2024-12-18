package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class KD9 extends AbstractC59962oe implements InterfaceC189488aT, C51D {
    public static final String __redex_internal_original_name = "CommentStickerTabPickerFragment";
    public IgdsInlineSearchBox A00;
    public MSU A01;
    public C47781L8h A02;
    public String A03;
    public ViewGroup A04;
    public boolean A05;
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new D89(this, 37), new D89(this, 38), new D8L(37, null, this), AbstractC25225BEi.A1D(C167377dr.class));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new D89(this, 36));
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    public final void A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        InterfaceC19610xo ARD = AbstractC31174DnI.A0g(C1AT.A01(userSession), C1AV.A0s, this).ARD();
        ARD.E7K("comments_sticker_tray_last_used_tab", str);
        ARD.apply();
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        this.A05 = false;
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        this.A05 = true;
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            viewGroup.setTranslationY(0.0f);
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comment_sticker_picker_tab_fragment";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r1 != null) goto L22;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r7 = 0
            X.C14360o3.A0B(r9, r7)
            super.onViewCreated(r9, r10)
            r0 = 2131442478(0x7f0b3b2e, float:1.8506997E38)
            android.view.ViewGroup r0 = X.AbstractC31173DnH.A0F(r9, r0)
            r8.A04 = r0
            r0 = 2131440847(0x7f0b34cf, float:1.8503689E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r0
            r8.A00 = r0
            android.view.ViewGroup r3 = r8.A04
            if (r3 == 0) goto L31
            X.0do r0 = r8.A07
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r0)
            X.LwX r1 = new X.LwX
            r1.<init>(r8)
            X.L8h r0 = new X.L8h
            r0.<init>(r3, r2, r1)
            r8.A02 = r0
        L31:
            r0 = 1
            X.M8T r2 = new X.M8T
            r2.<init>(r8, r0)
            java.lang.String r4 = "gif_tab"
            r1 = 2131238383(0x7f081def, float:1.8093043E38)
            r0 = 2131956505(0x7f131319, float:1.9549568E38)
            X.LwW r6 = new X.LwW
            r6.<init>(r4, r2, r1, r0)
            X.0do r0 = r8.A07
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322409573263579(0x810b0a000028db, double:3.033776300511151E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5 = 2131237999(0x7f081c6f, float:1.8092264E38)
            if (r0 == 0) goto L5d
            r5 = 2131238000(0x7f081c70, float:1.8092266E38)
        L5d:
            X.M8T r1 = new X.M8T
            r1.<init>(r8, r7)
            java.lang.String r2 = "avatar_tab"
            r0 = 2131956499(0x7f131313, float:1.9549555E38)
            X.LwW r3 = new X.LwW
            r3.<init>(r2, r1, r5, r0)
            X.0do r0 = r8.A06
            java.lang.Object r1 = r0.getValue()
            X.0xq r1 = (X.InterfaceC19630xq) r1
            java.lang.String r0 = "comments_sticker_tray_last_used_tab"
            java.lang.String r0 = r1.getString(r0, r2)
            boolean r0 = X.C14360o3.A0K(r0, r2)
            r2 = r6
            if (r0 == 0) goto L82
            r2 = r3
        L82:
            r8.A01 = r2
            X.L8h r1 = r8.A02
            if (r1 == 0) goto L93
            X.MSU[] r0 = new X.MSU[]{r3, r6}
            java.util.ArrayList r0 = X.AbstractC16960so.A1M(r0)
            r1.A01(r2, r0)
        L93:
            X.L8h r1 = r8.A02
            if (r1 == 0) goto La1
            X.0h2 r0 = r8.getChildFragmentManager()
            X.C14360o3.A07(r0)
            r1.A00(r0, r2)
        La1:
            java.lang.String r0 = r2.A02
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lbe
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r8.A00
            if (r1 == 0) goto Lb1
            r0 = 0
        Lae:
            r1.setVisibility(r0)
        Lb1:
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = r8.A00
            if (r2 == 0) goto Lbd
            r1 = 2
            X.Lty r0 = new X.Lty
            r0.<init>(r8, r1)
            r2.A02 = r0
        Lbd:
            return
        Lbe:
            r0 = 8
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r8.A00
            if (r1 == 0) goto Lb1
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KD9.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
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
    public final boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        if (!this.A05) {
            AbstractC43594JPz.A17(this.A04, i, i2);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return requireView();
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
        String str;
        int A02 = C0f9.A02(-303178770);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("args_entry_surface_module_name");
        } else {
            str = null;
        }
        this.A03 = str;
        C0f9.A09(-628914356, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-930005692);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_sticker_picker, viewGroup, false);
        C0f9.A09(-1536868270, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1375285323);
        MSU msu = this.A01;
        if (msu != null) {
            str = ((C49639LwW) msu).A02;
        } else {
            str = null;
        }
        A00(AbstractC166987dD.A0r(this.A07), str);
        super.onDestroyView();
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(1003078336, A02);
    }
}
