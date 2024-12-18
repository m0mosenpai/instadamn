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

/* renamed from: X.Os5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55913Os5 implements C1EY, C53B {
    public ByteArrayOutputStream A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final List A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final File A09;
    public final Boolean A0A;

    @Override // X.C53B
    public final void Dgm(ByteArrayOutputStream byteArrayOutputStream) {
        C14360o3.A0B(byteArrayOutputStream, 0);
        UserSession userSession = this.A05;
        if (C53D.A00(userSession).booleanValue()) {
            List list = this.A06;
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
                C0K8.A0F("FirstPageOnlyDeferStrategy", AbstractC111324zv.A00(3597), e);
            }
            this.A00 = byteArrayOutputStream;
            return;
        }
        A03();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C55913Os5 r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55913Os5.A01(X.Os5):void");
    }

    public static final void A02(C55913Os5 c55913Os5, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream A0x;
        File parentFile;
        boolean A1Z;
        File file = c55913Os5.A09;
        if (file == null) {
            file = (File) c55913Os5.A07.getValue();
        }
        if (!file.exists()) {
            file = C1Y7.A06.A00(c55913Os5.A04, c55913Os5.A05);
        }
        File A11 = AbstractC166987dD.A11(AnonymousClass001.A0R(file.getPath(), ".pending"));
        try {
            A0x = MSW.A0x(A11);
        } catch (FileNotFoundException unused) {
            File parentFile2 = A11.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = A11.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            try {
                A0x = MSW.A0x(A11);
            } catch (FileNotFoundException e) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", AbstractC111324zv.A00(3198), e);
                return;
            }
        }
        try {
            byteArrayOutputStream.writeTo(A0x);
        } catch (IOException e2) {
            Boolean bool = c55913Os5.A0A;
            if (bool != null) {
                A1Z = bool.booleanValue();
            } else {
                A1Z = AbstractC167007dF.A1Z(c55913Os5.A08);
            }
            if (A1Z) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", AbstractC111324zv.A00(1614), e2);
            } else {
                throw e2;
            }
        }
        try {
            try {
                A0x.close();
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                C0K8.A0F("FirstPageOnlyDeferStrategy", AbstractC111324zv.A00(1613), e3);
            }
        } finally {
            A11.renameTo(file);
        }
    }

    public final void A03() {
        UserSession userSession = this.A05;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36609906094315502L);
        if (A07 != 0) {
            if (A07 != 1) {
                if (A07 != 2) {
                    if (A07 == 3) {
                        AbstractC37302Gc3.A1W(this, AbstractC24771Iv.A02(19927624, 3), 37);
                        return;
                    }
                    return;
                }
                AbstractC24641Ih.A02.Ep9(new C52400NGv(this), true);
                return;
            }
            A00(userSession, this);
            return;
        }
        C14120nc.A00().ATO(new NGE(this, AbstractC25225BEi.A07(c06090Tz, userSession, 36609906094381039L)));
    }

    @Override // X.C1EY
    public final InputStream FEF(C23781El c23781El, InputStream inputStream) {
        String str;
        if (c23781El == null || (str = c23781El.A01) == null) {
            str = "";
        }
        if (this.A03 && str.equals("cache")) {
            return new C53C(this, inputStream);
        }
        return inputStream;
    }

    @Override // X.C1EY
    public final void onFinish() {
        if (this.A03) {
            UserSession userSession = this.A05;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36328431117942294L) && !C18U.A06(c06090Tz, userSession, 36328431117876757L)) {
                A03();
            }
        }
        if (this.A03) {
            this.A02 = true;
        }
        if (this.A01) {
            A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (X.Nv5.A00(r7).booleanValue() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55913Os5(android.content.Context r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            X.AbstractC167017dG.A1P(r6, r7)
            r5.<init>()
            r5.A04 = r6
            r5.A05 = r7
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324638661292353(0x810d1100003141, double:3.035185984756365E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            r3 = 0
            if (r0 != 0) goto L6a
            X.1YD r0 = X.C1Y7.A06
            java.io.File r0 = r0.A00(r6, r7)
        L1e:
            r5.A09 = r0
            X.0dv r2 = X.EnumC09460dv.A03
            r1 = 29
            X.PbW r0 = new X.PbW
            r0.<init>(r5, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r5.A07 = r0
            r0 = 36324638661357890(0x810d1100013142, double:3.0351859847978106E-306)
            boolean r0 = X.C18U.A06(r4, r7, r0)
            if (r0 != 0) goto L54
            X.0JK r0 = X.C0JK.A01()
            boolean r0 = r0.A09()
            if (r0 == 0) goto L4f
            java.lang.Boolean r0 = X.Nv5.A00(r7)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L50
        L4f:
            r0 = 0
        L50:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L54:
            r5.A0A = r3
            r1 = 30
            X.PbW r0 = new X.PbW
            r0.<init>(r5, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r2, r0)
            r5.A08 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r5.A06 = r0
            return
        L6a:
            r0 = r3
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55913Os5.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }

    public static void A00(AbstractC12990ll abstractC12990ll, C55913Os5 c55913Os5) {
        if (C53D.A00(abstractC12990ll).booleanValue()) {
            A01(c55913Os5);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = c55913Os5.A00;
        if (byteArrayOutputStream == null) {
            return;
        }
        A02(c55913Os5, byteArrayOutputStream);
    }
}
