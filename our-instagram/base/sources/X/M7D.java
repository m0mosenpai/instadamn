package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* loaded from: classes8.dex */
public final class M7D implements Runnable {
    public final /* synthetic */ C47812L9u A00;
    public final /* synthetic */ Qf0 A01;
    public final /* synthetic */ Qf1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    public M7D(C47812L9u c47812L9u, Qf0 qf0, Qf1 qf1, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c47812L9u;
        this.A01 = qf0;
        this.A07 = interfaceC16660sJ;
        this.A04 = str;
        this.A02 = qf1;
        this.A05 = str2;
        this.A03 = str3;
        this.A06 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C47812L9u c47812L9u = this.A00;
        c47812L9u.A01();
        Qf0 qf0 = this.A01;
        if (qf0 != null) {
            String A07 = qf0.A07(DialogModule.KEY_MESSAGE);
            if (A07 == null) {
                A07 = AbstractC166997dE.A0p(c47812L9u.A04, 2131958914);
            }
            this.A07.invoke(A07);
        } else {
            String str2 = this.A04;
            if (str2.length() > 0) {
                Qf1 qf1 = this.A02;
                if (qf1 != null) {
                    str = qf1.A08("response_id");
                } else {
                    str = null;
                }
                RewriteTextBubbleViewPager rewriteTextBubbleViewPager = c47812L9u.A06;
                if (rewriteTextBubbleViewPager != null) {
                    rewriteTextBubbleViewPager.A0T(null, str2, str, this.A05, this.A03);
                }
            }
        }
        this.A06.invoke();
    }
}
