package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G0y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36329G0y implements GXJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FKR A01;
    public final /* synthetic */ C33089Ein A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C36329G0y(Context context, FKR fkr, C33089Ein c33089Ein, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, boolean z) {
        this.A04 = directShareTarget;
        this.A02 = c33089Ein;
        this.A00 = context;
        this.A03 = c38321qM;
        this.A01 = fkr;
        this.A05 = str;
        this.A07 = z;
        this.A06 = str2;
    }

    @Override // X.GXJ
    public final void Dh2(String str) {
        if (str != null) {
            DirectShareTarget directShareTarget = this.A04;
            directShareTarget.A09 = AbstractC31171DnF.A0N(str);
            C33089Ein c33089Ein = this.A02;
            Context context = this.A00;
            C38321qM c38321qM = this.A03;
            c33089Ein.A00(context, this.A01, null, c38321qM, directShareTarget, this.A05, this.A06, null, null, this.A07);
        }
    }
}
