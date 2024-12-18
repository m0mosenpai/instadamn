package X;

import android.content.Context;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Als, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24056Als implements InterfaceC57992Pnc {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C214959fX A01;
    public final /* synthetic */ UserStoryTarget A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C15370ps A05;
    public final /* synthetic */ boolean A06;

    public C24056Als(Context context, C214959fX c214959fX, UserStoryTarget userStoryTarget, String str, String str2, C15370ps c15370ps, boolean z) {
        this.A01 = c214959fX;
        this.A00 = context;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = c15370ps;
        this.A02 = userStoryTarget;
        this.A06 = z;
    }

    @Override // X.InterfaceC57992Pnc
    public final void Dgl(Integer num) {
        C14360o3.A0B(num, 0);
        if (num == C05F.A00) {
            C214959fX c214959fX = this.A01;
            C214959fX.A02(this.A00, c214959fX, (C51690MsL) this.A05.A00, this.A02, this.A04, this.A03, this.A06);
        }
    }
}
