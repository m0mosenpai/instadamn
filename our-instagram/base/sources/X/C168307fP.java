package X;

import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import java.util.List;

/* renamed from: X.7fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168307fP extends C0T6 implements InterfaceC168317fQ {
    public final NudgeType A00;
    public final NudgeVisualType A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168307fP) {
                C168307fP c168307fP = (C168307fP) obj;
                if (!C14360o3.A0K(this.A02, c168307fP.A02) || this.A00 != c168307fP.A00 || this.A01 != c168307fP.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A02;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        NudgeType nudgeType = this.A00;
        int hashCode2 = (hashCode + (nudgeType == null ? 0 : nudgeType.hashCode())) * 31;
        NudgeVisualType nudgeVisualType = this.A01;
        return hashCode2 + (nudgeVisualType != null ? nudgeVisualType.hashCode() : 0);
    }

    public C168307fP(NudgeType nudgeType, NudgeVisualType nudgeVisualType, List list) {
        this.A02 = list;
        this.A00 = nudgeType;
        this.A01 = nudgeVisualType;
    }
}
