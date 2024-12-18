package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LP0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public LP0(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1420820408);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                C50120MBu.A01(abstractC52922bZ, this.A02, AbstractC141776au.A00(abstractC52922bZ), 21);
                i = -2065474947;
                C0f9.A0C(i, A05);
                return;
            case 1:
                int A052 = C0f9.A05(1463097750);
                BugReportComposerFragment bugReportComposerFragment = (BugReportComposerFragment) this.A01;
                if (bugReportComposerFragment.A09) {
                    String A00 = MSV.A00(316);
                    C0K8.A0D(A00, "Ignoring click because we are processing an action");
                    C0f5 AEp = C18950wb.A01.AEp(A00, 817892340);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Ignoring bug composer screenshot click because we are processing an action");
                    AEp.report();
                } else {
                    int A0D = AbstractC25230BEn.A0D(view.getTag(), "null cannot be cast to non-null type kotlin.Int");
                    String str = this.A02;
                    FragmentActivity activity = bugReportComposerFragment.getActivity();
                    InterfaceC58266PsA interfaceC58266PsA = bugReportComposerFragment.A07;
                    if (interfaceC58266PsA == null) {
                        C14360o3.A0F("userFlowLoggerV2");
                        throw C00O.createAndThrow();
                    }
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("ImageAnnotationFragment.imagePath", str);
                    A0b.putAll(interfaceC58266PsA.E4I());
                    C45473KBl c45473KBl = new C45473KBl();
                    c45473KBl.setArguments(A0b);
                    c45473KBl.A00 = new BugReportComposerFragment$onClickScreenshotThumbnail$1(bugReportComposerFragment, A0D);
                    if (activity != null) {
                        C140966Yy A0r = AbstractC25225BEi.A0r(activity, bugReportComposerFragment.getSession());
                        A0r.A0D(c45473KBl);
                        A0r.A0E = true;
                        A0r.A04();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C0f9.A0C(742835373, A052);
                return;
            case 2:
                A05 = C0f9.A05(-77854292);
                MOB mob = ((C46076KaY) this.A01).A00;
                if (mob != null) {
                    C14360o3.A0A(view);
                    String str2 = this.A02;
                    if (str2 != null) {
                        mob.DLS(view, str2);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0C(1995147684, A05);
                        throw A0g;
                    }
                }
                i = -1365580771;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(1913162686);
                ((C44561Jni) this.A01).A03.invoke(this.A02);
                i = 1204448790;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(320679789);
                ((Jn5) ((C45505KCu) this.A01).A07.getValue()).A04(this.A02);
                i = -56842511;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(1087145666);
                KDK kdk = (KDK) this.A01;
                LKo.A01(kdk.requireActivity(), null, AbstractC166987dD.A0r(kdk.A0Q), null, kdk.A0N, this.A02, false);
                i = -351369611;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1294562995);
                UserSession session = ((C53Z) this.A01).getSession();
                M8Z m8z = new M8Z(3, this, view);
                C14360o3.A0B(session, 0);
                AbstractC47168Kt3.A00.A01(session, EnumC132075xi.A0Y, new C50363MLp(37, m8z, session));
                i = -271810254;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
