package X;

import com.facebook.rsys.call.gen.CallModel;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Npt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53741Npt {
    public static final InterfaceC58275PsT A00(CallModel callModel, FoaUserSession foaUserSession) {
        String str;
        RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity;
        UserSession A00 = AbstractC28057CYl.A00(foaUserSession);
        if (A00 == null || callModel == null || (str = callModel.sharedCallId) == null) {
            return null;
        }
        C55051Oa2 c55051Oa2 = C55051Oa2.A00;
        RtcConnectionEntity A002 = C55051Oa2.A00(AbstractC37301Gc2.A0p(A00.userId, str));
        if (A002 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) A002;
        } else {
            rtcCallConnectionEntity = null;
        }
        return AbstractC54155Nwr.A00(A00).A01.BXS(rtcCallConnectionEntity != null ? rtcCallConnectionEntity.A09 : null);
    }
}
