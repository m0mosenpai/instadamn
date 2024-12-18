package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class EndLinkSetup extends RYn implements InterfaceC65445TkH {
    public static final EndLinkSetup DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    public int state_;
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        EndLinkSetup endLinkSetup = new EndLinkSetup();
        DEFAULT_INSTANCE = endLinkSetup;
        RYn.A0B(endLinkSetup, EndLinkSetup.class);
    }
}
