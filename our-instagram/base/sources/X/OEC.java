package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OEC {
    public final Context A00;
    public final AbstractC018607g A01;
    public final ClipsTemplateBrowserV2Type A02;
    public final UserSession A03;
    public final String A04;
    public final Map A05;

    public OEC(Context context, AbstractC018607g abstractC018607g, ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A02 = clipsTemplateBrowserV2Type;
        this.A04 = str;
        this.A05 = AbstractC166987dD.A1I();
    }
}
