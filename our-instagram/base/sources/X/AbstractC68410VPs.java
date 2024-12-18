package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.release.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.release.FXPFDebugSettingFragment;
import com.instagram.debug.devoptions.release.FXPFDeviceLibraryDebugFragment;
import com.instagram.debug.devoptions.release.FXPFLinkageCacheDebugFragment;
import com.instagram.debug.devoptions.release.FXPFServiceCacheDebugFragment;

/* renamed from: X.VPs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68410VPs {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        FXPFDebugSettingFragment fXPFServiceCacheDebugFragment;
        String A0E = AbstractC65702TsY.A0O(c6fw).A0E();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0E != null) {
            switch (A0E.hashCode()) {
                case -1187939666:
                    if (A0E.equals("Unified Launcher")) {
                        fXPFServiceCacheDebugFragment = new FXPFDebugSettingFragment();
                        break;
                    }
                    break;
                case 250295807:
                    if (A0E.equals("Access Library")) {
                        fXPFServiceCacheDebugFragment = new FXPFAccessLibraryDebugFragment();
                        break;
                    }
                    break;
                case 385322225:
                    if (A0E.equals("Device Library")) {
                        fXPFServiceCacheDebugFragment = new FXPFDeviceLibraryDebugFragment();
                        break;
                    }
                    break;
                case 512698919:
                    if (A0E.equals("Linkage Cache")) {
                        fXPFServiceCacheDebugFragment = new FXPFLinkageCacheDebugFragment();
                        break;
                    }
                    break;
                case 1521954327:
                    if (A0E.equals("Service Cache")) {
                        fXPFServiceCacheDebugFragment = new FXPFServiceCacheDebugFragment();
                        break;
                    }
                    break;
            }
            AbstractC31175DnJ.A0s(null, (Fragment) fXPFServiceCacheDebugFragment, new C140966Yy(A04, A0B));
            return null;
        }
        return null;
    }
}
