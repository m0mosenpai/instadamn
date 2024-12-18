package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uvt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67678Uvt extends AbstractC67731Uwy {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    @Override // X.AbstractC67731Uwy, X.SNK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67678Uvt.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }

    @Override // X.SNK
    public final Fragment A00(Bundle bundle, String str) {
        if (!str.equals("home_fragment") && !str.equals("settings_fragment")) {
            return super.A00(bundle, str);
        }
        return A01(bundle, str);
    }

    public C67678Uvt(Context context, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        super(context, interfaceC08830cm);
        this.A01 = userSession;
        this.A00 = context;
    }
}
