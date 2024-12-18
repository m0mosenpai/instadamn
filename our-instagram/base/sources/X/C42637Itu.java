package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;

/* renamed from: X.Itu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42637Itu implements InterfaceC152886uI {
    public final /* synthetic */ HighlightsMigrationFragment A00;

    @Override // X.InterfaceC152886uI
    public final void AAo(Reel reel, int i) {
        C14360o3.A0B(reel, 0);
        C153376v6 c153376v6 = this.A00.A04;
        if (c153376v6 != null) {
            c153376v6.AAo(reel, i);
        } else {
            C14360o3.A0F("profileViewpointHelper");
            throw C00O.createAndThrow();
        }
    }

    public C42637Itu(HighlightsMigrationFragment highlightsMigrationFragment) {
        this.A00 = highlightsMigrationFragment;
    }

    @Override // X.InterfaceC152886uI
    public final void EDs(View view, Reel reel) {
        C153376v6 c153376v6 = this.A00.A04;
        if (c153376v6 != null) {
            c153376v6.EDs(view, reel);
        } else {
            C14360o3.A0F("profileViewpointHelper");
            throw C00O.createAndThrow();
        }
    }
}
