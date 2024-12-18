package X;

import android.content.Context;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.IdentityFilter;
import java.util.List;
import java.util.Map;

/* renamed from: X.AAc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22958AAc {
    public int A00;
    public int A01;
    public C199758sR A02;
    public C199758sR A03;
    public ABQ A04;
    public C23015ACp A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A09;
    public final YPq A0B;
    public final C22979ABd A0D;
    public final List A0F;
    public final Map A0G = AbstractC166987dD.A1G();
    public final BCH A0E = new Object();
    public final C5NO A0C = new Object();
    public final Matrix4 A08 = new Matrix4();
    public final IdentityFilter A0A = new IdentityFilter();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.BCH] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.5NO] */
    public C22958AAc(Context context, UserSession userSession, YPq yPq, String str, List list) {
        this.A07 = context;
        this.A09 = userSession;
        this.A0B = yPq;
        this.A0F = list;
        this.A0D = new C22979ABd(context, userSession, str);
    }
}
