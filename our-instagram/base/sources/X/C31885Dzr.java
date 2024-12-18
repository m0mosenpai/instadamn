package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dzr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31885Dzr extends C2UU {
    public List A00;
    public final Context A01;
    public final UserSession A02;
    public final C35207Ffz A03;
    public final InterfaceC60442pS A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        boolean z = this.A05;
        int i2 = R.layout.direct_external_reshare_row_button;
        if (z) {
            i2 = R.layout.direct_external_reshare_row_button_v2;
        }
        return new C31997E3z(AbstractC31175DnJ.A07(A0E, viewGroup, i2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r22, int r23) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31885Dzr.onBindViewHolder(X.3OO, int):void");
    }

    public C31885Dzr(Context context, UserSession userSession, C35207Ffz c35207Ffz, InterfaceC60442pS interfaceC60442pS, List list, boolean z) {
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = list;
        this.A03 = c35207Ffz;
        this.A06 = z;
        this.A05 = C18U.A06(C06090Tz.A05, userSession, 36328727470161654L);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1235678664);
        int size = this.A00.size();
        C0f9.A0A(848692240, A03);
        return size;
    }
}
