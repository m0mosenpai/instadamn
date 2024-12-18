package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import java.util.List;

/* loaded from: classes8.dex */
public final class LI1 {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final C23031Ai A03;

    public static final void A00(LI1 li1) {
        UserSession userSession = li1.A02;
        Context context = li1.A01;
        String A0p = AbstractC166997dE.A0p(context, 2131965855);
        IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_info_pano_outline_24);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        List A1R = AbstractC16960so.A1R(new InfoItem(simpleIconConfig, valueOf, A0p, null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_shield_pano_outline_24), valueOf, AbstractC166997dE.A0p(context, 2131965857), null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_photo_pano_outline_24), valueOf, AbstractC166997dE.A0p(context, 2131965856), null));
        String string = context.getString(2131965858);
        C47947LGc c47947LGc = new C47947LGc(userSession, new PrimerBottomSheetConfig(null, null, null, null, null, null, Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), Integer.valueOf(R.style.PrivacyTextStyle), "magic_media_remix_full_access_settings_nux", AbstractC166997dE.A0p(context, 2131963271), "", string, A1R, 2131965859, false, false, false), null, true, true, false);
        c47947LGc.A00 = new ViewOnClickListenerC48062LPn(li1, 34);
        A01(li1, true);
        c47947LGc.A02(context);
        li1.A03.A1T(true);
    }

    public static final void A01(LI1 li1, boolean z) {
        C3DN A01 = AbstractC161537Lo.A01(li1.A01, li1.A02);
        if (A01 != null) {
            ((C3DP) A01).A0n = z;
            A01.A0B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.AbstractC93174Ft.A04(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LI1(com.instagram.common.session.UserSession r3, android.content.Context r4) {
        /*
            r2 = this;
            X.AbstractC167017dG.A1P(r3, r4)
            r2.<init>()
            r2.A02 = r3
            r2.A01 = r4
            X.1Ai r0 = X.AbstractC23021Ah.A00(r3)
            r2.A03 = r0
            android.content.Context r1 = r2.A01
            boolean r0 = X.AbstractC93174Ft.A03(r1)
            if (r0 == 0) goto L1f
            boolean r1 = X.AbstractC93174Ft.A04(r1)
            r0 = 1
            if (r1 == 0) goto L20
        L1f:
            r0 = 0
        L20:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LI1.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }
}
