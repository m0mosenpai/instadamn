package X;

import com.instagram.model.direct.DirectSearchPrompt;

/* renamed from: X.FyG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36202FyG implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final DirectSearchPrompt A03;

    public C36202FyG(DirectSearchPrompt directSearchPrompt, int i, int i2, int i3) {
        C14360o3.A0B(directSearchPrompt, 1);
        this.A03 = directSearchPrompt;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36202FyG c36202FyG = (C36202FyG) obj;
        C14360o3.A0B(c36202FyG, 0);
        if (C14360o3.A0K(this.A03, c36202FyG.A03) && this.A00 == c36202FyG.A00 && this.A01 == c36202FyG.A01 && this.A02 == c36202FyG.A02) {
            return true;
        }
        return false;
    }
}
