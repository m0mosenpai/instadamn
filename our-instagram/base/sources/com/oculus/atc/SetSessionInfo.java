package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class SetSessionInfo extends RYn implements InterfaceC65445TkH {
    public static final SetSessionInfo DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int UUID_FIELD_NUMBER = 1;
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        SetSessionInfo setSessionInfo = new SetSessionInfo();
        DEFAULT_INSTANCE = setSessionInfo;
        RYn.A0B(setSessionInfo, SetSessionInfo.class);
    }
}