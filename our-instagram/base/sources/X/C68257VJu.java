package X;

import java.util.concurrent.Executors;

/* renamed from: X.VJu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68257VJu {
    public final WUe A00(C69372VmI c69372VmI) {
        C1V7 c1v7 = c69372VmI.A05;
        String str = c69372VmI.A06;
        VY1 vy1 = c69372VmI.A01;
        WUH wuh = new WUH(vy1, c1v7, str);
        Executors.newSingleThreadExecutor();
        return new WUe(vy1, c69372VmI.A02, c69372VmI.A03, wuh, c69372VmI.A04);
    }
}
