package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.AbstractC60877RXa;
import X.C45377K6k;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class CommonMediaTransport extends RYn implements InterfaceC65445TkH {
    public static final CommonMediaTransport DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_LENGTH_FIELD_NUMBER = 8;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int MEDIA_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int MIMETYPE_FIELD_NUMBER = 9;
    public static final int OBJECT_ID_FIELD_NUMBER = 10;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SIDECAR_FIELD_NUMBER = 7;
    public int bitField0_;
    public int fileLength_;
    public String mediaId_ = "";
    public String fileSha256_ = "";
    public String mediaKey_ = "";
    public String fileEncSha256_ = "";
    public String directPath_ = "";
    public String mediaKeyTimestamp_ = "";
    public String sidecar_ = "";
    public String mimetype_ = "";
    public String objectId_ = "";

    static {
        CommonMediaTransport commonMediaTransport = new CommonMediaTransport();
        DEFAULT_INSTANCE = commonMediaTransport;
        RYn.A0B(commonMediaTransport, CommonMediaTransport.class);
    }

    public static C45377K6k A00(CommonMediaTransport commonMediaTransport) {
        AbstractC60877RXa A0I = DEFAULT_INSTANCE.A0I();
        A0I.A05(commonMediaTransport);
        return (C45377K6k) A0I;
    }

    @Override // X.RYn
    public final Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "mediaId_", "fileSha256_", "mediaKey_", "fileEncSha256_", "directPath_", "mediaKeyTimestamp_", "sidecar_", "fileLength_", "mimetype_", "objectId_"});
            case 3:
                return new CommonMediaTransport();
            case 4:
                return new C45377K6k();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (CommonMediaTransport.class) {
                        interfaceC50386MMo = PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                            PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo2;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}
