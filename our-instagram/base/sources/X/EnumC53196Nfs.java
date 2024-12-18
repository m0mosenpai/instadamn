package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53196Nfs {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53196Nfs[] A02;
    public static final EnumC53196Nfs A03;
    public static final EnumC53196Nfs A04;
    public final int A00;

    static {
        EnumC53196Nfs enumC53196Nfs = new EnumC53196Nfs("LC", 0, 2);
        A04 = enumC53196Nfs;
        EnumC53196Nfs enumC53196Nfs2 = new EnumC53196Nfs("HE", 1, 5);
        A03 = enumC53196Nfs2;
        EnumC53196Nfs[] enumC53196NfsArr = {enumC53196Nfs, enumC53196Nfs2};
        A02 = enumC53196NfsArr;
        A01 = AbstractC12190kN.A00(enumC53196NfsArr);
    }

    public static EnumC53196Nfs valueOf(String str) {
        return (EnumC53196Nfs) Enum.valueOf(EnumC53196Nfs.class, str);
    }

    public static EnumC53196Nfs[] values() {
        return (EnumC53196Nfs[]) A02.clone();
    }

    public EnumC53196Nfs(String str, int i, int i2) {
        this.A00 = i2;
    }
}
