package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.FollowStatus;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.9BH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BH extends C0T6 {
    public Object A00;
    public final int A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9BH.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object obj;
        switch (this.A01) {
            case 0:
            case 2:
            case 3:
            case 6:
            case 7:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj = this.A00;
                break;
            case 1:
            case 5:
            case 8:
            case 9:
            case 30:
                obj = this.A00;
                if (obj == null) {
                    return 0;
                }
                break;
            case 4:
            default:
                return super.hashCode();
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A01) {
            case 6:
                sb = new StringBuilder();
                str = "SerializableCaptionAudioBleepList(bleepsList=";
                break;
            case 21:
                sb = new StringBuilder();
                str = "MediaLargerCTABufferUiActions(setAutomatedMetricsLoggingLargerCTABuffer=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BH(int i) {
        this((List) null, 30);
        this.A01 = i;
        switch (i) {
            case 5:
                this.A01 = 5;
                this((Object) null, 5);
                return;
            case 6:
                this.A01 = 6;
                this((List) C16930sl.A00, 6);
                return;
            case 7:
                this(new C115475Kh());
                return;
            case 9:
                this.A01 = 9;
                this((C38321qM) null, 9);
                return;
            case 27:
                this.A01 = 27;
                this(new LinkedHashSet());
                return;
            default:
                this.A01 = 30;
                return;
        }
    }

    public C9BH(InterfaceC11380iw interfaceC11380iw) {
        this.A01 = 0;
        this.A00 = interfaceC11380iw;
    }

    public C9BH(C38321qM c38321qM, int i) {
        this.A01 = i;
        if (9 - i != 0) {
            C14360o3.A0B(c38321qM, 1);
        }
        this.A00 = c38321qM;
    }

    public C9BH(EnumC71343Hv enumC71343Hv) {
        this.A01 = 28;
        this.A00 = enumC71343Hv;
    }

    public C9BH(AbstractC115485Ki abstractC115485Ki) {
        this.A01 = 7;
        C14360o3.A0B(abstractC115485Ki, 1);
        this.A00 = abstractC115485Ki;
    }

    public C9BH(GifUrlImpl gifUrlImpl) {
        this.A01 = 26;
        C14360o3.A0B(gifUrlImpl, 1);
        this.A00 = gifUrlImpl;
    }

    public C9BH(FollowStatus followStatus) {
        this.A01 = 3;
        this.A00 = followStatus;
    }

    public C9BH(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C9BH(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 6:
            case 22:
                C14360o3.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    public C9BH(java.util.Set set) {
        this.A01 = 27;
        C14360o3.A0B(set, 1);
        this.A00 = set;
    }
}
