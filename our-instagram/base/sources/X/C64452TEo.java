package X;

import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;

/* renamed from: X.TEo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64452TEo implements InterfaceC65451TkN {
    public final /* synthetic */ RunnableC64709TQq A00;

    public C64452TEo(RunnableC64709TQq runnableC64709TQq) {
        this.A00 = runnableC64709TQq;
    }

    @Override // X.InterfaceC65451TkN
    public final void CyT(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        RunnableC64709TQq runnableC64709TQq = this.A00;
        runnableC64709TQq.A01.A02.A00(false);
        runnableC64709TQq.A02.CyT(browserExtensionsAutofillData);
    }
}
