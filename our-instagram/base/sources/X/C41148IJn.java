package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.IJn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41148IJn {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final ID6 A03;
    public final String A04;
    public final Map A05;

    public C41148IJn(Context context, AbstractC018607g abstractC018607g, UserSession userSession, ID6 id6, String str) {
        AbstractC167017dG.A1P(id6, userSession);
        this.A03 = id6;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A04 = str;
        this.A05 = AbstractC166987dD.A1G();
    }
}
