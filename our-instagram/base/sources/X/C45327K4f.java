package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.K4f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45327K4f extends AbstractC184688Hj {
    public final int A00;
    public final Object A01;

    public C45327K4f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
        C0f5 AEp;
        String str;
        String str2;
        switch (this.A00) {
            case 1:
                AbstractC27671Vv A00 = C3ER.A00();
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
                UserSession userSession = viewOnClickListenerC44269JhH.A0a;
                Context context = viewOnClickListenerC44269JhH.getContext();
                if (!A00.A02(context, userSession)) {
                    return;
                }
                MX1.A01(userSession).A0C(false, context.getString(2131976634));
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131976635);
                A0I.A09(2131976634);
                AbstractC31176DnK.A15(new DialogInterfaceOnClickListenerC35301Fha(3), A0I);
                return;
            case 2:
                C0K8.A0F(ViewOnClickListenerC44269JhH.__redex_internal_original_name, "stop video encountered error", exc);
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH2 = (ViewOnClickListenerC44269JhH) this.A01;
                MX1.A01(viewOnClickListenerC44269JhH2.A0a).A0C(false, exc.getMessage());
                C44272JhO c44272JhO = viewOnClickListenerC44269JhH2.A0e;
                SystemClock.elapsedRealtime();
                c44272JhO.A01 = C05F.A0N;
                viewOnClickListenerC44269JhH2.A0H = false;
                C44274JhQ c44274JhQ = c44272JhO.A06;
                if (viewOnClickListenerC44269JhH2.A00 < c44274JhQ.A01.A01.size()) {
                    c44274JhQ.A00();
                }
                if (!viewOnClickListenerC44269JhH2.A0D) {
                    return;
                }
                viewOnClickListenerC44269JhH2.setFlashMode(viewOnClickListenerC44269JhH2.A01);
                viewOnClickListenerC44269JhH2.A0D = false;
                viewOnClickListenerC44269JhH2.A01 = -1;
                return;
            case 3:
            default:
                return;
            case 4:
                AbstractC167007dF.A15(C18950wb.A01.AEp(ViewOnClickListenerC44269JhH.__redex_internal_original_name, 817904119), DialogModule.KEY_MESSAGE, "setFlashMode()", exc);
                ViewOnClickListenerC44269JhH.A04((ViewOnClickListenerC44269JhH) this.A01);
                return;
            case 5:
                AEp = C18950wb.A01.AEp("InAppCaptureView.CameraFocusError", 817904119);
                str = DialogModule.KEY_MESSAGE;
                str2 = "Assign to @nilesh. Failed to get number of cameras.";
                break;
            case 6:
                if (((ViewOnClickListenerC44269JhH) this.A01).A04 == null) {
                    return;
                }
                AEp = C18950wb.A01.AEp("MediaCaptureFragment.PictureTakenError", 817904119);
                str = DialogModule.KEY_MESSAGE;
                str2 = "An exception happened while attempting to take a photo";
                break;
        }
        AbstractC167007dF.A15(AEp, str, str2, exc);
    }

    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        MN7 mn7;
        switch (this.A00) {
            case 0:
                LO8 lo8 = (LO8) this.A01;
                lo8.A0H.EhV(0.15f);
                AbstractC46618Kjv.A00(lo8.A0I).A00();
                return;
            case 1:
                Y1s y1s = (Y1s) obj;
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
                C44272JhO c44272JhO = viewOnClickListenerC44269JhH.A0e;
                if (c44272JhO.A09.get() != null) {
                    Integer num = c44272JhO.A01;
                    Integer num2 = C05F.A00;
                    if (num == num2) {
                        SystemClock.elapsedRealtime();
                        c44272JhO.A01 = C05F.A01;
                        C44274JhQ c44274JhQ = c44272JhO.A06;
                        C44059Jdk c44059Jdk = new C44059Jdk();
                        c44274JhQ.A00 = c44059Jdk;
                        c44059Jdk.A08.add(c44274JhQ);
                        C44059Jdk c44059Jdk2 = c44274JhQ.A00;
                        c44059Jdk2.A04 = SystemClock.elapsedRealtime();
                        c44059Jdk2.A03(num2);
                        C44059Jdk c44059Jdk3 = c44274JhQ.A00;
                        c44059Jdk3.A01 = 0;
                        c44274JhQ.A01.A02(c44059Jdk3);
                        C44059Jdk c44059Jdk4 = c44274JhQ.A00;
                        if (c44059Jdk4 != null) {
                            c44059Jdk4.A02 = y1s.A00(Y1s.A0L).intValue();
                            c44059Jdk4.A00 = y1s.A00(Y1s.A0K).intValue();
                        }
                        c44272JhO.A03.sendEmptyMessage(1);
                    }
                }
                viewOnClickListenerC44269JhH.A06 = EnumC44287Jhd.A02;
                return;
            case 2:
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH2 = (ViewOnClickListenerC44269JhH) this.A01;
                C44272JhO c44272JhO2 = viewOnClickListenerC44269JhH2.A0e;
                SystemClock.elapsedRealtime();
                c44272JhO2.A01 = C05F.A0N;
                if (viewOnClickListenerC44269JhH2.A0G && (mn7 = viewOnClickListenerC44269JhH2.A04) != null) {
                    viewOnClickListenerC44269JhH2.A0G = false;
                    MediaCaptureFragment mediaCaptureFragment = (MediaCaptureFragment) mn7;
                    MSF msf = mediaCaptureFragment.mCaptureProvider;
                    msf.getClass();
                    if (((ViewOnClickListenerC44269JhH) msf).A06 == EnumC44287Jhd.A02) {
                        mediaCaptureFragment.mCaptureProvider.E6C();
                        C50692MZl c50692MZl = mediaCaptureFragment.A02;
                        c50692MZl.getClass();
                        AnonymousClass841 A00 = c50692MZl.A04.A00();
                        Activity activity = c50692MZl.A02;
                        C14360o3.A0A(activity);
                        AbstractC53891NsN.A00(activity, c50692MZl.A03, A00);
                    }
                }
                if (viewOnClickListenerC44269JhH2.A0F) {
                    viewOnClickListenerC44269JhH2.A0F = false;
                    viewOnClickListenerC44269JhH2.E6C();
                }
                if (viewOnClickListenerC44269JhH2.A0D) {
                    viewOnClickListenerC44269JhH2.setFlashMode(viewOnClickListenerC44269JhH2.A01);
                    viewOnClickListenerC44269JhH2.A0D = false;
                    viewOnClickListenerC44269JhH2.A01 = -1;
                }
                MX1.A01(viewOnClickListenerC44269JhH2.A0a).A0C(true, null);
                return;
            case 3:
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH3 = (ViewOnClickListenerC44269JhH) this.A01;
                viewOnClickListenerC44269JhH3.A0A = Integer.valueOf(((C177447ue) obj).A01);
                View view = viewOnClickListenerC44269JhH3.A0P;
                view.animate().rotationBy(-180.0f).start();
                Integer num3 = viewOnClickListenerC44269JhH3.A0A;
                boolean z = true;
                if (num3 == null || 1 != num3.intValue()) {
                    z = false;
                }
                Resources resources = viewOnClickListenerC44269JhH3.getResources();
                int i = 2131975065;
                if (z) {
                    i = 2131975049;
                }
                AbstractC31172DnG.A1E(resources, view, i);
                if (viewOnClickListenerC44269JhH3.A04 != null) {
                    viewOnClickListenerC44269JhH3.A0Y.A07();
                }
                AbstractC50677MYv.A0H(viewOnClickListenerC44269JhH3.A0a, viewOnClickListenerC44269JhH3.A0A);
                return;
            case 4:
                ViewOnClickListenerC44269JhH.A04((ViewOnClickListenerC44269JhH) this.A01);
                return;
            case 5:
                View view2 = ((ViewOnClickListenerC44269JhH) this.A01).A0P;
                int i2 = 8;
                if (((Number) obj).intValue() > 1) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                return;
            case 6:
                C196748n4 c196748n4 = (C196748n4) obj;
                MN7 mn72 = ((ViewOnClickListenerC44269JhH) this.A01).A04;
                if (mn72 == null) {
                    return;
                }
                MediaCaptureFragment mediaCaptureFragment2 = (MediaCaptureFragment) mn72;
                C14120nc.A00().ATO(new KMJ(mediaCaptureFragment2.requireContext(), c196748n4, mediaCaptureFragment2, (byte[]) c196748n4.A04(C196748n4.A0X)));
                return;
            default:
                return;
        }
    }
}
