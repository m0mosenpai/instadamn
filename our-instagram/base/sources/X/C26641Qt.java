package X;

import java.io.IOException;

/* renamed from: X.1Qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26641Qt extends C19Q {
    public static boolean A03;
    public static final C11L A04 = new C11L("/?\\d{2,}[_\\-\\d]*/?");
    public final C1QY A00;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9EK(this, 18));
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C9EK(this, 17));

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        C14360o3.A0B(iOException, 1);
        C2ZI c2zi = C2ZI.A00;
        InterfaceC09390do interfaceC09390do = this.A01;
        String str = (String) interfaceC09390do.getValue();
        InterfaceC09390do interfaceC09390do2 = this.A02;
        c2zi.A0A(str, AnonymousClass001.A0R((String) interfaceC09390do2.getValue(), "_failed"));
        C2ZI.A00.A0C((String) interfaceC09390do.getValue(), AnonymousClass001.A0R((String) interfaceC09390do2.getValue(), "_error_message"), iOException.getMessage());
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        C2ZI.A00.A0A((String) this.A01.getValue(), AnonymousClass001.A0R((String) this.A02.getValue(), "_end"));
    }

    public C26641Qt(C1QY c1qy) {
        this.A00 = c1qy;
    }
}
