package X;

import com.facebook.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Bnt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26534Bnt extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MidCardClipsClickedAction A04;
    public final InterfaceC31122Dm5 A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC31055Dkv A08;
    public final InterfaceC31075DlH A09;
    public final String A0A;
    public final List A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC16820sZ A0D;
    public final boolean A0E;
    public final int A0F;
    public final C51722Yv A0G;
    public final HashMap A0H;
    public final InterfaceC16820sZ A0I;
    public final C0UO A0J;

    public C26534Bnt(C51722Yv c51722Yv, MidCardClipsClickedAction midCardClipsClickedAction, InterfaceC31122Dm5 interfaceC31122Dm5, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31055Dkv interfaceC31055Dkv, InterfaceC31075DlH interfaceC31075DlH, String str, HashMap hashMap, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, C0UO c0uo, boolean z) {
        AbstractC25233BEq.A0w(1, userSession, interfaceC11380iw, hashMap);
        AbstractC25229BEm.A1O(interfaceC31055Dkv, 7, str);
        this.A07 = userSession;
        this.A09 = interfaceC31075DlH;
        this.A06 = interfaceC11380iw;
        this.A0H = hashMap;
        this.A0J = c0uo;
        this.A0G = c51722Yv;
        this.A08 = interfaceC31055Dkv;
        this.A0E = z;
        this.A04 = midCardClipsClickedAction;
        this.A05 = interfaceC31122Dm5;
        this.A0C = interfaceC16820sZ;
        this.A0I = interfaceC16820sZ2;
        this.A0D = interfaceC16820sZ3;
        this.A0B = list;
        this.A0A = str;
        MidCardLayoutType BTl = interfaceC31075DlH.BTl();
        this.A01 = BTl == MidCardLayoutType.A05 ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : R.dimen.account_discovery_bottom_gap;
        MidCardLayoutType midCardLayoutType = MidCardLayoutType.A04;
        this.A00 = BTl == midCardLayoutType ? R.dimen.abc_button_padding_horizontal_material : R.dimen.account_discovery_bottom_gap;
        this.A02 = BTl == midCardLayoutType ? R.dimen.abc_select_dialog_padding_start_material : R.dimen.abc_dropdownitem_icon_width;
        this.A03 = BTl == midCardLayoutType ? R.dimen.account_discovery_bottom_gap : R.dimen.action_bar_item_spacing_right;
        this.A0F = BTl == midCardLayoutType ? R.dimen.account_discovery_bottom_gap : R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r40) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26534Bnt.A0Y(X.3bS):X.2Vc");
    }
}
