package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.P2a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56389P2a implements InterfaceC85403rV, InterfaceC85423rX {
    public final InterfaceC58279PsX A00;
    public final MediaKitRepository A01;
    public final C51053Mh7 A02;
    public final UserSession A03;

    @Override // X.InterfaceC85423rX
    public final void D40(ClickableSpan clickableSpan, View view, String str) {
        C14360o3.A0B(str, 0);
        A00(this, new P5S(str));
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        A00(this, new P5V(str));
    }

    public static final void A00(C56389P2a c56389P2a, InterfaceC57838Pl4... interfaceC57838Pl4Arr) {
        c56389P2a.A02.A03((InterfaceC57838Pl4[]) Arrays.copyOf(interfaceC57838Pl4Arr, interfaceC57838Pl4Arr.length));
    }

    public final void A01(C51850Mvs c51850Mvs) {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig;
        MediaKitInfoSheetItemModel[] mediaKitInfoSheetItemModelArr;
        String str;
        User user;
        int ordinal = c51850Mvs.A01.ordinal();
        if (ordinal != 2) {
            if (ordinal == 1) {
                AbstractC55033OXz.A01(this.A00, C05F.A0a);
                MediaKitInfoSheetConfig mediaKitInfoSheetConfig2 = MediaKitInfoSheetConfig.A0D;
                C51851Mvt c51851Mvt = (C51851Mvt) this.A02.A0M.getValue();
                if (c51851Mvt != null && (user = c51851Mvt.A01) != null) {
                    str = user.getUsername();
                } else {
                    str = "";
                }
                mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966783);
                mediaKitInfoSheetConfig.A01 = Float.valueOf(0.3f);
                mediaKitInfoSheetConfig.A02 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                MediaKitInfoSheetItemModel mediaKitInfoSheetItemModel = new MediaKitInfoSheetItemModel(null, 2131966723, null);
                mediaKitInfoSheetItemModel.A00 = new Object[]{str};
                mediaKitInfoSheetItemModelArr = new MediaKitInfoSheetItemModel[]{mediaKitInfoSheetItemModel};
            } else {
                return;
            }
        } else {
            AbstractC55033OXz.A01(this.A00, C05F.A0Z);
            MediaKitInfoSheetConfig mediaKitInfoSheetConfig3 = MediaKitInfoSheetConfig.A0D;
            mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966732);
            mediaKitInfoSheetItemModelArr = new MediaKitInfoSheetItemModel[]{new MediaKitInfoSheetItemModel(2131966758, 2131966755, null), new MediaKitInfoSheetItemModel(2131966757, 2131966756, null), new MediaKitInfoSheetItemModel(2131966753, 2131966754, null)};
        }
        AnonymousClass016.A18(mediaKitInfoSheetConfig.A0C, mediaKitInfoSheetItemModelArr);
        A00(this, C56466P5d.A00, new P5X(mediaKitInfoSheetConfig));
    }

    public C56389P2a(UserSession userSession, InterfaceC58279PsX interfaceC58279PsX, MediaKitRepository mediaKitRepository, C51053Mh7 c51053Mh7) {
        this.A02 = c51053Mh7;
        this.A01 = mediaKitRepository;
        this.A03 = userSession;
        this.A00 = interfaceC58279PsX;
    }
}
