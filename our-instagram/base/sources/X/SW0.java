package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class SW0 {
    public ExecutorService A00;
    public final File A01;

    public SW0(C1B4 c1b4, ExecutorService executorService) {
        C14360o3.A0B(executorService, 2);
        File file = null;
        try {
            file = c1b4.AXd(null, 384226697);
        } catch (Exception unused) {
        }
        this.A00 = executorService;
        this.A01 = file;
    }

    public static final File A00(SW0 sw0, String str) {
        File file = sw0.A01;
        if (file == null) {
            return null;
        }
        StringBuilder A11 = AbstractC166997dE.A11("callSummaryInfo");
        A11.append('.');
        A11.append(str);
        return MSW.A0w(file, AbstractC166997dE.A0x(".callsum", A11));
    }
}
