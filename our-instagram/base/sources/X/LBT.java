package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public abstract class LBT {
    public static final void A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, C128175qm c128175qm, C47Z c47z, String str, List list, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        C14360o3.A0B(c47z, 3);
        AbstractC167017dG.A1T(list, c128175qm);
        C19K A17 = AbstractC43593JPy.A17(C12L.A00, 653905865, 3);
        if (z) {
            c47z.A0W(new C49542Luv(context, fragmentActivity, userSession, c128175qm, c47z, str, list, A17, z2));
        } else {
            AbstractC166987dD.A1Z(new ClipsDirectSendHelper$sendVideoToDirect$2(context, fragmentActivity, userSession, c128175qm, c47z, null, str, list, null, false, z2), A17);
        }
    }

    public static final void A00(Activity activity, Context context, UserSession userSession, C128175qm c128175qm, C47Z c47z, String str, String str2, String str3, List list, boolean z, boolean z2) {
        C26069Bfx c26069Bfx;
        String str4;
        String lowerCase;
        String str5;
        String str6;
        AbstractC172157lk abstractC172157lk;
        String typeName;
        File A11 = AbstractC166987dD.A11(str);
        ClipInfo clipInfo = c47z.A1N;
        ClipInfo A02 = MY3.A02(userSession, A11, clipInfo.A05 - clipInfo.A07);
        String str7 = null;
        if (z2) {
            String str8 = c128175qm.A0T;
            AudioOverlayTrack audioOverlayTrack = c128175qm.A0N;
            if (audioOverlayTrack != null) {
                str7 = audioOverlayTrack.A0B;
            }
            c26069Bfx = new C26069Bfx(str8, "share_to_direct", str3, str7, 9);
        } else {
            c26069Bfx = null;
        }
        if (!z2) {
            str4 = "";
        } else {
            str4 = "reels_share_to_direct_share_sheet";
        }
        C9JS c9js = c128175qm.A0E;
        if (c9js != null && (abstractC172157lk = c9js.A04) != null && (typeName = abstractC172157lk.getTypeName()) != null) {
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            lowerCase = typeName.toLowerCase(locale);
        } else {
            Locale locale2 = Locale.getDefault();
            C14360o3.A07(locale2);
            lowerCase = "REMIX".toLowerCase(locale2);
        }
        C14360o3.A07(lowerCase);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (directShareTarget.A01() instanceof InterfaceC2056098k) {
                C9GR.A0B(activity, "thread_target_is_msys");
            } else {
                String str9 = c47z.A33;
                if (str9 == null) {
                    str9 = "";
                }
                if (str2 == null) {
                    if (c9js == null || (str5 = c9js.A09) == null) {
                        str5 = "";
                    }
                } else {
                    str5 = str2;
                }
                C14360o3.A0B(userSession, 0);
                AbstractC167007dF.A1D(context, 1, A02);
                C7TL A00 = C7TL.A00(userSession);
                if (c26069Bfx != null) {
                    str6 = c26069Bfx.A02;
                } else {
                    str6 = null;
                }
                A00.EOi(context, c26069Bfx, null, directShareTarget, A02, null, null, str9, str6, str4, str5, lowerCase, null, false, true, z);
            }
        }
    }
}
