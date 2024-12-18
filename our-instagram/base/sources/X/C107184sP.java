package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.util.LinkedHashMap;

/* renamed from: X.4sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107184sP extends C0T6 implements InterfaceC107194sQ {
    public final IGStoryTextAlignmentTypeEnum A00;

    @Override // X.InterfaceC107194sQ
    public final C107184sP F5s() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C107184sP) && this.A00 == ((C107184sP) obj).A00);
    }

    public final int hashCode() {
        IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum = this.A00;
        if (iGStoryTextAlignmentTypeEnum == null) {
            return 0;
        }
        return iGStoryTextAlignmentTypeEnum.hashCode();
    }

    @Override // X.InterfaceC107194sQ
    public final IGStoryTextAlignmentTypeEnum C5y() {
        return this.A00;
    }

    @Override // X.InterfaceC107194sQ
    public final TreeUpdaterJNI F7o() {
        String str;
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C5y() != null) {
            IGStoryTextAlignmentTypeEnum C5y = C5y();
            if (C5y != null) {
                str = C5y.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("text_alignment", str);
        }
        return new TreeUpdaterJNI("XDTStoryAdTextOptimizationInfoDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C107184sP(IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum) {
        this.A00 = iGStoryTextAlignmentTypeEnum;
    }
}
