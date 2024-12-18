package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cow, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28888Cow implements InterfaceC52932ba {
    public final Bundle A00;
    public final UserSession A01;

    public C28888Cow(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r0.longValue() != r6) goto L8;
     */
    @Override // X.InterfaceC52932ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC52922bZ create(java.lang.Class r11) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            java.lang.Class<X.BcJ> r0 = X.C25864BcJ.class
            boolean r0 = r11.isAssignableFrom(r0)
            if (r0 == 0) goto L51
            android.os.Bundle r1 = r10.A00
            r0 = 587(0x24b, float:8.23E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            long r6 = r1.getLong(r0)
            r0 = 588(0x24c, float:8.24E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r3 = r1.getString(r0)
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r4 = r10.A01
            com.instagram.user.model.User r0 = r0.A01(r4)
            java.lang.Long r0 = r0.BTC()
            if (r0 == 0) goto L39
            long r1 = r0.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L3a
        L39:
            r2 = 0
        L3a:
            r8 = 0
            X.CSC r5 = new X.CSC
            r5.<init>(r8, r4)
            r9 = 6
            X.MBv r4 = new X.MBv
            r4.<init>(r5, r6, r8, r9)
            X.058 r0 = new X.058
            r0.<init>(r4)
            X.BcJ r1 = new X.BcJ
            r1.<init>(r3, r0, r2)
            return r1
        L51:
            java.lang.Class<X.Bbg> r0 = X.C25825Bbg.class
            boolean r0 = r11.isAssignableFrom(r0)
            if (r0 == 0) goto L68
            com.instagram.common.session.UserSession r2 = r10.A01
            android.os.Bundle r1 = r10.A00
            X.CSC r0 = new X.CSC
            r0.<init>(r1, r2)
            X.Bbg r1 = new X.Bbg
            r1.<init>(r0)
            return r1
        L68:
            r0 = 1841(0x731, float:2.58E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28888Cow.create(java.lang.Class):X.2bZ");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }
}
