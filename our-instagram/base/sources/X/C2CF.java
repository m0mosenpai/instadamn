package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2CF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CF {
    public static final C2CG A0D = new Object();
    public static final Map A0E;
    public static volatile C2CF A0F;
    public final C2CH A00;
    public final C2CP A01;
    public final C2CQ A02;
    public final C2CM A03;
    public final C2CN A04;
    public final C2CO A05;
    public final C2CK A06;
    public final C1CN A07;
    public final Context A08;
    public final C006802i A09;
    public final UserSession A0A;
    public final C2CI A0B;
    public final C2CJ A0C;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2CG] */
    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        A0E = synchronizedMap;
    }

    public C2CF(Context context, UserSession userSession, C2CH c2ch, C2CI c2ci, C2CJ c2cj) {
        this.A08 = context;
        this.A0A = userSession;
        this.A00 = c2ch;
        this.A0B = c2ci;
        this.A0C = c2cj;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A09 = c006802i;
        this.A06 = new C2CK(c006802i, c2cj);
        this.A03 = new C2CM(c006802i, c2cj);
        this.A04 = new C2CN(c006802i);
        this.A05 = new C2CO(c006802i, c2ci, c2cj);
        this.A01 = new C2CP(context, c006802i, userSession);
        this.A02 = new C2CQ(c006802i);
        this.A07 = C1CN.A06.A00(context, c006802i, userSession);
    }
}
