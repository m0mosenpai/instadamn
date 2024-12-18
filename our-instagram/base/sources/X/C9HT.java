package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9HT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HT extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9HT(Object obj, Object obj2, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            C7IM c7im = (C7IM) this.A02;
            boolean z = ((C160787Im) this.A01).A0e.A2P;
            boolean z2 = this.A03;
            boolean z3 = this.A04;
            C14360o3.A0B(c7im, 0);
            if (!z3) {
                if (z2 == z) {
                    return null;
                }
            } else if (!z) {
                return null;
            }
            return new ColorDrawable(c7im.A04.A0A);
        }
        return new C1811081m((Context) this.A01, (UserSession) this.A02, this.A03, this.A04);
    }
}
