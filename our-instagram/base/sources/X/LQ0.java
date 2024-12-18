package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.logging.IdCaptureButton;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggingEvents;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.archive.fragment.HighlightsProfileVisibilityFragment;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class LQ0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LQ0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LQ0 A01(Object obj, int i) {
        return new LQ0(obj, i);
    }

    public static void A02(View view, int i, Object obj) {
        C0fQ.A00(new LQ0(obj, i), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        MO1 mo1;
        String str;
        InterfaceC50382MMk interfaceC50382MMk;
        SelfieCaptureUi selfieCaptureUi;
        MO2 mo2;
        int A052;
        int i2;
        MO1 mo12;
        AbstractC44433Jkm c45348K5h;
        MO2 mo22;
        Activity activity;
        int A00;
        int i3;
        String str2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(24027936);
                AbstractC31178DnM.A1T(this.A01);
                i = -1012639262;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1669141664);
                WeakReference weakReference = ((K5J) this.A01).A00;
                if (weakReference != null && (mo2 = (MO2) weakReference.get()) != null) {
                    mo2.D0V();
                }
                i = -2048812890;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-1424317333);
                AbstractC31178DnM.A1T(this.A01);
                i = 2046252102;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-1139093045);
                K5D k5d = (K5D) this.A01;
                PhotoRequirementsView photoRequirementsView = k5d.A0C;
                C14360o3.A0A(photoRequirementsView);
                photoRequirementsView.A02 = true;
                photoRequirementsView.removeAllViews();
                Context context = photoRequirementsView.getContext();
                C14360o3.A0A(context);
                int A06 = AbstractC56842jH.A06(AbstractC47994LKy.A01(context, R.attr.sc_always_black), HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                View view2 = photoRequirementsView.A00;
                C14360o3.A0A(view2);
                C44427JkQ c44427JkQ = new C44427JkQ(context, view2, A06, false);
                photoRequirementsView.A01 = c44427JkQ;
                photoRequirementsView.addView(c44427JkQ);
                C44427JkQ c44427JkQ2 = photoRequirementsView.A01;
                C14360o3.A0A(c44427JkQ2);
                c44427JkQ2.A01();
                IdCaptureLogger idCaptureLogger = ((AbstractC60562R7d) k5d).A01;
                if (idCaptureLogger != null) {
                    idCaptureLogger.logButtonClick(IdCaptureButton.SHOW_PHOTO_REQUIREMENTS);
                }
                i = -155879823;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A052 = C0f9.A05(-1264370739);
                K5I k5i = (K5I) this.A01;
                IdCaptureLogger idCaptureLogger2 = k5i.A01;
                if (idCaptureLogger2 != null) {
                    idCaptureLogger2.logButtonClick(IdCaptureButton.CAPTURE_STEP_BACK_BUTTON);
                }
                WeakReference weakReference2 = k5i.A00;
                if (weakReference2 != null && (mo12 = (MO1) weakReference2.get()) != null) {
                    mo12.D2P();
                }
                i2 = -39137022;
                C0f9.A0C(i2, A052);
                return;
            case 5:
                A05 = C0f9.A05(-1463379264);
                WeakReference weakReference3 = ((K5I) this.A01).A00;
                if (weakReference3 != null && (mo1 = (MO1) weakReference3.get()) != null) {
                    C64094SzB c64094SzB = ((IdCaptureActivity) mo1).A03;
                    if (c64094SzB == null) {
                        str = "presenter";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    c64094SzB.A04 = CaptureState.CAPTURING_MANUAL;
                    C64094SzB.A01(null, c64094SzB, true);
                }
                i = -1754001883;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A052 = C0f9.A05(-1952004501);
                WeakReference weakReference4 = ((K5J) this.A01).A00;
                if (weakReference4 == null) {
                    i2 = -1520904318;
                } else {
                    MO2 mo23 = (MO2) weakReference4.get();
                    if (mo23 != null) {
                        mo23.D0V();
                    }
                    i2 = -398288093;
                }
                C0f9.A0C(i2, A052);
                return;
            case 7:
                A05 = C0f9.A05(1234532060);
                AbstractC31178DnM.A1T(this.A01);
                i = -556650708;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A00 = A00(this, -1032372612);
                i3 = -1388299285;
                C0f9.A0C(i3, A00);
                return;
            case 9:
                A052 = C0f9.A05(-1615920521);
                K5S k5s = (K5S) this.A01;
                ArrayList arrayList = k5s.A0W;
                C14360o3.A0C(arrayList, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
                Iterator A13 = AbstractC166997dE.A13(arrayList);
                while (A13.hasNext()) {
                    ((View) AbstractC166997dE.A0l(A13)).setVisibility(0);
                }
                AbstractC167007dF.A0x(k5s.A0A);
                i2 = 724665610;
                C0f9.A0C(i2, A052);
                return;
            case 10:
                A00 = C0f9.A05(-323631049);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 1510345719;
                C0f9.A0C(i3, A00);
                return;
            case 11:
                A052 = C0f9.A05(909722139);
                K5S k5s2 = (K5S) this.A01;
                LQ0 A01 = A01(k5s2, 10);
                Context requireContext = k5s2.requireContext();
                C14360o3.A0C(requireContext, "null cannot be cast to non-null type android.app.Activity");
                View view3 = k5s2.A08;
                AbstractC43592JPx.A1T(view3);
                ViewGroup viewGroup = (ViewGroup) view3;
                ArrayList arrayList2 = k5s2.A0W;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        childAt.setVisibility(8);
                        ArrayList arrayList3 = k5s2.A0W;
                        if (arrayList3 != null) {
                            arrayList3.add(childAt);
                        }
                    }
                }
                if (k5s2.A0S == null) {
                    if (k5s2 instanceof K5H) {
                        c45348K5h = new AbstractC44433Jkm(requireContext);
                        Context context2 = c45348K5h.getContext();
                        LayoutInflater.from(context2).inflate(R.layout.xmds_cancel_action_sheet_view, (ViewGroup) c45348K5h, true);
                        C14360o3.A07(context2);
                        c45348K5h.A00(context2);
                    } else {
                        c45348K5h = new C45348K5h(requireContext);
                    }
                    k5s2.A0S = c45348K5h;
                    c45348K5h.setTitleText(AbstractC25227BEk.A0v(k5s2, 2131963689));
                    AbstractC44433Jkm abstractC44433Jkm = k5s2.A0S;
                    if (abstractC44433Jkm != null) {
                        abstractC44433Jkm.setSubtitleText(AbstractC25227BEk.A0v(k5s2, 2131963688));
                    }
                    AbstractC44433Jkm abstractC44433Jkm2 = k5s2.A0S;
                    if (abstractC44433Jkm2 != null) {
                        abstractC44433Jkm2.setupDestructiveButton(AbstractC25227BEk.A0v(k5s2, 2131963687), A01);
                    }
                }
                AbstractC44433Jkm abstractC44433Jkm3 = k5s2.A0S;
                C14360o3.A0C(abstractC44433Jkm3, "null cannot be cast to non-null type com.facebook.smartcapture.view.BaseCancelActionSheetView");
                C44427JkQ c44427JkQ3 = new C44427JkQ(requireContext, abstractC44433Jkm3, AbstractC47994LKy.A01(requireContext, R.attr.sc_popover_shadow), false);
                AbstractC44433Jkm abstractC44433Jkm4 = k5s2.A0S;
                if (abstractC44433Jkm4 != null) {
                    abstractC44433Jkm4.setupCancelButton(AbstractC25227BEk.A0v(k5s2, 2131963686), A01(c44427JkQ3, 8));
                }
                FrameLayout frameLayout = k5s2.A0A;
                if (frameLayout != null) {
                    frameLayout.addView(c44427JkQ3);
                }
                c44427JkQ3.A00 = A01(k5s2, 9);
                FrameLayout frameLayout2 = k5s2.A0A;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                c44427JkQ3.A01();
                i2 = -469289531;
                C0f9.A0C(i2, A052);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00 = C0f9.A05(1776772819);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 53396786;
                C0f9.A0C(i3, A00);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(1687143280);
                K5S k5s3 = (K5S) this.A01;
                k5s3.A04 = 1.0f;
                ImageView imageView = k5s3.A0G;
                C14360o3.A0A(imageView);
                imageView.setScaleX(1.0f);
                ImageView imageView2 = k5s3.A0G;
                C14360o3.A0A(imageView2);
                imageView2.setScaleY(1.0f);
                ImageView imageView3 = k5s3.A0G;
                C14360o3.A0A(imageView3);
                imageView3.setTranslationX(0.0f);
                ImageView imageView4 = k5s3.A0G;
                C14360o3.A0A(imageView4);
                imageView4.setTranslationY(0.0f);
                WeakReference weakReference5 = ((K5U) k5s3).A00;
                C14360o3.A0A(weakReference5);
                Object obj = (MPV) weakReference5.get();
                if (obj != null) {
                    ((IdCaptureBaseActivity) obj).A02().logButtonClick(IdCaptureButton.EXPAND_FULL_PHOTO);
                }
                k5s3.A0Y = true;
                ViewGroup viewGroup2 = k5s3.A09;
                C14360o3.A0A(viewGroup2);
                viewGroup2.removeView(k5s3.A0B);
                Context requireContext2 = k5s3.requireContext();
                FrameLayout frameLayout3 = k5s3.A0B;
                C14360o3.A0A(frameLayout3);
                k5s3.A0T = new C44427JkQ(requireContext2, frameLayout3, 0, true);
                ViewGroup viewGroup3 = k5s3.A09;
                C14360o3.A0A(viewGroup3);
                viewGroup3.addView(k5s3.A0T);
                C44427JkQ c44427JkQ4 = k5s3.A0T;
                C14360o3.A0A(c44427JkQ4);
                c44427JkQ4.A01();
                i = 1670766565;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(425999602);
                K5S k5s4 = (K5S) this.A01;
                C44427JkQ c44427JkQ5 = k5s4.A0T;
                if (c44427JkQ5 != null) {
                    c44427JkQ5.A00();
                    k5s4.A0T = null;
                }
                k5s4.A0Y = false;
                i = 1247126845;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(227202350);
                WeakReference weakReference6 = ((K5U) this.A01).A00;
                C14360o3.A0A(weakReference6);
                MPV mpv = (MPV) weakReference6.get();
                if (mpv != null) {
                    mpv.DYW();
                }
                i = -1284266191;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(100045982);
                WeakReference weakReference7 = ((K5U) this.A01).A00;
                C14360o3.A0A(weakReference7);
                MPV mpv2 = (MPV) weakReference7.get();
                if (mpv2 != null) {
                    mpv2.DYX();
                }
                i = -123008014;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-303470485);
                AbstractC31178DnM.A1T(this.A01);
                i = -187954342;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-495338023);
                K5V k5v = (K5V) this.A01;
                SelfieCaptureLogger selfieCaptureLogger = ((K5W) k5v).A00;
                if (selfieCaptureLogger != null) {
                    selfieCaptureLogger.logButtonClick(SelfieCaptureLoggingEvents.SHOW_PHOTO_REQUIREMENTS);
                }
                Interpolator interpolator = K5V.A0Q;
                FragmentActivity activity2 = k5v.getActivity();
                if (activity2 != null) {
                    FrameLayout frameLayout4 = k5v.A01;
                    str = "overlayContainer";
                    if (frameLayout4 != null) {
                        frameLayout4.removeAllViews();
                        C1UC activity3 = k5v.getActivity();
                        if ((activity3 instanceof InterfaceC50382MMk) && (interfaceC50382MMk = (InterfaceC50382MMk) activity3) != null && (selfieCaptureUi = ((BaseSelfieCaptureActivity) interfaceC50382MMk).A05) != null) {
                            int A012 = AbstractC47994LKy.A01(activity2, R.attr.sc_popover_shadow);
                            C44434Jkn c44434Jkn = new C44434Jkn(activity2, ((AbstractC44444JlB) k5v).A00, selfieCaptureUi, k5v.A0F);
                            C44427JkQ c44427JkQ6 = new C44427JkQ(activity2, c44434Jkn, A012, false);
                            FrameLayout frameLayout5 = k5v.A01;
                            if (frameLayout5 != null) {
                                frameLayout5.addView(c44427JkQ6);
                                c44427JkQ6.A01();
                                c44434Jkn.A00 = A01(c44427JkQ6, 19);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 1135103533;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A00 = A00(this, 1682005197);
                i3 = -1744284847;
                C0f9.A0C(i3, A00);
                return;
            case 20:
                A05 = C0f9.A05(-159092103);
                AbstractC31178DnM.A1T(this.A01);
                i = -767693383;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(730279323);
                Object obj2 = ((K5N) this.A01).A01;
                if (obj2 != null) {
                    BaseSelfieCaptureActivity baseSelfieCaptureActivity = (BaseSelfieCaptureActivity) obj2;
                    SelfieCaptureLogger logger = baseSelfieCaptureActivity.getLogger();
                    if (logger != null) {
                        logger.logButtonClick(SelfieCaptureLoggingEvents.SELFIE_TIMER_START_AGAIN);
                    }
                    baseSelfieCaptureActivity.setResult(1002, null);
                    baseSelfieCaptureActivity.finish();
                }
                i = -314451675;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(1685125142);
                Object obj3 = ((K5N) this.A01).A01;
                if (obj3 != null) {
                    BaseSelfieCaptureActivity baseSelfieCaptureActivity2 = (BaseSelfieCaptureActivity) obj3;
                    SelfieCaptureLogger logger2 = baseSelfieCaptureActivity2.getLogger();
                    if (logger2 != null) {
                        logger2.logButtonClick(SelfieCaptureLoggingEvents.SELFIE_TIMER_START_AGAIN);
                    }
                    baseSelfieCaptureActivity2.setResult(1002, null);
                    baseSelfieCaptureActivity2.finish();
                }
                i = 1888695260;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(-1875546104);
                K5N k5n = (K5N) this.A01;
                FragmentActivity activity4 = k5n.getActivity();
                if (activity4 != null) {
                    FrameLayout frameLayout6 = k5n.A00;
                    if (frameLayout6 != null) {
                        frameLayout6.removeAllViews();
                    }
                    C1UC activity5 = k5n.getActivity();
                    if (activity5 instanceof InterfaceC50382MMk) {
                        C14360o3.A0C(activity5, "null cannot be cast to non-null type com.facebook.smartcapture.ui.SelfieCaptureUiActivity");
                        SelfieCaptureUi selfieCaptureUi2 = ((BaseSelfieCaptureActivity) ((InterfaceC50382MMk) activity5)).A05;
                        int A013 = AbstractC47994LKy.A01(activity4, R.attr.sc_popover_shadow);
                        C44434Jkn c44434Jkn2 = new C44434Jkn(activity4, ((AbstractC44444JlB) k5n).A00, selfieCaptureUi2, false);
                        C44427JkQ c44427JkQ7 = new C44427JkQ(activity4, c44434Jkn2, A013, false);
                        FrameLayout frameLayout7 = k5n.A00;
                        if (frameLayout7 != null) {
                            frameLayout7.addView(c44427JkQ7);
                        }
                        c44427JkQ7.A01();
                        c44434Jkn2.A00 = A01(c44427JkQ7, 24);
                    }
                }
                i = 1883215685;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A00 = A00(this, -751965209);
                i3 = -2094049064;
                C0f9.A0C(i3, A00);
                return;
            case 25:
                A05 = C0f9.A05(1231603623);
                WeakReference weakReference8 = ((K5J) this.A01).A00;
                if (weakReference8 != null && (mo22 = (MO2) weakReference8.get()) != null) {
                    mo22.D0V();
                }
                i = -118131865;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A00 = C0f9.A05(-1622305205);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 111225177;
                C0f9.A0C(i3, A00);
                return;
            case 27:
                A05 = C0f9.A05(-571610804);
                Object obj4 = (InterfaceC50383MMl) ((K5L) this.A01).A00.get();
                if (obj4 != null) {
                    Activity activity6 = (Activity) obj4;
                    activity6.setResult(1003, null);
                    activity6.finish();
                }
                i = -1941141567;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A00 = C0f9.A05(1390404073);
                K5X k5x = (K5X) this.A01;
                K5X.A00(A01(k5x, 27), k5x);
                i3 = -1313045215;
                C0f9.A0C(i3, A00);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A00 = C0f9.A05(-527354576);
                ((ComponentActivity) this.A01).onBackPressed();
                i3 = -1469221493;
                C0f9.A0C(i3, A00);
                return;
            case 30:
                A05 = C0f9.A05(-2050221202);
                K5X k5x2 = (K5X) this.A01;
                FragmentActivity activity7 = k5x2.getActivity();
                if (activity7 != null) {
                    K5X.A00(A01(activity7, 29), k5x2);
                }
                i = 1355012223;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A00 = A00(this, 825459775);
                i3 = 1697065976;
                C0f9.A0C(i3, A00);
                return;
            case 32:
                A05 = C0f9.A05(-1005321357);
                K5X k5x3 = (K5X) this.A01;
                List list = k5x3.A01;
                C14360o3.A0A(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC43592JPx.A09(it).setVisibility(0);
                }
                AbstractC43593JPy.A19(k5x3.A00);
                i = -1700476068;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A00 = C0f9.A05(-700171694);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 463557207;
                C0f9.A0C(i3, A00);
                return;
            case 34:
                A00 = C0f9.A05(-1802145696);
                K5Y.A01((K5Y) this.A01);
                i3 = 872384887;
                C0f9.A0C(i3, A00);
                return;
            case 35:
                A05 = C0f9.A05(1334804173);
                K5L k5l = (K5L) this.A01;
                Object obj5 = (InterfaceC50383MMl) k5l.A00.get();
                if (obj5 != null) {
                    Activity activity8 = (Activity) obj5;
                    activity8.setResult(1002, null);
                    activity8.finish();
                }
                C023409i.A0A.A04(k5l.requireArguments());
                i = 1621113249;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A00 = A00(this, -775685073);
                i3 = -1720576815;
                C0f9.A0C(i3, A00);
                return;
            case 37:
                A052 = C0f9.A05(1166583198);
                K5Y k5y = (K5Y) this.A01;
                List list2 = k5y.A0F;
                C14360o3.A0A(list2);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC43592JPx.A09(it2).setVisibility(0);
                }
                AbstractC167007dF.A0x(k5y.A07);
                i2 = 1718295483;
                C0f9.A0C(i2, A052);
                return;
            case 38:
                A05 = C0f9.A05(493069204);
                View.OnClickListener onClickListener = ((C44434Jkn) this.A01).A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                i = 1148014788;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A00 = A00(this, -391282134);
                i3 = -854803508;
                C0f9.A0C(i3, A00);
                return;
            case 40:
                A00 = C0f9.A05(658380537);
                AbstractC166987dD.A1Y(this.A01);
                i3 = -1757743158;
                C0f9.A0C(i3, A00);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A00 = C0f9.A05(1418128733);
                C45523KDo c45523KDo = (C45523KDo) this.A01;
                LoggingData A014 = LAu.A01(c45523KDo);
                CreatorLoggingData A002 = AbstractC46602Kjf.A00(c45523KDo.requireArguments());
                LLN lln = (LLN) c45523KDo.A00.getValue();
                Integer num = C05F.A1F;
                Integer num2 = C05F.A03;
                boolean z = A002.A01;
                Boolean valueOf = Boolean.valueOf(z);
                boolean z2 = A002.A02;
                Boolean valueOf2 = Boolean.valueOf(z2);
                Map map = A002.A00;
                lln.A07(valueOf, valueOf2, null, null, num, num2, map, null, AbstractC06930Yk.A0E());
                C189448aO A0g = AbstractC25231BEo.A0g(c45523KDo.A01);
                A0g.A0U = c45523KDo;
                C189478aR A003 = A0g.A00();
                FragmentActivity requireActivity = c45523KDo.requireActivity();
                C27S.A00().A02();
                String str3 = A014.A01;
                String str4 = A014.A00;
                AbstractC167017dG.A1N(str3, str4);
                C45515KDg c45515KDg = new C45515KDg();
                c45515KDg.setArguments(AbstractC167017dG.A0T("appreciation_creator_logging_data", new CreatorLoggingData(z, z2, map), AbstractC166987dD.A1L("appreciation_logging_data", new LoggingData(str3, str4))));
                A003.A02(requireActivity, c45515KDg);
                i3 = -242711625;
                C0f9.A0C(i3, A00);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A00 = C0f9.A05(-380734823);
                ((KHH) this.A01).A00.invoke();
                i3 = 1369300969;
                C0f9.A0C(i3, A00);
                return;
            case 43:
                A00 = C0f9.A05(18147721);
                ((KHJ) this.A01).A00.invoke();
                i3 = -2021760172;
                C0f9.A0C(i3, A00);
                return;
            case 44:
                A00 = C0f9.A05(-747301586);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C45630KHt) this.A01).A00.A00.A08);
                AbstractC166987dD.A1Z(new MCQ((InterfaceC23621Ds) null, A0Z, C05F.A01, 15), AbstractC141776au.A00(A0Z));
                i3 = 91038545;
                C0f9.A0C(i3, A00);
                return;
            case 45:
                A05 = C0f9.A05(1596713592);
                C44765Jrm c44765Jrm = (C44765Jrm) this.A01;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C46520KiJ c46520KiJ = c44765Jrm.A01;
                if (c46520KiJ == null) {
                    MQO mqo = c44765Jrm.A00;
                    if (mqo != null) {
                        mqo.DVs();
                    }
                } else {
                    MQO mqo2 = c44765Jrm.A00;
                    if (mqo2 != null) {
                        mqo2.DD1(c46520KiJ, true);
                    }
                }
                i = -1395641324;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00 = C0f9.A05(-1457404853);
                AbstractC166997dE.A1Y(((C50879MeA) ((HighlightsProfileVisibilityFragment) this.A01).A00.getValue()).A01, true);
                i3 = -1047049387;
                C0f9.A0C(i3, A00);
                return;
            case 47:
                A00 = C0f9.A05(1170681380);
                N6N n6n = (N6N) this.A01;
                C44490Jlw c44490Jlw = (C44490Jlw) n6n.A0E.getValue();
                c44490Jlw.A01.A01(n6n.requireActivity(), c44490Jlw.A00, C05F.A00, new C50262MHr(c44490Jlw, 15));
                i3 = 2054389508;
                C0f9.A0C(i3, A00);
                return;
            case 48:
                ((LIC) this.A01).A0B.A04();
                return;
            case 49:
                A00 = C0f9.A05(-1876374194);
                NametagController nametagController = ((KZz) this.A01).A00;
                if (nametagController != null) {
                    try {
                        UserSession userSession = nametagController.A0D;
                        AbstractC73317Y7a.A0D(nametagController.A0C, userSession, userSession.userId, nametagController.A0F, "download_qr_code");
                        NametagController.A02(new C44289Jhf(nametagController, 1), nametagController, C05F.A0B, nametagController.A0H);
                    } catch (Exception e) {
                        UserSession userSession2 = nametagController.A0D;
                        AbstractC73317Y7a.A0H(nametagController.A0C, userSession2, userSession2.userId, nametagController.A0F, "download_qr_code", e);
                        C9GR.A0A(nametagController.A07, "SAVE_QR_CODE_error");
                    }
                    i3 = 165811014;
                    C0f9.A0C(i3, A00);
                    return;
                }
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A00 = C0f9.A05(-337386096);
                NametagController nametagController2 = ((KZz) this.A01).A00;
                if (nametagController2 != null) {
                    try {
                        UserSession userSession3 = nametagController2.A0D;
                        AbstractC73317Y7a.A0D(nametagController2.A0C, userSession3, userSession3.userId, nametagController2.A0F, "download_qr_code");
                        NametagController.A02(new C44289Jhf(nametagController2, 0), nametagController2, C05F.A0B, nametagController2.A0H);
                    } catch (Exception e2) {
                        UserSession userSession4 = nametagController2.A0D;
                        AbstractC73317Y7a.A0H(nametagController2.A0C, userSession4, userSession4.userId, nametagController2.A0F, "download_qr_code", e2);
                        C9GR.A0A(nametagController2.A07, "SAVE_QR_CODE_error");
                    }
                    i3 = 1341894069;
                    C0f9.A0C(i3, A00);
                    return;
                }
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 51:
                A052 = C0f9.A05(-109066726);
                Lf8 lf8 = (Lf8) this.A01;
                Activity activity9 = lf8.A0C;
                if (AbstractC93174Ft.A03(activity9)) {
                    C195838lR c195838lR = lf8.A02;
                    if (c195838lR != null) {
                        c195838lR.A00();
                    }
                    lf8.A02 = null;
                    Lf8.A00(lf8);
                } else if (lf8.A06) {
                    WGH.A06(activity9, null);
                } else if (!lf8.A07) {
                    lf8.A07 = true;
                    AbstractC93174Ft.A01(activity9, lf8);
                }
                i2 = -1335203468;
                C0f9.A0C(i2, A052);
                return;
            case 52:
                KFD kfd = (KFD) this.A01;
                if (!KFD.A03(kfd)) {
                    return;
                }
                Lf8 lf82 = kfd.A03;
                lf82.getClass();
                if (AbstractC110854yx.A03(lf82.A0H)) {
                    KFD.A02(kfd);
                    return;
                } else {
                    AbstractC110854yx.A01(kfd.A03.A0I, true);
                    return;
                }
            case 53:
                KFD kfd2 = (KFD) this.A01;
                activity = kfd2.A0H;
                if (!AbstractC23451Ch.A07(activity, "android.permission.CAMERA") && kfd2.A0A) {
                    C14360o3.A0B(activity, 0);
                    WGH.A06(activity, null);
                    return;
                } else {
                    kfd2.A05();
                    return;
                }
            case 54:
                A00 = C0f9.A05(-1647746869);
                KFE kfe = ((C46047Ka0) this.A01).A00;
                if (kfe != null) {
                    KFE.A08(kfe, true);
                    i3 = -948876865;
                    C0f9.A0C(i3, A00);
                    return;
                }
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 55:
                LO8 lo8 = (LO8) this.A01;
                activity = lo8.A0D;
                if (AbstractC23451Ch.A07(activity, "android.permission.CAMERA") || !lo8.A0A) {
                    LO8.A02(lo8);
                    return;
                }
                WGH.A06(activity, null);
                return;
            case 56:
                LO8 lo82 = (LO8) this.A01;
                C66305U8d c66305U8d = lo82.A06;
                c66305U8d.getClass();
                c66305U8d.A09 = true;
                C66305U8d.A05(c66305U8d);
                lo82.A00 = (lo82.A00 + 1) % EnumC46219Kcv.values().length;
                LO8.A03(lo82);
                KFE kfe2 = lo82.A0G;
                int i6 = lo82.A00;
                kfe2.A02 = i6;
                GridPatternView gridPatternView = kfe2.A0M;
                EnumC46219Kcv enumC46219Kcv = (EnumC46219Kcv) EnumC46219Kcv.A04.get(i6);
                if (enumC46219Kcv == null) {
                    enumC46219Kcv = EnumC46219Kcv.A0A;
                }
                gridPatternView.setSticker(enumC46219Kcv.A02);
                return;
            case 57:
                A00 = C0f9.A05(-1634970822);
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(((C45468KBd) this.A01).A01);
                MBq.A01(A0Z2, AbstractC141776au.A00(A0Z2), 11);
                i3 = -1407084347;
                C0f9.A0C(i3, A00);
                return;
            case 58:
                A00 = C0f9.A05(-805202292);
                C44506JmC c44506JmC = (C44506JmC) ((C45468KBd) this.A01).A01.getValue();
                c44506JmC.A00 = UUID.randomUUID();
                MBq.A01(c44506JmC, AbstractC141776au.A00(c44506JmC), 10);
                i3 = 1678320145;
                C0f9.A0C(i3, A00);
                return;
            case 59:
                A00 = C0f9.A05(-825604826);
                C47757L7d c47757L7d = (C47757L7d) this.A01;
                C34979Fb6 c34979Fb6 = C34979Fb6.A00;
                Context context3 = c47757L7d.A00;
                if (context3 == null) {
                    str = "context";
                } else {
                    UserSession userSession5 = c47757L7d.A04;
                    if (userSession5 == null) {
                        str = "userSession";
                    } else {
                        C148676mc c148676mc = c47757L7d.A03;
                        if (c148676mc == null) {
                            str = "audLogging";
                        } else {
                            c34979Fb6.A00(context3, c148676mc, userSession5);
                            C3DO c3do = C3DN.A00;
                            Fragment fragment = c47757L7d.A02;
                            if (fragment == null) {
                                str = "fragment";
                            } else {
                                AbstractC167017dG.A0y(fragment.getActivity(), c3do);
                                i3 = 1395061261;
                                C0f9.A0C(i3, A00);
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 60:
                A00 = C0f9.A05(1871901615);
                C47757L7d c47757L7d2 = (C47757L7d) this.A01;
                c47757L7d2.A00();
                View.OnClickListener onClickListener2 = c47757L7d2.A01;
                if (onClickListener2 == null) {
                    str = "onCancelListener";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                onClickListener2.onClick(view);
                i3 = 1182689790;
                C0f9.A0C(i3, A00);
                return;
            case 61:
                A00 = C0f9.A05(817597701);
                String A0j = AbstractC167017dG.A0j();
                C44293Jhj c44293Jhj = (C44293Jhj) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c44293Jhj.A07);
                String str5 = c44293Jhj.A05;
                if (str5 == null) {
                    str = "surface";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (str5.equals("ig_self_profile")) {
                    str2 = "ig_self_profile_identity_sheet";
                } else {
                    str2 = "ig_edit_profile_identity_sheet";
                }
                LJH.A02(A0r, str2, A0j);
                C3DN A0m = AbstractC25230BEn.A0m(c44293Jhj);
                if (A0m != null) {
                    ((C3DP) A0m).A0H = new GH7(A0j, c44293Jhj, 0);
                    A0m.A0B();
                }
                i3 = -1080393774;
                C0f9.A0C(i3, A00);
                return;
            case 62:
                A00 = C0f9.A05(-1807075722);
                ((Jn8) this.A01).A09.Egh(C45433K9u.A00);
                i3 = 864026158;
                C0f9.A0C(i3, A00);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A00 = C0f9.A05(-1023533151);
                ((Jn8) this.A01).A09.Egh(C45435K9w.A00);
                i3 = -2122874790;
                C0f9.A0C(i3, A00);
                return;
            case 64:
                A00 = C0f9.A05(1328318621);
                ((Jn8) this.A01).A09.Egh(C45431K9s.A00);
                i3 = -643623111;
                C0f9.A0C(i3, A00);
                return;
            case 65:
                A00 = C0f9.A05(-1090500829);
                ((Jn8) this.A01).A09.Egh(KA0.A00);
                i3 = -264602223;
                C0f9.A0C(i3, A00);
                return;
            case 66:
                A00 = C0f9.A05(1797678448);
                ((Jn8) this.A01).A09.Egh(C45437K9y.A00);
                i3 = 26642700;
                C0f9.A0C(i3, A00);
                return;
            case 67:
                A00 = C0f9.A05(1937555364);
                ((Jn8) this.A01).A09.Egh(C45436K9x.A00);
                i3 = -334634989;
                C0f9.A0C(i3, A00);
                return;
            case 68:
                A00 = C0f9.A05(495700441);
                ((Jn8) this.A01).A09.Egh(KA2.A00);
                i3 = 1263741001;
                C0f9.A0C(i3, A00);
                return;
            case 69:
                A00 = C0f9.A05(-831059914);
                ((Jn8) this.A01).A09.Egh(C45438K9z.A00);
                i3 = 23356555;
                C0f9.A0C(i3, A00);
                return;
            default:
                A00 = C0f9.A05(1645903276);
                ((Jn8) this.A01).A09.Egh(KA1.A00);
                i3 = -464902772;
                C0f9.A0C(i3, A00);
                return;
        }
    }

    public static int A00(LQ0 lq0, int i) {
        int A05 = C0f9.A05(i);
        ((C44427JkQ) lq0.A01).A00();
        return A05;
    }
}
