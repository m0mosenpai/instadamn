package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* loaded from: classes8.dex */
public final class M72 implements Runnable {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ C47812L9u A01;
    public final /* synthetic */ C59459Qeu A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16660sJ A06;

    public M72(ImmutableList immutableList, C47812L9u c47812L9u, C59459Qeu c59459Qeu, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c47812L9u;
        this.A02 = c59459Qeu;
        this.A06 = interfaceC16660sJ;
        this.A00 = immutableList;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C47812L9u c47812L9u = this.A01;
        c47812L9u.A01();
        C59459Qeu c59459Qeu = this.A02;
        if (c59459Qeu != null) {
            String A07 = c59459Qeu.A07(DialogModule.KEY_MESSAGE);
            if (A07 == null) {
                A07 = AbstractC166997dE.A0p(c47812L9u.A04, 2131958914);
            }
            this.A06.invoke(A07);
        } else {
            ImmutableList immutableList = this.A00;
            if (immutableList != null && AbstractC166987dD.A1b(immutableList)) {
                C1LC A0I = AbstractC43592JPx.A0I(immutableList);
                while (A0I.hasNext()) {
                    String str2 = (String) A0I.next();
                    RewriteTextBubbleViewPager rewriteTextBubbleViewPager = c47812L9u.A06;
                    if (rewriteTextBubbleViewPager != null) {
                        C14360o3.A0A(str2);
                        String str3 = this.A03;
                        if ("REPHRASE".equals("REPHRASE")) {
                            str = AbstractC166997dE.A0q(c47812L9u.A04.getResources(), 2131972349);
                        } else {
                            str = "";
                        }
                        rewriteTextBubbleViewPager.A0T(1, str2, str3, str, this.A04);
                    }
                }
            }
        }
        this.A05.invoke();
    }
}
