package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.List;

/* renamed from: X.9L8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9L8 {
    public static final MediaUploadMetadata A02(AbstractC12990ll abstractC12990ll, String str) {
        if (str == null || !AbstractC002300n.A0h(str, "OCULUS_ATTRIBUTION_ID:", false) || !AbstractC001900j.A0U(str, '-')) {
            return null;
        }
        List A0m = AbstractC167007dF.A0m(new C11L("^OCULUS_ATTRIBUTION_ID:").A01(str, ""), "-", 0);
        String str2 = (String) AbstractC001800i.A0O(A0m, 0);
        return new MediaUploadMetadata(null, C18U.A04(C06090Tz.A05, abstractC12990ll, 36882653697868236L), (String) AbstractC001800i.A0O(A0m, 1), null, null, str2, null, null, null, null, (String) AbstractC001800i.A0O(A0m, 2), false);
    }

    public static final MediaUploadMetadata A01(Intent intent, AbstractC12990ll abstractC12990ll) {
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36316645728653898L)) {
            return A02(abstractC12990ll, intent.getStringExtra("media_info"));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0bW, java.lang.Object] */
    public static final MediaUploadMetadata A00(Context context, android.net.Uri uri, UserSession userSession, String str) {
        String A00;
        AbstractC167017dG.A1N(str, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316645728653898L)) {
            if (C18U.A06(c06090Tz, userSession, 36316645728850509L)) {
                A00 = AbstractC209219Nd.A00(context, uri);
            } else {
                android.net.Uri A002 = AbstractC08820cl.A00(new Object(), str);
                if (A002 != null) {
                    A00 = C9NG.A00(A002);
                } else {
                    return null;
                }
            }
            return A02(userSession, A00);
        }
        return null;
    }

    public static final MediaUploadMetadata A03(UserSession userSession, String str) {
        String str2;
        AbstractC167017dG.A1N(str, userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36316645728653898L)) {
            android.net.Uri uri = C197098ne.A00;
            try {
                str2 = new C60782q2(str).A0N("ImageDescription");
                if (str2 == null) {
                    str2 = "";
                }
            } catch (IOException e) {
                C0K8.A0F("ImageManager", "cannot read exif", e);
                str2 = "";
            }
            return A02(userSession, str2);
        }
        return null;
    }
}
