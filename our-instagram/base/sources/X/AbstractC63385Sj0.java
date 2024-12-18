package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.Sj0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63385Sj0 {
    public static final Map A00 = AbstractC166987dD.A1G();
    public static final java.util.Set A01 = AbstractC166987dD.A1H();
    public static final byte[] A03 = {80, 75, 3, 4};
    public static final byte[] A02 = {31, -117, 8};

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Sb2, java.lang.Object] */
    public static C62958SZa A04(InputStream inputStream, String str) {
        ?? obj = new Object();
        if (inputStream != null) {
            return A03(new C58810QAt(new TWW(new C64845TWl(inputStream, obj))), str, true);
        }
        throw AbstractC166987dD.A12("in == null");
    }

    public static C63338Shs A05(Runnable runnable, String str, Callable callable) {
        C63338Shs c63338Shs;
        if (str != null) {
            Object A022 = C62880SVf.A01.A00.A02(str);
            c63338Shs = A022 != null ? new C63338Shs(A022) : null;
            Map map = A00;
            if (map.containsKey(str)) {
                c63338Shs = (C63338Shs) map.get(str);
            }
            if (c63338Shs != null) {
                if (runnable != null) {
                    runnable.run();
                }
                return c63338Shs;
            }
        }
        c63338Shs = new C63338Shs(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c63338Shs.A03(new C63663SrW(str, atomicBoolean, 0));
            c63338Shs.A02(new C63663SrW(str, atomicBoolean, 1));
            if (!atomicBoolean.get()) {
                Map map2 = A00;
                map2.put(str, c63338Shs);
                if (map2.size() == 1) {
                    ArrayList A1F = AbstractC166987dD.A1F(A01);
                    if (0 < A1F.size()) {
                        A1F.get(0);
                        throw AbstractC166987dD.A15("onIdleChanged");
                    }
                }
            }
        }
        return c63338Shs;
    }

    public static Boolean A06(InterfaceC65701TsN interfaceC65701TsN, byte[] bArr) {
        try {
            TWW tww = new TWW(new C64842TWi(interfaceC65701TsN));
            for (byte b : bArr) {
                if (tww.readByte() != b) {
                    return false;
                }
            }
            tww.close();
            return AbstractC166997dE.A0b();
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Sb2, java.lang.Object] */
    public static C62958SZa A00(Context context, String str, int i) {
        Object A022;
        if (str != null && (A022 = C62880SVf.A01.A00.A02(str)) != null) {
            return new C62958SZa(A022);
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            ?? obj = new Object();
            if (openRawResource != null) {
                TWW tww = new TWW(new C64845TWl(openRawResource, obj));
                if (A06(tww, A03).booleanValue()) {
                    return A02(context, str, new ZipInputStream(new C61040ReC(tww)));
                }
                if (A06(tww, A02).booleanValue()) {
                    try {
                        return A04(new GZIPInputStream(new C61040ReC(tww)), str);
                    } catch (IOException e) {
                        return new C62958SZa((Throwable) e);
                    }
                }
                return A04(new C61040ReC(tww), str);
            }
            throw AbstractC166987dD.A12("in == null");
        } catch (Resources.NotFoundException e2) {
            return new C62958SZa((Throwable) e2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Sb2, java.lang.Object] */
    public static C62958SZa A01(Context context, String str, String str2) {
        Object A022;
        if (str2 != null && (A022 = C62880SVf.A01.A00.A02(str2)) != null) {
            return new C62958SZa(A022);
        }
        try {
            InputStream open = context.getAssets().open(str);
            ?? obj = new Object();
            if (open != null) {
                TWW tww = new TWW(new C64845TWl(open, obj));
                if (A06(tww, A03).booleanValue()) {
                    return A02(context, str2, new ZipInputStream(new C61040ReC(tww)));
                }
                if (A06(tww, A02).booleanValue()) {
                    return A04(new GZIPInputStream(new C61040ReC(tww)), str2);
                }
                return A04(new C61040ReC(tww), str2);
            }
            throw AbstractC166987dD.A12("in == null");
        } catch (IOException e) {
            return new C62958SZa((Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x031c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C62958SZa A03(X.THX r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63385Sj0.A03(X.THX, java.lang.String, boolean):X.SZa");
    }

    public static String A07(Context context, int i) {
        String str;
        if ((AbstractC58319PtB.A08(context).uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        return AnonymousClass001.A0b("rawRes", str, i);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [X.Sb2, java.lang.Object] */
    public static C62958SZa A02(Context context, String str, ZipInputStream zipInputStream) {
        SQ2 sq2;
        try {
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            C62958SZa c62958SZa = null;
            if (str != null) {
                try {
                    sq2 = (SQ2) C62880SVf.A01.A00.A02(str);
                } catch (IOException e) {
                    c62958SZa = new C62958SZa((Throwable) e);
                }
                if (sq2 != null) {
                    c62958SZa = new C62958SZa(sq2);
                    return c62958SZa;
                }
            }
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            SQ2 sq22 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(RealtimeLogsProvider.LOG_SUFFIX)) {
                    sq22 = (SQ2) A03(new C58810QAt(new TWW(new C64845TWl(zipInputStream, new Object()))), null, false).A00;
                } else if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    } else {
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File A0w = MSW.A0w(context.getCacheDir(), str2);
                        new FileOutputStream(A0w);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(A0w);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th3) {
                            SQZ.A01(AnonymousClass001.A11("Unable to save font ", str3, " to the temporary file: ", str2, ". "), th3);
                        }
                        Typeface createFromFile = Typeface.createFromFile(A0w);
                        if (!A0w.delete()) {
                            SQZ.A00(AnonymousClass001.A0g("Failed to delete temp font file ", A0w.getAbsolutePath(), "."));
                        }
                        A1G2.put(str3, createFromFile);
                    }
                } else {
                    String[] split2 = name.split("/");
                    A1G.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (sq22 == null) {
                c62958SZa = new C62958SZa((Throwable) AbstractC166987dD.A12("Unable to parse composition"));
            } else {
                Iterator A14 = AbstractC166997dE.A14(A1G);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    String A17 = AbstractC31172DnG.A17(A1K);
                    Iterator A16 = AbstractC166997dE.A16(sq22.A02());
                    while (true) {
                        if (A16.hasNext()) {
                            C62597SIa c62597SIa = (C62597SIa) A16.next();
                            if (c62597SIa.A04.equals(A17)) {
                                c62597SIa.A00 = AbstractC63359SiH.A02((Bitmap) A1K.getValue(), c62597SIa.A02, c62597SIa.A01);
                                break;
                            }
                        }
                    }
                }
                Iterator A142 = AbstractC166997dE.A14(A1G2);
                while (A142.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                    Iterator A162 = AbstractC166997dE.A16(sq22.A0A);
                    boolean z = false;
                    while (A162.hasNext()) {
                        SH9 sh9 = (SH9) A162.next();
                        if (sh9.A01.equals(A1K2.getKey())) {
                            sh9.A00 = (Typeface) A1K2.getValue();
                            z = true;
                        }
                    }
                    if (!z) {
                        SQZ.A00(AnonymousClass001.A0g("Parsed font for ", AbstractC31172DnG.A17(A1K2), " however it was not found in the animation."));
                    }
                }
                if (A1G.isEmpty()) {
                    Iterator A15 = AbstractC166997dE.A15(sq22.A02());
                    while (A15.hasNext()) {
                        C62597SIa c62597SIa2 = (C62597SIa) AbstractC31176DnK.A0j(A15);
                        if (c62597SIa2 == null) {
                            break;
                        }
                        String str4 = c62597SIa2.A04;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (str4.startsWith("data:") && str4.indexOf("base64,") > 0) {
                            try {
                                byte[] decode = Base64.decode(AbstractC58318PtA.A0g(str4.indexOf(44), str4), 0);
                                c62597SIa2.A00 = C0fL.A00(decode, 0, decode.length, options);
                            } catch (IllegalArgumentException e2) {
                                SQZ.A01("data URL did not have correct base64 format.", e2);
                            }
                        }
                    }
                }
                if (str != null) {
                    C62880SVf.A01.A00.A05(str, sq22);
                }
                c62958SZa = new C62958SZa(sq22);
            }
            return c62958SZa;
        } finally {
            AbstractC63359SiH.A04(zipInputStream);
        }
    }
}
