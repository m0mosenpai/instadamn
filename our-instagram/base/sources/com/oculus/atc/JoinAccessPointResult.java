package com.oculus.atc;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class JoinAccessPointResult extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final JoinAccessPointResult DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public InterfaceC65691TsD addresses_ = RWF.A02;
    public int portNumber_;
    public int status_;

    static {
        JoinAccessPointResult joinAccessPointResult = new JoinAccessPointResult();
        DEFAULT_INSTANCE = joinAccessPointResult;
        RYn.A0B(joinAccessPointResult, JoinAccessPointResult.class);
    }
}
