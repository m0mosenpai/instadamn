package X;

import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.List;

/* renamed from: X.PQg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56990PQg implements Runnable {
    public final /* synthetic */ IgdsFaceSwarm A00;
    public final /* synthetic */ List A01;

    public RunnableC56990PQg(IgdsFaceSwarm igdsFaceSwarm, List list) {
        this.A00 = igdsFaceSwarm;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgdsFaceSwarm.A05(this.A00, this.A01);
    }
}
