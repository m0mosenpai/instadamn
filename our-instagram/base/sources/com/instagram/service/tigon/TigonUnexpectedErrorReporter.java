package com.instagram.service.tigon;

import X.C0f5;
import X.C0f6;
import X.C14360o3;
import X.C18950wb;

/* loaded from: classes.dex */
public final class TigonUnexpectedErrorReporter {
    public final C0f6 A00 = C18950wb.A01;

    public final void report(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C0f5 AEp = this.A00.AEp(str, 817903658);
        AEp.ABW("error_message", str2);
        AEp.report();
    }
}
