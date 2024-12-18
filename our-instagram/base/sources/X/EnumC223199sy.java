package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223199sy {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223199sy[] A03;
    public static final EnumC223199sy A04;
    public static final EnumC223199sy A05;
    public static final EnumC223199sy A06;
    public final String A00;

    static {
        EnumC223199sy enumC223199sy = new EnumC223199sy("UNANSWERED", 0, "not_answered");
        A06 = enumC223199sy;
        EnumC223199sy enumC223199sy2 = new EnumC223199sy("ANSWERED", 1, "answered");
        A04 = enumC223199sy2;
        EnumC223199sy enumC223199sy3 = new EnumC223199sy("CURRENT", 2, "current");
        A05 = enumC223199sy3;
        EnumC223199sy[] enumC223199syArr = {enumC223199sy, enumC223199sy2, enumC223199sy3, new EnumC223199sy("REMOVED", 3, "removed")};
        A03 = enumC223199syArr;
        A02 = AbstractC12190kN.A00(enumC223199syArr);
        EnumC223199sy[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC223199sy enumC223199sy4 : values) {
            linkedHashMap.put(AbstractC167007dF.A0h(enumC223199sy4.A00), enumC223199sy4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC223199sy valueOf(String str) {
        return (EnumC223199sy) Enum.valueOf(EnumC223199sy.class, str);
    }

    public static EnumC223199sy[] values() {
        return (EnumC223199sy[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return AnonymousClass001.A0R("QuestionState: ", this.A00);
    }

    public EnumC223199sy(String str, int i, String str2) {
        this.A00 = str2;
    }
}
