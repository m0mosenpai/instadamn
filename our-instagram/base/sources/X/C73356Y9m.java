package X;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* renamed from: X.Y9m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73356Y9m implements YNY {
    @Override // X.YNY
    public final /* bridge */ /* synthetic */ AbstractC72463XeB BTc() {
        C72178XRo c72178XRo = new C72178XRo();
        try {
            Scanner scanner = new Scanner(new File(AbstractC111324zv.A00(1473)));
            try {
                scanner.nextLong();
                c72178XRo.A00 = Long.valueOf((scanner.nextLong() * 4) - (scanner.nextLong() * 4));
                scanner.close();
                return c72178XRo;
            } finally {
            }
        } catch (IOException | InputMismatchException e) {
            C0K8.A0F("ProcStatmMetricsCollector", "cant parse statm file", e);
            return c72178XRo;
        }
    }
}
