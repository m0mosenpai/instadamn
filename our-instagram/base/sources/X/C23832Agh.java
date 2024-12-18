package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Agh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C23832Agh implements BC0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C22925A8v A02;
    public final /* synthetic */ C183978Ee A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ EnumC53116NeT[] A06;

    public /* synthetic */ C23832Agh(Context context, UserSession userSession, C22925A8v c22925A8v, C183978Ee c183978Ee, EnumC53116NeT[] enumC53116NeTArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c183978Ee;
        this.A02 = c22925A8v;
        this.A06 = enumC53116NeTArr;
        this.A04 = z;
        this.A05 = z2;
    }

    @Override // X.BC0
    public final AAZ AMw(A5Z a5z, FilterGroupModel filterGroupModel) {
        return new AAZ(this.A00, this.A01, a5z, this.A02, filterGroupModel, this.A03, null, this.A06, this.A04, this.A05);
    }
}
