package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes11.dex */
public final class Wx5 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ EnumC58132lV A01;
    public final /* synthetic */ V1i A02;
    public final /* synthetic */ String A03;

    public Wx5(View view, EnumC58132lV enumC58132lV, V1i v1i, String str) {
        this.A02 = v1i;
        this.A03 = str;
        this.A00 = view;
        this.A01 = enumC58132lV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            FragmentActivity requireActivity = this.A02.requireActivity();
            String str = this.A03;
            if (str == null) {
                str = "";
            }
            C5SU c5su = new C5SU(requireActivity, new C149686oL(str));
            c5su.A03(this.A00);
            c5su.A06(this.A01);
            c5su.A0A = true;
            AbstractC166997dE.A1P(c5su);
        } catch (Resources.NotFoundException e) {
            C0K8.A0F(V1i.__redex_internal_original_name, "Resource not found", e);
        }
    }
}
