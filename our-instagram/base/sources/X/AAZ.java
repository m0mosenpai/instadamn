package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class AAZ {
    public final Context A00;
    public final UserSession A01;
    public final A5Z A02;
    public final C22925A8v A03;
    public final InterfaceC58147PqC A04 = new AiJ(this);
    public final FilterGroupModel A05;
    public final LinkedHashMap A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final EnumC53116NeT[] A0B;

    public AAZ(Context context, UserSession userSession, A5Z a5z, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C183978Ee c183978Ee, LinkedHashMap linkedHashMap, EnumC53116NeT[] enumC53116NeTArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = filterGroupModel;
        this.A03 = c22925A8v;
        this.A0B = enumC53116NeTArr;
        this.A02 = a5z;
        this.A08 = c183978Ee.A14;
        this.A09 = c183978Ee.A19;
        this.A07 = z;
        this.A0A = z2;
        this.A06 = linkedHashMap;
    }
}
