package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wf8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70687Wf8 implements C1LY {
    public final /* synthetic */ WXh A00;

    public C70687Wf8(WXh wXh) {
        this.A00 = wXh;
    }

    @Override // X.C1LY
    public final /* bridge */ /* synthetic */ Object get() {
        WXh wXh = this.A00;
        C136336Fm c136336Fm = wXh.A00;
        C102884kP c102884kP = wXh.A02;
        C102884kP c102884kP2 = wXh.A03;
        Map map = wXh.A06;
        List list = wXh.A05;
        C1339162z c1339162z = wXh.A04;
        C14360o3.A0B(list, 4);
        C6AX c6ax = new C6AX(c136336Fm, c1339162z, new ArrayList(list), map);
        C6AY c6ay = new C6AY(C6AW.A01(c102884kP, c102884kP2, c6ax, false), c6ax.A03, list);
        wXh.A07.compareAndSet(false, true);
        return c6ay;
    }
}
