package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import java.util.List;

/* renamed from: X.FgD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35220FgD {
    public static final C35220FgD A00 = new Object();

    public static final BusinessConversionFlowStatus A00(BusinessConversionFlowStatus businessConversionFlowStatus, int i, int i2) {
        if (i >= 0) {
            ImmutableList immutableList = businessConversionFlowStatus.A01;
            if (i < immutableList.size()) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                int size = immutableList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (i3 != i) {
                        builder.add(immutableList.get(i3));
                    }
                }
                return new BusinessConversionFlowStatus(AbstractC31172DnG.A0K(builder), i2);
            }
            return businessConversionFlowStatus;
        }
        return businessConversionFlowStatus;
    }

    public static final BusinessConversionFlowStatus A02(BusinessConversionFlowStatus businessConversionFlowStatus, List list, int i, int i2) {
        if (i >= 0) {
            ImmutableList immutableList = businessConversionFlowStatus.A01;
            if (i <= immutableList.size()) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (int i3 = 0; i3 < i; i3++) {
                    builder.add(immutableList.get(i3));
                }
                if (!list.isEmpty()) {
                    builder.addAll(list);
                }
                return new BusinessConversionFlowStatus(AbstractC31172DnG.A0K(builder), i2);
            }
        }
        throw AbstractC31172DnG.A0u();
    }

    public static final BusinessConversionFlowStatus A01(BusinessConversionFlowStatus businessConversionFlowStatus, EnumC33376Ep9 enumC33376Ep9) {
        int i;
        ImmutableList immutableList;
        BusinessConversionStep A002 = businessConversionFlowStatus.A00();
        int i2 = businessConversionFlowStatus.A00;
        if (i2 > -1) {
            immutableList = businessConversionFlowStatus.A01;
            if (i2 != immutableList.size() && A002 != null) {
                if (A002.A00 != enumC33376Ep9) {
                    BusinessConversionStep businessConversionStep = new BusinessConversionStep(enumC33376Ep9, A002.A01);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    int size = immutableList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (i3 == i2) {
                            builder.add((Object) businessConversionStep);
                        }
                        if (i3 != i2) {
                            builder.add(immutableList.get(i3));
                        }
                    }
                    immutableList = AbstractC31172DnG.A0K(builder);
                }
                i = i2 + 1;
            } else {
                return null;
            }
        } else {
            i = 0;
            immutableList = businessConversionFlowStatus.A01;
        }
        return new BusinessConversionFlowStatus(immutableList, i);
    }
}
