package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.824, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass824 implements InterfaceC52932ba {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.isAssignableFrom(AnonymousClass825.class)) {
            return new AnonymousClass825(this.A00, this.A01);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC58317Pt9.A00(74));
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass824(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
