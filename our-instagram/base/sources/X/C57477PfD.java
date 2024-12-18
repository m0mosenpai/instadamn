package X;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: X.PfD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57477PfD extends C0YY implements InterfaceC16820sZ {
    public static final C57477PfD A00 = new C57477PfD();

    public C57477PfD() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object A1D;
        InterfaceC09390do interfaceC09390do = AbstractC54346O0e.A00;
        try {
            A1D = AbstractC166987dD.A1E();
            File[] listFiles = AbstractC166987dD.A11("/sys/devices/system/cpu/").listFiles(C56830PKa.A00);
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    C14360o3.A07(name);
                    Integer.parseInt(AbstractC001900j.A0F("cpu", name));
                    File A0w = MSW.A0w(file, "cpufreq/cpuinfo_min_freq");
                    File A0w2 = MSW.A0w(file, "cpufreq/cpuinfo_max_freq");
                    Charset charset = C15W.A05;
                    A1D.add(new C54570O8w(AbstractC25228BEl.A1A(AbstractC57194Pae.A06(A0w, charset)), AbstractC25228BEl.A1A(AbstractC57194Pae.A06(A0w2, charset))));
                }
            }
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        if (C09550e6.A00(A1D) != null) {
            return C16930sl.A00;
        }
        return A1D;
    }
}
