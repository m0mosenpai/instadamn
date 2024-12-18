package com.instagram.direct.send.mutation.armadilloexpresstransport;

import X.AbstractC13530mf;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.C12L;
import X.C14360o3;
import X.C19L;
import X.C1NC;
import X.C20Y;
import X.C47744L6l;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes8.dex */
public final class ArmadilloExpressStorySender {
    public final Context A00;
    public final C12L A01;
    public final UserSession A02;
    public final C47744L6l A03;
    public final C19L A04;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C44920JuY r16, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender r17, X.C29721bn r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender.A00(X.JuY, com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender, X.1bn, X.1Ds):java.lang.Object");
    }

    public static final String A01(Bitmap bitmap, ArmadilloExpressStorySender armadilloExpressStorySender) {
        Bitmap.CompressFormat compressFormat;
        File A04 = AbstractC13530mf.A04(armadilloExpressStorySender.A00);
        C14360o3.A07(A04);
        A04.deleteOnExit();
        if (Build.VERSION.SDK_INT >= 30) {
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
        } else {
            compressFormat = Bitmap.CompressFormat.WEBP;
        }
        C1NC.A0L(compressFormat, bitmap, A04, 100);
        return AbstractC43592JPx.A0x(A04);
    }

    public /* synthetic */ ArmadilloExpressStorySender(UserSession userSession) {
        C47744L6l c47744L6l = new C47744L6l(C20Y.A00(userSession), userSession);
        this.A02 = userSession;
        this.A03 = c47744L6l;
        C12L c12l = C12L.A00;
        this.A01 = c12l;
        this.A04 = AbstractC43594JPz.A13(c12l, 319);
        this.A00 = AbstractC25225BEi.A0F(userSession);
    }
}
