package com.instagram.realtimeclient;

import X.MSY;
import com.instagram.realtimeclient.RealtimeOperation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class RealtimeStore {
    public final Map mOperationStore = new HashMap();
    public final Set mTombstoneStore = new HashSet();

    private synchronized boolean processNotifyOperation() {
        return true;
    }

    private synchronized boolean processRemoveOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        this.mOperationStore.remove(key);
        this.mTombstoneStore.add(key);
        return true;
    }

    private synchronized boolean processReplaceOperation(RealtimeOperation realtimeOperation) {
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        if (!this.mTombstoneStore.contains(key)) {
            RealtimeOperation realtimeOperation2 = (RealtimeOperation) this.mOperationStore.get(key);
            if (realtimeOperation2 != null) {
                if (RealtimeEvent.compareSequences(realtimeOperation2.timestamp, realtimeOperation.timestamp) <= 0) {
                    this.mOperationStore.put(key, realtimeOperation);
                }
            } else {
                this.mOperationStore.put(key, realtimeOperation);
            }
            return true;
        }
        return false;
    }

    public synchronized void clear() {
        this.mOperationStore.clear();
        this.mTombstoneStore.clear();
    }

    /* renamed from: com.instagram.realtimeclient.RealtimeStore$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$realtimeclient$RealtimeOperation$Type;

        static {
            int[] iArr = new int[RealtimeOperation.Type.values().length];
            $SwitchMap$com$instagram$realtimeclient$RealtimeOperation$Type = iArr;
            try {
                MSY.A1I(RealtimeOperation.Type.add, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(RealtimeOperation.Type.remove, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(RealtimeOperation.Type.replace, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(RealtimeOperation.Type.notify, iArr);
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean patchStoreWithOperation(RealtimeOperation realtimeOperation) {
        int ordinal = realtimeOperation.op.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return false;
                    }
                    synchronized (this) {
                    }
                    return true;
                }
                return processReplaceOperation(realtimeOperation);
            }
            return processRemoveOperation(realtimeOperation);
        }
        return processAddOperation(realtimeOperation);
    }

    private boolean processAddOperation(RealtimeOperation realtimeOperation) {
        boolean z;
        String key = RealtimeStoreKey.getKey(realtimeOperation);
        synchronized (this) {
            if (!this.mOperationStore.containsKey(key) && !this.mTombstoneStore.contains(key)) {
                this.mOperationStore.put(key, realtimeOperation);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
