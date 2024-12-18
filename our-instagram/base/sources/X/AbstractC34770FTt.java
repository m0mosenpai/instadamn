package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FTt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34770FTt {
    public static Intent A01(Context context, String str, String str2, String str3, String str4, String str5, List list) {
        Uri.Builder authority = new Uri.Builder().scheme("ig").authority("direct_v2");
        if (str2 != null) {
            authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        if (list != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0S = AbstractC167007dF.A0S(stringWriter);
                C16V.A03(A0S, "recipients");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PendingRecipient A0p = AbstractC31172DnG.A0p(it);
                    if (A0p != null) {
                        C7NT.A00(A0S, A0p);
                    }
                }
                A0S.A0Z();
                authority.appendQueryParameter("recipients", AbstractC167017dG.A0l(A0S, stringWriter));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (str5 != null) {
            authority.appendQueryParameter("t", str5);
        }
        if (str3 != null) {
            authority.appendQueryParameter("x", str3);
        }
        if (!TextUtils.isEmpty(null)) {
            authority.appendQueryParameter(AbstractC111324zv.A00(2899), null);
        }
        android.net.Uri build = authority.build();
        C14H A00 = C14H.A00();
        C14360o3.A0B(context, 0);
        Intent A03 = A00.A03(context, 335544320);
        AbstractC34771FTu.A01(context, A03, build, str, str4);
        return A03;
    }

    public static Intent A00(Context context, String str, String str2, String str3, int i) {
        C14H A00 = C14H.A00();
        C14360o3.A0B(context, 0);
        Intent A03 = A00.A03(context, i);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ig").authority(str2).appendQueryParameter("filter_type", str);
        if (str3 != null) {
            appendQueryParameter.appendQueryParameter("DIRECT_SOURCE_MODULE_NAME", str3);
        }
        A03.setData(appendQueryParameter.build());
        return A03;
    }
}
