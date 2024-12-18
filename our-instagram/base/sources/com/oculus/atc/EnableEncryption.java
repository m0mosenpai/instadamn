package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class EnableEncryption extends RYn implements InterfaceC65445TkH {
    public static final int BASE_FIELD_NUMBER = 4;
    public static final EnableEncryption DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SEED_FIELD_NUMBER = 2;
    public int base_;
    public AbstractC64538TIu iv_;
    public int parameters_;
    public AbstractC64538TIu publicKey_;
    public AbstractC64538TIu seed_;

    static {
        EnableEncryption enableEncryption = new EnableEncryption();
        DEFAULT_INSTANCE = enableEncryption;
        RYn.A0B(enableEncryption, EnableEncryption.class);
    }

    public EnableEncryption() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.publicKey_ = abstractC64538TIu;
        this.seed_ = abstractC64538TIu;
        this.iv_ = abstractC64538TIu;
    }
}
