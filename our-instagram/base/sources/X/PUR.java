package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUR implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ OUQ A05;
    public final /* synthetic */ boolean A06;

    public PUR(Context context, UserSession userSession, OUQ ouq, int i, int i2, long j, boolean z) {
        this.A05 = ouq;
        this.A03 = context;
        this.A06 = z;
        this.A04 = userSession;
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0138, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r12, 0), r12, 36319888429227771L) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0122, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r13, 0), r13, 36327172692654445L) != false) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x0287. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a7  */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.XC9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [X.X9V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [X.PpU, X.WZ3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.OW6, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PUR.call():java.lang.Object");
    }
}
