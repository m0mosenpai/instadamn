package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Je7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44082Je7 implements Callable {
    public final int A00;
    public final Object A01;

    public CallableC44082Je7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Drawable BYp;
        ColorDrawable colorDrawable;
        Drawable BYq;
        MPV mpv;
        switch (this.A00) {
            case 0:
                AbstractC44444JlB abstractC44444JlB = (AbstractC44444JlB) this.A01;
                FragmentActivity activity = abstractC44444JlB.getActivity();
                if (activity == null) {
                    return AbstractC166987dD.A1E();
                }
                Bundle bundle = abstractC44444JlB.mArguments;
                boolean z = true;
                if (bundle == null || !bundle.getBoolean("no_face_tracker")) {
                    z = false;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                MRQ mrq = abstractC44444JlB.A00;
                if (mrq == null) {
                    BYp = new ColorDrawable(0);
                } else if (z) {
                    BYp = null;
                } else {
                    BYp = mrq.BYp(activity);
                }
                if (mrq == null) {
                    colorDrawable = new ColorDrawable(0);
                } else {
                    colorDrawable = null;
                }
                A1E.add(new L2H(BYp, colorDrawable, R.string.res_0x7f1300d3_name_removed, 2131972837));
                if (mrq == null) {
                    BYq = new ColorDrawable(0);
                } else {
                    BYq = mrq.BYq(activity);
                }
                A1E.add(new L2H(BYq, null, R.string.res_0x7f1300d4_name_removed, R.string.res_0x7f1300ce_name_removed));
                return A1E;
            case 1:
                K5S k5s = (K5S) this.A01;
                Bitmap decodeFile = BitmapFactory.decodeFile(k5s.A0U);
                k5s.A06 = decodeFile;
                if (decodeFile == null) {
                    WeakReference weakReference = ((K5U) k5s).A00;
                    if (weakReference == null || (mpv = (MPV) weakReference.get()) == 0) {
                        return null;
                    }
                    Toast.makeText((Context) mpv, 2131972924, 0).show();
                    mpv.DYX();
                    return null;
                }
                C8FY c8fy = new C8FY(AbstractC166997dE.A0N(k5s), decodeFile);
                c8fy.A08.setAntiAlias(true);
                c8fy.invalidateSelf();
                c8fy.A02(decodeFile.getWidth() * 0.024f);
                return c8fy;
            case 2:
                K9Y.A00((K9Y) this.A01);
                break;
            case 3:
                K9Z.A00((K9Z) this.A01);
                break;
            case 4:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                return abstractC12990ll.A01(C65911TwI.class, C50254MHj.A02(abstractC12990ll, 49));
            case 5:
                C83403nh c83403nh = (C83403nh) this.A01;
                if (c83403nh.A10 == C2EY.A1i && c83403nh.A0Q == null && (str = c83403nh.A1q) != null) {
                    List<String> A1J = AbstractC166987dD.A1J(str);
                    EnumC46144Kbi enumC46144Kbi = EnumC46144Kbi.A02;
                    for (String str2 : A1J) {
                        C14360o3.A0B(str2, 0);
                        int length = str2.length();
                        if (length != 0) {
                            if (length > 25) {
                                AbstractC47191KtQ.A00.A00(enumC46144Kbi, str2);
                            }
                            for (String str3 : AbstractC001900j.A0R(str2, new String[]{" "}, 0)) {
                                if (Patterns.WEB_URL.matcher(str3).matches() || Patterns.EMAIL_ADDRESS.matcher(str3).matches()) {
                                    AbstractC47191KtQ.A01.A00(enumC46144Kbi, str3);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                LLI.A02((LLI) this.A01);
                return null;
        }
        return C0eB.A00;
    }
}
