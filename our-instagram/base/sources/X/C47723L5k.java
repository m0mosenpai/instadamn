package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;

/* renamed from: X.L5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47723L5k {
    public final Bundle A00(RectF rectF, C22P c22p, UserSession userSession, CreativeConfigIntf creativeConfigIntf) {
        Bundle A0b = AbstractC166987dD.A0b();
        String B3z = creativeConfigIntf.B3z();
        if (B3z != null) {
            A0b.putString("effect_id", B3z);
        }
        String BcZ = creativeConfigIntf.BcZ();
        if (BcZ != null) {
            A0b.putString(MSV.A00(198), BcZ);
        }
        EnumC138476Pd A03 = AbstractC121575f6.A03(creativeConfigIntf);
        if (A03 != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325884201809367L);
            Parcelable A00 = A03.A00();
            if (!A06) {
                A00 = C0B1.A00(A00);
            }
            A0b.putParcelable(AbstractC111324zv.A00(16), A00);
        }
        EnumC223179sw A04 = AbstractC121575f6.A04(creativeConfigIntf);
        if (A04 != null) {
            A0b.putSerializable("device_position", A04);
        }
        A0b.putParcelable("camera_entry_bounds", new OpaqueParcelable(rectF));
        A0b.putSerializable("camera_entry_point", c22p);
        return A0b;
    }
}
