package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.core.PreferencesSerializer;
import java.util.List;

/* renamed from: X.MSv */
/* loaded from: classes9.dex */
public final class C50542MSv {
    public static final C50542MSv A00 = new Object();

    public static /* synthetic */ C50544MSx A00(C55549Olj c55549Olj, List list, InterfaceC16820sZ interfaceC16820sZ, int i) {
        Object obj = c55549Olj;
        C19K c19k = null;
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            list = C16930sl.A00;
        }
        if ((i & 4) != 0) {
            c19k = AnonymousClass194.A02(AnonymousClass190.A02(C12P.A01, new AnonymousClass197(null)));
        }
        AbstractC167017dG.A1P(list, c19k);
        PreferencesSerializer preferencesSerializer = PreferencesSerializer.A00;
        C57514Pfo c57514Pfo = new C57514Pfo(interfaceC16820sZ, 18);
        C14360o3.A0B(preferencesSerializer, 0);
        if (obj == null) {
            obj = new Object();
        }
        return new C50544MSx(new SingleProcessDataStore((InterfaceC57892Plw) obj, preferencesSerializer, AbstractC166987dD.A1J(new D52(list, (InterfaceC23621Ds) null, 25, 42)), c57514Pfo, c19k));
    }
}
