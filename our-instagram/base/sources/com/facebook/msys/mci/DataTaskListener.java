package com.facebook.msys.mci;

/* loaded from: classes3.dex */
public interface DataTaskListener {
    void onCancelDataTask(String str, NetworkSession networkSession);

    void onNewTask(DataTask dataTask, NetworkSession networkSession);

    void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession);
}
