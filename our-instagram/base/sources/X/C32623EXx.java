package X;

import java.util.List;

/* renamed from: X.EXx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32623EXx extends C4F4 {
    public final int A00;
    public final List A01;

    public C32623EXx(List list, int i) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32623EXx c32623EXx = (C32623EXx) obj;
        C14360o3.A0B(c32623EXx, 0);
        return C14360o3.A0K(this.A01, c32623EXx.A01);
    }
}
