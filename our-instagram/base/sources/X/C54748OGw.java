package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.OGw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54748OGw {
    public final C18920wW A00;

    public C54748OGw(AbstractC12990ll abstractC12990ll, String str) {
        C19270xB c19270xB;
        C14360o3.A0B(abstractC12990ll, 1);
        if (str != null) {
            c19270xB = AbstractC31171DnF.A0D(str);
        } else {
            c19270xB = null;
        }
        this.A00 = AbstractC12220kQ.A01(c19270xB, abstractC12990ll);
    }

    public final void A00(Integer num) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "rage_shake_action");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                str = "turn_on";
                break;
            case 1:
                str = "turn_off";
                break;
            case 2:
                str = "report_bug";
                break;
            case 3:
                str = "cancel";
                break;
            case 4:
                str = "cancel_navigation";
                break;
            case 5:
                str = "cancel_dont_send";
                break;
            case 6:
                str = "learn_more_abuse_or_spam";
                break;
            case 7:
                str = "learn_more_data_policy";
                break;
            case 8:
                str = "submit_clicked_success";
                break;
            case 9:
                str = "submit_clicked_failed_missing_description";
                break;
            case 10:
                str = "submit_clicked_failed_processing_logs";
                break;
            case 11:
                str = "submit_clicked_failed_processing_previous_submit";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "retry_launched";
                break;
            default:
                str = "bug_submit_failure_dismiss";
                break;
        }
        AbstractC31175DnJ.A15(A0f, str);
    }
}
