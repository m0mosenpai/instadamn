package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C69749Vuj;

/* loaded from: classes11.dex */
public final class SandboxErrorInfo extends C0T6 {
    public final String logMessage;
    public final C69749Vuj message;
    public final C69749Vuj title;

    public static /* synthetic */ SandboxErrorInfo copy$default(SandboxErrorInfo sandboxErrorInfo, C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c69749Vuj = sandboxErrorInfo.title;
        }
        if ((i & 2) != 0) {
            c69749Vuj2 = sandboxErrorInfo.message;
        }
        if ((i & 4) != 0) {
            str = sandboxErrorInfo.logMessage;
        }
        return sandboxErrorInfo.copy(c69749Vuj, c69749Vuj2, str);
    }

    public final C69749Vuj component1() {
        return this.title;
    }

    public final C69749Vuj component2() {
        return this.message;
    }

    public final String component3() {
        return this.logMessage;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SandboxErrorInfo) {
                SandboxErrorInfo sandboxErrorInfo = (SandboxErrorInfo) obj;
                if (!C14360o3.A0K(this.title, sandboxErrorInfo.title) || !C14360o3.A0K(this.message, sandboxErrorInfo.message) || !C14360o3.A0K(this.logMessage, sandboxErrorInfo.logMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public final String getLogMessage() {
        return this.logMessage;
    }

    public final C69749Vuj getMessage() {
        return this.message;
    }

    public final C69749Vuj getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AbstractC166997dE.A0J(this.message, this.title.hashCode() * 31) + this.logMessage.hashCode();
    }

    public SandboxErrorInfo(C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, String str) {
        AbstractC167027dH.A13(c69749Vuj, c69749Vuj2, str);
        this.title = c69749Vuj;
        this.message = c69749Vuj2;
        this.logMessage = str;
    }

    public final SandboxErrorInfo copy(C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2, String str) {
        AbstractC167027dH.A12(c69749Vuj, c69749Vuj2, str);
        return new SandboxErrorInfo(c69749Vuj, c69749Vuj2, str);
    }
}
