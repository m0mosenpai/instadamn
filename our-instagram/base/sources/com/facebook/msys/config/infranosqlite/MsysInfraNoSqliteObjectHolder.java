package com.facebook.msys.config.infranosqlite;

import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.NetworkSession;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class MsysInfraNoSqliteObjectHolder {
    public static final MsysInfraNoSqliteObjectHolder A03 = new MsysInfraNoSqliteObjectHolder();
    public static final Lock lock = new ReentrantLock();
    public final HashSet A00 = new HashSet();
    public volatile AppState A01;
    public volatile NetworkSession A02;

    public static synchronized NetworkSession A00() {
        NetworkSession networkSession;
        synchronized (MsysInfraNoSqliteObjectHolder.class) {
            networkSession = A03.A02;
        }
        return networkSession;
    }
}
