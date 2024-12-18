package X;

import com.facebook.rsys.hdvideo.gen.HdVideoApi;
import com.facebook.rsys.hdvideo.gen.HdVideoProxy;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MzP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52016MzP extends HdVideoProxy {
    public final UserSession A00;
    public final C23031Ai A01;

    @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
    public final void onVideoQualityChanged(Map map) {
    }

    @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
    public final void setApi(HdVideoApi hdVideoApi) {
    }

    @Override // com.facebook.rsys.hdvideo.gen.HdVideoProxy
    public final boolean getHdVideoUserPreference() {
        return this.A01.A23(this.A00);
    }

    public C52016MzP(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
    }
}
