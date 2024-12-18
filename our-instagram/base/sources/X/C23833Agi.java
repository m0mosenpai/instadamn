package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

/* renamed from: X.Agi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C23833Agi implements BC0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C22925A8v A02;
    public final /* synthetic */ C183978Ee A03;
    public final /* synthetic */ LinkedHashMap A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ EnumC53116NeT[] A07;

    public /* synthetic */ C23833Agi(Context context, UserSession userSession, C22925A8v c22925A8v, C183978Ee c183978Ee, LinkedHashMap linkedHashMap, EnumC53116NeT[] enumC53116NeTArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c183978Ee;
        this.A02 = c22925A8v;
        this.A07 = enumC53116NeTArr;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = linkedHashMap;
    }

    @Override // X.BC0
    public final AAZ AMw(A5Z a5z, FilterGroupModel filterGroupModel) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C183978Ee c183978Ee = this.A03;
        return new AAZ(context, userSession, a5z, this.A02, filterGroupModel, c183978Ee, this.A04, this.A07, this.A05, this.A06);
    }
}
