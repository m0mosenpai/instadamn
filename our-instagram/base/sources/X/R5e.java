package X;

import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;

/* loaded from: classes10.dex */
public final class R5e extends T0b {
    public final SKS A00;
    public final R3N A01;
    public final String A02;
    public final /* synthetic */ SZN A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5e(SKS sks, R3N r3n, SZN szn, String str, int i) {
        super(szn, i);
        this.A03 = szn;
        this.A01 = r3n;
        this.A02 = str;
        this.A00 = sks;
        Systrace.A07(33554432L, "createView", super.A00);
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        int i = super.A00;
        Systrace.A05(33554432L, "createView", i);
        C63309ShF c63309ShF = this.A03.A0L;
        R3N r3n = this.A01;
        String str = this.A02;
        SKS sks = this.A00;
        synchronized (c63309ShF) {
            AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "NativeViewHierarchyManager_createView", 33554432L);
            A00.A01("tag", i);
            A00.A00(str, "className");
            A00.A02();
            try {
                ViewManager A002 = c63309ShF.A07.A00(str);
                c63309ShF.A03.put(i, A002.createView(i, r3n, sks, null, c63309ShF.A05));
                c63309ShF.A02.put(i, A002);
                C0fY.A00(33554432L, 892176907);
            } catch (Throwable th) {
                C0fY.A00(33554432L, -1006303975);
                throw th;
            }
        }
    }
}
