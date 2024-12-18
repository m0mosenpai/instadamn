package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25228BEl;
import X.AbstractC31177DnL;
import X.C0T6;
import X.C14360o3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DevServerEntity extends C0T6 {
    public static final String COLUMN_CACHE_TIMESTAMP = "cache_timestamp";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_HOST_TYPE = "host_type";
    public static final String COLUMN_SUPPORTS_VPNLESS = "supports_vpnless";
    public static final String COLUMN_URL = "url";
    public static final Companion Companion = new Object();
    public static final String TABLE_NAME = "internal_dev_servers";
    public final long cacheTimestamp;
    public final String description;
    public final String hostType;
    public final boolean supportsVpnless;
    public final String url;

    public static /* synthetic */ DevServerEntity copy$default(DevServerEntity devServerEntity, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devServerEntity.url;
        }
        if ((i & 2) != 0) {
            str2 = devServerEntity.hostType;
        }
        if ((i & 4) != 0) {
            str3 = devServerEntity.description;
        }
        if ((i & 8) != 0) {
            z = devServerEntity.supportsVpnless;
        }
        if ((i & 16) != 0) {
            j = devServerEntity.cacheTimestamp;
        }
        return devServerEntity.copy(str, str2, str3, z, j);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.hostType;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.supportsVpnless;
    }

    public final long component5() {
        return this.cacheTimestamp;
    }

    public final DevServerEntity copy(String str, String str2, String str3, boolean z, long j) {
        AbstractC167027dH.A12(str, str2, str3);
        return new DevServerEntity(str, str2, str3, z, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevServerEntity) {
                DevServerEntity devServerEntity = (DevServerEntity) obj;
                if (!C14360o3.A0K(this.url, devServerEntity.url) || !C14360o3.A0K(this.hostType, devServerEntity.hostType) || !C14360o3.A0K(this.description, devServerEntity.description) || this.supportsVpnless != devServerEntity.supportsVpnless || this.cacheTimestamp != devServerEntity.cacheTimestamp) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ DevServerEntity(String str, String str2, String str3, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? AbstractC31177DnL.A06() : j);
    }

    public final long getCacheTimestamp() {
        return this.cacheTimestamp;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHostType() {
        return this.hostType;
    }

    public final boolean getSupportsVpnless() {
        return this.supportsVpnless;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AbstractC167007dF.A0D(this.supportsVpnless, AbstractC166997dE.A0K(this.description, AbstractC166997dE.A0K(this.hostType, AbstractC166987dD.A0J(this.url)))) + AbstractC25228BEl.A03(this.cacheTimestamp);
    }

    public DevServerEntity(String str, String str2, String str3, boolean z, long j) {
        AbstractC167027dH.A13(str, str2, str3);
        this.url = str;
        this.hostType = str2;
        this.description = str3;
        this.supportsVpnless = z;
        this.cacheTimestamp = j;
    }
}
