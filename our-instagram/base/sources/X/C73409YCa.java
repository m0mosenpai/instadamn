package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.YCa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73409YCa implements YRK {
    public YRK A00;
    public C72695XlO A01;

    @Override // X.YRK, X.YNq
    public final /* bridge */ /* synthetic */ void APm(Object obj) {
        try {
            this.A00.APm(obj);
        } catch (Throwable th) {
            String A0R = AnonymousClass001.A0R("Error on dispatching action ", AbstractC31173DnH.A0q(obj));
            C0f5 AEp = C18950wb.A01.AEp("ZeroDispatchError", 817900293);
            AEp.ABW(DialogModule.KEY_MESSAGE, A0R);
            AEp.ERI(th);
            AEp.report();
        }
    }

    @Override // X.YRK
    public final /* bridge */ /* synthetic */ Object getState() {
        return this.A00.getState();
    }
}
