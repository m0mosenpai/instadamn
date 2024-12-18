package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jdl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44060Jdl {
    public final void A00(UserSession userSession, C2AH c2ah, C1GL c1gl, int i) {
        C14360o3.A0B(userSession, 0);
        C121275eQ c121275eQ = new C121275eQ(new CallableC44082Je7(userSession, 4), 593751321);
        c121275eQ.A00 = c2ah;
        if (c1gl != null) {
            c1gl.schedule(c121275eQ, 593751321, i, false, false);
        } else {
            C1GJ.A06(c121275eQ, 593751321, i, false, false);
        }
    }
}
