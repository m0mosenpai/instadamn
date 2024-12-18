package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class HGK extends C1P1 {
    public final /* synthetic */ C670630x A00;

    public HGK(C670630x c670630x) {
        this.A00 = c670630x;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 722274530);
        SystemClock.elapsedRealtime();
        C0f9.A0A(-750048627, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1131938887);
        this.A00.A00.A00.A08 = C05F.A00;
        C0f9.A0A(1813754337, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(759331999);
        SystemClock.elapsedRealtime();
        C0f9.A0A(151009884, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C32Y c32y;
        HashMap hashMap;
        String str2;
        int A03 = C0f9.A03(-210846590);
        H9D h9d = (H9D) obj;
        int A0N = AbstractC167017dG.A0N(h9d, 1708147893);
        C670530w c670530w = this.A00.A00;
        SystemClock.elapsedRealtime();
        C38608GyB c38608GyB = h9d.A01;
        if (c38608GyB != null) {
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO != null && (hashMap = c38621GyO.A03) != null) {
                C670330u c670330u = c670530w.A00;
                Boolean bool = c670330u.A07;
                if (bool == null || (str2 = bool.toString()) == null) {
                    str2 = "";
                }
                hashMap.put("is_iaa_eligible", str2);
                hashMap.put("ads_category", c670330u.A0A);
            }
            C670330u c670330u2 = c670530w.A00;
            InterfaceC670130s interfaceC670130s = c670330u2.A06;
            if (interfaceC670130s instanceof C32Y) {
                c32y = (C32Y) interfaceC670130s;
            } else {
                c32y = null;
            }
            str = AbstractC111324zv.A00(5511);
            if (c32y != null) {
                c32y.A02 = h9d;
                c32y.A00 = c670330u2.A00;
                c32y.A06 = c670330u2.A0B;
                c32y.A03 = c670330u2.A04;
                c32y.A04 = c670330u2.A05;
                Integer num = c670330u2.A09;
                if (num != null) {
                    c32y.A05 = num;
                    c32y.A01 = c670330u2.A02;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C38608GyB c38608GyB2 = h9d.A01;
            if (c38608GyB2 != null) {
                if (c38608GyB2.A02) {
                    C64452w4 c64452w4 = c670330u2.A0F;
                    C38321qM c38321qM = c670330u2.A04;
                    C75113Zb c75113Zb = c670330u2.A05;
                    Integer num2 = c670330u2.A09;
                    if (num2 != null) {
                        if (c38321qM != null && c75113Zb != null) {
                            UserSession userSession = c64452w4.A00;
                            if (C18U.A06(C06090Tz.A06, userSession, 36318934945307427L)) {
                                AbstractC40693I1z.A00(userSession, num2);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c670530w.DnX(C05F.A00, AbstractC166987dD.A1E());
                C0f9.A0A(1050644881, A0N);
                C0f9.A0A(-261803409, A03);
                return;
            }
        }
        str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
