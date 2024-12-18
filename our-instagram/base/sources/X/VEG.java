package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEG {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEG[] A03;
    public static final VEG A04;
    public static final VEG A05;
    public static final VEG A06;
    public static final VEG A07;
    public static final VEG A08;
    public static final VEG A09;
    public static final VEG A0A;
    public static final VEG A0B;
    public static final VEG A0C;
    public static final VEG A0D;
    public static final VEG A0E;
    public static final VEG A0F;
    public static final VEG A0G;
    public static final VEG A0H;
    public static final VEG A0I;
    public static final VEG A0J;
    public static final VEG A0K;
    public static final VEG A0L;
    public static final VEG A0M;
    public static final VEG A0N;
    public static final VEG A0O;
    public static final VEG A0P;
    public static final VEG A0Q;
    public static final VEG A0R;
    public static final VEG A0S;
    public static final VEG A0T;
    public static final VEG A0U;
    public static final VEG A0V;
    public static final VEG A0W;
    public static final VEG A0X;
    public static final VEG A0Y;
    public static final VEG A0Z;
    public static final VEG A0a;
    public static final VEG A0b;
    public static final VEG A0c;
    public static final VEG A0d;
    public static final VEG A0e;
    public static final VEG A0f;
    public static final VEG A0g;
    public final String A00;

    static {
        VEG veg = new VEG("CHANCE_FLURRIES", 0, "chanceflurries");
        A04 = veg;
        VEG veg2 = new VEG("CHANCE_RAIN", 1, "chancerain");
        A05 = veg2;
        VEG veg3 = new VEG("CHANCE_SLEET", 2, "chancesleet");
        A06 = veg3;
        VEG veg4 = new VEG("CHANCE_SNOW", 3, "chancesnow");
        A07 = veg4;
        VEG veg5 = new VEG("CHANCE_TSTORMS", 4, "chancetstorms");
        A08 = veg5;
        VEG veg6 = new VEG("CLEAR", 5, QuickExperimentDumperPlugin.CLEAR_CMD);
        A09 = veg6;
        VEG veg7 = new VEG("CLOUDY", 6, "cloudy");
        A0A = veg7;
        VEG veg8 = new VEG("FLURRIES", 7, "flurries");
        A0B = veg8;
        VEG veg9 = new VEG("FOG", 8, "fog");
        A0C = veg9;
        VEG veg10 = new VEG("HAZY", 9, "hazy");
        A0D = veg10;
        VEG veg11 = new VEG("MOSTLY_CLOUDY", 10, "mostlycloudy");
        A0E = veg11;
        VEG veg12 = new VEG("MOSTLY_SUNNY", 11, "mostlysunny");
        A0F = veg12;
        VEG veg13 = new VEG("PARTLY_CLOUDY", 12, "partlycloudy");
        A0Z = veg13;
        VEG veg14 = new VEG("PARTLY_SUNNY", 13, "partlysunny");
        A0a = veg14;
        VEG veg15 = new VEG("RAIN", 14, "rain");
        A0b = veg15;
        VEG veg16 = new VEG("SLEET", 15, "sleet");
        A0c = veg16;
        VEG veg17 = new VEG("SNOW", 16, "snow");
        A0d = veg17;
        VEG veg18 = new VEG("SUNNY", 17, "sunny");
        A0e = veg18;
        VEG veg19 = new VEG("TSTORMS", 18, "tstorms");
        A0f = veg19;
        VEG veg20 = new VEG("NT_CHANCE_FLURRIES", 19, "nt_chanceflurries");
        A0G = veg20;
        VEG veg21 = new VEG("NT_CHANCE_RAIN", 20, "nt_chancerain");
        A0H = veg21;
        VEG veg22 = new VEG("NT_CHANCE_SLEET", 21, "nt_chancesleet");
        A0I = veg22;
        VEG veg23 = new VEG("NT_CHANCE_SNOW", 22, "nt_chancesnow");
        A0J = veg23;
        VEG veg24 = new VEG("NT_CHANCE_TSTORMS", 23, "nt_chancetstorms");
        A0K = veg24;
        VEG veg25 = new VEG("NT_CLEAR", 24, "nt_clear");
        A0L = veg25;
        VEG veg26 = new VEG("NT_CLOUDY", 25, "nt_cloudy");
        A0M = veg26;
        VEG veg27 = new VEG("NT_FLURRIES", 26, "nt_flurries");
        A0N = veg27;
        VEG veg28 = new VEG("NT_FOG", 27, "nt_fog");
        A0O = veg28;
        VEG veg29 = new VEG("NT_HAZY", 28, "nt_hazy");
        A0P = veg29;
        VEG veg30 = new VEG("NT_MOSTLY_CLOUDY", 29, "nt_mostlycloudy");
        A0Q = veg30;
        VEG veg31 = new VEG("NT_MOSTLY_SUNNY", 30, "nt_mostlysunny");
        A0R = veg31;
        VEG veg32 = new VEG("NT_PARTLY_CLOUDY", 31, "nt_partlycloudy");
        A0S = veg32;
        VEG veg33 = new VEG("NT_PARTLY_SUNNY", 32, "nt_partlysunny");
        A0T = veg33;
        VEG veg34 = new VEG("NT_RAIN", 33, "nt_rain");
        A0U = veg34;
        VEG veg35 = new VEG("NT_SLEET", 34, "nt_sleet");
        A0V = veg35;
        VEG veg36 = new VEG("NT_SNOW", 35, "nt_snow");
        A0W = veg36;
        VEG veg37 = new VEG("NT_SUNNY", 36, "nt_sunny");
        A0X = veg37;
        VEG veg38 = new VEG("NT_TSTORMS", 37, "nt_tstorms");
        A0Y = veg38;
        VEG veg39 = new VEG("UNKNOWN", 38, "unknown");
        A0g = veg39;
        VEG[] vegArr = new VEG[39];
        System.arraycopy(new VEG[]{veg28, veg29, veg30, veg31, veg32, veg33, veg34, veg35, veg36, veg37, veg38, veg39}, AbstractC31175DnJ.A1b(new VEG[]{veg, veg2, veg3, veg4, veg5, veg6, veg7, veg8, veg9, veg10, veg11, veg12, veg13, veg14, veg15, veg16, veg17, veg18, veg19, veg20, veg21, veg22, veg23, veg24, veg25, veg26, veg27}, vegArr) ? 1 : 0, vegArr, 27, 12);
        A03 = vegArr;
        A02 = AbstractC12190kN.A00(vegArr);
        VEG[] values = values();
        ArrayList arrayList = new ArrayList();
        for (VEG veg40 : values) {
            if (veg40 != A0g) {
                arrayList.add(veg40);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(AbstractC06950Ym.A1E(arrayList, 10)));
        for (Object obj : arrayList) {
            linkedHashMap.put(((VEG) obj).A00, obj);
        }
        A01 = linkedHashMap;
    }

    public static VEG valueOf(String str) {
        return (VEG) Enum.valueOf(VEG.class, str);
    }

    public static VEG[] values() {
        return (VEG[]) A03.clone();
    }

    public VEG(String str, int i, String str2) {
        this.A00 = str2;
    }
}
