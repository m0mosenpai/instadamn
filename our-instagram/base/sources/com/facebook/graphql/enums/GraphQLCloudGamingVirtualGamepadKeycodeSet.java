package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLCloudGamingVirtualGamepadKeycodeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[28];
        System.arraycopy(new String[]{"Y"}, AbstractC31175DnJ.A1b(new String[]{"A", "B", "DPAD_DOWN", "DPAD_LEFT", "DPAD_RIGHT", "DPAD_UP", "HOME", "KEYBOARD", "L3", "LB", "LEFT", "LEFT_NEGATIVE_X", "LEFT_NEGATIVE_Y", "LEFT_POSITIVE_X", "LEFT_POSITIVE_Y", "LT", "R3", "RB", "RIGHT", "RIGHT_NEGATIVE_X", "RIGHT_NEGATIVE_Y", "RIGHT_POSITIVE_X", "RIGHT_POSITIVE_Y", "RT", "SELECT", "START", "X"}, strArr) ? 1 : 0, strArr, 27, 1);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
