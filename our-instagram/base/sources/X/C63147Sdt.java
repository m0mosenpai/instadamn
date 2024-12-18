package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.Sdt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63147Sdt {
    public final Context A00;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(C64993TbI.A00);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C64994TbJ.A00);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C64995TbK.A00);
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C64992TbH.A00);

    public static final REZ A01(R0L r0l) {
        R1X A0E;
        R0I A0F;
        R0K A0H;
        R0J A0G;
        R0H A0E2;
        R1N A0E3;
        R0O A0F2;
        QWW A0L;
        C60474R0a A0E4;
        QWE A0E5;
        R1S A0E6;
        QWN A0E7;
        R1O A0E8;
        QRZ A0E9;
        C60475R0b c60475R0b;
        C59069QWb A0E10;
        if (r0l == null || (A0E = r0l.A0E()) == null) {
            return null;
        }
        C58935QQx A0I = A0E.A0I();
        if ((A0I == null || (c60475R0b = (C60475R0b) A0I.A01(C60475R0b.class, -507874568)) == null || (A0E10 = c60475R0b.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E10)) == null) && (((A0F = A0E.A0F()) == null || (A0E8 = A0F.A0E()) == null || (A0E9 = A0E8.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E9)) == null) && (((A0H = A0E.A0H()) == null || (A0E6 = A0H.A0E()) == null || (A0E7 = A0E6.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E7)) == null) && (((A0G = A0E.A0G()) == null || (A0E4 = A0G.A0E()) == null || (A0E5 = A0E4.A0E()) == null || (A0L = AbstractC58322PtE.A0L(A0E5)) == null) && ((A0E2 = A0E.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0F2 = A0E3.A0F()) == null || (A0L = AbstractC58322PtE.A0L(A0F2)) == null))))) {
            return null;
        }
        return AbstractC63238Sfs.A03(A0L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.QCo] */
    public static final C58853QCo A00(String str) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("mutation_data", str);
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        c0Zx.A01(RiI.valueOf(AbstractC166997dE.A10(locale, "CREATE")), "mutation_type");
        return c0Zx;
    }

    public C63147Sdt(Context context) {
        this.A00 = context;
    }
}
