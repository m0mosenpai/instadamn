package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Ole, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55544Ole implements InterfaceC31115Dlx {
    public final Context A00;

    @Override // X.InterfaceC31115Dlx
    public final /* synthetic */ Object ALu(Context context, SH5 sh5, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c24891Jo.CPA(new C57560PgY(cancellationSignal, 2));
        C55545Olf c55545Olf = new C55545Olf(c24891Jo);
        C4PW c4pw = new C4PW();
        C14360o3.A0B(sh5, 1);
        InterfaceC58096PpL A01 = new C62923SXf(this.A00).A01();
        if (A01 == null) {
            c55545Olf.DEG(new AbstractC53409Njy("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A01.onCreateCredential(context, sh5, cancellationSignal, c4pw, c55545Olf);
        }
        return c24891Jo.A0E();
    }

    @Override // X.InterfaceC31115Dlx
    public final /* synthetic */ Object At9(Context context, C62471SCy c62471SCy, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c24891Jo.CPA(new C57560PgY(cancellationSignal, 3));
        C55546Olg c55546Olg = new C55546Olg(c24891Jo);
        C4PW c4pw = new C4PW();
        C14360o3.A0B(c62471SCy, 1);
        InterfaceC58096PpL A01 = new C62923SXf(context).A01();
        if (A01 == null) {
            c55546Olg.DEG(new AbstractC53410Njz("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A01.onGetCredential(context, c62471SCy, cancellationSignal, c4pw, c55546Olg);
        }
        return c24891Jo.A0E();
    }

    public C55544Ole(Context context) {
        this.A00 = context;
    }
}
