package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53099NeC {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53099NeC[] A03;
    public static final EnumC53099NeC A04;
    public static final EnumC53099NeC A05;
    public static final EnumC53099NeC A06;
    public static final EnumC53099NeC A07;
    public final String A00;
    public final String A01;

    static {
        NLR nlr = new NLR();
        A05 = nlr;
        EnumC53099NeC enumC53099NeC = new EnumC53099NeC() { // from class: X.NLQ
            {
                AbstractC111324zv.A00(201);
            }
        };
        A04 = enumC53099NeC;
        NLT nlt = new NLT();
        A07 = nlt;
        NLS nls = new NLS();
        A06 = nls;
        EnumC53099NeC[] enumC53099NeCArr = {nlr, enumC53099NeC, nlt, nls};
        A03 = enumC53099NeCArr;
        A02 = AbstractC12190kN.A00(enumC53099NeCArr);
    }

    public static EnumC53099NeC[] values() {
        return (EnumC53099NeC[]) A03.clone();
    }

    public EnumC53099NeC(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
