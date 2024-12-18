package X;

import java.util.List;

/* renamed from: X.Wcu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70561Wcu implements C2JL {
    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        C203148yW c203148yW = (C203148yW) AbstractC001800i.A0J(list);
        if (c203148yW != null) {
            C203128yU c203128yU = c203148yW.A01;
            C14360o3.A07(c203128yU.A00);
            C203118yT c203118yT = c203128yU.A01;
            C14360o3.A07(c203118yT);
            C14360o3.A07(c203118yT.A02);
        }
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
    }
}
