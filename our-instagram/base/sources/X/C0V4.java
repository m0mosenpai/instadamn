package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: X.0V4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V4 implements C0LV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C0V4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C0LV
    public final void DWC(C0M6 c0m6, C0OO c0oo) {
        switch (this.A00) {
            case 0:
                AbstractC04970Nw.A00((C0NK) this.A02, ((C0eO) this.A01).A00);
                return;
            case 1:
                C06M c06m = (C06M) c0oo;
                if (!c06m.A03) {
                    return;
                }
                C07D c07d = (C07D) this.A02;
                long j = c06m.A00;
                C0Pe A05 = ((C0NK) this.A01).A05();
                C14360o3.A07(A05);
                File file = c07d.A00;
                if (!file.exists()) {
                    return;
                }
                String str = A05.A08;
                C14360o3.A07(str);
                try {
                    FileWriter fileWriter = new FileWriter(new File(file, AnonymousClass001.A0R(str, OptSvcAnalyticsStore.FILE_SUFFIX)));
                    try {
                        fileWriter.write(String.valueOf(j));
                        fileWriter.close();
                        return;
                    } finally {
                    }
                } catch (IOException unused) {
                    return;
                }
            default:
                C0N9 c0n9 = (C0N9) this.A01;
                C0NK c0nk = (C0NK) this.A02;
                C0LR c0lr = (C0LR) c0n9.ALP(c0nk);
                if (c0lr != null) {
                    C005801x.A02(c0lr, c0nk.A04(), C0M6.CRITICAL_REPORT);
                    return;
                }
                return;
        }
    }
}
