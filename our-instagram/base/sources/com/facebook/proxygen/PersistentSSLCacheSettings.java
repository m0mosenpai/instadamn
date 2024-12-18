package com.facebook.proxygen;

/* loaded from: classes10.dex */
public class PersistentSSLCacheSettings {
    public int cacheCapacity;
    public boolean enableCrossDomainTickets;
    public String filename;
    public int syncInterval;

    /* loaded from: classes10.dex */
    public class Builder {
        public String filename;
        public int cacheCapacity = 50;
        public int syncInterval = 150;
        public boolean enableCrossDomainTickets = false;

        public PersistentSSLCacheSettings build() {
            return new PersistentSSLCacheSettings(this.filename, this.cacheCapacity, this.syncInterval, this.enableCrossDomainTickets);
        }

        public Builder(String str) {
            this.filename = str;
        }

        public Builder capacity(int i) {
            this.cacheCapacity = i;
            return this;
        }

        public Builder enableCrossDomainTickets(boolean z) {
            this.enableCrossDomainTickets = z;
            return this;
        }

        public Builder syncInterval(int i) {
            this.syncInterval = i;
            return this;
        }
    }

    public PersistentSSLCacheSettings(String str, int i, int i2, boolean z) {
        this.filename = str;
        this.cacheCapacity = i;
        this.syncInterval = i2;
        this.enableCrossDomainTickets = z;
    }
}
