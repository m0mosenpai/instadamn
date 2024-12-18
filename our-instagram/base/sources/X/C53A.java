package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.53A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53A implements C1EY, C53B {
    public ByteArrayOutputStream A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final File A05;
    public final Boolean A06;
    public final List A07;
    public final boolean A08;

    @Override // X.C53B
    public final void Dgm(ByteArrayOutputStream byteArrayOutputStream) {
        C14360o3.A0B(byteArrayOutputStream, 0);
        UserSession userSession = this.A02;
        if (C53D.A00(userSession).booleanValue()) {
            List list = this.A07;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C14360o3.A07(byteArray);
            list.add(byteArray);
            return;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36328431117483537L)) {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = this.A00;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
            } catch (IOException e) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", "Exception on close ByteArrayOutputStream", e);
            }
            this.A00 = byteArrayOutputStream;
            return;
        }
        A00();
    }

    private final void A00() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36609906094315502L);
        if (A01 != 0) {
            if (A01 != 1) {
                if (A01 != 2) {
                    if (A01 == 3) {
                        C19K A02 = AbstractC24771Iv.A02(19927624, 3);
                        C206629Ct c206629Ct = new C206629Ct(this, null, 33);
                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, A02);
                        return;
                    }
                    return;
                }
                AbstractC24641Ih.A02.Ep9(new AbstractC18280vF() { // from class: X.9jb
                    {
                        super(MSV.A00(1561), 19927624);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C53A c53a = C53A.this;
                        if (C53D.A00(c53a.A02).booleanValue()) {
                            C53A.A01(c53a);
                            return;
                        }
                        ByteArrayOutputStream byteArrayOutputStream = c53a.A00;
                        if (byteArrayOutputStream == null) {
                            return;
                        }
                        C53A.A02(c53a, byteArrayOutputStream);
                    }
                }, true);
                return;
            }
            if (C53D.A00(userSession).booleanValue()) {
                A01(this);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            if (byteArrayOutputStream == null) {
                return;
            }
            A02(this, byteArrayOutputStream);
            return;
        }
        InterfaceC14020nS A00 = C14120nc.A00();
        final int A012 = (int) C18U.A01(c06090Tz, userSession, 36609906094381039L);
        A00.ATO(new AbstractRunnableC14200nk(A012) { // from class: X.9if
            @Override // java.lang.Runnable
            public final void run() {
                C53A c53a = C53A.this;
                if (C53D.A00(c53a.A02).booleanValue()) {
                    C53A.A01(c53a);
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = c53a.A00;
                if (byteArrayOutputStream2 == null) {
                    return;
                }
                C53A.A02(c53a, byteArrayOutputStream2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C53A r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53A.A01(X.53A):void");
    }

    public static final void A02(C53A c53a, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream fileOutputStream;
        File parentFile;
        File file = c53a.A05;
        if (file == null) {
            file = (File) c53a.A03.getValue();
        }
        if (!file.exists()) {
            file = C1Y7.A06.A00(c53a.A01, c53a.A02);
        }
        File file2 = new File(AnonymousClass001.A0R(file.getPath(), ".pending"));
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException unused) {
            File parentFile2 = file2.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = file2.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", "swallowing error on open after retying to create and open", e);
                return;
            }
        }
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e2) {
            Boolean bool = c53a.A06;
            if (bool == null) {
                bool = (Boolean) c53a.A04.getValue();
            }
            if (bool.booleanValue()) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", "Exception on writing cache file", e2);
            } else {
                throw e2;
            }
        }
        try {
            try {
                fileOutputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", "Exception on closing file output stream", e3);
            }
        } finally {
            file2.renameTo(file);
        }
    }

    @Override // X.C1EY
    public final InputStream FEF(C23781El c23781El, InputStream inputStream) {
        String str;
        if (c23781El == null || (str = c23781El.A01) == null) {
            str = "";
        }
        if (this.A08 && str.equals("cache")) {
            return new C53C(this, inputStream);
        }
        return inputStream;
    }

    @Override // X.C1EY
    public final void onFinish() {
        if (this.A08) {
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (X.Nv5.A00(r6).booleanValue() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C53A(com.instagram.common.session.UserSession r6, android.content.Context r7, boolean r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.A01 = r7
            r5.A02 = r6
            r5.A08 = r8
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324638661292353(0x810d1100003141, double:3.035185984756365E-306)
            boolean r0 = X.C18U.A06(r4, r6, r0)
            r3 = 0
            if (r0 != 0) goto L6a
            X.1YD r0 = X.C1Y7.A06
            java.io.File r0 = r0.A00(r7, r6)
        L1d:
            r5.A05 = r0
            X.0dv r2 = X.EnumC09460dv.A03
            r1 = 15
            X.9EA r0 = new X.9EA
            r0.<init>(r5, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r5.A03 = r0
            r0 = 36324638661357890(0x810d1100013142, double:3.0351859847978106E-306)
            boolean r0 = X.C18U.A06(r4, r6, r0)
            if (r0 != 0) goto L53
            X.0JK r0 = X.C0JK.A01()
            boolean r0 = r0.A09()
            if (r0 == 0) goto L4e
            java.lang.Boolean r0 = X.Nv5.A00(r6)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L53:
            r5.A06 = r3
            r1 = 16
            X.9EA r0 = new X.9EA
            r0.<init>(r5, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r5.A04 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A07 = r0
            return
        L6a:
            r0 = r3
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53A.<init>(com.instagram.common.session.UserSession, android.content.Context, boolean):void");
    }
}
