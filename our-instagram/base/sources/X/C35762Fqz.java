package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: X.Fqz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35762Fqz implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35762Fqz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                ((View) this.A02).setVisibility(AbstractC167007dF.A05(((Boolean) obj).booleanValue() ? 1 : 0));
                return;
            case 1:
                C51758Mth c51758Mth = (C51758Mth) obj;
                C14360o3.A0B(c51758Mth, 0);
                if (!c51758Mth.A01) {
                    return;
                }
                C35004Fbb.A00((FFS) this.A01, (C35004Fbb) this.A02, (List) c51758Mth.A00);
                return;
            case 2:
                FJP fjp = (FJP) obj;
                if (fjp.A01) {
                    C6WQ c6wq = (C6WQ) this.A02;
                    if (!c6wq.isShowing()) {
                        C0fJ.A00(c6wq);
                    }
                    Integer num = fjp.A00;
                    if (num != null) {
                        str = ((Context) this.A01).getString(num.intValue());
                    } else {
                        str = "";
                    }
                    c6wq.A00(str);
                    return;
                }
                AbstractC31171DnF.A1N(this.A02);
                return;
            default:
                List list = (List) obj;
                Bundle bundle = (Bundle) this.A02;
                if (bundle != null) {
                    C14360o3.A0A(list);
                    bundle.putStringArrayList("ig_sso_accounts_array", C35020Fbt.A00(list));
                    return;
                }
                return;
        }
    }
}
