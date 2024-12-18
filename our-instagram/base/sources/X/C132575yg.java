package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.5yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132575yg {
    public final Context A00;

    public C132575yg(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    public final String A01(Long l, Long l2, String str, int i, boolean z, boolean z2) {
        String str2;
        C14360o3.A0B(str, 0);
        Uri.Builder path = new Uri.Builder().path(MSV.A00(195));
        if (i == 2) {
            str2 = "did";
        } else {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        Uri.Builder appendQueryParameter = path.appendQueryParameter(str2, str);
        if (l != null) {
            appendQueryParameter.appendQueryParameter("x", l.toString());
        }
        if (z) {
            appendQueryParameter.appendQueryParameter(TraceFieldType.TransportType, EnumC92794Ds.A04.A00);
        }
        if (l2 != null && !z2) {
            appendQueryParameter.appendQueryParameter("mctid", l2.toString());
        }
        String obj = appendQueryParameter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final String A00(UserSession userSession, String str) {
        if (str != null) {
            if (str.length() != 0 && !C0JA.A00().A04()) {
                String string = this.A00.getString(2131964152, C17060sy.A01.A01(userSession).B8y(), str);
                C14360o3.A07(string);
                return string;
            }
            return str;
        }
        return "";
    }

    public C132575yg() {
        this(AbstractC12290kX.A00);
    }
}
