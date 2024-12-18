package X;

/* renamed from: X.Vjn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69220Vjn {
    public C69219Vjm A00;
    public String A01;
    public final int A02;
    public final VEO A03;

    public AbstractC69220Vjn(W2a w2a, EnumC72406Xct enumC72406Xct, String str, int i) {
        C69219Vjm c69219Vjm;
        String obj;
        VEO veo;
        this.A02 = i;
        this.A03 = (enumC72406Xct == null || (obj = enumC72406Xct.toString()) == null || (veo = (VEO) VEO.A03.get(obj)) == null) ? VEO.A0E : veo;
        if (w2a instanceof V2T) {
            V2T v2t = (V2T) w2a;
            c69219Vjm = new V2D(v2t.A01, v2t.A02, v2t.A03, ((W2a) v2t).A00, v2t.A00);
        } else {
            c69219Vjm = new C69219Vjm(w2a.A01, w2a.A02, w2a.A03, w2a.A00);
        }
        this.A00 = c69219Vjm;
        this.A01 = str;
    }
}
