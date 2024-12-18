package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rru, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61680Rru {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.Ti6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.Tkn] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.Tkp] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, X.Tkn] */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, X.Tkn] */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.Ti6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, X.Tkp] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.Tps] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.Ti4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Ti6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.Ti7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Thy, java.lang.Object] */
    public static SQE A00(ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju, List list) {
        List list2;
        InterfaceC65470Tkn c63739Sst;
        InterfaceC65470Tkn c63747St2;
        List list3;
        InterfaceC65571Tn4 interfaceC65571Tn4 = componentCallbacks2C63416Sju.A01;
        C63361SiK c63361SiK = componentCallbacks2C63416Sju.A02;
        Q20 q20 = componentCallbacks2C63416Sju.A00;
        Context applicationContext = q20.getApplicationContext();
        SAU sau = q20.A02;
        SQE sqe = new SQE();
        Object obj = new Object();
        C62404SAd c62404SAd = sqe.A04;
        synchronized (c62404SAd) {
            list2 = c62404SAd.A00;
            list2.add(obj);
        }
        Object obj2 = new Object();
        synchronized (c62404SAd) {
            list2.add(obj2);
        }
        Resources resources = applicationContext.getResources();
        List A01 = sqe.A01();
        C63750St5 c63750St5 = new C63750St5(applicationContext, interfaceC65571Tn4, c63361SiK, A01);
        Rs2 rs2 = C63752St7.A06;
        C63752St7 c63752St7 = new C63752St7(interfaceC65571Tn4, new Object());
        C62997SaL c62997SaL = C63360SiJ.A05;
        C63360SiJ c63360SiJ = new C63360SiJ(resources.getDisplayMetrics(), interfaceC65571Tn4, c63361SiK, sqe.A01());
        if (sau.A00.containsKey(C61676Rrq.class)) {
            c63747St2 = new C63741Ssv();
            c63739Sst = new C63740Ssu();
        } else {
            c63739Sst = new C63739Sst(c63360SiJ);
            c63747St2 = new C63747St2(c63361SiK, c63360SiJ);
        }
        sqe.A03(new C63744Ssy(new SDG(c63361SiK, A01)), InputStream.class, Drawable.class, "Animation");
        sqe.A03(new C63743Ssx(new SDG(c63361SiK, A01)), ByteBuffer.class, Drawable.class, "Animation");
        C63751St6 c63751St6 = new C63751St6(applicationContext);
        C63837SuV c63837SuV = new C63837SuV(resources);
        C63838SuW c63838SuW = new C63838SuW(resources);
        C63836SuU c63836SuU = new C63836SuU(resources);
        C63835SuT c63835SuT = new C63835SuT(resources);
        C63754StA c63754StA = new C63754StA(c63361SiK);
        C63860Sus c63860Sus = new C63860Sus();
        ?? obj3 = new Object();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        ?? obj4 = new Object();
        C62403SAc c62403SAc = sqe.A03;
        synchronized (c62403SAc) {
            list3 = c62403SAc.A00;
            list3.add(new SDJ(obj4, ByteBuffer.class));
        }
        C63723Ssd c63723Ssd = new C63723Ssd(c63361SiK);
        synchronized (c62403SAc) {
            list3.add(new SDJ(c63723Ssd, InputStream.class));
        }
        sqe.A03(c63739Sst, ByteBuffer.class, Bitmap.class, "Bitmap");
        sqe.A03(c63747St2, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            sqe.A03(new C63742Ssw(c63360SiJ), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        sqe.A03(c63752St7, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        sqe.A03(new C63752St7(interfaceC65571Tn4, new Object()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        C63843Sub c63843Sub = C63843Sub.A00;
        sqe.A06(c63843Sub, Bitmap.class, Bitmap.class);
        sqe.A03(new Object(), Bitmap.class, Bitmap.class, "Bitmap");
        sqe.A04(c63754StA, Bitmap.class);
        sqe.A03(new C63746St0(resources, c63739Sst), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        sqe.A03(new C63746St0(resources, c63747St2), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        sqe.A03(new C63746St0(resources, c63752St7), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        sqe.A04(new C63753St9(c63754StA, interfaceC65571Tn4), BitmapDrawable.class);
        sqe.A03(new C63748St3(c63750St5, c63361SiK, A01), InputStream.class, Q2P.class, "Animation");
        sqe.A03(c63750St5, ByteBuffer.class, Q2P.class, "Animation");
        sqe.A04(new Object(), Q2P.class);
        sqe.A06(c63843Sub, SZL.class, SZL.class);
        sqe.A03(new C63745Ssz(interfaceC65571Tn4), SZL.class, Bitmap.class, "Bitmap");
        sqe.A03(c63751St6, android.net.Uri.class, Drawable.class, "legacy_append");
        sqe.A03(new St1(interfaceC65571Tn4, c63751St6), android.net.Uri.class, Bitmap.class, "legacy_append");
        sqe.A05(new Object());
        sqe.A06(new Object(), File.class, ByteBuffer.class);
        sqe.A06(new QBI(), File.class, InputStream.class);
        sqe.A03(new Object(), File.class, File.class, "legacy_append");
        sqe.A06(new QBH(), File.class, ParcelFileDescriptor.class);
        sqe.A06(c63843Sub, File.class, File.class);
        sqe.A05(new C63777StX(c63361SiK));
        if (!"robolectric".equals(str)) {
            sqe.A05(new Object());
        }
        Class cls = Integer.TYPE;
        sqe.A06(c63837SuV, cls, InputStream.class);
        sqe.A06(c63836SuU, cls, ParcelFileDescriptor.class);
        sqe.A06(c63837SuV, Integer.class, InputStream.class);
        sqe.A06(c63836SuU, Integer.class, ParcelFileDescriptor.class);
        sqe.A06(c63838SuW, Integer.class, android.net.Uri.class);
        sqe.A06(c63835SuT, cls, AssetFileDescriptor.class);
        sqe.A06(c63835SuT, Integer.class, AssetFileDescriptor.class);
        sqe.A06(c63838SuW, cls, android.net.Uri.class);
        sqe.A06(new C63832SuQ(), String.class, InputStream.class);
        sqe.A06(new C63832SuQ(), android.net.Uri.class, InputStream.class);
        sqe.A06(new Object(), String.class, InputStream.class);
        sqe.A06(new Object(), String.class, ParcelFileDescriptor.class);
        sqe.A06(new Object(), String.class, AssetFileDescriptor.class);
        sqe.A06(new C63845Sud(applicationContext.getAssets()), android.net.Uri.class, InputStream.class);
        sqe.A06(new C63844Suc(applicationContext.getAssets()), android.net.Uri.class, AssetFileDescriptor.class);
        sqe.A06(new C63840SuY(applicationContext), android.net.Uri.class, InputStream.class);
        sqe.A06(new C63841SuZ(applicationContext), android.net.Uri.class, InputStream.class);
        if (Build.VERSION.SDK_INT >= 29) {
            sqe.A06(new QBK(applicationContext), android.net.Uri.class, InputStream.class);
            sqe.A06(new QBJ(applicationContext), android.net.Uri.class, ParcelFileDescriptor.class);
        }
        sqe.A06(new C63848Sug(contentResolver), android.net.Uri.class, InputStream.class);
        sqe.A06(new C63847Suf(contentResolver), android.net.Uri.class, ParcelFileDescriptor.class);
        sqe.A06(new C63846Sue(contentResolver), android.net.Uri.class, AssetFileDescriptor.class);
        sqe.A06(new Object(), android.net.Uri.class, InputStream.class);
        sqe.A06(new Object(), java.net.URL.class, InputStream.class);
        sqe.A06(new C63834SuS(applicationContext), android.net.Uri.class, File.class);
        sqe.A06(new C63839SuX(), C63732Ssm.class, InputStream.class);
        sqe.A06(new Object(), byte[].class, ByteBuffer.class);
        sqe.A06(new Object(), byte[].class, InputStream.class);
        sqe.A06(c63843Sub, android.net.Uri.class, android.net.Uri.class);
        sqe.A06(c63843Sub, Drawable.class, Drawable.class);
        sqe.A03(new Object(), Drawable.class, Drawable.class, "legacy_append");
        sqe.A07(new C63861Sut(resources), Bitmap.class, BitmapDrawable.class);
        sqe.A07(c63860Sus, Bitmap.class, byte[].class);
        sqe.A07(new C63862Suu(interfaceC65571Tn4, c63860Sus, obj3), Drawable.class, byte[].class);
        sqe.A07(obj3, Q2P.class, byte[].class);
        C63752St7 c63752St72 = new C63752St7(interfaceC65571Tn4, new Object());
        sqe.A03(c63752St72, ByteBuffer.class, Bitmap.class, "legacy_append");
        sqe.A03(new C63746St0(resources, c63752St72), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            try {
                throw AbstractC166987dD.A15("registerComponents");
            } catch (AbstractMethodError unused) {
                throw AbstractC166987dD.A15("getClass");
            }
        }
        return sqe;
    }
}
