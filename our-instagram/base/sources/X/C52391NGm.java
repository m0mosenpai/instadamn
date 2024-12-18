package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.NGm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52391NGm extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC58039PoP A02;
    public final /* synthetic */ InterfaceC49612Pu A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ ExecutorService A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52391NGm(Context context, UserSession userSession, InterfaceC58039PoP interfaceC58039PoP, InterfaceC49612Pu interfaceC49612Pu, File file, File file2, File file3, ExecutorService executorService) {
        super(626, 3, false, false);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = interfaceC49612Pu;
        this.A07 = executorService;
        this.A05 = file;
        this.A04 = file2;
        this.A06 = file3;
        this.A02 = interfaceC58039PoP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC49612Pu interfaceC49612Pu = this.A03;
            File file = this.A05;
            File file2 = this.A04;
            File file3 = this.A06;
            AbstractC53914Nsn.A00(interfaceC49612Pu, file, file2, file3, 0);
            this.A02.Dq9(file3);
        } catch (IOException e) {
            this.A02.DG2(e);
        }
    }
}
