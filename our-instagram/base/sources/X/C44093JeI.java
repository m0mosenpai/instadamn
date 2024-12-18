package X;

import android.os.Handler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.JeI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44093JeI extends C1P1 {
    public final int A00;
    public final Object A01;

    public C44093JeI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C44093JeI(obj, i);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1419865509);
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null) {
                    A01 = AbstractC166987dD.A18("Http Request Failed");
                }
                ((C45366K5z) this.A01).A00.setException(A01);
                i = -2061146723;
                break;
            case 1:
            case 6:
            case 10:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 22:
            default:
                super.onFail(abstractC115105If);
                return;
            case 2:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -359009292);
                super.onFail(abstractC115105If);
                C67874V0f c67874V0f = (C67874V0f) this.A01;
                AbstractC43594JPz.A0N(c67874V0f.A0G).A0J(VG4.A08, "fetch_ad_preview_template_list", String.valueOf(abstractC115105If.A01()));
                C67874V0f.A00(c67874V0f);
                i = 501994121;
                break;
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -2106283486);
                super.onFail(abstractC115105If);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((NotifyMeNotFollowedFragment) this.A01).A01);
                AbstractC166987dD.A1Z(new MBT(A0Z, null, 37), AbstractC141776au.A00(A0Z));
                i = 205032020;
                break;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -433544744);
                super.onFail(abstractC115105If);
                C44125Jep c44125Jep = (C44125Jep) this.A01;
                KLJ klj = new KLJ(c44125Jep);
                ((Handler) c44125Jep.A09.getValue()).postDelayed(klj, ((C4KH) c44125Jep.A08.getValue()).A00() * 2000);
                c44125Jep.A00 = klj;
                i = -525870918;
                break;
            case 5:
                A0N = C0f9.A03(265270639);
                JT7 jt7 = (JT7) this.A01;
                SpinnerImageView spinnerImageView = jt7.A04;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.FAILED);
                }
                jt7.A0G.A02 = false;
                i = -363466330;
                break;
            case 7:
                A0N = C0f9.A03(644721024);
                C14360o3.A0B(abstractC115105If, 0);
                C47759L7f c47759L7f = (C47759L7f) this.A01;
                C46016KYe c46016KYe = c47759L7f.A02;
                C14360o3.A06(c47759L7f.A00.A00);
                C46016KYe.A00(c46016KYe, false);
                i = -615623400;
                break;
            case 8:
                A0N = C0f9.A03(232749530);
                C0K8.A0D("ArmadilloExpressReportMessagesLoader", "Failed to fetch messages from EB");
                ((InterfaceC16660sJ) this.A01).invoke(C16930sl.A00);
                i = 1713761016;
                break;
            case 9:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -123742100);
                super.onFail(abstractC115105If);
                JUI jui = (JUI) this.A01;
                jui.A03 = true;
                jui.A04.E4s(new C44192Jfv());
                i = 1417643181;
                break;
            case 11:
                A0N = C0f9.A03(-158578239);
                ((L1L) this.A01).A02.invoke(C16930sl.A00);
                i = -1546151620;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = C0f9.A03(-1070224076);
                ((L1M) this.A01).A02.invoke(C16930sl.A00);
                i = -1191568372;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -87181173);
                super.onFail(abstractC115105If);
                KDM kdm = (KDM) this.A01;
                KDM.A07(kdm, EnumC153216up.A04);
                C9GR.A0D(kdm.getContext(), "network_error");
                i = -2100211971;
                break;
            case 14:
                A0N = C0f9.A03(-721903040);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                KC1 kc1 = ((LJc) this.A01).A02;
                if (kc1 != null) {
                    C9GR.A01(kc1.requireContext(), "direct_poll_message_details_error", 2131960146, 0);
                    AbstractC31176DnK.A12(kc1.requireContext(), C3DN.A00);
                }
                i = -1152411464;
                break;
            case Process.SIGTERM /* 15 */:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 623616420);
                super.onFail(abstractC115105If);
                i = 964817887;
                break;
            case 17:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1106751099);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C0K8.A0C("DirectSearchMetaAIKeyboardReturnKeyApi", A012.getMessage());
                }
                i = 227829534;
                break;
            case 18:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -563102470);
                Throwable A013 = abstractC115105If.A01();
                if (A013 != null) {
                    C0K8.A0C("DirectSearchMetaAiTypeaheadApi", A013.getMessage());
                }
                i = 719001141;
                break;
            case 20:
                A0N = C0f9.A03(-1776408718);
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                if (directVisualMessageViewerController.A0e.isFinishing()) {
                    i = 1713872757;
                    break;
                } else {
                    directVisualMessageViewerController.A0T = false;
                    L03 l03 = directVisualMessageViewerController.A0I;
                    if (l03 != null) {
                        DirectVisualMessageViewerController directVisualMessageViewerController2 = l03.A00;
                        if (!directVisualMessageViewerController2.A0e.isFinishing()) {
                            DirectVisualMessageViewerController.A0O(directVisualMessageViewerController2, l03.A01);
                        }
                    }
                    i = -1421581292;
                    break;
                }
            case 23:
                A0N = C0f9.A03(2140483190);
                i = 2038753290;
                break;
            case 24:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -2111394279);
                super.onFail(abstractC115105If);
                C0K8.A0C("ClipsViewerRecommendClipsFragment", "Failed to load Clips Categories.");
                i = 448288446;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 5:
                A03 = C0f9.A03(-130308058);
                i = -841330670;
                break;
            case 7:
                A03 = C0f9.A03(-1581148819);
                C47759L7f c47759L7f = (C47759L7f) this.A01;
                C46016KYe c46016KYe = c47759L7f.A02;
                C14360o3.A06(c47759L7f.A00.A00);
                C46016KYe.A00(c46016KYe, true);
                i = -591032810;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(1891589771);
                super.onStart();
                KDM.A08((KDM) this.A01, true);
                i = 2109935077;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0bb8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v17, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v20, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v146, types: [com.instagram.model.mediasize.GifUrlImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v151, types: [com.instagram.model.mediasize.GifUrlImpl, java.lang.Object] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r76) {
        /*
            Method dump skipped, instructions count: 3418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44093JeI.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r2.equals(r1.A1D) != false) goto L29;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            int r0 = r15.A00
            int r0 = 19 - r0
            if (r0 == 0) goto Lc
            super.onSuccessInBackground(r1)
            return
        Lc:
            r0 = -230656642(0xfffffffff240757e, float:-3.8120423E30)
            int r4 = X.C0f9.A03(r0)
            X.H8x r1 = (X.C38849H8x) r1
            r0 = 759621142(0x2d46e616, float:1.1306086E-11)
            int r3 = X.C0f9.A03(r0)
            r14 = 0
            X.C14360o3.A0B(r1, r14)
            super.onSuccessInBackground(r1)
            X.JIb r2 = r1.A00
            if (r2 != 0) goto L2f
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2f:
            r0 = r2
            X.Jyg r0 = (X.C45140Jyg) r0
            java.util.List r1 = r0.A01
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2DS r5 = X.AbstractC28761aE.A00(r0)
            X.Jyg r2 = (X.C45140Jyg) r2
            java.lang.String r0 = r2.A00
            r11 = 0
            com.instagram.model.direct.DirectThreadKey r9 = new com.instagram.model.direct.DirectThreadKey
            r9.<init>(r0, r11)
            X.2DU r5 = (X.C2DU) r5
            r7 = 1
            X.C14360o3.A0B(r1, r7)
            X.4GV r6 = r5.A0P(r9)
            if (r6 != 0) goto L6d
            X.0wb r2 = X.C18950wb.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            r0 = 628(0x274, float:8.8E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC166987dD.A1T(r2, r0, r1)
        L60:
            r0 = 2017542439(0x78414127, float:1.5678668E34)
            X.C0f9.A0A(r0, r3)
            r0 = 2131810784(0x7f10d9e0, float:1.925401E38)
            X.C0f9.A0A(r0, r4)
            return
        L6d:
            java.util.ArrayList r13 = X.AbstractC166987dD.A1E()
            java.util.Iterator r8 = r1.iterator()
        L75:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r8.next()
            X.JIa r0 = (X.InterfaceC43462JIa) r0
            X.Jyf r0 = (X.C45139Jyf) r0
            X.JIZ r1 = r0.A00
            if (r1 == 0) goto L75
            java.lang.String r0 = r0.A01
            X.H37 r1 = (X.H37) r1
            java.lang.Integer r2 = r1.A00
            monitor-enter(r6)
            X.3nh r1 = r6.A0I(r0)     // Catch: java.lang.Throwable -> Lce
            if (r1 != 0) goto L9f
            X.0wb r2 = X.C18950wb.A01     // Catch: java.lang.Throwable -> Lce
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "message is missing from thread entry"
            X.AbstractC166987dD.A1T(r2, r0, r1)     // Catch: java.lang.Throwable -> Lce
            goto Lb0
        L9f:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lce
            if (r2 == 0) goto Laa
            java.lang.Integer r0 = r1.A1D     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lae
        Laa:
            r1.A1D = r2     // Catch: java.lang.Throwable -> Lcb
            r1.A2C = r7     // Catch: java.lang.Throwable -> Lcb
        Lae:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lce
            goto Lb1
        Lb0:
            r1 = 0
        Lb1:
            monitor-exit(r6)
            if (r1 == 0) goto L75
            r13.add(r1)
            goto L75
        Lb8:
            java.lang.Integer r10 = X.C05F.A0D
            X.2Io r8 = new X.2Io
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.1My r0 = r5.A06
            r0.E4s(r8)
            X.2ES r0 = r5.A09
            r0.accept(r8)
            goto L60
        Lcb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44093JeI.onSuccessInBackground(java.lang.Object):void");
    }
}
