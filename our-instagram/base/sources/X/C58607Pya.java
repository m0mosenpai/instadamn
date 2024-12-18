package X;

import android.app.Activity;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pya, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58607Pya implements InterfaceC23471Cj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC23471Cj A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Map A04;

    public C58607Pya(Activity activity, InterfaceC23471Cj interfaceC23471Cj, Runnable runnable, List list, Map map) {
        this.A01 = interfaceC23471Cj;
        this.A04 = map;
        this.A03 = list;
        this.A00 = activity;
        this.A02 = runnable;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        InterfaceC23471Cj interfaceC23471Cj = this.A01;
        if (interfaceC23471Cj != null) {
            Map map2 = this.A04;
            map2.putAll(map);
            List list = this.A03;
            list.addAll(map2.keySet());
            interfaceC23471Cj.DYE(AbstractC23451Ch.A02(this.A00, AbstractC31173DnH.A1b(list, 0)));
        }
        Runnable runnable = this.A02;
        if (runnable != null) {
            runnable.run();
        }
    }
}
