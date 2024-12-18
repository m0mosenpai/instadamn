package X;

import android.database.sqlite.SQLiteStatement;
import java.io.IOException;

/* renamed from: X.AGp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23103AGp {
    public final InterfaceC37481ol A00;
    public final InterfaceC189288a4 A01;
    public final boolean A02;

    public static void A00(C23103AGp c23103AGp, String str) {
        try {
            C37551os AIj = c23103AGp.A00.AIj(str);
            try {
                SQLiteStatement sQLiteStatement = AIj.A00;
                C0fW.A00(-1373470719);
                sQLiteStatement.execute();
                C0fW.A00(-1154077242);
                AIj.close();
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193 A[LOOP:7: B:52:0x018d->B:54:0x0193, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23103AGp.A01():void");
    }

    public C23103AGp(InterfaceC37481ol interfaceC37481ol, InterfaceC189288a4 interfaceC189288a4, boolean z) {
        this.A01 = interfaceC189288a4;
        this.A00 = interfaceC37481ol;
        this.A02 = z;
    }
}
