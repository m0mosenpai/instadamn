package X;

import java.util.Map;

/* renamed from: X.Bc9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25854Bc9 extends AbstractC52922bZ {
    public final C68R A00;

    public C25854Bc9(C68R c68r) {
        C14360o3.A0B(c68r, 1);
        this.A00 = c68r;
    }

    public final void A00(String str) {
        Object value;
        C06860Yd c06860Yd;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A00.A00;
        do {
            value = c05a.getValue();
            c06860Yd = new C06860Yd();
            c06860Yd.putAll((Map) value);
            c06860Yd.put(str, true);
        } while (!c05a.AIi(value, AbstractC16850sd.A0N(c06860Yd)));
    }

    public final void A01(String str, String str2) {
        Object value;
        C06860Yd c06860Yd;
        C14360o3.A0B(str, 0);
        C68R c68r = this.A00;
        C05A c05a = c68r.A00;
        do {
            value = c05a.getValue();
            c06860Yd = new C06860Yd();
            c06860Yd.putAll((Map) value);
            c06860Yd.put(str, false);
        } while (!c05a.AIi(value, AbstractC16850sd.A0N(c06860Yd)));
        c68r.A01.Egh(str2);
    }
}
