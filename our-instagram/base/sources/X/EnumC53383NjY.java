package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NjY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53383NjY implements InterfaceC57906PmB {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53383NjY[] A01;
    public static final EnumC53383NjY A02;
    public static final EnumC53383NjY A03;

    static {
        EnumC53383NjY enumC53383NjY = new EnumC53383NjY() { // from class: X.MyD
            @Override // X.InterfaceC57906PmB
            public final String C2j() {
                return "inapp";
            }
        };
        A02 = enumC53383NjY;
        EnumC53383NjY enumC53383NjY2 = new EnumC53383NjY() { // from class: X.MyE
            @Override // X.InterfaceC57906PmB
            public final String C2j() {
                return "subs";
            }
        };
        A03 = enumC53383NjY2;
        EnumC53383NjY[] enumC53383NjYArr = {enumC53383NjY, enumC53383NjY2};
        A01 = enumC53383NjYArr;
        A00 = AbstractC12190kN.A00(enumC53383NjYArr);
    }

    public EnumC53383NjY(String str, int i) {
    }
}
