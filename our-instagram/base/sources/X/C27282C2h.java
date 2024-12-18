package X;

import android.transition.Scene;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.C2h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27282C2h extends AbstractC155866zG {
    public final /* synthetic */ Scene A00;
    public final /* synthetic */ Scene A01;

    @Override // X.AbstractC155866zG
    public final void A00(AppBarLayout appBarLayout, Integer num) {
        Scene scene;
        C14360o3.A0B(num, 1);
        if (num == C05F.A01) {
            scene = this.A01;
        } else if (num != C05F.A00) {
            return;
        } else {
            scene = this.A00;
        }
        AbstractC1566871q.A00(scene);
    }

    public C27282C2h(Scene scene, Scene scene2) {
        this.A01 = scene;
        this.A00 = scene2;
    }
}
