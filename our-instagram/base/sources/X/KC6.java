package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig;

/* loaded from: classes8.dex */
public final class KC6 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "FriendMapFloatyClusterFragment";
    public CardView A00;
    public RecyclerView A01;
    public C66362zD A02;
    public IgTextView A03;
    public FriendMapAnimatedLikeView A04;
    public C47694L4b A05;
    public ConstraintLayout A06;
    public C57112jm A07;
    public M9u A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0G;
    public final String A0H;

    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KC6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0H;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig = (FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig) this.A0D.getValue();
        if (friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig != null) {
            friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig.A04.invoke();
            return false;
        }
        return false;
    }

    public KC6() {
        C0YZ A1D = AbstractC25225BEi.A1D(C45999KXn.class);
        this.A0C = AbstractC25225BEi.A0a(C50248MHd.A01(this, 9), C50248MHd.A01(this, 10), new ME1(33, null, this), A1D);
        C50248MHd A01 = C50248MHd.A01(this, 14);
        C50248MHd A012 = C50248MHd.A01(this, 11);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, C50248MHd.A01(A012, 12));
        this.A0G = AbstractC25225BEi.A0a(C50248MHd.A01(A00, 13), A01, new ME1(34, null, A00), AbstractC25225BEi.A1D(C45993KXh.class));
        this.A0D = C50248MHd.A00(this, 7);
        this.A09 = C50248MHd.A00(this, 4);
        this.A0A = C50248MHd.A00(this, 5);
        this.A0B = AbstractC09440dt.A00(enumC09460dv, C50248MHd.A01(this, 6));
        this.A0E = C50248MHd.A00(this, 8);
        this.A0H = "friend_map_cluster_bottom_sheet_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1088171033);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.friend_map_cluster_bottom_sheet, false);
        C0f9.A09(663406987, A02);
        return A0R;
    }
}
