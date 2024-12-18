package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEW implements GYB {
    public final Context A00;
    public final UserSession A01;
    public final AbstractC018607g A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Context context = this.A00;
        AbstractC018607g abstractC018607g = this.A02;
        C25621Ms A0c = AbstractC167017dG.A0c(this.A01);
        A0c.A0B("archive/reel/schedule_bulk_deletion_for_corrupted_archive_media/");
        C1ON A0J = AbstractC31178DnM.A0J(A0c, C40781ul.class, C55702hA.class);
        C31702Dw7.A01(A0J, this, 24);
        C1GJ.A00(context, abstractC018607g, A0J);
    }

    public GEW(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A00 = context;
        this.A02 = abstractC018607g;
        this.A01 = userSession;
    }
}
