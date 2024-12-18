package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9GQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GQ extends C03E implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9GQ(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                case 2: goto L23;
                case 3: goto L2b;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L3b;
                case 9: goto L43;
                case 10: goto L4b;
                case 11: goto L53;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.IdY> r3 = X.C41704IdY.class
            r1 = 0
            java.lang.String r4 = "launchMetaGallery"
            java.lang.String r5 = "launchMetaGallery()V"
        Ld:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r3 = java.util.concurrent.atomic.AtomicReference.class
            r1 = 0
            java.lang.String r4 = "get"
            java.lang.String r5 = "get()Ljava/lang/Object;"
            goto Ld
        L1b:
            java.lang.Class<X.BbV> r3 = X.C25814BbV.class
            r1 = 0
            java.lang.String r4 = "onComposerReplyingToDismissTap"
            java.lang.String r5 = "onComposerReplyingToDismissTap()V"
            goto Ld
        L23:
            java.lang.Class<X.9fX> r3 = X.C214959fX.class
            r1 = 0
            java.lang.String r4 = "onContinueLinkingButtonClicked"
            java.lang.String r5 = "onContinueLinkingButtonClicked()V"
            goto Ld
        L2b:
            java.lang.Class<X.87D> r3 = X.C87D.class
            r1 = 0
            java.lang.String r4 = "toggleVideoOriginalAudioVolume"
            java.lang.String r5 = "toggleVideoOriginalAudioVolume()V"
            goto Ld
        L33:
            java.lang.Class<X.8Bf> r3 = X.C183328Bf.class
            r1 = 0
            java.lang.String r4 = "onCompleteRequest"
            java.lang.String r5 = "onCompleteRequest()V"
            goto Ld
        L3b:
            java.lang.Class<X.7Wk> r3 = X.C164217Wk.class
            r1 = 0
            java.lang.String r4 = "isModeActive"
            java.lang.String r5 = "isModeActive()Z"
            goto Ld
        L43:
            java.lang.Class<X.0cm> r3 = X.InterfaceC08830cm.class
            r1 = 0
            java.lang.String r4 = "get"
            java.lang.String r5 = "get()Ljava/lang/Object;"
            goto Ld
        L4b:
            java.lang.Class<X.SwM> r3 = X.C63947SwM.class
            r1 = 0
            java.lang.String r4 = "footerRenderingFinished"
            java.lang.String r5 = "footerRenderingFinished()V"
            goto Ld
        L53:
            java.lang.Class<X.493> r3 = X.AnonymousClass493.class
            r1 = 0
            java.lang.String r4 = "createStash"
            java.lang.String r5 = "createStash()Lcom/facebook/stash/extras/StashWithExtras;"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9GQ.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        R7V r7v;
        InterfaceC65552TmV interfaceC65552TmV;
        View B7m;
        ClipsCreationViewModel clipsCreationViewModel;
        switch (this.A00) {
            case 0:
                return ((AtomicReference) this.receiver).get();
            case 1:
                C25814BbV c25814BbV = (C25814BbV) this.receiver;
                c25814BbV.A09.A01();
                c25814BbV.A0O.Egh(C167487e3.A00);
                break;
            case 2:
                C214959fX c214959fX = (C214959fX) this.receiver;
                AbstractC25651Mw.A00(AbstractC166987dD.A0o(c214959fX.A0J)).A01(c214959fX.A0I, C211849aB.class);
                break;
            case 3:
                C87D c87d = (C87D) this.receiver;
                ClipsAudioStore clipsAudioStore = c87d.A01;
                if (AbstractC166987dD.A09(clipsAudioStore.A0k.getValue()) == 0.0f) {
                    clipsAudioStore.A06(1.0f);
                    clipsCreationViewModel = c87d.A02;
                } else {
                    clipsCreationViewModel = c87d.A02;
                    ArrayList A05 = clipsCreationViewModel.A0G().A05();
                    if (!(A05 instanceof Collection) || !A05.isEmpty()) {
                        Iterator it = A05.iterator();
                        while (it.hasNext()) {
                            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
                            if (abstractC115485Ki instanceof C115475Kh) {
                                C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
                                if (!c115475Kh.A0G.A0K && c115475Kh.A01 > 0.0f) {
                                    clipsAudioStore.A06(0.0f);
                                    break;
                                }
                            }
                        }
                    }
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                int size = ((C84B) clipsCreationViewModel.A0c.getValue()).A01.size();
                int i = 0;
                while (true) {
                    C84G c84g = clipsCreationViewModel.A0O;
                    if (i < size) {
                        AbstractC115485Ki abstractC115485Ki2 = (AbstractC115485Ki) ((C84B) c84g.A03.getValue()).A04(i);
                        if (abstractC115485Ki2 != null) {
                            AbstractC115485Ki A06 = abstractC115485Ki2.A06();
                            if ((A06 instanceof C115475Kh) && ((C115475Kh) A06).A01 == 0.0f) {
                                ((C115475Kh) A06).A01 = 1.0f;
                            }
                            A1E.add(A06);
                        }
                        i++;
                    } else {
                        c84g.A02(A1E);
                        break;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                C183328Bf c183328Bf = (C183328Bf) this.receiver;
                c183328Bf.A00 = null;
                C183328Bf.A00(c183328Bf);
                break;
            case 8:
                return Boolean.valueOf(((C164217Wk) this.receiver).CYr());
            case 9:
                return ((InterfaceC08830cm) this.receiver).get();
            case 10:
                C63947SwM c63947SwM = (C63947SwM) this.receiver;
                QF6 qf6 = c63947SwM.A00;
                if (qf6 != null && (r7v = ((SystemWebView) qf6).A04) != null && (interfaceC65552TmV = c63947SwM.A01) != null && (B7m = interfaceC65552TmV.B7m()) != null) {
                    C63947SwM.A01(r7v, B7m, c63947SwM, 250L);
                    break;
                }
                break;
            case 11:
                return C1M7.A01().A03(C1M7.A01().A05(1533050740), "QPSDKCache");
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C41704IdY c41704IdY = (C41704IdY) this.receiver;
                C22P c22p = C22P.A3V;
                Bundle A00 = AbstractC86593tX.A0C(c22p).A00();
                A00.putString("META_GALLERY_ALBUM_TYPE", "OCULUS");
                C41704IdY.A00(A00, c22p, c41704IdY, false);
                break;
            default:
                return null;
        }
        return C0eB.A00;
    }
}
