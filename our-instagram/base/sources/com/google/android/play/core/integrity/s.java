package com.google.android.play.core.integrity;

import X.C0f9;
import X.C58411Pup;
import X.C62928SXk;
import X.SGY;
import android.os.IInterface;
import com.google.android.play.integrity.internal.b;

/* loaded from: classes10.dex */
public final class s extends b implements IInterface {
    public final C58411Pup A00;
    public final C62928SXk A01;
    public final /* synthetic */ SGY A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(C58411Pup c58411Pup, SGY sgy) {
        this();
        this.A02 = sgy;
        int A03 = C0f9.A03(-1886292617);
        this.A01 = new C62928SXk("OnRequestIntegrityTokenCallback");
        this.A00 = c58411Pup;
        C0f9.A0A(-659758952, A03);
    }

    public s() {
        int A03 = C0f9.A03(354494532);
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        C0f9.A0A(2004969641, A03);
        C0f9.A0A(-507884623, C0f9.A03(-1133778173));
    }
}
