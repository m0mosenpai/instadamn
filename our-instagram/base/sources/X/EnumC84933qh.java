package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC84933qh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC84933qh[] A01;
    public static final EnumC84933qh A02;
    public static final EnumC84933qh A03;
    public static final EnumC84933qh A04;
    public static final EnumC84933qh A05;
    public static final EnumC84933qh A06;
    public static final EnumC84933qh A07;
    public static final EnumC84933qh A08;
    public static final EnumC84933qh A09;

    static {
        EnumC84933qh enumC84933qh = new EnumC84933qh("RetryWhenNetworkAvailable", 0);
        A08 = enumC84933qh;
        EnumC84933qh enumC84933qh2 = new EnumC84933qh("Failure", 1);
        A04 = enumC84933qh2;
        EnumC84933qh enumC84933qh3 = new EnumC84933qh("Posting", 2);
        A07 = enumC84933qh3;
        EnumC84933qh enumC84933qh4 = new EnumC84933qh("PostPending", 3);
        A06 = enumC84933qh4;
        EnumC84933qh enumC84933qh5 = new EnumC84933qh("Deleted", 4);
        A03 = enumC84933qh5;
        EnumC84933qh enumC84933qh6 = new EnumC84933qh("DeletePending", 5);
        A02 = enumC84933qh6;
        EnumC84933qh enumC84933qh7 = new EnumC84933qh("HidePending", 6);
        A05 = enumC84933qh7;
        EnumC84933qh enumC84933qh8 = new EnumC84933qh("Success", 7);
        A09 = enumC84933qh8;
        EnumC84933qh[] enumC84933qhArr = {enumC84933qh, enumC84933qh2, enumC84933qh3, enumC84933qh4, enumC84933qh5, enumC84933qh6, enumC84933qh7, enumC84933qh8};
        A01 = enumC84933qhArr;
        A00 = AbstractC12190kN.A00(enumC84933qhArr);
    }

    public static EnumC84933qh valueOf(String str) {
        return (EnumC84933qh) Enum.valueOf(EnumC84933qh.class, str);
    }

    public static EnumC84933qh[] values() {
        return (EnumC84933qh[]) A01.clone();
    }

    public final boolean A00() {
        if (this != A03 && this != A02 && this != A05) {
            return true;
        }
        return false;
    }

    public EnumC84933qh(String str, int i) {
    }
}
