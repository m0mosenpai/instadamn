package X;

import android.content.res.Configuration;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02690At extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C02690At(InstagramApplicationForMainProcess instagramApplicationForMainProcess, Configuration configuration) {
        super(0);
        this.A00 = configuration;
        this.A01 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InstagramApplicationForMainProcess.onConfigurationChangedCallback$doJob(this.A01, this.A00);
        return C0eB.A00;
    }
}
