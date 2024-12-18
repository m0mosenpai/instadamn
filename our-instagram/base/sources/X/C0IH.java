package X;

import java.io.File;

/* renamed from: X.0IH, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0IH implements C0LV {
    public final /* synthetic */ C0NK A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C0IH(C0NK c0nk, boolean z) {
        this.A00 = c0nk;
        this.A01 = z;
    }

    @Override // X.C0LV
    public final void DWC(C0M6 c0m6, C0OO c0oo) {
        C0PI c0pi;
        String str;
        String str2;
        File file;
        C0OP BW2;
        C0NK c0nk = this.A00;
        boolean z = this.A01;
        if (C0M4.A01 == 1 && ((BW2 = c0oo.BW2()) == C0OP.A0H || BW2 == C0OP.A0X || BW2 == C0OP.A0O || BW2 == C0OP.A06)) {
            c0pi = (C0PI) c0nk.A06().get();
            str = c0nk.A05().A07;
            str2 = BW2.A00;
        } else {
            c0pi = (C0PI) c0nk.A06().get();
            str = c0nk.A05().A07;
            str2 = "";
        }
        C0BJ.A00(AnonymousClass001.A0u("processCurrentSession.", c0m6.name(), ".", str));
        try {
            synchronized (C0PI.A05) {
                File[] A04 = c0pi.A00.A04(str);
                int length = A04.length - 1;
                if (length >= 0) {
                    File file2 = A04[length];
                    if (length > 0) {
                        file = A04[length - 1];
                    } else {
                        file = null;
                    }
                    C0PI.A00(c0m6, c0pi, file2, file, str2);
                }
            }
            if (z) {
                ((C0PR) c0nk.A0W.get()).A03(c0m6, false);
            }
        } finally {
            C0BI.A00();
        }
    }
}
