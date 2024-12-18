package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Nsz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53926Nsz {
    public static final String A00(Context context, UserSession userSession, Integer num) {
        String A0a;
        int i;
        switch (AbstractC43592JPx.A03(num, 2)) {
            case 2:
                i = 2131973735;
                A0a = context.getString(i);
                break;
            case 3:
                i = 2131973743;
                A0a = context.getString(i);
                break;
            case 4:
                i = 2131973740;
                A0a = context.getString(i);
                break;
            case 5:
                i = 2131973736;
                A0a = context.getString(i);
                break;
            case 6:
                i = 2131973742;
                A0a = context.getString(i);
                break;
            case 7:
                i = 2131973745;
                A0a = context.getString(i);
                break;
            case 8:
                i = 2131973744;
                A0a = context.getString(i);
                break;
            case 9:
                i = 2131973741;
                A0a = context.getString(i);
                break;
            case 10:
                i = 2131973739;
                A0a = context.getString(i);
                break;
            case 11:
                i = 2131973746;
                A0a = context.getString(i);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0a = AbstractC31177DnL.A0a(context, AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36605512343164196L), 2131973738);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 2131973737;
                A0a = context.getString(i);
                break;
            default:
                i = 2131973747;
                A0a = context.getString(i);
                break;
        }
        C14360o3.A07(A0a);
        return A0a;
    }
}
