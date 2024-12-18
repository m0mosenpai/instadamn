package X;

import android.view.View;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;

/* renamed from: X.Itf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42622Itf implements InterfaceC152866uG {
    public final /* synthetic */ HighlightsMigrationFragment A00;

    @Override // X.InterfaceC152866uG
    public final void AAn(C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        C153376v6 c153376v6 = this.A00.A04;
        if (c153376v6 != null) {
            c153376v6.AAn(c38321qM, i);
        } else {
            C14360o3.A0F("profileViewpointHelper");
            throw C00O.createAndThrow();
        }
    }

    public C42622Itf(HighlightsMigrationFragment highlightsMigrationFragment) {
        this.A00 = highlightsMigrationFragment;
    }

    @Override // X.InterfaceC152866uG
    public final void EDr(View view, C38321qM c38321qM) {
        C153376v6 c153376v6 = this.A00.A04;
        if (c153376v6 != null) {
            c153376v6.EDr(view, c38321qM);
        } else {
            C14360o3.A0F("profileViewpointHelper");
            throw C00O.createAndThrow();
        }
    }
}
