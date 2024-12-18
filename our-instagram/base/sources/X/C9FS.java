package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9FS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FS extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FS(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return Integer.valueOf(((AbstractC65632xz) this.A04).getViewModelHash(this.A01, this.A02, this.A03));
        }
        C7XQ c7xq = (C7XQ) this.A04;
        AbstractC59962oe abstractC59962oe = c7xq.A0E;
        Context context = abstractC59962oe.getContext();
        UserSession userSession = c7xq.A0G;
        C7WZ c7wz = c7xq.A0H;
        InterfaceC60442pS interfaceC60442pS = c7wz.A08;
        C7VF c7vf = (C7VF) this.A02;
        int i = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = c7xq.A0t;
        InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A03;
        boolean A00 = c7wz.A07.A00();
        C7YB c7yb = (C7YB) c7xq.A0g.getValue();
        C163947Vi c163947Vi = c7wz.A05;
        C164197Wi c164197Wi = c7xq.A0I;
        return new C164667Yf(context, abstractC59962oe, userSession, c164197Wi.A0B, c7yb, c163947Vi, c7vf, interfaceC60442pS, interfaceC16820sZ, interfaceC16820sZ2, c7wz.A0H, new C164657Ye(c164197Wi.A0O), c7wz.A0D, c7wz.A0G, c7wz.A0E, c7wz.A0F, c7wz.A0A, c7wz.A0L, i, A00);
    }
}
