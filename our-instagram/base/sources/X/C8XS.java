package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8XS, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XS implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8XH A00;

    public C8XS(C8XH c8xh) {
        this.A00 = c8xh;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC58362lv) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8XH.class, "openClipsShareSheetFromSubFragment", "openClipsShareSheetFromSubFragment(Lcom/instagram/util/mediacapture/Video;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C195868lW c195868lW = (C195868lW) obj;
        C14360o3.A0B(c195868lW, 0);
        C8XH c8xh = this.A00;
        C1816783z c1816783z = c8xh.A04;
        List singletonList = Collections.singletonList(new C198308pf(c195868lW));
        C14360o3.A07(singletonList);
        c1816783z.A09(singletonList);
        c8xh.A06.E4u(new Object());
    }
}
