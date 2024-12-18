package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.AHe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23115AHe {
    public static void A01(Activity activity, C22P c22p, UserSession userSession, C1816383s c1816383s) {
        String str = c1816383s.A04;
        if (str == null) {
            str = "";
        }
        AbstractC70197WGf.A05(activity, new ExtendedImageUrl(str, 50, 50), new G0H(1, c22p, activity, c1816383s, userSession), C50472Tr.A01(), activity.getColor(R.color.grey_9), false);
    }

    public static void A00(Activity activity, C22P c22p, UserSession userSession) {
        Bundle A0b = AbstractC166987dD.A0b();
        C88X c88x = new C88X(new C189128Zd(null, C88Z.A0K, null));
        try {
            A0b.putString("create_mode_attribution", ADL.A00(c88x));
            C82R.A01(A0b, c22p);
            C6XJ A02 = C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
            A02.A07();
            A02.A0C(activity);
        } catch (IOException e) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(AbstractC111324zv.A00(635));
            C88Z c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            C0w9.A06(AbstractC111324zv.A00(1258), AbstractC166997dE.A0v(c88z, A1C), e);
        }
    }

    public static void A02(Context context, C22P c22p, UserSession userSession, AlB alB, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(AbstractC111324zv.A00(89), c22p);
        A0b.putBoolean("ReelFundraiserShareConstants.ARGUMENTS_KEY_IS_DUPLICATE_STICKER", z);
        try {
            C189138Ze c189138Ze = alB.A00;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AEH.A00(A0A, c189138Ze, true);
            A0A.close();
            A0b.putString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_MODEL", stringWriter.toString());
            C6XJ.A02((Activity) context, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5190)).A0C(context);
        } catch (IOException unused) {
            C0w9.A03(AbstractC111324zv.A00(670), "Could not json serialize model User for the fundraiser duplicate sticker.");
        }
    }
}
