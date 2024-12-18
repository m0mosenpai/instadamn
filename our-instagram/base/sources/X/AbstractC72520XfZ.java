package X;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.XfZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72520XfZ {
    public static ImmutableList A00(Y1h y1h) {
        int i;
        ImmutableList.Builder builder = ImmutableList.builder();
        C1LC it = C63299Sh1.A04.keySet().iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            int i2 = Util.A01;
            if (intValue != 20) {
                if (intValue != 22) {
                    if (intValue != 30) {
                        switch (intValue) {
                            case 2:
                            case 3:
                                i = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                i = 21;
                                break;
                            case 7:
                            case 8:
                                i = 23;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                break;
                            default:
                                switch (intValue) {
                                    case 14:
                                        i = 25;
                                        break;
                                    case Process.SIGTERM /* 15 */:
                                    case 16:
                                    case 17:
                                    case 18:
                                        break;
                                    default:
                                        i = Integer.MAX_VALUE;
                                        break;
                                }
                        }
                        i = 28;
                    } else {
                        i = 34;
                    }
                } else {
                    i = 31;
                }
            } else {
                i = 30;
            }
            if (i2 >= i && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), y1h.A00().A00)) {
                builder.add((Object) number);
            }
        }
        builder.add((Object) 2);
        return builder.build();
    }
}
