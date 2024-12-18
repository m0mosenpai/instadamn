package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63582uf extends AbstractC63592ug {
    public InterfaceC73233Pz A00;
    public final Context A01;
    public final boolean A02;
    public final C63452uS A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.2t9] */
    public C63582uf(Context context, C1BX c1bx, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63482uV interfaceC63482uV, C63452uS c63452uS) {
        super(c1bx, userSession, new Object(), interfaceC60442pS, interfaceC63482uV, 432, 0L, true);
        C14360o3.A0B(interfaceC63482uV, 5);
        this.A03 = c63452uS;
        this.A01 = context;
        this.A02 = C18U.A06(C06090Tz.A05, userSession, 36318883405568761L);
    }

    @Override // X.AbstractC63592ug
    public final /* bridge */ /* synthetic */ void A05(Context context, InterfaceC82553mJ interfaceC82553mJ, Object obj, String str) {
        if (this.A02 && obj != null) {
            Context context2 = this.A01;
            InterfaceC73233Pz interfaceC73233Pz = this.A00;
            if (interfaceC73233Pz != null) {
                String id = interfaceC73233Pz.getId();
                if (id == null) {
                    id = "";
                }
                super.A05(context2, interfaceC82553mJ, obj, id);
                return;
            }
            C14360o3.A0F("netegoItem");
            throw C00O.createAndThrow();
        }
    }
}
