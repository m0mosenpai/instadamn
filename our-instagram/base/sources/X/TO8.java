package X;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class TO8 implements Runnable {
    public final /* synthetic */ SZG A00;
    public final /* synthetic */ Integer A01;

    public TO8(SZG szg, Integer num) {
        this.A00 = szg;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SZG szg = this.A00;
        InterfaceC65372Tj4 interfaceC65372Tj4 = (InterfaceC65372Tj4) szg.A05.get();
        if (interfaceC65372Tj4 != null) {
            try {
                Integer num = this.A01;
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) interfaceC65372Tj4;
                C14360o3.A0B(num, 0);
                K5W k5w = selfieCaptureActivity.A04;
                String str = "cameraOverlayFragment";
                if (k5w != null) {
                    if (!SelfieCaptureActivity.A01(k5w)) {
                        K5V k5v = (K5V) k5w;
                        Context context = k5v.getContext();
                        if (context != null) {
                            int intValue = num.intValue();
                            if (intValue != 1) {
                                ResourcesProgressBar resourcesProgressBar = k5v.A07;
                                if (intValue != 2) {
                                    if (resourcesProgressBar != null) {
                                        resourcesProgressBar.setVisibility(8);
                                    }
                                    C14360o3.A0F("loadingView");
                                } else {
                                    if (resourcesProgressBar != null) {
                                        resourcesProgressBar.setVisibility(8);
                                        new AlertDialog.Builder(context).setTitle(R.string.res_0x7f1300d1_name_removed).setMessage(R.string.res_0x7f1300cf_name_removed).setNegativeButton(R.string.res_0x7f1300ac_name_removed, new DialogInterfaceOnClickListenerC63420Sjy(k5v.getActivity(), 5)).show();
                                    }
                                    C14360o3.A0F("loadingView");
                                }
                            } else {
                                ResourcesProgressBar resourcesProgressBar2 = k5v.A07;
                                if (resourcesProgressBar2 != null) {
                                    resourcesProgressBar2.setVisibility(0);
                                }
                                C14360o3.A0F("loadingView");
                            }
                            throw C00O.createAndThrow();
                        }
                        Integer num2 = C05F.A0N;
                        if (num == num2) {
                            C63962Swn c63962Swn = selfieCaptureActivity.A03;
                            if (c63962Swn != null) {
                                WeakReference A16 = AbstractC25225BEi.A16(c63962Swn);
                                View view = new View(selfieCaptureActivity);
                                view.setId(R.id.btn_start_flow_auto);
                                view.setFocusable(false);
                                view.setFocusableInTouchMode(false);
                                ViewOnClickListenerC63508Sob.A01(view, 26, A16);
                                view.setScaleX(0.001f);
                                view.setScaleY(0.001f);
                                FrameLayout frameLayout = selfieCaptureActivity.A00;
                                if (frameLayout == null) {
                                    str = "parentContainer";
                                } else {
                                    frameLayout.addView(view, new ViewGroup.LayoutParams(1, 1));
                                }
                            }
                        } else if (num == C05F.A0C) {
                            C63962Swn c63962Swn2 = selfieCaptureActivity.A03;
                            if (c63962Swn2 != null) {
                                if (c63962Swn2.A0A == C05F.A01) {
                                    c63962Swn2.A0A = num2;
                                    C62576SHb c62576SHb = c63962Swn2.A0O;
                                    if (c62576SHb != null) {
                                        c62576SHb.A01.cancel();
                                    }
                                    C63962Swn.A01(c63962Swn2);
                                }
                            }
                        }
                        str = "presenter";
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            } catch (Exception e) {
                szg.A04.logError(AnonymousClass001.A0I("Error while notifying selfie capture view of model load state change (ord: ", ')', this.A01.intValue()), e);
            }
        }
        Integer num3 = this.A01;
        if (num3 == C05F.A0N || num3 == C05F.A0C) {
            szg.A09 = false;
        }
    }
}
