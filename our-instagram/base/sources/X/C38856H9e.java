package X;

import java.util.List;

/* renamed from: X.H9e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38856H9e extends C3DB implements InterfaceC74303Vl {
    public Integer A00;
    public String A01;
    public List A02;

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return false;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        C14360o3.A0A(this.A00);
        List list = this.A02;
        C14360o3.A0A(list);
        return new C40928IBa(list);
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A01;
    }
}
