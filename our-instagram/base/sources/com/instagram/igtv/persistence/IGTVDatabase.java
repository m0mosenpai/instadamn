package com.instagram.igtv.persistence;

import X.C1Ym;
import X.C72088XNh;
import X.MXO;
import com.instagram.roomdb.IgRoomDatabase;

/* loaded from: classes9.dex */
public abstract class IGTVDatabase extends IgRoomDatabase {
    public static final C1Ym A00;
    public static final C1Ym A01;
    public static final C1Ym A02;
    public static final C1Ym A03;
    public static final C1Ym A04;
    public static final C1Ym A05;
    public static final C1Ym A06;
    public static final C1Ym A07;
    public static final MXO A08 = new Object();
    public static final int[] A09;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.MXO, java.lang.Object] */
    static {
        int i;
        int[] iArr = new int[6];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 6);
        A09 = iArr;
        A05 = new C72088XNh(6);
        A06 = new C72088XNh(7);
        A07 = new C72088XNh(8);
        A00 = new C72088XNh(1);
        A01 = new C72088XNh(2);
        A02 = new C72088XNh(3);
        A03 = new C72088XNh(4);
        A04 = new C72088XNh(5);
    }
}
