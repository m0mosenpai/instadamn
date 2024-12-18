package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class TEh implements InterfaceC65448TkK {
    public final /* synthetic */ Rd3 A00;

    public TEh(Rd3 rd3) {
        this.A00 = rd3;
    }

    @Override // X.InterfaceC65448TkK
    public final Boolean FDK(String str) {
        String string;
        Bundle bundle = this.A00.mArguments;
        if (bundle == null || (string = bundle.getString("completion_path")) == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC001900j.A0a(str, string, false));
    }
}
