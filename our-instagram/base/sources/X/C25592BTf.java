package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.BTf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25592BTf extends C1P1 {
    public final /* synthetic */ UserDetailFragment A00;

    public C25592BTf(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-510877167);
        C14360o3.A0B(this.A00.A0I, 0);
        C006802i.A0p.markerPoint(962534132, "pro_dash_query_end");
        C0f9.A0A(-566029504, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-992641239);
        C3DC c3dc = (C3DC) obj;
        int A032 = C0f9.A03(481792932);
        UserDetailFragment userDetailFragment = this.A00;
        String str = ((C25598BTl) c3dc.F7f()).A01;
        String str2 = ((C25598BTl) c3dc.F7f()).A00;
        boolean z = ((C25598BTl) c3dc.F7f()).A02;
        C155666yv c155666yv = userDetailFragment.A0z.A0O;
        c155666yv.A0M = str;
        c155666yv.A0L = str2;
        c155666yv.A0P = z;
        C0f9.A0A(656074677, A032);
        C0f9.A0A(-55705519, A03);
    }
}
