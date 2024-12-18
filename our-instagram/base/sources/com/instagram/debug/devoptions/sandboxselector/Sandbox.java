package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class Sandbox extends C0T6 {
    public final String description;
    public final boolean supportsVpnless;
    public final SandboxType type;
    public final String url;

    public final String component1() {
        return this.url;
    }

    public final SandboxType component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.supportsVpnless;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Sandbox) {
                Sandbox sandbox = (Sandbox) obj;
                if (!C14360o3.A0K(this.url, sandbox.url) || this.type != sandbox.type || !C14360o3.A0K(this.description, sandbox.description) || this.supportsVpnless != sandbox.supportsVpnless) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ Sandbox copy$default(Sandbox sandbox, String str, SandboxType sandboxType, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sandbox.url;
        }
        if ((i & 2) != 0) {
            sandboxType = sandbox.type;
        }
        if ((i & 4) != 0) {
            str2 = sandbox.description;
        }
        if ((i & 8) != 0) {
            z = sandbox.supportsVpnless;
        }
        AbstractC167027dH.A12(str, sandboxType, str2);
        return new Sandbox(str, sandboxType, str2, z);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getSupportsVpnless() {
        return this.supportsVpnless;
    }

    public final SandboxType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.description, AbstractC166997dE.A0J(this.type, this.url.hashCode() * 31));
        int i = 1237;
        if (this.supportsVpnless) {
            i = 1231;
        }
        return A0K + i;
    }

    public Sandbox(String str, SandboxType sandboxType, String str2, boolean z) {
        AbstractC167027dH.A13(str, sandboxType, str2);
        this.url = str;
        this.type = sandboxType;
        this.description = str2;
        this.supportsVpnless = z;
    }

    public final Sandbox copy(String str, SandboxType sandboxType, String str2, boolean z) {
        AbstractC167027dH.A12(str, sandboxType, str2);
        return new Sandbox(str, sandboxType, str2, z);
    }

    public /* synthetic */ Sandbox(String str, SandboxType sandboxType, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sandboxType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }
}
