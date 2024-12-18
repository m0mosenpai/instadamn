package com.instagram.realtimeclient;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C16L;
import X.C16R;
import X.C16V;
import X.C1EH;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* loaded from: classes6.dex */
public final class DirectApiError__JsonHelper {
    public static DirectApiError parseFromJson(C16L c16l) {
        return (DirectApiError) C16V.A01(c16l, new C1EH() { // from class: com.instagram.realtimeclient.DirectApiError__JsonHelper.1
            @Override // X.C1EH
            public DirectApiError invoke(C16L c16l2) {
                return DirectApiError__JsonHelper.unsafeParseFromJson(c16l2);
            }

            @Override // X.C1EH
            public /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                return DirectApiError__JsonHelper.unsafeParseFromJson(c16l2);
            }
        });
    }

    public static boolean processSingleField(DirectApiError directApiError, String str, C16L c16l) {
        if ("error_type".equals(str)) {
            directApiError.errorType = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (DevServerEntity.COLUMN_DESCRIPTION.equals(str)) {
            directApiError.errorDescription = AbstractC167017dG.A0m(c16l);
            return true;
        }
        if (AbstractC31171DnF.A1a(str)) {
            directApiError.errorTitle = AbstractC167017dG.A0m(c16l);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.DirectApiError] */
    public static DirectApiError unsafeParseFromJson(C16L c16l) {
        ?? obj = new Object();
        if (c16l.A11() != C16R.A0D) {
            c16l.A0z();
            return null;
        }
        while (c16l.A1J() != C16R.A09) {
            processSingleField(obj, AbstractC166997dE.A0s(c16l), c16l);
            c16l.A0z();
        }
        return obj;
    }

    public static DirectApiError parseFromJson(String str) {
        return parseFromJson(C16V.A00(str));
    }
}
