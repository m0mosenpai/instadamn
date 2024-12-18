package X;

import android.view.View;

/* renamed from: X.KaL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46064KaL extends AnonymousClass522 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C45127Jxw A01;
    public final /* synthetic */ C45521KDm A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46064KaL(C45127Jxw c45127Jxw, C45521KDm c45521KDm, int i, int i2) {
        super(Integer.valueOf(i2));
        this.A02 = c45521KDm;
        this.A01 = c45127Jxw;
        this.A00 = i;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02.A06);
        String str = this.A01.A01;
        int i = this.A00;
        C14360o3.A0B(str, 0);
        AbstractC166987dD.A1Z(new PYf(A0Z, str, null, i, 0), AbstractC141776au.A00(A0Z));
    }
}
