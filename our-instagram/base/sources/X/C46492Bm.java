package X;

import android.util.LruCache;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46492Bm {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final C68918VeI[] A07;
    public static final String A0A = AnonymousClass001.A0g("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(Locale.ROOT), "0123456789");
    public static final C46502Bn A09 = new Object();
    public static final AbstractMap.SimpleEntry[] A0B = {new AbstractMap.SimpleEntry("x-fb-fna-hit", "fna"), new AbstractMap.SimpleEntry("x-fb-edge-hit", "edge"), new AbstractMap.SimpleEntry("x-fb-origin-hit", "origin")};
    public static final LruCache A08 = new LruCache(50);

    public C46492Bm(String str, String str2, String str3, String str4, String str5, Map map, C68918VeI[] c68918VeIArr, long j) {
        this.A04 = str;
        this.A05 = str2;
        this.A07 = c68918VeIArr;
        this.A02 = str3;
        this.A03 = str5;
        this.A01 = str4;
        this.A00 = j;
        this.A06 = map;
    }
}
