package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63772uy extends AbstractC63592ug {
    public final Context A00;
    public final boolean A01;
    public final C63452uS A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.2t9] */
    public C63772uy(Context context, C1BX c1bx, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C63452uS c63452uS) {
        super(c1bx, userSession, new Object(), interfaceC60442pS, interfaceC63482uV, 432, 0L, true);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC63482uV, 5);
        this.A02 = c63452uS;
        this.A00 = context;
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36318883405568761L);
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ void A05(Context context, InterfaceC82553mJ interfaceC82553mJ, Object obj, String str) {
        InterfaceC38381qS interfaceC38381qS = (InterfaceC38381qS) obj;
        if (this.A01 && interfaceC38381qS != null) {
            Context context2 = this.A00;
            String id = interfaceC38381qS.getId();
            if (id == null) {
                id = "";
            }
            super.A05(context2, interfaceC82553mJ, interfaceC38381qS, id);
        }
    }
}
