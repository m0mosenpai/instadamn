package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Range;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.Sc2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63080Sc2 {
    public static final String A00(MediaCodec.CodecException codecException) {
        ArrayList A12 = AbstractC166997dE.A12(codecException, 0);
        A02("recoverable=%s", A12, new Object[]{Boolean.valueOf(codecException.isRecoverable())});
        A02("transient=%s", A12, new Object[]{Boolean.valueOf(codecException.isTransient())});
        A02("errorCode=%s", A12, AbstractC25228BEl.A1Y(codecException.getErrorCode()));
        A02("diagnostics_info=%s", A12, new Object[]{codecException.getDiagnosticInfo()});
        String A02 = C71473Il.A00('|').A02(A12);
        C14360o3.A07(A02);
        return A02;
    }

    public static final String A01(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        String str;
        C14360o3.A0B(mediaCodec, 0);
        try {
            ArrayList A1E = AbstractC166987dD.A1E();
            A02("name=%s", A1E, new Object[]{mediaCodec.getName()});
            A02("input_format=%s", A1E, new Object[]{mediaFormat.toString()});
            A02("metrics=%s", A1E, new Object[]{mediaCodec.getMetrics().toString()});
            int integer = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
            int integer2 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
            Integer valueOf = Integer.valueOf(integer);
            A02("input_size=[%s X %s]", A1E, new Object[]{valueOf, Integer.valueOf(integer2)});
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(mediaFormat.getString("mime"));
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            boolean isSizeSupported = videoCapabilities.isSizeSupported(integer, integer2);
            A02("size_supported=%s", A1E, new Object[]{Boolean.valueOf(isSizeSupported)});
            Object[] objArr = new Object[1];
            if (videoCapabilities.getSupportedWidths().contains((Range<Integer>) valueOf)) {
                objArr[0] = videoCapabilities.getSupportedHeightsFor(integer);
                str = "supported_height_for_width=%s";
            } else {
                objArr[0] = valueOf;
                str = "unsupported_width=%s";
            }
            A02(str, A1E, objArr);
            if (isSizeSupported) {
                A02("framerate_for_size=%s", A1E, new Object[]{videoCapabilities.getSupportedFrameRatesFor(integer, integer2)});
                A02("achievable_framerate=%s", A1E, new Object[]{videoCapabilities.getAchievableFrameRatesFor(integer, integer2)});
            }
            A02("bitrate=%s", A1E, new Object[]{videoCapabilities.getBitrateRange()});
            A02("alignment=[%s,%s]", A1E, new Object[]{Integer.valueOf(videoCapabilities.getWidthAlignment()), Integer.valueOf(videoCapabilities.getHeightAlignment())});
            A02("general_framerate=%s", A1E, new Object[]{videoCapabilities.getSupportedFrameRates()});
            A02("supported_instance=%s", A1E, new Object[]{Integer.valueOf(capabilitiesForType.getMaxSupportedInstances())});
            String A02 = C71473Il.A00('|').A02(A1E);
            C14360o3.A07(A02);
            return A02;
        } catch (Exception e) {
            return AbstractC166997dE.A0y("Details Retrieval failed with ", e);
        }
    }

    public static void A02(String str, AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.add(AbstractC13670mt.A06(str, objArr));
    }
}
