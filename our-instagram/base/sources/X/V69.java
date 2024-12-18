package X;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes11.dex */
public final class V69 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C70807WhN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V69(C70807WhN c70807WhN) {
        super(1107014530, 3, false, false);
        this.A00 = c70807WhN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70807WhN c70807WhN = this.A00;
        String str = c70807WhN.A05;
        boolean A1b = AbstractC31177DnL.A1b(c70807WhN.A03);
        String str2 = c70807WhN.A04;
        try {
            C2056398n c2056398n = c70807WhN.A0A;
            Boolean valueOf = Boolean.valueOf(A1b);
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0S("emoji", str2);
            if (valueOf != null) {
                A0S.A0T("enabled", valueOf.booleanValue());
            }
            if (str != null) {
                A0S.A0S(AbstractC111324zv.A00(558), str);
            }
            AbstractC31171DnF.A1S(c2056398n, AbstractC167017dG.A0l(A0S, stringWriter), c2056398n.A0W, C2056398n.A0d, 4);
        } catch (IOException e) {
            C0w9.A06("DirectWelcomeMessageSettingManager", "Error while serializing WelcomeMessageItem", e);
        }
    }
}
