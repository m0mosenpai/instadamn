package X;

import com.instagram.music.common.model.InstagramAudioApplySource;

/* loaded from: classes7.dex */
public abstract class I4Z {
    public static final InstagramAudioApplySource A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            switch (Integer.parseInt(str)) {
                case 1:
                    return InstagramAudioApplySource.A03;
                case 2:
                    return InstagramAudioApplySource.A04;
                case 3:
                    return InstagramAudioApplySource.A05;
                case 4:
                    return InstagramAudioApplySource.A06;
                case 5:
                    return InstagramAudioApplySource.A08;
                case 6:
                    return InstagramAudioApplySource.A07;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
