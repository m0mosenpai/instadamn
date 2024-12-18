package X;

import android.content.res.Resources;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.ODo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54688ODo {
    public boolean A00;
    public final Resources A01;
    public final UserSession A02;
    public final IGTVUploadViewModel A03;
    public final C54813OKo A04;
    public final boolean A05;

    public C54688ODo(Resources resources, UserSession userSession, IGTVUploadViewModel iGTVUploadViewModel, C54813OKo c54813OKo) {
        AbstractC37302Gc3.A1U(iGTVUploadViewModel, userSession);
        this.A04 = c54813OKo;
        this.A01 = resources;
        this.A03 = iGTVUploadViewModel;
        this.A02 = userSession;
        boolean A0K = C14360o3.A0K(c54813OKo.A02.A02, IGTVAccountLevelMonetizationToggleSetting.A05.A00);
        this.A05 = A0K;
        this.A00 = A0K;
    }
}
