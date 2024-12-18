package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.GlE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37859GlE implements C5R5 {
    public static final Integer A02 = C05F.A01;
    public final Integer A00;
    public final String A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        String str2 = this.A01;
        Integer num = A02;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    str = "opal";
                } else {
                    str = null;
                }
            } else {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
        } else {
            str = "fan_club";
        }
        C14360o3.A0B(num, 3);
        C25621Ms A00 = AbstractC37797GkC.A00(userSession);
        AnonymousClass755.A02(A00, userSession, num, str2, null, str, z);
        return A00.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        String str3 = this.A01;
        Integer num = A02;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    str2 = "opal";
                } else {
                    str2 = null;
                }
            } else {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
        } else {
            str2 = "fan_club";
        }
        C14360o3.A0B(num, 3);
        C25621Ms A00 = AbstractC37797GkC.A00(userSession);
        AnonymousClass755.A02(A00, userSession, num, str3, str, str2, false);
        return A00.A0N();
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public C37859GlE(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
