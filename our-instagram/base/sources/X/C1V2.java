package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1V2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V2 extends C1V3 {
    public C34717FRd A00;

    @Override // X.C1V3
    public final void A02(Context context, AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(abstractC12990ll, 1);
        if (context != null) {
            A00(context, abstractC12990ll, enumC33445EqI, null, C05F.A00, z, false, z3, z4, z5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.FrJ, java.lang.Object] */
    @Override // X.C1V3
    public final void A03(Context context, UserSession userSession, GY7 gy7, EnumC33445EqI enumC33445EqI, Integer num, Integer num2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        ?? obj = new Object();
        obj.A00 = userSession;
        obj.A01 = enumC33445EqI;
        obj.A02 = num;
        obj.A03 = z2;
        Integer num3 = C05F.A01;
        if (num2 != num3) {
            A00(context, userSession, enumC33445EqI, num, num3, false, obj.A00(), true, z, z2);
        }
        C35036Fc9 c35036Fc9 = C33002Egp.A03;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        c35036Fc9.A02(applicationContext, userSession, obj, gy7, enumC33445EqI, num2).A03(userSession, obj, enumC33445EqI);
        AbstractC34272F9s.A00(userSession, context, z2);
    }

    @Override // X.C1V3
    public final void A04(Context context, UserSession userSession, GY7 gy7, EnumC33445EqI enumC33445EqI, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(enumC33445EqI, 3);
        A03(context, userSession, gy7, enumC33445EqI, null, C05F.A00, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.FrJ, java.lang.Object] */
    public static final void A00(Context context, AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ?? obj = new Object();
        obj.A01 = enumC33445EqI;
        obj.A02 = num;
        obj.A03 = z5;
        if (abstractC12990ll instanceof UserSession) {
            obj.A00 = (UserSession) abstractC12990ll;
        }
        ArrayList arrayList = new ArrayList(C33002Egp.A03.A03(context, abstractC12990ll, obj, enumC33445EqI).A04.values());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1ON A00 = AbstractC34271F9r.A00(context, abstractC12990ll, enumC33445EqI, num2, num, arrayList, z, z2, AbstractC23851Es.A03(), z3, z4);
        A00.A00 = new C32484ESk(context, abstractC12990ll, obj, enumC33445EqI, elapsedRealtime);
        C1GJ.A03(A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FRd] */
    @Override // X.C1V3
    public final C34717FRd A01() {
        C34717FRd c34717FRd = this.A00;
        if (c34717FRd == null) {
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return c34717FRd;
    }
}
