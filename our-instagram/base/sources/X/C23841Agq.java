package X;

import android.app.Activity;
import android.util.Pair;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Agq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23841Agq implements InterfaceC25181BCe {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ C198998qz A01;
    public final /* synthetic */ ACA A02;
    public final /* synthetic */ C187028Qv A03;
    public final /* synthetic */ C211689Zc A04;
    public final /* synthetic */ C183978Ee A05;

    @Override // X.InterfaceC25181BCe
    public final void DiH(boolean z, String str) {
    }

    public C23841Agq(C8LZ c8lz, C198998qz c198998qz, ACA aca, C187028Qv c187028Qv, C211689Zc c211689Zc, C183978Ee c183978Ee) {
        this.A00 = c8lz;
        this.A02 = aca;
        this.A05 = c183978Ee;
        this.A03 = c187028Qv;
        this.A01 = c198998qz;
        this.A04 = c211689Zc;
    }

    @Override // X.InterfaceC25181BCe
    public final void DfJ(boolean z, String str) {
        String str2;
        if (z && str != null) {
            C8LZ c8lz = this.A00;
            ACA aca = this.A02;
            C183978Ee c183978Ee = this.A05;
            C187028Qv c187028Qv = this.A03;
            C198998qz c198998qz = this.A01;
            List list = c187028Qv.A0E;
            C8LT c8lt = c8lz.A0U;
            int A02 = AbstractC50677MYv.A02(aca);
            EnumC40111tc enumC40111tc = EnumC40111tc.A0Q;
            int i = c183978Ee.A08;
            String str3 = c183978Ee.A0a;
            String A05 = c183978Ee.A05();
            CameraAREffect cameraAREffect = c198998qz.A01;
            UserSession userSession = c8lz.A0D;
            HashMap A0D = AbstractC50677MYv.A0D(userSession, list);
            AbstractC50677MYv.A09(c187028Qv.A0D);
            C3o9 A022 = C8LZ.A02(c8lz, aca);
            String A0B = AbstractC50677MYv.A0B(c8lz.A0I);
            String str4 = c183978Ee.A0b;
            boolean z2 = true;
            if (!c187028Qv.A00()) {
                z2 = false;
            }
            int A00 = AbstractC50677MYv.A00(c187028Qv.A06);
            Pair A04 = AbstractC50677MYv.A04(list, c187028Qv.A0F);
            MediaTransformation A002 = AHS.A00(c198998qz.A04);
            AHS.A01(c198998qz);
            Integer A042 = c183978Ee.A04();
            c8lt.A02(A04, cameraAREffect, c183978Ee.A01(), A002, A022, enumC40111tc, A042, str3, A05, A0B, str4, null, null, c183978Ee.A0g, c183978Ee.A0e, c183978Ee.A0i, A0N.A00(c183978Ee), A0D, A02, i, A00, z2);
            DirectShareTarget directShareTarget = aca.A00;
            directShareTarget.getClass();
            InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
            interfaceC83713oG.getClass();
            if (interfaceC83713oG instanceof InterfaceC2056098k) {
                Activity activity = c8lz.A0A;
                C211689Zc c211689Zc = this.A04;
                AKC akc = A49.A02;
                AKC.A00(activity, userSession, directShareTarget, c211689Zc, "PhotoViewController_sendPhotoToMsys", str);
                return;
            }
            C36961nt.A00().ENy(null, c183978Ee.A01(), userSession, c8lz.A0P, aca, this.A04, null, null, str, false);
            return;
        }
        Activity activity2 = this.A00.A0A;
        if (str == null) {
            str2 = "render_finished_path_is_null";
        } else {
            str2 = "render_finished_success_is_false";
        }
        C9GR.A0A(activity2, str2);
    }
}
