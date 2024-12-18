package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.IlZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42125IlZ implements C3u8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C40971v4 A02;
    public final /* synthetic */ String A03;

    public C42125IlZ(Context context, UserSession userSession, C40971v4 c40971v4, String str) {
        this.A02 = c40971v4;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.C3u8
    public final String AX2() {
        AndroidLink A03;
        C40971v4 c40971v4 = this.A02;
        String str = this.A03;
        Context context = this.A00;
        UserSession userSession = this.A01;
        ImmutableList A02 = c40971v4.A02(str);
        if (A02 != null && (A03 = AbstractC905941u.A03(context, userSession, A02, false)) != null) {
            return AbstractC39722Hjs.A00(A03);
        }
        return null;
    }
}
