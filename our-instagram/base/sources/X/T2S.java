package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T2S implements InterfaceC65619ToA {
    public final String A00;
    public final int A01;
    public final int A02;
    public final String A03;

    @Override // X.InterfaceC65619ToA
    public final int AtZ() {
        return this.A01;
    }

    @Override // X.InterfaceC65619ToA
    public final int Atd() {
        return this.A02;
    }

    @Override // X.InterfaceC65619ToA
    public final String getDescription() {
        return this.A03;
    }

    @Override // X.InterfaceC65619ToA
    public final String getText() {
        return this.A00;
    }

    public T2S(Context context) {
        String string;
        String string2;
        String string3 = context != null ? context.getString(R.string.res_0x7f13007d_name_removed) : null;
        String str = "";
        string3 = string3 == null ? "" : string3;
        String A0T = AnonymousClass001.A0T(string3, (context == null || (string2 = context.getString(R.string.res_0x7f13007c_name_removed)) == null) ? "" : string2, ' ');
        C14360o3.A07(A0T);
        this.A00 = A0T;
        this.A01 = string3.length();
        this.A02 = A0T.length();
        if (context != null && (string = context.getString(R.string.res_0x7f13007e_name_removed)) != null) {
            str = string;
        }
        this.A03 = str;
    }
}
