package X;

import androidx.datastore.migrations.SharedPreferencesMigration;

/* loaded from: classes8.dex */
public abstract class JQM {
    public static final java.util.Set A00 = AbstractC31171DnF.A0l();

    public static final SharedPreferencesMigration A00(java.util.Set set, InterfaceC16820sZ interfaceC16820sZ) {
        if (set == A00) {
            return new SharedPreferencesMigration(JQL.A00, interfaceC16820sZ, new MBr(set, (InterfaceC23621Ds) null, 2, 42), new C57182PaB(0, null));
        }
        return new SharedPreferencesMigration(set, interfaceC16820sZ, new MBr(set, (InterfaceC23621Ds) null, 2, 42), new C57182PaB(0, null));
    }
}
