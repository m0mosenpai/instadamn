package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.DzA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31843DzA extends AbstractC52922bZ implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AvatarCoinFlipNuxBottomSheetViewModel";
    public final C25531Mh A00;
    public final C12210kP A01;
    public final String A02;

    public final void A00(String str, Integer num, String str2) {
        String str3;
        C25531Mh c25531Mh = this.A00;
        c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_edit_profile");
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        str3 = AbstractC111324zv.A00(2295);
                    } else {
                        str3 = "hide_from_profile_click";
                    }
                } else {
                    str3 = "dismiss_click";
                }
            } else {
                str3 = "turn_on_click";
            }
        } else {
            str3 = "impression";
        }
        ((AbstractC02600Aj) c25531Mh).A00.A9M("extra_client_data", AbstractC25232BEp.A1F("editor_surface", str2, AbstractC166987dD.A1L(AbstractC111324zv.A00(164), str3), AbstractC166987dD.A1L("surface", str)));
        c25531Mh.Cht();
    }

    public /* synthetic */ C31843DzA(UserSession userSession, String str) {
        C12210kP A0P = AbstractC31177DnL.A0P(userSession);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0P.A00(), "coin_flip_nux_bottom_sheet_action"), StringTreeSet.MAX_SYMBOL_COUNT);
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A01 = A0P;
        this.A00 = A0A;
        A0P.A00 = this;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }
}
