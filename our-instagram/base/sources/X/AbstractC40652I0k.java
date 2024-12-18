package X;

import com.instagram.api.schemas.InterestPivotStyle;

/* renamed from: X.I0k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40652I0k {
    public static final boolean A00(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM) {
        InterestPivotStyle interestPivotStyle;
        if ("feed_timeline".equals(interfaceC11380iw.getModuleName())) {
            InterfaceC43558JLs B5l = c38321qM.A0C.B5l();
            if (B5l != null) {
                interestPivotStyle = B5l.C34();
            } else {
                interestPivotStyle = null;
            }
            if (interestPivotStyle == InterestPivotStyle.A04) {
                return true;
            }
        }
        return false;
    }
}
