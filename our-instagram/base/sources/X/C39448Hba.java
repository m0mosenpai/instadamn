package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Hba, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39448Hba extends IAR {
    public final ClipsViewerSource A00;
    public final Integer A01;

    public C39448Hba(C39B c39b, Integer num) {
        ClipsViewerSource clipsViewerSource;
        C14360o3.A0B(num, 2);
        this.A01 = num;
        switch (c39b.ordinal()) {
            case 0:
                clipsViewerSource = ClipsViewerSource.A1S;
                break;
            case 1:
                clipsViewerSource = ClipsViewerSource.A1Y;
                break;
            case 2:
            case 3:
                clipsViewerSource = ClipsViewerSource.A1A;
                break;
            case 4:
                clipsViewerSource = ClipsViewerSource.A1B;
                break;
            case 5:
                clipsViewerSource = ClipsViewerSource.A19;
                break;
            case 6:
            case 7:
            case 8:
            default:
                clipsViewerSource = ClipsViewerSource.A2Z;
                break;
            case 9:
                clipsViewerSource = ClipsViewerSource.A1E;
                break;
            case 10:
                clipsViewerSource = ClipsViewerSource.A0R;
                break;
            case 11:
                clipsViewerSource = ClipsViewerSource.A0X;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                clipsViewerSource = ClipsViewerSource.A1V;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                clipsViewerSource = ClipsViewerSource.A1Z;
                break;
            case 14:
                clipsViewerSource = ClipsViewerSource.A1Q;
                break;
            case Process.SIGTERM /* 15 */:
                clipsViewerSource = ClipsViewerSource.A1R;
                break;
        }
        this.A00 = clipsViewerSource;
    }

    public Integer A00() {
        return this.A01;
    }
}
