package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53194Nfq {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53194Nfq[] A02;
    public static final EnumC53194Nfq A03;
    public final int A00;

    static {
        EnumC53194Nfq enumC53194Nfq = new EnumC53194Nfq("MEDIA_POSTS", 0, 1);
        A03 = enumC53194Nfq;
        EnumC53194Nfq[] enumC53194NfqArr = {enumC53194Nfq, new EnumC53194Nfq("COVER_MEDIA", 1, 2)};
        A02 = enumC53194NfqArr;
        A01 = AbstractC12190kN.A00(enumC53194NfqArr);
    }

    public static EnumC53194Nfq valueOf(String str) {
        return (EnumC53194Nfq) Enum.valueOf(EnumC53194Nfq.class, str);
    }

    public static EnumC53194Nfq[] values() {
        return (EnumC53194Nfq[]) A02.clone();
    }

    public EnumC53194Nfq(String str, int i, int i2) {
        this.A00 = i2;
    }
}
