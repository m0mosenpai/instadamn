package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jhb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44285Jhb extends U7H {
    public final /* synthetic */ C44272JhO A00;

    public C44285Jhb(C44272JhO c44272JhO) {
        this.A00 = c44272JhO;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        boolean z;
        C51577MqV A02;
        long j;
        File[] listFiles;
        final C44272JhO c44272JhO = this.A00;
        C44274JhQ c44274JhQ = c44272JhO.A06;
        if (!c44274JhQ.A01()) {
            Iterator A16 = AbstractC166997dE.A16(C25A.A00(c44272JhO.A04).A06);
            Object obj = null;
            while (A16.hasNext()) {
                Object next = A16.next();
                C47Z c47z = (C47Z) next;
                if (c47z.A11() && c47z.A6J != EnumC915447k.A02) {
                    obj = next;
                }
            }
            C47Z c47z2 = (C47Z) obj;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (c47z2 != null && c47z2.A3w != null) {
                File file = new File(AbstractC916948n.A03(), c47z2.A3w);
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.getName().endsWith(".mp4") && !file2.getName().contains("-stitched")) {
                            A1E.add(file2);
                        }
                    }
                }
            }
            z = false;
            if (!A1E.isEmpty()) {
                A1E.size();
                try {
                    final ArrayList A1E2 = AbstractC166987dD.A1E();
                    int A00 = 60000 - c44274JhQ.A01.A00();
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        File file3 = (File) it.next();
                        try {
                            A02 = MY4.A02(file3);
                            j = A02.A02;
                        } catch (IllegalArgumentException unused) {
                        }
                        if (j <= 0) {
                            break;
                        }
                        long j2 = A00;
                        if (j > j2) {
                            break;
                        }
                        if (j2 - j <= 300) {
                            j = j2;
                        }
                        C44059Jdk c44059Jdk = new C44059Jdk(file3.getPath(), 0, j, false);
                        c44059Jdk.A02 = A02.A01;
                        c44059Jdk.A00 = A02.A00;
                        A1E2.add(c44059Jdk);
                        A00 = (int) (j2 - j);
                    }
                    c44272JhO.A03.post(new Runnable() { // from class: X.M3C
                        @Override // java.lang.Runnable
                        public final void run() {
                            C44272JhO c44272JhO2 = C44272JhO.this;
                            List<C44059Jdk> list = A1E2;
                            try {
                                C44274JhQ c44274JhQ2 = c44272JhO2.A06;
                                for (C44059Jdk c44059Jdk2 : list) {
                                    c44274JhQ2.A01.A02(c44059Jdk2);
                                    c44274JhQ2.A00 = c44059Jdk2;
                                    c44059Jdk2.A08.add(c44274JhQ2);
                                }
                                Iterator it2 = c44274JhQ2.A02.iterator();
                                while (it2.hasNext()) {
                                    ((MRD) it2.next()).Dgq();
                                }
                                c44272JhO2.A07.A05();
                            } catch (Exception unused2) {
                                C44272JhO.A00(c44272JhO2);
                            }
                        }
                    });
                    c44272JhO.A00 = c47z2;
                    c47z2.getClass();
                    c47z2.A1i.A01 = 0;
                } catch (Exception e) {
                    C0K8.A0F("VideoCaptureController", "Failed to recover clips :(", e);
                    return false;
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (!AbstractC166987dD.A1a(obj)) {
            C44272JhO.A00(this.A00);
        }
        MN4 mn4 = (MN4) this.A00.A0A.get();
        if (mn4 != null) {
            ((ViewOnClickListenerC44269JhH) mn4).A0d.setEnabled(true);
        }
    }
}
