package X;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.36G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36G {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C36G[] A02;
    public static final C36G A03;
    public static final C36G A04;
    public static final C36G A05;
    public static final C36G A06;
    public static final C36G A07;
    public static final C36G A08;
    public static final C36G A09;
    public final TimeUnit A00;

    public static C36G valueOf(String str) {
        return (C36G) Enum.valueOf(C36G.class, str);
    }

    public static C36G[] values() {
        return (C36G[]) A02.clone();
    }

    static {
        C36G c36g = new C36G("NANOSECONDS", TimeUnit.NANOSECONDS, 0);
        A08 = c36g;
        C36G c36g2 = new C36G("MICROSECONDS", TimeUnit.MICROSECONDS, 1);
        A05 = c36g2;
        C36G c36g3 = new C36G("MILLISECONDS", TimeUnit.MILLISECONDS, 2);
        A06 = c36g3;
        C36G c36g4 = new C36G("SECONDS", TimeUnit.SECONDS, 3);
        A09 = c36g4;
        C36G c36g5 = new C36G("MINUTES", TimeUnit.MINUTES, 4);
        A07 = c36g5;
        C36G c36g6 = new C36G("HOURS", TimeUnit.HOURS, 5);
        A04 = c36g6;
        C36G c36g7 = new C36G("DAYS", TimeUnit.DAYS, 6);
        A03 = c36g7;
        C36G[] c36gArr = {c36g, c36g2, c36g3, c36g4, c36g5, c36g6, c36g7};
        A02 = c36gArr;
        A01 = AbstractC12190kN.A00(c36gArr);
    }

    public C36G(String str, TimeUnit timeUnit, int i) {
        this.A00 = timeUnit;
    }
}
