package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Nvm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54088Nvm {
    public static final ImmutableMap A00(Throwable th) {
        Throwable cause;
        if (th == null) {
            return null;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, MSY.A0h(th));
        Object obj = AbstractC63327Shb.A00;
        builder.put("trace", AbstractC50522MSa.A0m(th));
        String message = th.getMessage();
        if (message != null) {
            builder.put(DialogModule.KEY_MESSAGE, message);
        }
        try {
            cause = AbstractC63327Shb.A00(th);
        } catch (IllegalArgumentException unused) {
            cause = th.getCause();
        }
        if (cause != null && cause != th) {
            builder.put("cause_type", MSY.A0h(cause));
            String message2 = cause.getMessage();
            if (message2 != null) {
                builder.put("cause_message", message2);
            }
        }
        return builder.buildOrThrow();
    }
}
