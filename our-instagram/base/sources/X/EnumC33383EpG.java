package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33383EpG {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33383EpG[] A02;
    public static final EnumC33383EpG A03;
    public static final EnumC33383EpG A04;
    public static final EnumC33383EpG A05;
    public final AbstractC33545EsJ A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.EsJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.EsJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EsJ, java.lang.Object] */
    static {
        EnumC33383EpG enumC33383EpG = new EnumC33383EpG(new Object(), "VIEW_TYPE_FILTER_OPTION", 0);
        A05 = enumC33383EpG;
        EnumC33383EpG enumC33383EpG2 = new EnumC33383EpG(new Object(), "VIEW_TYPE_FILTER_CATEGORY", 1);
        A04 = enumC33383EpG2;
        EnumC33383EpG enumC33383EpG3 = new EnumC33383EpG(new Object(), "VIEW_TYPE_DIVIDER", 2);
        A03 = enumC33383EpG3;
        EnumC33383EpG[] enumC33383EpGArr = {enumC33383EpG, enumC33383EpG2, enumC33383EpG3};
        A02 = enumC33383EpGArr;
        A01 = AbstractC12190kN.A00(enumC33383EpGArr);
    }

    public static EnumC33383EpG valueOf(String str) {
        return (EnumC33383EpG) Enum.valueOf(EnumC33383EpG.class, str);
    }

    public static EnumC33383EpG[] values() {
        return (EnumC33383EpG[]) A02.clone();
    }

    public EnumC33383EpG(AbstractC33545EsJ abstractC33545EsJ, String str, int i) {
        this.A00 = abstractC33545EsJ;
    }
}
