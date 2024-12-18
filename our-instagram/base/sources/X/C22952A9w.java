package X;

import java.util.List;

/* renamed from: X.A9w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22952A9w {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public List A06;

    public static void A00(String str) {
        if (str != null && !str.isEmpty()) {
            C178267w0 c178267w0 = new C178267w0();
            C178267w0.A01().A00("BoomerangOutputDataHandler", 0);
            c178267w0.BAu("BoomerangOutputDataHandler").post(new RunnableC24267ApY(str));
            c178267w0.E7h("BoomerangOutputDataHandler");
        }
    }
}
