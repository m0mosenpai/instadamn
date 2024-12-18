package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.RemoteException;
import android.view.View;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.EUh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32531EUh extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C32531EUh(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r4.length() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0201, code lost:
    
        if (r4 != 61) goto L44;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r14) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531EUh.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-412831301);
                Activity activity = (Activity) this.A01;
                if (activity != null) {
                    AbstractC167007dF.A0J().post(new GL1(activity));
                }
                AbstractC166987dD.A1T(C18950wb.A01, "Agent thread creation failed.", 20134884);
                InterfaceC09390do interfaceC09390do = ((AiAgentThreadLauncher) this.A02).A02;
                C7F6 c7f6 = (C7F6) interfaceC09390do.getValue();
                String str = this.A03;
                if (str != null && str.equals(c7f6.A01)) {
                    c7f6.A06.markerPoint(C7F6.A00(c7f6), "create_server_thread_failure");
                }
                ((C7F6) interfaceC09390do.getValue()).A05(C05F.A01);
                i = 1127269922;
                break;
            case 8:
                A03 = C0f9.A03(-314522001);
                ((BrowserLiteCallbackService.BrowserLiteCallbackImpl) this.A01).A00 = false;
                android.util.Log.e("BrowserLiteCallbackService", "autofill domain opt out check failed");
                i = 891372117;
                break;
            case 16:
                A03 = C0f9.A03(-200261044);
                ((C1P1) this.A01).onFailInBackground(abstractC115105If);
                i = 186661691;
                break;
            default:
                super.onFailInBackground(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1420347684);
                C51377Mmc c51377Mmc = (C51377Mmc) this.A02;
                c51377Mmc.A02.stop();
                c51377Mmc.A01.setVisibility(8);
                c51377Mmc.A05.setVisibility(8);
                ((ArchiveReelPeopleFragment) this.A01).A02 = false;
                i = -938631365;
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                super.onFinish();
                return;
            case 3:
                A03 = C0f9.A03(-1750495375);
                C47777L8c c47777L8c = (C47777L8c) this.A01;
                if (c47777L8c != null) {
                    c47777L8c.A00();
                }
                i = 1042377865;
                break;
            case 9:
                A03 = C0f9.A03(779439949);
                super.onFinish();
                ((EKF) this.A01).A0L.A00();
                i = 424023459;
                break;
            case 10:
                A03 = C0f9.A03(-1188791789);
                EVH evh = (EVH) this.A01;
                Map map = evh.A06;
                String str = this.A03;
                if (map.get(str) != null) {
                    ((List) map.get(str)).remove(this.A02);
                    if (((List) map.get(str)).isEmpty()) {
                        ENJ enj = evh.A01;
                        if (str.equals(enj.A08)) {
                            C31768DxP c31768DxP = enj.A06;
                            if (c31768DxP.A01.isEmpty()) {
                                c31768DxP.A03 = true;
                                C0fA.A00(c31768DxP, -900434024);
                            }
                            View view = enj.A01;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                        map.remove(str);
                        evh.A05.remove(str);
                    }
                }
                i = -682563131;
                break;
            case 11:
                A03 = C0f9.A03(-83155688);
                AbstractC31171DnF.A1N(this.A02);
                i = -826006329;
                break;
            case 14:
                A03 = C0f9.A03(-290701526);
                AbstractC31176DnK.A0y(((WFL) this.A02).A09.getActivity(), C56352iT.A0t);
                i = -1403277890;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-8530946);
                ((C54700OEc) this.A02).A04.remove(this.A03);
                i = -1116429415;
                break;
            case 16:
                A03 = C0f9.A03(1112102599);
                ((C1P1) this.A01).onFinish();
                i = 1711592586;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-563091182);
                i = 2143670449;
                break;
            case 3:
                A03 = C0f9.A03(-26648777);
                C47777L8c c47777L8c = (C47777L8c) this.A01;
                if (c47777L8c != null) {
                    c47777L8c.A01();
                }
                i = 82123009;
                break;
            case 11:
                A03 = C0f9.A03(1767970801);
                C0fJ.A00((Dialog) this.A02);
                i = 87127952;
                break;
            case 14:
                A03 = C0f9.A03(1535334279);
                i = 1242186807;
                break;
            case 16:
                A03 = C0f9.A03(-1339322285);
                ((C1P1) this.A01).onStart();
                i = -1420721789;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0632, code lost:
    
        if (r9 != 61) goto L145;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r58) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531EUh.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(1493347887);
                C43707JUs c43707JUs = (C43707JUs) obj;
                int A0N = AbstractC167017dG.A0N(c43707JUs, 1378305148);
                super.onSuccessInBackground(c43707JUs);
                AiAgentThreadLauncher aiAgentThreadLauncher = (AiAgentThreadLauncher) this.A02;
                C7F6 c7f6 = (C7F6) aiAgentThreadLauncher.A02.getValue();
                String str = this.A03;
                if (str != null && str.equals(c7f6.A01)) {
                    c7f6.A06.markerPoint(C7F6.A00(c7f6), "create_server_thread_success");
                }
                ((C2DS) aiAgentThreadLauncher.A03.getValue()).FBa(c43707JUs, c43707JUs.A0q, c43707JUs, true);
                C0f9.A0A(7504445, A0N);
                i = -163959500;
                break;
            case 8:
                int A032 = C0f9.A03(1064036444);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A033 = C0f9.A03(507437588);
                boolean z = false;
                ((BrowserLiteCallbackService.BrowserLiteCallbackImpl) this.A01).A00 = false;
                try {
                    Object obj2 = anonymousClass435.A01;
                    if (obj2 != null) {
                        AbstractC907342m abstractC907342m = (AbstractC907342m) obj2;
                        if (abstractC907342m.A00(E5V.class, "ig_iab_autofil_optout_domains_root") != null && abstractC907342m.A00(E5V.class, "ig_iab_autofil_optout_domains_root").A06("is_opt_out")) {
                            z = true;
                        }
                    }
                    ((AutofillOptOutCallback) this.A02).D1E(this.A03, z);
                } catch (RemoteException unused) {
                }
                C0f9.A0A(1989073468, A033);
                C0f9.A0A(1438315858, A032);
                return;
            case 14:
                A03 = C0f9.A03(158571000);
                C0f9.A0A(-590082544, C0f9.A03(2114962022));
                i = -248099578;
                break;
            case 16:
                A03 = C0f9.A03(1060393946);
                int A034 = C0f9.A03(-2021470591);
                ((C1P1) this.A01).onSuccessInBackground(obj);
                C0f9.A0A(-612222866, A034);
                i = 1176212447;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
