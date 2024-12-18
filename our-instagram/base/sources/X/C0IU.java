package X;

import android.content.Context;
import android.view.Choreographer;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0IU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IU extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IU(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InstagramApplicationForMainProcess instagramApplicationForMainProcess = this.A01;
        Context context = instagramApplicationForMainProcess.appContext;
        C211211o c211211o = this.A00;
        Choreographer choreographer = instagramApplicationForMainProcess.choreographer;
        C14360o3.A07(choreographer);
        return new C14E(context, choreographer, c211211o);
    }
}
