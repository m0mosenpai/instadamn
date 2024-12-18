package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class B1P implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public B1P(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.io.File] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        Camera.ShutterCallback shutterCallback;
        Camera.PictureCallback pictureCallback;
        switch (this.A00) {
            case 0:
                final C208789Lm c208789Lm = (C208789Lm) this.A01;
                final InterfaceC196578mn interfaceC196578mn = (InterfaceC196578mn) this.A02;
                final C196548mk c196548mk = (C196548mk) this.A03;
                AbstractC175037qd.A00(20, AbstractC167017dG.A0H(AbstractC176797tb.A0h, c208789Lm.Bty()), null);
                final int A06 = c208789Lm.A0H.A06(c208789Lm.A00, c208789Lm.A0Y);
                C208999Mh A01 = C208789Lm.A01(c208789Lm, c208789Lm.A00);
                AbstractC176827te.A00(AbstractC176797tb.A0g, A01, A06);
                A01.A03();
                AbstractC176797tb A02 = c208789Lm.A0N.A02(c208789Lm.A00);
                Object A022 = A02.A02(AbstractC176797tb.A0p);
                A022.getClass();
                final Rect rect = (Rect) A022;
                final int A0H = AbstractC167017dG.A0H(AbstractC176797tb.A0s, A02);
                C175227qw c175227qw = c208789Lm.A0R;
                UUID uuid = c208789Lm.A0Q.A03;
                interfaceC196578mn.getClass();
                c175227qw.A05(new RunnableC196638mt(interfaceC196578mn), uuid);
                Object A00 = c196548mk.A00(C196548mk.A05);
                A00.getClass();
                if (AbstractC166987dD.A1a(A00)) {
                    shutterCallback = null;
                } else {
                    shutterCallback = C208789Lm.A0f;
                }
                Object A023 = A02.A02(AbstractC176797tb.A0j);
                A023.getClass();
                final C196738n3 c196738n3 = new C196738n3((Rect) A023, rect, A06, c208789Lm.A00);
                Object A002 = c196548mk.A00(C196548mk.A07);
                A002.getClass();
                if (AbstractC166987dD.A1a(A002)) {
                    pictureCallback = new Camera.PictureCallback() { // from class: X.APF
                        @Override // android.hardware.Camera.PictureCallback
                        public final void onPictureTaken(byte[] bArr, Camera camera) {
                            C208789Lm c208789Lm2 = C208789Lm.this;
                            C196738n3 c196738n32 = c196738n3;
                            C196548mk c196548mk2 = c196548mk;
                            InterfaceC196578mn interfaceC196578mn2 = interfaceC196578mn;
                            c196738n32.A01(C196748n4.A0b, bArr);
                            InterfaceC174657pz interfaceC174657pz = c208789Lm2.A06;
                            interfaceC174657pz.getClass();
                            c208789Lm2.A0E(interfaceC174657pz, interfaceC196578mn2, c196548mk2, c196738n32, null);
                            C209019Mj.A00(c208789Lm2.A0L).countDown();
                        }
                    };
                } else {
                    C209019Mj.A00(c208789Lm.A0L).countDown();
                    pictureCallback = null;
                }
                c208789Lm.A0Z.getClass();
                c208789Lm.A0Z.takePicture(shutterCallback, null, pictureCallback, new Camera.PictureCallback() { // from class: X.8wv
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        Rect rect2;
                        int i;
                        byte[] bArr2 = bArr;
                        if (C178607wY.A00()) {
                            bArr2 = C178607wY.A01();
                        } else if (c208789Lm.A0S.get()) {
                            return;
                        }
                        Rect rect3 = null;
                        if (bArr2 != null) {
                            int A003 = AbstractC196718n1.A00(bArr2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            C0fL.A00(bArr2, 0, bArr2.length, options);
                            rect3 = new Rect(0, 0, options.outWidth, options.outHeight);
                            AbstractC196728n2.A00(rect3, rect, A06, A003);
                            rect2 = rect3;
                        } else {
                            rect2 = new Rect();
                        }
                        Rect rect4 = rect;
                        int i2 = A06;
                        C208789Lm c208789Lm2 = c208789Lm;
                        C196738n3 c196738n32 = new C196738n3(rect2, rect4, i2, c208789Lm2.A00);
                        C196768n6 c196768n6 = C196748n4.A0d;
                        C196548mk c196548mk2 = c196548mk;
                        c196738n32.A01(c196768n6, c196548mk2.A00(C196548mk.A09));
                        c196738n32.A01(C196748n4.A0X, bArr2);
                        C209039Ml c209039Ml = c208789Lm2.A0M;
                        C196768n6 c196768n62 = C196748n4.A0e;
                        if (c209039Ml.A0B) {
                            i = c209039Ml.A09;
                        } else {
                            i = 0;
                        }
                        c196738n32.A01(c196768n62, Integer.valueOf(i));
                        c196738n32.A01(C196748n4.A0c, Integer.valueOf(A0H));
                        final C196748n4 c196748n4 = new C196748n4(c196738n32);
                        final InterfaceC196578mn interfaceC196578mn2 = interfaceC196578mn;
                        c208789Lm2.A0R.A05(new Runnable() { // from class: X.8wx
                            @Override // java.lang.Runnable
                            public final void run() {
                                C196748n4 c196748n42 = c196748n4;
                                InterfaceC196578mn interfaceC196578mn3 = interfaceC196578mn2;
                                byte[] bArr3 = (byte[]) c196748n42.A04(C196748n4.A0X);
                                if (bArr3 != null && bArr3.length != 0) {
                                    interfaceC196578mn3.DYZ(c196748n42);
                                    C196998nU A004 = C196998nU.A00();
                                    C196998nU.A01(A004, 0, A004.A05);
                                    return;
                                }
                                interfaceC196578mn3.DEF(new RuntimeException("Photo taking returned no jpeg data!"));
                            }
                        }, c208789Lm2.A0Q.A03);
                        InterfaceC174657pz interfaceC174657pz = c208789Lm2.A06;
                        interfaceC174657pz.getClass();
                        if (!((Boolean) interfaceC174657pz.AXQ(InterfaceC174657pz.A0D)).booleanValue() && bArr2 != null) {
                            Charset charset = C202188wy.A04;
                            C202188wy c202188wy = new C202188wy(new ByteArrayInputStream(bArr2));
                            C196738n3 c196738n33 = c196738n3;
                            C196768n6 c196768n63 = C196748n4.A0T;
                            Long l = null;
                            double A012 = c202188wy.A01("ExposureTime");
                            if (A012 != -1.0d) {
                                l = Long.valueOf((long) (A012 * Math.pow(10.0d, 9.0d)));
                            }
                            c196738n33.A01(c196768n63, l);
                            C196768n6 c196768n64 = C196748n4.A0Z;
                            Integer num = null;
                            int A024 = c202188wy.A02("PhotographicSensitivity", -1);
                            if (A024 != -1) {
                                num = Integer.valueOf(A024);
                            }
                            c196738n33.A01(c196768n64, num);
                            C196768n6 c196768n65 = C196748n4.A0O;
                            Float f = null;
                            double A013 = c202188wy.A01("ApertureValue");
                            if (A013 != -1.0d) {
                                f = Float.valueOf((float) A013);
                            }
                            c196738n33.A01(c196768n65, f);
                            C196768n6 c196768n66 = C196748n4.A0V;
                            Float f2 = null;
                            double A014 = c202188wy.A01("FocalLength");
                            if (A014 != -1.0d) {
                                f2 = Float.valueOf((float) A014);
                            }
                            c196738n33.A01(c196768n66, f2);
                            C196768n6 c196768n67 = C196748n4.A0P;
                            Integer num2 = null;
                            int A025 = c202188wy.A02("WhiteBalance", -1);
                            if (A025 != -1) {
                                num2 = Integer.valueOf(A025);
                            }
                            c196738n33.A01(c196768n67, num2);
                        }
                        c208789Lm2.A0E(c208789Lm2.A06, interfaceC196578mn2, c196548mk2, c196738n3, c196748n4);
                        Object obj2 = c208789Lm2.A0L.A00.get();
                        obj2.getClass();
                        ((CountDownLatch) obj2).countDown();
                        if (rect3 != null) {
                            AbstractC175037qd.A00(21, rect3.width() * rect3.height(), null);
                        } else {
                            AbstractC175037qd.A00(22, 0, new IllegalStateException("JPEG byte array was null."));
                        }
                    }
                });
                C208969Me c208969Me = c208789Lm.A0J.A00;
                ReentrantLock reentrantLock = c208969Me.A01;
                reentrantLock.lock();
                try {
                    c208969Me.A00 = 0;
                    reentrantLock.unlock();
                    C176567tE.A01("Some how photo taking call is happening on the UI Thread!!");
                    try {
                        C209019Mj.A00(c208789Lm.A0L).await(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        android.util.Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                    if (C209019Mj.A00(c208789Lm.A0L).getCount() <= 0) {
                        Object A003 = c196548mk.A00(C196548mk.A08);
                        A003.getClass();
                        C208789Lm.A0A(c208789Lm, AbstractC166987dD.A1a(A003));
                        return null;
                    }
                    c208789Lm.A0S.set(true);
                    throw new RuntimeException("Timed out waiting for photo result");
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                C175297r3 c175297r3 = (C175297r3) this.A01;
                c175297r3.A0A.A00("Cannot schedule reset focus task, not prepared");
                C177017tx c177017tx = c175297r3.A03;
                c177017tx.getClass();
                if (c177017tx.A00.isConnected() && !c175297r3.A0E) {
                    ((C177047u0) this.A02).A05 = new C22825A4u(this);
                    return null;
                }
                return null;
            case 2:
                obj = AbstractC166987dD.A1E();
                for (Medium medium : (List) this.A02) {
                    Context context = (Context) this.A01;
                    ContentResolver contentResolver = context.getContentResolver();
                    C14360o3.A07(contentResolver);
                    obj.add(new C9MV(contentResolver, context, medium, (UserSession) this.A03, C05F.A00).call());
                }
                return obj;
            case 3:
                if (((AudioOverlayTrack) this.A01).A06 != null) {
                    WG8 wg8 = (WG8) this.A02;
                    obj = this.A03;
                    if (wg8 != null) {
                        AbstractC69934Vxz.A01(C18950wb.A01, wg8);
                        return obj;
                    }
                    return obj;
                }
                return null;
            case 4:
                File file = (File) this.A02;
                AHW.A02((Bitmap) this.A01, file, false);
                return file;
            case 5:
                return Boolean.valueOf(AbstractC54104Nw2.A00((Context) this.A01, null, (UserSession) this.A03, (C47Z) this.A02, C05F.A01));
            default:
                File file2 = (File) this.A03;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                obj = (File) this.A01;
                AbstractC13530mf.A0B(obj, bufferedInputStream);
                file2.delete();
                ContentResolver contentResolver2 = (ContentResolver) this.A02;
                C14360o3.A0A(contentResolver2);
                C14360o3.A0B(contentResolver2, 0);
                String name = obj.getName();
                String substring = TextUtils.substring(name, 0, name.length() - 3);
                ContentValues contentValues = new ContentValues();
                contentValues.put(DialogModule.KEY_TITLE, substring);
                contentValues.put(MSV.A00(171), name);
                contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("_data", obj.getPath());
                try {
                    contentResolver2.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    return obj;
                } catch (Exception unused) {
                    C0K8.A0C("BuiltInCameraUtil", "Unable to insert media into media store");
                    break;
                }
        }
    }
}
