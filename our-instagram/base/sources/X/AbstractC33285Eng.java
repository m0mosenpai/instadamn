package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.Eng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33285Eng extends AbstractC35187Fff {
    public static final void A00(Context context, UserSession userSession, FBUserTag fBUserTag, InterfaceC37183GZu interfaceC37183GZu, Integer num) {
        Integer num2 = C05F.A01;
        if (num != num2) {
            FragmentActivity B8O = interfaceC37183GZu.B8O();
            if (!C35134Feb.A00.A01(context) && B8O != null && C18U.A06(C06090Tz.A05, userSession, 36325347331027981L)) {
                AbstractC34210F7i.A00(B8O, num2, fBUserTag.A02.A02, new C43208J8f(41, context, fBUserTag));
            } else {
                FBUserTag.FBUserInfo fBUserInfo = fBUserTag.A02;
                C35134Feb.A00(context, fBUserInfo.A02, fBUserInfo.A04);
            }
            interfaceC37183GZu.DFQ(fBUserTag);
        }
    }
}
