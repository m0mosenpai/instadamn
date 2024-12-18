package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.S3t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62248S3t {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.S3k] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Context context;
        IgFragmentActivity igFragmentActivity;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 3);
        Object A03 = c6fw.A03(4);
        C14360o3.A0C(A03, AbstractC111324zv.A00(12));
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : (List) A03) {
            if ((obj instanceof String) && obj != null) {
                A1E.add(obj);
            }
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 5);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 6);
        if (context == null) {
            return null;
        }
        ?? obj2 = new Object();
        AbstractC167017dG.A1R(str, A0o);
        Intent A08 = MSW.A08(context, IGACPSecurityKeySignInActivity.class);
        A08.putExtra("extra_challenge", str);
        A08.putExtra("extra_rpid", A0o);
        A08.putStringArrayListExtra("extra_allow_credentials", AbstractC166987dD.A1F(A1E));
        if ((context instanceof IgFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) context) != null) {
            igFragmentActivity.registerOnActivityResultListener(new C64476TFm(obj2, c6fq, A0I, A0I2));
            C12260kU.A08(igFragmentActivity, A08, 42625);
        }
        return null;
    }
}
