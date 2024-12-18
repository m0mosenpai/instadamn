package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;

/* renamed from: X.Y8v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73340Y8v implements YNK {
    public float A00;
    public int A01;
    public Y1h A02;
    public C72840Xob A03;
    public Y1o A04;
    public C63299Sh1 A05;
    public SAD A06;
    public YMJ A07;
    public C72665Xkg A08;
    public final YM4 A09;
    public final Y0r A0A;
    public final C72775Xmu A0B;
    public final XQB A0C;
    public final XQD A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ArrayDeque A0G;
    public final Context A0H;
    public final YML A0I;
    public final YQ9 A0J;
    public final C72521Xfa A0K;
    public final C72521Xfa A0L;

    static {
        new Object();
    }

    @Override // X.YNK
    public final void reset() {
        C1LC it = this.A0F.iterator();
        while (it.hasNext()) {
            ((YQP) it.next()).reset();
        }
        C1LC it2 = this.A0E.iterator();
        while (it2.hasNext()) {
            ((YQP) it2.next()).reset();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.Xfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.Xfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.Xob] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.XQB, X.Y8U] */
    public C73340Y8v(Context context, YM4 ym4, YML yml, YQ9 yq9) {
        this.A0H = context;
        Y1h y1h = Y1h.A01;
        this.A02 = y1h;
        this.A05 = C63299Sh1.A00(context, y1h);
        this.A09 = ym4;
        this.A0J = yq9;
        yml.getClass();
        this.A0I = yml;
        Y0r y0r = new Y0r(YQ7.A00);
        this.A0A = y0r;
        y0r.A00();
        this.A0B = new C72775Xmu(new C73341Y8w(this));
        ?? y8u = new Y8U();
        this.A0C = y8u;
        XQD xqd = new XQD();
        this.A0D = xqd;
        this.A0F = ImmutableList.of((Object) new Y8U(), (Object) y8u, (Object) xqd);
        this.A0E = ImmutableList.of((Object) new Y8U());
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A03 = new Object();
        Y1o y1o = Y1o.A03;
        this.A08 = new C72665Xkg(y1o);
        this.A04 = y1o;
        this.A0G = new ArrayDeque();
        this.A0K = new Object();
        this.A0L = new Object();
    }
}
