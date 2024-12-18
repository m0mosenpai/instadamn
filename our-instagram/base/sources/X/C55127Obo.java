package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;

/* renamed from: X.Obo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55127Obo {
    public Context A00;
    public ViewGroup A01;
    public C54753OHi A02;
    public OL0 A03;
    public C51653Mrk A04;
    public OMg A05;
    public OMg A06;
    public OBS A07;
    public C55555Olp A08;
    public String A09;
    public boolean A0A;
    public final OMs A0B;
    public final C19L A0C;
    public final O1H A0D;
    public final C0JO A0E;
    public final FoaLiveEditingProvider A0F;

    public static final void A00(C55127Obo c55127Obo) {
        C51653Mrk c51653Mrk = c55127Obo.A04;
        if (c51653Mrk != null && AbstractC31177DnL.A1b(c51653Mrk.A05)) {
            return;
        }
        C19L c19l = c55127Obo.A0C;
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00, new MW8(c55127Obo, null, 29), c19l);
    }

    public static final void A01(C55127Obo c55127Obo) {
        C51653Mrk c51653Mrk = c55127Obo.A04;
        if (c51653Mrk != null && AbstractC31177DnL.A1b(c51653Mrk.A05)) {
            return;
        }
        C19L c19l = c55127Obo.A0C;
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00, new MW8(c55127Obo, null, 30), c19l);
    }

    public static final void A02(C55127Obo c55127Obo, String str) {
        OMg oMg = c55127Obo.A05;
        if (oMg != null) {
            oMg.A00("FALLBACK_TRIGGERED");
        }
        OMg oMg2 = c55127Obo.A05;
        if (oMg2 != null) {
            oMg2.A03("fallbackType", str);
        }
    }

    public C55127Obo(O1H o1h, C0JO c0jo, OMs oMs, FoaLiveEditingProvider foaLiveEditingProvider, C19L c19l) {
        boolean A1a = AbstractC31175DnJ.A1a(o1h);
        this.A0C = c19l;
        this.A0E = c0jo;
        this.A0D = o1h;
        this.A0F = foaLiveEditingProvider;
        this.A0B = oMs;
        this.A0A = A1a;
    }
}
