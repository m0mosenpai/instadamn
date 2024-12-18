package X;

import com.instagram.music.common.model.AudioType;

/* loaded from: classes7.dex */
public abstract class I4Y {
    public static final EnumC39636HiR A00(AudioType audioType) {
        if (audioType != null) {
            int ordinal = audioType.ordinal();
            if (ordinal != 1) {
                if (ordinal == 0) {
                    return EnumC39636HiR.SONG;
                }
                return null;
            }
            return EnumC39636HiR.ORIGINAL;
        }
        return null;
    }
}
