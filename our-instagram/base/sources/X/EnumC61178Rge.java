package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rge, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61178Rge {
    public static final HashMap A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC61178Rge[] A04;
    public static final EnumC61178Rge A05;
    public static final EnumC61178Rge A06;
    public final int A00;
    public final int A01;

    static {
        EnumC61178Rge enumC61178Rge = new EnumC61178Rge("SHA256", 0, 1, 32);
        A05 = enumC61178Rge;
        EnumC61178Rge enumC61178Rge2 = new EnumC61178Rge("SHA384", 1, 2, 48);
        A06 = enumC61178Rge2;
        EnumC61178Rge[] enumC61178RgeArr = {enumC61178Rge, enumC61178Rge2, new EnumC61178Rge("SHA512", 2, 3, 64)};
        A04 = enumC61178RgeArr;
        C020508b<EnumC61178Rge> A00 = AbstractC12190kN.A00(enumC61178RgeArr);
        A03 = A00;
        A02 = AbstractC166987dD.A1G();
        for (EnumC61178Rge enumC61178Rge3 : A00) {
            AbstractC58319PtB.A1H(enumC61178Rge3, A02, enumC61178Rge3.A01);
        }
    }

    public static EnumC61178Rge valueOf(String str) {
        return (EnumC61178Rge) Enum.valueOf(EnumC61178Rge.class, str);
    }

    public static EnumC61178Rge[] values() {
        return (EnumC61178Rge[]) A04.clone();
    }

    public EnumC61178Rge(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
