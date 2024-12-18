package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.A6k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22864A6k {
    public final Integer A00;
    public final String A01;

    public C22864A6k(Integer num, String str) {
        this.A00 = num;
        switch (num.intValue()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 22:
            case 23:
            case 24:
            case 28:
            case 31:
            case 32:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 52:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                if (str == null) {
                    str = "null";
                    break;
                }
                break;
        }
        this.A01 = str;
    }
}
