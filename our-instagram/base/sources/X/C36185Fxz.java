package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fxz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36185Fxz implements InterfaceC66482zP {
    public final DirectShareTarget A00;

    public C36185Fxz(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 1);
        this.A00 = directShareTarget;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC31173DnH.A0o(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C36185Fxz c36185Fxz = (C36185Fxz) obj;
        String A0o = AbstractC31173DnH.A0o(this.A00);
        if (c36185Fxz != null) {
            str = AbstractC31173DnH.A0o(c36185Fxz.A00);
        } else {
            str = null;
        }
        return A0o.equals(str);
    }
}
