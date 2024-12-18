package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.LXz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48276LXz implements MPZ {
    public final int A00;
    public final Object A01;

    public C48276LXz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(LKn lKn, Object obj, String str, int i) {
        lKn.A04(new C48276LXz(obj, i), str);
    }

    @Override // X.MPZ
    public final void DEI(String str, int i, String str2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                LGA.A00((LGA) this.A01, str, str2, i);
                return;
            case 1:
                C14360o3.A0B(str, 1);
                C0K8.A0C("Failed to load voice message from Armadillo Express store", str);
                ((C1346766r) this.A01).A00();
                return;
            default:
                C14360o3.A0B(str, 1);
                ((InterfaceC23621Ds) this.A01).resumeWith(null);
                return;
        }
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        InterfaceC11560jF interfaceC11560jF;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                LGA lga = (LGA) this.A01;
                if (z && (interfaceC11560jF = lga.A02) != null) {
                    interfaceC11560jF.Cjr(lga.A07);
                }
                C59722oF c59722oF = lga.A00;
                if (c59722oF == null) {
                    c59722oF = lga.A03.A03.A00();
                    lga.A00 = c59722oF;
                }
                try {
                    C43601zh c43601zh = lga.A05;
                    C0f6 c0f6 = lga.A01;
                    try {
                        String path = AbstractC08820cl.A03(str).getPath();
                        if (path != null) {
                            File A11 = AbstractC166987dD.A11(path);
                            FileInputStream fileInputStream = new FileInputStream(A11);
                            try {
                                JWM.A00(c0f6, c43601zh, c59722oF, fileInputStream, path, A11.length());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                fileInputStream.close();
                                throw th;
                            }
                        }
                        C59562nz c59562nz = lga.A04;
                        C59722oF c59722oF2 = lga.A00;
                        ImageUrl imageUrl = lga.A07;
                        c59562nz.A0D(c59722oF2, imageUrl.Ar1(), null, -1, 0, true, z);
                        InterfaceC11560jF interfaceC11560jF2 = lga.A02;
                        if (interfaceC11560jF2 != null) {
                            interfaceC11560jF2.Cjx(imageUrl);
                        }
                        InterfaceC09390do interfaceC09390do = LKn.A05;
                        LKn.A01(AbstractC46712KlV.A00(lga.A06), AbstractC43592JPx.A0w(imageUrl), false);
                        lga.A00 = null;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (IOException | IllegalArgumentException | OutOfMemoryError | RuntimeException e) {
                    C59722oF c59722oF3 = lga.A00;
                    if (c59722oF3 != null) {
                        c59722oF3.A01();
                    }
                    C0w9.A07("ArmadilloExpressImageLoaderImpl", e);
                    LGA.A00(lga, e.toString(), "ArmadilloExpressImageLoaderImpl", 20003);
                    return;
                }
            case 1:
                C14360o3.A0B(str, 0);
                C1346766r c1346766r = (C1346766r) this.A01;
                c1346766r.A02(str);
                c1346766r.A00();
                return;
            default:
                C14360o3.A0B(str, 0);
                ((InterfaceC23621Ds) this.A01).resumeWith(AbstractC001900j.A0F("file://", str));
                return;
        }
    }
}
