package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ln1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49075Ln1 implements InterfaceC165867bE {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final InterfaceC1119353f A04;
    public final InterfaceC16820sZ A05;

    public C49075Ln1(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119353f interfaceC1119353f, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1G(fragment, 3, interfaceC1119353f);
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = fragment;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC1119353f;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC165867bE
    public final void CrM(RectF rectF, C22P c22p, CameraConfiguration cameraConfiguration, String str) {
        C14360o3.A0B(c22p, 1);
        C7U0 c7u0 = (C7U0) this.A05.invoke();
        if (c7u0 != null) {
            InterfaceC163837Ux C7r = c7u0.C7r();
            if (!C7r.CeQ()) {
                C0w9.A03("DirectThreadFragment.openExpiringMediaCamera", "mThread is null");
                return;
            }
            UserSession userSession = this.A03;
            DirectShareTarget C7f = C7r.C7f(this.A00);
            C7TT C7W = C7r.C7W();
            C14360o3.A07(C7W);
            Long A00 = AbstractC160897Ix.A00(C7W);
            C02R.A03(C7f, "DirectShareTarget is null");
            C3AY A002 = LKW.A00(Collections.unmodifiableList(C7f.A0Q));
            User A10 = AbstractC166987dD.A10(userSession);
            List unmodifiableList = Collections.unmodifiableList(C7f.A0Q);
            C7f.A0R();
            C3AY A02 = AbstractC81683kd.A02(null, A10, null, unmodifiableList);
            String str2 = C7f.A0I;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC46814Kn9.A00(rectF, this.A01, this.A02, c22p, userSession, null, null, this.A04, new DirectCameraViewModel((ImageUrl) A02.A00, (ImageUrl) A02.A01, C7f, A00, str2, (String) A002.A01, null, 6, !C7f.A0R(), C7NG.A00(C7f.A01), C35143Fek.A00.A01(userSession, C7f), AbstractC166987dD.A1a(A002.A00)), C7r.B90(), AbstractC166997dE.A0a(), AbstractC111324zv.A00(2265), str, null);
        }
    }
}
