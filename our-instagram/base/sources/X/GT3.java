package X;

import android.content.Context;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GT3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ C129885ts A05;
    public final /* synthetic */ EnumC33402EpZ A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ JSONObject A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GT3(Context context, C1P1 c1p1, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, C129885ts c129885ts, EnumC33402EpZ enumC33402EpZ, User user, Boolean bool, Integer num, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        super(0);
        this.A05 = c129885ts;
        this.A00 = context;
        this.A07 = user;
        this.A0E = jSONObject;
        this.A06 = enumC33402EpZ;
        this.A0F = z;
        this.A01 = c1p1;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A09 = num;
        this.A04 = searchContext;
        this.A0B = str;
        this.A0A = str2;
        this.A08 = bool;
        this.A0D = str3;
        this.A0C = str4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C129885ts c129885ts = this.A05;
        Context context = this.A00;
        User user = this.A07;
        JSONObject jSONObject = this.A0E;
        EnumC33402EpZ enumC33402EpZ = this.A06;
        boolean z = this.A0F;
        C1P1 c1p1 = this.A01;
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A03;
        Integer num = this.A09;
        C129885ts.A01(context, c1p1, c38321qM, c75113Zb, this.A04, c129885ts, enumC33402EpZ, user, this.A08, AbstractC166997dE.A0a(), num, null, this.A0B, this.A0A, this.A0D, this.A0C, jSONObject, z);
        return C0eB.A00;
    }
}
