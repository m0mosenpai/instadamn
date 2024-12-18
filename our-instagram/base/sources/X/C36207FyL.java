package X;

import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;

/* renamed from: X.FyL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36207FyL implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final DirectSearchResult A04;
    public final String A05;

    public C36207FyL(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        String A0u;
        StringBuilder A1C;
        String str;
        C14360o3.A0B(directSearchResult, 1);
        this.A04 = directSearchResult;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        if (directSearchResult instanceof DirectMessageSearchMessage) {
            A1C = AbstractC166987dD.A1C();
            str = ((DirectMessageSearchMessage) directSearchResult).A07;
        } else if (directSearchResult instanceof DirectMessageSearchThread) {
            A1C = AbstractC166987dD.A1C();
            DirectMessageSearchThread directMessageSearchThread = (DirectMessageSearchThread) directSearchResult;
            A1C.append(directMessageSearchThread.A08);
            str = directMessageSearchThread.A06;
        } else {
            A0u = AbstractC166997dE.A0u(directSearchResult);
            this.A05 = A0u;
        }
        A1C.append(str);
        A1C.append('_');
        A1C.append(directSearchResult.hashCode());
        A0u = A1C.toString();
        this.A05 = A0u;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36207FyL c36207FyL = (C36207FyL) obj;
        C14360o3.A0B(c36207FyL, 0);
        return C14360o3.A0K(this.A04, c36207FyL.A04);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }
}
