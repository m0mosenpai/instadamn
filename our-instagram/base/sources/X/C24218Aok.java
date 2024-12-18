package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource;
import java.util.List;

/* renamed from: X.Aok, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24218Aok implements BE4 {
    public final List A01 = AbstractC166987dD.A1E();
    public String A00 = "";

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167017dG.A0T("locale", this.A00, AbstractC167007dF.A0o("serviceType", 46));
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        String str;
        LocaleDataSource localeDataSource;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90T.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C90T c90t = (C90T) anonymousClass904.A02(c203848zt);
                if (c90t != null && (localeDataSource = c90t.A00) != null) {
                    str = localeDataSource.getDeviceLocaleIdentifier();
                } else {
                    str = null;
                }
                String valueOf = String.valueOf(str);
                this.A00 = valueOf;
                C14360o3.A0B(valueOf, 0);
                AbstractC167027dH.A14("commandType", C05F.A00, this.A01, AbstractC167007dF.A0o("serviceType", 46), AbstractC166987dD.A1L("locale", valueOf));
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A01;
        if (!list.isEmpty()) {
            List A0a = AbstractC001800i.A0a(list);
            list.clear();
            return A0a;
        }
        return null;
    }
}
