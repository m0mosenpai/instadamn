package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;

/* renamed from: X.Msv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51718Msv extends C0T6 {
    public final int A00 = 0;
    public final Object A01;

    public C51718Msv(RemoteBooleanSettingId remoteBooleanSettingId) {
        this.A01 = remoteBooleanSettingId;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51718Msv) && ((C51718Msv) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (!A00(obj, i) || this.A01 != ((C51718Msv) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C51718Msv(RemoteStringSettingId remoteStringSettingId) {
        this.A01 = remoteStringSettingId;
    }
}
