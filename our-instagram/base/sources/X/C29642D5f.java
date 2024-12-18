package X;

import android.view.View;
import com.facebook.analytics.dsp.point.DspPointContextHelper;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.user.model.User;
import com.meta.analytics.gnv.vista.core.VistaViewPoint;

/* renamed from: X.D5f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29642D5f extends C03E implements InterfaceC16610sE {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C29642D5f(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                case 2: goto L23;
                case 3: goto L2b;
                case 4: goto L23;
                case 5: goto L33;
                case 6: goto L3b;
                case 7: goto L43;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.IdY> r3 = X.C41704IdY.class
            r1 = 3
            java.lang.String r4 = "launchCameraWithAudio"
            java.lang.String r5 = "launchCameraWithAudio(Lcom/instagram/clips/model/metadata/ClipsAudioMetadata;Lcom/facebook/analytics/structuredlogger/enums/InstagramCameraEntryPointTypes;Lcom/instagram/api/schemas/ClipsCameraCommandAction;)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper> r3 = com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.class
            r1 = 3
            java.lang.String r4 = "takePostCapturePhotoWithTimeout"
            java.lang.String r5 = "takePostCapturePhotoWithTimeout$fbandroid_java_com_facebook_cameracore_litecamera_richmediaviewer_factory_avatar_instagram_instagram(Lcom/facebook/cameracore/litecamera/richmediaviewer/viewerar3d/RichMediaViewerAr3dIntf;Lcom/facebook/cameracore/litecamera/richmediaviewer/factory/avatar/instagram/OdrHelperParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            goto Ld
        L1b:
            java.lang.Class<X.Uvw> r3 = X.Uvw.class
            r1 = 3
            java.lang.String r4 = "onClickCard"
            java.lang.String r5 = "onClickCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            goto Ld
        L23:
            java.lang.Class<X.CUg> r3 = X.C27961CUg.class
            r1 = 3
            java.lang.String r4 = "onUserNameClicked"
            java.lang.String r5 = "onUserNameClicked(Lcom/instagram/user/model/User;Ljava/lang/String;Z)V"
            goto Ld
        L2b:
            java.lang.Class<X.CUg> r3 = X.C27961CUg.class
            r1 = 3
            java.lang.String r4 = "onCommentPollVoterCountsClicked"
            java.lang.String r5 = "onCommentPollVoterCountsClicked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto Ld
        L33:
            java.lang.Class<X.CUg> r3 = X.C27961CUg.class
            r1 = 3
            java.lang.String r4 = "onLikeCommentClicked"
            java.lang.String r5 = "onLikeCommentClicked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto Ld
        L3b:
            java.lang.Class<X.3ht> r3 = X.InterfaceC80043ht.class
            r1 = 3
            java.lang.String r4 = "onCommentBubbleLiked"
            java.lang.String r5 = "onCommentBubbleLiked(Ljava/lang/String;Ljava/lang/String;Z)V"
            goto Ld
        L43:
            java.lang.Class<X.CKj> r3 = X.C27716CKj.class
            r1 = 3
            java.lang.String r4 = "createVistaViewPoint"
            java.lang.String r5 = "createVistaViewPoint(Landroid/view/View;ILcom/meta/analytics/gnv/vista/core/VistaViewContext;)Lcom/meta/analytics/gnv/vista/core/VistaViewPoint;"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29642D5f.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.A00) {
            case 0:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
                Object obj4 = this.receiver;
                long A04 = C36H.A04(C36G.A09, 10L);
                MCR mcr = new MCR(obj, obj4, obj2, (InterfaceC23621Ds) null, 4);
                if (A04 > 0) {
                    j = C36J.A03(C36J.A05(A04, C36H.A04(C36G.A08, 999999L)));
                } else {
                    j = 0;
                }
                return LHL.A00(interfaceC23621Ds, mcr, j);
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                AbstractC167017dG.A1N(str, str2);
                ((Uvw) this.receiver).A0D(str, str2, (String) obj3);
                return C0eB.A00;
            case 2:
            case 4:
                User user = (User) obj;
                String str3 = (String) obj2;
                boolean A1a = AbstractC166987dD.A1a(obj3);
                AbstractC167017dG.A1N(user, str3);
                C27961CUg c27961CUg = (C27961CUg) this.receiver;
                AbstractC166097bd abstractC166097bd = c27961CUg.A01;
                if (((abstractC166097bd instanceof C167297di) && !((C167297di) abstractC166097bd).A0W) || (abstractC166097bd instanceof C169527hS)) {
                    c27961CUg.A02.A0Y(user, str3, A1a);
                }
                return C0eB.A00;
            case 3:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                boolean A1a2 = AbstractC166987dD.A1a(obj3);
                AbstractC167017dG.A1N(str4, str5);
                ((C27961CUg) this.receiver).A02.A0N.Egh(new C167067dL(str4, str5, A1a2));
                return C0eB.A00;
            case 5:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                boolean A1W = AbstractC25231BEo.A1W(obj3, str6);
                C27961CUg c27961CUg2 = (C27961CUg) this.receiver;
                AbstractC166097bd abstractC166097bd2 = c27961CUg2.A01;
                if ((abstractC166097bd2 instanceof C167297di) && !((C167297di) abstractC166097bd2).A0W) {
                    c27961CUg2.A02.A0i(str6, str7, A1W);
                }
                return C0eB.A00;
            case 6:
                String str8 = (String) obj;
                String str9 = (String) obj2;
                boolean A1a3 = AbstractC166987dD.A1a(obj3);
                AbstractC167017dG.A1N(str8, str9);
                ((InterfaceC80043ht) this.receiver).D65(str8, str9, A1a3);
                return C0eB.A00;
            case 7:
                View view = (View) obj;
                int A0H = AbstractC166987dD.A0H(obj2);
                C27904CRp c27904CRp = (C27904CRp) obj3;
                AbstractC167017dG.A1O(view, c27904CRp);
                return new VistaViewPoint(view, DspPointContextHelper.A00, c27904CRp, A0H);
            default:
                InterfaceC88553xD interfaceC88553xD = (InterfaceC88553xD) obj;
                C22P c22p = (C22P) obj2;
                AbstractC167017dG.A1N(interfaceC88553xD, c22p);
                ((C41704IdY) this.receiver).A02(c22p, (ClipsCameraCommandAction) obj3, interfaceC88553xD);
                return C0eB.A00;
        }
    }
}
