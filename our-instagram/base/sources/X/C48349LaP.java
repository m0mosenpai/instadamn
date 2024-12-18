package X;

import android.text.TextUtils;
import com.facebook.msys.mci.NetworkUtils;

/* renamed from: X.LaP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48349LaP implements C6D2 {
    public final int A00;
    public final String A01;

    public C48349LaP(String str, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = str;
                return;
            default:
                this.A01 = str;
                return;
        }
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (2 - this.A00 != 0) {
            String str = this.A01;
            C14360o3.A0A(str);
            return ((LAI) obj).A07(str);
        }
        String str2 = this.A01;
        if (TextUtils.isEmpty(str2)) {
            NetworkUtils.setSandboxDomain(null);
            return "";
        }
        NetworkUtils.setSandboxDomain(str2);
        return str2;
    }
}
