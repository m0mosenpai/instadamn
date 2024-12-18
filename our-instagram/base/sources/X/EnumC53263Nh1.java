package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53263Nh1 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53263Nh1[] A03;
    public final InterfaceC16510rw A00;
    public final InterfaceC16510rw A01;
    public static final EnumC53263Nh1 A04 = new EnumC53263Nh1("ENTER_AR_EFFECT", AbstractC25225BEi.A1D(C8TG.class), AbstractC25225BEi.A1D(C8T7.class), 0);
    public static final EnumC53263Nh1 A0E = new EnumC53263Nh1("EXIT_AR_EFFECT", AbstractC25225BEi.A1D(C8T7.class), AbstractC25225BEi.A1D(C8TG.class), 1);
    public static final EnumC53263Nh1 A05 = new EnumC53263Nh1("ENTER_AUDIO_ADJUST", AbstractC25225BEi.A1D(C8T3.class), AbstractC25225BEi.A1D(C187548Sw.class), 2);
    public static final EnumC53263Nh1 A0F = new EnumC53263Nh1("EXIT_AUDIO_ADJUST", AbstractC25225BEi.A1D(C187548Sw.class), AbstractC25225BEi.A1D(C8T3.class), 3);
    public static final EnumC53263Nh1 A06 = new EnumC53263Nh1("ENTER_AUDIO_FILTER", null, AbstractC25225BEi.A1D(C8T8.class), 4);
    public static final EnumC53263Nh1 A0G = new EnumC53263Nh1("EXIT_AUDIO_FILTER", AbstractC25225BEi.A1D(C8T8.class), null, 5);
    public static final EnumC53263Nh1 A07 = new EnumC53263Nh1("ENTER_COLOR_FILTER", AbstractC25225BEi.A1D(C8TG.class), AbstractC25225BEi.A1D(C8TA.class), 6);
    public static final EnumC53263Nh1 A0H = new EnumC53263Nh1("EXIT_COLOR_FILTER", AbstractC25225BEi.A1D(C8TA.class), AbstractC25225BEi.A1D(C8TG.class), 7);
    public static final EnumC53263Nh1 A08 = new EnumC53263Nh1("ENTER_REORDER", AbstractC25225BEi.A1D(C8TG.class), AbstractC25225BEi.A1D(C187508Ss.class), 8);
    public static final EnumC53263Nh1 A0I = new EnumC53263Nh1("EXIT_REORDER", AbstractC25225BEi.A1D(C187508Ss.class), AbstractC25225BEi.A1D(C8TG.class), 9);
    public static final EnumC53263Nh1 A09 = new EnumC53263Nh1("ENTER_SLIP", AbstractC25225BEi.A1D(C8TF.class), AbstractC25225BEi.A1D(C187518St.class), 10);
    public static final EnumC53263Nh1 A0J = new EnumC53263Nh1("EXIT_SLIP", AbstractC25225BEi.A1D(C187518St.class), AbstractC25225BEi.A1D(C8TF.class), 11);
    public static final EnumC53263Nh1 A0A = new EnumC53263Nh1("ENTER_SPEED", AbstractC25225BEi.A1D(C8TF.class), AbstractC25225BEi.A1D(C187528Su.class), 12);
    public static final EnumC53263Nh1 A0K = new EnumC53263Nh1("EXIT_SPEED", AbstractC25225BEi.A1D(C187528Su.class), AbstractC25225BEi.A1D(C8TF.class), 13);
    public static final EnumC53263Nh1 A0B = new EnumC53263Nh1("ENTER_TEXT_TO_SPEECH", AbstractC25225BEi.A1D(C8TE.class), AbstractC25225BEi.A1D(C8TC.class), 14);
    public static final EnumC53263Nh1 A0L = new EnumC53263Nh1("EXIT_TEXT_TO_SPEECH", AbstractC25225BEi.A1D(C8TC.class), AbstractC25225BEi.A1D(C8TE.class), 15);
    public static final EnumC53263Nh1 A0C = new EnumC53263Nh1("ENTER_TRANSITION", AbstractC25225BEi.A1D(C8TG.class), AbstractC25225BEi.A1D(C187538Sv.class), 16);
    public static final EnumC53263Nh1 A0M = new EnumC53263Nh1("EXIT_TRANSITION", AbstractC25225BEi.A1D(C187538Sv.class), AbstractC25225BEi.A1D(C8TG.class), 17);
    public static final EnumC53263Nh1 A0D = new EnumC53263Nh1("ENTER_VOLUME_CONTROLS", null, AbstractC25225BEi.A1D(C8TB.class), 18);

    static {
        EnumC53263Nh1[] enumC53263Nh1Arr = {A04, A0E, A05, A0F, A06, A0G, A07, A0H, A08, A0I, A09, A0J, A0A, A0K, A0B, A0L, A0C, A0M, A0D, new EnumC53263Nh1("EXIT_VOLUME_CONTROLS", AbstractC25225BEi.A1D(C8TB.class), null, 19)};
        A03 = enumC53263Nh1Arr;
        A02 = AbstractC12190kN.A00(enumC53263Nh1Arr);
    }

    public static EnumC53263Nh1 valueOf(String str) {
        return (EnumC53263Nh1) Enum.valueOf(EnumC53263Nh1.class, str);
    }

    public static EnumC53263Nh1[] values() {
        return (EnumC53263Nh1[]) A03.clone();
    }

    public EnumC53263Nh1(String str, InterfaceC16510rw interfaceC16510rw, InterfaceC16510rw interfaceC16510rw2, int i) {
        this.A01 = interfaceC16510rw;
        this.A00 = interfaceC16510rw2;
    }
}
