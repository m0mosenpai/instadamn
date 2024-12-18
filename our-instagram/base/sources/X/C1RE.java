package X;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1RE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RE {
    public final InterfaceC08830cm A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final AtomicReference A02 = new AtomicReference();
    public Locale A00 = null;
    public final AtomicReference A01 = new AtomicReference();

    public final synchronized void A01(final Locale locale) {
        int i;
        AbstractC09800fd.A01("FrscLanguagePackLoader.load", -451822827);
        try {
            if (locale.equals(this.A00)) {
                C0K8.A0P("FrscLanguagePackLoader", "Current locale (%s) is same as last loaded locale (%s)", locale, this.A00);
                i = -2016798702;
            } else {
                C0K8.A0P("FrscLanguagePackLoader", "Loading FRSC strings for locale (%s)", locale);
                this.A00 = locale;
                Thread thread = new Thread(locale) { // from class: X.1Tg
                    public final Locale A00;

                    {
                        this.A00 = locale;
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        final Locale locale2;
                        C1U7 c60541R6e;
                        int i2;
                        Object obj;
                        AbstractC09800fd.A01("FrscLanguagePackLoaderThread.run", 2037367011);
                        try {
                            C1RE c1re = C1RE.this;
                            InterfaceC08830cm interfaceC08830cm = c1re.A04;
                            Context context = (Context) interfaceC08830cm.get();
                            C14360o3.A0B(context, 0);
                            try {
                                InputStream open = context.getAssets().open("strings/default.frsc.xz", 0);
                                C14360o3.A07(open);
                                open.close();
                                final Context context2 = (Context) interfaceC08830cm.get();
                                final C1B4 c1b4 = (C1B4) c1re.A03.get();
                                locale2 = this.A00;
                                final C1R8 c1r8 = (C1R8) c1re.A05.get();
                                c60541R6e = new C1U7(context2, c1r8, c1b4, locale2) { // from class: X.1U6
                                    public final Context A00;
                                    public final C1B4 A01;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(context2, c1r8, locale2);
                                        C14360o3.A0B(context2, 1);
                                        C14360o3.A0B(c1b4, 2);
                                        C14360o3.A0B(locale2, 3);
                                        C14360o3.A0B(c1r8, 4);
                                        this.A00 = context2;
                                        this.A01 = c1b4;
                                    }

                                    @Override // X.C1U7
                                    public final MappedByteBuffer A01() {
                                        AbstractC09800fd.A01("XzFrscLanguagePackLoaderImpl.getEnglishStringsBuffer", 571117974);
                                        try {
                                            try {
                                                File AXd = this.A01.AXd(null, 573671032);
                                                File file = new File(AXd, "uncompressed_default.frsc.xz");
                                                ArrayList arrayList = new ArrayList();
                                                Executor executor = C03220Df.A07;
                                                Context context3 = this.A00;
                                                arrayList.add(new AbstractC03210De("strings/default.frsc.checksum", "uncompressed_default.frsc.checksum"));
                                                arrayList.add(new AbstractC03210De("strings/default.frsc.xz", "uncompressed_default.frsc.xz"));
                                                AbstractC05810Sj.A00(AXd);
                                                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                                    AbstractC03210De abstractC03210De = (AbstractC03210De) arrayList.get(i3);
                                                    abstractC03210De.A00 = new File(AXd, abstractC03210De.A01);
                                                }
                                                new C03220Df(context3, AXd, "DefaultFrscUnpacker", arrayList, executor).A03();
                                                MappedByteBuffer map = new RandomAccessFile(file, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                                                AbstractC09800fd.A00(-321057575);
                                                return map;
                                            } catch (IOException e) {
                                                throw new RuntimeException(AnonymousClass001.A0Q("Error loading default.frsc.xz. Free disk space = ", new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()), e);
                                            }
                                        } catch (Throwable th) {
                                            AbstractC09800fd.A00(-143185620);
                                            throw th;
                                        }
                                    }
                                };
                            } catch (IOException unused) {
                                Context context3 = (Context) interfaceC08830cm.get();
                                locale2 = this.A00;
                                c60541R6e = new C60541R6e(context3, (C1R8) c1re.A05.get(), locale2);
                            }
                            AbstractC09800fd.A01("FrscLanguagePackLoaderImpl.load", 797482889);
                            try {
                                AbstractC09800fd.A01("FrscLanguagePackLoaderImpl.loadEnglishStrings", 883595848);
                                try {
                                    AtomicReference atomicReference = C1U7.A05;
                                    if (((C1U8) atomicReference.get()) != null) {
                                        i2 = -1530997640;
                                    } else {
                                        AbstractC09800fd.A01("LoadMMapped", -73407653);
                                        try {
                                            MappedByteBuffer A01 = c60541R6e.A01();
                                            C0K8.A0P("FrscLanguagePackLoader", "FRSC English strings buffer size - (limit : %d, capacity : %d)", Integer.valueOf(A01.limit()), Integer.valueOf(A01.capacity()));
                                            AbstractC09800fd.A00(-1275331628);
                                            if (!C1EM.A00(null, new C1UU(new C1US(Locale.ENGLISH.getLanguage(), A01), c60541R6e.A00, "frsc"), atomicReference)) {
                                                C0K8.A0D("FrscLanguagePackLoader", "Failed to set FRSC English strings");
                                            }
                                            ((C1U8) atomicReference.get()).getClass();
                                            i2 = 310145366;
                                        } catch (Throwable th) {
                                            AbstractC09800fd.A00(1206268494);
                                            throw th;
                                        }
                                    }
                                    AbstractC09800fd.A00(i2);
                                    Locale locale3 = Locale.US;
                                    Locale locale4 = c60541R6e.A01;
                                    if (!locale3.equals(locale4)) {
                                        Locale locale5 = Locale.ENGLISH;
                                        if (!locale5.equals(locale4)) {
                                            if (!locale4.getCountry().isEmpty()) {
                                                c60541R6e.A03 = C1U7.A00(c60541R6e, locale4.toString());
                                            }
                                            if (!locale4.getLanguage().equals(locale5.getLanguage())) {
                                                c60541R6e.A04 = C1U7.A00(c60541R6e, locale4.getLanguage());
                                            }
                                        }
                                    }
                                    AbstractC09800fd.A00(661858504);
                                    synchronized (c1re) {
                                        try {
                                            AtomicReference atomicReference2 = c1re.A02;
                                            C27071Tg c27071Tg = (C27071Tg) atomicReference2.get();
                                            if (this != c27071Tg) {
                                                if (c27071Tg == null) {
                                                    obj = "null";
                                                } else {
                                                    obj = c27071Tg.A00;
                                                }
                                                C0K8.A0Q("FrscLanguagePackLoader", "Another load for locale (%s) was kicked off. Ignoring the results of this load for locale (%s)", obj, locale2);
                                            } else {
                                                c1re.A01.set(c60541R6e);
                                                C1EM.A00(this, null, atomicReference2);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    AbstractC09800fd.A00(-846839441);
                                } catch (Throwable th3) {
                                    AbstractC09800fd.A00(-1432057477);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                AbstractC09800fd.A00(175042809);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            AbstractC09800fd.A00(-964064247);
                            throw th5;
                        }
                    }
                };
                thread.setPriority(5);
                this.A02.set(thread);
                thread.start();
                i = -499857950;
            }
            AbstractC09800fd.A00(i);
        } catch (Throwable th) {
            AbstractC09800fd.A00(336396998);
            throw th;
        }
    }

    public static void A00(C1RE c1re) {
        int i;
        AbstractC09800fd.A01("FrscLanguagePackLoader.blockingWaitOnLoadThread", -2097663595);
        try {
            Thread thread = (Thread) c1re.A02.get();
            if (thread != null) {
                C0K8.A0D("FrscLanguagePackLoader", "Blocked on loader thread");
                try {
                    thread.setPriority(10);
                } catch (IllegalArgumentException e) {
                    C0K8.A0K("FrscLanguagePackLoader", "Unable to load thread", e);
                }
                AbstractC09800fd.A01("ThreadJoin", -2122391336);
                try {
                    try {
                        thread.join();
                        i = 338358209;
                    } catch (InterruptedException e2) {
                        C0K8.A0K("FrscLanguagePackLoader", "Loading thread interrupted", e2);
                        i = 707747646;
                    }
                    AbstractC09800fd.A00(i);
                } catch (Throwable th) {
                    AbstractC09800fd.A00(-1584862675);
                    throw th;
                }
            }
            AbstractC09800fd.A00(1546098561);
        } catch (Throwable th2) {
            AbstractC09800fd.A00(-529258165);
            throw th2;
        }
    }

    public C1RE(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        this.A04 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A05 = interfaceC08830cm3;
    }
}
