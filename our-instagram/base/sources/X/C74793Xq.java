package X;

import com.facebook.tigon.iface.TigonErrorCode;

/* renamed from: X.3Xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74793Xq {
    public final TigonErrorCode fromValue(int i) {
        TigonErrorCode tigonErrorCode = (TigonErrorCode) TigonErrorCode.NUMERIC_TO_ERROR_CODE.get(Integer.valueOf(i));
        if (tigonErrorCode == null) {
            return TigonErrorCode.NONE;
        }
        return tigonErrorCode;
    }
}
