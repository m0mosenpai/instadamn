package X;

import android.os.Bundle;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.Ikh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42074Ikh implements C06Z {
    public final /* synthetic */ JJ5 A00;
    public final /* synthetic */ C1NI A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ AndroidLink A03;
    public final /* synthetic */ AndroidLink A04;
    public final /* synthetic */ C37952Gmu A05;

    public C42074Ikh(JJ5 jj5, C1NI c1ni, C38321qM c38321qM, AndroidLink androidLink, AndroidLink androidLink2, C37952Gmu c37952Gmu) {
        this.A05 = c37952Gmu;
        this.A02 = c38321qM;
        this.A04 = androidLink;
        this.A03 = androidLink2;
        this.A01 = c1ni;
        this.A00 = jj5;
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        C14360o3.A0B(bundle, 1);
        String string = bundle.getString(AbstractC58317Pt9.A00(917));
        if (string != null && string.equals(AbstractC58317Pt9.A00(918))) {
            C37952Gmu c37952Gmu = this.A05;
            C38321qM c38321qM = this.A02;
            AndroidLink androidLink = this.A04;
            AndroidLink androidLink2 = this.A03;
            AbstractC41772Ieo.A03(this.A00, this.A01, c38321qM, androidLink, androidLink2, c37952Gmu);
        }
    }
}
