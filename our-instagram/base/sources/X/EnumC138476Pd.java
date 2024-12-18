package X;

import android.content.Context;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashSet;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC138476Pd {
    public static final C138486Pe A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC138476Pd[] A03;
    public static final EnumC138476Pd A04;
    public static final EnumC138476Pd A05;
    public static final EnumC138476Pd A06;
    public static final EnumC138476Pd A07;
    public static final EnumC138476Pd A08;
    public static final EnumC138476Pd A09;
    public static final EnumC138476Pd A0A;
    public static final EnumC138476Pd A0B;
    public static final EnumC138476Pd A0C;
    public static final EnumC138476Pd A0D;
    public static final EnumC138476Pd A0E;
    public static final EnumC138476Pd A0F;
    public static final EnumC138476Pd A0G;
    public final String A00;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.6Pe, java.lang.Object] */
    static {
        EnumC138476Pd enumC138476Pd = new EnumC138476Pd("NORMAL", 0, "normal");
        A0D = enumC138476Pd;
        EnumC138476Pd enumC138476Pd2 = new EnumC138476Pd("CREATE", 1, "rich-text");
        A07 = enumC138476Pd2;
        EnumC138476Pd enumC138476Pd3 = new EnumC138476Pd("SUPERZOOM", 2, "superzoom");
        A0E = enumC138476Pd3;
        EnumC138476Pd enumC138476Pd4 = new EnumC138476Pd("FOCUS", 3, "focus");
        A09 = enumC138476Pd4;
        EnumC138476Pd enumC138476Pd5 = new EnumC138476Pd("SUPERZOOM_V3", 4, "superzoomV3");
        A0F = enumC138476Pd5;
        EnumC138476Pd enumC138476Pd6 = new EnumC138476Pd("BOOMERANG", 5, "boomerang");
        A04 = enumC138476Pd6;
        EnumC138476Pd enumC138476Pd7 = new EnumC138476Pd("CLIPS_V1", 6, "clips");
        A06 = enumC138476Pd7;
        EnumC138476Pd enumC138476Pd8 = new EnumC138476Pd("CLIPS", 7, "clips_v2");
        A05 = enumC138476Pd8;
        EnumC138476Pd enumC138476Pd9 = new EnumC138476Pd("LAYOUT", 8, "layout");
        A0B = enumC138476Pd9;
        EnumC138476Pd enumC138476Pd10 = new EnumC138476Pd("HANDS_FREE", 9, "hands_free");
        A0A = enumC138476Pd10;
        EnumC138476Pd enumC138476Pd11 = new EnumC138476Pd("DUAL", 10, "dual");
        A08 = enumC138476Pd11;
        EnumC138476Pd enumC138476Pd12 = new EnumC138476Pd("MULTI_CAPTURE", 11, "multi-capture");
        A0C = enumC138476Pd12;
        EnumC138476Pd enumC138476Pd13 = new EnumC138476Pd("UNKNOWN", 12, "unknown");
        A0G = enumC138476Pd13;
        EnumC138476Pd[] enumC138476PdArr = {enumC138476Pd, enumC138476Pd2, enumC138476Pd3, enumC138476Pd4, enumC138476Pd5, enumC138476Pd6, enumC138476Pd7, enumC138476Pd8, enumC138476Pd9, enumC138476Pd10, enumC138476Pd11, enumC138476Pd12, enumC138476Pd13};
        A03 = enumC138476PdArr;
        A02 = AbstractC12190kN.A00(enumC138476PdArr);
        A01 = new Object();
    }

    public static EnumC138476Pd valueOf(String str) {
        return (EnumC138476Pd) Enum.valueOf(EnumC138476Pd.class, str);
    }

    public static EnumC138476Pd[] values() {
        return (EnumC138476Pd[]) A03.clone();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    public final CameraConfiguration A00() {
        C81W c81w;
        HashSet hashSet = new HashSet();
        C55U c55u = C208509Kk.A00;
        switch (ordinal()) {
            case 0:
            case 2:
            case 4:
                return new CameraConfiguration(c55u, hashSet);
            case 1:
                c81w = C81W.A0C;
                hashSet.add(c81w);
                return new CameraConfiguration(c55u, hashSet);
            case 3:
                C0w9.A03("ReelCaptureType", "Focus is no longer supported");
                return null;
            case 5:
                c81w = C81W.A0B;
                hashSet.add(c81w);
                return new CameraConfiguration(c55u, hashSet);
            case 6:
            case 11:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("conversion to CameraConfiguration not handled: ");
                sb.append(this);
                C0w9.A03("ReelCaptureType", sb.toString());
                return new CameraConfiguration(c55u, hashSet);
            case 7:
                c55u = C81U.A00;
                return new CameraConfiguration(c55u, hashSet);
            case 8:
                c81w = C81W.A0T;
                hashSet.add(c81w);
                return new CameraConfiguration(c55u, hashSet);
            case 9:
                c81w = C81W.A0M;
                hashSet.add(c81w);
                return new CameraConfiguration(c55u, hashSet);
            case 10:
                c81w = C81W.A0D;
                hashSet.add(c81w);
                return new CameraConfiguration(c55u, hashSet);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return null;
        }
    }

    public EnumC138476Pd(String str, int i, String str2) {
        this.A00 = str2;
    }

    public final String A01(Context context) {
        int i;
        switch (ordinal()) {
            case 1:
                i = 2131953240;
                break;
            case 2:
            case 4:
                i = 2131953246;
                break;
            case 3:
                i = 2131953243;
                break;
            case 5:
                i = 2131953237;
                break;
            case 6:
            case 9:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("no attribution label for: ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                i = 2131953238;
                break;
            case 8:
                i = 2131953244;
                break;
            case 10:
                i = 2131953242;
                break;
        }
        String string = context.getString(i);
        C14360o3.A07(string);
        return string;
    }
}
