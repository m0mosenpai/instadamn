package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Lxd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49708Lxd implements InterfaceC42241xE {
    public final /* synthetic */ C165957bN A00;
    public final /* synthetic */ C7YT A01;
    public final /* synthetic */ String A02;

    public C49708Lxd(C165957bN c165957bN, C7YT c7yt, String str) {
        this.A00 = c165957bN;
        this.A01 = c7yt;
        this.A02 = str;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        MsysThreadId msysThreadId = (MsysThreadId) obj;
        C7YU c7yu = (C7YU) this.A00.A0R.invoke();
        if (msysThreadId != null) {
            C7YT c7yt = this.A01;
            String str = this.A02;
            C7LR c7lr = c7yu.A00;
            if (c7lr != null) {
                c7lr.A00(c7yt, new C83693oE(str), msysThreadId);
                return;
            } else {
                C14360o3.A0F("statusLogger");
                throw C00O.createAndThrow();
            }
        }
        throw AbstractC166997dE.A0g();
    }
}
