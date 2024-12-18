package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.util.LinkedHashMap;

/* renamed from: X.HWh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39300HWh extends C17T implements InterfaceC107194sQ {
    @Override // X.InterfaceC107194sQ
    public final IGStoryTextAlignmentTypeEnum C5y() {
        return (IGStoryTextAlignmentTypeEnum) A0N(-1783100079, JD9.A00);
    }

    @Override // X.InterfaceC107194sQ
    public final C107184sP F5s() {
        return new C107184sP(C5y());
    }

    @Override // X.InterfaceC107194sQ
    public final TreeUpdaterJNI F7o() {
        String str;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (C5y() != null) {
            IGStoryTextAlignmentTypeEnum C5y = C5y();
            if (C5y != null) {
                str = C5y.A00;
            } else {
                str = null;
            }
            A0X.put("text_alignment", str);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
