package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.8nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197048nZ extends C2AG implements InterfaceC174807qG {
    public Integer A00;
    public final /* synthetic */ C184748Hp A01;

    @Override // X.C11R
    public final int getRunnableId() {
        return 543;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        Integer num = this.A00;
        C184748Hp c184748Hp = this.A01;
        AbstractC226409yx.A00(c184748Hp.A07, (C55U) c184748Hp.A09.A08.A00, exc, num);
    }

    public C197048nZ(C184748Hp c184748Hp) {
        this.A01 = c184748Hp;
    }

    @Override // X.InterfaceC174807qG
    public final void Dal() {
        C174757qB c174757qB = this.A01.A0B.A06;
        if (c174757qB != null) {
            c174757qB.A0H(this);
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int A02 = AbstractC178387wC.A02(17);
        C184748Hp c184748Hp = this.A01;
        UserSession userSession = c184748Hp.A07;
        AbstractC189688an.A02(userSession, (C55U) c184748Hp.A09.A08.A00, ((C22F) AnonymousClass229.A01(userSession)).A04.A0L, null, A02);
        return c184748Hp.A0B.A0M();
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C184748Hp.A00(bitmap, this, this.A01, this.A00);
        } else {
            onFail(new IllegalStateException("Camera preview SurfaceTexture Unavailable!"));
        }
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        super.onFinish();
        this.A01.A0C.A06();
    }
}
