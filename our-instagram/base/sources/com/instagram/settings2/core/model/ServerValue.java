package com.instagram.settings2.core.model;

import X.AbstractC166987dD;
import X.AbstractC55145Od4;
import X.AnonymousClass001;
import X.C14360o3;
import X.InterfaceC16510rw;

/* loaded from: classes9.dex */
public final class ServerValue extends AbstractC55145Od4 {
    public final String A00;
    public final InterfaceC16510rw A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ServerValue) {
                ServerValue serverValue = (ServerValue) obj;
                if (!C14360o3.A0K(this.A00, serverValue.A00) || !C14360o3.A0K(this.A01, serverValue.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01.hashCode();
    }

    public ServerValue(String str, InterfaceC16510rw interfaceC16510rw) {
        this.A00 = str;
        this.A01 = interfaceC16510rw;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        return AnonymousClass001.A0u(super.toString(), ": { ", this.A00, " }");
    }
}
