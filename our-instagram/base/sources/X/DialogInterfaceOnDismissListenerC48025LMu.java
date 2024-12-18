package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.LMu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnDismissListenerC48025LMu implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC48025LMu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC48025LMu(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        InterfaceC19610xo A0w;
        String str;
        InterfaceC02590Ai A0f;
        switch (this.A00) {
            case 0:
                C44521JmR c44521JmR = (C44521JmR) ((C45523KDo) this.A01).A02.getValue();
                LLN lln = c44521JmR.A00;
                Integer num = C05F.A04;
                CreatorLoggingData creatorLoggingData = c44521JmR.A01;
                lln.A0B(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), num, creatorLoggingData.A00);
                return;
            case 1:
                C47983LJh c47983LJh = (C47983LJh) this.A01;
                C44881Jtv A01 = C47983LJh.A01(c47983LJh, C05F.A00, C05F.A04);
                LGT lgt = c47983LJh.A01;
                String str2 = c47983LJh.A00.A03;
                AbstractC167017dG.A1N(str2, A01);
                A0f = AbstractC166987dD.A0f(lgt.A02, "user_click_appreciationfeed_exit");
                if (!A0f.isSampled()) {
                    return;
                }
                JQ0.A13(LGT.A00(A0f, lgt, AbstractC50529MSi.A01(), str2), A0f, A01);
                A0f.Cht();
                return;
            case 2:
                A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(((DialogC44330JiS) this.A01).A00), "instagram_android_13_notifications_priming_event");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.AAP("experiment_group", "no_in_test");
                A0f.AAP("event_name", "mock_system_dialog_dismissed");
                A0f.Cht();
                return;
            case 3:
                ((ViewOnClickListenerC44269JhH) this.A01).A02 = null;
                return;
            case 4:
                AbstractC23021Ah.A00((UserSession) this.A01).A1W(true);
                return;
            case 5:
                KCM kcm = (KCM) this.A01;
                if (!kcm.isAdded()) {
                    return;
                }
                AbstractC43593JPy.A0U(kcm).APg(kcm);
                return;
            case 6:
                z = true;
                A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(((C45484KBy) this.A01).A0A));
                str = "has_seen_open_sender_reel_preview_dialog";
                A0w.E77(str, z);
                A0w.apply();
                return;
            case 7:
                z = true;
                A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(((C45484KBy) this.A01).A0A));
                str = "has_seen_open_receiver_reel_preview_dialog";
                A0w.E77(str, z);
                A0w.apply();
                return;
            case 8:
                ((InterfaceC1119153d) this.A01).Czx();
                return;
            case 9:
                AbstractC25231BEo.A16((Fragment) this.A01);
                return;
            case 10:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 11:
                C45510KCz.A03((C45510KCz) this.A01).A05(true);
                return;
        }
    }
}
