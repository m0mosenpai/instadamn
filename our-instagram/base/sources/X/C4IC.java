package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4IC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IC {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C4IC[] A03;
    public static final C4IC A04;
    public static final C4IC A05;
    public static final C4IC A06;
    public static final C4IC A07;
    public static final C4IC A08;
    public static final C4IC A09;
    public static final C4IC A0A;
    public static final C4IC A0B;
    public static final C4IC A0C;
    public static final C4IC A0D;
    public static final C4IC A0E;
    public final String A00;
    public final boolean A01;

    static {
        C4IC c4ic = new C4IC("GRANTED", "granted", 0, true);
        A06 = c4ic;
        C4IC c4ic2 = new C4IC("DENIED", "denied", 1, false);
        A05 = c4ic2;
        C4IC c4ic3 = new C4IC("ALWAYS", "always", 2, true);
        A04 = c4ic3;
        C4IC c4ic4 = new C4IC("WHILE_IN_USE", "while_in_use", 3, true);
        A0E = c4ic4;
        C4IC c4ic5 = new C4IC("NEVER_ASK_AGAIN", "never_ask_again", 4, false);
        A08 = c4ic5;
        C4IC c4ic6 = new C4IC("NOT_IMPLEMENTED", "not_implemented", 5, false);
        A09 = c4ic6;
        C4IC c4ic7 = new C4IC("STATUS_ERROR", "status_error", 6, false);
        A0C = c4ic7;
        C4IC c4ic8 = new C4IC("REQUESTED", "requested", 7, false);
        A0B = c4ic8;
        C4IC c4ic9 = new C4IC(MessageAvailabilityResponseId$Companion.NOT_SUPPORTED, "not_supported", 8, false);
        A0A = c4ic9;
        C4IC c4ic10 = new C4IC("LOCATION_PARTIAL", "location_partial", 9, true);
        A07 = c4ic10;
        C4IC c4ic11 = new C4IC("STORAGE_PARTIAL", "storage_partial", 10, true);
        A0D = c4ic11;
        C4IC[] c4icArr = {c4ic, c4ic2, c4ic3, c4ic4, c4ic5, c4ic6, c4ic7, c4ic8, c4ic9, c4ic10, c4ic11};
        A03 = c4icArr;
        A02 = AbstractC12190kN.A00(c4icArr);
    }

    public static C4IC valueOf(String str) {
        return (C4IC) Enum.valueOf(C4IC.class, str);
    }

    public static C4IC[] values() {
        return (C4IC[]) A03.clone();
    }

    public C4IC(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}
