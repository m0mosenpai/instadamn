package com.oculus.atc;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class WifiDirectNetworkInfo extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FIELD_NUMBER = 3;
    public static final WifiDirectNetworkInfo DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public InterfaceC65691TsD addresses_ = RWF.A02;
    public Credentials credentials_;
    public int portNumber_;
    public int status_;

    /* loaded from: classes10.dex */
    public final class Credentials extends RYn implements InterfaceC65445TkH {
        public static final Credentials DEFAULT_INSTANCE;
        public static final int NETWORKNAME_FIELD_NUMBER = 1;
        public static volatile InterfaceC50386MMo PARSER = null;
        public static final int PASSPHRASE_FIELD_NUMBER = 2;
        public String networkName_ = "";
        public String passphrase_ = "";

        static {
            Credentials credentials = new Credentials();
            DEFAULT_INSTANCE = credentials;
            RYn.A0B(credentials, Credentials.class);
        }
    }

    static {
        WifiDirectNetworkInfo wifiDirectNetworkInfo = new WifiDirectNetworkInfo();
        DEFAULT_INSTANCE = wifiDirectNetworkInfo;
        RYn.A0B(wifiDirectNetworkInfo, WifiDirectNetworkInfo.class);
    }
}
