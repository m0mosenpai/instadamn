package X;

import android.content.Context;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50232Sp {
    public static final long A05 = TimeUnit.SECONDS.toMillis(30);
    public C1WZ A00;
    public final Context A01;
    public final AbstractC12990ll A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C206919Dw(this, 20));

    public final void A00(Throwable th, String str) {
        Object value = this.A04.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            ((SYT) SYT.A02.getValue()).A00(R2L.A00);
        }
        C1WZ c1wz = this.A00;
        if (c1wz != null) {
            c1wz.A04(this.A01, PushChannelType.A06, th.getMessage(), str, 0);
        }
    }

    public C50232Sp(Context context, AbstractC12990ll abstractC12990ll, InterfaceC09390do interfaceC09390do) {
        this.A01 = context;
        this.A03 = interfaceC09390do;
        this.A02 = abstractC12990ll;
    }
}
