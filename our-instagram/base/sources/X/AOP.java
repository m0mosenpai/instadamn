package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AOP implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Map A02;

    public AOP(DialogInterface.OnClickListener onClickListener, UserSession userSession, Map map) {
        this.A00 = onClickListener;
        this.A01 = userSession;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.onClick(dialogInterface, i);
        LL0.A05(new C19270xB("BrandedContentTaggingUpsellController"), this.A01, C05F.A0i, this.A02);
    }
}
