package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoPaginationService;

/* renamed from: X.Nty, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53987Nty {
    public static /* synthetic */ IPandoGraphQLService.Token A00(ODZ odz, C40701ud c40701ud, int i) {
        String str = odz.A01;
        if (str == null) {
            str = "";
        }
        C1W2 A00 = C1W2.A00();
        C40851us A002 = C40701ud.A00(c40701ud, odz.A03);
        C14360o3.A0B(A002, 0);
        return ((PandoPaginationService) A002.A05.getValue()).loadNextPage(odz.A02, i, 0, false, str, A00);
    }
}
