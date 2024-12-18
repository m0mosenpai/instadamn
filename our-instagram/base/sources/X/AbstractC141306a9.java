package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.StoryPromptType;

/* renamed from: X.6a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141306a9 {
    public static final EnumC193878i8 A00(CameraTool cameraTool) {
        if (cameraTool != null) {
            int ordinal = cameraTool.ordinal();
            if (ordinal != 127) {
                if (ordinal != 18) {
                    if (ordinal == 7) {
                        return EnumC193878i8.A0A;
                    }
                    return null;
                }
                return EnumC193878i8.A09;
            }
            return EnumC193878i8.A0B;
        }
        return null;
    }

    public static final EnumC193878i8 A01(StoryPromptType storyPromptType) {
        int ordinal = storyPromptType.ordinal();
        if (ordinal != 6 && ordinal != 7) {
            if (ordinal != 9) {
                return null;
            }
            return EnumC193878i8.A0B;
        }
        return EnumC193878i8.A09;
    }
}
