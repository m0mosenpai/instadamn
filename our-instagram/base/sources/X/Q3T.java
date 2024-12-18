package X;

import android.os.FileObserver;

/* loaded from: classes10.dex */
public final class Q3T extends FileObserver {
    public final /* synthetic */ C1UI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC08830cm A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3T(C1UI c1ui, String str, String str2, InterfaceC08830cm interfaceC08830cm) {
        super(str, 2);
        this.A00 = c1ui;
        this.A01 = str2;
        this.A02 = interfaceC08830cm;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        C1UI c1ui = this.A00;
        String str2 = this.A01;
        c1ui.A02.put(str2, new C1UP(str2, c1ui.A04, this.A02, c1ui.A00, c1ui.A06));
    }
}
