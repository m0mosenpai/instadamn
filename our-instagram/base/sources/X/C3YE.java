package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3YE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3YE[] A01;
    public static final C3YE A02;
    public static final C3YE A03;
    public static final C3YE A04;
    public static final C3YE A05;
    public static final C3YE A06;
    public static final C3YE A07;
    public static final C3YE A08;
    public static final C3YE A09;
    public static final C3YE A0A;
    public static final C3YE A0B;
    public static final C3YE A0C;
    public static final C3YE A0D;
    public static final C3YE A0E;
    public static final C3YE A0F;
    public static final C3YE A0G;
    public static final C3YE A0H;
    public static final C3YE A0I;

    static {
        C3YE c3ye = new C3YE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A09 = c3ye;
        C3YE c3ye2 = new C3YE("PEOPLE", 1);
        A0C = c3ye2;
        C3YE c3ye3 = new C3YE("FB_USER", 2);
        A05 = c3ye3;
        C3YE c3ye4 = new C3YE("PRODUCTS", 3);
        A0E = c3ye4;
        C3YE c3ye5 = new C3YE("SHOPPING_ADS", 4);
        A0F = c3ye5;
        C3YE c3ye6 = new C3YE("CLIPS", 5);
        A03 = c3ye6;
        C3YE c3ye7 = new C3YE("TEMPLATE", 6);
        A0G = c3ye7;
        C3YE c3ye8 = new C3YE("UPCOMING_EVENT", 7);
        A0H = c3ye8;
        C3YE c3ye9 = new C3YE("FUNDRAISER", 8);
        A06 = c3ye9;
        C3YE c3ye10 = new C3YE("CLOSE_FRIENDS", 9);
        A04 = c3ye10;
        C3YE c3ye11 = new C3YE("VIEW_SIMILAR", 10);
        A0I = c3ye11;
        C3YE c3ye12 = new C3YE("HIGHLIGHTS", 11);
        A07 = c3ye12;
        C3YE c3ye13 = new C3YE("OPEN_CAROUSEL", 12);
        A0A = c3ye13;
        C3YE c3ye14 = new C3YE("ADD_CONTENT_NOTE", 13);
        A02 = c3ye14;
        C3YE c3ye15 = new C3YE("PER_MEDIA_LIKE", 14);
        A0D = c3ye15;
        C3YE c3ye16 = new C3YE("OPEN_CAROUSEL_THANK", 15);
        A0B = c3ye16;
        C3YE c3ye17 = new C3YE("ICONIC_ENTRYPOINTS", 16);
        A08 = c3ye17;
        C3YE[] c3yeArr = {c3ye, c3ye2, c3ye3, c3ye4, c3ye5, c3ye6, c3ye7, c3ye8, c3ye9, c3ye10, c3ye11, c3ye12, c3ye13, c3ye14, c3ye15, c3ye16, c3ye17};
        A01 = c3yeArr;
        A00 = AbstractC12190kN.A00(c3yeArr);
    }

    public static C3YE valueOf(String str) {
        return (C3YE) Enum.valueOf(C3YE.class, str);
    }

    public static C3YE[] values() {
        return (C3YE[]) A01.clone();
    }

    public C3YE(String str, int i) {
    }
}
