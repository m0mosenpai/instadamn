package X;

/* renamed from: X.8iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194348iu extends C4F4 {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Boolean bool;
        C194348iu c194348iu = (C194348iu) obj;
        Boolean valueOf = Boolean.valueOf(this.A01);
        Boolean bool2 = null;
        if (c194348iu != null) {
            bool = Boolean.valueOf(c194348iu.A01);
        } else {
            bool = null;
        }
        if (AbstractC50102Ry.A00(valueOf, bool)) {
            Boolean valueOf2 = Boolean.valueOf(this.A00);
            if (c194348iu != null) {
                bool2 = Boolean.valueOf(c194348iu.A00);
            }
            if (AbstractC50102Ry.A00(valueOf2, bool2)) {
                return true;
            }
        }
        return false;
    }

    public C194348iu(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
