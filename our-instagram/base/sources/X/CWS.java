package X;

/* loaded from: classes5.dex */
public abstract class CWS {
    public static final CWS A00 = new BZO(new C28271CdG(null, null, null, null, AbstractC06930Yk.A0E(), false));

    public final int hashCode() {
        return ((BZO) this).A00.hashCode();
    }

    public final BZO A00(CWS cws) {
        C28271CdG c28271CdG = ((BZO) cws).A00;
        CVC cvc = c28271CdG.A01;
        if (cvc == null) {
            cvc = ((BZO) this).A00.A01;
        }
        CVD cvd = c28271CdG.A03;
        if (cvd == null) {
            cvd = ((BZO) this).A00.A03;
        }
        C27995CVs c27995CVs = c28271CdG.A00;
        if (c27995CVs == null) {
            c27995CVs = ((BZO) this).A00.A00;
        }
        C27981CVd c27981CVd = c28271CdG.A02;
        if (c27981CVd == null) {
            c27981CVd = ((BZO) this).A00.A02;
        }
        return new BZO(new C28271CdG(c27995CVs, cvc, c27981CVd, cvd, AbstractC06930Yk.A04(((BZO) this).A00.A04, c28271CdG.A04), false));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CWS) && C14360o3.A0K(((BZO) ((CWS) obj)).A00, ((BZO) this).A00)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(A00)) {
            return "EnterTransition.None";
        }
        C28271CdG c28271CdG = ((BZO) this).A00;
        CVC cvc = c28271CdG.A01;
        String str4 = null;
        if (cvc != null) {
            str = cvc.toString();
        } else {
            str = null;
        }
        CVD cvd = c28271CdG.A03;
        if (cvd != null) {
            str2 = cvd.toString();
        } else {
            str2 = null;
        }
        C27995CVs c27995CVs = c28271CdG.A00;
        if (c27995CVs != null) {
            str3 = c27995CVs.toString();
        } else {
            str3 = null;
        }
        C27981CVd c27981CVd = c28271CdG.A02;
        if (c27981CVd != null) {
            str4 = c27981CVd.toString();
        }
        return AnonymousClass001.A16("EnterTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - ", str3, ",\nScale - ", str4);
    }
}
