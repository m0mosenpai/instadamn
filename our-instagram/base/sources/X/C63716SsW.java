package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SsW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63716SsW implements InterfaceC65569Tn2 {
    public static final java.util.Set A03 = C16910sj.A00;
    public final Map A00;
    public final Map A01;
    public final /* synthetic */ C63719SsZ A02;

    public C63716SsW(Map map, Map map2, long j) {
        this.A00 = map;
        this.A01 = map2;
        this.A02 = new C63719SsZ("com.bloks.www.iaw.autofill.contact.usage.bottomsheet.screen_query", null, null, map, map2, 772803329, j, true);
    }

    @Override // X.InterfaceC65569Tn2
    public final String Bqk() {
        return null;
    }

    @Override // X.InterfaceC65569Tn2
    public final java.util.Set Ajb(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        AbstractC167017dG.A1N(interfaceC65469Tkm, anonymousClass637);
        return this.A02.Ajb(interfaceC65469Tkm, anonymousClass637);
    }

    @Override // X.InterfaceC65569Tn2
    public final void COy(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        AbstractC167017dG.A1N(interfaceC65469Tkm, anonymousClass637);
        this.A02.COy(interfaceC65469Tkm, anonymousClass637);
    }

    @Override // X.InterfaceC65569Tn2
    public final void E2V(Context context, InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        AbstractC167027dH.A12(context, anonymousClass637, interfaceC65469Tkm);
        this.A02.E2V(context, interfaceC65469Tkm, anonymousClass637);
    }

    @Override // X.InterfaceC65569Tn2
    public final void E5D(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637, MPY mpy, boolean z) {
        AbstractC167017dG.A1O(interfaceC65469Tkm, anonymousClass637);
        this.A02.E5D(interfaceC65469Tkm, anonymousClass637, mpy, z);
    }
}
