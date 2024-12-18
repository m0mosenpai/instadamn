package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.Ewb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33811Ewb {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, A0f);
        String str2 = (String) A032;
        C14360o3.A0B(A04, 0);
        AbstractC167007dF.A1D(str, 1, str2);
        Intent A042 = AbstractC31171DnF.A04();
        Bundle bundle = ActivityOptions.makeCustomAnimation(A04, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle();
        A042.setClassName(A04, "com.instagram.caa.registration.transition.CaaRegTransitionScreenActivity");
        A042.setFlags(67108864);
        A042.putExtra("flow_type", str);
        A042.putExtra("flow_name", str2);
        if (bundle == null) {
            C12260kU.A0C(A04, A042);
        } else {
            C12260kU.A02(A04, A042, bundle);
        }
        A04.finish();
        return null;
    }
}
