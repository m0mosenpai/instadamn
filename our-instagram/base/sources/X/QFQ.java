package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class QFQ extends RjB {
    public final int A00;

    public final String A00() {
        switch (this.A00) {
            case 0:
                return "network_io_error";
            case 1:
                return "resource_not_found";
            case 2:
                return MSV.A00(1234);
            case 3:
                return "api_error";
            case 4:
                return "illegal_resource_metadata";
            case 5:
                return "general_download_error";
            case 6:
                return "no_base_resource_for_delta";
            case 7:
                return "delta_patch_failed";
            case 8:
                return "unsupported_compression";
            case 9:
                return "uncompression_io_error";
            case 10:
                return "uncompressed_file_corrupted";
            case 11:
                return "checksum_io_error";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "cache_io_error";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "general_io_error";
            case 14:
                return "js_segment_hash_mismatch";
            default:
                return "unknown";
        }
    }

    public QFQ(int i, String str) {
        super(str);
        this.A00 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String A0R;
        String localizedMessage = getLocalizedMessage();
        String A00 = A00();
        if (localizedMessage == null) {
            A0R = "";
        } else {
            A0R = AnonymousClass001.A0R(": ", localizedMessage);
        }
        return AnonymousClass001.A0u("ClientException(reason=", A00, ")", A0R);
    }

    public QFQ(int i) {
        this.A00 = i;
    }

    public QFQ(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public QFQ() {
        this(15);
    }
}
