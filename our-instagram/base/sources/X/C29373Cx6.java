package X;

import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cx6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29373Cx6 implements C53h {
    public final /* synthetic */ ServerRenderedSponsoredContentView A00;
    public final /* synthetic */ boolean A01;

    public C29373Cx6(ServerRenderedSponsoredContentView serverRenderedSponsoredContentView, boolean z) {
        this.A00 = serverRenderedSponsoredContentView;
        this.A01 = z;
    }

    @Override // X.C53h
    public final int AuM() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A00.A03;
        if (showreelNativeMediaView != null) {
            return (int) (showreelNativeMediaView.getProgress() * ((float) TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds())));
        }
        return 0;
    }

    @Override // X.C53h
    public final boolean EiN() {
        return this.A01;
    }
}
