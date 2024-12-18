package X;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PfK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57484PfK extends C0YY implements InterfaceC16820sZ {
    public static final C57484PfK A00 = new C57484PfK();

    public C57484PfK() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object A1D;
        float f;
        Float A0n;
        try {
            InterfaceC09390do interfaceC09390do = O1C.A07;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            try {
                ArrayList A1E = AbstractC166987dD.A1E();
                AbstractC38581qm.A01(bufferedReader, new C9E2(A1E, 35));
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (AbstractC002300n.A0h((String) next, "BogoMIPS", false)) {
                        A1E2.add(next);
                    }
                }
                ArrayList A0q = AbstractC167017dG.A0q(A1E2);
                Iterator it2 = A1E2.iterator();
                while (it2.hasNext()) {
                    List A0R = AbstractC001900j.A0R(AbstractC166987dD.A1B(it2), new String[]{":"}, 0);
                    float f2 = 0.0f;
                    if (A0R.size() > 1 && (A0n = AnonymousClass010.A0n(AbstractC25228BEl.A1A((String) AbstractC001800i.A0K(A0R)))) != null) {
                        f2 = A0n.floatValue();
                    }
                    MSX.A1Q(A0q, f2);
                }
                Iterator it3 = A0q.iterator();
                float f3 = 0.0f;
                while (it3.hasNext()) {
                    f3 += AbstractC166987dD.A09(it3.next());
                }
                bufferedReader.close();
                A1D = Float.valueOf(f3);
            } finally {
            }
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        if (A1D instanceof C09540e5) {
            A1D = null;
        }
        Number number = (Number) A1D;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        return Float.valueOf(f);
    }
}
