package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138896Qv implements InterfaceC138906Qw {
    public final HashMap A00;
    public final Context A01;
    public final HashMap A02;

    public C138896Qv(Context context, C138866Qr c138866Qr) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c138866Qr, 2);
        this.A01 = context;
        this.A02 = new HashMap();
        this.A00 = new HashMap();
        A00("story_width", c138866Qr.A0F);
        A00("story_height", c138866Qr.A0E);
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A02.put(str, str2);
    }

    public final void A00(String str, int i) {
        A01(str, String.valueOf(Math.round(AbstractC13880nE.A01(this.A01, i))));
    }

    @Override // X.InterfaceC138906Qw
    public final Map B32() {
        return new HashMap();
    }

    @Override // X.InterfaceC138906Qw
    public final Map BMV() {
        return this.A02;
    }

    @Override // X.InterfaceC138906Qw
    public final Map BNk() {
        return this.A00;
    }
}
