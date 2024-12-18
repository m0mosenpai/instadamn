package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;

/* loaded from: classes9.dex */
public final class OuS implements InterfaceC12850lX {
    public Activity A00;
    public Dialog A01;
    public Dialog A02;
    public BugReportComposerViewModel A03;
    public InterfaceC58266PsA A04;
    public BugReport A05;
    public NAU A06;
    public final AbstractC12990ll A07;

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
        C14360o3.A0B(activity, 0);
        if (activity.isFinishing() && (activity instanceof BugReporterActivity) && this.A05 == null && AbstractC46222Ag.A00()) {
            AbstractC12860lY.A08(this);
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        C14360o3.A0B(activity, 0);
        this.A00 = activity;
        if (activity instanceof BugReporterActivity) {
            this.A05 = null;
        }
        if (this.A05 != null) {
            int color = activity.getColor(R.color.bugreporter_take_screenshot);
            Activity activity2 = this.A00;
            if (activity2 != null) {
                View inflate = LayoutInflater.from(activity2).inflate(R.layout.bugreporter_screen_capture_button, (ViewGroup) null, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageButton");
                ImageView imageView = (ImageView) inflate;
                imageView.setImageResource(R.drawable.take_screenshot_icon);
                AbstractC56952jT.A01(imageView);
                ViewOnClickListenerC55467OkM.A00(imageView, 62, this);
                Activity activity3 = this.A00;
                if (activity3 != null) {
                    Dialog dialog = new Dialog(activity3);
                    dialog.setContentView(imageView);
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.addFlags(40);
                        window.clearFlags(2);
                        window.setGravity(85);
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        Activity activity4 = this.A00;
                        if (activity4 != null) {
                            attributes.x = activity4.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                            Activity activity5 = this.A00;
                            if (activity5 != null) {
                                attributes.y = activity5.getResources().getDimensionPixelOffset(R.dimen.abc_list_item_height_material);
                                window.setAttributes(attributes);
                                this.A02 = dialog;
                                View inflate2 = LayoutInflater.from(this.A00).inflate(R.layout.bugreporter_cancel_banner, (ViewGroup) null, false);
                                C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.Button");
                                TextView textView = (TextView) inflate2;
                                textView.setText(2131954373);
                                textView.setBackgroundColor(color);
                                ViewOnClickListenerC55467OkM.A00(textView, 63, this);
                                Activity activity6 = this.A00;
                                if (activity6 != null) {
                                    Dialog dialog2 = new Dialog(activity6);
                                    this.A01 = dialog2;
                                    dialog2.setContentView(textView);
                                    Dialog dialog3 = this.A01;
                                    if (dialog3 != null) {
                                        Window window2 = dialog3.getWindow();
                                        if (window2 != null) {
                                            window2.addFlags(40);
                                            window2.clearFlags(2);
                                            window2.setGravity(48);
                                            WindowManager.LayoutParams attributes2 = window2.getAttributes();
                                            ((ViewGroup.LayoutParams) attributes2).width = -1;
                                            ((ViewGroup.LayoutParams) attributes2).height = -2;
                                            window2.setAttributes(attributes2);
                                            Dialog dialog4 = this.A02;
                                            if (dialog4 != null) {
                                                C0fJ.A00(dialog4);
                                                Dialog dialog5 = this.A01;
                                                if (dialog5 != null) {
                                                    C0fJ.A00(dialog5);
                                                    return;
                                                }
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    public static final void A00(Bitmap bitmap, OuS ouS) {
        U7K u7k = U7H.A04;
        AbstractC12990ll abstractC12990ll = ouS.A07;
        Activity activity = ouS.A00;
        if (activity != null) {
            BugReport bugReport = ouS.A05;
            if (bugReport != null) {
                BugReportComposerViewModel bugReportComposerViewModel = ouS.A03;
                if (bugReportComposerViewModel != null) {
                    InterfaceC58266PsA interfaceC58266PsA = ouS.A04;
                    if (interfaceC58266PsA == null) {
                        C14360o3.A0F("userFlowLoggerV2");
                        throw C00O.createAndThrow();
                    }
                    NAU nau = new NAU(activity, bitmap, bugReportComposerViewModel, interfaceC58266PsA, bugReport, abstractC12990ll);
                    ouS.A06 = nau;
                    AbstractC31174DnI.A1N(nau);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        NAU nau = this.A06;
        if (nau != null) {
            nau.A06();
        }
        this.A06 = null;
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A02 = null;
        Dialog dialog2 = this.A01;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.A01 = null;
        this.A00 = null;
    }

    public OuS(AbstractC12990ll abstractC12990ll) {
        this.A07 = abstractC12990ll;
    }
}
