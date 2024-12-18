package X;

import android.view.View;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;

/* renamed from: X.BxC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27087BxC extends AbstractViewOnClickListenerC13340mK {
    public final /* synthetic */ ReelsVisualRepliesModel A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ InterfaceC30948Dj5 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27087BxC(ReelsVisualRepliesModel reelsVisualRepliesModel, C38321qM c38321qM, InterfaceC30948Dj5 interfaceC30948Dj5, String str, String str2) {
        super(500L);
        this.A02 = interfaceC30948Dj5;
        this.A01 = c38321qM;
        this.A00 = reelsVisualRepliesModel;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.AbstractViewOnClickListenerC13340mK
    public final void A00(View view) {
        boolean z;
        InterfaceC30948Dj5 interfaceC30948Dj5 = this.A02;
        C38321qM c38321qM = this.A01;
        MediaVCRTappableData mediaVCRTappableData = this.A00.A00;
        if (mediaVCRTappableData != null) {
            z = mediaVCRTappableData.A0A;
        } else {
            z = false;
        }
        interfaceC30948Dj5.E1H(c38321qM, this.A03, this.A04, z);
    }
}
