package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes7.dex */
public final class J72 extends C03E implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J72(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                case 2: goto L23;
                case 3: goto L2b;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.IdY> r3 = X.C41704IdY.class
            r1 = 0
            java.lang.String r4 = "launchCameraWithGalleryFirstExperience"
            java.lang.String r5 = "launchCameraWithGalleryFirstExperience()V"
        Ld:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.GtQ> r3 = X.C38331GtQ.class
            r1 = 0
            java.lang.String r4 = "onErrorStateClick"
            java.lang.String r5 = "onErrorStateClick()V"
            goto Ld
        L1b:
            java.lang.Class<X.1IP> r3 = X.C1IP.class
            r1 = 0
            java.lang.String r4 = "onFeedCacheRequestSucceeded"
            java.lang.String r5 = "onFeedCacheRequestSucceeded()V"
            goto Ld
        L23:
            java.lang.Class<X.JGz> r3 = X.InterfaceC43435JGz.class
            r1 = 0
            java.lang.String r4 = "mutePlayer"
            java.lang.String r5 = "mutePlayer()V"
            goto Ld
        L2b:
            java.lang.Class<X.GkR> r3 = X.C37812GkR.class
            r1 = 0
            java.lang.String r4 = "goBackToFeed"
            java.lang.String r5 = "goBackToFeed()V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J72.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.receiver;
                C43172J6r.A03(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 15);
                break;
            case 1:
                ((C1IP) this.receiver).A06();
                break;
            case 2:
                ((InterfaceC43435JGz) this.receiver).CqG();
                break;
            case 3:
                C37812GkR c37812GkR = (C37812GkR) this.receiver;
                C37812GkR.A04(c37812GkR, 0.0f);
                c37812GkR.A05.A00("swipe_top_to_buttom");
                c37812GkR.A02.onBackPressed();
                break;
            default:
                C41704IdY c41704IdY = (C41704IdY) this.receiver;
                UserSession userSession = c41704IdY.A04;
                C6XJ A02 = C6XJ.A02(c41704IdY.A02, AbstractC86593tX.A0C(C22P.A0t).A00(), userSession, TransparentModalActivity.class, "clips_camera");
                AbstractC31179DnN.A1S(A02);
                AbstractC59962oe abstractC59962oe = c41704IdY.A03;
                C14360o3.A0C(abstractC59962oe, AbstractC111324zv.A00(29));
                A02.A0D(abstractC59962oe, 9587);
                break;
        }
        return C0eB.A00;
    }
}
