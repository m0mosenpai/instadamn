package X;

import android.content.Context;
import java.nio.charset.Charset;

/* renamed from: X.PvF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58436PvF implements InterfaceC65438TkA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C58436PvF(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC65438TkA
    public final Object get() {
        if (this.A00 != 0) {
            AbstractC61607RqW abstractC61607RqW = (AbstractC61607RqW) this.A01;
            C63180Sef c63180Sef = (C63180Sef) this.A02;
            return c63180Sef.A02.ALR(new RVO(abstractC61607RqW, c63180Sef));
        }
        C63342Shx c63342Shx = (C63342Shx) this.A01;
        Context context = (Context) this.A02;
        C63342Shx.A01(c63342Shx);
        String A00 = SSJ.A00(c63342Shx.A04.getBytes(Charset.defaultCharset()));
        C63342Shx.A01(c63342Shx);
        return new SHn(context, (InterfaceC65284ThH) c63342Shx.A02.A03(InterfaceC65284ThH.class), AnonymousClass001.A0g(A00, "+", SSJ.A00(c63342Shx.A01.A00.getBytes(Charset.defaultCharset()))));
    }
}
