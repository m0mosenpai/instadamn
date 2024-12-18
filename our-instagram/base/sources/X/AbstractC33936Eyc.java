package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.user.model.User;

/* renamed from: X.Eyc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33936Eyc {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        User user;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        C14360o3.A0C(c6fw.A02(), "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        if (A0F != null) {
            String A0E = A0F.A0E();
            String A0J = A0F.A0J();
            C34396FEm c34396FEm = (C34396FEm) C102884kP.A00(A0F, 40);
            String A0H = A0F.A0H();
            String A0K = A0F.A0K();
            if (c34396FEm != null && (user = c34396FEm.A00) != null && A0J != null && A0E != null) {
                FundraiserSharedToLive fundraiserSharedToLive = new FundraiserSharedToLive(user, A0E, A0J, A0H, A0K);
                FragmentActivity A04 = C6BQ.A04(c6fq);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable(AbstractC111324zv.A00(16), C82R.A00(C81S.A00, new C81W[0]));
                A0b.putSerializable("camera_entry_point", C22P.A2t);
                A0b.putParcelable(AbstractC111324zv.A00(3128), fundraiserSharedToLive);
                AbstractC31176DnK.A0w(A04, A0b, C6BQ.A0B(c6fq), AbstractC111324zv.A00(31));
            }
        }
        return null;
    }
}
