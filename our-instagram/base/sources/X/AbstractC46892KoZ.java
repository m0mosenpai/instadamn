package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.KoZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46892KoZ {
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, X.LFc] */
    public static final C116155Nu A00(UserSession userSession, C47714L4v c47714L4v) {
        EnumC117355Su enumC117355Su;
        int i;
        L8n l8n = new L8n(userSession);
        C47932LFc c47932LFc = C47932LFc.A00;
        C47932LFc c47932LFc2 = c47932LFc;
        if (c47932LFc == null) {
            ?? obj = new Object();
            C47932LFc.A00 = obj;
            c47932LFc2 = obj;
        }
        int i2 = c47714L4v.A01.A00;
        String valueOf = String.valueOf(c47714L4v.A00.A00);
        String valueOf2 = String.valueOf(c47714L4v.A04);
        String valueOf3 = String.valueOf(c47714L4v.A05);
        EnumC117355Su[] values = EnumC117355Su.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                enumC117355Su = values[i3];
                if (enumC117355Su.A00 == i2) {
                    break;
                }
                i3++;
            } else {
                enumC117355Su = null;
                break;
            }
        }
        String A00 = AbstractC47081Krc.A00(enumC117355Su);
        EnumC117355Su[] values2 = EnumC117355Su.values();
        int length2 = values2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length2) {
                EnumC117355Su enumC117355Su2 = values2[i4];
                if (enumC117355Su2.A00 == i2) {
                    AbstractC47080Krb abstractC47080Krb = AbstractC47080Krb.$redex_init_class;
                    i = enumC117355Su2.ordinal();
                    break;
                }
                i4++;
            } else {
                i = -1;
                break;
            }
        }
        String str = "direct_v2_delete_item";
        if (i == 1 || i == 4) {
            str = "direct_v2_message";
        } else if (i != 2 && i != 3) {
            str = "";
        }
        String str2 = c47714L4v.A02;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", PublicKeyCredentialControllerUtility.JSON_KEY_ID, valueOf, "x", str2);
        C14360o3.A07(formatStrLocaleSafe);
        String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s_%s", valueOf, str2, String.valueOf(i2), valueOf2);
        C14360o3.A07(formatStrLocaleSafe2);
        C116155Nu A002 = l8n.A00(null, null, valueOf3, str, A00, userSession.userId, formatStrLocaleSafe, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, formatStrLocaleSafe2, str2, valueOf2, valueOf, null, true);
        A002.A1U = c47714L4v.A07;
        A002.A1S = c47932LFc2.A00(AnonymousClass001.A0H(str2, '_', i2));
        return A002;
    }
}
