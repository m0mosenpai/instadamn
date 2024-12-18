package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rep, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class EnumC61075Rep {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61075Rep[] A01;
    public static final EnumC61075Rep A02;
    public static final EnumC61075Rep A03;
    public static final EnumC61075Rep A04;

    static {
        EnumC61075Rep enumC61075Rep = new EnumC61075Rep() { // from class: X.QEG
        };
        A02 = enumC61075Rep;
        QEH qeh = new QEH();
        A03 = qeh;
        QEI qei = new QEI();
        A04 = qei;
        EnumC61075Rep[] enumC61075RepArr = {enumC61075Rep, qeh, qei};
        A01 = enumC61075RepArr;
        A00 = AbstractC12190kN.A00(enumC61075RepArr);
    }

    public static EnumC61075Rep[] values() {
        return (EnumC61075Rep[]) A01.clone();
    }

    public EnumC61075Rep(String str, int i) {
    }
}
