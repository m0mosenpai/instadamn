package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Oai, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55086Oai {
    public W2H A00;
    public EnumC53327Ni6 A01;
    public W2I A02;
    public C69542Vr6 A03;
    public C69056Vgx A04;
    public String A05;
    public String A06;
    public Map A07;
    public boolean A08;
    public boolean A09;

    public C55086Oai(EnumC53327Ni6 enumC53327Ni6) {
        C14360o3.A0B(enumC53327Ni6, 1);
        A00(this);
        this.A09 = true;
        this.A08 = true;
        this.A01 = enumC53327Ni6;
    }

    public static void A00(C55086Oai c55086Oai) {
        c55086Oai.A01 = EnumC53327Ni6.A0K;
        c55086Oai.A07 = new HashMap();
        W2I w2i = new W2I();
        c55086Oai.A02 = w2i;
        c55086Oai.A04 = new C69056Vgx(w2i);
        W2H w2h = new W2H(0, false);
        c55086Oai.A00 = w2h;
        c55086Oai.A03 = new C69542Vr6(w2h);
    }

    public final void A01(W2H w2h) {
        this.A00 = w2h;
        this.A03 = new C69542Vr6(w2h);
    }

    public final void A02(W2I w2i) {
        this.A02 = w2i;
        this.A04 = new C69056Vgx(w2i);
    }

    public C55086Oai() {
        A00(this);
        this.A09 = true;
        this.A08 = true;
    }
}
