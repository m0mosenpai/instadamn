package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class RequestEncryption extends RYn implements InterfaceC65445TkH {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    public static final RequestEncryption DEFAULT_INSTANCE;
    public static final int ELLIPTICCURVE_FIELD_NUMBER = 3;
    public static final int KEYHINT_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SUPPORTEDPARAMETERS_FIELD_NUMBER = 4;
    public AbstractC64538TIu challenge_;
    public InterfaceC65691TsD keyHint_;
    public int keyTypeCase_ = 0;
    public Object keyType_;
    public AbstractC64538TIu publicKey_;
    public int supportedParameters_;

    static {
        RequestEncryption requestEncryption = new RequestEncryption();
        DEFAULT_INSTANCE = requestEncryption;
        RYn.A0B(requestEncryption, RequestEncryption.class);
    }

    public RequestEncryption() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.publicKey_ = abstractC64538TIu;
        this.challenge_ = abstractC64538TIu;
        this.keyHint_ = RWF.A02;
    }
}
