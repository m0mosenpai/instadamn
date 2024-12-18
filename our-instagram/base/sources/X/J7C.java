package X;

import android.content.Context;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J7C extends C03E implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J7C(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L13;
                case 2: goto L13;
                case 3: goto L16;
                case 4: goto L1e;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.Gh3> r3 = X.C37608Gh3.class
        L8:
            r1 = 2
            java.lang.String r4 = "shareReelToFacebook"
            java.lang.String r5 = "shareReelToFacebook(ZZ)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.Ikx> r3 = X.C42090Ikx.class
            goto L8
        L16:
            java.lang.Class<X.Gh9> r3 = X.C37614Gh9.class
            r1 = 2
            java.lang.String r4 = "launchBoost"
            java.lang.String r5 = "launchBoost(Lcom/instagram/clips/model/ClipsItem;Ljava/lang/String;)V"
            goto Ld
        L1e:
            java.lang.Class<X.IdY> r3 = X.C41704IdY.class
            r1 = 2
            java.lang.String r4 = "launchCameraWithPrefilledMedia"
            java.lang.String r5 = "launchCameraWithPrefilledMedia(Lcom/instagram/clips/model/ClipsMidcardDisplayItem;Lcom/facebook/analytics/structuredlogger/enums/InstagramCameraEntryPointTypes;)V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7C.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        List list;
        C111034zF c111034zF;
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
                boolean A1a = AbstractC166987dD.A1a(obj);
                boolean A1a2 = AbstractC166987dD.A1a(obj2);
                C42090Ikx c42090Ikx = (C42090Ikx) this.receiver;
                C200108tF c200108tF = C200108tF.A01;
                UserSession userSession = c42090Ikx.A0A;
                c200108tF.A0C(userSession, "reels", A1a2, true);
                if (A1a) {
                    C79923hh.A00.A0C(c42090Ikx.A04.requireContext(), C79923hh.A00(C82G.A0V, new C42198Imk(0), userSession, c42090Ikx.A0E, C05F.A0C), userSession, A1a2);
                    break;
                }
                break;
            case 3:
                C120985dq c120985dq = (C120985dq) obj;
                String str = (String) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, c120985dq, str);
                C37614Gh9 c37614Gh9 = (C37614Gh9) this.receiver;
                C38661Gz2 A02 = c120985dq.A02();
                if (A02 != null && (list = A02.A0F) != null && (c111034zF = (C111034zF) AbstractC001800i.A0O(list, 0)) != null && (c38321qM = c111034zF.A00) != null) {
                    AbstractC69888VxF.A00().A07(c37614Gh9.A00, null, null, c37614Gh9.A01, c37614Gh9.A02, c38321qM, str, null, A1R);
                    break;
                }
                break;
            case 4:
                C38663Gz4 c38663Gz4 = (C38663Gz4) obj;
                C22P c22p = (C22P) obj2;
                AbstractC167017dG.A1N(c38663Gz4, c22p);
                C41704IdY c41704IdY = (C41704IdY) this.receiver;
                List list2 = c38663Gz4.A0H;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM2 = AbstractC37300Gc1.A0A(it).A02;
                    if (c38321qM2 != null) {
                        A1E.add(c38321qM2);
                    }
                }
                if (c38663Gz4.A05 == InstagramMidcardType.A0c) {
                    C41704IdY.A01(c22p, null, c41704IdY, null, A1E);
                    break;
                } else {
                    String str2 = c38663Gz4.A0C;
                    if (str2 != null) {
                        C41704IdY.A01(c22p, c38663Gz4.A0A, c41704IdY, str2, A1E);
                        break;
                    }
                }
                break;
            default:
                boolean A1a3 = AbstractC166987dD.A1a(obj);
                boolean A1a4 = AbstractC166987dD.A1a(obj2);
                C37608Gh3 c37608Gh3 = (C37608Gh3) this.receiver;
                C200108tF c200108tF2 = C200108tF.A01;
                UserSession userSession2 = c37608Gh3.A0B;
                c200108tF2.A0C(userSession2, "reels", A1a4, true);
                if (A1a3) {
                    C79923hh c79923hh = C79923hh.A00;
                    Context requireContext = c37608Gh3.A05.requireContext();
                    C38321qM c38321qM3 = c37608Gh3.A02;
                    if (c38321qM3 == null) {
                        C14360o3.A0F("media");
                        throw C00O.createAndThrow();
                    }
                    c79923hh.A0C(requireContext, C79923hh.A00(C82G.A0R, new C42198Imk(1), userSession2, c38321qM3, C05F.A0C), userSession2, A1a4);
                    break;
                }
                break;
        }
        return C0eB.A00;
    }
}
