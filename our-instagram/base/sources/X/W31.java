package X;

import com.instagram.model.hashtag.Hashtag;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W31 {
    public C38657Gyy A00;
    public Hashtag A01;
    public ICQ A02;
    public C41057IGa A03;
    public boolean A04;
    public boolean A05;
    public final C68247VJj A06;
    public final Map A07;
    public final C68809VcQ A08;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VJj] */
    public W31(C68809VcQ c68809VcQ, Hashtag hashtag) {
        AbstractC167007dF.A1D(hashtag, 1, c68809VcQ);
        this.A01 = hashtag;
        ?? obj = new Object();
        obj.A01 = hashtag;
        this.A06 = obj;
        this.A08 = c68809VcQ;
        this.A07 = new HashMap();
        this.A04 = true;
    }

    public static final void A00(W31 w31) {
        String str;
        if (w31.A05) {
            V1R v1r = w31.A08.A00;
            v1r.A0P = false;
            V1R.A03(v1r);
            C70105W4c c70105W4c = v1r.A0E;
            if (c70105W4c == null) {
                str = "useHashtagController";
            } else {
                boolean z = V1R.A01(v1r).A04;
                C68034V7f c68034V7f = v1r.A08;
                if (c68034V7f == null) {
                    str = "dataSource";
                } else {
                    EnumC68206VFy enumC68206VFy = c68034V7f.A00;
                    C14360o3.A07(enumC68206VFy);
                    c70105W4c.A03 = z;
                    c70105W4c.A00(enumC68206VFy);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
