package X;

import android.app.Activity;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Oza, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56313Oza implements InterfaceC37150GYl {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ N6J A01;
    public final /* synthetic */ C47Z A02;

    public C56313Oza(Activity activity, N6J n6j, C47Z c47z) {
        this.A01 = n6j;
        this.A02 = c47z;
        this.A00 = activity;
    }

    @Override // X.InterfaceC37150GYl
    public final void DY2() {
        C9GR.A0B(this.A00, "pending_media_prepare_failed_quick_publish");
    }

    @Override // X.InterfaceC37150GYl
    public final void DY3() {
        C54818OKt A04 = N6J.A04(this.A01);
        if (A04 != null) {
            C47Z c47z = this.A02;
            C14360o3.A0B(c47z, 0);
            A04.A00 = c47z;
            Object obj = true;
            if (obj.equals(obj)) {
                String A0x = AbstractC43593JPy.A0x();
                C14360o3.A0B(A0x, 0);
                c47z.A3t = A0x;
            }
            c47z.A5S = false;
            c47z.A0c(ShareType.A08);
            c47z.A5g = true;
            String str = c47z.A33;
            A04.A01 = str;
            A04.A03.A0G(c47z, AbstractC167007dF.A1W(str), obj.equals(obj));
        }
    }
}
