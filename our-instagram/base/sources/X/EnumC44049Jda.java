package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jda, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44049Jda {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC44049Jda[] A02;
    public static final EnumC44049Jda A03;
    public static final EnumC44049Jda A04;
    public static final EnumC44049Jda A05;
    public static final EnumC44049Jda A06;
    public static final EnumC44049Jda A07;
    public final AbstractC46972Dl A00;

    static {
        EnumC44049Jda enumC44049Jda = new EnumC44049Jda(C47032Dr.A00, "PRIMARY", 0);
        A06 = enumC44049Jda;
        C132705yt c132705yt = C132705yt.A00;
        EnumC44049Jda enumC44049Jda2 = new EnumC44049Jda(c132705yt, "ALL", 1);
        A03 = enumC44049Jda2;
        EnumC44049Jda enumC44049Jda3 = new EnumC44049Jda(c132705yt, "REQUESTS", 2);
        A07 = enumC44049Jda3;
        EnumC44049Jda enumC44049Jda4 = new EnumC44049Jda(C44035JdM.A00, "GROUPS", 3);
        A05 = enumC44049Jda4;
        EnumC44049Jda enumC44049Jda5 = new EnumC44049Jda(C132695ys.A00, "ALL_CREATOR", 4);
        A04 = enumC44049Jda5;
        EnumC44049Jda[] enumC44049JdaArr = {enumC44049Jda, enumC44049Jda2, enumC44049Jda3, enumC44049Jda4, enumC44049Jda5};
        A02 = enumC44049JdaArr;
        A01 = AbstractC12190kN.A00(enumC44049JdaArr);
    }

    public static EnumC44049Jda valueOf(String str) {
        return (EnumC44049Jda) Enum.valueOf(EnumC44049Jda.class, str);
    }

    public static EnumC44049Jda[] values() {
        return (EnumC44049Jda[]) A02.clone();
    }

    public EnumC44049Jda(AbstractC46972Dl abstractC46972Dl, String str, int i) {
        this.A00 = abstractC46972Dl;
    }
}
