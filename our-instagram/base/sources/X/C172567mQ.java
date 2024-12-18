package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172567mQ extends C2US implements InterfaceC152956uP {
    public List A00;
    public final Context A01;
    public final UserSession A02;
    public final C1810981l A03;
    public final C172587mS A04;
    public final C172577mR A05;
    public final C172597mT A06;
    public final C172427mB A07;
    public final Map A08;

    public C172567mQ(Context context, UserSession userSession, C1810981l c1810981l, C172427mB c172427mB) {
        super(false);
        this.A01 = context;
        this.A02 = userSession;
        this.A07 = c172427mB;
        this.A03 = c1810981l;
        this.A00 = C16930sl.A00;
        this.A08 = new HashMap();
        C172577mR c172577mR = new C172577mR(userSession, c1810981l, c172427mB, true);
        this.A05 = c172577mR;
        C172587mS c172587mS = new C172587mS(userSession, c1810981l, c172427mB);
        this.A04 = c172587mS;
        C172597mT c172597mT = new C172597mT(userSession, c172427mB, true);
        this.A06 = c172597mT;
        init(c172577mR, c172587mS, c172597mT);
    }

    public static final void A00(AbstractC65632xz abstractC65632xz, C172567mQ c172567mQ, List list, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * i2;
            C153126ug c153126ug = new C153126ug(list, i4, i2);
            C153336v2 BQs = c172567mQ.BQs(String.valueOf(c153126ug.hashCode()));
            boolean z = false;
            if (i3 == i - 1) {
                z = true;
            }
            BQs.A00(i3, z);
            BQs.A01 = i4;
            c172567mQ.addModel(c153126ug, BQs, abstractC65632xz);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.6v2, X.9o7, java.lang.Object] */
    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A08;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            ?? c153336v22 = new C153336v2();
            c153336v22.A01 = true;
            c153336v22.A00 = false;
            map.put(str, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }
}
