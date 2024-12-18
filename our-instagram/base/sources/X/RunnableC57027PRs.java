package X;

import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.PRs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57027PRs implements Runnable {
    public final /* synthetic */ IgGltfSceneLayoutView A00;
    public final /* synthetic */ Integer A01;

    public RunnableC57027PRs(IgGltfSceneLayoutView igGltfSceneLayoutView, Integer num) {
        this.A00 = igGltfSceneLayoutView;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.A00;
        Integer num = this.A01;
        if (num != igGltfSceneLayoutView.A04) {
            if (C05F.A01 == num) {
                IgGltfSceneLayoutView.A00(igGltfSceneLayoutView, C05F.A0C);
                C56825PJv c56825PJv = igGltfSceneLayoutView.A02;
                if (c56825PJv != null) {
                    Long l = c56825PJv.A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        LD2.A01(c56825PJv.A01, Long.valueOf(System.currentTimeMillis() - longValue), "render_time", LD2.A00(c56825PJv.A02), null);
                    }
                    c56825PJv.A00 = null;
                }
            } else if (C05F.A0C == num) {
                IgGltfSceneLayoutView.A00(igGltfSceneLayoutView, C05F.A0N);
            }
        }
        igGltfSceneLayoutView.A04 = num;
        igGltfSceneLayoutView.A03.A03.A08 = num;
    }
}
