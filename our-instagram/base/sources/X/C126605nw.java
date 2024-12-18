package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.Execution;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.5nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126605nw extends C1P1 {
    public final InterfaceC126575nt A00;
    public final C126585nu A01;
    public final File A02;
    public final DataTask A03;

    public C126605nw(DataTask dataTask, InterfaceC126575nt interfaceC126575nt, C126585nu c126585nu, File file) {
        this.A00 = interfaceC126575nt;
        this.A02 = file;
        this.A03 = dataTask;
        this.A01 = c126585nu;
    }

    public final void A00(C126375nY c126375nY) {
        int A03 = C0f9.A03(4676461);
        try {
            if (this.A03.mTaskType == 1) {
                File file = this.A02;
                if (file != null) {
                    File createTempFile = File.createTempFile("NetworkSessionDownload", null, file);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        InterfaceC26481Qd A00 = c126375nY.A01.A00();
                        if (A00 != null) {
                            try {
                                AbstractC126395na.A00(this.A00.AET(A00.AJp()), A00.AjT(), fileOutputStream);
                                A00.close();
                                Execution.executeAsync(new C126425nd(new C115115Ig(new C126415nc(c126375nY.A00, createTempFile, null)), this.A01), null, 3);
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    A00.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        } else {
                            throw new IOException("expected a urlResponse body but was null.");
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            throw th3;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Download Response File must not be null");
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    InterfaceC26481Qd A002 = c126375nY.A01.A00();
                    if (A002 != null) {
                        try {
                            AbstractC126395na.A00(null, A002.AjT(), byteArrayOutputStream);
                            A002.close();
                            Execution.executeAsync(new C126425nd(new C115115Ig(new C126415nc(c126375nY.A00, null, byteArrayOutputStream.toByteArray())), this.A01), null, 3);
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            try {
                                A002.close();
                                throw th5;
                            } catch (Throwable th6) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                throw th5;
                            }
                        }
                    } else {
                        throw new IOException("expected a urlResponse body but was null.");
                    }
                } finally {
                }
            }
        } catch (IOException | SecurityException e) {
            Execution.executeAsync(new C126425nd(new C115095Ie(e), this.A01), null, 3);
        }
        C0f9.A0A(1533605567, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Throwable e;
        int A03 = C0f9.A03(-1050989141);
        C126585nu c126585nu = this.A01;
        if (abstractC115105If instanceof C115115Ig) {
            Object A00 = abstractC115105If.A00();
            A00.getClass();
            C126375nY c126375nY = (C126375nY) A00;
            try {
                C3JY c3jy = c126375nY.A01;
                InterfaceC26481Qd A002 = c3jy.A00();
                if (A002 != null) {
                    A002.close();
                }
                e = new IOException(AnonymousClass001.A05(c126375nY.mStatusCode, "(", ") ", c3jy.A03));
            } catch (IOException e2) {
                e = e2;
            }
        } else {
            e = abstractC115105If.A01();
            if (!(e instanceof IOException)) {
                e = new IOException(e);
            }
        }
        Execution.executeAsync(new C126425nd(new C115095Ie(e), c126585nu), null, 3);
        C0f9.A0A(-350104586, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1851917304);
        A00((C126375nY) obj);
        C0f9.A0A(857799128, A03);
    }
}
