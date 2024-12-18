package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SzY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64116SzY implements InterfaceC65574Tn8 {
    public final EventBuilder A00;
    public final C100684fX A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC65574Tn8
    public final void A8W(Exception exc) {
    }

    @Override // X.InterfaceC65574Tn8
    public final void A9R(String str) {
        this.A00.annotate(DialogModule.KEY_MESSAGE, str);
    }

    @Override // X.InterfaceC65574Tn8
    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    @Override // X.InterfaceC65574Tn8
    public final void report() {
        EventBuilder eventBuilder = this.A00;
        if (eventBuilder.isSampled()) {
            Iterator it = AbstractC06930Yk.A0E().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                eventBuilder.annotate(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
            }
            eventBuilder.report();
        }
    }

    public C64116SzY(C100684fX c100684fX, Integer num, InterfaceC09390do interfaceC09390do) {
        AbstractC167017dG.A1R(interfaceC09390do, c100684fX);
        this.A02 = interfaceC09390do;
        this.A01 = c100684fX;
        this.A00 = ((LightweightQuickPerformanceLogger) interfaceC09390do.getValue()).markEventBuilder(AbstractC62788SRh.A00(num), AbstractC62788SRh.A01(num));
    }

    @Override // X.InterfaceC65574Tn8
    public final void ABZ(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.annotate(str, str2);
    }
}
