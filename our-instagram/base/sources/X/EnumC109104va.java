package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC109104va {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC109104va[] A03;
    public static final EnumC109104va A04;
    public static final EnumC109104va A05;
    public static final EnumC109104va A06;
    public static final EnumC109104va A07;
    public static final EnumC109104va A08;
    public static final EnumC109104va A09;
    public static final EnumC109104va A0A;
    public static final EnumC109104va A0B;
    public static final EnumC109104va A0C;
    public static final EnumC109104va A0D;
    public static final EnumC109104va A0E;
    public final String A00;

    static {
        EnumC109104va enumC109104va = new EnumC109104va("ACTIVE", 0, AppStateModule.APP_STATE_ACTIVE);
        A04 = enumC109104va;
        EnumC109104va enumC109104va2 = new EnumC109104va("INTERRUPTED", 1, "interrupted");
        A07 = enumC109104va2;
        EnumC109104va enumC109104va3 = new EnumC109104va("STOPPED", 2, "stopped");
        A0D = enumC109104va3;
        EnumC109104va enumC109104va4 = new EnumC109104va("HARD_STOPPED", 3, "hard_stop");
        A05 = enumC109104va4;
        EnumC109104va enumC109104va5 = new EnumC109104va("POST_LIVE", 4, "post_live");
        A08 = enumC109104va5;
        EnumC109104va enumC109104va6 = new EnumC109104va("POST_LIVE_POSTING", 5, "post_live_posting");
        A09 = enumC109104va6;
        EnumC109104va enumC109104va7 = new EnumC109104va("POST_LIVE_POSTING_FAILED", 6, "post_live_posting_failed");
        A0A = enumC109104va7;
        EnumC109104va enumC109104va8 = new EnumC109104va("POST_LIVE_POSTING_INITIATED", 7, "post_live_posting_initiated");
        A0B = enumC109104va8;
        EnumC109104va enumC109104va9 = new EnumC109104va("POST_LIVE_POST_REQUEST_FAILED", 8, "post_live_post_request_failed");
        A0C = enumC109104va9;
        EnumC109104va enumC109104va10 = new EnumC109104va("HIDDEN", 9, "hidden");
        A06 = enumC109104va10;
        EnumC109104va enumC109104va11 = new EnumC109104va("UNKNOWN", 10, "unknown");
        A0E = enumC109104va11;
        EnumC109104va[] enumC109104vaArr = {enumC109104va, enumC109104va2, enumC109104va3, enumC109104va4, enumC109104va5, enumC109104va6, enumC109104va7, enumC109104va8, enumC109104va9, enumC109104va10, enumC109104va11};
        A03 = enumC109104vaArr;
        A02 = AbstractC12190kN.A00(enumC109104vaArr);
        EnumC109104va[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC109104va enumC109104va12 : values) {
            String lowerCase = enumC109104va12.A00.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            linkedHashMap.put(lowerCase, enumC109104va12);
        }
        A01 = linkedHashMap;
    }

    public static EnumC109104va valueOf(String str) {
        return (EnumC109104va) Enum.valueOf(EnumC109104va.class, str);
    }

    public static EnumC109104va[] values() {
        return (EnumC109104va[]) A03.clone();
    }

    public final boolean A00() {
        if (this != A04 && this != A07 && this != A06) {
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this != A08 && this != A09 && this != A0A && this != A0B && this != A0C) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC109104va(String str, int i, String str2) {
        this.A00 = str2;
    }
}
