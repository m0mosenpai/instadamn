package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27373C6c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27373C6c[] A01;
    public static final EnumC27373C6c A02;
    public static final EnumC27373C6c A03;
    public static final EnumC27373C6c A04;

    static {
        EnumC27373C6c enumC27373C6c = new EnumC27373C6c("GlimmerMinOpacity", 0);
        A03 = enumC27373C6c;
        EnumC27373C6c enumC27373C6c2 = new EnumC27373C6c("GlimmerMaxOpacity", 1);
        A02 = enumC27373C6c2;
        EnumC27373C6c enumC27373C6c3 = new EnumC27373C6c("SuggestionsOverlayImagineText", 2);
        A04 = enumC27373C6c3;
        EnumC27373C6c[] enumC27373C6cArr = {enumC27373C6c, enumC27373C6c2, enumC27373C6c3};
        A01 = enumC27373C6cArr;
        A00 = AbstractC12190kN.A00(enumC27373C6cArr);
    }

    public static EnumC27373C6c valueOf(String str) {
        return (EnumC27373C6c) Enum.valueOf(EnumC27373C6c.class, str);
    }

    public static EnumC27373C6c[] values() {
        return (EnumC27373C6c[]) A01.clone();
    }

    public EnumC27373C6c(String str, int i) {
    }
}
