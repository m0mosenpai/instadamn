package X;

import androidx.datastore.preferences.core.Preferences;

/* renamed from: X.0LC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LC extends C0YY implements InterfaceC16660sJ {
    public static final C0LC A00 = new C0LC();

    public C0LC() {
        super(1);
    }

    public static final Preferences A00(C53087Ne0 c53087Ne0) {
        C14360o3.A0B(c53087Ne0, 0);
        C0K8.A0F("IgDataStoreCorruption", AnonymousClass001.A0R("Corrupted file: ", "app_restart_logging"), c53087Ne0);
        return AbstractC53646Nnr.A00();
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00((C53087Ne0) obj);
    }
}
