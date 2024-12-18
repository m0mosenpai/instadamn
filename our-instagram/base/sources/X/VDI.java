package X;

import java.util.EnumMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDI {
    public static EnumMap A00;
    public static EnumMap A01;
    public static final EnumMap A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ VDI[] A04;
    public static final VDI A05;
    public static final VDI A06;
    public static final VDI A07;
    public static final VDI A08;
    public static final VDI A09;
    public static final VDI A0A;
    public static final VDI A0B;
    public static final VDI A0C;
    public static final VDI A0D;
    public static final VDI A0E;
    public static final VDI A0F;
    public static final VDI A0G;
    public static final VDI A0H;
    public static final VDI A0I;
    public static final VDI A0J;
    public static final VDI A0K;
    public static final VDI A0L;
    public static final VDI A0M;
    public static final VDI A0N;
    public static final VDI A0O;
    public static final VDI A0P;
    public static final VDI A0Q;
    public static final VDI A0R;
    public static final VDI A0S;
    public static final VDI A0T;
    public static final VDI A0U;

    static {
        VDI vdi = new VDI("DID_ENTER_PREFETCH_QUEUE", 0);
        A0B = vdi;
        VDI vdi2 = new VDI("DID_FINISH_ENTER_PREFETCH_QUEUE", 1);
        A0H = vdi2;
        VDI vdi3 = new VDI("DID_ENTER_PREFETCH_QUEUE_AUDIO", 2);
        A0C = vdi3;
        VDI vdi4 = new VDI("DID_ENTER_PREFETCH_QUEUE_VIDEO", 3);
        A0D = vdi4;
        VDI vdi5 = new VDI("DID_FINISH_ENTER_PREFETCH_QUEUE_AUDIO", 4);
        A0I = vdi5;
        VDI vdi6 = new VDI("DID_FINISH_ENTER_PREFETCH_QUEUE_VIDEO", 5);
        A0J = vdi6;
        VDI vdi7 = new VDI("DID_EXIT_PREFETCH_QUEUE", 6);
        A0E = vdi7;
        VDI vdi8 = new VDI("DID_EXIT_PREFETCH_QUEUE_AUDIO", 7);
        A0F = vdi8;
        VDI vdi9 = new VDI("DID_EXIT_PREFETCH_QUEUE_VIDEO", 8);
        A0G = vdi9;
        VDI vdi10 = new VDI("DATA_FETCH_ISSUED", 9);
        A08 = vdi10;
        VDI vdi11 = new VDI("DATA_FETCH_ISSUED_AUDIO", 10);
        A09 = vdi11;
        VDI vdi12 = new VDI("DATA_FETCH_ISSUED_VIDEO", 11);
        A0A = vdi12;
        VDI vdi13 = new VDI("DID_INITIATE_CACHE_CHECK", 12);
        A0K = vdi13;
        VDI vdi14 = new VDI("DID_INITIATE_CACHE_CHECK_AUDIO", 13);
        A0L = vdi14;
        VDI vdi15 = new VDI("DID_INITIATE_CACHE_CHECK_VIDEO", 14);
        A0M = vdi15;
        VDI vdi16 = new VDI("DATA_FETCH_COMPLETED", 15);
        A05 = vdi16;
        VDI vdi17 = new VDI("DATA_FETCH_COMPLETED_AUDIO", 16);
        A06 = vdi17;
        VDI vdi18 = new VDI("DATA_FETCH_COMPLETED_VIDEO", 17);
        A07 = vdi18;
        VDI vdi19 = new VDI("SUCCESS", 18);
        A0S = vdi19;
        VDI vdi20 = new VDI("SUCCESS_DASH_AUDIO", 19);
        A0T = vdi20;
        VDI vdi21 = new VDI("SUCCESS_DASH_VIDEO", 20);
        A0U = vdi21;
        VDI vdi22 = new VDI("FAIL", 21);
        A0N = vdi22;
        VDI vdi23 = new VDI("FAIL_DASH_AUDIO", 22);
        A0O = vdi23;
        VDI vdi24 = new VDI("FAIL_DASH_VIDEO", 23);
        A0P = vdi24;
        VDI vdi25 = new VDI("HAS_AUDIO", 24);
        A0Q = vdi25;
        VDI vdi26 = new VDI("HAS_VIDEO", 25);
        A0R = vdi26;
        VDI[] vdiArr = {vdi, vdi2, vdi3, vdi4, vdi5, vdi6, vdi7, vdi8, vdi9, vdi10, vdi11, vdi12, vdi13, vdi14, vdi15, vdi16, vdi17, vdi18, vdi19, vdi20, vdi21, vdi22, vdi23, vdi24, vdi25, vdi26};
        A04 = vdiArr;
        A03 = AbstractC12190kN.A00(vdiArr);
        EnumMap enumMap = new EnumMap(VDI.class);
        A02 = enumMap;
        enumMap.put((EnumMap) vdi, vdi);
        enumMap.put((EnumMap) vdi2, vdi2);
        enumMap.put((EnumMap) vdi7, vdi7);
        enumMap.put((EnumMap) vdi10, vdi10);
        enumMap.put((EnumMap) vdi16, vdi16);
        enumMap.put((EnumMap) vdi13, vdi13);
        enumMap.put((EnumMap) vdi19, vdi19);
        enumMap.put((EnumMap) vdi22, vdi22);
        EnumMap enumMap2 = new EnumMap(enumMap);
        A00 = enumMap2;
        enumMap2.put((EnumMap) vdi, vdi3);
        A00.put((EnumMap) vdi2, vdi5);
        A00.put((EnumMap) vdi7, vdi8);
        A00.put((EnumMap) vdi10, vdi11);
        A00.put((EnumMap) vdi16, vdi17);
        A00.put((EnumMap) vdi13, vdi14);
        A00.put((EnumMap) vdi19, vdi20);
        A00.put((EnumMap) vdi22, vdi23);
        EnumMap enumMap3 = new EnumMap(enumMap);
        A01 = enumMap3;
        enumMap3.put((EnumMap) vdi, vdi4);
        A01.put((EnumMap) vdi2, vdi6);
        A01.put((EnumMap) vdi7, vdi9);
        A01.put((EnumMap) vdi10, vdi12);
        A01.put((EnumMap) vdi16, vdi18);
        A01.put((EnumMap) vdi13, vdi15);
        A01.put((EnumMap) vdi19, vdi21);
        A01.put((EnumMap) vdi22, vdi24);
    }

    public static VDI valueOf(String str) {
        return (VDI) Enum.valueOf(VDI.class, str);
    }

    public static VDI[] values() {
        return (VDI[]) A04.clone();
    }

    public VDI(String str, int i) {
    }
}
