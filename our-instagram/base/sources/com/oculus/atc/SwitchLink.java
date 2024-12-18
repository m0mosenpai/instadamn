package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class SwitchLink extends RYn implements InterfaceC65445TkH {
    public static final SwitchLink DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    public AbstractC64538TIu target_ = AbstractC64538TIu.A01;

    static {
        SwitchLink switchLink = new SwitchLink();
        DEFAULT_INSTANCE = switchLink;
        RYn.A0B(switchLink, SwitchLink.class);
    }
}
