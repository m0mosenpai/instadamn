package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TwA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65904TwA implements XDR {
    public final int A00;

    public C65904TwA(int i) {
        this.A00 = i;
    }

    @Override // X.XDR
    public final void AHx(UserSession userSession) {
        String str;
        int i = this.A00;
        InterfaceC19610xo A0Q = AbstractC65702TsY.A0Q(userSession);
        switch (i) {
            case 0:
                str = "recent_effect_searches";
                break;
            case 1:
                str = AbstractC111324zv.A00(2950);
                break;
            case 2:
                str = "recent_keyword_searches_with_ts";
                break;
            case 3:
                str = "recent_map_hashtag_searches_with_ts";
                break;
            case 4:
                str = "recent_map_query_searches_with_ts";
                break;
            case 5:
                str = "recent_map_location_searches_with_ts";
                break;
            case 6:
                str = AbstractC111324zv.A00(2951);
                break;
            case 7:
                str = "recent_tagged_users";
                break;
            default:
                str = AbstractC111324zv.A00(2952);
                break;
        }
        A0Q.EEj(str);
        A0Q.apply();
    }

    @Override // X.XDR
    public final String B8o(UserSession userSession) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        int i2 = this.A00;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        switch (i2) {
            case 0:
                interfaceC16530ry = A00.A6y;
                c0yrArr = C23031Ai.A8c;
                i = 15;
                break;
            case 1:
                interfaceC16530ry = A00.A6z;
                c0yrArr = C23031Ai.A8c;
                i = 11;
                break;
            case 2:
                interfaceC16530ry = A00.A70;
                c0yrArr = C23031Ai.A8c;
                i = 13;
                break;
            case 3:
                interfaceC16530ry = A00.A71;
                c0yrArr = C23031Ai.A8c;
                i = 17;
                break;
            case 4:
                interfaceC16530ry = A00.A73;
                c0yrArr = C23031Ai.A8c;
                i = 18;
                break;
            case 5:
                interfaceC16530ry = A00.A72;
                c0yrArr = C23031Ai.A8c;
                i = 16;
                break;
            case 6:
                interfaceC16530ry = A00.A74;
                c0yrArr = C23031Ai.A8c;
                i = 12;
                break;
            case 7:
                interfaceC16530ry = A00.A77;
                c0yrArr = C23031Ai.A8c;
                i = 10;
                break;
            default:
                interfaceC16530ry = A00.A76;
                c0yrArr = C23031Ai.A8c;
                i = 9;
                break;
        }
        return MSX.A0j(A00, interfaceC16530ry, c0yrArr, i);
    }

    @Override // X.XDR
    public final void ELw(UserSession userSession, String str) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        int i2 = this.A00;
        AbstractC167017dG.A1N(userSession, str);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        switch (i2) {
            case 0:
                interfaceC16530ry = A00.A6y;
                c0yrArr = C23031Ai.A8c;
                i = 15;
                break;
            case 1:
                interfaceC16530ry = A00.A6z;
                c0yrArr = C23031Ai.A8c;
                i = 11;
                break;
            case 2:
                interfaceC16530ry = A00.A70;
                c0yrArr = C23031Ai.A8c;
                i = 13;
                break;
            case 3:
                interfaceC16530ry = A00.A71;
                c0yrArr = C23031Ai.A8c;
                i = 17;
                break;
            case 4:
                interfaceC16530ry = A00.A73;
                c0yrArr = C23031Ai.A8c;
                i = 18;
                break;
            case 5:
                interfaceC16530ry = A00.A72;
                c0yrArr = C23031Ai.A8c;
                i = 16;
                break;
            case 6:
                interfaceC16530ry = A00.A74;
                c0yrArr = C23031Ai.A8c;
                i = 12;
                break;
            case 7:
                interfaceC16530ry = A00.A77;
                c0yrArr = C23031Ai.A8c;
                i = 10;
                break;
            default:
                interfaceC16530ry = A00.A76;
                c0yrArr = C23031Ai.A8c;
                i = 9;
                break;
        }
        AbstractC31171DnF.A1S(A00, str, interfaceC16530ry, c0yrArr, i);
    }
}
