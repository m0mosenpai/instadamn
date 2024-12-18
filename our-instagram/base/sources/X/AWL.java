package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class AWL implements BCS {
    public final /* synthetic */ AAB A00;

    public AWL(AAB aab) {
        this.A00 = aab;
    }

    @Override // X.BCS
    public final void Czc(Bitmap bitmap) {
        C23088AFw c23088AFw = this.A00.A04;
        C214899fR c214899fR = c23088AFw.A00;
        c214899fR.A02().A02(EnumC223239t9.A0a, "", null);
        String str = c214899fR.A0H;
        if (str == null) {
            C14360o3.A0F("effectId");
            throw C00O.createAndThrow();
        }
        C23088AFw.A00(c23088AFw, str);
        AbstractC166987dD.A1Z(new MC5(bitmap, c214899fR, (InterfaceC23621Ds) null, 10), c214899fR.A0N);
    }

    @Override // X.BCS
    public final void D2I(Exception exc) {
        this.A00.A04.A00.A02().A02(EnumC223239t9.A0Y, "CAPTURE", String.valueOf(exc));
    }
}
