package X;

import android.os.Bundle;

/* renamed from: X.OTh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54975OTh {
    public final InterfaceC58268PsC A00;
    public final String A01;
    public final String A02;

    public static final Bundle A00(C54975OTh c54975OTh, String str) {
        return AbstractC167017dG.A0T("question_type", str, AbstractC166987dD.A1L("form_id", c54975OTh.A02));
    }

    public C54975OTh(InterfaceC58268PsC interfaceC58268PsC, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = interfaceC58268PsC;
        this.A01 = str;
        this.A02 = str2;
    }
}
