package X;

import android.os.Bundle;

/* renamed from: X.OTi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54976OTi {
    public final InterfaceC58268PsC A00;
    public final String A01;
    public final String A02;

    public static final Bundle A00(C54976OTi c54976OTi, String str, String str2) {
        Bundle A06 = AbstractC31178DnM.A06("form_id", c54976OTi.A02);
        if (str != null) {
            A06.putString("question_type", str);
        }
        if (str2 != null) {
            A06.putString("pii_question_type", str2);
        }
        return A06;
    }

    public C54976OTi(InterfaceC58268PsC interfaceC58268PsC, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = interfaceC58268PsC;
        this.A01 = str;
        this.A02 = str2;
    }
}
